package eu.lpinto.sun.persistence.facades;

import eu.lpinto.sun.persistence.entities.Image;
import eu.lpinto.universe.persistence.facades.AbstractFacade;
import eu.lpinto.universe.persistence.facades.AbstractFacade;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Image Facade
 *
 * @author Vítor Martins <code>- vitor.martins@petuniversal.com</code>
 */
@Stateless
public class ImageFacade extends AbstractFacade<Image> {

    @PersistenceContext
    private EntityManager em;

    public ImageFacade() {
        super(Image.class);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
