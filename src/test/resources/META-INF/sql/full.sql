--
-- PostgreSQL database dump
--

-- Dumped from database version 9.6.8
-- Dumped by pg_dump version 10.4 (Ubuntu 10.4-0ubuntu0.18.04)

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: address; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.address (
    id bigint NOT NULL,
    raw_content character varying(255),
    type integer,
    client_id bigint NOT NULL
);


ALTER TABLE public.address OWNER TO root;

--
-- Name: client; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.client (
    id bigint NOT NULL,
    birth_date timestamp without time zone
);


ALTER TABLE public.client OWNER TO root;

--
-- Name: contact; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.contact (
    id bigint NOT NULL,
    type integer NOT NULL,
    value character varying(255) NOT NULL,
    verified boolean NOT NULL,
    client_id bigint NOT NULL
);


ALTER TABLE public.contact OWNER TO root;

--
-- Name: document; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.document (
    id bigint NOT NULL,
    type integer NOT NULL,
    value character varying(255) NOT NULL,
    client_id bigint NOT NULL
);


ALTER TABLE public.document OWNER TO root;

--
-- Name: hibernate_sequence; Type: SEQUENCE; Schema: public; Owner: root
--

CREATE SEQUENCE public.hibernate_sequence
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.hibernate_sequence OWNER TO root;

--
-- Name: name; Type: TABLE; Schema: public; Owner: root
--

CREATE TABLE public.name (
    id bigint NOT NULL,
    first character varying(255),
    last character varying(255),
    middle character varying(255),
    client_id bigint NOT NULL
);


ALTER TABLE public.name OWNER TO root;

--
-- Data for Name: address; Type: TABLE DATA; Schema: public; Owner: root
--

COPY public.address (id, raw_content, type, client_id) FROM stdin;
\.


--
-- Data for Name: client; Type: TABLE DATA; Schema: public; Owner: root
--

COPY public.client (id, birth_date) FROM stdin;
1	\N
3	\N
\.


--
-- Data for Name: contact; Type: TABLE DATA; Schema: public; Owner: root
--

COPY public.contact (id, type, value, verified, client_id) FROM stdin;
\.


--
-- Data for Name: document; Type: TABLE DATA; Schema: public; Owner: root
--

COPY public.document (id, type, value, client_id) FROM stdin;
\.


--
-- Data for Name: name; Type: TABLE DATA; Schema: public; Owner: root
--

COPY public.name (id, first, last, middle, client_id) FROM stdin;
2	Sergey	Ivanov	\N	1
4	Sergey	Ivanov	\N	3
\.


--
-- Name: hibernate_sequence; Type: SEQUENCE SET; Schema: public; Owner: root
--

SELECT pg_catalog.setval('public.hibernate_sequence', 4, true);


--
-- Name: address address_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.address
    ADD CONSTRAINT address_pkey PRIMARY KEY (id);


--
-- Name: client client_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.client
    ADD CONSTRAINT client_pkey PRIMARY KEY (id);


--
-- Name: contact contact_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.contact
    ADD CONSTRAINT contact_pkey PRIMARY KEY (id);


--
-- Name: document document_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.document
    ADD CONSTRAINT document_pkey PRIMARY KEY (id);


--
-- Name: name name_pkey; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.name
    ADD CONSTRAINT name_pkey PRIMARY KEY (id);


--
-- Name: document uk_8wfw7payagsj1nq2cohq063cu; Type: CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.document
    ADD CONSTRAINT uk_8wfw7payagsj1nq2cohq063cu UNIQUE (value);


--
-- Name: document fk4wiqnj5twgx3pup933cy9yybd; Type: FK CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.document
    ADD CONSTRAINT fk4wiqnj5twgx3pup933cy9yybd FOREIGN KEY (client_id) REFERENCES public.client(id);


--
-- Name: address fk7156ty2o5atyuy9f6kuup9dna; Type: FK CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.address
    ADD CONSTRAINT fk7156ty2o5atyuy9f6kuup9dna FOREIGN KEY (client_id) REFERENCES public.client(id);


--
-- Name: name fkox97exoqeo4ha8pj909mdfyau; Type: FK CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.name
    ADD CONSTRAINT fkox97exoqeo4ha8pj909mdfyau FOREIGN KEY (client_id) REFERENCES public.client(id);


--
-- Name: contact fkt0lxtgfimywi23cewqbmgdu62; Type: FK CONSTRAINT; Schema: public; Owner: root
--

ALTER TABLE ONLY public.contact
    ADD CONSTRAINT fkt0lxtgfimywi23cewqbmgdu62 FOREIGN KEY (client_id) REFERENCES public.client(id);


--
-- PostgreSQL database dump complete
--

