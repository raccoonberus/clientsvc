CREATE TABLE address (
    id INTEGER IDENTITY PRIMARY KEY,
    raw_content character varying(255),
    type integer,
    client_id bigint NOT NULL
);

CREATE TABLE client (
    id INTEGER IDENTITY PRIMARY KEY,
    birth_date timestamp without time zone
);

CREATE TABLE contact (
    id INTEGER IDENTITY PRIMARY KEY,
    type integer NOT NULL,
    value character varying(255) NOT NULL,
    verified boolean NOT NULL,
    client_id bigint NOT NULL
);

CREATE TABLE document (
    id INTEGER IDENTITY PRIMARY KEY,
    type integer NOT NULL,
    value character varying(255) NOT NULL,
    client_id bigint NOT NULL
);

CREATE TABLE name (
    id INTEGER IDENTITY PRIMARY KEY,
    first character varying(255),
    last character varying(255),
    middle character varying(255),
    client_id bigint NOT NULL
);