package eu.lpinto.sun.controllers;

import eu.lpinto.universe.controllers.AbstractControllerCRUD;
import eu.lpinto.universe.controllers.AbstractControllerCRUD;
import eu.lpinto.sun.persistence.entities.Feature;
import eu.lpinto.sun.persistence.facades.FeatureFacade;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Luis Pinto <code>- mail@lpinto.eu</code>
 */
@Stateless
public class FeatureController extends AbstractControllerCRUD<Feature> {

    @EJB
    private FeatureFacade facade;

    public FeatureController() {
        super(Feature.class.getCanonicalName());
    }

    @Override
    protected FeatureFacade getFacade() {
        return facade;
    }
}
