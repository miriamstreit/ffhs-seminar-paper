# Installation

## ConcourseCI

https://concourse-ci.org/quick-start.html

siehe docker-compose.yml

### Fly CLI installieren

https://stackoverflow.com/questions/54133684/how-to-install-fly-cli-to-mac
https://concourse-ci.org/quick-start.html#install-fly

`brew install --cask fly`

## Fly Anwendung

Pipelines können nur mit Fly erstellt werden.

### Login

Zuerst muss man sich mit Fly bei ConcourseCI anmelden. Das Target kann frei gewählt werden, muss aber für spätere Befehle beibehalten werden.
Als Ziel wird die URL, unter welcher ConcourseCI läuft, verwendet, und für den User und das Passwort werden die im docker-compose.yml gesetzten
Testwerte verwendet.

`fly login -c http://localhost:8080 -t tutorial -u test -p test`

### Pipeline erstellen

Nach dem Login muss dasselbe Target weiterverwendet werden. Für die Erstellung einer Pipeline ist ein Name sowie die Konfigurationsdatei notwendig.

> Damit die Pipeline funktioniert, muss beim betroffenen Git-Repository ein Access Token gelöst werden, das dann im Jenkinsfile bei der Git-URL beim Token-Platzhalter eingefügt wird. Die Rolle des Tokens soll "Developer" sein und der Scope für das Token muss mind. "read_api" und "read_repository" enthalten

`fly set-pipeline -t tutorial -p vuejs -c projects/vuejs/concourse-pipeline.yml`

`fly set-pipeline -t tutorial -p spring-boot -c projects/spring-boot/concourse-pipeline.yml`

`fly set-pipeline -t tutorial -p flask -c projects/flask/concourse-pipeline.yml`
