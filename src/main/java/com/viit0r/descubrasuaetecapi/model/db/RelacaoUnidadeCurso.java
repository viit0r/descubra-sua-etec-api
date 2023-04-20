package com.viit0r.descubrasuaetecapi.model.db;

import jakarta.persistence.*;

@Entity
@Table(name = "relacao_unidade_curso")
public class RelacaoUnidadeCurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_relacao", nullable = false, unique = true)
    private Long idRelacao;

    @OneToOne
    @JoinColumn(name = "id_unidade", nullable = false)
    private Unidade idUnidade;

    @OneToOne
    @JoinColumn(name = "id_curso", nullable = false)
    private Curso idCurso;

    @Column(length = 1)
    private boolean etim;

    @Column(name = "online", length = 1)
    private boolean modalidadeOnline;
}
