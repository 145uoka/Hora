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
          <div class="alert alert-info" role="alert" align="left">
            <h5>
              <c:out value="ルール" />
            </h5>
            <ul>
              <li><c:out value="氏名を入力し開始。全キーワードを打鍵で入力し、回答ボタン押下で終了" />
              <li><c:out value="キーボードのホームポジションは守ること" />
              <li><c:out value="各項目を入力し終わったら、TABキーで次のフォームへ移動します。早く入力する秘訣" />
            </ul>
          </div>

          <%@include file="/WEB-INF/fragment/messages.jspf"%>
        </div>
      </div>

      <div class="row">
        <div class="col-md-offset-1 col-md-10">
          <div class="panel panel-default main-border-color">
            <div class="panel-body sub-background-color">
              <div class="form-group">
                <label class="col-md-2 control-label"><span class="label label-danger" style="margin-right: 10px">必須</span>氏名</label>
                <div class="col-md-4">
                  <form:input path="userName" class="form-control" />
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>

      <div class="row">
        <div class="col-md-offset-1 col-md-10" align="center">
          <table style="margin-bottom: 20px">
            <tr>
              <td style="vertical-align: middle;">
              <td style="vertical-align: middle;">
                <button id="startButton" type="button" class="btn btn-success" onClick="challengeStart()">
                  <i class="glyphicon glyphicon-play-circle"></i>&nbsp;&nbsp;&nbsp;開始
                </button>
              </td>
            </tr>
          </table>
        </div>
      </div>

      <div class="row">
        <div class="col-md-offset-1 col-md-10">
          <div class="panel panel-default main-border-color">
            <div class="panel-body sub-background-color">
              <c:forEach var="list" items="${questionDtoList}" varStatus="status">
                <div class="form-group">
                  <label class="col-md-4 control-label"><c:out value="${list.keyword}"></c:out></label>
                  <div class="col-md-6">
                    <form:input path="answer[${list.questionId}]" class="form-control" disabled="true" />
                  </div>
                </div>
              </c:forEach>
            </div>
          </div>
        </div>

        <form:hidden path="startTime" />
        <form:hidden path="endTime" />

        <div class="row">
          <div class="col-md-offset-1 col-md-10" align="center">
            <table style="margin-bottom: 20px">
              <tr>
                <td style="vertical-align: middle;">
                  <button id="answerButton" type="button" class="btn btn-info" onClick="answer()" disabled="true">
                    <i class="glyphicon glyphicon-floppy-save"></i>&nbsp;&nbsp;&nbsp;回答
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

  <script type="text/javascript">
  function challengeStart() {

    // 「OK」時の処理終了

    if ($("#userName").val() == "") {
        alert("氏名を入力してください");
        return;
    }

    if (window.confirm('開始しますか？')) {
        $("input").prop('disabled', false);
        $("#startButton").prop('disabled', true);
        $("#answerButton").prop('disabled', false);
        $("#startTime").val((new Date).getTime());
        $('#answer1').focus();
    }
  }

  function answer() {
      blocUIOn();
      $("#endTime").val((new Date).getTime());
      $("#loading").hide();
      document.form.submit();
  }

  function blocUIOn() {
      $.blockUI({
          message: '<p><img src="${pageContext.request.contextPath}/resources/img/gif-load.gif" style="vertical-align:middle;" /> 読み込み中...</p>' ,
          css: {
              border: 'none',
              padding: '10px',
              backgroundColor: '#333',
              opacity: .5,
              color: '#fff'
          },
          overlayCSS: {
              backgroundColor: '#000',
              opacity: 0.6
          }
      });
  }

  function blocUIOff() {
      $.unblockUI();
  }
</script>

</body>
</html>