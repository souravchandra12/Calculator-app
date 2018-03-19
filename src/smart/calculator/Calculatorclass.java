/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.calculator;

/**
 *
 * @author 92016648
 */
public class Calculatorclass {
       int operator=0;
    double operator1;
    double operator2;
    double result = 0.00;
    double Factorial;
    
    

    public void setOperand(String opr) {
        if(!opr.equals("")){
            if(operator==0){
                operator1=Double.valueOf(opr);
            }else{
                operator2=Double.valueOf(opr);
            }
        }
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
   double I; 
    public void process(){
        switch (operator){
            case 1:
                result = operator1 + operator2;
                break;
            case 2:
                result = operator1 - operator2;
                break;
            case 3:
                result = operator1 * operator2;
                break;
            case 4:
                result =operator1 / operator2;
                break;
            case 5:
                result = operator * -1;
                break;
            case 6:
                result = 1/operator;
                break;
            case 7:
                result = Math.pow(operator1, operator2);
                break;
            case 8:
                Factorial = operator1;
                for(I = (operator1 - 1); I>1; --I){
                Factorial = Factorial * I;
                }
                if (Factorial == 0){
                    result = 1;
                }
                else{
                result = Factorial;
                }
                break;
            case 9:
                result = Math.sin(Math.PI * operator1/180);
                break;
            case 10:
                result = Math.sin(operator1);
                break;
            case 11:
                result = Math.asin(operator1)*180/Math.PI;
                break;
            case 12:
                result = Math.asin(operator1);
                break;
            case 13:
                result = Math.cos(Math.PI * operator1/180);
                break;
            case 14:
                result = Math.cos(operator1);
                break;
            case 15:
                result = Math.acos(operator1)*180/Math.PI;
                break;
            case 16:
                result = Math.acos(operator1);
                break;
            case 17:
                result = Math.tan(Math.PI * operator1/180);
                break;
            case 18:
                result = Math.tan(operator1);
                break;
            case 19:
                result = Math.atan(operator1)*180/Math.PI;
                break;
            case 20:
                result = Math.atan(operator1);
                break;
            case 21:
                result = Math.PI;
                break;
            case 22:
                result = Math.E;
                break;
        }
        operator1=result;
    }
    
    public void reset(){
       operator1 = 0;
        operator2 = 0;
        result = 0;
        operator = 0;
        Factorial = 0;
        I = 0;
    }
    
}
