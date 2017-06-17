package eu.lpinto.sun.api.dts;

import eu.lpinto.universe.api.dts.AbstractDTS;
import eu.lpinto.universe.api.dts.AbstractDTS;
import eu.lpinto.sun.persistence.entities.Organization;

/**
 * Organization DTO - Data Transformation Object
 *
 * @author Luis Pinto <code>- mail@lpinto.eu</code>
 */
public class OrganizationDTS extends AbstractDTS<Organization, eu.lpinto.sun.api.dto.Organization> {

    public static final OrganizationDTS T = new OrganizationDTS();

    @Override
    public eu.lpinto.sun.api.dto.Organization toAPI(Organization entity) {
        if (entity == null) {
            return null;
        }

        if (entity.isFull()) {
            return new eu.lpinto.sun.api.dto.Organization(
                    entity.getPhone(), entity.getFacebook(), entity.getEmail(), entity.getBusinessHours(), ImageDTS.id(entity.getSelectedAvatar()),
                    PlanDTS.id(entity.getPlan()), OrganizationDTS.id(entity.getParent()),
                    AbstractDTS.abstractIDs(entity.getChildren()), ImageDTS.T.ids(entity.getAvatars()),
                    entity.getId(), entity.getName(), entity.getCreated(), entity.getUpdated());

        }
        else {
            return new eu.lpinto.sun.api.dto.Organization(
                    entity.getPhone(), entity.getFacebook(), entity.getEmail(), entity.getBusinessHours(), ImageDTS.id(entity.getSelectedAvatar()),
                    PlanDTS.id(entity.getPlan()), OrganizationDTS.id(entity.getParent()),
                    null, null,
                    entity.getId(), entity.getName(), entity.getCreated(), entity.getUpdated());
        }
    }

    @Override
    public Organization toDomain(Long id) {
        if (id == null) {
            return null;
        }

        return new Organization(id);
    }

    @Override
    public Organization toDomain(eu.lpinto.sun.api.dto.Organization dto) {
        return new Organization(dto.getPhone(), dto.getFacebook(), dto.getEmail(), dto.getBusinessHours(), ImageDTS.T.toDomain(dto.getAvatar()),
                                PlanDTS.T.toDomain(dto.getPlan()), OrganizationDTS.T.toDomain(dto.getParent()),
                                null, null,
                                dto.getId(), dto.getName(), dto.getCreated(), dto.getUpdated());
    }
}
