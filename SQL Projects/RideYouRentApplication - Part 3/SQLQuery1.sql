
-- Creating all the tables 
-- Creating the CAR Table
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

-- Creating the INSPECTOR Table
CREATE TABLE ST10090106_INSPECTOR
(
Inspector_no varchar(4) not null PRIMARY KEY,
Name varchar(30),
Email varchar(30),
Mobile char(10) not null
);

-- Creating the DRIVER Table
CREATE TABLE ST10090106_DRIVER
(
Name varchar(30) not null PRIMARY KEY,
Address varchar(80) not null,
Email varchar(50),
Mobile char(10) not null
);

-- Creating the RENTAL Table
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

-- Creating the RETURNTABLE Table
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

-- Creating the CARMAKE Table
CREATE TABLE ST10090106_CARMAKE
(
CarMake_Description varchar (30) not null PRIMARY KEY
);

-- Creating the CARBODY_TYPE Table
CREATE TABLE ST10090106_CARBODY_TYPE
(
CarBody_Description varchar (30) not null PRIMARY KEY
);

-- Testing the CAR Table
SELECT * From ST10090106_CAR;

-- Testing the INSPECTOR Table
SELECT * From  ST10090106_INSPECTOR;

-- Testing the DRIVER Table
SELECT * From  ST10090106_DRIVER;

-- Testing the RENTAL Table
SELECT * From ST10090106_RENTAL;

-- Testing the RETURNTABLE Table
SELECT * From ST10090106_RETURNTABLE;

-- Testing the CARMAKE Table
SELECT * From ST10090106_CARMAKE;

-- Testing the CARBODY_TYPE Table
SELECT * From ST10090106_CARBODY_TYPE;

-- Calculating the penalty fee on a rental that was returned late
ALTER TABLE ST10090106_RETURNTABLE
DROP COLUMN Fine;

ALTER TABLE dbo.ST10090106_RETURNTABLE
ADD Fine
AS (ElapsedDate * 500);






 