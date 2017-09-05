<!DOCTYPE html>
<!--
  egoing8.php(함수 테스트)에 parameter 받아서 처리하도록 개선
-->
<html>
<head>
  <meta charset="UTF-8">
  <title>Document</title>
</head>
<body>
  <h1>JavaScript</h1>
  <script>
    function power(input){
      return input *= input;
    }
    document.write("제곱 함수 호출 결과(JS) : "+power(3)+"<br />");
  </script>

  <?php
    function power($input){
      return $input *= $input;
    }
    echo "제곱 함수 호출 결과(PHP) : ".power(3)."<br />";
  ?>
  <p><h3>문서의 다른 곳에서 위 Function 호출 테스트</h3></p>
  <script type="text/javascript">
    document.write("제곱 함수 호출 결과(JS) : "+power(4)+"<br />");
  </script>

  <?php
    echo "제곱 함수 호출 결과(PHP) : ".power(4)."<br />";
  ?>
</body>
</html>
