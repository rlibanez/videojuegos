drop table if exists videojuego;

create table videojuego
(
    id          int primary key auto_increment,
    nombre      varchar(200) not null,
    descripcion varchar(3000),
    imagen_url  varchar(500)
);


insert into videojuego
    (nombre, descripcion, imagen_url)
values ('Bioshock Infinite',
        'La última gran entrega de la saga Bioshock, ahora en una imperdible ciudad de ensueño entre las nubes.',
        'https://cdn.vox-cdn.com/thumbor/I24jyQjEEDBM4AQrGIbaCk4t2gk=/0x0:1080x720/1200x800/filters:focal(0x0:1080x720)/cdn.vox-cdn.com/uploads/chorus_image/image/4674397/bioshock_infinite_delay.0.jpg'),
       ('Insurgency: Sandstorm',
        'Un FPS táctico por equipos basado en combates letales en espacios reducidos y multijugador centrado en objetivos',
        'https://areajugones.sport.es/wp-content/uploads/2018/06/insurgency-e1528802800327.jpg'),
       ('The Witness', 'Te despiertas, a solas, en una extraña isla llena de puzles que te retarán y sorprenderán.',
        'https://cdn.wccftech.com/wp-content/uploads/2016/11/the-witness-ps4-pro-patch-4k-2060x1288.jpg'),
       ('Braid',
        'Un juego de rompecabezas con toques plataformeros, donde puedes manipular el flujo del tiempo de unas maneras inusuales y extrañas.',
        'https://cdn.wikimg.net/en/strategywiki/images/b/b3/Braid_fullart.jpg'),
       ('Borderlands 3', '¡Vuelve el padre de los shooter-looter, con tropecientas mil armas y una aventura caótica!',
        'https://static.posters.cz/image/1300/posters/borderlands-3-cover-i76366.jpg'),
       ('Control',
        'Tras la invasión de una agencia secreta de Nueva York por parte de una amenaza de otro mundo, te conviertes en la nueva directora que deberá luchar para recuperar Control.',
        'https://media.playstation.com/is/image/SCEA/control-poster-01-ps4-us-11sep19?$native_nt$'),
       ('Subnautica',
        'Un juego de aventuras submarinas ambientado en un mundo oceánico alienígena. ¡Te espera un mundo abierto enorme lleno de maravillas y peligros!',
        'https://store.playstation.com/store/api/chihiro/00_09_000/container/ES/es/999/EP5426-CUSA13893_00-2222444466669999/1568624921000/image?w=240&h=240&bg_color=000000&opacity=100&_version=00_09_000'),
       ('Firewatch',
        'Firewatch es un juego de misterio en primera persona para un jugador que se desarrolla en la selva de Wyoming',
        'https://www.mobygames.com/images/covers/l/323028-firewatch-playstation-4-front-cover.jpg');
