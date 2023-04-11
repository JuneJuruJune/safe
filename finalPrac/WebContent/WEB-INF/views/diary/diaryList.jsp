<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>
@font-face {
	font-family: 'Pretendard-Regular';
	src:
		url('https://cdn.jsdelivr.net/gh/Project-Noonnu/noonfonts_2107@1.1/Pretendard-Regular.woff')
		format('woff');
	font-weight: 120;
	font-style: normal;
}

#frame {
	max-width: 1000px;
	min-height: 300px;
	margin: 0 auto;
}

body {
	font-family: 'Pretendard-Regular';
}

.container{

	justify-content: center;
}
</style>

<div id="frame">
	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">�ѹ�</th>
					<th scope="col">����</th>
					<th scope="col">�ۼ���</th>
					<th scope="col">����</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="e" items="${list}">
					<tr>
						<td>${e.dno }</td>
						<td>${e.dtitle }</td>
						<td>${e.dwriter }</td>
						<td>${e.dimg }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<div class="btngroup">
		<a href="../diary/diaryForm"><button type="button" class="btn btn-secondary">�� �ۼ�</button></a>
	</div>
</div>

<script>

</script>