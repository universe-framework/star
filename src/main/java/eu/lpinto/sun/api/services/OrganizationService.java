package eu.lpinto.sun.api.services;

import eu.lpinto.sun.api.dto.Organization;
import eu.lpinto.sun.api.dts.OrganizationDTS;
import eu.lpinto.universe.api.services.AbstractServiceCRUD;
import eu.lpinto.universe.api.services.AbstractServiceCRUD;
import eu.lpinto.sun.controllers.OrganizationController;
import javax.ejb.EJB;
import javax.ws.rs.Path;

/**
 * REST CRUD service for Clinic.
 *
 * @author Luis Pinto <code>- mail@lpinto.eu</code>
 */
@Path("organizations")
public class OrganizationService extends AbstractServiceCRUD<eu.lpinto.sun.persistence.entities.Organization, Organization, OrganizationController, OrganizationDTS> {

    @EJB
    private OrganizationController controller;

    public OrganizationService() {
        super(OrganizationDTS.T);
    }

    @Override
    protected OrganizationController getController() {
        return controller;
    }
}
