/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class SnowMobile extends Rental {
    private int capacity;
    private String vin;
    
    
	public SnowMobile()
    {
        super();
        capacity = 0;
        vin = "";
    }
    
    public SnowMobile(boolean newnewModel, double newrentalCost, long newrentalNumber, int newcapacity, String newvin)
    {
		super( newnewModel, newrentalCost, newrentalNumber );
		setCapacity(newcapacity);
		setVin(newvin);
    }
	
    public int getCapacity()
    {
        return capacity;
    }
	
    public void setCapacity(int newCapacity)
    {
        if(newCapacity == 0) throw new IllegalArgumentException();
        if(newCapacity < 0){
            capacity = (-newCapacity);
        }
        else {
             capacity = newCapacity;
        }
    }
	
    public String getVin()
    {
        return vin;
    }
	
    public void setVin(String newVin)
    {
        vin = newVin;
    }
	
    public double lateCharge()
    {
        double percent = (20+(capacity*5))/100;
        double lateAmount = (super.getrentalCost())*percent;
        return lateAmount;
    }
	
    @Override
    public String toString() 
    {
        return super.toString()+"\nCapacity: "+capacity+"\nVin: "+vin; 
    }
	
}
