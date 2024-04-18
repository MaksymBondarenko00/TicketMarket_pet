-- liquibase formatted sql

-- changeset 6ezdar:1
CREATE TABLE IF NOT EXISTS users
(
    user_id    binary(16) primary key not null,
    first_name varchar(30)            not null,
    last_name  varchar(30)            not null,
    user_info  binary(16)             not null,
    is_blocked boolean,
    created_at varchar(30)            not null
);

CREATE TABLE IF NOT EXISTS roles
(
    role_id   binary(16) PRIMARY KEY,
    role_name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS user_info
(
    user_info_id binary(16) primary key not null,
    username     varchar(32)            not null,
    user_id      binary(16)             not null,
    country      varchar(32)            not null,
    city         varchar(32)            not null,
    password     varchar(64)            not null,
    email        varchar(64)            not null,
    phone_number varchar(64)            not null,
    card_number  varchar(64),
    role         binary(16)             not null,
    FOREIGN KEY (user_id) REFERENCES users (user_id),
    FOREIGN KEY (role) REFERENCES roles (role_id)
);

CREATE TABLE IF NOT EXISTS tickets
(
    ticket_id        binary(16) primary key not null,
    event_id         binary(16)             not null,
    user_id          binary(16),
    price            double                 not null,
    service_payments double,
    area_type        varchar(30)            not null,
    has_bought       boolean,
    created_at       varchar(30)            not null
);

CREATE TABLE IF NOT EXISTS concerts
(
    concert_id   binary(16) primary key not null,
    concert_name varchar(64)            not null,
    country      varchar(32)            not null,
    city         varchar(32)            not null,
    address      varchar(64)            not null,
    date         date                   not null
);

CREATE TABLE IF NOT EXISTS artists
(
    artist_id binary(16) primary key not null,
    name      varchar(64)            not null,
    role      varchar(64)            not null

);

CREATE TABLE IF NOT EXISTS events
(
    event_id      binary(16) primary key not null,
    event_name    varchar(64)            not null,
    event_type    varchar(64)            not null,
    description   text                   not null,
    created_at    varchar(32)            not null,
    tickets_count integer                not null
);

CREATE TABLE IF NOT EXISTS orders
(
    order_id       binary(16) primary key not null,
    client_id      binary(16)             not null,
    order_cost     integer                not null,
    promo_code     binary(16),
    payment_method varchar(32),
    currency_code  varchar(16)            not null,
    created_at     varchar(32)
);

CREATE TABLE IF NOT EXISTS promo_codes
(
    promo_id            binary(16) primary key not null,
    discount_percentage integer                not null
);


CREATE TABLE IF NOT EXISTS authorities
(
    authority_id   binary(16) PRIMARY KEY,
    authority_name VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS user_role
(
    user_id binary(16) NOT NULL,
    role_id binary(16) NOT NULL,
    PRIMARY KEY (user_id, role_id),
    FOREIGN KEY (user_id) REFERENCES users (user_id),
    FOREIGN KEY (role_id) REFERENCES roles (role_id)
);

CREATE TABLE role_authority
(
    role_id      binary(16) NOT NULL,
    authority_id binary(16) NOT NULL,
    PRIMARY KEY (role_id, authority_id),
    FOREIGN KEY (role_id) REFERENCES roles (role_id),
    FOREIGN KEY (authority_id) REFERENCES authorities (authority_id)
);