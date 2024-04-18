INSERT INTO promo_codes(promo_id, discount_percentage)
VALUES (CAST('7d3e8918ecf74e8a9e5cf1045d2c4a19' AS BINARY(16)), 10),
       (CAST('9bf6d26b5937485896e2a3fe8e8cbf0d' AS BINARY(16)), 20),
       (CAST('38e8fb84e1fd47a0a3e19d15d0fb4cb3' AS BINARY(16)), 15),
       (CAST('5a6c46b3b5864b1884c923876e1c675d' AS BINARY(16)), 25),
       (CAST('e80f9a3151564a31b79f229f47c2d4a8' AS BINARY(16)), 30);

INSERT INTO artists(artist_id, name, role)
VALUES (CAST('e5a6d8c9b0a3f1e2d3c4b5a6d7e8f9a0' AS BINARY(16)), 'Artist1', 'BAND'),
       (CAST('1a2b3c4d5e6f7a8b9c0d1e2f3a4b5c6' AS BINARY(16)), 'Artist2', 'COMPANY'),
       (CAST('9a8b7c6d5e4f3a2b1c0d9e8f7a6b5c4' AS BINARY(16)), 'Artist3', 'DJ'),
       (CAST('f0e1d2c3b4a5b6c7d8e9f0a1b2c3d4' AS BINARY(16)), 'Artist4', 'BAND'),
       (CAST('1234567890abcdef1234567890abcdef' AS BINARY(16)), 'Artist5', 'BAND');

INSERT INTO concerts(concert_id, concert_name, country, city, address, date)
VALUES (CAST('ea7d23ec91f34b6c9692e3d1dc51d7fb' AS BINARY(16)), 'Concert1', 'USA', 'New York', '123 Broadway',
        '2024-03-10'),
       (CAST('4fd672f8fb8e4249b723aa1850be5f6d' AS BINARY(16)), 'Concert2', 'Canada', 'Toronto', '456 King St',
        '2025-06-25'),
       (CAST('31dc5fa1e7c84f0a84a91414fc7f8f69' AS BINARY(16)), 'Concert3', 'UK', 'London', '789 Oxford St',
        '2025-09-05'),
       (CAST('e4f8ed9e3c5f476d8cb75cddcf8c24d2' AS BINARY(16)), 'Concert4', 'Australia', 'Sydney', '101 George St',
         '2022-11-18'),
       (CAST('93ae1eaa65094d46b41f2a73e92d1e37' AS BINARY(16)), 'Concert5', 'Germany', 'Berlin', '202 Alexander plats',
         '2026-04-07');


INSERT INTO events(event_id, event_name, event_type, description, created_at, tickets_count)
VALUES (CAST('9aef7bfc0bfb495a97a44a2f42f7e43d' AS BINARY(16)), 'Concert1', 'SPECIAL_EVENT', 'Description for Concert1',
        NOW(), 200),
       (CAST('3e6cb2092b1b46f8b9ad3ac24c9a9df4' AS BINARY(16)), 'Concert2', 'THEATER', 'Description for Concert2',
        NOW(), 200),
       (CAST('8d36a4d0e9c24c15a0445bc356f7adfb' AS BINARY(16)), 'Concert3', 'SPECIAL_EVENT', 'Description for Concert3',
        NOW(), 200),
       (CAST('7c3cfb5bf3db4ec3942e6d0c1e678239' AS BINARY(16)), 'Concert4', 'FESTIVAL', 'Description for Concert4',
        NOW(), 200),
       (CAST('ae9c5d6fe62c4586b8c420849787d5fc' AS BINARY(16)), 'Concert5', 'SPORT', 'Description for Concert5', NOW(), 200);

INSERT INTO users(user_id, first_name, last_name, user_info, role, is_blocked, created_at)
VALUES (CAST('d0674b2978a34ac3bd6f96f5d9854a82' AS BINARY(16)), 'John', 'Doe',
        CAST('e9df4121e6834b4d9537b8a7d822e7a2' AS BINARY(16)),
        CAST('3e07e1705f2b47a0b9a7dc07936f9e4d' AS BINARY(16)), 0, NOW()),
       (CAST('a8e6c3f9bd5d499da6c8c08367627fa1' AS BINARY(16)), 'Jane', 'Smith',
        CAST('6f8202f6b9034cc789aeb332b2d23de5' AS BINARY(16)),
        CAST('9f8d21ee3b9b42cd8f2adf1a5f964356' AS BINARY(16)), 0, NOW()),
       (CAST('bcb8e69b23024ec0b99e528b9d94bb17' AS BINARY(16)), 'Alice', 'Johnson',
        CAST('7c9dca5ffea343d39e8595e5f6abf862' AS BINARY(16)),
        CAST('3e07e1705f2b47a0b9a7dc07936f9e4a' AS BINARY(16)), 1, NOW()),
       (CAST('f1b6fd6f67e44c838f4d6b176a3ff1d5' AS BINARY(16)), 'Bob', 'Brown',
        CAST('4a5e7b199ac7487d9a6ef33e2cb5b29d' AS BINARY(16)),
        CAST('16e05517895b448d84d0eb179af1db3d' AS BINARY(16)), 0, NOW()),
       (CAST('2c8abcbf2f9546a4b959bc5699b90b5c' AS BINARY(16)), 'Emma', 'Davis',
        CAST('dd4d792cf7b64153a0b2a6b8a50ef48a' AS BINARY(16)),
        CAST('c88f636f66354e8eb3d76b3f207d4e1c' AS BINARY(16)), 1, NOW());

INSERT INTO user_info(user_info_id, username, user_id, country, city, password, email, phone_number, card_number)
VALUES (CAST('e9df4121e6834b4d9537b8a7d822e7a2' AS BINARY(16)), 'john_doe',
        CAST('d0674b2978a34ac3bd6f96f5d9854a82' AS BINARY(16)), 'USA',
        'New York', 'password123', 'john@example.com',
        '123-456-7890', '1234-5678-9012-3456'),
       (CAST('6f8202f6b9034cc789aeb332b2d23de5' AS BINARY(16)), 'jane_smith',
        CAST('a8e6c3f9bd5d499da6c8c08367627fa1' AS BINARY(16)), 'Canada',
        'Toronto', 'qwerty456', 'jane@example.com',
        '987-654-3210', '9876-5432-1098-7654'),
       (CAST('7c9dca5ffea343d39e8595e5f6abf862' AS BINARY(16)), 'alice_johnson',
        CAST('bcb8e69b23024ec0b99e528b9d94bb17' AS BINARY(16)), 'UK',
        'London', 'myp@ssw0rd', 'alice@example.com',
        '456-789-0123', '4567-8901-2345-6789'),
       (CAST('4a5e7b199ac7487d9a6ef33e2cb5b29d' AS BINARY(16)), 'bob_brown',
        CAST('f1b6fd6f67e44c838f4d6b176a3ff1d5' AS BINARY(16)), 'Australia',
        'Sydney', 'securepass', 'bob@example.com',
        '789-012-3456', '7890-1234-5678-9012'),
       (CAST('dd4d792cf7b64153a0b2a6b8a50ef48a' AS BINARY(16)), 'emma_davis',
        CAST('2c8abcbf2f9546a4b959bc5699b90b5c' AS BINARY(16)), 'Germany',
        'Berlin', 'pass1234', 'emma@example.com',
        '012-345-6789', '0123-4567-8901-2345');

INSERT INTO tickets(ticket_id, event_id, user_id, price, service_payments, area_type, has_bought, created_at)
VALUES (CAST('d3e837b4e07c4a9baa17c1777e12d850' AS BINARY(16)), CAST('9aef7bfc0bfb495a97a44a2f42f7e43d' AS BINARY(16)),
        CAST('d0674b2978a34ac3bd6f96f5d9854a82' AS BINARY(16)), 50.00, 5.00, 'VIP', 1, NOW()),
       (CAST('b507b72c49b94b1098f5eac4d30ac9a5' AS BINARY(16)), CAST('3e6cb2092b1b46f8b9ad3ac24c9a9df4' AS BINARY(16)),
        CAST('a8e6c3f9bd5d499da6c8c08367627fa1' AS BINARY(16)), 30.00, 3.00, 'SEAT', 1, NOW()),
       (CAST('1a4fe3d4cf7a49e39c8e13d93e089fc9' AS BINARY(16)), CAST('8d36a4d0e9c24c15a0445bc356f7adfb' AS BINARY(16)),
        CAST('bcb8e69b23024ec0b99e528b9d94bb17' AS BINARY(16)), 20.00, 2.00, 'STANDING_AREA', 1, NOW()),
       (CAST('6f0f7dd005ed40c59f315ef41a2f0fb7' AS BINARY(16)), CAST('7c3cfb5bf3db4ec3942e6d0c1e678239' AS BINARY(16)),
        CAST('f1b6fd6f67e44c838f4d6b176a3ff1d5' AS BINARY(16)), 40.00, 4.00, 'VIP', 1, NOW()),
       (CAST('c94c7604f9c14d14b99ed2799a44bb4a' AS BINARY(16)), CAST('ae9c5d6fe62c4586b8c420849787d5fc' AS BINARY(16)),
        CAST('2c8abcbf2f9546a4b959bc5699b90b5c' AS BINARY(16)), 25.00, 2.50, 'DANCE_FLOOR', 1, NOW());


INSERT INTO orders(order_id, client_id, order_cost, promo_code, payment_method, currency_code,
                   created_at)
VALUES (CAST('70f8a1dc8f914f24bc3aa9bb29292482' AS BINARY(16)),
        CAST('d0674b2978a34ac3bd6f96f5d9854a82' AS BINARY(16)),
        100.00,
        CAST('7d3e8918ecf74e8a9e5cf1045d2c4a19' AS BINARY(16)), 'CREDIT_CARD',
        'EUR', NOW()),
       (CAST('e4b4f7aaefa740c08e63a3fbc5c8a0c7' AS BINARY(16)),
        CAST('a8e6c3f9bd5d499da6c8c08367627fa1' AS BINARY(16)),
        50.00,
        CAST('9bf6d26b5937485896e2a3fe8e8cbf0d' AS BINARY(16)), 'PAYPAL', 'USD',
        NOW()),
       (CAST('dd77d18ae178490d8a4b6d3c747d469f' AS BINARY(16)),
        CAST('bcb8e69b23024ec0b99e528b9d94bb17' AS BINARY(16)),
        75.00, NULL, 'CREDIT_CARD', 'UA', NOW()),
       (CAST('8a0cbb1c1b6f47a6b92125382c7f4fd1' AS BINARY(16)),
        CAST('f1b6fd6f67e44c838f4d6b176a3ff1d5' AS BINARY(16)),
        120.00, NULL, 'PAYPAL', 'USD', NOW()),
       (CAST('eb7c2ab3e99941569ee2b3b08b646e5a' AS BINARY(16)),
        CAST('2c8abcbf2f9546a4b959bc5699b90b5c' AS BINARY(16)),
        90.00,
        CAST('e80f9a3151564a31b79f229f47c2d4a8' AS BINARY(16)), 'PAYPAL', 'EUR',
        NOW());

-- Вставка ролей
INSERT INTO roles (role_id, role_name)
VALUES (CAST('fff35a5d92e54fcfbbcb89a4e03dd75f' AS BINARY(16)), 'ROLE_USER'),
       (CAST('a2e801b4fbc647a3b8c5fc13a7b5d8ed' AS BINARY(16)), 'ROLE_ADMIN'),
       (CAST('6d4f9a05e9d84ed48918efb4938c15e3' AS BINARY(16)), 'ROLE_ADMIN'),
       (CAST('21cdaa4378424e01bc32f13134dc0ae7' AS BINARY(16)), 'ROLE_ADMIN'),
       (CAST('da8932a275d24e9fb47861d8b18d20d9' AS BINARY(16)), 'ROLE_ADMIN');

-- Вставка прав
INSERT INTO authorities (authority_id, authority_name)
VALUES (CAST('1c88f636f66354e8eb3d76b3f207d4e1' AS BINARY(16)), 'READ_PRIVILEGE'),
       (CAST('16e05517895b448d84d0eb179af1db3d' AS BINARY(16)), 'WRITE_PRIVILEGE'),
       (CAST('9f8d21ee3b9b42cd8f2adf1a5f964356' AS BINARY(16)), 'WRITE_PRIVILEGE'),
       (CAST('13c585908dbb4f24b47a9230271d7b12' AS BINARY(16)), 'WRITE_PRIVILEGE'),
       (CAST('a1b2c3d4e5f6a1b2c3d4e5f6a1b2c3d4' AS BINARY(16)), 'WRITE_PRIVILEGE');

-- Связывание пользователей и ролей
INSERT INTO user_role (user_id, role_id)
VALUES (CAST('d0674b2978a34ac3bd6f96f5d9854a82' AS BINARY(16)), CAST('fff35a5d92e54fcfbbcb89a4e03dd75f' AS BINARY(16))),
       (CAST('a8e6c3f9bd5d499da6c8c08367627fa1' AS BINARY(16)), CAST('a2e801b4fbc647a3b8c5fc13a7b5d8ed' AS BINARY(16))),
       (CAST('bcb8e69b23024ec0b99e528b9d94bb17' AS BINARY(16)), CAST('6d4f9a05e9d84ed48918efb4938c15e3' AS BINARY(16))),
       (CAST('f1b6fd6f67e44c838f4d6b176a3ff1d5' AS BINARY(16)), CAST('21cdaa4378424e01bc32f13134dc0ae7' AS BINARY(16))),
       (CAST('2c8abcbf2f9546a4b959bc5699b90b5c' AS BINARY(16)), CAST('da8932a275d24e9fb47861d8b18d20d9' AS BINARY(16)));
-- admin is a ROLE_ADMIN

-- Связывание ролей и прав
INSERT INTO role_authority (role_id, authority_id)
VALUES (CAST('fff35a5d92e54fcfbbcb89a4e03dd75f' AS BINARY(16)),
        CAST('1c88f636f66354e8eb3d76b3f207d4e1' AS BINARY(16))), -- ROLE_USER has READ_PRIVILEGE
       (CAST('a2e801b4fbc647a3b8c5fc13a7b5d8ed' AS BINARY(16)),
        CAST('16e05517895b448d84d0eb179af1db3d' AS BINARY(16))), -- ROLE_ADMIN has READ_PRIVILEGE
       (CAST('6d4f9a05e9d84ed48918efb4938c15e3' AS BINARY(16)),
        CAST('9f8d21ee3b9b42cd8f2adf1a5f964356' AS BINARY(16))), -- ROLE_ADMIN has READ_PRIVILEGE
       (CAST('21cdaa4378424e01bc32f13134dc0ae7' AS BINARY(16)),
        CAST('13c585908dbb4f24b47a9230271d7b12' AS BINARY(16))), -- ROLE_ADMIN has READ_PRIVILEGE
       (CAST('da8932a275d24e9fb47861d8b18d20d9' AS BINARY(16)),
        CAST('a1b2c3d4e5f6a1b2c3d4e5f6a1b2c3d4' AS BINARY(16))); -- ROLE_ADMIN has READ_PRIVILEGE