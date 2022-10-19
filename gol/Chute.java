package gol;

import java.util.Random;

public class Chute {

			private String matrizChute[][];
			
			public String[][] SorteioChute() {
				int x,y;
				Random sorteio = new Random();
				x=sorteio.nextInt(8);
				y=sorteio.nextInt(16);
				this.matrizChute = new String[x][y];
				return matrizChute;
			}

	}