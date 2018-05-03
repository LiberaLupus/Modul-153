use orderrapportmanagement;

-- Kundeninformationen ausgeben
select p.firstname, p.lastname, c.tel, c.email, co.company, pl.place, z.zip, sn.streetName, snr.streetNr from people as p
	inner join contact as c on p.id = c.customerFk
    inner join companies as co on c.companiesFk = co.id
    inner join places as pl on c.placesFk = pl.id
    inner join zip as z on c.zipFk = z.id
    inner join streetnames as sn on c.streetNamesFk = sn.id
    inner join streetnrs as snr on c.streetNrsFk = snr.id;

-- Typ der Person ausgeben
select p.firstname, p.lastname, t.type  from people as p
	inner join typeofperson as t on p.typeofpersonFk = t.id;

-- Auftragsrapport zum jeweiligen Kunde ausgeben
select p.firstname, p.lastname, o.title from people as p
	inner join orderrapport as o on p.id = o.customerFk;

-- Alle Daten zu den einzelnen Auftragsrapports
select o.title, a.note, ta.type, d.workingDay, a.fromTime, a.toTime, a.totalTime, t.km as 'traveling distance in km', 
p.firstname as 'worker firstname', p.lastname as 'worker lastname', a.costs as 'working costs', 
t.costs as 'traveling costs', t.costs + a.costs as 'total costs' from orderrapport as o
	inner join activities as a on o.id = a.orderRapportFk
	inner join dates as d  on o.datesFk = d.id
    inner join travelingcosts as t on o.travelingCostsFk = t.id
    inner join people as p on o.customerFk = p.id
    inner join typesofactivity as ta on a.typesOfActivityFk = ta.id;

-- Zu den einzelnen Activitytypes die jeweiligen Textbausteine
select t.type, tm.buildingBlock from typesofactivity as t
	inner join textmodules as tm on t.id = tm.typesOfActivityFk;

