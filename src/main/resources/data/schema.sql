CREATE TABLE IF NOT EXISTS `spring`.`users` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(100) NOT NULL,
    `password` VARCHAR(100) NOT NULL,
    `enabled` INT NOT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `spring`.`authorities` (
    `id` INT NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(100) NOT NULL,
    `authority` VARCHAR(100) NOT NULL,
    PRIMARY KEY (`id`)
);