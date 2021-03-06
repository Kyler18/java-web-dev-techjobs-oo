package org.launchcode.techjobs_oo;

import org.junit.platform.commons.util.StringUtils;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    @Override
    public String toString() {
        String d = "Data not available";
         if (StringUtils.isBlank(this.getName()) && StringUtils.isBlank(employer.getValue()) && StringUtils.isBlank(location.getValue()) && StringUtils.isBlank(positionType.getValue()) && StringUtils.isBlank(coreCompetency.getValue())) return "OOPS! This job does not seem to exist.";
         else if (StringUtils.isBlank(this.getName())) this.setName(d);
         else if (StringUtils.isBlank(employer.getValue())) employer.setValue(d);
         else if (StringUtils.isBlank(location.getValue())) location.setValue(d);
         else if (StringUtils.isBlank(positionType.getValue())) positionType.setValue(d);
         else if (StringUtils.isBlank(coreCompetency.getValue())) coreCompetency.setValue(d);

           return "\n" +
                        "\n" + "ID: " + id +
                        "\n" + "Name: " + name +
                        "\n" + "Employer: " + employer +
                        "\n" + "Location: " + location +
                        "\n" + "PositionType: " + positionType +
                        "\n" + "CoreCompetency:" + coreCompetency +
                        "\n";

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
