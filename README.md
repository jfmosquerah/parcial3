# parcial3
parcial3
Proyecto: API RESTful Reactiva con Internacionalización
Este proyecto es una aplicación desarrollada con Spring Boot 3+ y Spring WebFlux que integra:

API RESTful reactiva utilizando Mono y Flux.
Internacionalización (i18n) mediante archivos de mensajes en varios idiomas.
Seguridad y validación (con Spring Security y Spring Boot Validation).
Requisitos Previos
Java 17 o superior: Se recomienda tener instalado Java 17 (o configurar el proyecto para la versión que tengas).
Maven: Para compilar y gestionar las dependencias del proyecto.
IDE (opcional): Eclipse, IntelliJ IDEA u otro de tu preferencia.
Acceso a Internet: Para que Maven descargue las dependencias.
Instalación y Ejecución
Clonar el repositorio:

bash
Copiar
Editar
git clone https://github.com/tu_usuario/tu_repositorio.git
cd tu_repositorio
Compilar el proyecto:

Ejecuta el siguiente comando en la raíz del proyecto para compilar y empaquetar la aplicación:

bash
Copiar
Editar
mvn clean package
Ejecutar la aplicación:

Puedes ejecutar la aplicación de dos maneras:

Usando Maven:

bash
Copiar
Editar
mvn spring-boot:run
Ejecutando el JAR generado:

Después de compilar, encontrarás el archivo JAR en la carpeta target. Ejecútalo con:

bash
Copiar
Editar
java -jar target/demo-0.0.1-SNAPSHOT.jar
Verificar el arranque:

Una vez que la aplicación se haya iniciado, deberías ver mensajes en la consola indicando que el servidor está escuchando en el puerto 8080.

Endpoints Disponibles
Saludo Internacionalizado (reactivo):

URL: http://localhost:8080/api/saludo
Parámetro: lang (por ejemplo, ?lang=es para español, ?lang=en para inglés)
Ejemplo:
http://localhost:8080/api/saludo?lang=es
Respuesta: "Hola, bienvenido a nuestra API Reactiva!"
http://localhost:8080/api/saludo?lang=en
Respuesta: "Hello, welcome to our Reactive API!"
Listado de Productos (reactivo):

URL: http://localhost:8080/api/productos
Ejemplo de respuesta (JSON):
json
Copiar
Editar
[
  {"id": "1", "nombre": "Laptop", "precio": 1200.0},
  {"id": "2", "nombre": "Mouse", "precio": 25.0},
  {"id": "3", "nombre": "Teclado", "precio": 45.0}
]
Pruebas
Pruebas Automatizadas:

Se han incluido pruebas unitarias con StepVerifier para validar el comportamiento reactivo de los endpoints. Para ejecutar las pruebas, utiliza:

bash
Copiar
Editar
mvn test
Pruebas Manuales:

Puedes utilizar herramientas como Postman o el navegador para enviar peticiones GET a los endpoints descritos.

Notas Adicionales
Si se utiliza Spring Security sin configuraciones personalizadas, se generará un usuario por defecto con:

Usuario: user
Contraseña: 1234
Para configurar credenciales fijas, puedes agregar lo siguiente a src/main/resources/application.properties:

properties
Copiar
Editar
spring.security.user.name=user
spring.security.user.password=1234
Asegúrate de tener las versiones correctas de Java y Maven configuradas en tu entorno de desarrollo.
