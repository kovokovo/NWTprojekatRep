CREATE DATABASE crudapi;

use crudapi;
create table tbl_Naplata
(
NaplataID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
KorisnikID INT,
StavkeProdajeID INT,
Valuta VARCHAR(20),
Opis VARCHAR(255),
AdresaDostave VARCHAR(255)
);
