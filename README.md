# Coverage-Reports mit Maven in Multi-Modul-Projekten

Beispielkonfiguration für die Generierung von Coverage-Reports in einem Maven-Projekt, das aus mehreren Modulen 
besteht. Für Unit-Tests und Integrationstests werden Coverage-Reports erstellt, die jeweils über alle Module
aggregiert sind.

Darüber hinaus wird ein Overall-Report erzeugt, der die Gesamt-Testabdeckung beinhaltet (Unit- und 
Integrationstests zusammen).

Für die Messung der Testabdeckung wird das 
[JaCoCo-Maven-Plugin](http://www.eclemma.org/jacoco/trunk/doc/maven.html) verwendet.

## Laufzeitumgebung ##

Erstellt und getestet wurde dieses Projekt mit folgender Laufzeitkonfiguration:

- Maven 3.5
- Java 8
- JUnit 5 

Eine Version dieses Beispiels für JUnit 4 befindet sich im Branch 
[junit-4](https://github.com/doubleSlashde/maven-multimodule-coverage/tree/junit-4).
