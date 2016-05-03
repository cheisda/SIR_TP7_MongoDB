# SIR_TP7_MongoDB

#GUILHIN Romain - TRA Cheisda

Quelles sont les limites d’une base données orientées document ?

Il est difficile de faire des requetes complexes telles que des jointures ou autres.
La modélisation en document ne permet pas la même flexibilité dans les requêtes et les chargements de données que la modélisation relationnelle.

Quelles sont les types de données stockés dans Redis, que peut on faire comme types de requêtes ?

REDIS permet l'utilisation de différents types de données tels que des tableaux, des chaines, des listes etc... de manière simple.
L'utilisation de redis est très simple et la vitesse de lecture et d'écriture est vertigineuse 
Toutes les opérations sont atomiques, on ne risque pas d'avoir des soucis de concurrence d'accès à nos données. Par contre, il est impossible de requêter les valeurs comme on le fait habituellement avec un WHERE en MySQL, mais avec un peu d'astuce, d'habitude et de dénormalisation de nos données, on arrive très vite à nos fins en demandant "la bonne clef". Il faut également savoir qu'on est limités par la taille de notre RAM car redis garde toutes ses données en mémoire (c'est aussi pour cela que c'est très rapide). Cependant, redis sauvegarde régulièrement (avec la possibilité d'un paramétrage poussé) ses données sur le disque et supporte également la réplication sur de multiples serveurs.
