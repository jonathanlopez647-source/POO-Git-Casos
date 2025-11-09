# Guía de Uso de Git

Esta guía proporciona los pasos básicos para usar Git en el desarrollo de proyectos y para realizar operaciones comunes dentro de un repositorio Git.

## 1. Inicializar un Repositorio Git

Para empezar a usar Git en un proyecto, primero debes inicializar un repositorio en tu carpeta de trabajo. Sigue estos pasos:

1. Abre una terminal en la carpeta de tu proyecto
	Ejemplo: cd Casos
2. Inicializa el repositorio con el siguiente comando:
    git init
Esto creará un nuevo repositorio Git en tu carpeta de trabajo.
3. Creamos un commit para identificar la subida de los archivos al repositorio
	git commit -m "Subiendo desarrollo de casos" 
4. Nos conectamos al repositorio remoto y enviamos los cambios
	git remote add origin https://github.com/jonathanlopez647-source/POO-Git-Casos
	git push -u origin master
## 2. Ver el Estado del Repositorio

Para ver el estado actual del repositorio (archivos modificados, sin seguimiento, etc.), utiliza:

	git status
