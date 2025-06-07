<?php 

// informar os números dos meses dentro do array
$meses = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12];

foreach($meses as $mes) {
    switch($mes) {
        case 1:
            echo "Janeiro" . '<br>';
            break;
        case 2:
            echo "Fevereiro" . '<br>';
            break;
        case 3:
            echo "Março" . '<br>';
            break;
        case 4:
            echo "Abril" . '<br>';
            break;
        case 5:
            echo "Maio" . '<br>';
            break;
        case 6:
            echo "Junho" . '<br>';
            break;
        case 7:
            echo "Julho" . '<br>';
            break;
        case 8:
            echo "Agosto" . '<br>';
            break;
        case 9:
            echo "Setembro" . '<br>';
            break;
        case 10:
            echo "Outubro" . '<br>';
            break;
        case 11: 
            echo "Novembro" . '<br>';
            break;
        case 12:
            echo "Dezembro" . '<br>';
            break;
        default:
        echo "Não existe mês com esse número";
        break;
    }
}