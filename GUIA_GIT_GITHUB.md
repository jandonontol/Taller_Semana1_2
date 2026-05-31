# Guía de primeros pasos con Git y GitHub

## 1. ¿Qué es Git?

Git es un sistema de control de versiones que permite registrar los cambios realizados en un proyecto. Gracias a Git, es posible saber qué archivos fueron modificados, quién realizó los cambios y en qué momento se hicieron.

## 2. ¿Qué es GitHub?

GitHub es una plataforma en línea donde se pueden guardar repositorios Git. Permite compartir proyectos, trabajar en equipo y publicar código fuente.

## 3. Configuración inicial de Git

Antes de trabajar con Git, se recomienda configurar el nombre y correo del usuario:

```bash
git config --global user.name "Tu Nombre"
git config --global user.email "tu_correo@example.com"
```

Para verificar la configuración:

```bash
git config --list
```

## 4. Crear un repositorio local

Primero se crea una carpeta para el proyecto:

```bash
mkdir Taller_Semana1_2
cd Taller_Semana1_2
```

Luego se inicializa Git:

```bash
git init
```

Este comando crea un repositorio local dentro de la carpeta del proyecto.

## 5. Clonar un repositorio de GitHub

Para copiar un repositorio desde GitHub a la computadora local se usa:

```bash
git clone https://github.com/usuario/nombre-repositorio.git
```

Después se ingresa a la carpeta clonada:

```bash
cd nombre-repositorio
```

## 6. Navegación básica por el repositorio

Para ver los archivos del proyecto:

```bash
ls
```

En Windows también se puede usar:

```bash
dir
```

Para ingresar a una carpeta:

```bash
cd src
```

Para regresar a la carpeta anterior:

```bash
cd ..
```

## 7. Verificar el estado del repositorio

El comando más usado para revisar cambios es:

```bash
git status
```

Este comando muestra si hay archivos nuevos, modificados o pendientes de guardar en un commit.

## 8. Primer commit

Un commit es un registro de cambios. Para crear un commit primero se agregan los archivos:

```bash
git add .
```

Luego se crea el commit:

```bash
git commit -m "Primer commit del proyecto"
```

## 9. Realizar cambios en el código

Después de modificar un archivo Java, se revisa el estado:

```bash
git status
```

Luego se agregan los cambios:

```bash
git add src/CalculadoraBasica.java
```

Finalmente se confirma el cambio:

```bash
git commit -m "Actualizar calculadora basica"
```

## 10. Visualizar historial de commits

Para ver el historial del proyecto:

```bash
git log
```

Una forma más resumida es:

```bash
git log --oneline
```

## 11. Manejo de branches o ramas

Una rama permite trabajar cambios sin afectar directamente la rama principal.

Para ver las ramas existentes:

```bash
git branch
```

Para crear una rama nueva:

```bash
git branch mejora-casos
```

Para cambiar a la rama creada:

```bash
git checkout mejora-casos
```

También se puede crear y cambiar de rama al mismo tiempo:

```bash
git checkout -b mejora-casos
```

## 12. Fusión de branches

Después de trabajar en una rama, se puede fusionar con la rama principal.

Primero se vuelve a la rama principal:

```bash
git checkout main
```

Luego se fusiona la rama:

```bash
git merge mejora-casos
```

## 13. Publicar repositorio en GitHub

Después de crear un repositorio vacío en GitHub, se conecta con el repositorio local:

```bash
git remote add origin https://github.com/usuario/Taller_Semana1_2.git
```

Luego se sube el proyecto:

```bash
git branch -M main
git push -u origin main
```

## 14. Caso práctico recomendado para la evidencia

1. Crear el proyecto `Taller_Semana1_2`.
2. Agregar el archivo `README.md` y la guía `GUIA_GIT_GITHUB.md`.
3. Hacer el primer commit.
4. Agregar los casos Java dentro de `src`.
5. Hacer el segundo commit.
6. Crear la rama `mejora-casos`.
7. Modificar mensajes o agregar comentarios en los programas.
8. Hacer un tercer commit en la rama.
9. Volver a `main` y fusionar con `git merge`.
10. Subir el repositorio a GitHub.

## 15. Comandos principales utilizados

| Comando | Función |
|---|---|
| `git init` | Crea un repositorio local |
| `git clone` | Copia un repositorio remoto |
| `git status` | Muestra el estado del repositorio |
| `git add` | Prepara archivos para el commit |
| `git commit -m` | Guarda cambios en el historial |
| `git log --oneline` | Muestra historial resumido |
| `git branch` | Lista o crea ramas |
| `git checkout` | Cambia de rama |
| `git merge` | Fusiona ramas |
| `git push` | Sube cambios a GitHub |
| `git pull` | Descarga cambios del repositorio remoto |
