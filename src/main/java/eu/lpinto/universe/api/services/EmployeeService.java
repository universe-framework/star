package eu.lpinto.universe.api.services;

import eu.lpinto.sun.api.dto.Employee;
import eu.lpinto.sun.api.dts.EmployeeDTS;
import eu.lpinto.universe.api.services.AbstractServiceCRUD;
import eu.lpinto.sun.controllers.EmployeeController;
import javax.ejb.EJB;
import javax.ws.rs.Path;

/**
 * REST CRUD service for Employee.
 *
 * @author Luis Pinto <code>- mail@lpinto.eu</code>
 */
@Path("Employees")
public class EmployeeService extends AbstractServiceCRUD<eu.lpinto.sun.persistence.entities.Employee, Employee, EmployeeController, EmployeeDTS> {

    @EJB
    private EmployeeController controller;

    public EmployeeService() {
        super(EmployeeDTS.T);
    }

    @Override
    protected EmployeeController getController() {
        return controller;
    }
}
