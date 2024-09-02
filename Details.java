/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fault;
import java.util.ArrayList;
/**
 *
 * @author admin
 */
public class Details 
{
    static String inpath="input";
    static ArrayList datalt=new ArrayList();
    
    static String colNames[];
    
    static double data[][];
    
    //static String FCr[]={"1.0#0.1","1.0#0.9","0.8#0.2"};
    static double Fr1=1.0;
    static double Cr1=0.1;
    
    static double Fr2=1.0;
    static double Cr2=0.9;
    
    static double Fr3=0.8;
    static double Cr3=0.2;
    
    
    static int N=10;
    static double objFn[];
    static int tmax=100;
    
    static ArrayList selInd=new ArrayList();
    
    static int rem[]={};
    
}
