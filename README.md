# Description
Il s'agit de modéliser les déplacements d'un personnage sur une carte.
 
# Carte
La carte est modélisée à l'aide de caractères dans un fichier texte au format UTF-8 (ressources/carte.txt)
 
 
# Légende
[#] bois impénétrables
[ ] (caractère espace) : case où le personnage peut se déplacer
 
# Déplacement du personnage
Les déplacements du personnage sont définis par un fichier avec les caractéristiques suivantes :
* encodage: UTF-8  (voir ressources/deplacement.txt)
* Première ligne :contient les coordonnées initiales du personnage sous la forme "x,y"
* Deuxième ligne :les déplacements du personnage définis sous la forme d'une succession de caractère représentant les directions cardinale (N, S,E,O).



## Pre-requisites
* JDK 8+
* JUnit 5

## Project tree

src
 * [main](src/main)
   * [CarteInteraction.java](src/main/CarteInteraction.java)
   * [Coordinate.java](src/main/Coordinate.java)
   * [FilesUtil.java](src/main/FilesUtil.java)
 * [properties](src/main)
   * [config.properties](src/main/config.properties)
 * [test](src/test)
   * [CarteInteractionTest.java](src/test/CarteInteractionTest.java)

ressources
 * [carte.txt](ressources/carte.txt)
 * [deplacement.txt](ressources/deplacement.txt)

JUnit5
 * [junit.jar](JUnit5/junit.jar)
