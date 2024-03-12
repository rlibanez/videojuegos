# Resumen de la sección 5: acceso a datos
En esta sección aprendimos a instalar una base de datos (MariaDB) y creamos un usuario y tabla. Además, aprendimos a interactuar con al base de datos desde Java, usando Spring Data JPA. 

### Instalación de la base de datos
Utilizamos XAMPP para instalar rápidamente la base de datos (MariaDB) y una herramienta de administración web de la base (PhpMyAdmin).

1. Visitamos el sitio de XAMPP en https://www.apachefriends.org

2. Descargamos el instalador y lo ejecutamos.

    Nos aseguramos de instalar en un directorio que NO sea Program Files, por ejemplo en C:\xampp


### Configuración de la base para nuestra aplicación

Creamos una base "videojuegos", y un usuario que pueda acceder a esa base.

1. Abrimos PhpMyAdmin

2. Vamos a Cuentas de Usuario > Agregar cuenta de usuario

3. Completamos los datos.

    Nos aseguramos de tildar la opción "Crear base de datos con el mismo nombre y otorgar todos los privilegios".

4. Hacemos click en el botón "Continuar" de abajo de todo

Con la base creado, seleccionamos la base de la lista (sobre la izquierda), y en la solapa SQL creamos la tabla de nuestra aplicación.


### Configuración del DataSource en Spring
En el archivo application.properties tenemos que configurar el acceso a la base de datos, para que Spring nos deje disponible una conexión lista para usar. El lugar de donde salen estas conexiones se los conoce como DataSource.

El archivo queda entonces de la siguiente manera:
```text
spring.datasource.url=jdbc:mysql://localhost:3306/videojuegos?serverTimezone=GMT-3
spring.datasource.username=videojuegos
spring.datasource.password=videojuegos
```

### Mapeo del objeto con JPA
Java Persistence API (JPA) son las clases del JDK que se encargan de relacionar un objeto a una tabla en una base de datos. Incluye un conjunto de anotaciones para poder relacionar: 
* La clase con una tabla (@Entity y opcionalmente @Table)
* El atributo que se asociará a la columna que es primary key (@Id)
* El resto de los atributos con cada columna (opcionalmente con @Column)


### Acceso a datos con Spring Data JPA
Spring Data JPA es una extensión de Spring Framework que facilita muchísimo el acceso a las bases de datos, usando objetos mapeados con JPA. Nos brinda la facilidad de programar interfaces, que serán luego implementadas por Spring en tiempo de ejecución. De esta manera, con muy poco código, tendremos muchísima funcionalidad.

La interfaz que creemos deberá extender JpaRepository (indicando la clase y el tipo de datos del atributo que es ID). Al extender JpaRepository, tendremos varios métodos útiles para buscar objetos, guardarlos, actualizarlos y borrarlos.

Por ejemplo, nuestra interfaz para usar el objeto Videojuego queda: 
```java
public interface VideojuegoRepository extends JpaRepository<Videojuego, Integer> {
}
```

Más info:
* [Documentación oficial de Spring Data JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories)
