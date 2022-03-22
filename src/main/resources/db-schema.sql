create table country( id integer identity , name varchar (255) , code_name varchar (255) );
create table bank(id integer identity, name varchar (255), country integer, foreign key(country) references country);
create table client(id integer identity , name varchar(255), bank integer, foreign key (bank) references bank);