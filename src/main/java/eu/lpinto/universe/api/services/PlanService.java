package eu.lpinto.universe.api.services;

import eu.lpinto.sun.api.dto.Plan;
import eu.lpinto.sun.api.dts.PlanDTS;
import eu.lpinto.universe.api.services.AbstractServiceCRUD;
import eu.lpinto.universe.api.services.AbstractServiceCRUD;
import javax.ejb.EJB;
import javax.ws.rs.Path;

/**
 * REST CRUD service for Plan.
 *
 * @author Luis Pinto <code>- mail@lpinto.eu</code>
 */
@Path("plans")
public class PlanService extends AbstractServiceCRUD<eu.lpinto.sun.persistence.entities.Plan, Plan, eu.lpinto.sun.controllers.PlanController, PlanDTS> {

    @EJB
    private eu.lpinto.sun.controllers.PlanController controller;

    public PlanService() {
        super(PlanDTS.T);
    }

    @Override
    protected eu.lpinto.sun.controllers.PlanController getController() {
        return controller;
    }
}
