<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Document</title>
</head>
<body>
  <ul>
  <?php
    // Input Value 확인
    $uid = $_GET["uid"];
    $password = $_GET["password"];
    echo "<li>사용자 id는 ".$uid."입니다.</li>";
    echo "<li>패스워드는 ".$password."입니다.</li>";
    if($password == "1111"){
        echo "주인님 환영합니다";
    } else {
        echo "뉘신지?";
    }
    echo("<h2>아래는 While Loop 테스트</h2>");
    $i = 0;
    while($i < 10){
      echo "<li>Hello World!</li>";
      $i += 1;
    }
   ?>
 </ul>
</body>
</html>
