PGDMP     1    1                v           shouter    10.5    10.4     n           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            o           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            p           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
             postgres    false            q           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                  postgres    false    3            �            1259    16407    ad    TABLE     �   CREATE TABLE public.ad (
    id character varying NOT NULL,
    jobtype character varying,
    description text,
    title text,
    url character varying
);
    DROP TABLE public.ad;
       public         postgres    false    3            �            1259    16417    descc    TABLE     q   CREATE TABLE public.descc (
    id bigint NOT NULL,
    key text,
    value text,
    adkey character varying
);
    DROP TABLE public.descc;
       public         postgres    false    3            �            1259    16415    desc_id_seq    SEQUENCE     t   CREATE SEQUENCE public.desc_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.desc_id_seq;
       public       postgres    false    198    3            r           0    0    desc_id_seq    SEQUENCE OWNED BY     <   ALTER SEQUENCE public.desc_id_seq OWNED BY public.descc.id;
            public       postgres    false    197            �           2604    16420    descc id    DEFAULT     c   ALTER TABLE ONLY public.descc ALTER COLUMN id SET DEFAULT nextval('public.desc_id_seq'::regclass);
 7   ALTER TABLE public.descc ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    197    198    198            �           2606    16414 
   ad ad_pkey 
   CONSTRAINT     H   ALTER TABLE ONLY public.ad
    ADD CONSTRAINT ad_pkey PRIMARY KEY (id);
 4   ALTER TABLE ONLY public.ad DROP CONSTRAINT ad_pkey;
       public         postgres    false    196            �           2606    16425    descc desc_pkey 
   CONSTRAINT     M   ALTER TABLE ONLY public.descc
    ADD CONSTRAINT desc_pkey PRIMARY KEY (id);
 9   ALTER TABLE ONLY public.descc DROP CONSTRAINT desc_pkey;
       public         postgres    false    198           