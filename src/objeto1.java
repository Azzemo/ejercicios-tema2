public class objeto1 {

    String nombre;
    double precio;
    double iva = 1.21;
    double conIva (double precio, double iva){
        return (iva * precio);
    }
    


public objeto1 (String nombre, double precio, double iva, double conIva) {
    this.nombre = nombre;
    this.precio = precio;
    this.iva =iva;
    this.conIva(precio, iva);
}

@Override
public String toString() { 
    return nombre + "\n " +
            "precio= "+ precio +
            " iva= "+ iva+
            " Total= "+ conIva(precio, iva);}


}