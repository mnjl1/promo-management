insert into company values (1, 'Nestle', 'nestle@gmail.com');
insert into company values (2, 'Sandora', 'serg@pepsico.com');

insert into promo values (1, 'дегустація');
insert into promo values(2, 'консультант');

insert into supermarket values (1, 'космополіт');
insert into supermarket values (2, 'сурікова');

insert into event (event_id, description, company_id, promo_id, supermarket_id)
 values (1, 'шоколад Нестлде', 1, 1, 1 )
