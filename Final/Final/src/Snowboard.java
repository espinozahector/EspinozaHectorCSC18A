/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Snowboard extends Rental {
	
    private int size;
    private boolean freestyle;
    
	public Snowboard()
    {
        super();
        size = 0;
        freestyle = false;
    }
	
	public Snowboard(boolean newnewModel, double newrentalCost, long newrentalNumber, int newsize, boolean newfreestyle)
    {
        super( newnewModel, newrentalCost, newrentalNumber );
		setSize(newsize);
		setfreestyle(newfreestyle);
    }
	
    public int getSize()
    {
        return size;
    }
	
    public void setSize(int newSize)
    {
        if ( newSize==0 ) throw new IllegalArgumentException();
        if(newSize < 0) {
            size= -newSize;
        }
        else {
            size = newSize;
        }
    }
	
    public boolean getfreestyle()
    {
        return freestyle;
    }
	
    public void setfreestyle(boolean newfreestyle)
    {
        freestyle = newfreestyle;
    }
	
    public double lateCharge()
    {
        double lateAmount = (super.getrentalCost()*.20);
        return lateAmount;
    }
	
    @Override
    public String toString()
    {
        return super.toString()+"\nSize: "+size+"\nFreeSyle: "+getfreestyle(); 
    }
	
}
