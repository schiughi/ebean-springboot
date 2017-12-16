create table if not exists books(
    id bigint not null primary key,
    title varchar(100) not null,
    isbn varchar(13) not null unique,
    created_at timestamp not null default current_timestamp,
    updated_at timestamp not null default current_timestamp
);

create function set_update_time() returns opaque as '
  begin
    new.updated_at := ''now'';
    return new;
  end;
' language 'plpgsql';

create trigger update_tri before update on books for each row
  execute procedure set_update_time();
