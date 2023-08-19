package pkgLista;

import java.util.ArrayList;
import java.util.List;

public class ClsEjercicio6 {

    private String nombre;
    private double sueldo_base; //3500
    private double descuentos; //500
    private double sueldo_liquido; //3000

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" + "Sueldo Base: " + sueldo_base + "\n" + "Descuentos: " + descuentos + "\n" + "Sueldo Liquido: " + sueldo_liquido + "\n";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }

    public double getSueldo_liquido() {
        return sueldo_liquido;
    }


    //INGRESOS Y CALCULOS
    public void ejercicio4(){
        ClsEjercicio6 ej = new ClsEjercicio6();
        List<ClsEjercicio6> lista = new ArrayList<>();

        ej.setNombre("Juan");
        ej.setSueldo_base(3500);
        ej.setDescuentos(500);
        lista.add(ej);
        ej = new ClsEjercicio6();

        ej.setNombre("Pedro");
        ej.setSueldo_base(3500);
        ej.setDescuentos(500);
        lista.add(ej);
        ej = new ClsEjercicio6();

        ej.setNombre("Maria");
        ej.setSueldo_base(3500);
        ej.setDescuentos(500);
        lista.add(ej);
        ej = new ClsEjercicio6();

        int sueldobase = 0;
        int descuentos = 0;
        int sueldoliquido = 0;

        for (ClsEjercicio6 e : lista) {
            e.toString();
            sueldobase += e.getSueldo_base();
            descuentos += e.getDescuentos();
            sueldoliquido += e.getSueldo_liquido();

            System.out.println(sueldobase);
            System.out.println(descuentos);
            System.out.println(sueldoliquido);

        }




    }
}
