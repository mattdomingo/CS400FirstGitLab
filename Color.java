/*
 *	Color class
 *	Name: Matthew Domingo
 *	Email: mgdomingo@wisc.edu
 *	CS Account username: domingo
 */
public class Color{
	private String color;

	//Constructor
	public Color(String iniColor){
		if(isColorValid(iniColor)){
			this.color = iniColor;
		}
		else{
			System.out.println("Failed to initalize the color");
		}
	}

	//Getter
	public String getColor(){
		return this.color;
	}

	/* The method for changing the color
	 * TODO: Revise the code so that it return true only if the input color is valid
	 * 	and different from the exisitng color before making the change
	 */
	public boolean  changeColor(String newColor){
		boolean isDifferent = !(this.color.equals(newColor));
		this.color = newColor;

		return (isColorValid(newColor) && isDifferent);
	}

	public boolean isColorValid(String inputColor){
		String [] validColor = {"red","orange","yellow","green", "cyan", "blue","purple"};
		for(int i=0; i<validColor.length; i++){
			if(inputColor.equals(validColor[i])){
				return true;
			}
		}
		
		//Failed to find a match, the color is invalid
		return false;
	}
}
