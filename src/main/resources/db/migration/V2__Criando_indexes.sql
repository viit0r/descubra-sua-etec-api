CREATE INDEX idx_unidade_endereco ON unidade(`id_endereco`);

CREATE INDEX idx_relacao_unidade ON relacao_unidade_curso(`id_unidade`);

CREATE INDEX idx_relacao_curso ON relacao_unidade_curso(`id_curso`);

CREATE INDEX idx_relacao_presencial ON relacao_unidade_curso(`presencial`);

CREATE INDEX idx_relacao_semipresencial ON relacao_unidade_curso(`semipresencial`);

CREATE INDEX idx_relacao_online ON relacao_unidade_curso(`online`);

CREATE INDEX idx_relacao_etim ON relacao_unidade_curso(`etim`);

CREATE INDEX idx_relacao_especializacao ON relacao_unidade_curso(`especializacao`);