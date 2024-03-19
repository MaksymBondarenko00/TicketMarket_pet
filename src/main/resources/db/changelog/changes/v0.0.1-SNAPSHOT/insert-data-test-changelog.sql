-- liquibase formatted sql

-- changeset 6ezdar:1
insert into promo_codes(promo_id, discount_percentage)
values (UNHEX('7d3e8918ecf74e8a9e5cf1045d2c4a19'), 10),
       (UNHEX('9bf6d26b5937485896e2a3fe8e8cbf0d'), 20),
       (UNHEX('38e8fb84e1fd47a0a3e19d15d0fb4cb3'), 15),
       (UNHEX('5a6c46b3b5864b1884c923876e1c675d'), 25),
       (UNHEX('e80f9a3151564a31b79f229f47c2d4a8'), 30);

insert into artists(artist_id, name, role)
values (UNHEX('e5a6d8c9b0a3f1e2d3c4b5a6d7e8f9a0'), 'Artist1', 'Singer'),
       (UNHEX('1a2b3c4d5e6f7a8b9c0d1e2f3a4b5c6'), 'Artist2', 'Guitarist'),
       (UNHEX('9a8b7c6d5e4f3a2b1c0d9e8f7a6b5c4'), 'Artist3', 'Pianist'),
       (UNHEX('f0e1d2c3b4a5b6c7d8e9f0a1b2c3d4'), 'Artist4', 'Drummer'),
       (UNHEX('1234567890abcdef1234567890abcdef'), 'Artist5', 'Violinist');

insert into concerts(concert_id, concerts.concert_name, list_of_artist, concert_dates, country, city, address,
                     tickets_count)
values (UNHEX('ea7d23ec91f34b6c9692e3d1dc51d7fb'), 'Concert1', 'Artist1, Artist2', '2024-04-15', 'USA', 'New York',
        '123 Broadway', 1000),
       (UNHEX('4fd672f8fb8e4249b723aa1850be5f6d'), 'Concert2', 'Artist3, Artist4', '2024-05-20', 'Canada', 'Toronto',
        '456 King St', 800),
       (UNHEX('31dc5fa1e7c84f0a84a91414fc7f8f69'), 'Concert3', 'Artist5, Artist6', '2024-06-10', 'UK', 'London',
        '789 Oxford St', 1200),
       (UNHEX('e4f8ed9e3c5f476d8cb75cddcf8c24d2'), 'Concert4', 'Artist7, Artist8', '2024-07-05', 'Australia', 'Sydney',
        '101 George St', 1500),
       (UNHEX('93ae1eaa65094d46b41f2a73e92d1e37'), 'Concert5', 'Artist9, Artist10', '2024-08-15', 'Germany', 'Berlin',
        '202 Alexanderplatz', 900);

insert into events(event_id, event_name, list_of_concert, description, created_at)
values (UNHEX('9aef7bfc0bfb495a97a44a2f42f7e43d'), 'Concert1', 'Artist1, Artist2', 'Description for Concert1', NOW()),
       (UNHEX('3e6cb2092b1b46f8b9ad3ac24c9a9df4'), 'Concert2', 'Artist3, Artist4', 'Description for Concert2', NOW()),
       (UNHEX('8d36a4d0e9c24c15a0445bc356f7adfb'), 'Concert3', 'Artist5, Artist6', 'Description for Concert3', NOW()),
       (UNHEX('7c3cfb5bf3db4ec3942e6d0c1e678239'), 'Concert4', 'Artist7, Artist8', 'Description for Concert4', NOW()),
       (UNHEX('ae9c5d6fe62c4586b8c420849787d5fc'), 'Concert5', 'Artist9, Artist10', 'Description for Concert5', NOW());

insert into users(user_id, first_name, last_name, user_tickets_id, user_orders, user_info, role, is_blocked, created_at)
values (UNHEX('d0674b2978a34ac3bd6f96f5d9854a82'), 'John', 'Doe', 101, 5, 'Test user 1 info', 'customer', 0, NOW()),
       (UNHEX('a8e6c3f9bd5d499da6c8c08367627fa1'), 'Jane', 'Smith', 102, 8, 'Test user 2 info', 'customer', 0, NOW()),
       (UNHEX('bcb8e69b23024ec0b99e528b9d94bb17'), 'Alice', 'Johnson', 103, 3, 'Test user 3 info', 'customer', 0,
        NOW()),
       (UNHEX('f1b6fd6f67e44c838f4d6b176a3ff1d5'), 'Bob', 'Brown', 104, 7, 'Test user 4 info', 'admin', 0, NOW()),
       (UNHEX('2c8abcbf2f9546a4b959bc5699b90b5c'), 'Emma', 'Davis', 105, 6, 'Test user 5 info', 'customer', 1, NOW());

insert into user_info(user_info_id, username, user_id, country, city, password, email, phone_number, card_number)
values (UNHEX('e9df4121e6834b4d9537b8a7d822e7a2'), 'john_doe', UNHEX('d0674b2978a34ac3bd6f96f5d9854a82'), 'USA',
        'New York', 'password123', 'john@example.com',
        '123-456-7890', '1234-5678-9012-3456'),
       (UNHEX('6f8202f6b9034cc789aeb332b2d23de5'), 'jane_smith', UNHEX('a8e6c3f9bd5d499da6c8c08367627fa1'), 'Canada',
        'Toronto', 'qwerty456', 'jane@example.com',
        '987-654-3210', '9876-5432-1098-7654'),
       (UNHEX('7c9dca5ffea343d39e8595e5f6abf862'), 'alice_johnson', UNHEX('bcb8e69b23024ec0b99e528b9d94bb17'), 'UK',
        'London', 'myp@ssw0rd', 'alice@example.com',
        '456-789-0123', '4567-8901-2345-6789'),
       (UNHEX('4a5e7b199ac7487d9a6ef33e2cb5b29d'), 'bob_brown', UNHEX('f1b6fd6f67e44c838f4d6b176a3ff1d5'), 'Australia',
        'Sydney', 'securepass', 'bob@example.com',
        '789-012-3456', '7890-1234-5678-9012'),
       (UNHEX('dd4d792cf7b64153a0b2a6b8a50ef48a'), 'emma_davis', UNHEX('2c8abcbf2f9546a4b959bc5699b90b5c'), 'Germany',
        'Berlin', 'pass1234', 'emma@example.com',
        '012-345-6789', '0123-4567-8901-2345');

insert into tickets(ticket_id, event_id, user_id, price, service_payments, area_type, has_bought, created_at)
values (UNHEX('d3e837b4e07c4a9baa17c1777e12d850'), 101, 1, 50.00, 5.00, 'VIP', 1, NOW()),
       (UNHEX('b507b72c49b94b1098f5eac4d30ac9a5'), 102, 2, 30.00, 3.00, 'General', 1, NOW()),
       (UNHEX('1a4fe3d4cf7a49e39c8e13d93e089fc9'), 103, 3, 20.00, 2.00, 'General', 1, NOW()),
       (UNHEX('6f0f7dd005ed40c59f315ef41a2f0fb7'), 104, 4, 40.00, 4.00, 'VIP', 1, NOW()),
       (UNHEX('c94c7604f9c14d14b99ed2799a44bb4a'), 105, 5, 25.00, 2.50, 'General', 1, NOW());


insert into orders(order_id, client_id, order_cost, selected_tickets, promo_code, payment_method, currency_code,
                   created_at)
values (UNHEX('70f8a1dc8f914f24bc3aa9bb29292482'), 1, 100.00, 'Ticket1, Ticket2', NULL, 'Credit Card', 'EUR', NOW()),
       (UNHEX('e4b4f7aaefa740c08e63a3fbc5c8a0c7'), 2, 50.00, 'Ticket3', 'PROMO001', 'PayPal', 'USD', NOW()),
       (UNHEX('dd77d18ae178490d8a4b6d3c747d469f'), 3, 75.00, 'Ticket4, Ticket5', NULL, 'Credit Card', 'UA', NOW()),
       (UNHEX('8a0cbb1c1b6f47a6b92125382c7f4fd1'), 4, 120.00, 'Ticket6', 'PROMO002', 'Credit Card', 'USD', NOW()),
       (UNHEX('eb7c2ab3e99941569ee2b3b08b646e5a'), 5, 90.00, 'Ticket7, Ticket8', 'PROMO003', 'PayPal', 'EUR', NOW());



