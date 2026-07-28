
CREATE TABLE classes (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(20) NOT NULL UNIQUE,
                         created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE students (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          first_name VARCHAR(50) NOT NULL,
                          last_name VARCHAR(50) NOT NULL,
                          email VARCHAR(100) NOT NULL UNIQUE,
                          class_id BIGINT,
                          created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                          CONSTRAINT fk_student_class FOREIGN KEY (class_id) REFERENCES classes(id) ON DELETE SET NULL
);


CREATE TABLE teachers (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          first_name VARCHAR(50) NOT NULL,
                          last_name VARCHAR(50) NOT NULL,
                          email VARCHAR(100) NOT NULL UNIQUE,
                          academic_title VARCHAR(30),
                          created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE subjects (
                          id BIGINT AUTO_INCREMENT PRIMARY KEY,
                          name VARCHAR(50) NOT NULL UNIQUE
);