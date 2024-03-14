CREATE TABLE IF NOT EXISTS users
(
    user_id      binary(16) primary key not null,
    first_name   varchar(30)            not null,
    last_name    varchar(30)            not null,
    user_tickets text,
    user_orders  text,
    user_info    varchar(30)            not null,
    role         varchar(20)            not null,
    is_blocked   boolean,
    created_at   varchar(30)            not null
);

CREATE TABLE IF NOT EXISTS user_info
(
    user_info_id binary(16) primary key not null,
    username     varchar(32)            not null,
    country      varchar(32)            not null,
    city         varchar(32)            not null,
    password     varchar(64)            not null,
    email        varchar(64)            not null,
    phone_number varchar(64)            not null,
    card_number  varchar(64)            not null
);

CREATE TABLE IF NOT EXISTS tickets
(
    ticket_id        binary(16) primary key not null,
    event_id         varchar(30)            not null,
    user_id      varchar(30),
    price            double                 not null,
    service_payments double,
    area_type        varchar(30)            not null,
    has_bought       boolean,
    created_at       varchar(30)            not null
);

CREATE TABLE IF NOT EXISTS concerts
(
    concert_id     binary(16) primary key not null,
    event_name     varchar(64)            not null,
    list_of_artist text                   not null,
    concert_dates  text                   not null,
    country        varchar(32)            not null,
    city           varchar(32)            not null,
    address        varchar(64)            not null,
    tickets_count  integer                not null
);

CREATE TABLE IF NOT EXISTS artists
(
    artist_id binary(16) primary key not null,
    name      varchar(64)            not null,
    role      varchar(64)            not null,

);

CREATE TABLE IF NOT EXISTS events
(
    event_id        binary(16) primary key not null,
    event_name      varchar(64)            not null,
    list_of_concert text                   not null,
    description     text                   not null,
    created_at      varchar(32)            not null
);

CREATE TABLE IF NOT EXISTS orders
(
    order_id         binary(16) primary key not null,
    client_id        varchar(32)            not null,
    order_cost       integer                not null,
    selected_tickets text                   not null,
    promo_code       varchar(32),
    payment_method   varchar(32),
    created_at       varchar(32)
);

CREATE TABLE IF NOT EXISTS promo_codes
(
    promo_id            binary(16) primary key not null,
    discount_percentage integer                not null
);