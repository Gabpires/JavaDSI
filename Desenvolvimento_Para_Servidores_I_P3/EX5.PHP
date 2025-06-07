<?php 

$valor1 = 8;
$valor2 = 5;

// informar operação a ser usada
$operacao = "*";

switch($operacao) {
    case "-":
     $resultado = $valor1 - $valor2;
     echo "Resultado é $resultado";
     break;
    case "+":
     $resultado = $valor1 + $valor2;
     echo "Resultado é $resultado";
     break;
    case "/":
      $resultado = $valor1 / $valor2;
      echo "Resultado é $resultado";
      break;
     case "*":
      $resultado = $valor1 * $valor2;
      echo "Resultado é $resultado";
      break;
    default:
    echo "escolha uma operação!";
    break;
}