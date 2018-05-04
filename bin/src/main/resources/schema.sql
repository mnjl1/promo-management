drop table if exists event;
DROP TABLE IF EXISTS company;
DROP TABLE IF EXISTS promo;
drop table if exists supermarket;

CREATE TABLE company (
  company_id BIGINT NOT NULL,
  company_name VARCHAR(255),
  email VARCHAR(50)
);

CREATE TABLE promo (
  promo_id BIGINT NOT NULL ,
  promo_name VARCHAR(50)
);

create table supermarket (
	supermarket_id bigint not null,
	supermarket_name varchar(255)
);

create table event(
	event_id bigint not null,
  description varchar(255),
  creation_date date,
  company_id bigint,
  promo_id bigint,
  supermarket_id bigint,
  status boolean
)
