# ForoHub API - Challenge Alura & Oracle Next Education

ForoHub es una **API REST** desarrollada en Java utilizando **Spring Boot**. El objetivo es replicar el funcionamiento de un foro (como el de Alura), permitiendo gestionar tópicos, respuestas, cursos y usuarios con persistencia de datos y seguridad avanzada.

---

### 🚀 Funcionalidades Principales
* **CRUD de Tópicos:** Creación, consulta, actualización y eliminación de discusiones.
* **Seguridad:** Autenticación y autorización mediante **Spring Security**.
* **JWT:** Generación y validación de tokens con la librería **Auth0 JWT**.
* **Persistencia:** Uso de **MySQL** para almacenamiento de datos.
* **Migraciones:** Gestión de esquemas de base de datos con **Flyway**.
* **Validaciones:** Reglas de negocio aplicadas con **Jakarta Validation**.

---

### 🛠️ Stack Tecnológico
* **Java 17** (LTS)
* **Spring Boot 3**
* **Spring Data JPA**
* **Spring Security**
* **MySQL**
* **Maven** (Gestor de dependencias)

---

### 🔐 Seguridad y Autenticación

La API implementa un modelo de autenticación **Stateless**. Para acceder a las funcionalidades, sigue estos pasos:

1. **Login:** Realiza una petición `POST` al endpoint `/login` enviando usuario y contraseña.
2. **Obtención del Token:** El servidor valida las credenciales y responde con un **JSON Web Token (JWT)**.
3. **Peticiones Autorizadas:** En cada petición posterior (GET, POST, etc.), incluye el token en el encabezado de la siguiente manera:
   `Authorization: Bearer <tu_token_aqui>`

---

### 📌 Endpoints de Tópicos

| Método | URL | Descripción | Acceso |
| :--- | :--- | :--- | :--- |
| `POST` | `/login` | Autenticación del usuario | Público |
| `GET` | `/topicos` | Listar todos los tópicos | Protegido |
| `POST` | `/topicos` | Crear un nuevo tópico | Protegido |
| `GET` | `/topicos/{id}`| Detalles de un tópico específico | Protegido |
| `PUT` | `/topicos/{id}`| Actualizar información de un tópico | Protegido |
| `DELETE` | `/topicos/{id}`| Eliminar un tópico | Protegido |

---

### 🔧 Configuración del Entorno

1. **Base de Datos:**
   Crea una base de datos en MySQL llamada `foro_hub`.
   Asegúrate de configurar tus credenciales en el archivo `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/foro_hub
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña
   ```

2. **JWT Secret:**
   Define una clave secreta para la firma de los tokens:
   ```properties
   api.security.token.secret=tu_clave_secreta_aqui
   ```

3. **Ejecución:**
   Usa el comando Maven o tu IDE preferido:
   ```bash
   mvn spring-boot:run
   ```

---

### 👤 Autor
Desarrollado por **Josue Leon** - [JLeonG09](https://github.com/JLeonG09)