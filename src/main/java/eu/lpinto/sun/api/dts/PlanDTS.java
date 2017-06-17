package eu.lpinto.sun.api.dts;

import eu.lpinto.universe.api.dts.AbstractDTS;
import eu.lpinto.universe.api.dts.AbstractDTS;
import eu.lpinto.sun.persistence.entities.Plan;

/**
 * Plan DTO - Data Transformation Object
 *
 * @author Luis Pinto <code>- mail@lpinto.eu</code>
 */
public class PlanDTS extends AbstractDTS<Plan, eu.lpinto.sun.api.dto.Plan> {

    public static final PlanDTS T = new PlanDTS();

    @Override
    public eu.lpinto.sun.api.dto.Plan toAPI(Plan entity) {
        if (entity == null) {
            return null;

        }
        else if (entity.isFull()) {
            return new eu.lpinto.sun.api.dto.Plan(
                    PlanFeatureDTS.T.ids(entity.getFeatures()),
                    entity.getId(), entity.getName(), entity.getCreated(), entity.getUpdated());

        }
        else {
            return new eu.lpinto.sun.api.dto.Plan(
                    null,
                    entity.getId(), entity.getName(), entity.getCreated(), entity.getUpdated());
        }
    }

    @Override
    public Plan toDomain(Long id) {
        if (id == null) {
            return null;
        }

        return new Plan(id);
    }

    @Override
    public Plan toDomain(eu.lpinto.sun.api.dto.Plan dto) {
        return new Plan(
                PlanFeatureDTS.T.toDomainIDs(dto.getFeatures()),
                dto.getId(), dto.getName(), dto.getCreated(), dto.getUpdated());
    }
}
