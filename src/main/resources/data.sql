insert into company values (1, 'Nestle', 'nestle@gmail.com');
insert into company values (2, 'Sandora', 'serg@pepsico.com');
insert into company values(3, 'AVK', 'avk@gmail.com');

insert into promo values (1, 'дегустація');
insert into promo values(2, 'консультант');

insert into supermarket values (1, 'космополіт');
insert into supermarket values (2, 'сурікова');
insert into supermarket values(3, 'ультрамаркет');

insert into event (event_id, description, company_id, promo_id, supermarket_id, status)
 values (1, 'шоколад Нестле', 1, 1, 1, true );
 
 insert into event (event_id, description, company_id, promo_id, supermarket_id, status)
 values (2, 'Сік Сандора ', 2, 2, 2, true );

 insert into event (event_id, description, company_id, promo_id, supermarket_id, status)
 values (3, 'кава', 2, 1, 2, true );