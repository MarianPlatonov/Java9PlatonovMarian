/*
 * Clasa Ecran
*/
package oopcomputer;

/**
 *
 * @author Marian
 */
public class Ecran {

    private String afisaj = "0";
    private Carcasa stapana;
    
    public Ecran(Carcasa nouaStapana) {
        this.stapana = nouaStapana;
    }
    
    public String getAfisaj() {
        return afisaj;
    }

    public void setAfisaj(String noulAfisaj) {
        
        switch (noulAfisaj) {
            case "+":
                operatiuneLocala('+');
                break;
            case "-":
                operatiuneLocala('-');
                break;
            case "*":
                operatiuneLocala('*');
                break;    
            case "/":
                operatiuneLocala('/');
                break;    
            case "=":
                 System.out.println(afisaj);
                 stapana.getAlu().setOperandDoi(Integer.parseInt(this.afisaj));
                 afisaj = noulAfisaj;
                 stapana.getAlu().calculeaza();
                 System.out.println(afisaj);
                 System.out.println(stapana.getAlu().getRezultat());
                 break;  
            default:    
                afisaj = afisaj + noulAfisaj;
                int afisajInt = Integer.parseInt(afisaj);
                int operandUnu = stapana.getAlu().getOperandUnu();
                int operandDoi = stapana.getAlu().getOperandDoi();
                
                if(0 == operandUnu || ' ' == stapana.getAlu().getOperator()){
                    stapana.getAlu().setOperandUnu(afisajInt);
                    System.out.println(afisaj);
                }
                  
                else if (' ' == operandDoi || ' ' == stapana.getAlu().getOperator()){
                   stapana.getAlu().setOperandDoi(afisajInt);
                   System.out.println(afisaj);
                    
                }
        }
    }
    /**
     * Private method for computation
     */
    private void operatiuneLocala(char c){
        stapana.getAlu().setOperandUnu(Integer.parseInt(afisaj));
        stapana.getAlu().setOperator(c);
        afisaj = Character.toString(c);
        System.out.println(afisaj);
        afisaj="0";
    }
} 