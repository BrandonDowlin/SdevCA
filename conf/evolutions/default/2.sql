# --- Sample dataset
 
# --- !Ups
 
delete from employee;
delete from project;
delete from department;
delete from address;

insert into department (id, name) values ( 1, 'Finance');
insert into department (id, name) values ( 2, 'IT');
insert into department (id, name) values ( 3, 'Sales');
insert into department (id, name) values ( 4, 'HR');
insert into department (id, name) values ( 5, 'R&D');


insert into project (id,name) values ( 1,'Alpha');
insert into project (id,name) values ( 2,'Bravo');
insert into project (id,name) values ( 3,'Charlie');
insert into project (id,name) values ( 4,'Delta');
insert into project (id,name) values ( 5,'Echo');
insert into project (id,name) values ( 6,'Foxtrot');
insert into project (id,name) values ( 7,'Golf');
insert into project (id,name) values ( 8,'Hotel');
insert into project (id,name) values ( 9,'India');
insert into project (id,name) values ( 10,'Juliet');

insert into address (id, address) values (1, 'Wood Street Cork');
insert into address (id, address) values (2, '11th Street Dublin');
insert into address (id, address) values (3, 'Maiden Lane Tyrone');
insert into address (id, address) values (4, 'State Street East Louth');
insert into address (id, address) values (5, 'Dogwood Drive Dublin');
insert into address (id, address) values (6, 'Delaware Avenue Galway');
insert into address (id, address) values (7, 'Bridle Lane Dublin');
insert into address (id, address) values (8, 'Forest Drive Mayo');
insert into address (id, address) values (9, 'Primrose Lane Clare');
insert into address (id, address) values (10, 'Madison Street Down');
insert into address (id, address) values (11, 'Jefferson Court Limerick');
insert into address (id, address) values (12, 'York Road Mayo');
insert into address (id, address) values (13, 'East Street Dublin');
insert into address (id, address) values (14, 'Cooper Street Dublin');
insert into address (id, address) values (15, 'Lake Avenue Cork');
insert into address (id, address) values (16, 'Route 10 Roscommon');
insert into address (id, address) values (17, 'Canterbruy Drive Limerick');
insert into address (id, address) values (18, 'James Street Kerry');
insert into address (id, address) values (19, '3rd Avenue Sligo');
insert into address (id, address) values (20, 'Route 9 Mayo');
insert into address (id, address) values (21, 'James Lane Kildare');
insert into address (id, address) values (22, '4th Avenue Offaly');
insert into address (id, address) values (23, 'Route 91 Tipperary');


insert into employee (id,fname, lname ,department_id, address_id) values ( 1,'Noah','Girotto', 2,1);
insert into employee (id,fname, lname ,department_id,address_id) values ( 2,'Ethan','Starkey', 5,2);
insert into employee (id,fname, lname ,department_id,address_id) values ( 3,'Dylan','Klebold', 4,3);
insert into employee (id,fname, lname ,department_id,address_id) values ( 4,'Omar','Musleh', 3,4);
insert into employee (id,fname, lname ,department_id,address_id) values ( 5,'Thomas','Smitherman', 4,5);
insert into employee (id,fname, lname ,department_id,address_id) values ( 6,'Bobby','Irgashev', 1,6);
insert into employee (id,fname, lname ,department_id,address_id) values ( 7,'Damian','Byrd', 5,7);
insert into employee (id,fname, lname ,department_id,address_id) values ( 8,'Ian','Wickett', 4,8);
insert into employee (id,fname, lname ,department_id,address_id) values ( 9,'Philip','Dayoub', 1,9);
insert into employee (id,fname, lname ,department_id,address_id) values ( 10,'Jamaal','Waters', 2,10);
insert into employee (id,fname, lname ,department_id,address_id) values ( 11,'Tyler','Smalls', 5,11);
insert into employee (id,fname, lname ,department_id,address_id) values ( 12,'Tyler','Marc', 4,12);
insert into employee (id,fname, lname ,department_id,address_id) values ( 13,'Eric','Harris', 1,13);
insert into employee (id,fname, lname ,department_id,address_id) values ( 14,'Joseph','Duncan', 4,14);
insert into employee (id,fname, lname ,department_id,address_id) values ( 15,'Elliot','Rodger', 3,15);
insert into employee (id,fname, lname ,department_id,address_id) values ( 16,'Adam','Lanza', 2,16);
insert into employee (id,fname, lname ,department_id,address_id) values ( 17,'Martin','Bryant', 2,17);
insert into employee (id,fname, lname ,department_id,address_id) values ( 18,'Marc','Lepine', 4,18);
insert into employee (id,fname, lname ,department_id,address_id) values ( 19,'Randy','Stair', 5,19);
insert into employee (id,fname, lname ,department_id,address_id) values ( 20,'Tim','Kretschmer', 3,20);
insert into employee (id,fname, lname ,department_id,address_id) values ( 21,'Jared','Loughner', 1,21);
insert into employee (id,fname, lname ,department_id,address_id) values ( 22,'Robert','Hawkens', 2,22);
insert into employee (id,fname, lname ,department_id,address_id) values ( 23,'Anders','Breivik', 5,23);

 
insert into project_employee (project_id,employee_id) values (5,1);
insert into project_employee (project_id,employee_id) values (5,2);
insert into project_employee (project_id,employee_id) values (1,3);
insert into project_employee (project_id,employee_id) values (3,4);
insert into project_employee (project_id,employee_id) values (3,5);
insert into project_employee (project_id,employee_id) values (8,6);
insert into project_employee (project_id,employee_id) values (10,7);
insert into project_employee (project_id,employee_id) values (7,8);  
insert into project_employee (project_id,employee_id) values (3,9);
insert into project_employee (project_id,employee_id) values (5,10);
insert into project_employee (project_id,employee_id) values (9,11);
insert into project_employee (project_id,employee_id) values (2,12);
insert into project_employee (project_id,employee_id) values (8,7);
insert into project_employee (project_id,employee_id) values (6,8);
insert into project_employee (project_id,employee_id) values (2,3);  



