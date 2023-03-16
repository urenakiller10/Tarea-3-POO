public class Rectangulo extends Figura implements Comparable<
Rectangulo>{
    
private double base;
private double altura;

    public Rectangulo(double pBase, double pAltura){
        this.base = pBase;
        this.altura = pAltura;
    }
    //implementacion del metodo abstracto
    
    public double calcularArea(){
        return base * altura;
    }
    public int numeroLados(){

        return 4;
    }

    public int compareTo(Rectangulo rectPorComparar){
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
            

    