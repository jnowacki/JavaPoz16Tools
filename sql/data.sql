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

SELECT * FROM tools;