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

          <!-- テーブル -->
          <table class="table table-striped table-bordered table-hover table-condensed">
            <thead class="main-background-color">
              <tr>
                <th class="text-center">No</th>
                <th class="text-center">キーワード</th>
                <th class="text-center">説明</th>
              </tr>
            </thead>
            <c:forEach var="questionDto" items="${questionDtoList}" varStatus="status">
              <tr>
                <td class="text-center"><c:out value="${status.count}"></c:out></td>
                <td><c:out value="${questionDto.keyword}"></c:out></td>
                <td><c:out value="${questionDto.description}"></c:out></td>
              </tr>
            </c:forEach>
          </table>
        </div>
      </div>

    </div>
  </form:form>

  <jsp:include page="../common/footer.jsp" />
</body>
</html>