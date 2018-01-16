SET MODE MYSQL;

DROP TABLE IF EXISTS `classroom`;

CREATE TABLE `classroom` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `classroom` (`id`, `title`)
VALUES
	(1,'三年一班'),
	(2,'三年二班');


CREATE TABLE `student` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL DEFAULT '' COMMENT '学生姓名',
  `classroom_id` int(11) NOT NULL COMMENT '课堂id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `student` (`id`, `name`, `classroom_id`)
VALUES
	(1,'小明',1),
	(2,'小红',1),
	(3,'小亮',2),
	(4,'小白',2);



CREATE TABLE `teacher` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL DEFAULT '' COMMENT '名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `teacher` (`id`, `name`)
VALUES
	(1,'王老师'),
	(2,'李老师');


CREATE TABLE `teacher_classroom` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `teacher_id` int(11) NOT NULL,
  `classroom_id` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `teacher_classroom` (`id`, `teacher_id`, `classroom_id`)
VALUES
	(1,1,1),
	(2,1,2),
	(3,2,1),
	(4,2,2);

