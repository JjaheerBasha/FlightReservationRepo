use projectdb;

create table location
(id int primary key,
code varchar(20),
name varchar(20),
type varchar(10));

select * from location;

select type,count(type) 
from location
group by type;

select * from location;

