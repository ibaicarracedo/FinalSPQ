/* DELETE 'pedidosDB' database*/
DROP SCHEMA IF EXISTS pedidosDB;
/* DELETE USER 'spq' AT LOCAL SERVER*/
DROP USER IF EXISTS 'spq'@'localhost';

/* CREATE 'pedidosDB' DATABASE */
CREATE SCHEMA pedidosDB;
/* CREATE THE USER 'spq' AT LOCAL SERVER WITH PASSWORD 'spq' */
CREATE USER IF NOT EXISTS 'spq'@'localhost' IDENTIFIED BY 'spq';

GRANT ALL ON pedidosDB.* TO 'spq'@'localhost';