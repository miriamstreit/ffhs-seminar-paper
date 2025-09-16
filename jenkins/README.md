# Installation Jenkins

https://www.atlantic.net/dedicated-server-hosting/how-to-install-jenkins-with-docker-and-docker-compose-on-arch-linux/

siehe docker-compose.yml

## Docker Desktop Settings
Einstellung aktivieren:
![Docker Desktop -> Settings -> "Expose daemon on tcp://localhost:2375 without TLS"](/img/jenkins_docker_tcp_setting.PNG)

## Initiales Setup
gemäss https://www.jenkins.io/doc/book/installing/docker/#setup-wizard
### Jenkins entsperren
Jenkins muss entsperrt werden, indem das initiale Passwort aus dem Startup-Log aus der Konsole in der Web-Oberfläche eingegeben wird

### initiale Plugins
Ebenfalls wird man dazu aufgefordert, erste Plugins zu installieren. Dabei sollen die Plugins selber ausgewählt werden. Von den empfohlenen werden folgende Plugins angewählt, der Rest wird abgewählt:

![Build Timeout, Timestamper, Workspace Cleanup, Pipeline, Pipeline: GitHub Groovy Libraries, Pipeline: Stage View, Git](/img/jenkins_initial_plugins.PNG)

### erster Admin User
Dieser Schritt wurde weggelassen und das default-Passwort wird verwendet. Der Benutzername lautet "admin".

## Konfigurationen

### weitere Plugins
Unter "Jenkins verwalten" -> Plugins können weitere Plugins installiert werden.

Dort müssen folgende Plugins dazuinstalliert werden: Docker Pipeline, Docker

danach Jenkins-Container herunterfahren und erneut starten

## Pipeline erstellen & starten
Übersicht: Neues Element erstellen -> Name eingeben, "Pipeline" als Typ auswählen

> Damit die Pipeline funktioniert, muss beim betroffenen Git-Repository ein Access Token gelöst werden, das dann im Jenkinsfile bei der Git-URL beim Token-Platzhalter eingefügt wird. Die Rolle des Tokens soll "Developer" sein und der Scope für das Token muss mind. "read_api" und "read_repository" enthalten

in "Pipeline Script" Inhalt aus jeweiligem Jenkinsfile aus diesem Repository kopieren, z.B. [/projects/vuejs/Jenkinsfile](/projects/vuejs/Jenkinsfile)

speichern

Starten mit "Jetzt bauen" in Pipeline-Ansicht
