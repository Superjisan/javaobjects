public class Example{
	public static void main(String[] args){
		System.out.println("We are making a new Pez Dispenser");
		PezDispenser dispenser = new PezDispenser("Yoda");
		System.out.printf("The dispenser character is %s\n", 
			dispenser.getCharacterName());
	
  
    if(dispenser.isEmpty()){
      System.out.println("It is currently empty");
    }
    System.out.println("Loading...");
    dispenser.load();
  
    if(!dispenser.isEmpty()){
      System.out.println("It is no longer empty");
    };

    while(dispenser.dispense()){
    	System.out.println("CHOMP!");
    }

    if(dispenser.isEmpty()){
    	System.out.println("Ate all the Pez!");
    }

    dispenser.load(4);
    dispenser.load(2);
    while(dispenser.dispense()){
    	System.out.println("CHOMP!");
    }
  }
}