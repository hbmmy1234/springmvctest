<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/7/3
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>
<head>
    <title>测试JSON交互</title>
    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
    <script type="text/javascript"
            src="${pageContext.request.contextPath }/js/jquery-1.11.0.min.js">
    </script>
    <script type="text/javascript">
        function testJson() {
            //
            var name = $("#name").val();
            var password = $("#password").val();
            $.ajax({
                    url : "${pageContext.request.contextPath }/user/testJson",
                    type : "post",
                    data : JSON.stringify({name: name, password: password}),
                    contentType : "application/json;charset=UTF-8",
                    dataType : "json",
                    success : function(data) {
                      if(data != null){
                          alert("您输入的用户名为："+data.name+
                                     "密码为："+data.password);
                      }
                    }
            });
        }

    </script>
</head>
<body>
    <form>
        用户名：<input type="text" name="username" id="name"><br />
        密&nbsp;&nbsp;&nbsp;码:
          <input type="password" name="password" id="password"> <br />
          <input type="button" value="测试JSON交互" onclick="testJson()" />
    </form>
</body>
</html>
