package eu.lpinto.sun.controllers;

import eu.lpinto.universe.controllers.AbstractControllerCRUD;
import eu.lpinto.sun.persistence.entities.Employee;
import eu.lpinto.sun.persistence.facades.EmployeeFacade;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 * Controller for Employee entity.
 *
 * @author Luis Pinto <code>- mail@lpinto.eu</code>
 */
@Stateless
public class EmployeeController extends AbstractControllerCRUD<Employee> {

    @EJB
    private EmployeeFacade facade;

    public EmployeeController() {
        super(Employee.class.getCanonicalName());
    }

    @Override
    protected EmployeeFacade getFacade() {
        return facade;
    }
}
