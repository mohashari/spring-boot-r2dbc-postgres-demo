
CREATE TABLE public.au_user (
    id bigint NOT NULL,
    name character varying(255)
);


ALTER TABLE public.au_user OWNER TO postgres;

--
-- Data for Name: au_user; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.au_user (id, name) FROM stdin;
1	muklis
2	vandra
3	jajang
\.


--
-- Name: au_user au_user_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.au_user
    ADD CONSTRAINT au_user_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--