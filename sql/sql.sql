
create table `class654`.`order` ( 
`id` INT NOT NULL,
`item`VARCHAR(100) NOT NULL,
`toppings` VARCHAR(50) NULL,
`size` CHAR(1), -- S, M , L
`price` DECIMAL NOT NULL, 
PRIMARY KEY (`id`),
UNIQUE INDEX `order_id_UNIQUE` (`id` ASC) VISIBLE);

