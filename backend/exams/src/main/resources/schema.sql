/*

CREATE TABLE IF NOT EXISTS professors (
professor_id BIGSERIAL NOT NULL PRIMARY KEY,
professor_name VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS courses (
course_id BIGSERIAL NOT NULL PRIMARY KEY,
course_name VARCHAR(50) NOT NULL,
UNIQUE(course_name)
);

CREATE TABLE IF NOT EXISTS general (
general_id BIGSERIAL NOT NULL PRIMARY KEY,
major VARCHAR(50) NOT NULL,
study_year INT NOT NULL
);

CREATE TABLE IF NOT EXISTS exams_sessions (
session_id BIGSERIAL NOT NULL PRIMARY KEY,
exam_session VARCHAR(50) NOT NULL CHECK (exam_session = 'iarna' OR exam_session = 'vara' OR exam_session = 'toamna'),
academic_year VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS students (
student_id BIGSERIAL NOT NULL PRIMARY KEY,
student_name VARCHAR(50) NOT NULL,
email VARCHAR(50) NOT NULL,
password VARCHAR(50) NOT NULL,
access_level BOOLEAN,
general_id BIGINT NOT NULL REFERENCES general (general_id)
);

CREATE TABLE IF NOT EXISTS planning (
planning_id BIGSERIAL NOT NULL PRIMARY KEY,
session_id BIGINT NOT NULL REFERENCES exams_sessions (session_id),
general_id BIGINT NOT NULL REFERENCES general (general_id),
course_id BIGINT NOT NULL REFERENCES courses (course_id),
professor_id BIGINT NOT NULL REFERENCES professors (professor_id),
number_of_seats INT,
exam_date TIMESTAMP NOT NULL,
classroom VARCHAR(50) NOT NULL,
UNIQUE(exam_date)
);
*/

