<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<head>
<title>门户中心</title>
<meta http-equiv="content-type" content="text/html;charset=UTF-8">
<meta charset="utf-8">
<link href="http://cdn.bootcss.com/antd/1.10.0/antd.min.css"
	rel="stylesheet">
<link rel="stylesheet" href="build/yylibui.css">
<link rel="stylesheet" href="build/bundle.css">
<script src="http://cdn.bootcss.com/es5-shim/4.5.9/es5-shim.min.js"></script>
<script
	src="http://cdn.bootcss.com/babel-polyfill/6.13.0/polyfill.min.js"></script>
<script type="text/javascript" charset="utf-8" async=""
	src="/workbench-integration-ui/build/6_7a382bc3fed82f0169f3.chunk.js"></script>
<script type="text/javascript" charset="utf-8" async=""
	src="/workbench-integration-ui/build/menu_7a382bc3fed82f0169f3.chunk.js"></script>
<style type="text/css">
@
font-family 'Helvetica Neue ', 'Hiragino Sans GB ', '\9ED1\4F53 ', Arial,
	sans-serif, ： 'Microsoft YaHei ';.crumb {
	margin-bottom: 10px;
	background-color: #fff;
	padding: 8px 0 8px 10px;
	border-bottom: 1px solid #dadbdc
}

.crumb .left-title {
	margin-right: 33px;
	font-size: 1pc
}

.crumb .iscrumb {
	cursor: pointer;
	font-size: 9pt;
	color: #9f9f9f
}

.crumb .last-crumb {
	cursor: pointer;
	font-size: 9pt;
	color: #42a1d2
}
</style>
<style type="text/css">
@font-family 'Helvetica Neue ', 'Hiragino Sans GB ', '\9ED1\4F53 ', Arial,
	sans-serif, ： 'Microsoft YaHei ';.text-shadow {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.has-icon-btn {
	padding: 0 9pt 0 10px
}

.has-icon-btn i {
	margin-right: 9px;
	font-size: 14px
}

.yycc-btn-height {
	padding: 5px 9pt 4px 10px
}

.yycc-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer
}

.yycc-btn font {
	vertical-align: inherit
}

.save-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	background-color: #0081cc
}

.save-btn font {
	vertical-align: inherit
}

.save-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.save-btn:active {
	background-color: #086398
}

.save-btn[disabled] {
	cursor: not-allowed
}

.save-fourfont-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	background-color: #0081cc;
	padding: 9px 30px 8px
}

.save-fourfont-btn font {
	vertical-align: inherit
}

.save-fourfont-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.save-fourfont-btn:active {
	background-color: #086398
}

.save-fourfont-btn[disabled] {
	cursor: not-allowed
}

.cancel-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	border: 1px solid #c1c1c1;
	color: #5f5f5f;
	background-color: #fff
}

.cancel-btn font {
	vertical-align: inherit
}

.cancel-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.cancel-btn:active {
	background-color: #f5f5f5
}

.add-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	padding: 5px 9pt 4px 10px;
	background-color: #0081cc
}

.add-btn font {
	vertical-align: inherit
}

.add-btn i {
	margin-right: 9px;
	font-size: 14px
}

.add-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.add-btn:active {
	background-color: #086398
}

.add-btn-disabled {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	cursor: not-allowed;
	padding: 5px 9pt 4px 10px;
	background-color: #c1c1c1
}

.add-btn-disabled font {
	vertical-align: inherit
}

.add-btn-disabled i {
	margin-right: 9px;
	font-size: 14px
}

.delete-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	padding: 5px 9pt 4px 10px;
	background-color: #f35951
}

.delete-btn font {

	vertical-align: inherit
}

.delete-btn i {
	margin-right: 9px;
	font-size: 14px
}

.delete-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.delete-btn:active {
	background-color: #d12b22
}

.close-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	padding: 5px 9pt 4px 10px;
	background-color: #f35951
}

.close-btn font {
	vertical-align: inherit
}

.close-btn i {
	margin-right: 9px;
	font-size: 14px
}

.close-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.close-btn:active {
	background-color: #d12b22
}

.open-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	padding: 5px 9pt 4px 10px;
	background-color: #69c054
}

.open-btn font {
	vertical-align: inherit
}

.open-btn i {
	margin-right: 9px;
	font-size: 14px
}

.open-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.open-btn:active {
	background-color: #3d9d26
}

.back-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	background-color: #fff;
	color: #646464;
	border: 1px solid #bac7cf;
	height: 28px
}

.back-btn font {
	vertical-align: inherit
}

.back-btn i {
	margin-right: 9px;
	font-size: 14px
}

.back-noicon-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	background-color: #fff;
	color: #646464;
	border: 1px solid #bac7cf;
	height: 40px
}

.back-noicon-btn font {
	vertical-align: inherit
}

.back-btn-crumb {
	background-color: #fff;
	color: #646464;
	border: 1px solid #bac7cf;
	font-size: 14px;
	padding: 0 3px;
	border-radius: 4px;
	margin-right: 10px
}

.btn-disabled {
	cursor: not-allowed
}

.move-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	padding: 5px 9pt 4px 10px;
	background-color: #0081cc
}

.move-btn font {
	vertical-align: inherit
}

.move-btn i {
	margin-right: 9px;
	font-size: 14px
}

.move-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.move-btn:active {
	background-color: #086398
}

.move-btn-disabled {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	cursor: not-allowed;
	padding: 5px 9pt 4px 10px;
	background-color: #c1c1c1
}

.move-btn-disabled font {
	vertical-align: inherit
}

.move-btn-disabled i {
	margin-right: 9px;
	font-size: 14px
}

.partJob-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	padding: 5px 9pt 4px 10px;
	background-color: #0081cc
}

.partJob-btn font {
	vertical-align: inherit
}

.partJob-btn i {
	margin-right: 9px;
	font-size: 14px
}

.partJob-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.partJob-btn:active {
	background-color: #086398
}

.partJob-btn-disabled {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	cursor: not-allowed;
	padding: 5px 9pt 4px 10px;
	background-color: #c1c1c1
}

.partJob-btn-disabled font {
	vertical-align: inherit
}

.partJob-btn-disabled i {
	margin-right: 9px;
	font-size: 14px
}

.cancelmin-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	padding: 5px 9pt 4px 10px;
	color: #000;
	border: 1px solid #c1c1c1;
	padding-left: 10px;
	background-color: #fff
}

.cancelmin-btn font {
	vertical-align: inherit
}

.cancelmin-btn i {
	margin-right: 9px;
	font-size: 14px
}

.cancelmin-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.cancelmin-btn:active {
	background-color: #f5f5f5
}

.cancelmin-btn-disabled {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;

	cursor: pointer;
	padding: 0 9pt 0 10px;
	cursor: not-allowed;
	padding: 5px 9pt 4px 10px;
	background-color: #c1c1c1
}

.cancelmin-btn-disabled font {
	vertical-align: inherit
}

.cancelmin-btn-disabled i {
	margin-right: 9px;
	font-size: 14px
}
</style>
<style type="text/css">
@
font-family 'Helvetica Neue ', 'Hiragino Sans GB ', '\9ED1\4F53 ', Arial,
	sans-serif, ： 'Microsoft YaHei ';.tree-component .yyui-tree.ant-tree {
	background-color: #f9fafc
}
</style>
<style type="text/css">
div.ant-table {
	font-size: 14px;
	color: #737373;
	border-radius: 0
}

div.ant-table .ant-table-body {
	margin-top: 0
}

.ant-dropdown {
	margin-right: 50px
}

.ant-dropdown .ant-dropdown-menu {
	border-radius: 4px
}

ul li.ant-dropdown-menu-item>a {
	font-size: 14px;
	text-align: center;
	padding: 7px 0;
	border-radius: 0;
	color: #616161
}

ul li.ant-dropdown-menu-item a:hover, ul li.ant-dropdown-menu-item>a:active
	{
	text-align: center;
	padding: 7px 0;
	border-radius: 0;
	font-size: 14px;
	color: #fff;
	background-color: #0081cc
}

.td-operation-btn-ahover {
	display: block
}

.td-operation-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	padding: 5px 9pt 4px 10px;
	background-color: #0081cc;
	width: 59px;
	height: 39px;
	border-radius: 0;
	display: none
}

.td-operation-btn font {
	vertical-align: inherit
}

.td-operation-btn i {
	margin-right: 9px;
	font-size: 14px
}

.table-common {
	border-radius: 0;
	border-collapse: collapse;
	width: 100%;
	color: #737373;
	background-color: #fff
}

.table-common>thead>tr {
	border: 1px solid #cfcfcf;
	font-size: 14px;
	background-color: #f0f2f7
}

.table-common>thead>tr>th {
	color: #919191;
	border: 1px solid #cfcfcf;
	font-weight: 400;
	padding: 7px 0 8px 9pt
}

.table-common>thead>tr>th.ant-table-selection-column:first-child {
	padding: 0;
	margin: 0
}

.table-common>thead>tr>th.ant-table-selection-column:first-child input[type=checkbox]
	{
	algin: center
}

.table-common>tbody>tr.active {
	border: 1px solid #0081cc;
	background-color: #e5f2fa
}

.table-common>tbody>tr.active .td-operation-btn, .table-common>tbody>tr:hover .td-operation-btn
	{
	display: block
}

.table-common>tbody>tr {
	border: 1px solid #cfcfcf;
	font-size: 14px;
	background-color: #fbfcfe
}

.table-common>tbody>tr>td.ant-table-selection-column:first-child {
	margin: 0;
	padding: 0
}

.table-common>tbody>tr>td.ant-table-selection-column:first-child input[type=checkbox]
	{
	text-align: center
}

.table-common>tbody>tr>td:last-child {
	width: 60px;
	padding: 0
}

.table-common>tbody>tr>td.no-operation:last-child {
	width: auto;
	padding: 9px 0 9px 11px
}

.table-common>tbody>tr>td {
	border: 1px solid #cfcfcf;
	padding: 9px 0 9px 11px
}

.table-common>tbody>tr>td>a {
	color: #737373;
	margin-left: 10px
}

.table-common>tbody>tr:nth-child(2n) {
	background-color: #f5f8fb
}

.table-common>tbody>tr.unused {
	border: 1px solid #cfcfcf;
	color: #c8cac8
}

.table-common>tbody>tr:hover {
	border: 1px solid #0081cc;
	color: #78858d;
	background-color: #e5f2fa
}

.table-common>tbody>tr:hover>td {
	padding: 9px 0 9px 11px
}

.table-common>tbody>tr:hover>td:last-child {
	border: 1px solid #cfcfcf;
	width: 60px;
	padding: 0
}

.table-common>tbody>tr:hover>td.no-operation:last-child {
	width: auto;
	padding: 9px 0 9px 11px
}

.table-common>tbody>tr:hover>td>a {
	color: #737373;
	margin-left: 10px
}

.table-common>tbody>tr:hover.unused {
	border: 1px solid #cfcfcf;
	color: #c8cac8;
	background-color: #fafefa
}

@
font-family 'Helvetica Neue ', 'Hiragino Sans GB ', '\9ED1\4F53 ', Arial,
	sans-serif, ： 'Microsoft YaHei ';.text-shadow {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.has-icon-btn {
	padding: 0 9pt 0 10px
}

.has-icon-btn i {
	margin-right: 9px;
	font-size: 14px
}

.yycc-btn-height {
	padding: 5px 9pt 4px 10px
}

.yycc-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer
}

.yycc-btn font {
	vertical-align: inherit
}

.save-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	background-color: #0081cc
}

.save-btn font {
	vertical-align: inherit
}

.save-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.save-btn:active {
	background-color: #086398
}

.save-btn[disabled] {
	cursor: not-allowed
}

.save-fourfont-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	background-color: #0081cc;
	padding: 9px 30px 8px
}

.save-fourfont-btn font {
	vertical-align: inherit
}

.save-fourfont-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.save-fourfont-btn:active {
	background-color: #086398
}

.save-fourfont-btn[disabled] {
	cursor: not-allowed
}

.cancel-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	border: 1px solid #c1c1c1;
	color: #5f5f5f;
	background-color: #fff
}

.cancel-btn font {
	vertical-align: inherit
}

.cancel-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.cancel-btn:active {
	background-color: #f5f5f5
}

.add-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	padding: 5px 9pt 4px 10px;
	background-color: #0081cc
}

.add-btn font {
	vertical-align: inherit
}

.add-btn i {
	margin-right: 9px;
	font-size: 14px
}

.add-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.add-btn:active {
	background-color: #086398
}

.add-btn-disabled {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	cursor: not-allowed;
	padding: 5px 9pt 4px 10px;
	background-color: #c1c1c1
}

.add-btn-disabled font {
	vertical-align: inherit
}

.add-btn-disabled i {
	margin-right: 9px;
	font-size: 14px
}

.delete-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	padding: 5px 9pt 4px 10px;
	background-color: #f35951
}

.delete-btn font {
	vertical-align: inherit
}

.delete-btn i {
	margin-right: 9px;
	font-size: 14px
}

.delete-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.delete-btn:active {
	background-color: #d12b22
}

.close-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	padding: 5px 9pt 4px 10px;
	background-color: #f35951
}

.close-btn font {
	vertical-align: inherit
}

.close-btn i {
	margin-right: 9px;
	font-size: 14px
}

.close-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.close-btn:active {
	background-color: #d12b22
}

.open-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	padding: 5px 9pt 4px 10px;
	background-color: #69c054
}

.open-btn font {
	vertical-align: inherit
}

.open-btn i {
	margin-right: 9px;
	font-size: 14px
}

.open-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.open-btn:active {
	background-color: #3d9d26
}

.back-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	background-color: #fff;
	color: #646464;
	border: 1px solid #bac7cf;
	height: 28px
}

.back-btn font {
	vertical-align: inherit
}

.back-btn i {
	margin-right: 9px;
	font-size: 14px
}

.back-noicon-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	background-color: #fff;
	color: #646464;
	border: 1px solid #bac7cf;
	height: 40px
}

.back-noicon-btn font {
	vertical-align: inherit
}

.back-btn-crumb {
	background-color: #fff;
	color: #646464;
	border: 1px solid #bac7cf;
	font-size: 14px;
	padding: 0 3px;
	border-radius: 4px;
	margin-right: 10px
}

.btn-disabled {
	cursor: not-allowed
}

.move-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	padding: 5px 9pt 4px 10px;
	background-color: #0081cc
}

.move-btn font {
	vertical-align: inherit
}

.move-btn i {
	margin-right: 9px;
	font-size: 14px
}

.move-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.move-btn:active {
	background-color: #086398
}

.move-btn-disabled {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	cursor: not-allowed;
	padding: 5px 9pt 4px 10px;
	background-color: #c1c1c1
}

.move-btn-disabled font {
	vertical-align: inherit
}

.move-btn-disabled i {
	margin-right: 9px;
	font-size: 14px
}

.partJob-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	padding: 5px 9pt 4px 10px;
	background-color: #0081cc
}

.partJob-btn font {
	vertical-align: inherit
}

.partJob-btn i {
	margin-right: 9px;
	font-size: 14px
}

.partJob-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.partJob-btn:active {
	background-color: #086398
}

.partJob-btn-disabled {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	cursor: not-allowed;
	padding: 5px 9pt 4px 10px;
	background-color: #c1c1c1
}

.partJob-btn-disabled font {
	vertical-align: inherit
}

.partJob-btn-disabled i {
	margin-right: 9px;
	font-size: 14px
}

.cancelmin-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	padding: 5px 9pt 4px 10px;
	color: #000;
	border: 1px solid #c1c1c1;
	padding-left: 10px;
	background-color: #fff
}

.cancelmin-btn font {
	vertical-align: inherit
}

.cancelmin-btn i {
	margin-right: 9px;
	font-size: 14px
}

.cancelmin-btn:hover {
	text-shadow: 0 4px 4px rgba(0, 0, 0, .6)
}

.cancelmin-btn:active {
	background-color: #f5f5f5
}

.cancelmin-btn-disabled {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	cursor: not-allowed;
	padding: 5px 9pt 4px 10px;
	background-color: #c1c1c1
}

.cancelmin-btn-disabled font {
	vertical-align: inherit
}

.cancelmin-btn-disabled i {
	margin-right: 9px;
	font-size: 14px
}

.menu-page {
	margin-left: -30px
}

.menu-page .menu-left {
	margin-top: 10px;
	padding-left: 30px;
	padding-right: 15px
}

.menu-page .menu-right {
	padding-left: 10px
}

.menu-page .head-operation {
	width: 100%;
	margin-top: 10px;
	margin-bottom: 10px
}

.menu-icon {
	margin-left: 80%
}

.menu-page .menu-table table {
	border-radius: 0;
	border-collapse: collapse;
	width: 100%;
	color: #737373;
	background-color: #fff
}

.menu-page .menu-table table>thead>tr {
	border: 1px solid #cfcfcf;
	font-size: 14px;
	background-color: #f0f2f7
}

.menu-page .menu-table table>thead>tr>th {
	color: #919191;
	border: 1px solid #cfcfcf;
	font-weight: 400;
	padding: 7px 0 8px 9pt
}

.menu-page .menu-table table>thead>tr>th.ant-table-selection-column:first-child
	{
	padding: 0;
	margin: 0
}

.menu-page .menu-table table>thead>tr>th.ant-table-selection-column:first-child input[type=checkbox]
	{
	algin: center
}

.menu-page .menu-table table>tbody>tr.active {
	border: 1px solid #0081cc;
	background-color: #e5f2fa
}

.menu-page .menu-table table>tbody>tr.active .td-operation-btn,
	.menu-page .menu-table table>tbody>tr:hover .td-operation-btn {
	display: block
}

.menu-page .menu-table table>tbody>tr {
	border: 1px solid #cfcfcf;
	font-size: 14px;
	background-color: #fbfcfe
}

.menu-page .menu-table table>tbody>tr>td.ant-table-selection-column:first-child
	{
	margin: 0;
	padding: 0
}

.menu-page .menu-table table>tbody>tr>td.ant-table-selection-column:first-child input[type=checkbox]
	{
	text-align: center
}

.menu-page .menu-table table>tbody>tr>td:last-child {
	width: 60px;
	padding: 0
}

.menu-page .menu-table table>tbody>tr>td.no-operation:last-child {
	width: auto;
	padding: 9px 0 9px 11px
}

.menu-page .menu-table table>tbody>tr>td {
	border: 1px solid #cfcfcf;
	padding: 9px 0 9px 11px
}

.menu-page .menu-table table>tbody>tr>td>a {
	color: #737373;
	margin-left: 10px
}

.menu-page .menu-table table>tbody>tr:nth-child(2n) {
	background-color: #f5f8fb
}

.menu-page .menu-table table>tbody>tr.unused {
	border: 1px solid #cfcfcf;
	color: #c8cac8
}

.menu-page .menu-table table>tbody>tr:hover {
	border: 1px solid #0081cc;
	color: #78858d;
	background-color: #e5f2fa
}

.menu-page .menu-table table>tbody>tr:hover>td {
	padding: 9px 0 9px 11px
}

.menu-page .menu-table table>tbody>tr:hover>td:last-child {
	border: 1px solid #cfcfcf;
	width: 60px;
	padding: 0
}

.menu-page .menu-table table>tbody>tr:hover>td.no-operation:last-child {
	width: auto;
	padding: 9px 0 9px 11px
}

.menu-page .menu-table table>tbody>tr:hover>td>a {
	color: #737373;
	margin-left: 10px
}

.menu-page .menu-table table>tbody>tr:hover.unused {
	border: 1px solid #cfcfcf;
	color: #c8cac8;
	background-color: #fafefa
}

.menu-page .menu-tree {
	menuheight: 540px;
	margin-top: 0;
	border: 1px solid #cfcfcf
}

.menu-page .menu-tree>a, .menu-page .menu-tree>span, .menu-page .menu-tree>ul li
	{
	padding: 0
}

.menu-page .show-sign {
	text-decoration: none
}

.menu-page .tree-header {
	padding: 9px 0 9px 10px;
	background-color: #f7f7f7;
	border-bottom: 1px solid #bac7cf;
	font-size: 9pt;
	position: relative
}

.menu-page .tree-header .tree-plus {
	float: left;
	position: absolute;
	left: 80%;
	top: 8px
}

.menu-page .pagination {
	margin-top: 10px
}

.menu-page .menu-delete-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	padding: 5px 9pt 4px 10px;
	background-color: #f35951;
	margin-left: 20px
}

.menu-page .menu-delete-btn font {
	vertical-align: inherit
}

.menu-page .menu-delete-btn i {
	margin-right: 9px;
	font-size: 14px
}

.menu-page .menu-add-btn {
	padding: 9px 40px 8px;
	border-radius: 3px;
	border: none;
	color: #fff;
	cursor: pointer;
	padding: 0 9pt 0 10px;
	padding: 5px 9pt 4px 10px;
	background-color: #0081cc
}

.menu-page .menu-add-btn font {
	vertical-align: inherit
}

.menu-page .menu-add-btn i {
	margin-right: 9px;
	font-size: 14px
}

.Utopnav {
	float: left;
	border-left: 1px solid #ccc;
	padding-left: 20px;
	padding-right: 20px;
	position: relative;
	font-size: 18px
}

.menu-page .select {
	margin-top: 10px
}

.post-company #post-compinput {
	height: 30px;
	width: 190px;
	border: 1px solid #e2e2e2;
	border-radius: 4px 0 0 4px;
	float: left;
	cursor: pointer;
	padding-left: 10px;
	overflow: hidden;
	white-space: nowrap;
	text-overflow: ellipsis
}

.post-company .post-inputDiv .post-inputBtn {
	float: left;
	height: 30px;
	width: 50px;
	text-align: center;
	padding-top: 2px;
	margin-left: -1px;
	border: 1px solid #e2e2e2;
	background-color: #f5f5f5;
	cursor: pointer;
	color: #616161;
	border-radius: 0 4px 4px 0
}

#post-compinput::-webkit-input-placeholder {
	color: #c1c1c1 !important
}

#post-compinput:-moz-placeholder, #post-compinput::-moz-placeholder {
	color: #c1c1c1 !important
}

#post-compinput:-ms-input-placeholder {
	color: #c1c1c1 !important
}

.menu-page .menu-right .top {
	margin-bottom: 10px;
	height: 30px
}

.menu-page .pagination {
	margin-top: 10px;
	float: right
}

.icon-shouqi {
	margin-left: 9pt
}

.iconhidden {
	display: none;
	background-color: #fff;
	border: 1px solid #333;
	width: 485px;
	margin-left: 0;
	padding: 10px 0 5px 20px
}

.iconhidden .icon-left {
	margin-right: 20px
}

.iconshow {
	display: block;
	background-color: #fff;
	border: 1px solid #c4c4c4;
	width: 506px;
	position: absolute;
	border-radius: 2px;
	z-index: 10;
	margin-left: 0;
	margin-top: 5px;
	padding: 10px 0 5px 20px
}

.iconshow .icon-left {
	margin-right: 20px
}
</style>
<style type="text/css">
@font-face {
	font-family: appIcon;
	src:
		url(/workbench-integration-ui/build/uap-iconfont.eot?b5ac466695e6c50930b0b30a4fcda19e);
	src: url('uap-iconfont.eot?t=1466664306#iefix')
		format('embedded-opentype'), url('uap-iconfont.woff?t=1466664306')
		format('woff'), url('uap-iconfont.ttf?t=1466664306')
		format('truetype'), url('uap-iconfont.svg?t=1466664306#iconfont')
		format('svg')
}

.appIcon {
	font-family: appIcon !important;
	font-size: 1pc;
	font-style: normal;
	-webkit-font-smoothing: antialiased;
	-webkit-text-stroke-width: .2px;
	-moz-osx-font-smoothing: grayscale
}

.icon-C-music:before {
	content: "\E601"
}

.icon-C-photo:before {
	content: "\E602"
}

.icon-C-heart:before {
	content: "\E604"
}

.icon-C-book:before {
	content: "\E605"
}

.icon-C-phone:before {
	content: "\E607"
}

.icon-C-lock:before {
	content: "\E608"
}

.icon-C-html5:before {
	content: "\E609"
}

.icon-C-oslinux:before {
	content: "\E60A"
}

.icon-C-gears:before {
	content: "\E60D"
}

.icon-C-fire:before {
	content: "\E60E"
}

.icon-C-flags:before {
	content: "\E610"
}

.icon-C-ioscloud:before {
	content: "\E611"
}

.icon-C-iconfontplane:before {
	content: "\E612"
}

.icon-C-facetime:before {
	content: "\E613"
}

.icon-C-win:before {
	content: "\E614"
}

.icon-C-github:before {
	content: "\E615"
}

.icon-C-bug:before {
	content: "\E616"
}

.icon-C-desktop:before {
	content: "\E617"
}

.icon-C-money:before {
	content: "\E618"
}

.icon-C-qrcode:before {
	content: "\E619"
}

.icon-C-suitcase:before {
	content: "\E61A"
}

.icon-C-bookmarks:before {
	content: "\E626"
}

.icon-C-uesrs:before {
	content: "\E627"
}

.icon-C-dribble:before {
	content: "\E61D"
}

.icon-C-android:before {
	content: "\E60B"
}

.icon-C-app:before {
	content: "\E60C"
}

.icon-C-authorization:before {
	content: "\E60F"
}

.icon-C-chemical:before {
	content: "\E61B"
}

.icon-C-favorite:before {
	content: "\E61C"
}

.icon-C-gift:before {
	content: "\E61E"
}

.icon-C-home:before {
	content: "\E61F"
}

.icon-C-more:before {
	content: "\E620"
}

.icon-C-organization:before {
	content: "\E621"
}

.icon-C-palette:before {
	content: "\E622"
}

.icon-C-setting:before {
	content: "\E623"
}

.icon-C-statistical:before {
	content: "\E624"
}

.icon-C-tea:before {
	content: "\E625"
}

.icon-C-electricity:before {
	content: "\E628"
}

.icon-C-enterprise:before {
	content: "\E629"
}

.icon-C-erp:before {
	content: "\E62A"
}

.icon-C-maintain:before {
	content: "\E62B"
}

.icon-C-organizationicon:before {
	content: "\E62C"
}

.icon-C-requisition:before {
	content: "\E62D"
}

.icon-C-role:before {
	content: "\E62E"
}

.icon-C-salestogether:before {
	content: "\E62F"
}

.icon-C-sales:before {
	content: "\E630"
}

.icon-C-shopping:before {
	content: "\E631"
}

.icon-C-subscription:before {
	content: "\E635"
}

.icon-C-source:before {
	content: "\E636"
}

.icon-C-apple:before {
	content: "\E603"
}

.icon-C-pad:before {
	content: "\E606"
}

.icon-C-car:before {
	content: "\E637"
}

.icon-C-c1688:before {
	content: "\E600"
}

.icon-C-capprove:before {
	content: "\E632"
}

.icon-C-cauth:before {
	content: "\E633"
}

.icon-C-ccarright:before {
	content: "\E634"
}

.icon-C-classg:before {
	content: "\E638"
}

.icon-C-cclassy:before {
	content: "\E639"
}

.icon-C-cdelivery:before {
	content: "\E63A"
}

.icon-C-centerprise:before {
	content: "\E63B"
}

.icon-C-cgoods:before {
	content: "\E63C"
}

.icon-C-cinquiry:before {
	content: "\E63D"
}

.icon-C-cinvioce:before {
	content: "\E63E"
}

.icon-C-cmaterial:before {
	content: "\E63F"
}

.icon-C-coffer:before {
	content: "\E640"
}

.icon-C-corder:before {
	content: "\E641"
}

.icon-C-corg:before {
	content: "\E642"
}

.icon-C-cpro:before {
	content: "\E643"
}

.icon-C-cprocess:before {
	content: "\E644"
}

.icon-C-csecurity:before {
	content: "\E645"
}

.icon-C-cshipping:before {
	content: "\E646"
}

.icon-C-cstorage:before {
	content: "\E647"
}

.icon-C-cgateway:before {
	content: "\E648"
}

.icon-C-cscalling:before {
	content: "\E649"
}

.icon-C-csupplier:before {
	content: "\E64A"
}

.icon-C-cusers:before {
	content: "\E64B"
}

.icon-C-handinvolice:before {
	content: "\E64C"
}

.icon-C-incoiceapply:before {
	content: "\E64D"
}

.icon-C-invoicehis:before {
	content: "\E64E"
}

.icon-C-invoiceinformation:before {
	content: "\E64F"
}

.icon-C-taxequipment:before {
	content: "\E650"
}

.icon-C-taxinformation:before {
	content: "\E651"
}

.icon-gongxiangfuwu:before {
	content: "\E652"
}

.icon-xitongshezhi:before {
	content: "\E653"
}

.icon-yuangongjiaqin:before {
	content: "\E654"
}
</style>
</head>


<body class="app-body">
	<div id="app_root">
		<div data-reactroot="">
			<div class="arch-web-content">
				<div class="content-app">
					<div class="crumb">
						<button class="back-btn-crumb">
							<i class="icon iconfont icon-fanhui"></i>
						</button>
						<span class="left-title">菜单管理</span><span><span
							class="iscrumb"><span data-router="/">首页</span><span>&nbsp;/&nbsp;</span></span><span
							class="last-crumb" data-router="/menu">菜单管理</span></span>
					</div>
					<div class="content-inner">
						<div class="container-fluid">
							<div class="menu-page">
								<div class="row">
									<div class="ant-col-6 menu-left">
										<div class="menu-tree">
											<div class="tree-header">
												<!-- react-text: 22 -->
												菜单列表
												<!-- /react-text -->
												<div class="tree-plus">
													<i type="plus" class="yyui-icon anticon anticon-plus"></i>
													<!-- react-text: 25 -->
													<!-- /react-text -->
												</div>
											</div>
											<div
												style="position: relative; overflow: hidden; width: 100%; height: 480px;">
												<div
													style="position: absolute; top: 0px; left: 0px; right: 0px; bottom: 0px; overflow: scroll; margin-right: -17px; margin-bottom: -17px;">
													<ul class="ant-tree" role="tree-node" unselectable="true">
														<li class=""><span
															class="ant-tree-switcher ant-tree-switcher-noop ant-tree-noline_docu"></span><a
															title="OA系统"><span class="ant-tree-title">OA系统</span></a></li>
														<li class=""><span
															class="ant-tree-switcher ant-tree-noline_close"></span><a
															title="系统配置"><span class="ant-tree-title">系统配置</span></a>
														<!-- react-empty: 100 --></li>
														<li class=""><span
															class="ant-tree-switcher ant-tree-switcher-noop ant-tree-noline_docu"></span><a
															title="综合信息管理系统"><span class="ant-tree-title">综合信息管理系统</span></a></li>
														<li class=""><span
															class="ant-tree-switcher ant-tree-switcher-noop ant-tree-noline_docu"></span><a
															title="NC财务管理系统"><span class="ant-tree-title">NC财务管理系统</span></a></li>
														<li class=""><span
															class="ant-tree-switcher ant-tree-switcher-noop ant-tree-noline_docu"></span><a
															title="NC总承包管理系统"><span class="ant-tree-title">NC总承包管理系统</span></a></li>
														<li class=""><span
															class="ant-tree-switcher ant-tree-switcher-noop ant-tree-noline_docu"></span><a
															title="人力资源系统"><span class="ant-tree-title">人力资源系统</span></a></li>
														<li class=""><span
															class="ant-tree-switcher ant-tree-switcher-noop ant-tree-noline_docu"></span><a
															title="知识管理系统"><span class="ant-tree-title">知识管理系统</span></a></li>
														<li class=""><span
															class="ant-tree-switcher ant-tree-noline_close"></span><a
															title="更多业务系统"><span class="ant-tree-title">更多业务系统</span></a>
														<!-- react-empty: 125 --></li>
														<li class=""><span
															class="ant-tree-switcher ant-tree-noline_close"></span><a
															title="其他链接"><span class="ant-tree-title">其他链接</span></a>
														<!-- react-empty: 130 --></li>
														<li class=""><span
															class="ant-tree-switcher ant-tree-noline_close"></span><a
															title="我的快捷"><span class="ant-tree-title">我的快捷</span></a>
														<!-- react-empty: 135 --></li>
													</ul>
												</div>
												<div
													style="position: absolute; height: 6px; right: 2px; bottom: 2px; left: 2px; border-radius: 3px; cursor: pointer;">
													<div
														style="position: relative; display: block; height: 100%; cursor: pointer; border-radius: inherit; background-color: rgba(0, 0, 0, 0.2); width: 0px;"></div>
												</div>
												<div
													style="position: absolute; width: 6px; right: 2px; bottom: 2px; top: 2px; border-radius: 3px; cursor: pointer;">
													<div
														style="position: relative; display: block; width: 100%; cursor: pointer; border-radius: inherit; background-color: rgba(0, 0, 0, 0.2); height: 0px;"></div>
												</div>
											</div>
										</div>
									</div>
									<div class="ant-col-16 menu-right">
										<div class="top">
											<div class="head-operation">
												<div class="ant-col-14">
													<div class="Utopnav">菜单详情</div>
												</div>
												<div class="ant-col-6 menu-icon">
													<i type="edit" title=""
														class="yyui-icon anticon anticon-edit"
														data-id="7b94e0694fe44e848220b6d24a9be2db"></i>
													<!-- react-text: 40 -->
													&nbsp; &nbsp; &nbsp; &nbsp;
													<!-- /react-text -->
													<i type="delete" title=""
														class="yyui-icon anticon anticon-delete"
														data-id="7b94e0694fe44e848220b6d24a9be2db"></i>
												</div>
											</div>
										</div>
										<form class="ant-form ant-form-horizontal">
											<div class="ant-row ant-form-item hidden">
												<div class="">
													<div class="ant-form-item-control has-success">
														<span class="ant-input-wrapper"><input type="text"
															id="id" value="7b94e0694fe44e848220b6d24a9be2db"
															data-__meta="[object Object]"
															class="ant-input ant-input-lg"></span>
													</div>
												</div>
											</div>
											<!-- react-text: 48 -->
											<!-- /react-text -->
											<div class="ant-row ant-form-item edit-menu-label">
												<div class="ant-col-6 ant-form-item-label">
													<label class="">菜单名称</label>
												</div>
												<div class="ant-col-12">
													<div class="ant-form-item-control ">
														<div class="detail-font">OA系统</div>
													</div>
												</div>
											</div>
											<div class="ant-row ant-form-item edit-menu-label">
												<div class="ant-col-6 ant-form-item-label">
													<label class="">菜单编码</label>
												</div>
												<div class="ant-col-12">
													<div class="ant-form-item-control ">
														<div class="detail-font">002</div>
													</div>
												</div>
											</div>
											<div class="ant-row ant-form-item edit-menu-label">
												<div class="ant-col-6 ant-form-item-label">
													<label class="">图标</label>
												</div>
												<div class="ant-col-12">
													<div class="ant-form-item-control ">
														<i class="appIcon"></i>
													</div>
												</div>
											</div>
											<div class="ant-row ant-form-item edit-menu-label">
												<div class="ant-col-6 ant-form-item-label">
													<label class="">虚菜单</label>
												</div>
												<div class="ant-col-12">
													<div class="ant-form-item-control ">
														<div class="detail-font">否</div>
													</div>
												</div>
											</div>
											<div class="ant-row ant-form-item edit-menu-label">
												<div class="ant-col-6 ant-form-item-label">
													<label class="">应用编码</label>
												</div>
												<div class="ant-col-12">
													<div class="ant-form-item-control ">
														<div class="detail-font">OA</div>
														<!-- react-text: 79 -->
														<!-- /react-text -->
													</div>
												</div>
											</div>
											<div class="ant-row ant-form-item edit-menu-label">
												<div class="ant-col-6 ant-form-item-label">
													<label class="">显示序号</label>
												</div>
												<div class="ant-col-12">
													<div class="ant-form-item-control ">
														<div class="detail-font">1</div>
													</div>
												</div>
											</div>
										</form>
										<div class="edit-menu-opr-fixd">
											<div class="ant-row">
												<div class="ant-col-18 ant-col-offset-6">
													<!-- react-text: 89 -->
													<!-- /react-text -->
													<!-- react-text: 90 -->
													&nbsp;&nbsp;&nbsp;&nbsp;
													<!-- /react-text -->
													<!-- react-text: 91 -->
													<!-- /react-text -->
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<script src="http://cdn.bootcss.com/jquery/2.2.4/jquery.min.js"></script>
	<script src="http://cdn.bootcss.com/echarts/3.2.3/echarts.min.js"></script>
	<!--应用库-->
	<script src="js/vendor.dll.js"></script>
	<script src="js/common.js"></script>
	<script src="js/antd.js"></script>
	<script src="js/lodash.js"></script>
	<script src="js/yylibui.js"></script>
	<script src="js/bundle.js"></script>

</body>
</html>