# SistemaVacunacion
sistema de inventario de vacunacion

REQUISITOS Y TECNOLOGIAS

Plantillas de bootstrap

  Intellij Idea
  
  Postgresql
  
  API REST
  
  JPA
  
  https://start.spring.io/
  
  Maven
  
  Java 11
  
  Configurar las variables de entorno
  
INICIAR PROYECTO  
  
La línea que tiene "SpringApplication.run", sin esto no iniciará el framwork de Spring.

Por otro lado puede apoyarse del comando mvnw.cmd para ejecutar comandos maven y compilar, instalar dependencias etc. 
O iniciar con el apoyo de este comnando la aplicación spring, con el comando mvnw spring-boot:run.

Si es la primera vez que ejecuta el proyecto también puede ejecutar mvnw install el cuál instalará todas las dependencias al mismo tiempo que compilará la aplicación, 
luego de este comando también puede usar java -jar target\webapp2-0.0.1-SNAPSHOT.jar para inciar la aplicaciòn.


CONEXION DATABASE

Grcias a JPA se puede crear las bases al momento de ejecutar el proyecto para lo cual se deeb cambiar las credenciales del archivo se debe cambiar el nombre de la base y la contraseña para establecer la conexion con PostgreSQL.

application.properties
