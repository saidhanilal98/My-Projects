CREATE DATABASE DB_VC_CLDV6211_ST10090106;

USE DB_VC_CLDV6211_ST10090106;

/** Question 1 
Creating all the main tables
Creating a table for CAR **/
CREATE TABLE ST10090106_CAR 
(
CarNo varchar (6) not null PRIMARY KEY,
CarMake varchar(30) not null,
Model varchar(30) not null,
BodyType varchar(30),
KillometresTravelled int not null,
ServiceKilometres int not null,
Available varchar(3) not null
);

/** Opening the CAR table **/
SELECT * FROM ST10090106_CAR
ORDER BY CarNo;

/** Creating a table for INSPECTOR **/
CREATE TABLE ST10090106_INSPECTOR
(
Inspector_no varchar(4) not null PRIMARY KEY,
Name varchar(30),
Email varchar(30),
Mobile char(10) not null
);

/** Opening the INSPECTOR table **/
SELECT * FROM ST10090106_INSPECTOR
ORDER BY Inspector_no;

/** Creating a table for DRIVER **/
CREATE TABLE ST10090106_DRIVER
(
Name varchar(30) not null PRIMARY KEY,
Address varchar(80) not null,
Email varchar(50),
Mobile char(10) not null
);

/** Opening the DRIVER table **/
SELECT * FROM ST10090106_DRIVER
ORDER BY Name;

/** Creating a table for RENTAL **/
CREATE TABLE ST10090106_RENTAL
(
RentalID varchar(6) not null PRIMARY KEY,
Carno varchar(6) not null,
CarMake varchar(30) not null,
Inspector varchar(30),
Driver varchar(30),
RentalFee int not null,
StartDate date not null,
EndDate date not null,
FOREIGN KEY (CarNo) REFERENCES ST10090106_CAR(CarNo)
);

/** Opening the RENTAL table **/
SELECT * FROM ST10090106_RENTAL
ORDER BY RentalID;

/** Creating a table for RETURNTABLE **/
CREATE TABLE ST10090106_RETURNTABLE
(
ReturnTable_ID  varchar(6) not null PRIMARY KEY,
Carno varchar(6) not null,
CarMake varchar(30) not null,
Inspector varchar(30),
Driver varchar(30),
ReturnDate date not null,
ElapsedDate int not null,
Fine int not null,
FOREIGN KEY (CarNo) REFERENCES ST10090106_CAR(CarNo)
);

/** Opening the RETURNTABLE table **/
SELECT * FROM ST10090106_RETURNTABLE
ORDER BY ReturnTable_ID;

/** Question 2 **/
/** Lookup tables **/
/** Creating a table for CARMAKE **/
CREATE TABLE ST10090106_CARMAKE
(
CarMake_Description varchar (30) not null PRIMARY KEY
);

/** Creating a table for CARBODY_TYPE **/
CREATE TABLE ST10090106_CARBODY_TYPE
(
CarBody_Description varchar (30) not null PRIMARY KEY
);

/** Populating the data on all the relevant tables **/
/** Inserting records into table CARMAKE **/
INSERT INTO ST10090106_CARMAKE (CarMake_Description)
VALUES ('Hyundai'),
	   ('BMW'),
	   ('Mercedes Benz'),
	   ('Toyota'),
	   ('Ford');

/** Test **/
SELECT * FROM ST10090106_CARMAKE;

/** Populating the data on all the relevant tables **/
/** Inserting records into table CARBODY_TYPE **/
INSERT INTO ST10090106_CARBODY_TYPE (CarBody_Description)
VALUES ('Hatchback'),
	   ('Sedan'),
	   ('Coupe'),
	   ('SUV');

/** Test **/
SELECT * FROM ST10090106_CARBODY_TYPE;

/** Question 3 and 4 
Populating the data on all the relevant tables
Inserting records into table CAR **/
INSERT INTO ST10090106_CAR (CarNo, CarMake, Model, BodyType, 
				KillometresTravelled, ServiceKilometres, Available)
VALUES ('HYU001','Hyundai','Grand i10 1.0 Motion','Hatchback',1500,15000,'yes'),
	   ('HYU002','Hyundai','i20 1.2 Fluid','Hatchback',3000,15000,'yes'),
	   ('BMW001','BMW','320d 1.2','Sedan',20000,50000,'yes'),
	   ('BMW002','BMW','240d 1.4','Sedan',9500,15000,'yes'),
	   ('TOY001','Toyota','Corolla 1.0','Sedan',15000,50000,'yes'),
	   ('TOY002','Toyota','Avanza 1.0','SUV',98000,15000,'yes'),
	   ('TOY003','Toyota','Corolla Quest 1.0','Sedan',15000,50000,'yes'),
	   ('MER001','Mercedes Benz','c180','Sedan',5200,15000,'yes'),
	   ('MER002','Mercedes Benz','A200 Sedan','Sedan',4080,15000,'yes'),
	   ('FOR001','Ford','Fiesta 1.0','Sedan',7600,15000,'yes');
       
/** Test **/
SELECT * FROM ST10090106_CAR;

/** Inserting records into table INSPECTOR **/
INSERT INTO ST10090106_INSPECTOR (Inspector_no, Name, Email, Mobile)
VALUES ('I101','Bud Barnes','bud@therideyourent.com',0821585359),
       ('I102','Tracy Reeves','tracy@therideyourent.com',0822889988),
	   ('I103','Sandra Goodwin','sandra@therideyourent.com',0837695468),
	   ('I104','Shannon Burke','shannon@therideyourent.com',0836802514);
       
/** Test **/
SELECT * FROM ST10090106_INSPECTOR;

/** Inserting records into table DRIVER **/
INSERT INTO ST10090106_DRIVER (Name, Address, Email, Mobile)
VALUES ('Gabrielle Clarke','917 Heuvel St Botshabelo Free State 9781','gorix10987@macauvpn.com',0837113269),
	   ('Geoffrey Franklin','1114 Dorp St Paarl Western Cape 7655','noceti8743@drlatvia.com',0847728052),
	   ('Fawn Cooke','2158 Prospect St Garsfontein Gauteng 0042','yegifav388@enamelme.com',0821966584),
	   ('Darlene Peters','2529 St. John Street Somerset West Western Cape 7110','mayeka4267@macauvpn.com',0841221244),
	   ('Vita Soto','1474 Wolmarans St Sundra Mpumalanga 2200','wegog55107@drlatvia.com',0824567924),
	   ('Opal Rehbein','697 Thutlwa St Letaba Limpopo 0870','yiyow34505@enpaypal.com',0826864938),
	   ('Vernon Hodgson','1935 Thutlwa St Letsitele Limpopo 0885','gifeh11935@enamelme.com',0855991446),
	   ('Crispin Wheatly','330 Sandown Rd Cape Town Western Cape 8018','likon78255@macauvpn.com',0838347945),
	   ('Melanie Cunnigham','616 Loop St Atlantis Western Cape 7350','sehapeb835@macauvpn',0827329001),
	   ('Kevin Peay','814 Daffodil Dr Elliotdale Eastern Cape 5118','xajic53991@enpaypal.com',0832077149);

/** Test **/
SELECT * FROM ST10090106_DRIVER;

/** Inserting records into table RENTAL **/
INSERT INTO ST10090106_RENTAL (RentalID, Carno, CarMake, Inspector, Driver, RentalFee, StartDate, EndDate)
VALUES (1,'HYU001','Hyundai','Bud Barnes','Gabrielle Clarke',5000,'2021-08-30','2021-08-31'),
       (2,'HYU002','Hyundai','Bud Barnes','Gabrielle Clarke',5000,'2021-09-01','2021-09-10'),
	   (3,'FOR001','Ford','Bud Barnes','Geoffrey Franklin',6500,'2021-09-01','2021-09-10'),
       (4,'BMW002','BMW','Tracy Reeves','Vita Soto',7000,'2021-09-20','2021-09-25'),
	   (5,'TOY002','Toyota','Tracy Reeves','Darlene Peters',5000,'2021-10-03','2021-10-31'),
	   (6,'MER001','Mercedes Benz','Sandra Goodwin','Darlene Peters',8000,'2021-10-05','2021-10-15'),
	   (7,'HYU002','Mercedes Benz','Shannon Burke','Vernon Hodgson',5000,'2021-12-01','2022-02-10'),
	   (8,'TOY003','Toyota','Shannon Burke','Melanie Cunningham',5000,'2021-08-10','2021-08-31');

/** Test **/
SELECT * FROM ST10090106_RENTAL;

/** Inserting records into table RETURNTABLE **/
INSERT INTO ST10090106_RETURNTABLE (ReturnTable_ID, Carno, CarMake, Inspector, Driver, ReturnDate, ElapsedDate, Fine)
VALUES (1,'HYU001','Hyundai','Bud Barnes','Gabrielle Clarke','2021-08-31',0,0),
       (2,'HYU002','Hyundai','Bud Barnes','Gabrielle Clarke','2021-09-10',0,0),
	   (3,'FOR001','Ford','Bud Barnes','Geoffrey Franklin','2021-09-10',0,0),
       (4,'BMW002','BMW','Tracy Reeves','Vita Soto','2021-09-25',0,2500),
	   (5,'TOY002','Toyota','Tracy Reeves','Darlene Peters','2021-10-31',0,1000),
	   (6,'MER001','Mercedes Benz','Sandra Goodwin','Darlene Peters','2021-10-15',0, 500),
	   (7,'HYU002','Hyundai','Shannon Burke','Vernon Hodgson','2022-02-10',0,0),
	   (8,'TOY003','Toyota','Shannon Burke','Melanie Cunningham','2021-08-31',0,0);

/** Test **/
SELECT * FROM ST10090106_RETURNTABLE; 

/** Question 5 **/
SELECT * FROM   
ST10090106_RENTAL WHERE StartDate BETWEEN '2021-08-31' and '2021-10-31'; 

/** Question 6 **/
SELECT * FROM ST10090106_RENTAL
WHERE Inspector LIKE 'Bud Barnes%';

/** Question 7 **/
SELECT * FROM ST10090106_RETURNTABLE
WHERE CarNo LIKE 'TOY%';

/** Question 8 **/
SELECT COUNT(CarMake)
FROM ST10090106_RENTAL
WHERE CarMake LIKE 'Hyundai%';

/** Question 9 **/
UPDATE ST10090106_CAR
SET Model = 'Focus'
WHERE CarNo = 'FOR001';

/** Question 10 **/
SELECT CarNo, Driver, RentalFee, StartDate, EndDate
FROM ST10090106_RENTAL 
WHERE CarNo IN(SELECT CarNo FROM ST10090106_CAR WHERE Available = 'yes'
);

/** Question 11 **/
SELECT DISTINCT CarMake, Available FROM ST10090106_CAR;

/** Question 12 **/
SELECT CarNo, CarMake, Model
FROM ST10090106_CAR
WHERE (ServiceKilometres - KillometresTravelled) < 9000;

/** Question 13 **/
SELECT ReturnDate AS ReturnDate,
DATEDIFF(day, ReturnDate, CONVERT(date, getdate())) AS ElapsedDays,
DATEDIFF(day, ReturnDate, CONVERT(date, getdate())) * 500 AS LateFee
FROM ST10090106_RETURNTABLE;


