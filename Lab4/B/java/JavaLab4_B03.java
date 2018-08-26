

package javalab4_B;

/**
 * @author Ivan Panamarou
 */
public class JavaLab4_B03 {
   public static void main(String[] args) {
       int gr = 34_675_120;
       System.out.println("Task 3: Weight of the dinosaur is given in grams."
               + "\nCalculate the weight in kilograms, centners, tons.");
       double kg = B03_WeightCalculator.calculateKgs(gr);
       double c = B03_WeightCalculator.calculateCs(gr);
       double t = B03_WeightCalculator.calculateTs(gr);
       System.out.println("Weight of the dinosaur: ");
       System.out.println(gr+" Grams");
       System.out.println("or "+kg+" Kilograms");
       System.out.println("or "+c+" Centners");
       System.out.println("or "+t+" Tonnes");
       
   }
}
