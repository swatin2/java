package hospital;
public class InHousePatient extends Patient{
            private double discount;
	    public InHousePatient(){}
	    public InHousePatient(int id,String name,int type ,int day,double dis)
	    {
		    super(id,name,type,day);
		    discount=dis;
	    }
	    public double getDiscount()
	    {
		    return discount;
	    }

	    public double getBillAmount()
	    {
		    double billAmt=super.getBillAmount();
		    return billAmt>5000?0.5*billAmt:billAmt;
	    }
}
