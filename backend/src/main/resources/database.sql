CREATE DATABASE database
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.utf8'
    LC_CTYPE = 'en_US.utf8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

CREATE SCHEMA IF NOT EXISTS schema
    AUTHORIZATION postgres;

CREATE TABLE IF NOT EXISTS schema.account
(
    id       integer NOT NULL DEFAULT nextval('schema.account_id_seq'::regclass),
    role     character varying(50) COLLATE pg_catalog."default",
    email    character varying(50) COLLATE pg_catalog."default",
    name     character varying COLLATE pg_catalog."default",
    password character varying COLLATE pg_catalog."default",
    birthday date,
    money    money,
    CONSTRAINT account_pkey PRIMARY KEY (id)
)
    TABLESPACE pg_default;

ALTER TABLE IF EXISTS schema.account
    OWNER to postgres;

