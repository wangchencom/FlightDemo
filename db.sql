/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : fl

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 21/06/2020 23:45:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `cityname` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES (1, '上海');
INSERT INTO `city` VALUES (2, '北京');
INSERT INTO `city` VALUES (3, '杭州');
INSERT INTO `city` VALUES (4, '天津');
INSERT INTO `city` VALUES (5, '西安');

-- ----------------------------
-- Table structure for flight
-- ----------------------------
DROP TABLE IF EXISTS `flight`;
CREATE TABLE `flight`  (
  `id` int(0) NOT NULL AUTO_INCREMENT,
  `flightno` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `departurecity` int(0) NOT NULL,
  `departuretime` datetime(6) NOT NULL,
  `arrivalcity` int(0) NOT NULL,
  `arrivalitime` datetime(6) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of flight
-- ----------------------------
INSERT INTO `flight` VALUES (1, '001', 1, '2020-06-21 18:51:56.000000', 2, '2020-06-21 19:52:01.000000');
INSERT INTO `flight` VALUES (2, '002', 1, '2020-06-21 21:02:49.000000', 2, '2020-06-21 23:02:52.000000');

-- ----------------------------
-- Table structure for pu_user
-- ----------------------------
DROP TABLE IF EXISTS `pu_user`;
CREATE TABLE `pu_user`  (
  `user_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pu_user
-- ----------------------------
INSERT INTO `pu_user` VALUES ('1', '11', '22');

SET FOREIGN_KEY_CHECKS = 1;
