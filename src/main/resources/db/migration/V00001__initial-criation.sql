-- Table: public.vehicle

-- DROP TABLE public.vehicle;

CREATE TABLE public.vehicle
(
    vehicle_id bigint generated always as identity NOT NULL,
    vehicle_advertising_price real NOT NULL,
    vehicle_fipe_price real,
    vehicle_license_plate character varying(255) COLLATE pg_catalog."default" NOT NULL,
    vehicle_register_date timestamp without time zone,
    vehicle_year bigint NOT NULL,
    CONSTRAINT vehicle_pkey PRIMARY KEY (vehicle_id)
)

    TABLESPACE pg_default;

ALTER TABLE public.vehicle
    OWNER to postgres;

-- Table: public.brand

-- DROP TABLE public.brand;

CREATE TABLE public.brand
(
    brand_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    brand_fipe_id real,
    brand_name character varying(255) COLLATE pg_catalog."default",
    vehicle_fk bigint,
    CONSTRAINT brand_pkey PRIMARY KEY (brand_id),
    CONSTRAINT fk7a850m5ck17h7ey6n4q85py1s FOREIGN KEY (vehicle_fk)
        REFERENCES public.vehicle (vehicle_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

    TABLESPACE pg_default;

ALTER TABLE public.brand
    OWNER to postgres;

-- Table: public.vehicle_model

-- DROP TABLE public.vehicle_model;

CREATE TABLE public.vehicle_model
(
    vehicle_model_id character varying(255) COLLATE pg_catalog."default" NOT NULL,
    vehicle_model_fipe_id real,
    vehicle_model_name character varying(255) COLLATE pg_catalog."default",
    brand_fk character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT vehicle_model_pkey PRIMARY KEY (vehicle_model_id),
    CONSTRAINT fk8yood7blkr1trocsjj2q2xqo5 FOREIGN KEY (brand_fk)
        REFERENCES public.brand (brand_id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

    TABLESPACE pg_default;

ALTER TABLE public.vehicle_model
    OWNER to postgres;