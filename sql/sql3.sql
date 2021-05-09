CREATE DATABASE `sarithadb` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
Use sarithadb

CREATE TABLE  employee
(
id int primary key, 
name varchar(30),
dob datetime,
email varchar(40)
);