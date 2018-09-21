/*
 * Carcasa calculatorului de birou
 */
package oopcomputer;

/**
 *
 * @author Marian
 */
public class Carcasa {
    
    private Ecran ecran = new Ecran(this);

    public Ecran getEcran() {
        return ecran;
    }
    public Buton buton0 = new Buton('0',this);
    public Buton buton1 = new Buton('1',this);
    public Buton buton2 = new Buton('2',this);
    public Buton buton3 = new Buton('3',this);
    public Buton buton4 = new Buton('4',this);
    public Buton buton5 = new Buton('5',this);
    public Buton buton6 = new Buton('6',this);
    public Buton buton7 = new Buton('7',this);
    public Buton buton8 = new Buton('8',this);
    public Buton buton9 = new Buton('9',this);
    public Buton butonPlus = new Buton('+',this);
    public Buton butonMinus = new Buton('-',this);
    public Buton butonOri = new Buton('*',this);
    public Buton butonImpartire = new Buton('/',this);
    public Buton butonEgal = new Buton('=',this);
    Alu alu = new Alu();

    public Alu getAlu() {
        return alu;
    }
    
    /**
     * Metoda simteButoane care simte cand s-a apasat un buton si citeste 
     * simbolul dupa care il da mai departe ecranului
     */
    
    public void simteButoane (){
        
    }
   
}
