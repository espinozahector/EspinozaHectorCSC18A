//Chapter 7 - Classes

//class/objects 
//1.) -> properties (attributes) -> member variables
//2.) -> methods (functions) -> actions performed on objects of the classm attributes, and/or other methods

public class "class name" {
	
	public static void main(){
		
		
	}
}
//public and private are access modifiers
//public - all code that uses the class/object can access.
//Private - all code that uses the class/object cannot access private member variables or private methods
//In private information is hidden

//accessors -> getters (utility function)

//mutators -> setters (utility function)

	class name
public: attributes: datatypes
private: attributes: datatypes

methods: constructor
methods: setters
methods: getters

//constructor - method that is called when an object of the class is created

	class fraction
private numerator: int
private denomininator: int

method: public fraction();
method: public fraction(int,int);//overloading 
method: public int getNumerator()
method: public void setNumerator(int)
method: public int getdenomininator()
method: public void setdenomininator(int)
method: private reduce()
method: public double value();
method: public string tostring()
method: public fraction add(fraction)
method: public fraction subtract(fraction)
method: public fraction multiply(fraction)
method: public fraction divide(fraction)

//if we have a constructor that has our class as a parameter, this is called a copy constructor
//copy constructor -> makes a new object a copy of an exsiting object

//This is the Fraction class
private int numerator;
private int denomininator;

public Fraction(){
	numerator = 0;
	denomininator=1;
}
public Fraction(int n,int d){
	setNumerator(n);
	setdenomininator(d);
	reduce();
}
public Fraction(Fraction source){
	numerator = source.getNumerator();
	denomininator = source.getdenomininator();
}
public int getNumerator() {
	return numerator;
}
public void setNumerator(int newNumetor){
	numerator = newNumetor;
}
public int getdenomininator(){
	reuturn denomininator;
}
public int setdenomininator(int newdenominator){
	if (newdenominator == 0) throw new IllegalArgumentException();
	if (newdenominator < 0){
		numerator = - numerator;
		denomininator = -newdenominator;
	}
	else {
		denomininator = newdenominator;
	}
}
private int gcd(int n,int d){//numerator and denomininator
	int a = n;
	int b = d;
	while(b!=0){
		int r = a % b;
		a=b;
		b=r;
	}
	return a;
}
private void reduce(){
	//reduce the fraction to the reduced form
	int _gcd=gcd(numerator,denomininator);//find the gccd
	numerator/=_gcd;
	denomininator/=_gcd;
}
//return decimal value of our fraction
public double value(){
	return numerator / (double)denomininator;
}
@Override
public string tostring(){
	return numerator+" / "+denomininator;
}
public Fraction add(Fraction f2){
	int a = numerator; //numerator of out fraction object
	int b = denomininator; // denomininator of out fraction object
	int c = f2.getNumerator(); //numerator of f2 argument
	int d = f2.getdenomininator();//denomininator of the f2 argument
	return new Fraction(a*d + b*c,b*d);
}
public Fraction subtract(Fraction f2){
	int a = numerator; //numerator of out fraction object
	int b = denomininator; // denomininator of out fraction object
	int c = f2.getNumerator(); //numerator of f2 argument
	int d = f2.getdenomininator();//denomininator of the f2 argument
	return new Fraction(a*d - b*c,b*d);
}
public Fraction add(Fraction f2){
	int a = numerator; //numerator of out fraction object
	int b = denomininator; // denomininator of out fraction object
	int c = f2.getNumerator(); //numerator of f2 argument
	int d = f2.getdenomininator();//denomininator of the f2 argument
	return new Fraction(a*c,b*d);
}
public Fraction divide(Fraction f2){
	int a = numerator; //numerator of out fraction object
	int b = denomininator; // denomininator of out fraction object
	int c = f2.getNumerator(); //numerator of f2 argument
	int d = f2.getdenomininator();//denomininator of the f2 argument
	return new Fraction(a*d,b*c);
}
