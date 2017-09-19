package eu.lpinto.sun.controllers;

import eu.lpinto.universe.controllers.AbstractControllerCRUD;
import eu.lpinto.sun.persistence.entities.PlanFeature;
import eu.lpinto.universe.persistence.facades.AbstractFacade;
import eu.lpinto.sun.persistence.facades.PlanFeatureFacade;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Luis Pinto <code>- mail@lpinto.eu</code>
 */
@Stateless
public class PlanFeatureController extends AbstractControllerCRUD<PlanFeature> {

    @EJB
    private PlanFeatureFacade facade;

    public PlanFeatureController() {
        super(PlanFeature.class.getCanonicalName());
    }

    @Override
    public AbstractFacade<PlanFeature> getFacade() {
        return facade;
    }
}
