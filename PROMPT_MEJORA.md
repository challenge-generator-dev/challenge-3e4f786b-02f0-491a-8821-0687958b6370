# Prompt para Mejorar el Codigo Base

Copia y pega el contenido del bloque de abajo en un asistente de IA (Claude, ChatGPT)
para obtener un ZIP con el proyecto completo y arrancable.

Si preferis trabajar en tu editor con un agente local (Claude Code, Cursor, Copilot), usa `AGENTS.md` en vez de este archivo: dice lo mismo pero para que escriba los archivos en disco.

## Las dos reglas que no se negocian

1. **Completa el boilerplate.** Todo lo que el proyecto necesita para compilar y arrancar: manifiesto de dependencias, punto de entrada, configuracion, capa de interfaz, y las capas del patron arquitectonico declarado. Eso es andamiaje y es tu trabajo.
2. **NO resuelvas el reto.** Los entregables de las fases son el trabajo de la persona. El hueco pedagogico se deja como esta: el proyecto arranca, pero lo que el reto pide implementar NO esta implementado.

Dicho de otra forma: si algo impide compilar, arreglalo. Si algo es logica de negocio incompleta, validaciones ausentes, un secreto hardcodeado o un patron mejorable, dejalo exactamente como esta — es lo que la persona tiene que encontrar.

## Superficie de practica — NO resuelvas

Estos archivos SON el ejercicio de la persona. No los implementes; deja stubs.

- `src/main/java/com/bank/auth/domain/model/User.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/bank/auth/domain/ports/AuthPort.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/bank/auth/application/services/BasicAuthService.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/bank/auth/application/services/OAuth2AuthService.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/bank/auth/infrastructure/adapters/BasicAuthAdapter.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/bank/auth/infrastructure/adapters/OAuth2AuthAdapter.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/bank/auth/infrastructure/security/JwtTokenUtil.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/bank/auth/infrastructure/security/JwtAuthFilter.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/bank/auth/infrastructure/security/SecurityConfig.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/bank/auth/infrastructure/controllers/AuthController.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/bank/auth/domain/exceptions/AuthException.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/bank/auth/domain/exceptions/InvalidCredentialsException.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/bank/auth/domain/exceptions/ExpiredTokenException.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.
- `src/main/java/com/bank/auth/infrastructure/config/OpenApiConfig.java` — El topic pide autenticacion/seguridad: este archivo es el ejercicio.

## Lo que le falta a este proyecto

Esto NO lo tenes que adivinar: salio de comparar el proyecto contra la arquitectura declarada del reto y de un analisis estatico del codigo. Completalo TODO.

### Referencias colgando en el codigo que si esta

Cada una rompe la compilacion:

- `src/main/java/com/bank/auth/infrastructure/controllers/AuthController.java` — `io.swagger.v3`: El import io.swagger.v3.oas.annotations.Operation pertenece a io.swagger.v3, pero ninguna dependencia declarada en el pom.xml cubre ese paquete. Falta agregar la dependencia o el import esta mal (libreria equivocada).
- `src/main/java/com/bank/auth/infrastructure/config/OpenApiConfig.java` — `io.swagger.v3`: El import io.swagger.v3.oas.models.Components pertenece a io.swagger.v3, pero ninguna dependencia declarada en el pom.xml cubre ese paquete. Falta agregar la dependencia o el import esta mal (libreria equivocada).

## Como saber que terminaste

```bash
mvn clean compile
```

Ese comando corriendo sin errores es la definicion de "listo".

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Perfil
Chapter Backend, Especialidad Desarrollador, Tecnología Java, Advanced L2

### Brecha de conocimiento
Experto en el marco de trabajo (framework) mas relevante en su lenguaje de programación principal, lo que le permite escribir código más legible y reducir la redundancia. Ha implementado al menos dos mecanismos de autenticación e identifica el uso de un JWT, Experto en el marco de trabajo (framework) mas relevante en su lenguaje de programación principal, lo que le permite escribir código más legible y reducir la redundancia. Ha implementado al menos dos mecanismos de autenticación e identifica el uso de un JWT

### Reto
- Tema: Especialista en Framework con Proficiencia en Seguridad y Legibilidad de Código
- Seniority: advanced-l2
- Tipo: practical
- Título: Implementación de Mecanismos de Autenticación en un Sistema Bancario
- Tiempo estimado: 8 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Implementación del Primer Mecanismo de Autenticación — objetivo: Implementar un mecanismo de autenticación básico que asegure la identidad del usuario antes de acceder a servicios. — entregable (NO resolver): Código implementado y documentado del primer mecanismo de autenticación.
- Fase 2: Implementación del Segundo Mecanismo de Autenticación — objetivo: Implementar un segundo mecanismo de autenticación distinto al primero, asegurándote de que el código sea legible y no redundante. — entregable (NO resolver): Código implementado y documentado del segundo mecanismo de autenticación.
- Fase 3: Identificación y Manejo de JWTs — objetivo: Identificar y manejar el uso de JWTs en el proceso de autenticación. — entregable (NO resolver): Código implementado y documentado que incluye el manejo de JWTs.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (ZIP).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Exportación en ZIP
Empaqueta todos los archivos en un único archivo ZIP descargable respetando exactamente
la estructura de rutas indicada por los marcadores.
El ZIP debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: El ZIP debe estar listo para descargar al finalizar. No preguntes si el usuario
quiere generarlo. Simplemente genera el archivo y proporciona el enlace de descarga; No debes desplegar en el chat el resumen de lo que arreglaste al Zip, solo entregalo.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del enlace de descarga del ZIP
No preguntes si el usuario quiere el ZIP: simplemente generalo siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:

// === ARCHIVO: pom.xml ===
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.5.6</version>
        <relativePath/>
    </parent>

    <groupId>com.bank</groupId>
    <artifactId>auth-service</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>auth-service</name>
    <description>Servicio de autenticación para sistema bancario</description>

    <properties>
        <java.version>21</java.version>
        <jjwt.version>0.12.5</jjwt.version>
    </properties>

    <dependencies>
        <!-- Spring Boot Starters -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>

        <!-- JWT Support -->
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-api</artifactId>
            <version>${jjwt.version}</version>
        </dependency>
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-impl</artifactId>
            <version>${jjwt.version}</version>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>io.jsonwebtoken</groupId>
            <artifactId>jjwt-jackson</artifactId>
            <version>${jjwt.version}</version>
            <scope>runtime</scope>
        </dependency>

        <!-- OpenAPI Documentation -->
        <dependency>
            <groupId>org.springdoc</groupId>
            <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
            <version>2.6.0</version>
        </dependency>

        <!-- Test -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>

// === ARCHIVO: src/main/java/com/bank/auth/Application.java ===
package com.bank.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("*")
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*");
            }
        };
    }
}

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Component
@ConfigurationProperties(prefix = "auth.jwt")
public class JwtProperties {
    @NotBlank
    @Size(min = 32, message = "JWT secret must be at least 32 characters long")
    private String secret;

    private long expiration = 86400000; // 24 hours in milliseconds

    // Getters and setters
    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public long getExpiration() {
        return expiration;
    }

    public void setExpiration(long expiration) {
        this.expiration = expiration;
    }
}

// === ARCHIVO: src/main/resources/application.yml ===
spring:
  application:
    name: auth-service
  datasource:
    url: jdbc:h2:mem:authdb;DB_CLOSE_DELAY=-1;DB_CLOSE_ON_EXIT=FALSE
    driver-class-name: org.h2.Driver
    username: sa
    password: ''
  h2:
    console:
      enabled: true
      path: /h2-console
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
    hibernate:
      ddl-auto: update
    show-sql: true

auth:
  jwt:
    secret: ${JWT_SECRET:defaultSecretKeyForDevelopmentOnlyThatIsLongEnough1234567890}
    expiration: 86400000 # 24 hours in milliseconds

server:
  port: 8080
  error:
    include-message: always
    include-binding-errors: always

management:
  endpoints:
    web:
      exposure:
        include: health,info,metrics
  endpoint:
    health:
      show-details: always

springdoc:
  api-docs:
    path: /api-docs
  swagger-ui:
    path: /swagger-ui.html
    operationsSorter: method

// === ARCHIVO: src/main/java/com/bank/auth/domain/model/User.java ===
package com.bank.auth.domain.model;

import java.util.UUID;

/**
 * Entidad de dominio que representa un usuario del sistema bancario.
 * Superficie de práctica para implementar la lógica de negocio.
 */
public class User {
    private UUID id;
    private String username;
    private String password;
    private String email;
    private String role;

    public User(UUID id, String username, String password, String email, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public UUID getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }
}

// === ARCHIVO: src/main/java/com/bank/auth/domain/ports/AuthPort.java ===
package com.bank.auth.domain.ports;

import com.bank.auth.domain.model.User;

/**
 * Interfaz del puerto de autenticación definida por el dominio.
 * Superficie de práctica para implementar la lógica de autenticación.
 */
public interface AuthPort {
    /**
     * Valida las credenciales de un usuario.
     * @param username Nombre de usuario
     * @param password Contraseña en texto plano
     * @return Usuario autenticado
     * @throws com.bank.auth.domain.exceptions.AuthException Si las credenciales son inválidas
     */
    User authenticate(String username, String password);

    /**
     * Genera un token JWT para un usuario autenticado.
     * @param user Usuario autenticado
     * @return Token JWT como cadena
     */
    String generateToken(User user);
}

// === ARCHIVO: src/main/java/com/bank/auth/domain/exceptions/AuthException.java ===
package com.bank.auth.domain.exceptions;

/**
 * Excepción base para errores de autenticación.
 * Superficie de práctica para manejar errores específicos.
 */
public class AuthException extends RuntimeException {
    public AuthException(String message) {
        super(message);
    }

    public AuthException(String message, Throwable cause) {
        super(message, cause);
    }
}

// === ARCHIVO: src/main/java/com/bank/auth/domain/exceptions/InvalidCredentialsException.java ===
package com.bank.auth.domain.exceptions;

public class InvalidCredentialsException extends AuthException {

    public InvalidCredentialsException(String message) {
        super(message);
    }

    public InvalidCredentialsException(String message, Throwable cause) {
        super(message, cause);
    }
}

// === ARCHIVO: src/main/java/com/bank/auth/domain/exceptions/ExpiredTokenException.java ===
package com.bank.auth.domain.exceptions;

public class ExpiredTokenException extends AuthException {

    public ExpiredTokenException(String message) {
        super(message);
    }

    public ExpiredTokenException(String message, Throwable cause) {
        super(message, cause);
    }
}

// === ARCHIVO: src/main/java/com/bank/auth/application/services/BasicAuthService.java ===
package com.bank.auth.application.services;


import com.bank.auth.infrastructure.security.JwtTokenUtil;
import com.bank.auth.domain.model.User;
import com.bank.auth.domain.ports.AuthPort;
import org.springframework.stereotype.Service;

@Service
public class BasicAuthService implements AuthPort {

    private final UserRepository userRepository;
    private final JwtTokenUtil jwtTokenUtil;

    public BasicAuthService(UserRepository userRepository, JwtTokenUtil jwtTokenUtil) {
        this.userRepository = userRepository;
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @Override
    public User authenticate(String username, String password) {
        throw new UnsupportedOperationException("Implementar autenticación básica");
    }

    @Override
    public String generateToken(User user) {
        throw new UnsupportedOperationException("Implementar generación de token");
    }
}

// === ARCHIVO: src/main/java/com/bank/auth/application/services/OAuth2AuthService.java ===
package com.bank.auth.application.services;

import com.bank.auth.domain.model.User;
import com.bank.auth.domain.ports.AuthPort;
import org.springframework.stereotype.Service;

@Service
public class OAuth2AuthService {

    private final AuthPort authPort;

    public OAuth2AuthService(AuthPort authPort) {
        this.authPort = authPort;
    }

    public User authenticateWithOAuth2(String authorizationCode) {
        throw new UnsupportedOperationException("Implementar autenticación OAuth2");
    }

    public String generateOAuth2Token(User user) {
        return authPort.generateToken(user);
    }

    public User validateOAuth2Token(String token) {
        throw new UnsupportedOperationException("Implementar validación de token OAuth2");
    }
}

// === ARCHIVO: src/main/java/com/bank/auth/infrastructure/adapters/BasicAuthAdapter.java ===
package com.bank.auth.infrastructure.adapters;

import com.bank.auth.domain.model.User;
import com.bank.auth.domain.ports.AuthPort;
import com.bank.auth.infrastructure.security.JwtTokenUtil;
import org.springframework.stereotype.Component;
import java.util.UUID;

@Component
public class BasicAuthAdapter implements AuthPort {

    private final JwtTokenUtil jwtTokenUtil;

    public BasicAuthAdapter(JwtTokenUtil jwtTokenUtil) {
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @Override
    public User authenticate(String username, String password) {
        throw new UnsupportedOperationException("Implementar autenticación básica");
    }

    @Override
    public String generateToken(User user) {
        return jwtTokenUtil.generateToken(user);
    }
}

// === ARCHIVO: src/main/java/com/bank/auth/infrastructure/adapters/OAuth2AuthAdapter.java ===
package com.bank.auth.infrastructure.adapters;

import com.bank.auth.domain.model.User;
import com.bank.auth.domain.ports.AuthPort;
import com.bank.auth.infrastructure.security.JwtTokenUtil;
import org.springframework.stereotype.Component;

@Component
public class OAuth2AuthAdapter implements AuthPort {

    private final JwtTokenUtil jwtTokenUtil;

    public OAuth2AuthAdapter(JwtTokenUtil jwtTokenUtil) {
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @Override
    public User authenticate(String username, String password) {
        throw new UnsupportedOperationException("Implementar autenticación OAuth2");
    }

    @Override
    public String generateToken(User user) {
        return jwtTokenUtil.generateToken(user);
    }

    public User authenticateWithAuthorizationCode(String code) {
        throw new UnsupportedOperationException("Implementar flujo OAuth2 con código de autorización");
    }

    public String refreshToken(String refreshToken) {
        throw new UnsupportedOperationException("Implementar renovación de token OAuth2");
    }
}

// === ARCHIVO: src/main/java/com/bank/auth/infrastructure/security/JwtTokenUtil.java ===
package com.bank.auth.infrastructure.security;


import com.bank.auth.JwtProperties;
import com.bank.auth.Application;
import com.bank.auth.domain.model.User;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;

@Component
public class JwtTokenUtil {

    private final SecretKey secretKey;
    private final long expiration;

    public JwtTokenUtil(Application.JwtProperties jwtProperties) {
        this.secretKey = Keys.hmacShaKeyFor(
            jwtProperties.getSecret().getBytes(StandardCharsets.UTF_8)
        );
        this.expiration = jwtProperties.getExpiration();
    }

    public String generateToken(User user) {
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + expiration);

        return Jwts.builder()
                .subject(user.getUsername())
                .claim("role", user.getRole())
                .claim("userId", user.getId().toString())
                .issuedAt(now)
                .expiration(expiryDate)
                .signWith(secretKey)
                .compact();
    }

    public String getUsernameFromToken(String token) {
        return parseClaims(token).getSubject();
    }

    public boolean validateToken(String token) {
        try {
            parseClaims(token);
            return true;
        } catch (JwtException | IllegalArgumentException e) {
            return false;
        }
    }

    private Claims parseClaims(String token) {
        return Jwts.parser()
                .verifyWith(secretKey)
                .build()
                .parseSignedClaims(token)
                .getPayload();
    }
}

// === ARCHIVO: src/main/java/com/bank/auth/infrastructure/security/JwtAuthFilter.java ===
package com.bank.auth.infrastructure.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.util.List;

@Component
public class JwtAuthFilter extends OncePerRequestFilter {

    private final JwtTokenUtil jwtTokenUtil;

    public JwtAuthFilter(JwtTokenUtil jwtTokenUtil) {
        this.jwtTokenUtil = jwtTokenUtil;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain)
            throws ServletException, IOException {

        String token = extractToken(request);

        if (StringUtils.hasText(token) && jwtTokenUtil.validateToken(token)) {
            String username = jwtTokenUtil.getUsernameFromToken(token);
            var authorities = List.of(new SimpleGrantedAuthority("ROLE_USER"));
            var authentication = new UsernamePasswordAuthenticationToken(
                    username, null, authorities
            );
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }

        filterChain.doFilter(request, response);
    }

    private String extractToken(HttpServletRequest request) {
        String bearerToken = request.getHeader("Authorization");
        if (StringUtils.hasText(bearerToken) && bearerToken.startsWith("Bearer ")) {
            return bearerToken.substring(7);
        }
        return null;
    }
}

// === ARCHIVO: src/main/java/com/bank/auth/infrastructure/security/SecurityConfig.java ===
package com.bank.auth.infrastructure.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final JwtAuthFilter jwtAuthFilter;

    public SecurityConfig(JwtAuthFilter jwtAuthFilter) {
        this.jwtAuthFilter = jwtAuthFilter;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .sessionManagement(session -> 
                session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/auth/**", "/actuator/**", "/swagger-ui/**", "/v3/api-docs/**")
                    .permitAll()
                .anyRequest().authenticated())
            .addFilterBefore(jwtAuthFilter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

// === ARCHIVO: src/main/java/com/bank/auth/infrastructure/controllers/AuthController.java ===
package com.bank.auth.infrastructure.controllers;

import com.bank.auth.domain.ports.AuthPort;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/auth")
@Tag(name = "Autenticación", description = "Endpoints para gestión de autenticación de usuarios")
public class AuthController {

    private final AuthPort authPort;

    public AuthController(AuthPort authPort) {
        this.authPort = authPort;
    }

    @PostMapping("/login")
    @Operation(summary = "Autenticar usuario", description = "Autentica un usuario y retorna token JWT")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Autenticación exitosa"),
        @ApiResponse(responseCode = "401", description = "Credenciales inválidas"),
        @ApiResponse(responseCode = "400", description = "Solicitud inválida")
    })
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        // SUPERFICIE DE PRÁCTICA: Implementar autenticación
        // El estudiante debe completar la lógica aquí
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED)
            .body(Map.of("message", "Implementar autenticación básica"));
    }

    @PostMapping("/oauth2/login")
    @Operation(summary = "Autenticación OAuth2", description = "Autentica usuario mediante OAuth2")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Autenticación OAuth2 exitosa"),
        @ApiResponse(responseCode = "401", description = "Autenticación OAuth2 fallida")
    })
    public ResponseEntity<?> oauth2Login(@RequestBody OAuth2LoginRequest request) {
        // SUPERFICIE DE PRÁCTICA: Implementar autenticación OAuth2
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED)
            .body(Map.of("message", "Implementar autenticación OAuth2"));
    }

    @GetMapping("/validate")
    @Operation(summary = "Validar token", description = "Valida un token JWT existente")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Token válido"),
        @ApiResponse(responseCode = "401", description = "Token inválido o expirado")
    })
    public ResponseEntity<?> validateToken(@RequestHeader("Authorization") String authHeader) {
        // SUPERIFICIE DE PRÁCTICA: Implementar validación de token
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED)
            .body(Map.of("message", "Implementar validación de token"));
    }

    @PostMapping("/refresh")
    @Operation(summary = "Refrescar token", description = "Obtiene un nuevo token JWT antes de expirar")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Token refrescado exitosamente"),
        @ApiResponse(responseCode = "401", description = "No se pudo refrescar el token")
    })
    public ResponseEntity<?> refreshToken(@RequestBody RefreshTokenRequest request) {
        // SUPERFICIE DE PRÁCTICA: Implementar refresh de token
        return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED)
            .body(Map.of("message", "Implementar refresh de token"));
    }

    // DTOs del request
    public record LoginRequest(String username, String password) {}
    public record OAuth2LoginRequest(String provider, String authCode) {}
    public record RefreshTokenRequest(String refreshToken) {}
}

// === ARCHIVO: src/main/java/com/bank/auth/infrastructure/config/OpenApiConfig.java ===
package com.bank.auth.infrastructure.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("API de Autenticación Bancaria")
                .version("1.0.0")
                .description("""
                    Servicio de autenticación para el sistema bancario.
                    Proporciona endpoints para autenticación básica y OAuth2.
                    """)
                .contact(new Contact()
                    .name("Equipo de Seguridad")
                    .email("seguridad@bank.com"))
                .license(new License()
                    .name("Proprietario")
                    .url("https://bank.com")))
            .addSecurityItem(new SecurityRequirement().addList("Bearer Authentication"))
            .components(new Components()
                .addSecuritySchemes("Bearer Authentication",
                    new SecurityScheme()
                        .type(SecurityScheme.Type.HTTP)
                        .scheme("bearer")
                        .bearerFormat("JWT")
                        .description("Token JWT para autenticación")));
    }
}

// === ARCHIVO: README.md ===
# Auth Service - Servicio de Autenticación Bancaria

## Descripción

Servicio de autenticación desarrollado con Spring Boot 3.5 y Java 21 para el sistema bancario. Implementa múltiples mecanismos de autenticación seguros.

## Tecnologías

- **Java 21**
- **Spring Boot 3.5.6**
- **Spring Security**
- **JWT (jjwt 0.12.5)**
- **SpringDoc OpenAPI 2.6.0**

## Arquitectura

Proyecto basado en **Arquitectura Hexagonal** con separación estricta de capas:

```
src/main/java/com/bank/auth/
├── domain/           # Capa de dominio (entidades, puertos, excepciones)
│   ├── model/
│   ├── ports/
│   └── exceptions/
├── application/      # Capa de aplicación (servicios, casos de uso)
│   └── services/
└── infrastructure/   # Capa de infraestructura (adaptadores, controladores)
    ├── adapters/
    ├── controllers/
    ├── config/
    └── security/
```

## Configuración

El archivo `application.yml` contiene la configuración principal:

```yaml
server:
  port: 8080

jwt:
  secret: ${JWT_SECRET:defaultSecretKeyForDevelopmentPurposesOnly123456}
  expiration: 3600000

spring:
  security:
    oauth2:
      # Configuración de proveedores OAuth2
```

## Ejecutar el Proyecto

```bash
# Compilar
mvn clean compile

# Ejecutar
mvn spring-boot:run

# Ejecutar tests
mvn test
```

## API Documentation

Una vez ejecutado el servicio, la documentación está disponible en:

- **Swagger UI**: http://localhost:8080/swagger-ui.html
- **OpenAPI JSON**: http://localhost:8080/v3/api-docs

## Endpoints Principales

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| POST | `/api/v1/auth/login` | Autenticación básica |
| POST | `/api/v1/auth/oauth2/login` | Autenticación OAuth2 |
| GET | `/api/v1/auth/validate` | Validar token JWT |
| POST | `/api/v1/auth/refresh` | Refrescar token |

## Seguridad

- Contraseñas encriptadas con BCrypt
- Tokens JWT con firma digital
- Autenticación multi-factor mediante OAuth2
- Rate limiting configurado
- CORS configurado

## Dependencias Principales

| Dependencia | Versión |
|-------------|---------|
| spring-boot-starter-web | 3.5.6 |
| spring-boot-starter-security | 3.5.6 |
| spring-boot-starter-validation | 3.5.6 |
| jjwt-api | 0.12.5 |
| springdoc-openapi-starter-webmvc-ui | 2.6.0 |

## Licencia

Proprietario - © 2024 Banco
```
