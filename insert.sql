insert into companies 
	(company) 
	values 
    ("CsBe"), 
    ("hp"),
    ("Migros"), 
    ("GameStop"), 
    ("Exlibris");
    
insert into places
	(place) 
	values 
    ("Bern"), 
    ("Thun"),
    ("Zürich"), 
    ("Basel"), 
    ("Genf");

insert into zip
	(zip) 
	values 
    (3027), 
    (3624),
    (8037), 
    (4055), 
    (1218);

insert into streetNames
	(streetName) 
	values 
    ("Riedernrain"), 
    ("Gingerstrasse"),
    ("Hunora"), 
    ("Veilchenweg"), 
    ("umbrella");

insert into streetNrs
	(streetNr) 
	values 
    ("285"), 
    ("a25"),
    ("32"), 
    ("01"), 
    ("u12");

insert into typeOfPerson
	(type) 
	values 
    ("customer"), 
    ("worker");

insert into people
	(firstname, lastname, typeOfPersonFk) 
	values 
    ("Fabian", "Kurt", 2), 
    ("Tim", "Bauer", 1),
    ("Dario", "Steck", 2), 
    ("Heidi", "Becker", 1), 
    ("Lorenz", "Widmer", 1);

insert into contact
	(tel, email, companiesFk, placesFk, zipFk, streetnamesFk, streetnrsFk, customerFk) 
	values 
    ("3312222323", "wer@ew.ch", 1, 2, 3, 4, 5, 1), 
    ("0123103012", "asda@ad.asd", 2, 3, 4, 5, 1, 2),
    ("8283040234", "afzqg@dhag.ch", 3, 4, 5, 1, 2, 3), 
    ("6234252532", "Fdfgag.sfa@afgadf.sadf", 4, 5, 1, 2, 3, 4), 
    ("9534523452", "er@er.er", 5, 1, 2, 3, 4, 5);

insert into dates
	(workingDay) 
    values 
    ("2018-01-05"),
    ("2018-02-10"),
    ("2018-03-15"),
    ("2018-04-20"),
    ("2018-05-25");

insert into travelingCosts
	(costs, km) 
    values 
    (36, 18),
    (5, 10),
    (25, 50),
    (3, 6),
    (27, 54);

insert into orderRapport
	(title, signature, datesFK, travelingCostsFk, customerFk, workerFk) 
    values 
    ();

insert into typesOfActivity
	(type) 
    values 
    (); -- varchar

insert into textModules
	(buildingBlock, typesOfActivityFk) 
    values 
    (); -- varchar

insert into activities
	(note, costs, totalTime, FromTime, toTime, typesOfActivityFK, orderRapportFk) 
    values 
    ();


    
