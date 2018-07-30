/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.cxf.rs.security.oauth2.common.UserSubject;

/**
 *
 * @author Evelin
 */
@Stateless
public class UserSubjectFacade extends AbstractFacade<UserSubject> {

    @PersistenceContext(unitName = "Jarmui_HgoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UserSubjectFacade() {
        super(UserSubject.class);
    }
    
}
