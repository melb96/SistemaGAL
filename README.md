<h1 align="center"> Trabajo Practico Final - PyL3

## Integrantes:

 - ### Luna Bazán Mateo Emanuel - ELSI597
  - ### Romero Fabio Reneé
  - ### Vedia Victor Alejandro

## Descripción de proyecto

Se trata de un sistema de gestión de accidentes laborales, donde el usuario podrá cargar actas de accidentes, pudiendo seleccionar el empleado afectado, motivo y tipo de accidente. A su vez podrá cargar la zona y parte afectada.
Este sistema fue desarrollado en el lenguaje de programación Java a través del IDE NetBeans conectando con una base de datos SQL usando PostgreSQL con la interfaz grafica pgadmin4.

## Herramientas utilizadas

1. Declaraciones y asignaciones
2. Arreglos
3. Estructuras de control iterativas
4. Estructuras de control condicionales
5. Relaciones entre clases
6. Interfaces y métodos abstractos
7. JFrame e JinternalFrame
8. Grillas
9. Librerias de java.sql y java.swing
10. Drivers dotenv y postgresql 

## Importante:

En nuestro archivo pom.xml agregamos las siguientes dependencias:

```shell
        <dependencies>
             <dependency>
            <groupId>io.github.cdimascio</groupId>
            <artifactId>java-dotenv</artifactId>
            <version>5.2.2</version>
        </dependency>
         <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <version>42.7.2</version>
         </dependency>
    </dependencies>

```
## Conectar Base de datos

Para la conexión a nuestra base de datos, desde pgadmin4 creamos la bd "SGAL" con el siguiente script:

```shell
CREATE DATABASE "SGAL"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Argentina.1252'
    LC_CTYPE = 'Spanish_Argentina.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
```
Luego ingresamos nuestras tablas con el siguiente sql:
```shell
-- This script was generated by the ERD tool in pgAdmin 4.
-- Please log an issue at https://github.com/pgadmin-org/pgadmin4/issues/new/choose if you find any bugs, including reproduction steps.
BEGIN;


CREATE TABLE IF NOT EXISTS public.accidente
(
    fecha_accidente date NOT NULL,
    ubicacion character varying COLLATE pg_catalog."default" NOT NULL,
    numero integer NOT NULL,
    legajoempleado integer NOT NULL,
    codigomotivo integer NOT NULL,
    codigotipo_accidente integer NOT NULL,
    CONSTRAINT accidente_pk PRIMARY KEY (numero)
);

CREATE TABLE IF NOT EXISTS public.empleado
(
    legajo integer NOT NULL,
    apellido_nombre character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT empleado_pk PRIMARY KEY (legajo)
);

CREATE TABLE IF NOT EXISTS public.motivo
(
    motivo character varying(100) COLLATE pg_catalog."default" NOT NULL,
    codigo integer NOT NULL,
    CONSTRAINT motivo_pk PRIMARY KEY (codigo)
);

CREATE TABLE IF NOT EXISTS public.parte_cuerpo
(
    codigo integer NOT NULL,
    parte character varying COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT parte_cuerpo_pk PRIMARY KEY (codigo)
);

CREATE TABLE IF NOT EXISTS public.tipo_accidente
(
    tipo character varying(100) COLLATE pg_catalog."default" NOT NULL,
    codigo integer NOT NULL,
    CONSTRAINT tipo_accidente_pk PRIMARY KEY (codigo)
);

CREATE TABLE IF NOT EXISTS public.zona_cuerpo
(
    codigo_accidente integer NOT NULL,
    codigo_parte integer NOT NULL,
    izq_der character varying COLLATE pg_catalog."default",
    CONSTRAINT zona_cuerpo_pkey PRIMARY KEY (codigo_accidente, codigo_parte)
);

ALTER TABLE IF EXISTS public.accidente
    ADD CONSTRAINT accidente_empleado_fk FOREIGN KEY (legajoempleado)
    REFERENCES public.empleado (legajo) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;


ALTER TABLE IF EXISTS public.accidente
    ADD CONSTRAINT accidente_motivo_fk FOREIGN KEY (codigomotivo)
    REFERENCES public.motivo (codigo) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;


ALTER TABLE IF EXISTS public.accidente
    ADD CONSTRAINT accidente_tipo_accidente_fk FOREIGN KEY (codigotipo_accidente)
    REFERENCES public.tipo_accidente (codigo) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;


ALTER TABLE IF EXISTS public.zona_cuerpo
    ADD CONSTRAINT zona_cuerpo_codigo_accidente_fkey FOREIGN KEY (codigo_accidente)
    REFERENCES public.accidente (numero) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;


ALTER TABLE IF EXISTS public.zona_cuerpo
    ADD CONSTRAINT zona_cuerpo_codigo_parte_fkey FOREIGN KEY (codigo_parte)
    REFERENCES public.parte_cuerpo (codigo) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION;

END;
```
![DER FINAL](https://github.com/user-attachments/assets/44a0c468-6ebe-48da-b1f0-926dfa1bc580)


### Integracion con NetBeans

Creamos la clase ConnectDB haciendo referencia al archivo .env con la herramienta dotenv.
```shell
public class ConnectDB {
    
     //Conexion
    private Connection conexion;
    //Cargamos archivo .env
    Dotenv dotenv = Dotenv.load();
    //Parametros de conexión:
    String url = dotenv.get("URL");
    String user = dotenv.get("POSTGRES_USER");
    String password = dotenv.get("POSTGRES_PASSWORD");
    
    public ConnectDB() {

        try {
            //Inicializamos conexion
            conexion = DriverManager.getConnection(url, user, password);
            //JOptionPane.showMessageDialog(null,"Se conectó correctamente a la base de datos");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"ERROR"+e.toString());
            e.printStackTrace();
        }

    }

    public Connection getConnection() {

        return conexion;

    }
    
}
```
### Archivo .env: //Recordar cambiar el USER y PASSWORD segun tu dominio
```shell
POSTGRES_USER=postgres
POSTGRES_PASSWORD=123456
POSTGRES_DB=SGAL
POSTGRES_HOST=localhost
POSTGRES_PORT=5432
URL= jdbc:postgresql://localhost:5432/SGAL
```

### Informacion adicional del proyecto

Nuestro proyecto esta organizado en paquetes, donde tenemos plasmados controladores, que son interfaces para cada uno de los objetos con sus respectivos métodos abstractos para luego ser implementados en cada uno de los controladores correspondientes.
Hicimos uso de grillas para setear las tablas usadas en cada JFrame / JInternalFrame.

En cuanto a la interfaz grafica, es bastante sencilla buscando tener una vista agradable y con poca saturación para el usuario.

# Guia para el usuario

## Paso a paso de como ingresar un accidente

Es importante saber, que para dar de alta un accidente, primero se deben realizar los siguientes puntos:

1. Agregar un empleado
2. Agregar un tipo de accidente
3. Agregar un motivo
4. Agregar una parte del cuerpo afectada

Luego podemos ingresar nuestro accidente indicando los datos solicitados, en este caso legajo de empleado, codigo de tipo accidente, codigo de motivo y fecha.

Una vez cargado el accidente, desde el ABM Zona cuerpo cargamos la zona del cuerpo afectada y automáticamente se relaciona con la parte del cuerpo seleccionada. 

### Fin de readme

Para finalizar este archivo, queremos dar las gracias a los docentes de la catedra por brindarnos el conocimiento necesario para llevar a cabo este proyecto.
