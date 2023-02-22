-- Names in SQL must begin with a letter (a-z) or underscore (_).
-- Subsequent characters in a name can be letters, digits (0-9), or underscores.

-- Dette eksemplet innholder en 1:N-forbindelse mellom entitetstypene ansatt og avdeling.

-- Sletter hele sulamitten og oppretter på nytt.
DROP SCHEMA IF EXISTS attendee CASCADE;
CREATE SCHEMA attendee;
SET search_path TO attendee;

--

CREATE TABLE attendee
(
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20) NOT NULL,
    phone VARCHAR(8) PRIMARY KEY,
    password_hash VARCHAR(200) NOT NULL,
    password_salt BYTEA NOT NULL,
    gender CHAR CHECK (gender='M' OR gender='K') NOT NULL
);

--