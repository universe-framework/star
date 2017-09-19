package eu.lpinto.sun.controllers;

import eu.lpinto.universe.controllers.AbstractControllerCRUD;
import eu.lpinto.sun.persistence.entities.Organization;
import eu.lpinto.sun.persistence.facades.OrganizationFacade;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * Controller for Organization entity.
 *
 * @author Luis Pinto <code>- mail@lpinto.eu</code>
 */
@Stateless
public class OrganizationController extends AbstractControllerCRUD<Organization> {

    @EJB
    private OrganizationFacade facade;

    public OrganizationController() {
        super(Organization.class.getCanonicalName());
    }

    @Override
    public OrganizationFacade getFacade() {
        return facade;
    }
}
