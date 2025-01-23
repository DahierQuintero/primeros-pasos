package serie;

public interface Entregable {

    public default void entregar(boolean entregar) {
        entregar = true;
    }
}
