<?php

// 1 = cliente comum, 2 = funcionário, 3 = cliente vip
$codigocliente = 1;

$preco = 100.00;

switch($codigocliente) {
    case 1:
     $precofinal = $preco;
     echo "o preço final é R$$precofinal sem desconto";
     break;
    case 2:
     $precofinal = $preco - $preco * 0.1;
     echo "o preço final com desconto é R$$precofinal";
     break;
    case 3:
        $precofinal = $preco - $preco * 0.05;
        echo "o preço final com desconto é R$$precofinal";
        break;
    default:
     echo "informar código do tipo do cliente";
     break;
}
