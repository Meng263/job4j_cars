create schema if not exists cars;

create table if not exists cars.users
(
    id       bigserial primary key,
    email    text unique not null,
    password text        not null
);

create table if not exists cars.cars
(
    id        bigserial primary key,
    car_brand text not null,
    car_model text not null,
    body_type text not null
);

create table if not exists cars.ads
(
    id           bigserial primary key,
    description  text      not null,
    photo_link   text      not null,
    author_email text      not null references cars.users (email),
    state        text      not null default 'ACTIVE',
    car_id       bigserial not null references cars.cars (id)
);

