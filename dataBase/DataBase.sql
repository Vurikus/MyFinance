CREATE TABLE public.category
    (
    category_ID integer not null,
    category_name varchar (20) not null,
    category_profit boolean not null
    CONSTRAINT category_pkey PRIMARY KEY (category_ID),

    );

INSERT INTO category (cat_id, cat_name, cat_profit) VALUES (1, home, false);
