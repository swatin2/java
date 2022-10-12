package hospital;
public class Patient
{
	private int PatientId;
	private String PatientName;
	private int BedType;
	private int noofDays;
        public Patient (){} 
	public Patient(int id,String name,int type,int days)
	{
		PatientId=id;
		PatientName=name;
		BedType=type;
		noofDays=days;
	}

	void setPatientId(int id)
	{
		PatientId=id;
	}
	int getPatientId()
	{
		return PatientId;
	}
	
	void setPatientName(String n)
	{
		PatientName=n;
	}

	String getPatientName()
	{
		return PatientName;
	}
	void setBedType(int t)
	{
		BedType=t;
	}

	int getBedType()
	{
		return BedType;
	}
	void setnoofDays(int d)
	{
		noofDays=d;
	}
	
	int getnoofDays()
	{
		return noofDays;
	}

	public int getPricePerDays()
	{
		int type=BedType;

		switch (type)
		{
			case 1 :
				return 500;
				
		        case 2 :
				return 350;
			
			default :
				return 200;
		}
	}
	public double getBillAmount()
	{
		double billAmt=noofDays * getPricePerDays();
		return billAmt;
	}
}

