use orderrapportmanagement;

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
    ("3312222323", "wer@ew.ch", 1, 2, 3, 4, 5, 2), 
    ("0123103012", "asda@ad.asd", 2, 3, 4, 5, 1, 4),
    ("8283040234", "afzqg@dhag.ch", 3, 4, 5, 1, 2, 5);

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
    (10, 5),
    (50, 25),
    (6, 3),
    (54, 27);

insert into orderRapport
	(title, datesFK, travelingCostsFk, customerFk, workerFk) 
    values 
    ("ads", 1, 2, 2, 1),
    ("sd", 2, 3, 4, 3),
    ("sdf", 3, 4, 5, 1);

insert into typesOfActivity
	(type) 
    values 
    ("Essen"),
    ("Schlafen"),
    ("Gehen");

insert into textModules
	(buildingBlock, typesOfActivityFk) 
    values 
    ("uuuuu   uu  uuuuuu  uuuuuu uuuuuuuuu  uuuuu  uuuuu uuu  uuuuu  uuuuuu uuuuuuuuuuuu  uuuuuuuuuu  uuuuuuuu", 1),
    ("sduabfuh auhdsf bubhf duhbf fdsa uhbifribhufdifd saibnh fdsaiuhsfd uibhf dhibf dasihuifashd ihfsuda udfd", 2),
    ("ffffffffff f  f f  fffffffffff   fffffffffff fffff fffffffff  ffffffffff  ffff ffff fff ffffffffffffffff", 3);

insert into activities
	(note, costs, totalTime, FromTime, toTime, typesOfActivityFK, orderRapportFk) 
    values 
    ("asdafadfadfsdfgasgasd", 23, "1h 2min", '11:11:11', '12:12:12', 1, 1),
    ("hsdghaedhghfsghjsgdsf", 53, "2h 4min", '13:13:13', '14:14:14', 2, 2),
    ("jmhjsfghsrthsydthshgd", 64, "3h 8min", '15:15:15', '16:16:16', 3, 3);


    
