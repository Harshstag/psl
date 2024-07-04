Begin
   execute immediate 'Drop table event';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/

create table event(id number(19) primary key,event_name varchar2(255),organiser varchar2(255),organiser_number varchar2(255),hall_name varchar2(255),location varchar2(255), primary key(id));

-- Generate ID using sequence and trigger
drop sequence event_seq;
create sequence event_seq start with 1 increment by 1;

create or replace trigger event_seq_tr
 before insert on event for each row
 when (new.id is null)
begin
 select event_seq.nextval into :new.id from dual;
end;
/

INSERT INTO event (id, event_name, organiser, organiser_number, hall_name, location) VALUES (1,'Birthday Party','Robert','7894561230', 'RR Hall', 'Washington');
INSERT INTO event (id, event_name, organiser, organiser_number, hall_name, location) VALUES (2,'Sports Ceremony','William','7894567890', 'KK Mahal','San Fransisco');
INSERT INTO event (id, event_name, organiser, organiser_number, hall_name, location) VALUES (3,'Home Fest','Jessy','968520147', 'Golden Mahal', 'Chicago');
INSERT INTO event (id, event_name, organiser, organiser_number, hall_name, location) VALUES (4,'Wedding Event','Peter','8523697410', 'PKR Mahal', 'New York');
INSERT INTO event (id, event_name, organiser, organiser_number, hall_name, location) VALUES (5,'Roto Fest','Stuart','9874563201', 'Hills Party Hall', 'Paris');
