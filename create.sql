create database orderRapportManagement;

use orderRapportManagement;

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
	workingDay date,
    primary key(id)
);

create table orderRapport(
	id int not null auto_increment,
	title varchar(32),
	signature mediumblob,
	datesFk int not null,
	travelingCostsFk int not null,
	customerFk int not null,
	primary key(id),
	foreign key(datesFk) references dates(id),
	foreign key(travelingCostsFk) references travelingCosts(id),
	foreign key(customerFk) references customer(id)
);

create table orderRapportWorker(
	id int not null auto_increment,
	orderRapportFk int not null,
	workerFk int not null auto_increment,
    primary key(id),
	foreign key(orderRapportFk) references orderRapport(id),
	foreign key(workerFk) references worker(id)
);

create table typesOfActivity(
	id int not null auto_increment,
	type varchar(64),
	primary key(id)
);

create table textModules(
	id int not null auto_increment,
	buildingBlock text,
	typesOfActivityFk int not null,
	primary key(id),
	foreign key(typesOfActivityFk) references typesOfActivity(id)
);

create table activities(
	id int not null auto_increment,
	note text,
	costs int,
	totalTime varchar(32),
	fromTime Time,
	toTime Time,
	typesOfActivityFk int not null,
	orderRapportFk int not null,
	primary key(id),
	foreign key(typesOfActivityFk) references typesOfActivity(id),
	foreign key(orderRapportFk) references orderRapport(id)
);
