create database orderRapport;

use orderRapport;

create table companies(
	id int not null auto_increment,
	company varchar(32),
	primary key(id)
);

create table places(
	id int not null auto_increment,
	place varchar(32),
	primary key(id)
);

create table zip(
	id int not null auto_increment,
	zip int,
	primary key(id)
);

create table streetNames(
	id int not null auto_increment,
	streetName varchar(32),
	primary key(id)
);

create table streetNrs(
	id int not null auto_increment,
	streetNr varchar(16),
	primary key(id)
);
	
create table customer(
	id int not null auto_increment,
	firstname varchar(64),
	lastname varchar(64),
	primary key(id)
);

create table contact(
	id int not null auto_increment,
	tel varchar(32),
	email varchar(32),
	companiesFk int not null,
	placesFk int not null,
	zipFk int not null,
	streetNamesFk int not null,
	streetNrsFk int not null,
	customerFk int not null,
	primary key(id),
	foreign key(companiesFk) references companies(id),
	foreign key(placesFk) references places(id),
	foreign key(zipFk) references zip(id),
	foreign key(streetNamesFk) references streetNames(id),
	foreign key(streetNrsFk) references streetNrs(id),
	foreign key(customerFk) references customer(id)
);

create table worker(
	id int not null auto_increment,
	firstname varchar(64),
	lastname varchar(64),
	primary key(id)
);

create table travelingCosts(
	id int not null auto_increment,
	costs int,
	km int,
	primary key(id)
);

create table dates(
	id int not null auto_increment,
	'date' date
);

