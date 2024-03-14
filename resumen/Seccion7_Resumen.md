# Resumen de la sección 7: consultas avanzadas con Spring Data JPA
En esta sección aprendimos el uso de @Query para crear consultas personalizadas a la base de datos. 

### @Query

La anotación **@Query** de Spring Data JPA nos permite asociar una consulta a un método de un Repository. De esta forma, podemos crear métodos que resuelven consultas pesonalizadas y devuelven objetos de dominio (aquellos anotados con @Entity de JPA). 



### @Query con JPQL

De manera predeterminada, **@Query espera recibir una consulta en formato JPQL** (Java Persistence Query Language). JPQL es el lenguaje de consulta de JPA, parecido a SQL pero con diferencias fundamentales.

**En JPQL consultamos las instancias de objetos** (en lugar de tablas) y atributos de los mismos (en lugar de columnas). Es decir, hacemos referencia a clases y atributos, que tienen que estar mapeados con JPA. JPA luego traduce esta consulta JPQL a SQL para que la base de datos puede ejecutarlo.

```java
@Query("from Pais p order by p.nombre")
List<Pais> buscarTodos();
```

Podemos usar **parámetros** para personalizar al consulta. Los parámetros se agregan al método normalmente, y luego se referencian en la consulta por posición, con ?1, ?2, ?3 y así sucesivamente.

```java
@Query("from Pais p where p.continente = ?1")
List<Pais> buscarPorContinente(String continente);
     
@Query("from Pais p where p.continente = ?1 and p.fechaIndependencia > ?2")
List<Pais> buscarPorContinenteYFechaIndependencia(String continente, LocalDate desde);
```

Podemos usar **wildcards** también como en SQL, usando el operador LIKE con el caracter %

```java
@Query("from Pais p where p.nombre like ?1%")
List<Pais> buscarPorNombreEmpiezaCon(String nombre);
     
@Query("from Pais p where p.nombre like %?1")
List<Pais> buscarPorNombreTerminaCon(String nombre);
     
@Query("from Pais p where p.nombre like %?1%")
List<Pais> buscarPorNombreContiene(String nombre);
```

Si sabemos que la consulta devuelve exactamente un solo resultado podemos devolver una única instancia del método en lugar de un List. Si la consulta llegara a devolver más resultados, Spring Data lanza una excepción en tiempo de ejecución.

```java
@Query("from Pais p where p.nombre = ?1")
Pais buscarPorNombre(String nombre);
```

### @Query con SQL nativo

También **podemos usar SQL nativo en nuestras consultas, aunque no es lo recomendado**. Para usar SQL nativo, tenemos que agregar el parámetro nativeQuery=true a la anotación @Query. La consulta SQL que ejecutemos tiene que devolver todas las columnas que necesita la entidad (y cada nombre de columna tiene que ser el esperado según el mapeo de la entidad).

```java
@Query(value = "select * from pais", nativeQuery=true)
List<Pais> buscarTodos();
```

Con SQL nativo JPA usará el query exacto tal cual lo escribimos, con lo cual podemos usar funciones o consultas complejas propias del motor de base de datos que estamos usando.

* [Leer más sobre @Query en la documentación de Spring Data JPA.](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.at-query)


### Query Methods

Spring Data nos provee una forma alternativa a @Query para crear métodos de consulta, y es a través de los Query Mehtods. Un Query Method es la creación de una consulta a partir del nombre de un método, el cual tiene que seguir cierta sintaxis. Los Query Methods son muy prácticos para crear consultas simples y rápidas, y nos evitan el uso de @Query. Los query methods empiezan con la palabra findBy y siguen con las condiciones. 

```java
findByNombre(String n)
findByNombreAndApellido(String n, String a)
findByApellidoOrderByNombreAsc(String a)
```
* [Ejemplos de Query Methods en la documentación de Spring Data.](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods.query-creation)

* [Palabras soportadas por un Query Method.](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repository-query-keywords)


### Links con Thymeleaf

En Thymeleaf podemos usar la notación **@{}** para generar links. Thymeleaf procesa el contentido entre las llaves y genera el link adecuado. La / es la raiz de la aplicación nuestra, y Thymeleaf se encargará de generar correctamente el link.

```html
<a th:href="@{/paises">Lista de paises</a>
```

Además, podemos agregar parámetros a la URL, usando paréntesis. Los valores de los parámetros pueden ser fijos, o calculados a partir de objetos que tengamos subidos al Model. 

```html
<a th:href="@{/paises(continente=3)">Paises de América</a>
<a th:href="@{/paises(continente=${continente.id})">Ver paises de este continente</a>
```

Podemos usar varios parámetros, separándolos por coma.

```html
<a th:href="@{/paises(continente=${continente.id},orden=${opciones.ordenDefault})">Ver paises</a>
```

* [Sintaxis de URLs con Thymeleaf.](https://www.thymeleaf.org/doc/articles/standardurlsyntax.html)


### HTML FORM

Un FORM de HTML es un tag que permite el envio de datos a una URL. Un FORM indica la URL a donde tienen que enviarse los datos que contiene (a través del atributo ACTION). Los elementos que contienen los datos a enviar son INPUT, SELECT, TEXTAREA, etc. 

```html
<form action="/crearUsuario">
    <input type="text" name="nombre">
    <input type="email" name="email">
    <input type="password" name="pass">
    <select name="nacionalidad">
        <option value="AR">Argentina</option>
        <option value="BR">Brasil</option>
        <option value="CH">Chile</option>
        <option value="CO">Colombia</option>
        <option value="MX">México</option>
        <option value="otro">Otro</option>
    </select>
    <button type="submit">Crear Usuario</button>
</form>
```

* [Documentación de HTML Forms.](https://www.w3schools.com/html/html_forms.asp)