/*
INSERT INTO professors (professor_name)
VALUES ('Roxana Dogaru');

INSERT INTO professors (professor_name)
VALUES ('Marian Neagul');

INSERT INTO professors (professor_name)
VALUES ('Alexandra Fortis');

INSERT INTO professors (professor_name)
VALUES ('Florin Fortis');

INSERT INTO professors (professor_name)
VALUES ('Liviu Mafteiu-Scai');

INSERT INTO professors (professor_name)
VALUES ('Viorel Negru');

INSERT INTO professors (professor_name)
VALUES ('Florin Rosu');

INSERT INTO professors (professor_name)
VALUES ('Victoria Iordan');

INSERT INTO professors (professor_name)
VALUES ('Teodora Selea');

INSERT INTO professors (professor_name)
VALUES ('Mihai Chis');

INSERT INTO professors (professor_name)
VALUES ('Mircea Dragan');

INSERT INTO professors (professor_name)
VALUES ('Isabela Dramnesc');

INSERT INTO professors (professor_name)
VALUES ('Gabriel Iuhasz');

INSERT INTO professors (professor_name)
VALUES ('Eva Kasilk');

INSERT INTO professors (professor_name)
VALUES ('Flavia Micota');

INSERT INTO professors (professor_name)
VALUES ('Monica Sancira');

INSERT INTO professors (professor_name)
VALUES ('Daniela Zaharie');

INSERT INTO professors (professor_name)
VALUES ('Alexandra Fortis');

INSERT INTO professors (professor_name)
VALUES ('Florin Fortis');

INSERT INTO professors (professor_name)
VALUES ('Liviu Mafteiu-Scai');

INSERT INTO professors (professor_name)
VALUES ('Viorel Negru');

INSERT INTO professors (professor_name)
VALUES ('Florin Rosu');

INSERT INTO professors (professor_name)
VALUES ('Victoria Iordan');

INSERT INTO professors (professor_name)
VALUES ('Teodora Selea');

INSERT INTO professors (professor_name)
VALUES ('Mihai Chis');

INSERT INTO professors (professor_name)
VALUES ('Mircea Dragan');

INSERT INTO professors (professor_name)
VALUES ('Isabela Dramnesc');

INSERT INTO professors (professor_name)
VALUES ('Gabriel Iuhasz');

INSERT INTO professors (professor_name)
VALUES ('Oana Ivan');

INSERT INTO professors (professor_name)
VALUES ('Eva Kasilk');

INSERT INTO professors (professor_name)
VALUES ('Flavia Micota');

INSERT INTO professors (professor_name)
VALUES ('Monica Sancira');

INSERT INTO professors (professor_name)
VALUES ('Daniel Pop');

INSERT INTO courses (course_name)
VALUES ('Algebra si geometrie analitica');

INSERT INTO courses (course_name)
VALUES ('Arhitectura calculatoarelor');

INSERT INTO courses (course_name)
VALUES ('Algoritmi si structuri de date I');

INSERT INTO courses (course_name)
VALUES ('Logica computationala');

INSERT INTO courses (course_name)
VALUES ('Programare I');

INSERT INTO courses (course_name)
VALUES ('Algoritmi si structuri de date II');

INSERT INTO courses (course_name)
VALUES ('Calcul diferential si integral');

INSERT INTO courses (course_name)
VALUES ('Limbaje formale si teoria automatelor');

INSERT INTO courses (course_name)
VALUES ('Metode si practici in informatica');

INSERT INTO courses (course_name)
VALUES ('Elemente de web design');

INSERT INTO courses (course_name)
VALUES ('Programare II');

INSERT INTO courses (course_name)
VALUES ('Baze de date I');

INSERT INTO courses (course_name)
VALUES ('Programare logica');

INSERT INTO courses (course_name)
VALUES ('Structuri de date avansate');

INSERT INTO courses (course_name)
VALUES ('Programare III');

INSERT INTO courses (course_name)
VALUES ('Sisteme de operare');

INSERT INTO courses (course_name)
VALUES ('Teoria grafurilor si combinatorica');

INSERT INTO courses (course_name)
VALUES ('Baze de date II');

INSERT INTO courses (course_name)
VALUES ('Retele de calculatoare');

INSERT INTO courses (course_name)
VALUES ('Probabilitati si statistica');

INSERT INTO courses (course_name)
VALUES ('Programare functionala');

INSERT INTO courses (course_name)
VALUES ('Programare pe dispozitive modbile');

INSERT INTO courses (course_name)
VALUES ('Inginerie software');

INSERT INTO courses (course_name)
VALUES ('Algebra si geometrie analitica');

INSERT INTO courses (course_name)
VALUES ('Arhitectura calculatoarelor');

INSERT INTO courses (course_name)
VALUES ('Algoritmi si structuri de date I');

INSERT INTO courses (course_name)
VALUES ('Logica computationala');

INSERT INTO courses (course_name)
VALUES ('Programare I');

INSERT INTO courses (course_name)
VALUES ('Algoritmi si structuri de date II');

INSERT INTO courses (course_name)
VALUES ('Calcul diferential si integral');

INSERT INTO courses (course_name)
VALUES ('Limbaje formale si teoria automatelor');

INSERT INTO courses (course_name)
VALUES ('Metode si practici in informatica');

INSERT INTO courses (course_name)
VALUES ('Elemente de web design');

INSERT INTO courses (course_name)
VALUES ('Programare II');

INSERT INTO courses (course_name)
VALUES ('Baze de date I');

INSERT INTO courses (course_name)
VALUES ('Programare logica');

INSERT INTO courses (course_name)
VALUES ('Structuri de date avansate');

INSERT INTO courses (course_name)
VALUES ('Programare III');

INSERT INTO courses (course_name)
VALUES ('Sisteme de operare');

INSERT INTO courses (course_name)
VALUES ('Teoria grafurilor si combinatorica');

INSERT INTO courses (course_name)
VALUES ('Baze de date II');

INSERT INTO courses (course_name)
VALUES ('Retele de calculatoare');

INSERT INTO courses (course_name)
VALUES ('Probabilitati si statistica');

INSERT INTO courses (course_name)
VALUES ('Programare functionala');

INSERT INTO courses (course_name)
VALUES ('Programare pe dispozitive modbile');

INSERT INTO general (major, study_year)
VALUES ('Informatica Romana', 1);

INSERT INTO general (major, study_year)
VALUES ('Informatica Aplicata', 1);

INSERT INTO general (major, study_year)
VALUES ('Informatica Engleza', 1);

INSERT INTO general (major, study_year)
VALUES ('Informatica Romana', 2);

INSERT INTO general (major, study_year)
VALUES ('Informatica Aplicata', 2);

INSERT INTO general (major, study_year)
VALUES ('Informatica Engleza', 2);

INSERT INTO general (major, study_year)
VALUES ('Informatica Romana', 3);

INSERT INTO general (major, study_year)
VALUES ('Informatica Aplicata', 3);

INSERT INTO general (major, study_year)
VALUES ('Informatica Engleza', 3);

INSERT INTO students (student_name, email, password, access_level, general_id)
VALUES ('Maria Vasilescu', 'maria.vasilescu98@e-uvt.ro', 'passowrd', false, 1);

INSERT INTO students (student_name, email, password, access_level, general_id)
VALUES ('George Ionescu', 'george.ionescu97@e-uvt.ro', 'passowrd', true, 2);

INSERT INTO exams_sessions (exam_session, academic_year)
VALUES ('iarna', '2018-2019');

INSERT INTO exams_sessions (exam_session, academic_year)
VALUES ('vara', '2018-2019');

INSERT INTO exams_sessions (exam_session, academic_year)
VALUES ('toamna', '2018-2019');

INSERT INTO exams_sessions (exam_session, academic_year)
VALUES ('iarna', '2019-2020');

INSERT INTO exams_sessions (exam_session, academic_year)
VALUES ('vara', '2019-2020');

INSERT INTO exams_sessions (exam_session, academic_year)
VALUES ('toamna', '2019-2020');

INSERT INTO planning (session_id, general_id, course_id, professor_id, number_of_seats, exam_date, classroom)
VALUES (1, 3, 1, 10, 150, '2020-03-17 10:00:00', 'A02');
*/