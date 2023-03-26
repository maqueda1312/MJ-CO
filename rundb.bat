@REM LANZAR DOCKER PARA LA DB
@REM docker run --rm -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=productos -p 3306:3306 -d mysql:8.0



@REM LANZAR SERVICIO INTERNO
@REM java -jar target\helloworld-vscode-0.0.1-SNAPSHOT.jar --server.port=3000 --email.user=mjcoapp@outlook.es --email.password=pepitogatO 


@REM LANZAR WEB SERVICE
@REM java -jar target\web_ejer1-0.1.0-SNAPSHOT.jar