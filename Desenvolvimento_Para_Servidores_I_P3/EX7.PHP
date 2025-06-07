<?php

//informar salário
$salario = 400;

switch($salario) {
    case $salario <= 300:
        $salarioreajusta = $salario + $salario * 0.5;
    echo "o salário com reajuste ficou em R$$salarioreajusta";
    break;
    case $salario > 300:
        $salarioreajusta = $salario + $salario * 0.3;
        echo "o salário com reajuste ficou em R$$salarioreajusta";
    break;
    default:
    echo "informar salário";
    break;
}