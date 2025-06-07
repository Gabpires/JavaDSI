<?php

$notas = [6, 5, 5];
$media = array_sum($notas) / count($notas);

if($media >= 6) {
        echo "A média é $media e o aluno está aprovado";
} else {
        echo "A média é $media e o aluno está reprovado";
}
