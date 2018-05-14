<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>
<!DOCTYPE html>
<html lang="ja">
<head>
<meta charset="utf-8">
<jsp:include page="../common/common.jsp" />
</head>

<body>

  <jsp:include page="../common/header.jsp" />
  <form:form modelAttribute="form" method="post" autocomplete="off" name="form" action="${pageContext.request.contextPath}/challenge/answer" class="form-horizontal">

    <div class="container">

      <%-- 画面タイトル --%>
      <div class="row">
        <div class="col-md-offset-1 col-md-10">
          <h3>
            <c:out value="${displayTitle}" />
          </h3>
        </div>
      </div>

      <%-- メッセージ領域 --%>
      <div class="row">
        <div class="col-md-offset-1 col-md-10">
          <%@include file="/WEB-INF/fragment/messages.jspf"%>
        </div>
      </div>

      <div class="row">
        <table class="table link_table table-striped table-bordered table-hover table-condensed">
          <thead class="main-background-color">
            <tr>
              <th class="text-center">Ranking</th>
              <th class="text-center">スコア</th>
              <th class="text-center">氏名</th>
              <th class="text-center">正答数</th>
              <th class="text-center">正答率</th>
              <th class="text-center">経過時間</th>
              <th class="text-center">実施日時</th>
            </tr>
          </thead>
          <c:forEach var="challengeResultDto" items="${challengeResultDtoList}" varStatus="status">
          <c:choose>
                <c:when test="${challengeResultDto.detailCleanFlag}">
                  <tr>
                </c:when>
                <c:otherwise>
                  <tr data-href="${pageContext.request.contextPath}/challenge/history/${challengeResultDto.challengeHistoryId}">
                </c:otherwise>
              </c:choose>
            <td class="text-center"><c:out value="${status.count}"></c:out></td>
            <td class="text-center"><c:out value="${challengeResultDto.score}"></c:out></td>
            <td class="text-center"><c:out value="${challengeResultDto.userName}"></c:out></td>
            <td class="text-center"><c:out value="${challengeResultDto.correctSum}"></c:out></td>
            <td class="text-center"><c:out value="${challengeResultDto.attendanceRate}%"></c:out></td>
            <td class="text-center"><c:out value="${challengeResultDto.elapsedTime}"></c:out></td>
            <td class="text-center">
              <c:choose>
                <c:when test="${challengeResultDto.today}">
                  <span class="label label-danger" style="margin-left: 10px">NEW</span>
                </c:when>
              </c:choose>
              <c:out value="${challengeResultDto.registerDatetime}"></c:out>
            </td>
            </tr>
          </c:forEach>
        </table>
      </div>
    </div>
  </form:form>

  <jsp:include page="../common/footer.jsp" />

  <script type="text/javascript">
  $(function() {
    	$('.link_table tr').hover(function() {
    		$(this).addClass('hover_tr');
    		$('tbody tr[data-href]').addClass('clickable').click( function() {
    			window.location = $(this).attr('data-href');
    		}).find('a').hover( function() {
    			$(this).parents('tr').unbind('click');
    		}, function() {
    			$(this).parents('tr').click( function() {
    				window.location = $(this).attr('data-href');
    			});
    		});
    	}, function() {
    		$(this).removeClass('hover_tr');
    	});
    });
</script>

</body>
</html>