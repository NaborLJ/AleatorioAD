
package aleatorio;


public class Product {
    private String codigo;
         private String descricion;
         private Double prezo;
         
    public Product() {
        codigo=null;
        descricion=null;
        prezo=0.0;
    }

    public Product(String codigo, String descricion, double prezo) {
        this.codigo = codigo;
        this.descricion = descricion;
        this.prezo = prezo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricion() {
        return descricion;
    }

    public Double getPrezo() {
        return prezo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescricion(String descricion) {
        this.descricion = descricion;
    }

    public void setPrezo(Double prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        return "Product{" + "codigo=" + codigo + ", descricion=" + descricion + ", prezo=" + prezo + '}';
    }

    
}

