package eu.lpinto.sun.controllers;

import eu.lpinto.universe.controllers.AbstractControllerCRUD;
import eu.lpinto.sun.persistence.entities.Plan;
import eu.lpinto.sun.persistence.facades.PlanFacade;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Luis Pinto <code>- mail@lpinto.eu</code>
 */
@Stateless
public class PlanController extends AbstractControllerCRUD<Plan> {

    @EJB
    private PlanFacade facade;

    public PlanController() {
        super(Plan.class.getCanonicalName());
    }

    @Override
    public PlanFacade getFacade() {
        return facade;
    }
}
