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
  <form:form modelAttribute="form" method="post" name="form" action="${pageContext.request.contextPath}/genre/update" class="form-horizontal">

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
          <div class="panel panel-default main-border-color">
            <div class="panel-body sub-background-color">
              <div class="form-group <ext:isErrors path='genreName' value='has-error'/> ">
                <label class="col-md-4 control-label">ジャンル名<span class="label label-danger" style="margin-left: 10px">必須</span></label>
                <div class="col-md-6">
                  <form:input path="genreName" class="form-control" maxlength="20" placeholder="ジャンル名" />
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
            </div>
          </div>
        </div>

        <form:hidden path="genreId"/>

        <div class="row">
          <div class="col-md-offset-1 col-md-10" align="center">
            <table style="margin-bottom: 20px">
              <tr>
                <td style="vertical-align: middle;">
                  <button type="submit" class="center-block btn btn-primary">
                    <i class="glyphicon glyphicon-floppy-save"></i>&nbsp;&nbsp;&nbsp;保存
                  </button>
                </td>
              </tr>
            </table>
          </div>
        </div>
      </div>
    </div>
  </form:form>

  <jsp:include page="../common/footer.jsp" />
</body>
</html>