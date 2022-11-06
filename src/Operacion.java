
public class Operacion {

    private Double numA;
    private Double numB;

    Operacion(Double numA, Double numB ){
        this.numA = numA;
        this.numB = numB;
    }

    public Double suma() {
        return numA + numB;
    }

    public Double resta() {
        return numA - numB;
    }

    public Double multiplicar(){
        return numA * numB;
    }

    public Double dividir(){
        return numA / numB;
    }

    public Double modulo(){
        return numA % numB;
    }
}
