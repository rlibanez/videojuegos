# Resumen de la sección 6: mapeo avanzado usando @ManyToOne
En esta sección aprendimos a utilizar la sentencia ALTER de SQL para modificar un modelo de datos existente. Además, creamos una nueva tabla y la relacionamos utilizando una foreign key. Y por último, mapeamos esta relación en Java usando @ManyToOne de JPA.

### ALTER de SQL

La sentencia ALTER de SQL nos permite modificar las estructuras existentes de la base de datos (como tablas), manteniendo los datos ya almacenados.

Con ALTER podemos:

* agregar una nueva columna a una tabla

* eliminar una columna de una tabla

* cambiar el nombre de una columna

* cambiar el tipo de datos de una columna (y la base realizará la conversión pertinente, si puede)

* cambiar el nombre de una tabla

* cambiar las restricciones de una columna (por ejemplo, agregar un NOT NULL)

* agregar o quitar una foreign key

* y más!

La sentencia ALTER se usa muchisimo en entornos productivos, donde queremos ir evolucionando el modelo de datos sin perder la información ya almacenada.

* [Leer más sobre el uso de ALTER en MariaDB.](https://mariadb.com/kb/en/altering-tables-in-mariadb/)


### Anotación @ManyToOne de JPA

La anotación @ManyToOne en una @Entity de JPA nos permite indicar que un atributo está relacionado a través de una foreign key en la tabla, y deseamos que JPA se encargue de buscar el objeto relacionado y cargarlo automáticamente.

De manera predeterminada, JPA asume que la columna en la tabla se llama como el atributo, agregándole el sufijo _id al final. Podemos usar la anotación @JoinColumn para indicarle manualmente cuál es el nombre de la columna que es la foreign key a otra tabla.

```java
@ManyToOne
@JoinColumn(name="distribuidor_otro_id")
private Distribuidor distribuidorAdicional;
```