/*
Navicat MySQL Data Transfer

Source Server         : ben
Source Server Version : 50610
Source Host           : 127.0.0.1:3306
Source Database       : e_course

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2014-09-17 14:54:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for announ
-- ----------------------------
DROP TABLE IF EXISTS `announ`;
CREATE TABLE `announ` (
  `announ_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `announ_title` varchar(255) NOT NULL,
  `announ_content` varchar(255) NOT NULL,
  `announ_date` datetime NOT NULL,
  `announ_auther` varchar(255) NOT NULL,
  PRIMARY KEY (`announ_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of announ
-- ----------------------------

-- ----------------------------
-- Table structure for correctwork
-- ----------------------------
DROP TABLE IF EXISTS `correctwork`;
CREATE TABLE `correctwork` (
  `correct_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `correct_swork_id` int(255) unsigned NOT NULL,
  `correct_author_tid` int(255) unsigned NOT NULL,
  `correct_grade` double DEFAULT NULL,
  `correct_date` datetime DEFAULT NULL,
  PRIMARY KEY (`correct_id`),
  KEY `fkey_correct_submitidwork_id` (`correct_swork_id`),
  KEY `fkey_correct_teacher_id` (`correct_author_tid`),
  CONSTRAINT `fkey_correct_submitidwork_id` FOREIGN KEY (`correct_swork_id`) REFERENCES `submitedwork` (`swork_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fkey_correct_teacher_id` FOREIGN KEY (`correct_author_tid`) REFERENCES `user` (`userid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of correctwork
-- ----------------------------

-- ----------------------------
-- Table structure for homework_info
-- ----------------------------
DROP TABLE IF EXISTS `homework_info`;
CREATE TABLE `homework_info` (
  `homework_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `homework_teacher_id` int(11) unsigned NOT NULL,
  `homework_title` varchar(255) NOT NULL,
  `homework_content` longtext NOT NULL,
  `homework_deadline` datetime DEFAULT NULL,
  `homework_date` datetime NOT NULL,
  PRIMARY KEY (`homework_id`),
  KEY `fkey_homework_tid` (`homework_teacher_id`),
  CONSTRAINT `fkey_homework_tid` FOREIGN KEY (`homework_teacher_id`) REFERENCES `user` (`userid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of homework_info
-- ----------------------------

-- ----------------------------
-- Table structure for information
-- ----------------------------
DROP TABLE IF EXISTS `information`;
CREATE TABLE `information` (
  `infor_title` varchar(255) NOT NULL,
  `infor_content` longtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of information
-- ----------------------------
INSERT INTO `information` VALUES ('introduction', '这是一门课');
INSERT INTO `information` VALUES ('abstract', '这还是一门大纲');

-- ----------------------------
-- Table structure for material
-- ----------------------------
DROP TABLE IF EXISTS `material`;
CREATE TABLE `material` (
  `material_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `material_title` varchar(255) NOT NULL,
  `material_content` longtext NOT NULL,
  PRIMARY KEY (`material_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of material
-- ----------------------------

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `msg_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `msg_author` int(11) DEFAULT NULL,
  `msg_content` varchar(255) DEFAULT NULL,
  `msg_date` datetime DEFAULT NULL,
  `msg_referenced_id` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`msg_id`),
  KEY `fkey_msg_rederenced_id` (`msg_referenced_id`),
  CONSTRAINT `fkey_msg_rederenced_id` FOREIGN KEY (`msg_referenced_id`) REFERENCES `message` (`msg_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for resource
-- ----------------------------
DROP TABLE IF EXISTS `resource`;
CREATE TABLE `resource` (
  `resource_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `resource_title` varchar(255) DEFAULT NULL,
  `resource_file_location` varchar(255) NOT NULL,
  PRIMARY KEY (`resource_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of resource
-- ----------------------------

-- ----------------------------
-- Table structure for submitedwork
-- ----------------------------
DROP TABLE IF EXISTS `submitedwork`;
CREATE TABLE `submitedwork` (
  `swork_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `swork_auther_sid` int(11) unsigned NOT NULL,
  `swork_homework_id` int(11) unsigned DEFAULT NULL,
  `swork_content` longtext NOT NULL,
  `swork_date` datetime NOT NULL,
  `swork_state` tinyint(4) NOT NULL,
  PRIMARY KEY (`swork_id`),
  KEY `fkey_swork_student_id` (`swork_auther_sid`),
  KEY `fkey_swork_homework_id` (`swork_homework_id`),
  CONSTRAINT `fkey_swork_homework_id` FOREIGN KEY (`swork_homework_id`) REFERENCES `homework_info` (`homework_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fkey_swork_student_id` FOREIGN KEY (`swork_auther_sid`) REFERENCES `user` (`userid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of submitedwork
-- ----------------------------

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `teachername` varchar(255) NOT NULL,
  `introduction` longtext NOT NULL,
  `master` tinyint(4) unsigned NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('王美佳', 'haolaoshi', '0');
INSERT INTO `teacher` VALUES ('商振国', 'sb', '1');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `level` smallint(255) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB AUTO_INCREMENT=1002 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1001', 'waby', 'waby', '1');

-- ----------------------------
-- Table structure for vedio
-- ----------------------------
DROP TABLE IF EXISTS `vedio`;
CREATE TABLE `vedio` (
  `vedio_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `vedio_description` longtext,
  `vedio_file_location` varchar(255) DEFAULT NULL,
  `vedio_date` datetime DEFAULT NULL,
  `vedio_counter` int(11) DEFAULT NULL,
  PRIMARY KEY (`vedio_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vedio
-- ----------------------------
