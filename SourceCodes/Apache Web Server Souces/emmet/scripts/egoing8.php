<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Document</title>
</head>
<body>
  <h1>JavaScript</h1>
  <script>
    function a(){
      document.write("Hello JS Function<br />");
    }
    a();
  </script>

  <h1>php</h1>
  <?php
    function a(){
      echo "Hello PHP Function<br />";
    }
    a();
  ?>
  <p><h3>문서의 다른 곳에서 위 Function 호출 테스트</h3></p>
  <script type="text/javascript">
    a();
    a();
  </script>
  <?php
    a();
    a();
  ?>
</body>
</html>
