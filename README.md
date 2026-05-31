# Taller Semana 1 - Git, GitHub y Programación Orientada a Objetos en Java

**Curso:** Técnicas de Programación Orientada a Objetos  
**Lenguaje:** Java  
**Entorno sugerido:** Eclipse  
**Proyecto:** Taller_Semana1_2  

## 1. Descripción del proyecto

Este repositorio contiene el desarrollo de los casos prácticos de la Semana 1 del curso de Técnicas de Programación Orientada a Objetos. Además, incluye una guía de primeros pasos con Git y GitHub, donde se explica cómo crear un repositorio local, clonar un repositorio desde GitHub, realizar commits, revisar el historial, trabajar con ramas y fusionarlas.

## 2. Objetivo general

Desarrollar una guía práctica de uso inicial de Git y GitHub, aplicando los comandos básicos de control de versiones en un proyecto Java con casos de Programación Orientada a Objetos.

## 3. Objetivos específicos

- Crear un repositorio local con Git.
- Clonar un repositorio de GitHub a la computadora local.
- Navegar por la estructura básica del repositorio.
- Realizar cambios en archivos de código Java.
- Usar los comandos `git add` y `git commit`.
- Visualizar el historial de commits.
- Crear y cambiar entre ramas usando `git branch` y `git checkout`.
- Fusionar ramas mediante `git merge`.
- Publicar los casos desarrollados en un repositorio compartido.

## 4. Casos desarrollados

| Caso | Tema principal | Archivo |
|---|---|---|
| Caso 1 | Calculadora básica con condicionales y métodos | `CalculadoraBasica.java` |
| Caso 2 | Clase Persona y objetos | `Persona.java` y `CasoPersona.java` |
| Caso 3 | Sobrecarga de métodos | `Operacion.java` y `CasoOperacion.java` |
| Caso 4 | Uso de static | `Contador.java` y `CasoContador.java` |
| Caso 5 | Lista de estudiantes con ArrayList y try-catch | `ListaEstudiantes.java` |

## 5. Estructura del repositorio

```text
Taller_Semana1_2/
│
├── README.md
├── GUIA_GIT_GITHUB.md
└── src/
    ├── CalculadoraBasica.java
    ├── Persona.java
    ├── CasoPersona.java
    ├── Operacion.java
    ├── CasoOperacion.java
    ├── Contador.java
    ├── CasoContador.java
    └── ListaEstudiantes.java
```

## 6. Cómo ejecutar el proyecto en Eclipse

1. Abrir Eclipse.
2. Crear un nuevo proyecto Java con el nombre `Taller_Semana1_2`.
3. Copiar los archivos `.java` dentro de la carpeta `src`.
4. Ejecutar cada clase que contiene método `main`.
5. Probar los casos ingresando datos desde la consola.

## 7. Evidencia de trabajo con Git

Para demostrar el trabajo realizado, se recomienda realizar al menos estos commits:

```bash
git add README.md GUIA_GIT_GITHUB.md
git commit -m "Agregar guia documentada de Git y GitHub"

git add src/
git commit -m "Agregar casos practicos de Java semana 1"
```

También se recomienda crear una rama para mejoras:

```bash
git branch mejora-casos
git checkout mejora-casos
```

Luego realizar cambios, hacer commit y fusionar:

```bash
git add .
git commit -m "Mejorar mensajes de salida de los casos"
git checkout main
git merge mejora-casos
```

## 8. Preguntas de reflexión

### ¿Cuál es la diferencia entre un método normal y uno static?

Un método normal pertenece a un objeto, por lo tanto, para utilizarlo primero se debe crear una instancia de la clase. En cambio, un método `static` pertenece directamente a la clase, por lo que puede llamarse sin crear un objeto. Los métodos `static` se usan cuando la acción no depende de los datos particulares de un objeto.

### ¿En qué casos usarías sobrecarga de métodos?

Usaría sobrecarga de métodos cuando se necesita realizar una misma operación, pero con diferentes tipos o cantidades de parámetros. Por ejemplo, una suma puede hacerse con dos números enteros, dos números decimales o tres números enteros. Esto permite reutilizar el mismo nombre del método y mejorar la organización del código.

## 9. Conclusión

El uso de Git y GitHub permite controlar los cambios realizados en un proyecto, mantener un historial ordenado y trabajar de manera colaborativa. En esta práctica se aplicaron comandos básicos de Git junto con el desarrollo de casos en Java relacionados con condicionales, métodos, clases, objetos, sobrecarga, variables estáticas, listas y manejo básico de errores.

Actualización: Se mejoró la documentación del proyecto y se verificó la estructura de archivos Java.