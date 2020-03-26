CREATE DATABASE crudapi;

use crudapi;
create table tbl_Proizvod 
(
 ProizvodID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
 Naziv VARCHAR(255),
 Cijena DOUBLE,
 RaspolozivaKolicina INT
);
create table tbl_StavkaProdaje
(
StavkaProdajeID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
foreign key(ProizvodID) REFERENCES tbl_Proizvod(ProizvodID),
Kolicina INT,
UkupnaCijena DOUBLE
);
