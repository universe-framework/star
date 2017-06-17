package eu.lpinto.sun.api.services;

import eu.lpinto.sun.api.dto.Image;
import eu.lpinto.sun.api.dts.ImageDTS;
import eu.lpinto.universe.api.services.AbstractServiceCRUD;
import eu.lpinto.universe.api.services.AbstractServiceCRUD;
import javax.ejb.EJB;
import javax.ws.rs.Path;

/**
 * REST CRUD service for Image.
 *
 * @author Luis Pinto <code>- mail@lpinto.eu</code>
 */
@Path("images")
public class ImageService extends AbstractServiceCRUD<eu.lpinto.sun.persistence.entities.Image, Image, eu.lpinto.sun.controllers.ImageController, ImageDTS> {

    @EJB
    private eu.lpinto.sun.controllers.ImageController controller;

    public ImageService() {
        super(ImageDTS.T);
    }

    @Override
    protected eu.lpinto.sun.controllers.ImageController getController() {
        return controller;
    }
}
