package p_composite;

import java.util.ArrayList;
import java.util.List;

public final class Seguros extends Eps {

    private String estado;
    private List<Seguros> seguros = new ArrayList<>();
    private String eps;
    private String seguro;

    public Seguros(String eps) {
        this.eps = eps;
    }

    public void AceptarSeguro(Seguros a, String tipo) {
        String estado = " aceptado";
        seguro = "Seguro de " +tipo+": " +estado;
        if (a != null) {
            this.seguros.add(a);
        }
    }

    public void RechazarSeguro(Seguros a, String tipo) {
        String estado = " rechazado";
        seguro = "Seguro de " +tipo+": "+estado;
        if (a != null) {
            this.seguros.remove(a);
        }
    }

    public void mostrar() {
        for (int i = 0; i < seguros.size(); i++) {
            System.out.println(seguros.get(i));
        }
    }

    public void Afiliar() {
    }

    public void AceptarSeguro() {
    }

    public void RechazarSeguro() {
    }

    public String getEstado() {
        return estado;
    }

    public String getEps() {
        return eps;
    }

    public String getSeguro() {
        return seguro;
    }

}
