package abstraccion;

public class MainClass {

    public static void main(String[] args) {
        Figura[] figuras = new Figura[10];
        figuras[0] = new Cuadrado(5,5,5);
        figuras[1] = new Circulo(6,6,6);
        for (int i= 0; i< figuras.length ; i++) {
            if (figuras[i]!= null) {
            	System.out.println(figuras[i].area());

            }
        }
        
        //Figura f = new Figura(2,2);

    }

}
abstract class Figura{
    int posicionX;
    int posiciony;
    public Figura(int posicionX, int posiciony) {
        super();
        this.posicionX = posicionX;
        this.posiciony = posiciony;
    }
    public int getPosicionX() {
        return posicionX;
    }
    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }
    public int getPosiciony() {
        return posiciony;
    }
    public void setPosiciony(int posiciony) {
        this.posiciony = posiciony;
    }
    public abstract float area();
    public abstract float perimetro();
    
    public String toString() {
        return "posicionX = "+posicionX+"\n"+"posiciony = "+posiciony;
    }
}
class Cuadrado extends Figura{
    int lado;
        
    public Cuadrado(int posicionX, int posiciony, int lado) {
        super(posicionX, posiciony);
        this.lado = lado;
    }
    public int areaDelCuadrado() {
        return lado*lado;
    }
    public int perimetroDelCuadrado() {
        return 4*lado;
    }
	@Override
	public float area() {
		// TODO Auto-generated method stub
		return lado*lado;
	}
	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		return 4*lado;
	}

}
class Circulo extends Figura{
    float radio;
    
    public Circulo(int posicionX, int posiciony, float radio) {
        super(posicionX, posiciony);
        this.radio = radio;
    }
    public float areaC() {
        return (float) (Math.PI*radio*radio);
    }
    public float perimetro() {
        return (float) (2*Math.PI*radio);
    }
	@Override
	public float area() {
		// TODO Auto-generated method stub
		return (float) (Math.PI*radio*radio);
	}

}

class Triangulo extends Figura{
    float base;
    float altura;
    public Triangulo(int posicionX, int posiciony, float base, float altura) {
        super(posicionX, posiciony);
        this.base = base;
        this.altura = altura;
    }
	@Override
	public float area() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}
    
}
//class X extends Triangulo{
//    
//}