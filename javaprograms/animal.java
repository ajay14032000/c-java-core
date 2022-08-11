package javaprograms;

public class animal {
     String animal_name;
     String animal_type;
     animal(String name,String type){
    	 animal_name=name;
    	 animal_type=type;
     }
    public void sayAboutAnimal() {
    	System.out.println("the animal name: "+animal_name +"  and"+" the animal type: "+animal_type);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		animal animal1=new animal("karadi","omnivores");
		animal animal2=new animal("tiger","carnivores");

		animal1.sayAboutAnimal();
		animal2.sayAboutAnimal();
	}

}
