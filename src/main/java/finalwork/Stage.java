package finalwork;

public abstract class Stage {

    public Status status;
    public final String stageDescription;

    protected Stage(Status status, String stageDescription) {
        this.status = status;
        this.stageDescription = stageDescription;
    }

    @Override
    public String toString() {
        return "(" + status + " (" + stageDescription + "))";
    }
}