/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.cxf.rs.security.oauth2.grants.code.ServerAuthorizationCodeGrant;

/**
 *
 * @author Evelin
 */
@Stateless
public class ServerAuthorizationCodeGrantFacade extends AbstractFacade<ServerAuthorizationCodeGrant> {

    @PersistenceContext(unitName = "Jarmui_HgoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ServerAuthorizationCodeGrantFacade() {
        super(ServerAuthorizationCodeGrant.class);
    }
    
}
