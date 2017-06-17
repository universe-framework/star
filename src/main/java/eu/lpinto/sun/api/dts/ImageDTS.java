package eu.lpinto.sun.api.dts;

import eu.lpinto.universe.api.dts.AbstractDTS;
import eu.lpinto.universe.api.dts.AbstractDTS;
import eu.lpinto.sun.persistence.entities.Image;

/**
 * Image DTO - Data Transformation Object
 *
 * @author Luis Pinto <code>- mail@lpinto.eu</code>
 */
public class ImageDTS extends AbstractDTS<Image, eu.lpinto.sun.api.dto.Image> {

    public static final ImageDTS T = new ImageDTS();

    @Override
    public eu.lpinto.sun.api.dto.Image toAPI(Image entity) {
        return new eu.lpinto.sun.api.dto.Image(
                entity.getUrl(),
                entity.getId(), entity.getName(), entity.getCreated(), entity.getUpdated());
    }

    @Override
    public Image toDomain(Long id) {
        if (id == null) {
            return null;
        }

        return new Image(id);
    }

    @Override
    public Image toDomain(eu.lpinto.sun.api.dto.Image dto) {
        return new Image(
                dto.getUrl(),
                dto.getId(), dto.getName(), dto.getCreated(), dto.getUpdated());
    }
}
