CREATE DATABASE crudapi;

use crudapi;
create table tbl_Feedback
(
FeedbackID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
KorisnikID INT,
NaplataID INT,
Ocjena INT,
Komentar VARCHAR(255)
);
