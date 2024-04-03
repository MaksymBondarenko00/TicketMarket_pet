-- liquibase formatted sql

-- changeset 6ezdar:1
insert into promo_codes(promo_id, discount_percentage)
values (UNHEX('7d3e8918ecf74e8a9e5cf1045d2c4a19'), 10),
       (UNHEX('9bf6d26b5937485896e2a3fe8e8cbf0d'), 20),
       (UNHEX('38e8fb84e1fd47a0a3e19d15d0fb4cb3'), 15),
       (UNHEX('5a6c46b3b5864b1884c923876e1c675d'), 25),
       (UNHEX('e80f9a3151564a31b79f229f47c2d4a8'), 30);

insert into artists(artist_id, name, role)
values (UNHEX('e5a6d8c9b0a3f1e2d3c4b5a6d7e8f9a0'), 'Artist1', 'BAND'),
       (UNHEX('1a2b3c4d5e6f7a8b9c0d1e2f3a4b5c6'), 'Artist2', 'COMPANY'),
       (UNHEX('9a8b7c6d5e4f3a2b1c0d9e8f7a6b5c4'), 'Artist3', 'DJ'),
       (UNHEX('f0e1d2c3b4a5b6c7d8e9f0a1b2c3d4'), 'Artist4', 'BAND'),
       (UNHEX('1234567890abcdef1234567890abcdef'), 'Artist5', 'BAND');

INSERT INTO concerts (concert_id, concert_name, country, city, address, tickets_count, date)
VALUES (UNHEX('ea7d23ec91f34b6c9692e3d1dc51d7fb'), 'Concert1', 'USA', 'New York', '123 Broadway', 1000, '2024-03-10'),
       (UNHEX('4fd672f8fb8e4249b723aa1850be5f6d'), 'Concert2', 'Canada', 'Toronto', '456 King St', 800, '2026-06-25'),
       (UNHEX('31dc5fa1e7c84f0a84a91414fc7f8f69'), 'Concert3', 'UK', 'London', '789 Oxford St', 1200, '2024-09-05'),
       (UNHEX('e4f8ed9e3c5f476d8cb75cddcf8c24d2'), 'Concert4', 'Australia', 'Sydney', '101 George St', 1500,
        '2026-11-18'),
       (UNHEX('93ae1eaa65094d46b41f2a73e92d1e37'), 'Concert5', 'Germany', 'Berlin', '202 Alexander plats', 900,
        '2025-04-07');


insert into events(event_id, event_name, event_type, description, created_at)
values (UNHEX('9aef7bfc0bfb495a97a44a2f42f7e43d'), 'Concert1', 'SPECIAL_EVENT', 'Description for Concert1', NOW()),
       (UNHEX('3e6cb2092b1b46f8b9ad3ac24c9a9df4'), 'Concert2', 'THEATER', 'Description for Concert2', NOW()),
       (UNHEX('8d36a4d0e9c24c15a0445bc356f7adfb'), 'Concert3', 'SPECIAL_EVENT', 'Description for Concert3', NOW()),
       (UNHEX('7c3cfb5bf3db4ec3942e6d0c1e678239'), 'Concert4', 'FESTIVAL', 'Description for Concert4', NOW()),
       (UNHEX('ae9c5d6fe62c4586b8c420849787d5fc'), 'Concert5', 'SPORT', 'Description for Concert5', NOW());

insert into users(user_id, first_name, last_name, user_info, is_blocked, created_at)
values (UNHEX('d0674b2978a34ac3bd6f96f5d9854a82'), 'John', 'Doe', UNHEX('e9df4121e6834b4d9537b8a7d822e7a2'),
        0, NOW()),
       (UNHEX('a8e6c3f9bd5d499da6c8c08367627fa1'), 'Jane', 'Smith', UNHEX('6f8202f6b9034cc789aeb332b2d23de5'),
        0, NOW()),
       (UNHEX('bcb8e69b23024ec0b99e528b9d94bb17'), 'Alice', 'Johnson', UNHEX('7c9dca5ffea343d39e8595e5f6abf862'),
        1, NOW()),
       (UNHEX('f1b6fd6f67e44c838f4d6b176a3ff1d5'), 'Bob', 'Brown', UNHEX('4a5e7b199ac7487d9a6ef33e2cb5b29d'),
        0, NOW()),
       (UNHEX('2c8abcbf2f9546a4b959bc5699b90b5c'), 'Emma', 'Davis', UNHEX('dd4d792cf7b64153a0b2a6b8a50ef48a'),
        1, NOW());

-- Вставка ролей
INSERT INTO roles (role_id, role_name)
VALUES (UNHEX('3e07e1705f2b47a0b9a7dc07936f9e4d'), 'ROLE_USER'),
       (UNHEX('9f8d21ee3b9b42cd8f2adf1a5f964356'), 'ROLE_ADMIN'),
       (UNHEX('3e07e1705f2b47a0b9a7dc07936f9e4a'), 'ROLE_ADMIN'),
       (UNHEX('16e05517895b448d84d0eb179af1db3d'), 'ROLE_ADMIN'),
       (UNHEX('c88f636f66354e8eb3d76b3f207d4e1c'), 'ROLE_ADMIN');

insert into user_info(user_info_id, username, user_id, country, city, password, email, phone_number, card_number, role)
values (UNHEX('e9df4121e6834b4d9537b8a7d822e7a2'), 'john_doe', UNHEX('d0674b2978a34ac3bd6f96f5d9854a82'), 'USA',
        'New York', 'password123', 'john@example.com',
        '123-456-7890', '1234-5678-9012-3456', UNHEX('3e07e1705f2b47a0b9a7dc07936f9e4d')),
       (UNHEX('6f8202f6b9034cc789aeb332b2d23de5'), 'jane_smith', UNHEX('a8e6c3f9bd5d499da6c8c08367627fa1'), 'Canada',
        'Toronto', 'qwerty456', 'jane@example.com',
        '987-654-3210', '9876-5432-1098-7654', UNHEX('9f8d21ee3b9b42cd8f2adf1a5f964356')),
       (UNHEX('7c9dca5ffea343d39e8595e5f6abf862'), 'alice_johnson', UNHEX('bcb8e69b23024ec0b99e528b9d94bb17'), 'UK',
        'London', 'myp@ssw0rd', 'alice@example.com',
        '456-789-0123', '4567-8901-2345-6789', UNHEX('3e07e1705f2b47a0b9a7dc07936f9e4a')),
       (UNHEX('4a5e7b199ac7487d9a6ef33e2cb5b29d'), 'bob_brown', UNHEX('f1b6fd6f67e44c838f4d6b176a3ff1d5'), 'Australia',
        'Sydney', 'securepass', 'bob@example.com',
        '789-012-3456', '7890-1234-5678-9012', UNHEX('16e05517895b448d84d0eb179af1db3d')),
       (UNHEX('dd4d792cf7b64153a0b2a6b8a50ef48a'), 'emma_davis', UNHEX('2c8abcbf2f9546a4b959bc5699b90b5c'), 'Germany',
        'Berlin', 'pass1234', 'emma@example.com',
        '012-345-6789', '0123-4567-8901-2345', UNHEX('c88f636f66354e8eb3d76b3f207d4e1c'));

insert into tickets(ticket_id, event_id, user_id, price, service_payments, area_type, has_bought, created_at)
values (UNHEX('d3e837b4e07c4a9baa17c1777e12d850'), UNHEX('9aef7bfc0bfb495a97a44a2f42f7e43d'),
        UNHEX('d0674b2978a34ac3bd6f96f5d9854a82'), 50.00, 5.00, 'VIP', 1, NOW()),
       (UNHEX('b507b72c49b94b1098f5eac4d30ac9a5'), UNHEX('3e6cb2092b1b46f8b9ad3ac24c9a9df4'),
        UNHEX('a8e6c3f9bd5d499da6c8c08367627fa1'), 30.00, 3.00, 'SEAT', 1, NOW()),
       (UNHEX('1a4fe3d4cf7a49e39c8e13d93e089fc9'), UNHEX('8d36a4d0e9c24c15a0445bc356f7adfb'),
        UNHEX('bcb8e69b23024ec0b99e528b9d94bb17'), 20.00, 2.00, 'STANDING_AREA', 1, NOW()),
       (UNHEX('6f0f7dd005ed40c59f315ef41a2f0fb7'), UNHEX('7c3cfb5bf3db4ec3942e6d0c1e678239'),
        UNHEX('f1b6fd6f67e44c838f4d6b176a3ff1d5'), 40.00, 4.00, 'VIP', 1, NOW()),
       (UNHEX('c94c7604f9c14d14b99ed2799a44bb4a'), UNHEX('ae9c5d6fe62c4586b8c420849787d5fc'),
        UNHEX('2c8abcbf2f9546a4b959bc5699b90b5c'), 25.00, 2.50, 'DANCE_FLOOR', 1, NOW());


insert into orders(order_id, client_id, order_cost, promo_code, payment_method, currency_code,
                   created_at)
values (UNHEX('70f8a1dc8f914f24bc3aa9bb29292482'), UNHEX('d0674b2978a34ac3bd6f96f5d9854a82'), 100.00,
        UNHEX('7d3e8918ecf74e8a9e5cf1045d2c4a19'), 'CREDIT_CARD',
        'EUR', NOW()),
       (UNHEX('e4b4f7aaefa740c08e63a3fbc5c8a0c7'), UNHEX('a8e6c3f9bd5d499da6c8c08367627fa1'), 50.00,
        UNHEX('9bf6d26b5937485896e2a3fe8e8cbf0d'), 'PAYPAL', 'USD',
        NOW()),
       (UNHEX('dd77d18ae178490d8a4b6d3c747d469f'), UNHEX('bcb8e69b23024ec0b99e528b9d94bb17'), 75.00, NULL,
        'CREDIT_CARD', 'UA', NOW()),
       (UNHEX('8a0cbb1c1b6f47a6b92125382c7f4fd1'), UNHEX('f1b6fd6f67e44c838f4d6b176a3ff1d5'), 120.00, NULL, 'PAYPAL',
        'USD', NOW()),
       (UNHEX('eb7c2ab3e99941569ee2b3b08b646e5a'), UNHEX('2c8abcbf2f9546a4b959bc5699b90b5c'), 90.00,
        UNHEX('e80f9a3151564a31b79f229f47c2d4a8'), 'GOOGLE_PAY', 'EUR',
        NOW());


-- Вставка прав
INSERT INTO authorities (authority_id, authority_name)
VALUES (UNHEX('1c88f636f66354e8eb3d76b3f207d4e1'), 'READ_PRIVILEGE');
INSERT INTO authorities (authority_id, authority_name)
VALUES (UNHEX('16e05517895b448d84d0eb179af1db3d'), 'WRITE_PRIVILEGE');
INSERT INTO authorities (authority_id, authority_name)
VALUES (UNHEX('9f8d21ee3b9b42cd8f2adf1a5f964356'), 'WRITE_PRIVILEGE');
INSERT INTO authorities (authority_id, authority_name)
VALUES (UNHEX('13c585908dbb4f24b47a9230271d7b12'), 'WRITE_PRIVILEGE');
INSERT INTO authorities (authority_id, authority_name)
VALUES (UNHEX('a1b2c3d4e5f6a1b2c3d4e5f6a1b2c3d4'), 'WRITE_PRIVILEGE');

-- Связывание пользователей и ролей
INSERT INTO user_role (user_id, role_id)
VALUES (UNHEX('d0674b2978a34ac3bd6f96f5d9854a82'), UNHEX('3e07e1705f2b47a0b9a7dc07936f9e4d')); -- user is a ROLE_USER
INSERT INTO user_role (user_id, role_id)
VALUES (UNHEX('a8e6c3f9bd5d499da6c8c08367627fa1'), UNHEX('9f8d21ee3b9b42cd8f2adf1a5f964356')); -- admin is a ROLE_ADMIN
INSERT INTO user_role (user_id, role_id)
VALUES (UNHEX('bcb8e69b23024ec0b99e528b9d94bb17'), UNHEX('3e07e1705f2b47a0b9a7dc07936f9e4a')); -- admin is a ROLE_ADMIN
INSERT INTO user_role (user_id, role_id)
VALUES (UNHEX('f1b6fd6f67e44c838f4d6b176a3ff1d5'), UNHEX('16e05517895b448d84d0eb179af1db3d')); -- admin is a ROLE_ADMIN
INSERT INTO user_role (user_id, role_id)
VALUES (UNHEX('2c8abcbf2f9546a4b959bc5699b90b5c'), UNHEX('c88f636f66354e8eb3d76b3f207d4e1c'));
-- admin is a ROLE_ADMIN

-- Связывание ролей и прав
INSERT INTO role_authority (role_id, authority_id)
VALUES (UNHEX('3e07e1705f2b47a0b9a7dc07936f9e4d'),
        UNHEX('1c88f636f66354e8eb3d76b3f207d4e1')); -- ROLE_USER has READ_PRIVILEGE
INSERT INTO role_authority (role_id, authority_id)
VALUES (UNHEX('9f8d21ee3b9b42cd8f2adf1a5f964356'),
        UNHEX('16e05517895b448d84d0eb179af1db3d')); -- ROLE_ADMIN has READ_PRIVILEGE
INSERT INTO role_authority (role_id, authority_id)
VALUES (UNHEX('9f8d21ee3b9b42cd8f2adf1a5f964356'),
        UNHEX('9f8d21ee3b9b42cd8f2adf1a5f964356')); -- ROLE_ADMIN has READ_PRIVILEGE
INSERT INTO role_authority (role_id, authority_id)
VALUES (UNHEX('9f8d21ee3b9b42cd8f2adf1a5f964356'),
        UNHEX('13c585908dbb4f24b47a9230271d7b12')); -- ROLE_ADMIN has READ_PRIVILEGE
INSERT INTO role_authority (role_id, authority_id)
VALUES (UNHEX('9f8d21ee3b9b42cd8f2adf1a5f964356'),
        UNHEX('a1b2c3d4e5f6a1b2c3d4e5f6a1b2c3d4')); -- ROLE_ADMIN has READ_PRIVILEGE


