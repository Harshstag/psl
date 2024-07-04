DROP TABLE if exists weather_report;

CREATE TABLE weather_report (
	id bigint(20) NOT NULL AUTO_INCREMENT,
	city varchar(255) DEFAULT NULL,
	max_temperature double DEFAULT NULL,
	min_temperature double DEFAULT NULL,
	PRIMARY KEY (id)
);

INSERT INTO weather_report (id, city, max_temperature, min_temperature) VALUES ('1', 'New York', '35', '25');
INSERT INTO weather_report (id, city, max_temperature, min_temperature) VALUES ('2', 'Los Angeles', '42', '36');
INSERT INTO weather_report (id, city, max_temperature, min_temperature) VALUES ('3', 'Chicago', '30', '25');
INSERT INTO weather_report (id, city, max_temperature, min_temperature) VALUES ('4', 'Houston', '32', '29');
INSERT INTO weather_report (id, city, max_temperature, min_temperature) VALUES ('5', 'Phoenix', '38', '32');
INSERT INTO weather_report (id, city, max_temperature, min_temperature) VALUES ('6', 'Philadelphia', '28', '22');
INSERT INTO weather_report (id, city, max_temperature, min_temperature) VALUES ('7', 'San Antonio', '25', '20');
INSERT INTO weather_report (id, city, max_temperature, min_temperature) VALUES ('8', 'San Diego', '24', '22');
INSERT INTO weather_report (id, city, max_temperature, min_temperature) VALUES ('9', 'Dallas', '45', '40');
INSERT INTO weather_report (id, city, max_temperature, min_temperature) VALUES ('10', 'San Jose', '42', '37');
