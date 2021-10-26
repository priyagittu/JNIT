package basicModifier;

public class MarksOfSubject {

	public static void main(String[] args) {
		int marks[]= {89,56,76,96,99,80};
		int totalMarks=89+56+76+96+99+80;
		int avarageMarks=totalMarks/6;
		System.out.println("sum of totalmarks is:"+ totalMarks);
		System.out.println("avarage of marks: "+ avarageMarks);
if(avarageMarks>90 && avarageMarks<100) {
	System.out.println("student grade is A");
}
	else if(avarageMarks>80 && avarageMarks<90) {
		System.out.println("student grade is B");
	}
	else if(avarageMarks>70 && avarageMarks<80) {
System.out.println("student grade is c");
}
	else if(avarageMarks>60 && avarageMarks<70) {
		System.out.println("student grade is D");
	}
	else
		System.out.println("student is fail");
}}

