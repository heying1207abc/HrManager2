<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt_rt" prefix="fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>人力资源管理系统</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
</head>

<body>
	<div class="top">
		<div class="global-width">
			<img src="Images/logo.gif" class="logo" />
		</div>
	</div>
	<jsp:include page="../../common/hrTop.jsp" />
	<div class="main">
		<div class="global-width">

			<jsp:include page="../../common/left.jsp" />
			<div class="action">
				<div class="t">简历信息</div>
				<div class="pages">
					<input type="text" id="recruitId" value="${recruitId }" /> <input
						type="text" id="resumeId" value="${resume.id }" />
					<table width="90%" border="0" cellspacing="0" cellpadding="0"
						class="addform-base">
						<caption>个人简历</caption>
						<tr>

							<td width="50%">姓 名：${resume.name }</td>
							<td width="50%">性 别：${resume.gender }</td>
						</tr>

						<tr>
							<td>出生日期：<fmt:formatDate value="${resume.birthday }"
									pattern="yyyy-MM-dd" /></td>
							<td>最高学历: ${resume.education }</td>
						</tr>
					</table>
					<p>&nbsp;</p>
					<table width="90%" border="0" cellspacing="0" cellpadding="0"
						id="tabItem" class="addform-base addform-item">
						<caption>学习经历</caption>
						<tr>
							<td>${resume.experience }</td>
						</tr>

						<!--表单提交行-->
						<tr>
							<td class="submit"><input type="submit" name="button"
								id="btn1" value="通知面试" class="submit_01" /> <input
								type="submit" name="button" id="btn2" value="返回"
								class="submit_01" /></td>
						</tr>

					</table>
				</div>
			</div>
		</div>
	</div>

	<div class="copyright">Copyright &nbsp; &copy; &nbsp; 2018~2020
		贺莹</div>
	<script type="text/javascript">
		$("#btn2").click(function() {
			history.back();
		});

		$("#btn1").click(function() {
			var date = prompt("请输入面试时间:", "");
			var recruitId = $("#recruitId").val();
			var resumeId = $("#resumeId").val();

			$.ajax({
				type : "POST",
				url : "sendNotice.action",
				data : "recruitId="+recruitId+"&resumeId="+resumeId+"&interviewTime="+date,
				success : function(msg) {
					alert("Data Saved: " + msg);
				}
			});
		});
	</script>
</body>
</html>