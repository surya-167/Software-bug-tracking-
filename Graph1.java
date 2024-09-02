/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fault;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import java.awt.Color;
/**
 *
 * @author admin
 */
public class Graph1 
{
    Graph1()
    {
        
    }
    
    public void displayMAE(double m1,double m2)
    {
        try
        {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(m1, "All" ,"Metrics");
            dataset.setValue(m2, "Selected" ,"Metrics");           
            
            
            JFreeChart chart = ChartFactory.createBarChart
  
            ("MAE ","", " MAE", dataset, 
  
            PlotOrientation.VERTICAL, true,true, false);
            
            chart.getTitle().setPaint(Color.blue); 
  
            CategoryPlot p = chart.getCategoryPlot(); 
  
            p.setRangeGridlinePaint(Color.red); 
            System.out.println("Range : "+p.getRangeAxisCount() );
  
  
            CategoryItemRenderer renderer = p.getRenderer();

            renderer.setSeriesPaint(0, Color.red);
            renderer.setSeriesPaint(1, Color.green);
            
            
  
  
            ChartFrame frame1=new ChartFrame("MAE",chart);
  
            frame1.setSize(400,400);
  
            frame1.setVisible(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void displayRMSE(double m1,double m2)
    {
        try
        {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(m1, "All" ,"Metrics");
            dataset.setValue(m2, "Selected" ,"Metrics");           
            
            
            JFreeChart chart = ChartFactory.createBarChart
  
            ("RMSE ","", " RMSE", dataset, 
  
            PlotOrientation.VERTICAL, true,true, false);
            
            chart.getTitle().setPaint(Color.blue); 
  
            CategoryPlot p = chart.getCategoryPlot(); 
  
            p.setRangeGridlinePaint(Color.red); 
            System.out.println("Range : "+p.getRangeAxisCount() );
  
  
            CategoryItemRenderer renderer = p.getRenderer();

            renderer.setSeriesPaint(0, Color.BLUE);
            renderer.setSeriesPaint(1, Color.MAGENTA);
            
            
  
  
            ChartFrame frame1=new ChartFrame("RMSE",chart);
  
            frame1.setSize(400,400);
  
            frame1.setVisible(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void displayDF(double m1,double m2)
    {
        try
        {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(m1, "All" ,"Metrics");
            dataset.setValue(m2, "Selected" ,"Metrics");           
            
            
            JFreeChart chart = ChartFactory.createBarChart
  
            ("Defect ","", "Defect", dataset, 
  
            PlotOrientation.VERTICAL, true,true, false);
            
            chart.getTitle().setPaint(Color.blue); 
  
            CategoryPlot p = chart.getCategoryPlot(); 
  
            p.setRangeGridlinePaint(Color.red); 
            System.out.println("Range : "+p.getRangeAxisCount() );
  
  
            CategoryItemRenderer renderer = p.getRenderer();

            renderer.setSeriesPaint(0, Color.pink);
            renderer.setSeriesPaint(1, Color.orange);
            
            
  
  
            ChartFrame frame1=new ChartFrame("Defect",chart);
  
            frame1.setSize(400,400);
  
            frame1.setVisible(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void display1(double t1,double t2,double t3,double t4)
    {
        try
        {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(t1, "eclipse" ,"Dataset");
            dataset.setValue(t2, "lucene" ,"Dataset");           
            dataset.setValue(t3, "mylyn" ,"Dataset");
            dataset.setValue(t4, "pde" ,"Dataset");           
            
            JFreeChart chart = ChartFactory.createBarChart
  
            ("MAE - All Dataset","", " MAE", dataset, 
  
            PlotOrientation.VERTICAL, true,true, false);
            
            chart.getTitle().setPaint(Color.blue); 
  
            CategoryPlot p = chart.getCategoryPlot(); 
  
            p.setRangeGridlinePaint(Color.red); 
            System.out.println("Range : "+p.getRangeAxisCount() );
  
  
            CategoryItemRenderer renderer = p.getRenderer();

            renderer.setSeriesPaint(0, Color.red);
            renderer.setSeriesPaint(1, Color.green);
            renderer.setSeriesPaint(2, Color.blue);
            renderer.setSeriesPaint(3, Color.MAGENTA);
            
  
  
            ChartFrame frame1=new ChartFrame("MAE",chart);
  
            frame1.setSize(400,400);
  
            frame1.setVisible(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void display2(double t1,double t2,double t3,double t4)
    {
        try
        {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(t1, "eclipse" ,"Dataset");
            dataset.setValue(t2, "lucene" ,"Dataset");           
            dataset.setValue(t3, "mylyn" ,"Dataset");
            dataset.setValue(t4, "pde" ,"Dataset");           
            
            JFreeChart chart = ChartFactory.createBarChart
  
            ("RMSE -All Dataset ","", " RMSE", dataset, 
  
            PlotOrientation.VERTICAL, true,true, false);
            
            chart.getTitle().setPaint(Color.blue); 
  
            CategoryPlot p = chart.getCategoryPlot(); 
  
            p.setRangeGridlinePaint(Color.red); 
            //System.out.println("Range : "+p.getRangeAxisCount() );
  
  
            CategoryItemRenderer renderer = p.getRenderer();

            renderer.setSeriesPaint(0, Color.pink);
            renderer.setSeriesPaint(1, Color.cyan);
            renderer.setSeriesPaint(2, Color.ORANGE);
            renderer.setSeriesPaint(3, Color.gray);
            
  
  
            ChartFrame frame1=new ChartFrame("RMSE",chart);
  
            frame1.setSize(400,400);
  
            frame1.setVisible(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public void display3(double t1,double t2,double t3,double t4)
    {
        try
        {
            DefaultCategoryDataset dataset = new DefaultCategoryDataset();
            dataset.setValue(t1, "eclipse" ,"Dataset");
            dataset.setValue(t2, "lucene" ,"Dataset");           
            dataset.setValue(t3, "mylyn" ,"Dataset");
            dataset.setValue(t4, "pde" ,"Dataset");           
            
            JFreeChart chart = ChartFactory.createBarChart
  
            ("Defect -All Dataset ","", " Defect", dataset, 
  
            PlotOrientation.VERTICAL, true,true, false);
            
            chart.getTitle().setPaint(Color.blue); 
  
            CategoryPlot p = chart.getCategoryPlot(); 
  
            p.setRangeGridlinePaint(Color.red); 
            //System.out.println("Range : "+p.getRangeAxisCount() );
  
  
            CategoryItemRenderer renderer = p.getRenderer();

            renderer.setSeriesPaint(0, Color.red);
            renderer.setSeriesPaint(1, Color.cyan);
            renderer.setSeriesPaint(2, Color.pink);
            renderer.setSeriesPaint(3, Color.gray);
            
  
  
            ChartFrame frame1=new ChartFrame("Defect",chart);
  
            frame1.setSize(400,400);
  
            frame1.setVisible(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
