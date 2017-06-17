package eu.lpinto.universe.api.services;

import eu.lpinto.sun.api.dto.Feature;
import eu.lpinto.sun.api.dts.FeatureDTS;
import eu.lpinto.universe.api.services.AbstractServiceCRUD;
import eu.lpinto.universe.api.services.AbstractServiceCRUD;
import eu.lpinto.sun.controllers.FeatureController;
import javax.ejb.EJB;
import javax.ws.rs.Path;

/**
 * REST CRUD service for Feature.
 *
 * @author Luis Pinto <code>- mail@lpinto.eu</code>
 */
@Path("features")
public class FeatureService extends AbstractServiceCRUD<eu.lpinto.sun.persistence.entities.Feature, Feature, eu.lpinto.sun.controllers.FeatureController, FeatureDTS> {

    @EJB
    private eu.lpinto.sun.controllers.FeatureController controller;

    public FeatureService() {
        super(FeatureDTS.T);
    }

    @Override
    protected FeatureController getController() {
        return controller;
    }
}
