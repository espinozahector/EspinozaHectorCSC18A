/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class Ski extends Rental {
	
    private int size;
    
	public Ski()
    {
        super();
        size = 0;  
    }
    
    public Ski(boolean newnewModel, double newrentalCost, long newrentalNumber, int newsize)
    {
        super( newnewModel, newrentalCost, newrentalNumber );
		setSize(newsize);
    }
	
    public int getSize() 
    {
        return size;
    }
	
    public void setSize(int newSize)
    {
        if(newSize == 0) throw new IllegalArgumentException();
        if(newSize < 0){
            size = -newSize;
        }
        else {
            size = newSize;
        }
    }
	
    @Override
    public double lateCharge()
    {
        double lateAmount = (super.getrentalCost())*.10;
        return lateAmount;
    }
	
    @Override
    public String toString() 
    {
        return super.toString()+"\nSize: "+size;
    }
}
