<?php

$nome = "Gabriel Pires Vilanova Albuquerque";

$quantcaracteres = strlen($nome);

echo "O nome é $nome<br>"; 
echo "A quantidade de caracteres é: $quantcaracteres";

for ($i = 0; $i < $quantcaracteres; $i++) {
    echo $i . "\n" . '<br>';
}