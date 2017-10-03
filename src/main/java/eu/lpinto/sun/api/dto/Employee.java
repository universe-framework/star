package eu.lpinto.sun.api.dto;

import eu.lpinto.universe.api.dto.AbstractDTO;
import eu.lpinto.sun.persistence.entities.WorkerProfile;
import java.util.Calendar;

/**
 * Represents the relation between and organization and a person.
 *
 * @author Luis Pinto <code>- mail@lpinto.eu</code>
 */
public class Employee extends AbstractDTO {

    private static final long serialVersionUID = 1L;

    private Long externalID;
    private Long person;
    private Long organization;
    private Integer role;

    /*
     * Constructors
     */
    public Employee() {
    }

    public Employee(final Long externalID, final Long person, final Long organization, final Integer role) {
        this.externalID = externalID;
        this.person = person;
        this.organization = organization;
        this.role = role;
    }

    public Employee(final Long externalID, final Long person, final Long organization, final Integer role,
                    final Long id, final String name, final Calendar created, final Calendar updated) {
        super(id, name, created, updated);
        this.externalID = externalID;
        this.person = person;
        this.organization = organization;
        this.role = role;
    }

    /*
     * Getters/Setters
     */
    public Long getExternalID() {
        return externalID;
    }

    public void setExternalID(Long externalID) {
        this.externalID = externalID;
    }

    public Long getOrganization() {
        return organization;
    }

    public void setOrganization(final Long organization) {
        this.organization = organization;
    }

    public Long getPerson() {
        return person;
    }

    public void setPerson(final Long person) {
        this.person = person;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(final Integer role) {
        this.role = role;
    }

    public WorkerProfile getWorkerProfile(int role) {
        WorkerProfile profile = WorkerProfile.values()[role];

        return profile;
    }
}
