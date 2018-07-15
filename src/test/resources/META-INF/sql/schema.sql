CREATE TABLE address (
    id INTEGER GENERATED BY DEFAULT AS IDENTITY (START WITH 1),
    raw_content character varying(255),
    type integer,
    client_id bigint NOT NULL
);

CREATE TABLE client (
    id INTEGER GENERATED BY DEFAULT AS IDENTITY (START WITH 1),
    birth_date timestamp without time zone
);

CREATE TABLE contact (
    id INTEGER GENERATED BY DEFAULT AS IDENTITY (START WITH 1),
    type integer NOT NULL,
    value character varying(255) NOT NULL,
    verified boolean NOT NULL,
    client_id bigint NOT NULL
);

CREATE TABLE document (
    id INTEGER GENERATED BY DEFAULT AS IDENTITY (START WITH 1),
    type integer NOT NULL,
    value character varying(255) NOT NULL,
    client_id bigint NOT NULL
);

CREATE TABLE name (
    id INTEGER GENERATED BY DEFAULT AS IDENTITY (START WITH 1),
    first character varying(255),
    last character varying(255),
    middle character varying(255),
    client_id bigint NOT NULL
);