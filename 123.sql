/*
SQLyog v10.2 
MySQL - 5.7.20-log : Database - crm
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`crm` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `crm`;

/*Table structure for table `curriculum` */

DROP TABLE IF EXISTS `curriculum`;

CREATE TABLE `curriculum` (
  `curriculum_ID` int(11) NOT NULL,
  `curriculum_name` varchar(30) NOT NULL,
  PRIMARY KEY (`curriculum_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `curriculum` */

insert  into `curriculum`(`curriculum_ID`,`curriculum_name`) values (1,'高等数学'),(2,'大学物理'),(3,'c语言'),(4,'java高级实训'),(5,'Spring源码解析'),(6,'计算机组成员原理');

/*Table structure for table `score` */

DROP TABLE IF EXISTS `score`;

CREATE TABLE `score` (
  `stu_id` int(100) DEFAULT NULL,
  `score` int(100) DEFAULT NULL,
  `curriculum_ID` int(11) DEFAULT NULL,
  KEY `stu_id` (`stu_id`),
  KEY `curriculum_ID` (`curriculum_ID`),
  CONSTRAINT `score_ibfk_1` FOREIGN KEY (`stu_id`) REFERENCES `student` (`stu_id`),
  CONSTRAINT `score_ibfk_2` FOREIGN KEY (`curriculum_ID`) REFERENCES `curriculum` (`curriculum_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `score` */

insert  into `score`(`stu_id`,`score`,`curriculum_ID`) values (404,100,2);

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `name` varchar(50) NOT NULL,
  `sex` int(10) NOT NULL,
  `phone` varchar(20) NOT NULL,
  `stu_id` int(100) NOT NULL AUTO_INCREMENT,
  `status` int(10) NOT NULL,
  `depart` varchar(100) NOT NULL,
  PRIMARY KEY (`stu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=412 DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`name`,`sex`,`phone`,`stu_id`,`status`,`depart`) values ('张志强',1,'15526850935',404,1,'计算机'),('孙万众',0,'12345678910',405,1,'计算机'),('张世奇',0,'12345678910',406,1,'1'),('李岩',1,'12345678910',407,1,'1'),('刘伟',1,'12345678910',408,1,'1'),('刘伟',1,'12345678910',409,1,'1'),('刘伟',1,'12345678910',410,1,'1'),('刘伟',1,'12345678910',411,1,'1');

/*Table structure for table `tea` */

DROP TABLE IF EXISTS `tea`;

CREATE TABLE `tea` (
  `tea_id` int(11) NOT NULL AUTO_INCREMENT,
  `tea_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `account` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_bin DEFAULT '123456',
  `status` int(11) DEFAULT NULL,
  `tea_tel` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `tea_card` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `tea_coll` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `tea_sex` int(11) DEFAULT NULL,
  `tea_img` varchar(255) COLLATE utf8_bin DEFAULT '1.jpg',
  PRIMARY KEY (`tea_id`)
) ENGINE=InnoDB AUTO_INCREMENT=479 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `tea` */

insert  into `tea`(`tea_id`,`tea_name`,`account`,`password`,`status`,`tea_tel`,`tea_card`,`tea_coll`,`tea_sex`,`tea_img`) values (457,'张','123','456',1,'789','123456','89',1,NULL),(458,'1','1','1',1,'1','1','1',1,NULL),(459,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL),(460,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL),(461,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL),(462,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL),(463,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL),(464,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL),(465,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL),(466,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL),(467,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL),(468,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL),(469,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL),(470,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL),(471,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL),(472,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL),(473,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL),(474,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL),(475,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL),(476,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL),(477,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL),(478,NULL,'123','123456',1,'1234568889',NULL,'123456',NULL,NULL);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `user_Id` int(50) unsigned NOT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`user_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`user_Id`,`username`,`password`) values (0,'asd','123');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
