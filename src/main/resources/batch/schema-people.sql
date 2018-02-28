create table PERSON (
    id BIGINT not null primary key,
    user_name VARCHAR(20),
    age BIGINT,
    nation VARCHAR(20),
    address VARCHAR(20)
)ENGINE=InnoDB;