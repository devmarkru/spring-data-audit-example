create table company(
    id integer auto_increment primary key,
    name varchar not null,
    created_by varchar not null,
    created_date timestamp not null,
    updated_by varchar not null,
    updated_date timestamp not null
);
