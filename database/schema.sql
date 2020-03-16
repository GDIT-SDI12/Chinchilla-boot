-- Drop tables

DROP TABLE IF EXISTS saved_posts;
DROP TABLE IF EXISTS images;
DROP TABLE IF EXISTS posts;
DROP TABLE IF EXISTS post_types;
DROP TABLE IF EXISTS authorities;
DROP TABLE IF EXISTS users;

-- Create tables

CREATE TABLE users
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    username   varchar(50) UNIQUE NOT NULL,
    password   varchar(50)        NOT NULL,
    first_name varchar(50),
    last_name  varchar(50),
    email      varchar(30) UNIQUE NOT NULL,
    enabled    BOOLEAN            NOT NULL
);

CREATE TABLE authorities
(
    username  varchar(50) NOT NULL,
    authority varchar(50) NOT NULL,
    PRIMARY KEY (username, authority),
    FOREIGN KEY (username) REFERENCES users (username)
);
