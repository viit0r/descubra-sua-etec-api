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

    @Column(name = "presencial", length = 1)
    private boolean modalidadePresencial;

    @Column(name = "semipresencial", length = 1)
    private boolean modalidadeSemipresencial;

    @Column(name = "online", length = 1)
    private boolean modalidadeOnline;

    @Column(name = "etim", length = 1)
    private boolean modalidadeEtim;

    @Column(name = "especializacao", length = 1)
    private boolean modalidadeEspecializacao;
}
