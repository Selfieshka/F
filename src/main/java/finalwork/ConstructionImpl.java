package finalwork;

public class ConstructionImpl implements IConstruction {

    private final Stages stages;
    private String message;

    public ConstructionImpl(Stage... stages) {
        Stages s = new Stages();
        for (Stage stage : stages) {
            s.add(stage);
        }
        this.stages = s;
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