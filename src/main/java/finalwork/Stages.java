package finalwork;

public class Stages implements Staged {

    private Node first;
    private Node last;
    private Node current;

    public void add(Stage stage) {
        Node oldLast = last;
        Node newLast = new Node(oldLast, stage, null);
        last = newLast;
        if (oldLast == null) {
            first = newLast;
        } else {
            oldLast.next = newLast;
        }
        if (current == null) {
            current = first;
        }
    }

    @Override
    public Stage next() {
        if (current == null)
            return null;
        Node stageNode = current;
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
        Node stage = current;
        current = current.prev;
        return stage.stage;
    }
}
