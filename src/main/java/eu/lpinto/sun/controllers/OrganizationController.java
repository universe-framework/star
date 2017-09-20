package eu.lpinto.sun.controllers;

import eu.lpinto.sun.persistence.entities.Organization;
import eu.lpinto.sun.persistence.entities.Plan;
import eu.lpinto.sun.persistence.facades.OrganizationFacade;
import eu.lpinto.sun.persistence.facades.UserFacade;
import eu.lpinto.universe.controllers.AbstractControllerCRUD;
import eu.lpinto.universe.controllers.exceptions.PreConditionException;
import java.util.List;
import java.util.Map;
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

    @EJB
    private UserFacade userFacade;

    public OrganizationController() {
        super(Organization.class.getCanonicalName());
    }

    @Override
    public List<Organization> doFind(final Long userID, Map<String, Object> options) throws PreConditionException {
        return userFacade.retrieve(userID).getPerson().getOrganization();
    }

    @Override
    public void doCreate(Organization entity, Map<String, Object> options) throws PreConditionException {
        if (entity.getPlan() == null) {
            entity.setPlan(new Plan(1l));
        }
        super.doCreate(entity, options);
    }

    @Override
    public OrganizationFacade getFacade() {
        return facade;
    }
}
