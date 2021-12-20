CREATE TABLE IF NOT EXISTS `user`
(
    `id`      INT NOT NULL,
    `UserName` VARCHAR(40),
PRIMARY KEY(`id`)
);

CREATE TABLE IF NOT EXISTS `game`
(
    `id`      INT NOT NULL,
    `GameName` VARCHAR(30),
    PRIMARY KEY(`id`)
);

