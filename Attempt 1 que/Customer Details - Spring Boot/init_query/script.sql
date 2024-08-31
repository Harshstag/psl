DROP TABLE if exists customer_details;

CREATE TABLE customer_details (
        id bigint(20) NOT NULL AUTO_INCREMENT,
    first_name varchar(255) DEFAULT NULL,
	last_name varchar(255) DEFAULT NULL,
	address varchar(255) DEFAULT NULL,
    	mobile_number varchar(10) DEFAULT NULL,
	PRIMARY KEY (id)
);

insert into customer_details(id, first_name, last_name, address, mobile_number) values (1,'Emma', 'Watson', 'Pune', '9500000059');
insert into customer_details(id, first_name, last_name, address, mobile_number) values (2,'Jack', 'Christin', 'Bangalore', '8123456789');
insert into customer_details(id, first_name, last_name, address, mobile_number) values (3,'Manisha', 'Mckensy', 'England', '9500120059');
insert into customer_details(id, first_name, last_name, address, mobile_number) values (4,'Arya', 'Samaj', 'Russia', '9512000059');
insert into customer_details(id, first_name, last_name, address, mobile_number) values (5,'Vicky', 'Raj', 'Chennai', '9500000060');