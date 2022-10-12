import hospital.Patient;
import hospital.InHousePatient;
class Main{
	public static void main (String [] args)
	{
		  Patient p=new Patient(100,"jack",100,200);
		  System.out.printf("Hospital Bill is %.2f%n",p.getBillAmount());
                  InHousePatient obj=new InHousePatient(100,"jack",100,200,0.8);
		  System.out.printf("Hospital Bill is %.2f%n",obj.getBillAmount());
	}
}
