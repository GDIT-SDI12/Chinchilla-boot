INSERT INTO users (username, password, first_name, last_name, email, enabled) VALUES ('mick', '{noop}111', 'Mick', 'Jagger', 'coolguy@mail.ru', true);
INSERT INTO users (username, password, first_name, last_name, email, enabled) VALUES ('woody', '{noop}111', 'Woody', 'Allen', 'damn@mail.ru', true);
INSERT INTO users (username, password, first_name, last_name, email, enabled) VALUES ('errol', '{noop}111', 'Errol', 'Brown', 'fox@mail.ru', true);
INSERT INTO users (username, password, first_name, last_name, email, enabled) VALUES ('kathy', '{noop}111', 'Kathy', 'Kate', 'romantic@mail.ru', true);
INSERT INTO users (username, password, first_name, last_name, email, enabled) VALUES ('222', '{noop}111', 'Mick', 'Jagger', 'newmail@yahoo.com', true);

INSERT INTO authorities (username, authority) VALUES ('mick', 'ROLE_ADMIN');
INSERT INTO authorities (username, authority) VALUES ('mick', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('woody', 'ROLE_ADMIN');
INSERT INTO authorities (username, authority) VALUES ('errol', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('kathy', 'ROLE_USER');
INSERT INTO authorities (username, authority) VALUES ('222', 'ROLE_USER');
