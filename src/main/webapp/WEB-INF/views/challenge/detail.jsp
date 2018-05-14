<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="/WEB-INF/fragment/taglib-includes.jspf"%>

<html>
<head>
<jsp:include page="/WEB-INF/views/common/common.jsp" />

</head>
<body>
  <jsp:include page="../common/header.jsp" />
  <form:form modelAttribute="form" method="get" name="form" action="${pageContext.request.contextPath}/genre/edit" class="form-horizontal">

    <%-- コンテンツエリア --%>
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

      <%-- パネル --%>
      <div class="row">
        <div class="panel panel-default">
          <div class="panel-heading">
            <div class="panel-title">イベント詳細</div>
          </div>

          <div class="panel-body">
            <div class="row">
              <div class="col-md-offset-2 col-md-8">

                <!-- テーブル -->
                <table class="table table-striped table-bordered table-hover table-condensed">
                  <tr>
                    <th class="text-center col-xs-3 col-ms-3 col-md-4 col-lg-4" style="background-color: #9ED78F;">ジャンルID</th>
                    <td class="text-center"><c:out value="${genreDto.genreId}" /></td>
                  </tr>
                  <tr>
                    <th class="text-center col-xs-3 col-ms-3 col-md-4 col-lg-4" style="background-color: #9ED78F;">ジャンル名</th>
                    <td class="text-center"><c:out value="${genreDto.genreName}" /></td>
                  </tr>
                  <tr>
                    <th class="text-center col-xs-3 col-ms-3 col-md-4 col-lg-4" style="background-color: #9ED78F;">有効／無効</th>
                    <td class="text-center"><c:choose>
                        <c:when test="${list.deleteFlag}">
                          <span class="label label-danger" style="margin-left: 10px">無効</span>
                        </c:when>
                        <c:otherwise>
                          <span class="label label-success" style="margin-left: 10px">有効</span>
                        </c:otherwise>
                      </c:choose></td>
                  </tr>
                </table>
              </div>
            </div>
          </div>
        </div>
      </div>

      <form:hidden path="genreId"/>

      <!-- ボタン -->
      <div class="row">
        <div class="col-md-offset-1 col-md-10" align="center">
          <table style="margin-bottom: 20px">
            <tr>
              <td style="vertical-align: middle;"><button type="submit" class="center-block btn btn-warning">
                  <i class="glyphicon glyphicon-edit"></i>&nbsp;&nbsp;&nbsp;修正する
                </button></td>
              <td><label class="space" style="width: 30px;"></label></td>
              <td style="vertical-align: middle;">
              <a type="button" class="btn btn-danger" onClick="deleteConfirmation()">
              <i class="glyphicon glyphicon-trash"></i>&nbsp;&nbsp;&nbsp;削除する</a></td>
            </tr>
          </table>
        </div>
      </div>

    </div>
  </form:form>
  <jsp:include page="../common/footer.jsp" />

  <script type="text/javascript">
  function deleteConfirmation() {

    // 「OK」時の処理終了
    if (window.confirm('削除しますか？')) {
      document.form.action = "${pageContext.request.contextPath}/genre/delete";
      document.form.method = "post";
      document.form.submit();
    }
  }
</script>
</body>
</html>