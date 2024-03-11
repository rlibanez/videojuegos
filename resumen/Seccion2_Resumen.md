# Resumen de la sección 2: preparación del entorno profesional

En esta sección aprendimos a instalar todas las herramientas para crear un entorno de trabajo profesional en Java.

Al terminar esta sección vas a tener configurado y listo para usar un entorno de desarrollo Java, y contás con herramientas de uso cotidiano para construir aplicaciones de calidad profesional.

Todas las herramientas que usaremos en este taller son de **software libre**. Es decir, son gratuitas y se pueden **usar libremente tanto para aprendizaje como en proyectos reales con clientes**.

### Instalación del JDK

**El JDK es el kit de desarrollo de Java**, el cual incluye el compilador, la máquina virtual, y todas las clases básicas para desarrollar.

Usamos **AdoptOpenJDK** como distribución del JDK de Java. AdoptOpenJDK incluye instaladores muy simples de usar para varias plataformas.

1. Abrimos el sitio https://adoptopenjdk.net/

2. Seleccionamos la última versión disponible del JDK (Latest, en este momento OpenJDK 13)

3. Seleccionamos la JVM (HotSpot)

4. Hacemos click en Último Lanzamiento para descargar el instalador

5. Ejecutamos el instalador y seguimos las instrucciones en pantalla

    Durante la instalación, nos aseguramos de activar la opción para crear la variable de entorno JAVA_HOME

6. Listo! 

Comprobamos que todo se haya instalado correctamente: 

1. Abrimos una consola de comandos de Windows (Win + R y escribir cmd)

2. Escribir java -version para ver la versión de Java recién instalada


### Instalación de Apache NetBeans IDE

**Apache NetBeans IDE es un entorno de desarrollo para Java** y otros tantos lenguajes. Nos brinda varias utilidades al momento de programar, como auto-completado de código, ayuda de los métodos, compilación, acceso a base de datos, y más.

Usamos el instalador de NetBeans:

1. Abrimos el sitio https://netbeans.apache.org/

2. En el menú superior, nos dirigimos a Download

3. Seleccionamos la última versión disponible, y hacemos click en el botón Download (en este momento, Apache NetBeans 11 feature update 2 NB 11.2)

4. De la lista de instaladores (installers) seleccionamos la adecuada para nuestra plataforma. Por ejemplo, https://www.apache.org/dyn/closer.cgi/netbeans/netbeans/11.2/Apache-NetBeans-11.2-bin-windows-x64.exe

5. Descargamos el instalador y lo ejecutamos

6. Seguimos las instrucciones en pantalla

    1. Importante seleccionar el JDK que instalamos en el punto anterior cuando nos pregunte

    2. Activamos la casilla para comprobar actualizaciones

7. Listo! 

Luego de ejecutar el IDE, activar los plugins adicionales para Java:

1. Ir al menú Tools > Plugins > Installed

2. Seleccionar "HTML5", "Java SE" y "Java Web and EE" y click en "Activate" (instalar todo lo que sugiere)

3. Seleccionar la solapa Available Plugins

4. Buscar e instalar "nbjavac Library"

5. Reiniciar el IDE

También puede servir esta guía detallada para [instalar y configurar Apache NetBeans 11](https://somospnt.com/blog/31-apache-netbeans-11-como-configurar-el-ide-para-aprovecharlo-al-maximo). 

