# Implementación de Mecanismos de Autenticación en un Sistema Bancario

En un sistema bancario, es crucial asegurar que los usuarios se autentiquen correctamente antes de acceder a servicios sensibles. Debes implementar dos mecanismos de autenticación distintos para un servicio de gestión de cuentas, asegurándote de que el código sea legible y no redundante. Además, debes identificar y manejar el uso de JWTs en el proceso de autenticación.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Especialista en Framework con Proficiencia en Seguridad y Legibilidad de Código |
| **Nivel** | advanced-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 8 horas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: JDK 17+, Maven 3.9+, IDE con soporte Java.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Ejecuta `mvn compile` en la raíz. Si no hay errores, estás listo.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Implementación del Primer Mecanismo de Autenticación

**Objetivo:** Implementar un mecanismo de autenticación básico que asegure la identidad del usuario antes de acceder a servicios.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Diseña e implementa un mecanismo de autenticación que verifique la identidad del usuario.
- Asegúrate de que el código sea legible y no redundante.
- Documenta las decisiones de diseño tomadas.

**Entregable:** Código implementado y documentado del primer mecanismo de autenticación.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los patrones de diseño comunes para la autenticación.
- Piensa en cómo puedes hacer que el código sea más legible y menos redundante.

</details>

### Fase 2: Implementación del Segundo Mecanismo de Autenticación

**Objetivo:** Implementar un segundo mecanismo de autenticación distinto al primero, asegurándote de que el código sea legible y no redundante.

**Tiempo estimado:** 3 horas

**Instrucciones:**

- Diseña e implementa un segundo mecanismo de autenticación que sea distinto al primero.
- Asegúrate de que el código sea legible y no redundante.
- Documenta las decisiones de diseño tomadas.

**Entregable:** Código implementado y documentado del segundo mecanismo de autenticación.

<details>
<summary>Pistas de conocimiento</summary>

- Explora diferentes enfoques para la autenticación.
- Considera cómo puedes hacer que el código sea más legible y menos redundante.

</details>

### Fase 3: Identificación y Manejo de JWTs

**Objetivo:** Identificar y manejar el uso de JWTs en el proceso de autenticación.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Identifica dónde y cómo se utilizan JWTs en el proceso de autenticación.
- Implementa el manejo de JWTs en tu sistema de autenticación.
- Asegúrate de que el código sea legible y no redundante.
- Documenta las decisiones de diseño tomadas.

**Entregable:** Código implementado y documentado que incluye el manejo de JWTs.

<details>
<summary>Pistas de conocimiento</summary>

- Investiga sobre JWTs y su uso en la autenticación.
- Considera cómo puedes hacer que el código sea más legible y menos redundante.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es un JWT y cómo se utiliza en la autenticación?
- **paraQueSirve**: ¿Para qué sirve implementar diferentes mecanismos de autenticación?
- **comoSeUsa**: ¿Cómo se usa un framework para escribir código más legible y reducir la redundancia?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar mecanismos de autenticación y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica el uso de JWTs en el proceso de autenticación?

## Criterios de Evaluacion

- Implementación de un primer mecanismo de autenticación.
- Implementación de un segundo mecanismo de autenticación distinto.
- Identificación y manejo de JWTs en el proceso de autenticación.
- Código legible y no redundante.
- Documentación clara de las decisiones de diseño tomadas.

## Como trabajar con un asistente de IA

Hay dos caminos, elegi uno:

- **AGENTS.md** (recomendado) — instrucciones nativas del repo. Abri esta carpeta con tu agente local (Claude Code, Cursor, Codex, Copilot, Gemini) y las carga solo. Sabe que archivos faltan y con que comando se verifica, y completa el scaffold escribiendo en disco.
- **PROMPT_MEJORA.md** — para copiar y pegar en un chat (claude.ai, ChatGPT). Devuelve un ZIP con el proyecto. Sirve si no tenes un agente en el IDE.

Ninguno de los dos resuelve las fases del reto: eso es tu trabajo.

## Verificacion

El proyecto esta listo para trabajar cuando este comando corre sin errores:

```bash
mvn clean compile
```

---

*Reto generado automaticamente por Challenge Generator - Pragma*
