// Expt-1a branching and Looping
class grade
{
 public static void main(String args[])
{
 int percent = Integer.parseInt(args[0]);
 int G = percent/10;
 switch (G)
 {
 case 10:
 case 9:
 case 8:
 case 7:
 System.out.println("Vishal has Secured destinction class");
 break;
 case 6:
 System.out.println("Vishal has Secured I class");
 break;
 case 5:
 System.out.println("Vishal has Secured II class");
 break;
 case 4:
 System.out.println("Vishal has Secured PASS class");
 break;
 case 3:
 case 2:
 case 1:
 case 0:
 System.out.println("Vishal has Secured FAIL class");
 break;
default:
System.out.println("Invalid Score");
}}}
