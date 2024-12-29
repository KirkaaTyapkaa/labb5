package department;

public abstract class OrganizationComponent implements Component {
    private final String name;

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String getInfo();
}
