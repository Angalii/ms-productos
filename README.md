# Microservicio

## Nombre:
ms-productos

### Autor: Angali Roman

## Descripción del microservicio
Microservicio REST desarrollado con Spring Boot para la gestión de productos. Permite registrar, listar, buscar, actualizar y eliminar productos mediante endpoints REST.

## Tecnologías utilizadas
- Java 21
- Spring Boot
- Spring Data JPA
- PostgreSQL (Neon)
- Maven
- Docker
- Render
- Lombok
- Jakarta Validation

## Endpoints disponibles

| Método | Endpoint | Descripción |
|---------|----------|-------------|
| POST | /api/productos | Crear producto |
| GET | /api/productos | Listar productos |
| GET | /api/productos/{id} | Obtener producto por ID |
| PUT | /api/productos/{id} | Actualizar producto |
| DELETE | /api/productos/{id} | Eliminar producto |

## Variables de entorno necesarias

```env
SPRING_DATASOURCE_URL=
SPRING_DATASOURCE_USERNAME=
SPRING_DATASOURCE_PASSWORD=
SPRING_JPA_HIBERNATE_DDL_AUTO=update
SERVER_PORT=8080
```

## Instrucciones para ejecutar en local
1. Clonar el repositorio:
```
git clone https://github.com/Angalii/ms-productos.git
```
2. Configurar las variables de entorno o el archivo application.properties. 
3. Ejecutar el proyecto:
4. Probar endpoints con Postman.
   
## Instrucciones básicas de despliegue
1. Crear un Web Service en Render.
2. Conectar el repositorio de GitHub.
3. Configurar las variables de entorno.
4. Construir mediante Dockerfile.
5. Desplegar el servicio.

## URL del servicio desplegado
