package finalwork;

public abstract class Stage {

    public Status status;
    public final String description;

    protected Stage(Status status, String description) {
        this.status = status;
        this.description = description;
    }

}