CREATE TABLE `test_demo` (
  `task_id` decimal(20,0) NOT NULL COMMENT '任务主键',
  `task_name` varchar(1000) DEFAULT NULL COMMENT '任务名称',
  PRIMARY KEY (`TASK_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;