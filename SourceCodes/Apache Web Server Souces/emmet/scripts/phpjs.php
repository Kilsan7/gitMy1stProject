<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>Document</title>
</head>
<body>
  <h1>JavaScript</h>
  <script type="text/javascript">
    document.write("<p>10+20 결과</p>");
    document.write(10+20);
    document.write("<p>\"10\"+\"20\" 결과</p>");
    document.write("10"+"20");
  </script>
  <p></p>
  <?php
    echo "<h1>php</h1>";
    echo "This is a php code!";
    echo "<p></p>";
  ?>
  <?php
    /* phpjs.html과 동일한 내용으로 작성했다.
       확장자를 php로 하면 인식한다. 확장자가 html이면 plain text로 처리된다. 주의!
       --> httpd.conf File에서 html 문서도 인식하도록 수정함! */
    echo "Hello World!";
    echo "<p>10+20 실행</p>";
    echo 10+20;
    echo "<p>\"10\"+\"10\" 실행</p>";
    echo "10"+"20";
    echo "<p>\"10\".\"10\" 실행</p>";
    echo "10"."20";
    echo "<p></p>";
  ?>
</body>
</html>
