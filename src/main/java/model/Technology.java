package model;

public class Technology {
    private String name;
    private String technologyUsage;
    private Double experience;

    public Technology(String name, String technologyUsage, Double experience) {
        this.name = name;
        this.technologyUsage = technologyUsage;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechnologyUsage() {
        return technologyUsage;
    }

    public void setTechnologyUsage(String technologyUsage) {
        this.technologyUsage = technologyUsage;
    }

    public Double getExperience() {
        return experience;
    }

    public void setExperience(Double experience) {
        this.experience = experience;
    }


}
