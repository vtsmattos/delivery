@echo off
start cmd.exe /c java -jar C:\workspace\delivery\delivery-config-server\target\delivery-config_server-0.0.1-SNAPSHOT.jar
start cmd.exe /c java -jar C:\workspace\delivery\delivery-eureka-server\target\delivery-eureka-server-0.0.1-SNAPSHOT.jar
pause