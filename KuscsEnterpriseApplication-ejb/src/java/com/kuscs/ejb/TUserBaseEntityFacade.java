/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuscs.ejb;

import com.kuscs.dao.TUserBaseEntity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author shin
 */
@Stateless
public class TUserBaseEntityFacade extends AbstractFacade<TUserBaseEntity> {
    @PersistenceContext(unitName = "KuscsEnterpriseApplication-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TUserBaseEntityFacade() {
        super(TUserBaseEntity.class);
    }
    
}
