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
    id         serial PRIMARY KEY,
    first_name varchar(50),
    last_name  varchar(50),
    email      varchar(30) UNIQUE NOT NULL
)
