/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rcc
 */
public abstract class Rental {
	
    private boolean newModel;
    private double rentalCost;
    private long rentalNumber;
    
	Rental()
    {
        newModel = false; 
        rentalCost = 0;
        rentalNumber = 0;
    }
	
    public Rental(boolean newnewModel, double newrentalCost, long newrentalNumber)
    {
		setnewModel(newnewModel);
		setrentalCost(newrentalCost);
		setrentalNumber(newrentalNumber);        
	}
	
    public boolean equals(Rental f1)
    {
        return this.rentalNumber == f1.rentalNumber;
    }
	
    //New Model
    public boolean getnewModel()
    {
        return newModel;
    }
    public void setnewModel(boolean newnewModel)
    {
        newModel = newnewModel;
    }
    //Rental Cost
    public double getrentalCost()
    {
        return rentalCost;
    }
    public void setrentalCost(double newrentalCost)
    {
        if ( newrentalCost==0 ) throw new IllegalArgumentException();
        if(newrentalCost < 0) {
            rentalCost= (-newrentalCost);
        }
        else {
            rentalCost = newrentalCost;
        }
    }
    //Rental Number
    public long getrentalNumber()
    {
        return rentalNumber;
    }
    public void setrentalNumber(long newrentalNumber)
    {
        if(newrentalNumber == 0) throw new IllegalArgumentException();
        if(newrentalNumber < 0){
            rentalNumber = (-newrentalNumber);
        }
        else {
            rentalNumber = newrentalNumber;
        }
    }
	//To String
    public String toString() 
    {
        return "newModel: "+getnewModel()+"\nrentalCost: "+
                rentalCost+"\nrentalNumber: "+rentalNumber;

    }
	
    public abstract double lateCharge();
}
