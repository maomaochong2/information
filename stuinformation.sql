/*
Navicat MySQL Data Transfer

Source Server         : ccs
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : stuinformation

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2019-06-16 17:39:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for classes
-- ----------------------------
DROP TABLE IF EXISTS `classes`;
CREATE TABLE `classes` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cname` varchar(100) NOT NULL,
  `cdesc` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classes
-- ----------------------------
INSERT INTO `classes` VALUES ('3', '信管', '信息管理专业');
INSERT INTO `classes` VALUES ('10', '计算机科学12', '21');
INSERT INTO `classes` VALUES ('22', '计算机科学1班', '计算机科学1班');
INSERT INTO `classes` VALUES ('23', '计算机科学2班', 'onclick');
INSERT INTO `classes` VALUES ('24', '计算机科学3班', '计算机科学3班计算机科学3班');
INSERT INTO `classes` VALUES ('25', 'wwer', '2 ');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `stuid` int(11) NOT NULL,
  `stuname` varchar(50) NOT NULL,
  `sex` varchar(20) NOT NULL,
  `birthday` varchar(50) NOT NULL,
  `classname` varchar(100) NOT NULL,
  `email` varchar(50) NOT NULL,
  `note` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`,`stuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '1000', 'tom', '男', '1998.09.15', '01', '10086@qq.com', '');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(11) NOT NULL,
  `password` varchar(11) NOT NULL,
  PRIMARY KEY (`id`,`username`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '123456');
INSERT INTO `user` VALUES ('2', 'user', '123456');
INSERT INTO `user` VALUES ('3', 'admin2', '123456');
INSERT INTO `user` VALUES ('4', 'kitty', '123456');
