package javaassignments;
class parent5{
static void CU_AC_ID()
{
	System.out.println("CU_AC_ID is created");
}
}
class parent4 extends parent5{
static void oprId()
{
	System.out.println("opr Id is created");
}
}
class parent3 extends parent4 {
static void appNo()
{
	System.out.println("appNo is created for the oprId");
}	
}
class parent2 extends parent3{
static void emplyNo() {
	System.out.println("emplyNo is created");
}
}
class parent1 extends parent2{
static void appSubmission(){
	System.out.println("app submission");
}
}
public class MultiLevelInheritance_14 extends parent1 {

	public static void main(String[] args) {
		CU_AC_ID();
		oprId();
		appNo();
		emplyNo();
		appSubmission();
	}

}
