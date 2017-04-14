/*
Navicat MySQL Data Transfer

Source Server         : iSupport
Source Server Version : 50709
Source Host           : localhost:3306
Source Database       : isupport

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2017-04-14 10:46:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `is_b_area`
-- ----------------------------
DROP TABLE IF EXISTS `is_b_area`;
CREATE TABLE `is_b_area` (
  `pk_area` int(20) NOT NULL AUTO_INCREMENT COMMENT '区域主键',
  `areacode` varchar(20) NOT NULL COMMENT '区域编码',
  `areaname` varchar(20) NOT NULL COMMENT '区域名称',
  PRIMARY KEY (`pk_area`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COMMENT='区域表';

-- ----------------------------
-- Records of is_b_area
-- ----------------------------
INSERT INTO `is_b_area` VALUES ('1', '0000', '观山湖区');
INSERT INTO `is_b_area` VALUES ('2', '10020', '金阳区');
INSERT INTO `is_b_area` VALUES ('3', '32123', '测试');
INSERT INTO `is_b_area` VALUES ('4', '111', '23456');
INSERT INTO `is_b_area` VALUES ('5', '12312', '31231245');
INSERT INTO `is_b_area` VALUES ('6', '11223344', '测试修改，，，。，。，');
INSERT INTO `is_b_area` VALUES ('9', '110110', '112');
INSERT INTO `is_b_area` VALUES ('10', '12312', '123123');

-- ----------------------------
-- Table structure for `is_b_corp`
-- ----------------------------
DROP TABLE IF EXISTS `is_b_corp`;
CREATE TABLE `is_b_corp` (
  `pk_corp` int(20) NOT NULL AUTO_INCREMENT COMMENT '公司主键',
  `corpcode` varchar(20) NOT NULL COMMENT '公司编码',
  `corpname` varchar(200) NOT NULL COMMENT '公司名称',
  `groupname` varchar(200) NOT NULL COMMENT '集团名称',
  `remark` varchar(1000) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`pk_corp`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='公司表';

-- ----------------------------
-- Records of is_b_corp
-- ----------------------------
INSERT INTO `is_b_corp` VALUES ('2', '1123', '测试2', '测试集团2', '踩踩踩踩踩踩');
INSERT INTO `is_b_corp` VALUES ('3', '测试3', '测试公司3', '集团3', '强强强强强强强强强强强强强强');

-- ----------------------------
-- Table structure for `is_b_group`
-- ----------------------------
DROP TABLE IF EXISTS `is_b_group`;
CREATE TABLE `is_b_group` (
  `pk_group` int(20) NOT NULL AUTO_INCREMENT COMMENT '集团主键',
  `groupcode` varchar(20) NOT NULL COMMENT '集团编码',
  `groupname` varchar(200) NOT NULL COMMENT '集团名称',
  `remark` varchar(1000) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`pk_group`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='集团表';

-- ----------------------------
-- Records of is_b_group
-- ----------------------------
INSERT INTO `is_b_group` VALUES ('2', '123', '集团测试', '测试一下啊');
INSERT INTO `is_b_group` VALUES ('3', '222', '3123123123', '12312');
INSERT INTO `is_b_group` VALUES ('4', '123123', '123123', '123123');
INSERT INTO `is_b_group` VALUES ('5', '12312', '123123', '123123');
INSERT INTO `is_b_group` VALUES ('6', 'ceshi', '集团测试', '测试测试');

-- ----------------------------
-- Table structure for `is_b_product`
-- ----------------------------
DROP TABLE IF EXISTS `is_b_product`;
CREATE TABLE `is_b_product` (
  `pk_product` int(20) NOT NULL AUTO_INCREMENT COMMENT '产品主键',
  `productname` varchar(200) NOT NULL COMMENT '产品名称',
  PRIMARY KEY (`pk_product`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品表';

-- ----------------------------
-- Records of is_b_product
-- ----------------------------

-- ----------------------------
-- Table structure for `is_b_project`
-- ----------------------------
DROP TABLE IF EXISTS `is_b_project`;
CREATE TABLE `is_b_project` (
  `pk_project` int(20) NOT NULL AUTO_INCREMENT COMMENT '项目主键',
  `projectcode` varchar(20) NOT NULL COMMENT '项目编码',
  `projectname` varchar(200) NOT NULL COMMENT '项目名称',
  PRIMARY KEY (`pk_project`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='项目表';

-- ----------------------------
-- Records of is_b_project
-- ----------------------------

-- ----------------------------
-- Table structure for `is_b_province`
-- ----------------------------
DROP TABLE IF EXISTS `is_b_province`;
CREATE TABLE `is_b_province` (
  `pk_province` int(20) NOT NULL AUTO_INCREMENT COMMENT '省区主键',
  `procode` varchar(20) NOT NULL COMMENT '省区编码',
  `proname` varchar(200) NOT NULL COMMENT '省区名称',
  `areaname` varchar(200) NOT NULL COMMENT '区域名称',
  PRIMARY KEY (`pk_province`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='省区表';

-- ----------------------------
-- Records of is_b_province
-- ----------------------------

-- ----------------------------
-- Table structure for `is_b_user`
-- ----------------------------
DROP TABLE IF EXISTS `is_b_user`;
CREATE TABLE `is_b_user` (
  `pk_user` int(20) NOT NULL AUTO_INCREMENT COMMENT '主表主键',
  `usercode` varchar(20) DEFAULT NULL COMMENT '用户编码',
  `password` varchar(40) NOT NULL COMMENT '密码',
  `username` varchar(20) NOT NULL COMMENT '用户姓名',
  `usertype` varchar(20) NOT NULL COMMENT '用户类型',
  `usercnname` varchar(20) NOT NULL COMMENT '用户中文名',
  `userphone` varchar(40) NOT NULL COMMENT '用户电话',
  `useremail` varchar(40) NOT NULL COMMENT '用户邮箱',
  `usersex` varchar(20) NOT NULL COMMENT '用户性别',
  `userarea` varchar(30) NOT NULL COMMENT '所在大区',
  `userdept` varchar(30) NOT NULL COMMENT '所在部门',
  `def1` varchar(100) DEFAULT NULL COMMENT '预留字段1',
  `def2` varchar(100) DEFAULT NULL COMMENT '预留字段2',
  `def3` varchar(100) DEFAULT NULL COMMENT '预留字段3',
  `def4` varchar(100) DEFAULT NULL COMMENT '预留字段4',
  `def5` varchar(100) DEFAULT NULL COMMENT '预留字段5',
  PRIMARY KEY (`pk_user`)
) ENGINE=InnoDB AUTO_INCREMENT=779 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of is_b_user
-- ----------------------------
INSERT INTO `is_b_user` VALUES ('777', '11030145', 'admin', 'hcl', '1', '侯村林', '15142714713', '444@qq.com', '1', '2', '2', null, null, null, null, null);
INSERT INTO `is_b_user` VALUES ('778', null, '11111111', 'test1', '1', '测试账号1', '15098909867', 'test1@qq.com', '1', '0', '0', null, null, null, null, null);

-- ----------------------------
-- Table structure for `is_s_dweekplane_n`
-- ----------------------------
DROP TABLE IF EXISTS `is_s_dweekplane_n`;
CREATE TABLE `is_s_dweekplane_n` (
  `pk_s_dweekplane_t` int(20) NOT NULL COMMENT '双周报主表主键',
  `pk_s_dweekplane_n` int(20) NOT NULL AUTO_INCREMENT COMMENT '子表主键',
  `weekplstarttime` datetime(6) DEFAULT NULL COMMENT '周报开始时间',
  `weekplfinishtime` datetime(6) DEFAULT NULL COMMENT '周报结束时间',
  `ordernumber` varchar(20) DEFAULT NULL COMMENT '序号',
  `planetask` varchar(2000) DEFAULT NULL COMMENT '工作任务',
  `personliable` varchar(20) DEFAULT NULL COMMENT '责任人',
  `taskstartdate` datetime(6) DEFAULT NULL COMMENT '任务开始时间',
  `taskfinishdate` datetime(6) DEFAULT NULL COMMENT '任务结束时间',
  `explain` varchar(2000) DEFAULT NULL COMMENT '说明',
  PRIMARY KEY (`pk_s_dweekplane_n`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='双周报_下周计划';

-- ----------------------------
-- Records of is_s_dweekplane_n
-- ----------------------------

-- ----------------------------
-- Table structure for `is_s_dweekplane_p`
-- ----------------------------
DROP TABLE IF EXISTS `is_s_dweekplane_p`;
CREATE TABLE `is_s_dweekplane_p` (
  `pk_s_dweekplane_t` int(20) NOT NULL COMMENT '主表主键',
  `pk_s_dweekplane_p` int(20) NOT NULL AUTO_INCREMENT COMMENT '子表主键',
  `ordernumber` varchar(20) NOT NULL COMMENT '序号',
  `problem` varchar(2000) DEFAULT NULL COMMENT '问题与困难',
  `support` varchar(2000) DEFAULT NULL COMMENT '支持',
  `hopefinishdate` datetime(6) DEFAULT NULL COMMENT '期望完成时间',
  PRIMARY KEY (`pk_s_dweekplane_p`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='双周报_困难';

-- ----------------------------
-- Records of is_s_dweekplane_p
-- ----------------------------

-- ----------------------------
-- Table structure for `is_s_dweekplane_t`
-- ----------------------------
DROP TABLE IF EXISTS `is_s_dweekplane_t`;
CREATE TABLE `is_s_dweekplane_t` (
  `pk_s_dweekplane_h` int(30) NOT NULL COMMENT '主表主键',
  `pk_s_dweekplane_t` int(30) NOT NULL AUTO_INCREMENT COMMENT '字表主键',
  `weekstartdate` datetime(6) DEFAULT NULL COMMENT '周报开始时间',
  `weekfinishdate` datetime(6) DEFAULT NULL COMMENT '周报结束时间',
  `ordernumber` varchar(30) DEFAULT NULL COMMENT '序号',
  `worktask` varchar(2000) DEFAULT NULL COMMENT '工作任务',
  `personliable` varchar(30) DEFAULT NULL COMMENT '责任人',
  `planestarttime` datetime(6) DEFAULT NULL COMMENT '任务开始时间',
  `planefinishtime` datetime(6) DEFAULT NULL COMMENT '任务结束时间',
  `explain` varchar(2000) DEFAULT NULL COMMENT '说明',
  PRIMARY KEY (`pk_s_dweekplane_t`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of is_s_dweekplane_t
-- ----------------------------

-- ----------------------------
-- Table structure for `is_s_dweekplane_w`
-- ----------------------------
DROP TABLE IF EXISTS `is_s_dweekplane_w`;
CREATE TABLE `is_s_dweekplane_w` (
  `pk_s_dweekplane_t` int(20) NOT NULL COMMENT '双周报主表主键',
  `pk_s_dweekplane_w` int(20) NOT NULL AUTO_INCREMENT COMMENT '双周报子表主键',
  `ordernumber` varchar(20) NOT NULL COMMENT '序号',
  `worktask` varchar(2000) DEFAULT NULL COMMENT '工作任务',
  `personliable` varchar(20) DEFAULT NULL COMMENT '负责人',
  `notfinishreason` varchar(2000) DEFAULT NULL COMMENT '未完成原因',
  `measure` varchar(2000) DEFAULT NULL COMMENT '具体措施',
  PRIMARY KEY (`pk_s_dweekplane_w`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of is_s_dweekplane_w
-- ----------------------------

-- ----------------------------
-- Table structure for `user_t`
-- ----------------------------
DROP TABLE IF EXISTS `user_t`;
CREATE TABLE `user_t` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(40) NOT NULL,
  `password` varchar(255) NOT NULL,
  `age` int(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_t
-- ----------------------------
INSERT INTO `user_t` VALUES ('1', '测试', 'sfasgfaf', '24');
