DROP TABLE IF EXISTS company;
DROP TABLE IF EXISTS promo;
drop table if exists supermarket;
drop table if exists event

CREATE TABLE company (
  id BIGINT NOT NULL,
  company_name VARCHAR(255),
  email VARCHAR(50)
);

CREATE TABLE promo (
  id BIGINT NOT NULL ,
  promo_name VARCHAR(50)
);

create table supermarket (
	id bigint not null,
	supermarket_name varchar(255)
)

create table event(
	promo_id bigint not null,
event_name varchar(255)
)
