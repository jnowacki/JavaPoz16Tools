create database javapoz16tools;
use javapoz16tools;

CREATE TABLE `tools` (
                       `id` INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
                       `name` VARCHAR(50) NOT NULL,
                       `type` VARCHAR(50) NOT NULL,
                       `available` BOOLEAN NOT NULL
);

insert into `tools` (`name`, `type`, `available`) values
('Stara piła', 'SAW', 0),
('Czerwony młotek', 'HAMMER', 0);

CREATE TABLE `users` (
                       `id` INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
                       `login` VARCHAR(50) NOT NULL UNIQUE,
                       `password` VARCHAR(250) NOT NULL
);

insert into `users` (`login`, `password`) values
('user1', '$2a$12$hYJ5G90y1EABpyQOnS16yuocDxQLZb6u1YUM/WKhCXrP.hQpxZSTy'),
('user2', '$2a$12$e.pVlxZjWfdhTOJbMWKEle1F.blkudK/G3rYH24u2ttYyTW2NwsP2');