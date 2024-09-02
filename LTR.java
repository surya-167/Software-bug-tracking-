/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fault;
import java.util.Random;
/**
 *
 * @author admin
 */
public class LTR 
{
    Details dt=new Details();
    int pop[][];
    
    LTR()
    {
        
    }
    
    public String process()
    {
        String sel1="";
        try
        {
            // create N population
            int d=dt.data[0].length;
            pop=new int[dt.N][d];
            dt.objFn=new double[dt.N];
            
            for(int i=0;i<dt.N;i++)
            {
		for(int j=0;j<d;j++)
		{
                    Random rn=new Random();
                    boolean b1=rn.nextBoolean();
                    if(b1)
                        pop[i][j]=1;
                    else
                    	pop[i][j]=0;
		}
		dt.objFn[i]=Double.NEGATIVE_INFINITY;
            }
            
            System.out.println("RANDOM POPULATION:");
            System.out.println("-------------------");
            for (int i = 0; i < dt.N; i++) 
            {
                for (int j = 0; j < d; j++) 
                {
                    System.out.print(" "+pop[i][j]);
                }
                System.out.print("\n");
                
            }
            
            int t=0;
            int best=0;
            while(t<dt.tmax)
            {
                Random rn=new Random();                
                double b1=0;
                for(int i=0;i<dt.N;i++)
                {
                    /*int ind1=rn.nextInt(dt.FCr.length); // randomly select control parameter
                    String s1[]=dt.FCr[ind1].split("#");  
                
                    double F=Double.parseDouble(s1[0]);
                    double Cr=Double.parseDouble(s1[1]);
                    */
                    // select r1 to r5 
                    int r1=rn.nextInt(dt.N);
                    while(r1==0)
                        r1=rn.nextInt(dt.N);
                    
                    int r2=rn.nextInt(dt.N);
                    while(r2==0)
                        r2=rn.nextInt(dt.N);
                    
                    int r3=rn.nextInt(dt.N);
                    while(r3==0)
                        r3=rn.nextInt(dt.N);
                
                    int r4=rn.nextInt(dt.N);
                    while(r4==0)
                        r4=rn.nextInt(dt.N);
                    
                    int r5=rn.nextInt(dt.N);
                    while(r5==0)
                        r5=rn.nextInt(dt.N);
                
                    double F1=rn.nextDouble();
                    double rand=rn.nextDouble();
                    
                    int jrand=rn.nextInt(d);
                    
                    double u1=0;
                    double u2=0;
                    double u3=0;
                    // rand-1-bin
                    if(rand<dt.Cr1)
                    {
                        u1=pop[r1][i]+dt.Fr1*Math.abs(pop[r2][i]-pop[r3][i]);
                    }
                    
                    if(rand<dt.Cr2)
                    {
                        u2=pop[r1][i]+F1*Math.abs(pop[r2][i]-pop[r3][i])+dt.Fr2*Math.abs(pop[r4][i]-pop[r5][i]);
                    }
                    if(rand<dt.Cr3)
                    {
                         u3=pop[r1][i]+rand*Math.abs(pop[r2][i]-pop[r3][i])+dt.Fr3*Math.abs(pop[r4][i]-pop[r5][i]);
                    }
                    
                    System.out.println(i+" == "+t+" ---- "+u1+" : "+u2+" : "+u3);
                    double sm=u1+u2+u3;
                    if(sm>b1)
                    {
                        b1=sm;
                        best=i;
                    }
                    
                } // for loop
                
                for(int i=0;i<dt.N;i++)
                {
                    for(int j=0;j<d;j++)
                    {
                    
                        boolean bs=rn.nextBoolean();
                        if(bs)
                            pop[i][j]=1;
                        else
                            pop[i][j]=0;
                    }
                }
                
                t++;
            }
            
            System.out.println("bt= "+best);
            String ss="";
            for(int i=0;i<d;i++)
            {
                if(pop[best][i]==1)
                {
                    dt.selInd.add(i);
                    ss=ss+dt.colNames[i]+"\n";
                }
            }
            System.out.println(ss);
            sel1=ss;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return sel1;
    }
    
   
}
