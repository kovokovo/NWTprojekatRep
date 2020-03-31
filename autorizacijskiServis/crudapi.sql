CREATE DATABASE crudapi;

use crudapi;
create table tbl_Dopustenja
(
DopustenjaID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
Naziv VARCHAR(20),
KreiranaU DATE,
AZURIRANAU DATE
);
create table tbl_KorisnickaDopustenja
(
KorisnickaDopustenjaID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
UlogaID Integer,
foreign key(DopustenjaID) REFERENCES tbl_Dopustenja(DopustenjaID)
);
create table tbl_Aktivnosti
(
AktivnostiID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
URL VARCHAR(20),
Metoda varchar(20),
URLregex VARCHAR(20)
);
create table tbl_AktivnostiDopustenja
(
AktivnostiDopustenjaID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
foreign key(DopustenjaID) REFERENCES tbl_Dopustenja(DopustenjaID),
foreign key(AktivnostiID) REFERENCES tbl_Aktivnosti(AktivnostiID)
);
