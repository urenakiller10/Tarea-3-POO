public class Circulo extends Figura implements Comparable<Circulo>{
    private double radio;

    public Circulo(double radio){
        this.radio= radio;

    }
    public double calcularArea(){
        
        return (3.14* Math.pow(radio,2));
    
    }
    public int numeroLados(){

        return 0;
    }
    public int compareTo (Circulo rectPorComparar){

        double areaPorComparar = rectPorComparar.calcularArea();
        double miArea = this.calcularArea();

        int numeroLadosFig1 = rectPorComparar.numeroLados();
        int numeroLadosFig2 = this.numeroLados();
    
        if(miArea==areaPorComparar){

            if (numeroLadosFig1>numeroLadosFig2){
                return 1;
            }
            else{

                return -1;
            }

            }
        else if (miArea > areaPorComparar){
            return 1;
            }

        else{

            return -1;

            }

            }

            }


