drop database if exists user_center;
create database user_center;

USE `user_center`;

-- -----------------------------------------------------
-- Table `user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `user` (
  `user_id` INT NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `wx_id` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '微信id',
  `wx_nickname` VARCHAR(64) NOT NULL DEFAULT '' COMMENT '微信昵称',
  `user_roles` VARCHAR(100) NOT NULL DEFAULT '' COMMENT '角色',
  `user_avatar_url` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '头像地址',
  `user_create_time` DATETIME NOT NULL COMMENT '创建时间',
  `user_update_time` DATETIME NOT NULL COMMENT '修改时间',
  `user_bonus` INT NOT NULL DEFAULT 300 COMMENT '积分',
  PRIMARY KEY (`user_id`))ENGINE = InnoDB DEFAULT CHARSET=utf8 COMMENT = '分享';

insert into `user`(wx_id, wx_nickname,user_roles,user_avatar_url,user_create_time,user_update_time,user_bonus)
    values('wei001','大木1','管理员','http://heads1.jpg',now(),now(),10);
insert into `user`(wx_id, wx_nickname,user_roles,user_avatar_url,user_create_time,user_update_time,user_bonus)
    values('wei002','小木','用户','http://heads2.jpg',now(),now(),20);
select * from `user`;
-- -----------------------------------------------------
-- Table `bonus_event_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `bonus_event_log` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT 'Id',
  `user_id` INT NULL COMMENT 'user.id',
  `value` INT NULL COMMENT '积分操作值',
  `event` VARCHAR(20) NULL COMMENT '发生的事件',
  `create_time` DATETIME NULL COMMENT '创建时间',
  `description` VARCHAR(100) NULL COMMENT '描述',
  PRIMARY KEY (`id`),
  INDEX `fk_bonus_event_log_user1_idx` (`user_id` ASC) )
ENGINE = InnoDB
COMMENT = '积分变更记录表';