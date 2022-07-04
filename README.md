# FinalSPQ
[![Java CI]()]()   [![codecov]()]()


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

 

