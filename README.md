# Microservicios con Spring Boot y Tecnologías Antiguas

Este repositorio muestra una implementación de microservicios utilizando tecnologías antiguas en Java. La arquitectura se basa en **Spring Boot** y utiliza las siguientes tecnologías para la gestión de microservicios:

- **Zuul**: Puerta de enlace para el enrutamiento de solicitudes.
- **Ribbon**: Balanceo de carga en el cliente.
- **Hystrix**: Tolerancia a fallos mediante circuit breakers.

## Servicios

- **springboot-servicio-eureka**: Proporciona el registro y descubrimiento de servicios.
- **springboot-servicio-item**: Maneja la gestión de ítems.
- **springboot-servicio-productos**: Encargado de la gestión de productos.
- **springboot-servicio-zuul**: Puerta de enlace para el enrutamiento de solicitudes.

## Instalación y Ejecución

1. **Clona el repositorio:**

    ```bash
    git clone https://github.com/tuusuario/tu-repositorio.git
    ```

2. **Navega al directorio de cada servicio y ejecuta los servicios con Maven:**

    ```bash
    cd springboot-servicio-eureka
    ./mvnw spring-boot:run
    ```

    Repite el proceso para los otros servicios.

3. **Verifica el funcionamiento:**

    - **Eureka Server**: `http://localhost:8761`
    - **Zuul Gateway**: `http://localhost:8080`
    - **Servicios adicionales**: `http://localhost:[puerto]`

## Contribuciones

Las contribuciones son bienvenidas. Para sugerir mejoras o reportar problemas, abre un "issue" o envía un "pull request".


