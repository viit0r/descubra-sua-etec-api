alter table if exists relacao_unidade_curso add constraint FK7igyn7gev4h9fslbmsb6ibsjb foreign key (id_curso) references curso;

alter table if exists relacao_unidade_curso add constraint FK2jwary07gq7hmfkcor5df5o5o foreign key (id_unidade) references unidade;

alter table if exists unidade add constraint FK5xkj9bc7lba7smsjv8yh31viv foreign key (id_endereco) references unidade_endereco;