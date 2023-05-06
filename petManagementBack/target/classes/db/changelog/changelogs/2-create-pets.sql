CREATE TABLE Pets(
    id int AUTO_INCREMENT PRIMARY KEY,
    name text(16) NOT NULL,
    code text(24) NOT NULL,
    pet_type text(20) NOT NULL,
    fur_color text(20) NOT NULL,
    country text(20) NOT NULL,
    userid INT NOT NULL,
    FOREIGN KEY (userid) REFERENCES USERS(id)
)