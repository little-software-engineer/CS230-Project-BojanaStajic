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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author PC
 */
@Entity
@Table(name = "proizvod")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proizvod.findAll", query = "SELECT p FROM Proizvod p")
    , @NamedQuery(name = "Proizvod.findByProizvodId", query = "SELECT p FROM Proizvod p WHERE p.proizvodId = :proizvodId")
    , @NamedQuery(name = "Proizvod.findByNaziv", query = "SELECT p FROM Proizvod p WHERE p.naziv = :naziv")
    , @NamedQuery(name = "Proizvod.findByTezina", query = "SELECT p FROM Proizvod p WHERE p.tezina = :tezina")
    , @NamedQuery(name = "Proizvod.findByCena", query = "SELECT p FROM Proizvod p WHERE p.cena = :cena")
    , @NamedQuery(name = "Proizvod.findByProizvodjac", query = "SELECT p FROM Proizvod p WHERE p.proizvodjac = :proizvodjac")})
public class Proizvod implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "proizvod_id")
    private Integer proizvodId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "naziv")
    private String naziv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tezina")
    private double tezina;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cena")
    private double cena;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 34)
    @Column(name = "proizvodjac")
    private String proizvodjac;

    public Proizvod() {
    }

    public Proizvod(Integer proizvodId) {
        this.proizvodId = proizvodId;
    }

    public Proizvod(Integer proizvodId, String naziv, double tezina, double cena, String proizvodjac) {
        this.proizvodId = proizvodId;
        this.naziv = naziv;
        this.tezina = tezina;
        this.cena = cena;
        this.proizvodjac = proizvodjac;
    }

    public Integer getProizvodId() {
        return proizvodId;
    }

    public void setProizvodId(Integer proizvodId) {
        this.proizvodId = proizvodId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public double getTezina() {
        return tezina;
    }

    public void setTezina(double tezina) {
        this.tezina = tezina;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getProizvodjac() {
        return proizvodjac;
    }

    public void setProizvodjac(String proizvodjac) {
        this.proizvodjac = proizvodjac;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (proizvodId != null ? proizvodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proizvod)) {
            return false;
        }
        Proizvod other = (Proizvod) object;
        if ((this.proizvodId == null && other.proizvodId != null) || (this.proizvodId != null && !this.proizvodId.equals(other.proizvodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Proizvod[ proizvodId=" + proizvodId + " ]";
    }
    
}
