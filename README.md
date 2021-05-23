# TEST JAVA
une fonction « partition » qui prend un paramètre « liste » et un paramètre « taille » et retourne une liste de sous liste, où chaque sous liste a au maximum « taille » éléments.
Exemples d'entrées et sorties : 

partition([1,2,3,4,5], 2) retourne: [ [1,2], [3,4], [5] ]
partition([1,2,3,4,5], 3) retourne: [ [1,2,3], [4,5] ]
partition([1,2,3,4,5], 1) retourne: [ [1], [2], [3], [4], [5] ]

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
