package interview;


import java.util.HashSet;

class Planet
{
	String planetNameM="Mercury";
	int NoOfMoonsM=0;
	boolean PlanetHasRingsM=false;
	
	String planetNameV="Venus";
	int NoOfMoonsV=0;
	boolean PlanetHasRingsV=false;
	
	String planetNameE="Earth";
	int NoOfMoonsE=1;
	boolean PlanetHasRingsE=false;
	
	String planetNameJ="Jupitor";
	int NoOfMoonsJ=79;
	boolean PlanetHasRingsJ=true;
	
	String planetNameS="Saturn";
	int NoOfMoonsS=83;
	boolean PlanetHasRingsS=true;
	
	String planetNameU="Uranus";
	int NoOfMoonsU=27;
	boolean PlanetHasRingsU=true;
	
	
	public void Gasses()
	{
		HashSet<String> oSet=new HashSet<String>();
		oSet.add("Nitrogen");
		oSet.add("Oxygen");
		oSet.add("Hydrogen");
		oSet.add("Helium");
		oSet.add("Hydrogen");
		oSet.add("Helium");
		oSet.add("Hydrogen");
		oSet.add("Helium");
		oSet.add("Methane");
		oSet.add("Carbon Dioxide");
		oSet.add("Nitrogen");
		System.out.println(oSet);	
	}
}
public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet P = new Planet();
		int MoonCount=P.NoOfMoonsE+P.NoOfMoonsJ+P.NoOfMoonsM+P.NoOfMoonsS+P.NoOfMoonsU+P.NoOfMoonsV;
		System.out.println(MoonCount);
		P.Gasses();
	}
}
