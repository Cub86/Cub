CREATE DATABASE IF NOT EXISTS `shop` DEFAULT CHARACTER SET utf8 ;

USE `shop`;

CREATE TABLE `shop`.`categories` (
  `category_id` INT(5) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) CHARACTER SET 'utf8' NULL,
  PRIMARY KEY (`category_id`));
  
INSERT INTO categories (name) 
VALUES ('ALL'), ('VIDEOCARD'), ('CPU'), ('MOTHERBOARD'),
	   ('MEMORY'), ('HDD'), ('POWER'), ('SOUNDCARD');

CREATE TABLE `shop`.`items` (
  `item_id` INT(5) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(100) NOT NULL,
  `cost` DECIMAL(10,2) NOT NULL DEFAULT 0.0,
  `rank` INT(2) NULL DEFAULT 0,
  `category_id` INT(5) NOT NULL,
  PRIMARY KEY (`item_id`),
  INDEX `category_id_idx` (`category_id` ASC),
  CONSTRAINT `category_id` 
	FOREIGN KEY (`category_id`) 
    REFERENCES `shop`.`categories` (`category_id`)
    ON DELETE NO ACTION 
    ON UPDATE NO ACTION)
DEFAULT CHARACTER SET = utf8;
    
CREATE TABLE `shop`.`users` (
  `user_id` INT(5) NOT NULL AUTO_INCREMENT,
  `login` VARCHAR(20) NOT NULL,
  `password` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX `login_UNIQUE` (`login` ASC))
DEFAULT CHARACTER SET = utf8;

INSERT INTO users (login, password) 
VALUES ('hohlov', '12345');

CREATE TABLE `shop`.`buckets` (
  `user_id` INT(5) NOT NULL,
  `item_id` INT(5) NOT NULL,
  `quantity` INT(100) NOT NULL DEFAULT 1,
  INDEX `user_id_idx` (`user_id` ASC),
  INDEX `item_id_idx` (`item_id` ASC),
  CONSTRAINT `user_id`
    FOREIGN KEY (`user_id`)
    REFERENCES `shop`.`users` (`user_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `item_id`
    FOREIGN KEY (`item_id`)
    REFERENCES `shop`.`items` (`item_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
DEFAULT CHARACTER SET = utf8;

INSERT INTO items (name, cost, rank, category_id) 
VALUES ('Gigabyte GeForce GTX 1060 Windforce OC 3G 1797MHz', 12232.0, 5, 2), 14300.0, 7, 2),
       ('Asus GeForce GTX 1070 OC ROG Strix 1657MHz', 20163.0, 8, 2),
       ('Intel Core i7-7700K Kaby Lake-S 4200Mhz', 10298.0, 9, 3),
       ('AMD Ryzen 5 1400 Summit Ridge 3200Mhz', 4900.0, 6, 3),3),
       ('Asus Prime B350-Plus', 2969.0, 5, 4),
       ('ASRock N68-GS4 FX', 1128.0, 6, 4),
       ('Gigabyte GA-990X-Gaming SLI', 2879.0, 3, 4),
       ('Kingston KVR16N11S8/4', 883.0, 4, 5),
       ('Kingston HX421C14FB/8', 2044.0, 6, 5),
       ('Team Group TED48G2133C1501', 1670.0, 7, 5),
       ('Team Group TED44G2133C1501', 907.0, 3, 5),
       ('Western Digital Caviar Blue 1 TB', 1354.0, 4, 6),
       ('Samsung 750 Evo 120 GB (MZ750120BW)', 1740.0, 3, 6),
       ('Seagate DB35 160 GB (ST3160212ACE)', 242.0, 2, 6),
       ('Toshiba 1 TB (DT01ACA100)', 1234.0, 5, 6),
       ('Seagate Barracuda 1 TB (ST1000DM010)', 1349.0, 7, 6),
       ('Western Digital Blue 1 TB (WD10JPVX)', 1528.0, 3, 6),
       ('Chieftec CPS-750S 750W', 2509.0, 3, 7),       
       ('Asus Xonar DGX (90-YAA0Q0-0UAN0BZ)', 1077.0, 6, 8),
       ('Creative SB ZXR 5.1', 5798.0, 8, 8),
       ('Creative SB Play! 2 (SB1620)', 872.0, 6, 8),, 8),
       ('Asus Xonar H6', 988.0, 3, 8),
       ('Creative X-Fi Titanium HD (SB1270)', 4783.0, 7, 8);

INSERT INTO buckets (user_id, item_id)
VALUES (1, 108), (1, 15), (1, 99), (1, 139), (1, 56), (1, 63), (1, 35);