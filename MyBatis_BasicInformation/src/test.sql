/*
Navicat MySQL Data Transfer

Source Server         : fengke
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2015-10-14 16:34:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `emp`
-- ----------------------------
DROP TABLE IF EXISTS `emp`;
CREATE TABLE `emp` (
  `eid` int(10) NOT NULL AUTO_INCREMENT,
  `ename` varchar(10) DEFAULT NULL,
  `esex` varchar(10) DEFAULT NULL,
  `eage` int(10) DEFAULT NULL,
  `ehobby` varchar(30) DEFAULT NULL,
  `depid` int(10) NOT NULL,
  PRIMARY KEY (`eid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of emp
-- ----------------------------
INSERT INTO `emp` VALUES ('1', 'fengke', '男', '22', '吃饭', '1');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `regdate` datetime DEFAULT NULL,
  `orgid` int(5) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'admin', '123', '2015-10-12 15:35:38', '101');
INSERT INTO `t_user` VALUES ('2', 'aa', '123', '2015-10-13 09:42:00', '101');
INSERT INTO `t_user` VALUES ('3', 'bb', '123', '2015-10-13 09:42:11', '102');
INSERT INTO `t_user` VALUES ('4', 'cc', '123', '2015-10-13 09:42:23', '102');
INSERT INTO `t_user` VALUES ('5', 'tom1', '1234', '2015-10-13 10:04:53', '102');
INSERT INTO `t_user` VALUES ('6', 'tom', '123', '2015-10-14 16:27:38', '1');
INSERT INTO `t_user` VALUES ('7', 'tom', '123', '2015-10-14 16:27:49', '1');
