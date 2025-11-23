public class Postre extends Receta {
    private String nivelDulce;
    private boolean vegetariano;

    public Postre(String nombre, int tiempo, String nivelDulce, boolean vegetariano) {
        super(nombre, tiempo);
        this.nivelDulce = nivelDulce;
        this.vegetariano = vegetariano;
    }

    public String getNivelDulce() { return nivelDulce; }
    public boolean isVegetariano() { return vegetariano; }

    @Override
    public String getTipo() {
        return "Postre";
    }
}
