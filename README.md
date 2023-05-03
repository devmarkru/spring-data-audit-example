# Пример аудита в Spring Data JPA
Данный проект показывает, как можно настроить аудит для любой JPA-сущности и сохранять такие метаданные как:
* кто создал запись
* дата создания
* автор последних изменений
* дата последних изменений

Всё, что для этого требуется - это добавить в нужную таблицу 4 поля и унаследовать целевую сущность от базового класс `Auditable`.

Пример таблицы с полями аудита:

```sql
create table company
(
    id           serial constraint company_pk primary key,
    name         varchar not null,
    created_date timestamp,
    updated_date timestamp,
    created_by   varchar,
    updated_by   varchar
);
```

Ещё больше статей по разработке ПО вы можете найти на моём сайте [devmark.ru](https://devmark.ru).