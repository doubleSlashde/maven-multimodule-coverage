# Coverage-Reports mit Maven in Multi-Modul-Projekten
![Java CI with Maven](https://github.com/doubleSlashde/maven-multimodule-coverage/workflows/Java%20CI%20with%20Maven/badge.svg)

Beispielkonfiguration für die Generierung von Coverage-Reports in einem Maven-Projekt, das aus mehreren Modulen 
besteht. Für Unit-Tests sowie Integrationstests werden Coverage-Reports erstellt, die jeweils über alle Module
aggregiert sind.

Darüber hinaus wird ein Overall-Report erzeugt, der die Gesamt-Testabdeckung beinhaltet (Unit- und 
Integrationstests kumuliert).

Für die Messung der Testabdeckung wird das 
[JaCoCo-Maven-Plugin](http://www.eclemma.org/jacoco/trunk/doc/maven.html) verwendet.

## Laufzeitumgebung ##

Erstellt und getestet wurde dieses Beispielprojekt mit folgender Laufzeitkonfiguration:

- Maven 3.5
- Java 8
- JUnit 5 

Eine Version dieses Beispiels für JUnit 4 befindet sich im Branch 
[junit-4](https://github.com/doubleSlashde/maven-multimodule-coverage/tree/junit-4).

## Erstellung der Reports ##

Die Reporterzeugung erfolgt automatisch während der Testausführung. Ein über alle Module aggregierter Coverage-Report
für die Unit-Tests wird beim Durchlaufen von Mavens `test`-Phase erzeugt, also z.B. beim Aufruf von `mvn test`.

Der Report für die Integrationstests sowie der Gesamtreport werden in der `verify`-Phase generiert, also wenn 
z.B. `mvn verify` ausgeführt wird. Dies gilt natürlich auch für den Aufruf von späteren Phasen, denen die Phase `verify`
vorausgeht, also z.B. für `mvn install` oder `mvn deploy`.

## Ablageort der Reports ##

Die Coverage-Reports (HTML) werden im `site`-Ordner unterhalb von `target` des Moduls `coverage` abgelegt:
- `coverage/target/site/jacoco-aggregate-ut/index.html`: Coverage-Report der Unit-Tests
- `coverage/target/site/jacoco-aggregate-it/index.html`: Coverage-Report der Integrationtests
- `coverage/target/site/jacoco-aggregate-all/index.html`: Kumulierter Gesamtreport der Unit- und Integrationstests

## Wichtig! ##

Wird dem Projekt ein neues Modul hinzugefügt, muss dieses in der `pom.xml` des `coverage`-Moduls als Dependency 
hinzugefügt werden. _Ansonsten wird die Testabdeckung des neuen Moduls in den aggregierten Reports nicht berücksichtigt_!
