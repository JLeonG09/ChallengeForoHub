# ForoHub API

API REST desarrollada con **Spring Boot** como parte del challenge **ForoHub de Alura**.
El objetivo del proyecto es construir un backend para la gestión de tópicos de un foro, implementando operaciones CRUD y persistencia en base de datos relacional.

---

# Tecnologías utilizadas

* Java 17+
* Spring Boot 4
* Spring Web
* Spring Data JPA
* Hibernate
* Flyway Migration
* MySQL
* Maven
* Lombok
* Validation
* Spring Security (configurado para el proyecto)

---

# Base de datos

Base de datos relacional:

```
{DB_NAME}
```

Motor utilizado:

```
MySQL
```

La base de datos es gestionada mediante **Flyway**, permitiendo versionar las migraciones y mantener consistencia entre entornos.

---

# Estructura del proyecto

El proyecto sigue una arquitectura basada en capas.

```
com.alurachallenges.forohub

controller
service
repository
model
dto
config
```

Descripción:

* **controller** → endpoints de la API
* **service** → lógica de negocio
* **repository** → acceso a datos con JPA
* **model** → entidades de la base de datos
* **dto** → objetos de transferencia de datos
* **config** → configuraciones del proyecto

---

# Funcionalidades implementadas

La API permite gestionar tópicos dentro del foro.

Operaciones disponibles:

### Registrar un tópico

```
POST /topicos
```

Registra un nuevo tópico en la base de datos.

Campos requeridos:

```
titulo
mensaje
autorId
cursoId
```

Reglas de negocio:

* Todos los campos son obligatorios
* No se permiten tópicos duplicados

---

### Listar tópicos

```
GET /topicos
```

Devuelve todos los tópicos registrados en el sistema.

---

### Detalle de un tópico

```
GET /topicos/{id}
```

Devuelve la información detallada de un tópico específico.

---

### Actualizar un tópico

```
PUT /topicos/{id}
```

Permite modificar la información de un tópico existente.

---

### Eliminar un tópico

```
DELETE /topicos/{id}
```

Elimina un tópico de la base de datos.

---

# Ejemplo de request

Crear un tópico:

```
POST /topicos
```

Body JSON:

```json
{
  "titulo": "Error con Spring Boot",
  "mensaje": "No puedo conectar con MySQL",
  "autorId": 1,
  "cursoId": 1
}
```

---

# Migraciones de base de datos

El proyecto utiliza **Flyway** para la gestión de migraciones.

Ubicación:

```
src/main/resources/db/migration
```

Ejemplo de archivos:

```
V1__create_table_usuario.sql
V2__create_table_perfil.sql
V3__create_table_curso.sql
V4__create_table_topico.sql
V5__create_table_respuesta.sql
```

---

# Ejecución del proyecto

Clonar el repositorio:

```
git clone https://github.com/JLeonG09/ChallengeForoHub
```

Configurar la conexión a la base de datos en:

```
application.properties
```

Ejecutar el proyecto:

```
mvn spring-boot:run
```

La API estará disponible en:

```
http://localhost:8080
```

---

# Pruebas de la API

Las pruebas pueden realizarse utilizando herramientas como:

* Postman
* Insomnia
* curl

---

# Estado actual del proyecto

Actualmente se encuentra implementado el **CRUD completo de tópicos**:

* Registro de tópicos
* Listado de tópicos
* Detalle de tópicos
* Actualización de tópicos
* Eliminación de tópicos

---

# Autor

Desarrollado por **Josué León** como parte del challenge **ForoHub - Alura**.
