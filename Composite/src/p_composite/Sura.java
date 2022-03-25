package p_composite;

public final class Sura extends Eps {

    private String afiliado;

    public void Afiliar() {
        afiliado = "Usted se ha afiliado a Sura";
    }

    public void getEps() {
    }

    public void AceptarSeguro(Seguros a, String tipo) {
    }

    public void RechazarSeguro(Seguros a, String tipo) {
    }

    public String getAfiliado() {
        return afiliado;
    }

}
