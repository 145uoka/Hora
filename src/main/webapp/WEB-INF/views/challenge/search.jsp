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
  <form:form modelAttribute="form" method="post" name="form" action="${pageContext.request.contextPath}/genre/search" class="form-horizontal">

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

      <%-- 検索条件パネル --%>
      <div class="row">
        <div class="panel panel-default">
          <div class="panel-heading">
            <div class="panel-title">検索条件</div>
          </div>

          <div class="panel-body">
            <div class="row">

              <div class="form-group <ext:isErrors path='genreId' value='has-error' />">
                <label class="col-md-4 control-label">ジャンルID</label>
                <div class="col-md-6">
                  <form:input path="genreId" class="form-control" placeholder="半角数字"/>
                </div>
                <div style="clear: both;">
                  <span class="col-md-4"></span>
                  <div class="col-md-6">
                    <form:errors path="genreId" element="div" cssClass="text-danger" />
                  </div>
                </div>
              </div>
              <div class="form-group <ext:isErrors path='genreName' value='has-error' />">
                <label class="col-md-4 control-label">ジャンル名</label>
                <div class="col-md-6">
                  <form:input path="genreName" class="form-control" />
                </div>
                <div style="clear: both;">
                  <span class="col-md-4"></span>
                  <div class="col-md-6">
                    <form:errors path="genreName" element="div" cssClass="text-danger" />
                  </div>
                </div>
              </div>
              <div class="form-group <ext:isErrors path='deleteFlag' value='has-error'/>">
                <label class="col-md-4 control-label">有効／無効</label>
                <div class="col-md-6">
                  <form:select path="deleteFlag" class="form-control" items="${selectableDelFlgList}" itemLabel="label" itemValue="value" />
                </div>
                <div style="clear: both;">
                  <span class="col-md-4"></span>
                  <div class="col-md-6">
                    <form:errors path="deleteFlag" element="div" cssClass="text-danger" />
                  </div>
                </div>
              </div>

              <div class="row">
                <div class=" form-group ">
                  <button type="submit" class="center-block btn btn-primary">
                    <i class="glyphicon glyphicon-search"></i>&nbsp;&nbsp;&nbsp;検索する
                  </button>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <!-- ボタン -->
      <div class="row">
        <div class="col-md-offset-1 col-md-10" align="center">
          <table style="margin-bottom: 20px">
            <tr>
              <td style="vertical-align: middle;">
              <a type="button" href="${pageContext.request.contextPath}/genre/create" class="btn btn-success" >
              <i class="glyphicon glyphicon-plus-sign"></i>&nbsp;&nbsp;&nbsp;新規追加</a></td>
            </tr>
          </table>
        </div>
      </div>

      <!-- テーブル -->
      <div class="row">
        <table class="table table-striped table-bordered table-hover table-condensed">
          <thead class="main-background-color">
            <tr>
              <th class="text-center">No</th>
              <th class="text-center">ジャンルID</th>
              <th class="text-center">ジャンル名</th>
              <th class="text-center">有効／無効</th>
            </tr>
          </thead>
          <c:forEach var="list" items="${genreDtoList}" varStatus="status">
            <tr>
              <td class="text-center"><c:out value="${status.count}"></c:out></td>
              <td class="text-center"><c:out value="${list.genreId}" /></td>
              <td class="text-center"><a href="${pageContext.request.contextPath}/genre/detail?genreId=${list.genreId}"> <c:out value="${list.genreName}" /></a></td>
              <td class="text-center"><c:choose>
                  <c:when test="${list.deleteFlag}">
                  <span class="label label-danger" style="margin-left: 10px">無効</span>
                  </c:when>
                  <c:otherwise>
                    <span class="label label-success" style="margin-left: 10px">有効</span>
                  </c:otherwise>
                </c:choose></td>
            </tr>
          </c:forEach>
        </table>
      </div>
    </div>
  </form:form>
  <jsp:include page="../common/footer.jsp" />
</body>
</html>