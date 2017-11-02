create database music;
use music;

create table baisc_info(
    id number(10) NOT NULL,
    title varchar(10) NOT NULL,
    length TIME,
    type varchar(5) NOT NULL,
    location varchar(50),
    PRIMARY KEY(id)
);

create table plist(
    id number(10) NOT NULL,
    name varchar(10),
    PRIMARY KEY(id)
);

create table plist_sng(
    id number(10) NOT NULL,
    song_id number(10),
    p_id number(10),
    PRIMARY KEY(id),
    FOREIGN KEY (song_id) REFERENCES baisc_info(id),
    FOREIGN KEY (p_id) REFERENCES plist(id);
);

create table genre(
    id number(10) NOT NULL,
    song_id number(10),
    genre varchar(10),
    PRIMARY KEY(id),
    FOREIGN KEY (song_id) REFERENCES baisc_info(id); 
);

create table stats(
    id number(10) NOT NULL,
    rating int(1) UNSIGNED,
    times_played int UNSIGNED,
    liked_disliked char(1),
    comments varchar(100),
    song_id number(10),
    PRIMARY KEY(id),
    FOREIGN KEY (song_id) REFERENCES baisc_info(id)
);

create table album(
    id number(10) NOT NULL,
    name varchar(20) NOT NULL,
    length TIME,
    year char(4),
    artist varchar(10),
    song_id number(10),
    PRIMARY KEY(id),
    FOREIGN KEY (song_id) REFERENCES baisc_info(id)
);

create table album_sng(
    id number(10) NOT NULL,
    track_no int(3) UNSIGNED,
    album_id number(10),
    song_id number(10),
    PRIMARY KEY(id),
    FOREIGN KEY (song_id) REFERENCES baisc_info(id),
    FOREIGN KEY (album_id) REFERENCES album(id)
);