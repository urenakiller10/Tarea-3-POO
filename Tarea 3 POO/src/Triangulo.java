public class Triangulo extends Figura implements Comparable<Triangulo>{
    private double base;
    private double altura;

    public Triangulo(double pBase, double pAltura){
        this.base = pBase;
        this.altura = pAltura;
    }
    //implementacion del metodo abstracto
    
    public double calcularArea(){
        return ((base * altura) / 2);

    }
    public int numeroLados(){

        return 3;
    
    }
    public int compareTo(Triangulo rectPorComparar){
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

    

