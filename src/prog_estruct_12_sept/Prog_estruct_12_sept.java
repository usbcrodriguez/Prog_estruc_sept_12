/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prog_estruct_12_sept;

/**
 *
 * @author 202
 */
public class Prog_estruct_12_sept {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fecha fecha1,fecha2;
        fecha1 = new Fecha(12,9,2013);
        fecha2 = new Fecha (1,4,2000);
       
        System.out.println(fecha1.aFormatoNumerico());
        System.out.println(fecha1.aFormatoLetras());
        System.out.println(fecha2.aFormatoNumerico());
        System.out.println(fecha2.aFormatoLetras());
        if(fecha1.mayorQue(fecha2)) System.out.println(fecha1.aFormatoLetras()+
                " es mayor que "+fecha2.aFormatoLetras());
        else
        System.out.println(fecha2.aFormatoLetras()+
                " es mayor que "+fecha1.aFormatoLetras());
        
        
    }
}
