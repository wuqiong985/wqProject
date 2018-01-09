/*
SQLyog  v12.2.6 (64 bit)
MySQL - 5.7.20-log 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `examstudent` (
	`flow_id` int (11),
	`Type` int (11),
	`id_card` varchar (60),
	`exam_card` varchar (60),
	`student_name` varchar (60),
	`Location` varchar (60),
	`Grade` int (11)
); 
insert into `examstudent` (`flow_id`, `Type`, `id_card`, `exam_card`, `student_name`, `Location`, `Grade`) values('1','4','2111212121212121','19970909','ABCD','Dalian','91');
insert into `examstudent` (`flow_id`, `Type`, `id_card`, `exam_card`, `student_name`, `Location`, `Grade`) values('2','6','123164648975615','19980909','Jerry','BeiJing','90');
insert into `examstudent` (`flow_id`, `Type`, `id_card`, `exam_card`, `student_name`, `Location`, `Grade`) values('3','6','564613164612156','19901212','Wang','PanJin','60');
insert into `examstudent` (`flow_id`, `Type`, `id_card`, `exam_card`, `student_name`, `Location`, `Grade`) values('4','4','12345123456','12341234','良药了','广西','99');
