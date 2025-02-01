# Пример аудита в Spring Data JPA
Данный проект показывает, как можно настроить аудит для любой JPA-сущности и сохранять такие метаданные как:
* кто создал запись
* дата создания
* автор последних изменений
* дата последних изменений

Всё, что для этого требуется - это добавить в нужную таблицу 4 поля и унаследовать целевую сущность от базового класса `Auditable`.

Пример таблицы с полями аудита:

```sql
create table company(
    id integer auto_increment primary key,
    name varchar not null,
    created_by varchar not null,
    created_date timestamp not null,
    updated_by varchar not null,
    updated_date timestamp not null
);
```

Пример полностью готов к работе, т.к. использует **H2** - базу данных, работающую в оперативной памяти.
При старте приложения происходит инициализация схемы БД (файл `resources/schema.sql`).

Вы без труда сможете адаптировать этот пример для работы, например, с **PostgreSQL**. При этом не нужно править код. Достаточно изменить настройки подключения в файле `application.yml`, а также добавить в зависимости `build.gradle.kts` драйвер postgres.

### Полезные ссылки
* [Аудит изменений в Spring Data JPA](https://devmark.ru/article/spring-data-audit-example).
* [Новости проекта](https://t.me/+RjrPWNUEwf8wZTMy) и короткие заметки.
* Ещё больше статей по разработке ПО вы можете найти на моём сайте [devmark.ru](https://devmark.ru/).
