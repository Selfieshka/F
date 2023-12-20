package finalwork;

public class ConstructionImpl implements IConstruction {

    private final Stages stages;
    private String message;

    public ConstructionImpl(Project project, Walls walls, Roof roof, Trim trim) {
        stages = new Stages();
        stages.add(project);
        stages.add(walls);
        stages.add(roof);
        stages.add(trim);
    }

    @Override
    public void start() {
        Stage stage;
        while ((stage = stages.next()) != null) {
            System.out.println(stage);
        }
        message = "закончено";
    }

    @Override
    public String end() {
        return message;
    }
}