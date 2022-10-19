package gol;

public class Gol {
	
	private String matrizGol[][];

	public void celulasGol(){
		matrizGol = new String[8][16];
		for (int x = 0; x <= 8; x++){
			for (int y = 0; y <= 16; y++){
				//trave
				if((x==1&&y<=15&&y!=0)||(x<=8&&x!=0&&y==1)||(x<=8&&x!=0&&y==15)) {
					System.out.print("|");
				//Fora
				}else if ((x==0&&y<=16)||(x<=8&&y==0)||(x<=8&&y==16)) {
					System.out.print(".");
				//Gaveta 
				} else if((x==2&&y==2)||(x==2&&y==14)) {
					System.out.print("G");
				//Gol
				} else {
					System.out.print("#");
				}
				}
				
			System.out.println("");
			}
		}
	
	public void Quadrantes() {
		matrizGol = new String[8][16];
		for (int x = 0; x <= 8; x++){
			for (int y = 0; y <= 16; y++){
				if(x<=4&&y<=8) {
					System.out.print("1");
				}else if(x>4&&y<=8) {
					System.out.print("3");
				}else if(x<=4&&y>8) {
					System.out.print("2");
				} else System.out.print("4");
				
		} System.out.println("");
	}	
 }
}
