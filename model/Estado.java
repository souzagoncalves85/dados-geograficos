package br.com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import lombok.Data;
import org.locationtech.jts.geom.Geometry;

@Entity
@Table(name = "br_uf_2021")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gid;
    
    @Column(name = "cd_uf")
    private String codigo;
    
    @Column(name = "nm_uf")
    private String nome;
    
    @Column(name = "sigla")
    private String sigla;

    @Column(name = "nm_regiao")
    private String regiao;    
    
    @Column(name = "geom")
    private Geometry geometria;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Geometry getGeometria() {
        return geometria;
    }

    public void setGeometria(Geometry geometria) {
        this.geometria = geometria;
    }

    @Override
    public String toString() {
        return "Estado{" + "gid=" + gid + ", codigo=" + codigo + ", nome=" + nome + ", sigla=" + sigla + ", regiao=" + regiao + ", geometria=" + geometria + '}';
    }

    
}
