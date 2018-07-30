/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.cxf.rs.security.oauth2.tokens.bearer.BearerAccessToken;

/**
 *
 * @author Evelin
 */
@Stateless
public class BearerAccessTokenFacade extends AbstractFacade<BearerAccessToken> {

    @PersistenceContext(unitName = "Jarmui_HgoPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BearerAccessTokenFacade() {
        super(BearerAccessToken.class);
    }
    
}
