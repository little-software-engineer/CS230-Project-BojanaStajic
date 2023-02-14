/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.session;

import entity.Porudzbina;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author PC
 */
@Stateless
public class PorudzbinaFacade extends AbstractFacade<Porudzbina> {

    @PersistenceContext(unitName = "CS230-PZ-BojanaStajic_4596PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PorudzbinaFacade() {
        super(Porudzbina.class);
    }
    
}
