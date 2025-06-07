<?php

$v1 = 3;
$v2 = 9;

if ($v1 < $v2) {
    echo "valores intermediários entre $v1 e $v2:\n";
    for($i = $v1 + 1;$i < $v2; $i++) {
        echo $i . "\n";
    }
} else {
    echo "o valor 1 precisa ser menor que o valor 2";
}