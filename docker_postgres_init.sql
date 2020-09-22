CREATE USER hue WITH PASSWORD 'hue' CREATEDB;
CREATE DATABASE hue
    WITH 
    OWNER = hue
    ENCODING = 'UTF8'
    LC_COLLATE = 'en_US.utf8'
    LC_CTYPE = 'en_US.utf8'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1;
