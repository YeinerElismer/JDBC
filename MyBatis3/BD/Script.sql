CREATE table tb_pais
(
	tb_pais_id serial not null,
	tb_pais_cod character (2) not null,
	tb_pais_nom character VARYING(50) not null,
	CONSTRAINT pk_pais primary KEY (tb_pais_id),
	CONSTRAINT unq_pais_cod unique(tb_pais_cod),
	CONSTRAINT unq_pais_nom unique(tb_pais_nom),
	CONSTRAINT chk__pais_id CHECK(tb_pais_id>0),
	CONSTRAINT chk__pais_cod CHECK(tb_pais_cod similar to '[0-9][0-9]')
);

alter TABLE tb_ciudad drop column tb_ciudad_ubi;
alter table tb_ciudad add column tb_pais_id integer;
insert into tb_pais (tb_pais_cod,tb_pais_nom) VALUES('01','PERÚ');

UPDATE tb_ciudad set tb_pais_id = 1;

alter table tb_ciudad alter column tb_pais_id set not null;
alter table tb_ciudad add CONSTRAINT fk_pais_ciudad foreign key (tb_pais_id) REFERENCES tb_pais (tb_pais_id);