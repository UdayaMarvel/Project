package org.In;

import java.util.Scanner;

public class Sample {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Marks");
int a=s.nextInt();
if (a<25) {
	System.out.println("F Grade");
}
else if((a>=25)&&(a<45)) {
	System.out.println("E Grade");
}
else if((a>=45)&&(a<50)) {
	System.out.println("D Grade");
}
else if((a>=50)&&(a<60)) {
	System.out.println("C Grade");
}
else if((a>=60)&&(a<80)) {
	System.out.println("B Grade");
}
else if(a>80) {
	System.out.println("A Grade");
}
else {
	System.out.println("Not Corrected Marks");
}

}
}
