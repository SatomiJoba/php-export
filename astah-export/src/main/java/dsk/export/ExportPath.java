package dsk.export;

public interface ExportPath {
    public enum ChooseState {
        OK, CANCEL
    }

    ChooseState choose();

    String getChoosePath();
}
