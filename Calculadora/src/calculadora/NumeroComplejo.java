package calculadora;

/*
 * @author evely
 */

public class NumeroComplejo {
    double real, imaginario; 
    
    public NumeroComplejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public NumeroComplejo() {
    }
    
    public void setReal(float real) {
        this.real = real;
    }

    public void setImaginario(float imaginario) {
        this.imaginario = imaginario;
    }

    public double getReal() {
        return real;
    }

    public double getImaginario() {
        return imaginario;
    }
 
    public NumeroComplejo suma (NumeroComplejo num1, NumeroComplejo num2){
       double numeroReal = num1.real + num2.real;
       double numeroImaginario = num1.imaginario + num2.imaginario; 
        
        return new NumeroComplejo(numeroReal,numeroImaginario);
    } 
    
    public NumeroComplejo resta (NumeroComplejo num1, NumeroComplejo num2){
       double numeroReal = num1.real - num2.real;
       double numeroImaginario = num1.imaginario - num2.imaginario; 
        
        return new NumeroComplejo(numeroReal,numeroImaginario);
    }
    


    
     @Override
    public String toString() {
        return real + " + " + imaginario + "i";
    }
}
