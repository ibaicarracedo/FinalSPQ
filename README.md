# FinalSPQ

[![Java CI](https://github.com/ibaicarracedo/FinalSPQ/actions/workflows/ci.yml/badge.svg)](https://github.com/ibaicarracedo/FinalSPQ/actions/workflows/ci.yml)

## Crar la BD

    /* DELETE 'pedidosDB' database*/
    DROP SCHEMA IF EXISTS pedidosDB;
    /* DELETE USER 'spq' AT LOCAL SERVER*/
    DROP USER IF EXISTS 'spq'@'localhost';

    /* CREATE 'pedidosDB' DATABASE */
    CREATE SCHEMA pedidosDB;
    /* CREATE THE USER 'spq' AT LOCAL SERVER WITH PASSWORD 'spq' */
    CREATE USER IF NOT EXISTS 'spq'@'localhost' IDENTIFIED BY 'spq';

    GRANT ALL ON pedidosDB.* TO 'spq'@'localhost';

## Compilar el proyecto

    mvn clean 
    mvn compile 
    mvn datanucleus:enhance

## Crear tablas

    mvn datanucleus:schema-create

## Lanzar Test

    mvn test
    mvn verify -PIntegration

## Generar documentación
    
    mvn doxygen:report

## Instalar el jar

    mvn install

## Lanzar servidor y cliente

    mvn -Pservidor exec:java
    mvn exec:java

 

