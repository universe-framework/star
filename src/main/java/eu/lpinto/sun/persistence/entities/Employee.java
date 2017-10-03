package eu.lpinto.sun.persistence.entities;

import eu.lpinto.universe.persistence.entities.AbstractEntity;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.*;

/**
 *
 * @author Luis Pinto <code>- mail@lpinto.eu</code>
 */
@Entity
@Table(name = "Organization_Person")
@NamedQueries({
    @NamedQuery(name = "Employee.findByPMSOrganization", query = "SELECT cp FROM Employee cp WHERE( cp.pmsID = :pmsID AND cp.organization.id = :organizationID)"),})
public class Employee extends AbstractEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long externalID;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE) // cascade merge will update target object with this instance
    private Person person;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private Organization organization;

    @Enumerated(EnumType.ORDINAL)
    private WorkerProfile profile;

    /*
     * Constructors
     */
    public Employee() {
        super();
    }

    public Employee(final Long id) {
        super(id);
    }

    public Employee(final Long externalID, final Person person, final Organization organization, final WorkerProfile profile) {
        super();
        this.externalID = externalID;
        this.person = person;
        this.organization = organization;
        this.profile = profile;
    }

    public Employee(final Long externalID, final Person person, final Organization organization, final WorkerProfile profile,
                    final Long id, final String name, final Calendar created, final Calendar updated) {
        super(id, name, created, updated);
        this.externalID = externalID;
        this.person = person;
        this.organization = organization;
        this.profile = profile;
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

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(final Organization organization) {
        assertNotNull(organization);

        this.organization = organization;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(final Person person) {
        assertNotNull(person);

        this.person = person;
    }

    public WorkerProfile getProfile() {
        return profile;
    }

    public void setProfile(final WorkerProfile profile) {
        assertNotNull(profile);

        this.profile = profile;
    }
}
