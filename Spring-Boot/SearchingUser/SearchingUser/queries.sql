Begin
   execute immediate 'Drop table owner';
EXCEPTION
   WHEN OTHERS THEN NULL;
END;
/

create table owner(id number(19) primary key,name varchar2(255),password varchar2(255),email_id varchar2(255),mobile_number varchar2(255));

-- Generate ID using sequence and trigger
drop sequence owner_seq;
create sequence owner_seq start with 1 increment by 1;

create or replace trigger owner_seq_tr
 before insert on owner for each row
 when (new.id is null)
begin
 select owner_seq.nextval into :new.id from dual;
end;
/

INSERT INTO owner (id, name, password, email_id, mobile_number) VALUES (1,'Robert', 'Robert@123', 'robert@gmail.com', '7894561230');
INSERT INTO owner (id, name, password, email_id, mobile_number) VALUES (2,'William', 'William@123', 'william@gmail.com', '7894567890');
INSERT INTO owner (id, name, password, email_id, mobile_number) VALUES (3,'Jessy', 'Jessy@123', 'jessy@gmail.com', '968520147');
INSERT INTO owner (id, name, password, email_id, mobile_number) VALUES (4,'Peter', 'Peter@123', 'peter@gmail.com', '8523697410');
INSERT INTO owner (id, name, password, email_id, mobile_number) VALUES (5,'Stuart', 'Stuart@123', 'stuart@gmail.com', '9874563201');
