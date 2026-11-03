INSERT INTO student(student_id, student_name)
VALUES (3, 'John') ON CONFLICT (student_id) DO NOTHING;
INSERT INTO student (student_id, student_name)
VALUES (101, 'Rahul') ON CONFLICT (student_id) DO NOTHING;
INSERT INTO student (student_id, student_name)
VALUES (102, 'Priya') ON CONFLICT (student_id) DO NOTHING;