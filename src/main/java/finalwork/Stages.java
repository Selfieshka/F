package finalwork;

public class Stages implements Staged {

    private StageNode first;
    private StageNode last;
    private StageNode current;

    public void add(Stage stage) {
        StageNode oldLast = last;
        StageNode newLast = new StageNode(oldLast, stage, null);
        last = newLast;
        if (oldLast == null)
            first = newLast;
        else
            oldLast.next = newLast;
        if (current == null) {
            current = first;
        }
    }

    @Override
    public Stage next() {
        if (current == null)
            return null;
        StageNode stageNode = current;
        current = current.next;
        if (stageNode.stage.status == Status.Забракован) {
            if (!(stageNode.stage instanceof Project)) {
                stageNode.stage.status = Status.Выполнен;
            }
        }
        return stageNode.stage;
    }

    @Override
    public Stage prev() {
        if (current == null)
            return null;
        StageNode stage = current;
        current = current.prev;
        return stage.stage;
    }

    private static class StageNode {

        StageNode next;
        StageNode prev;
        Stage stage;

        StageNode(StageNode prev, Stage stage, StageNode next) {
            this.prev = prev;
            this.stage = stage;
            this.next = next;
        }
    }
}
