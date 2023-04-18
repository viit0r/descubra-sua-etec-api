CREATE INDEX idx_unidade_endereco ON unidade(`id_endereco`);

CREATE INDEX idx_relacao_unidade ON relacao_unidade_endereco(`id_unidade`);

CREATE INDEX idx_relacao_curso ON relacao_unidade_endereco(`id_curso`);