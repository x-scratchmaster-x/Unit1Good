package Lab1;

public class StarObject {
	public StarObject(){
		
	}
	
		public void Triangle2(int max){
			for(int i=max;i>=0;i--){
				String thing = "";
				for(int j=0;j<i;j++){
					thing += " ";
				}
				thing += "*************************************";
				thing = thing.substring(0, max);
			System.out.println(thing);
			}
			System.out.println("");
		}
		
		public void Triangle1(int max){
			for(int i=max;i>=0;i--){
				for(int j=0;j<i;j++){
					System.out.print("*");
				}
			System.out.println("");
			}
	}
		public void Triangle3(int max){
			for(int i=0;i<=max;i++){
				String thing = "";
				for(int j=0;j<i;j++){
					thing += (" ");
				}
				thing += "*************************************";
				thing = thing.substring(0,max);
				System.out.println(thing);
			}
		
	}
		public void Star1(int max){
			String thing = "" ;
			for(int i= (max%2); i<=max;i+=2) {
				thing = "";
				for(int j=0;j<i;j++){
					thing += "*";
				}
				thing = "          " + thing + "          ";
				thing = thing.substring((thing.length()-max)/2, thing.length()-(thing.length()-max)/2);
				System.out.println(thing);;
			}
			for(int i= max; i>=(max%2);i-=2) {
				thing = "";
				for(int j=0;j<i;j++){
					thing += "*";
				}
				thing = "          " + thing + "          ";
				thing = thing.substring((thing.length()-max)/2, thing.length()-(thing.length()-max)/2);
				System.out.println(thing);;
			}
			
		}
		
		
}

