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
        <div class="col-md-offset-1 col-md-10">
          <table class="table table-striped table-bordered table-hover table-condensed">
            <thead class="main-background-color">
              <tr>
                <th class="text-center">正答数</th>
                <th class="text-center">正答率</th>
                <th class="text-center">経過時間</th>
                <th class="text-center">スコア</th>
              </tr>
            </thead>
            <tr>
              <td class="text-center"><c:out value="${challengeResultDto.correctSum}"></c:out></td>
              <td class="text-center"><c:out value="${challengeResultDto.attendanceRate}%"></c:out></td>
              <td class="text-center"><c:out value="${challengeResultDto.elapsedTime}"></c:out></td>
              <td class="text-center"><c:out value="${challengeResultDto.score}"></c:out></td>
            </tr>
          </table>
        </div>
      </div>

      <div class="row">
        <div class="col-md-offset-1 col-md-10">
          <table class="table table-striped table-bordered table-hover table-condensed">
            <thead class="main-background-color">
              <tr>
                <th class="text-center">No</th>
                <th class="text-center">問題</th>
                <th class="text-center">解答</th>
                <th class="text-center">正否</th>
              </tr>
            </thead>
            <c:forEach var="detailDto" items="${detailDtoList}" varStatus="status">
              <tr>
                <td class="text-center"><c:out value="${status.count}"></c:out></td>
                <td class="text-center"><c:out value="${detailDto.keyword}"></c:out></td>
                <td class="text-center"><c:out value="${detailDto.answer}"></c:out></td>

                <td class="text-center">
                <c:choose>
                <c:when test="${detailDto.correctFlag}">
                <span class="label label-success"> <i class="	glyphicon glyphicon-ok"></i></span>
                  </c:when>
                  <c:otherwise>
                    <span class="label label-danger"> <i class="glyphicon glyphicon-remove"></i></span>
                  </c:otherwise>
                  </c:choose>
                  </td>
              </tr>
            </c:forEach>
          </table>
        </div>
      </div>
    </div>
  </form:form>

  <jsp:include page="../common/footer.jsp" />

  <script type="text/javascript">
  function challengeStart() {

  }

  function answer() {
    }
</script>

</body>
</html>