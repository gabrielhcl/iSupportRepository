<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="UTF-8">
    <title>ueditor demo</title>
    <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>


<style>
.selectpicker{
	width: 100%;
    height: 38px;
    border-radius: 6px;
}
</style>
<body>
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="page-header">
				<h1>
					iSupport <small>新闻发布</small>
				</h1>
			</div>
		</div>
	</div>
	
	<div class="row clearfix">
		<div class="col-md-3 column">
		</div>
		<div class="col-md-6 column">
			<form role="form">
				<div class="form-group">
				<label for="exampleInputEmail1">新闻类别</label>
				<select class="selectpicker" data-style="btn-white">
					<option>体育</option>
					<option>时政</option>
					<option>技术</option>
				</select>
				</div>
				<div class="form-group">
					 <label for="exampleInputEmail1">题目</label><input type="email" class="form-control" id="exampleInputEmail1" />
				</div>
				
				
				<div class="form-group">
				<div class="form-group">
					<label for="name">新闻简介</label>
					<textarea class="form-control" rows="3"></textarea>
				</div>
				</div>
				
				
				
				<div class="form-group">
					 <label for="exampleInputFile">新闻展示图片</label><input type="file" id="exampleInputFile" />
				</div>
				<div id="ueditor-input">
				<script id="container" name="content" type="text/plain">
        			
    			</script>
    			</div>
    			<br>
    			<div class="form-group">
					<label for="name">允许评论</label>
					<select class="form-control">
						<option>是</option>
						<option>否</option>
					</select>
				</div>
				<div class="form-group">
					<label for="name">新闻置顶</label>
					<select class="form-control">
						<option>是</option>
						<option>否</option>
					</select>
				</div>
    			<br>
				<button type="submit" class="btn btn-default">保存</button>
			</form>
		</div>
		<div class="col-md-3 column">
		</div>
	</div>
</div>

	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/plugins/utf8-jsp/ueditor.config.js" ></script>
    <!-- 编辑器源码文件 -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/plugins/utf8-jsp/ueditor.all.js"></script>
    <!-- 实例化编辑器 -->
    <script type="text/javascript">
        var ue = UE.getEditor('container');
	</script> 
</body>
</html>