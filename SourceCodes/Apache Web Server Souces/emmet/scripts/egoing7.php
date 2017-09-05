<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Document</title>
</head>
<body>
  <h1>JavaScript</h1>
  <ul>
  <script>
    list = new Array("one", "two", "three", "John", "Johnson", "egoing");
                              // 이건 단순 array가 아니다. Array Object다!
                              // 그래서 Dot Operator 사용 가능!
    var i = 0;
    while(i < list.length) {
      document.write("<li>"+list[i]+"</li>");
      i += 1;
    }
  </script>
</ul>

  <h1>php</h1>
  <ul>
  <?php
    $list = array("one", "two", "three", "John", "Johnson", "egoing");

    // php에서 Array 크기 알아내는 방법 : count($array_name)
    $i = 0;
    while($i < count($list)){
      echo "<li>".$list[$i]."</li>";
      $i += 1;
    }
  ?>
</ul>
</body>
</html>
