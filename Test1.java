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
public class Test1 
{
    public static void main(String ar[])
    {
        Random rn=new Random();
        int k=rn.nextInt(3);
        System.out.println(k);
    }
}
