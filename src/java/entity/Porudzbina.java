/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "porudzbina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Porudzbina.findAll", query = "SELECT p FROM Porudzbina p")
    , @NamedQuery(name = "Porudzbina.findByPorudzbinaId", query = "SELECT p FROM Porudzbina p WHERE p.porudzbinaId = :porudzbinaId")
    , @NamedQuery(name = "Porudzbina.findByKorisnikId", query = "SELECT p FROM Porudzbina p WHERE p.korisnikId = :korisnikId")
    , @NamedQuery(name = "Porudzbina.findByProizvodId", query = "SELECT p FROM Porudzbina p WHERE p.proizvodId = :proizvodId")})
public class Porudzbina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "porudzbina_id")
    private Integer porudzbinaId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "korisnik_id")
    private int korisnikId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "proizvod_id")
    private int proizvodId;

    public Porudzbina() {
    }

    public Porudzbina(Integer porudzbinaId) {
        this.porudzbinaId = porudzbinaId;
    }

    public Porudzbina(Integer porudzbinaId, int korisnikId, int proizvodId) {
        this.porudzbinaId = porudzbinaId;
        this.korisnikId = korisnikId;
        this.proizvodId = proizvodId;
    }

    public Integer getPorudzbinaId() {
        return porudzbinaId;
    }

    public void setPorudzbinaId(Integer porudzbinaId) {
        this.porudzbinaId = porudzbinaId;
    }

    public int getKorisnikId() {
        return korisnikId;
    }

    public void setKorisnikId(int korisnikId) {
        this.korisnikId = korisnikId;
    }

    public int getProizvodId() {
        return proizvodId;
    }

    public void setProizvodId(int proizvodId) {
        this.proizvodId = proizvodId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (porudzbinaId != null ? porudzbinaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Porudzbina)) {
            return false;
        }
        Porudzbina other = (Porudzbina) object;
        if ((this.porudzbinaId == null && other.porudzbinaId != null) || (this.porudzbinaId != null && !this.porudzbinaId.equals(other.porudzbinaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Porudzbina[ porudzbinaId=" + porudzbinaId + " ]";
    }
    
}
