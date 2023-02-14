/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.session;

import entity.Korisnik;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PC
 */
@Stateless
public class KorisnikFacade extends AbstractFacade<Korisnik> {

    @PersistenceContext(unitName = "CS230-PZ-BojanaStajic_4596PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public KorisnikFacade() {
        super(Korisnik.class);
    }

    public Korisnik findKorisnikUP(String username, String password) {

        Korisnik korisnik = (Korisnik) getEntityManager().createQuery("SELECT k FROM Korisnik k WHERE k.username = :username AND k.password = :password").setParameter("username", username).setParameter("password", password).getSingleResult();
        return korisnik;

    }

}
