/*
 Navicat Premium Data Transfer

 Source Server         : 1
 Source Server Type    : MySQL
 Source Server Version : 50605
 Source Host           : localhost:3306
 Source Schema         : moe_nav

 Target Server Type    : MySQL
 Target Server Version : 50605
 File Encoding         : 65001

 Date: 22/06/2021 19:31:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for nav_admin
-- ----------------------------
DROP TABLE IF EXISTS `nav_admin`;
CREATE TABLE `nav_admin`  (
  `admin_uid` int(10) NOT NULL AUTO_INCREMENT COMMENT '管理员UID',
  `admin_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员名称',
  `admin_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员用户地址',
  `admin_image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员头图地址',
  `admin_description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '管理员的介绍',
  PRIMARY KEY (`admin_uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of nav_admin
-- ----------------------------

-- ----------------------------
-- Table structure for nav_cont
-- ----------------------------
DROP TABLE IF EXISTS `nav_cont`;
CREATE TABLE `nav_cont`  (
  `moe_cid` int(10) NOT NULL AUTO_INCREMENT COMMENT '朋友链接的主键',
  `moe_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '链接的名称',
  `moe_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '链接的地址',
  `moe_sort` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '链接的分类',
  `moe_image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT 'style/img/user.png' COMMENT '链接的图片 用于显示头像',
  `moe_description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '链接的描述',
  `moe_user` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户自定义',
  `moe_order` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '链接的排序 SQL查询这个字段',
  PRIMARY KEY (`moe_cid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 34 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of nav_cont
-- ----------------------------
INSERT INTO `nav_cont` VALUES (28, 'Telegram', 'https://telegram.org/', '[社交]', 'style/img/11a35030-62d9-429c-b21f-dc17b59a464f.png', 'Telegram是跨平台的即时通信软件', NULL, NULL);
INSERT INTO `nav_cont` VALUES (29, 'Twitter', 'https://twitter.com/', '[微博客]', 'style/img/Btnfm47p_200x200.jpg', '美国一个微博客和社交网络服务平台', NULL, NULL);
INSERT INTO `nav_cont` VALUES (30, 'YouTube', 'https://www.youtube.com/', '[视频分享]', 'style/img/f88268c4-1665-4f92-a09c-53aecf65b0d3.png', '美国视频分享网站，全球最大的视频搜索和分享平台', NULL, NULL);
INSERT INTO `nav_cont` VALUES (31, 'Instagram', 'https://www.instagram.com/', '[图片]', 'style/img/0f07a5c5-e4d4-45da-9631-31af8299e54c.jpg', 'Facebook公司的在线图片及视频分享的社区应用软件', NULL, NULL);
INSERT INTO `nav_cont` VALUES (32, 'Discord', 'https://discord.com/', '[社交]', 'style/img/345f96bb-b9ef-4c23-9fe2-ecd017969e10.jpg', '为社区设计的免费网络实时通话软件与数字发行平台', NULL, NULL);
INSERT INTO `nav_cont` VALUES (33, '哔哩哔哩弹幕网', 'https://www.bilibili.com/', '[视频]', 'style/img/25a90da7-9f95-47ec-b4e0-1a5c72bca7c5.jpg', '是中国大陆以ACG相关内容起家的弹幕视频分享网站', NULL, NULL);

-- ----------------------------
-- Table structure for nav_links
-- ----------------------------
DROP TABLE IF EXISTS `nav_links`;
CREATE TABLE `nav_links`  (
  `link_id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'links表主键',
  `link_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'links名称',
  `link_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'links网址',
  `link_sort` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'links分类',
  `link_style` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'links样式 /RGB色/十六进制',
  `link_target` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'links是否新标签页打开',
  PRIMARY KEY (`link_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 90 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of nav_links
-- ----------------------------
INSERT INTO `nav_links` VALUES (1, '阿楚', 'http://www.cuonc.com', 'rgb(251,213,123)', '#34feb1', '_self');
INSERT INTO `nav_links` VALUES (2, '百度', 'http://www.baidu.com', NULL, 'rgb(41,50,225)', '_blank');
INSERT INTO `nav_links` VALUES (3, '阿里云', 'https://aliyun.com/', NULL, 'rgb(255,106,0)', '_blank');
INSERT INTO `nav_links` VALUES (4, '腾讯云', 'https://cloud.tencent.com/', NULL, 'rgb(0,200,220)', '_blank');
INSERT INTO `nav_links` VALUES (5, '华为云', 'https://www.huaweicloud.com/', NULL, 'rgb(228,0,18)', '_blank');
INSERT INTO `nav_links` VALUES (6, '京东云', 'https://www.jdcloud.com/', NULL, 'rgb(225,37,27)', '_blank');
INSERT INTO `nav_links` VALUES (7, 'Google', 'https://www.google.com/', '#FEBB41', 'rgb(233,66,53)', '_blank');
INSERT INTO `nav_links` VALUES (8, 'AWS云服务', 'https://aws.amazon.com/', NULL, 'rgb(236,145,45)', '_blank');
INSERT INTO `nav_links` VALUES (9, 'YouTube', 'https://www.youtube.com/', NULL, 'rgb(254,0,0)', '_blank');
INSERT INTO `nav_links` VALUES (10, 'Twitch', 'https://www.twitch.tv/', NULL, 'rgb(145,71,255)', '_blank');
INSERT INTO `nav_links` VALUES (11, 'Azure', 'https://azure.microsoft.com', NULL, 'rgb(0,120,212)', '_blank');
INSERT INTO `nav_links` VALUES (12, '抖音', 'https://www.douyin.com/', 'rgb(255,0,80)', 'rgb(0,250,240)', '_blank');
INSERT INTO `nav_links` VALUES (13, 'GitHub', 'https://github.com/', NULL, 'rgb(36,41,46)', '_blank');
INSERT INTO `nav_links` VALUES (14, 'Twitter', 'https://twitter.com/', NULL, 'rgb(29,161,242)', '_blank');
INSERT INTO `nav_links` VALUES (15, 'CSDN', 'https://www.csdn.net/', NULL, 'rgb(252,85,49)', '_blank');
INSERT INTO `nav_links` VALUES (16, '斗鱼直播', 'https://www.douyu.com/', NULL, 'rgb(248,193,0)', '_blank');
INSERT INTO `nav_links` VALUES (17, '虎牙直播', 'https://www.huya.com/', NULL, 'rgb(255,171,8)', '_blank');
INSERT INTO `nav_links` VALUES (18, '企鹅电竞', 'https://egame.qq.com/', 'rgb(123,86,19)', 'rgb(251,213,123)', '_blank');
INSERT INTO `nav_links` VALUES (19, 'Netflix', 'https://www.netflix.com/', NULL, 'rgb(229,9,20)', '_blank');
INSERT INTO `nav_links` VALUES (20, 'Telegram', 'https://telegram.org/', NULL, 'rgb(51,144,236)', '_blank');

-- ----------------------------
-- Table structure for nav_users
-- ----------------------------
DROP TABLE IF EXISTS `nav_users`;
CREATE TABLE `nav_users`  (
  `uid` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户账号信息',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户密码',
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户头像',
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户网站',
  `screenName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户的名称',
  `administrator` int(10) NULL DEFAULT NULL COMMENT '是否为管理员',
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 40 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of nav_users
-- ----------------------------
INSERT INTO `nav_users` VALUES (1, '检哥', '123456', NULL, NULL, NULL, NULL);
INSERT INTO `nav_users` VALUES (2, 'XiaoJun', 'asdasd', NULL, NULL, NULL, NULL);
INSERT INTO `nav_users` VALUES (3, '1111', '1111', NULL, NULL, NULL, NULL);
INSERT INTO `nav_users` VALUES (4, '123', '123', NULL, NULL, NULL, NULL);
INSERT INTO `nav_users` VALUES (39, '卧槽', 'asdasd', NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
