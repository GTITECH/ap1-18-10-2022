package gol;

public class Goleiro2 {

	public class Goleiro {
		private int id;
		private String nome;
		private int velocidade;
		private int flexibilidade; 
		private int agilidade;
		private int coordenacao;
		private int forca;
		private int equilibrio;
		
		//obs: O número retornado pela fórmula AAG será a quantidade de posições em que o goleiro cobrirá do gol.
		public int AreaAtuaçãoGoleiro(int velocidade, int flexibilidade,int agilidade, int coordenacao, int força, int equilibrio) {
			int AAG;
			AAG=((velocidade*3)+(flexibilidade*2)+(agilidade*3)+(coordenacao*2)+(força)+(equilibrio*2))/8;
			return AAG;
		}
		public Goleiro(int id, String nome, int velocidade, int flexibilidade,int agilidade, int coordenacao, int forca, int equilibrio) {
			this.id=id;
			this.nome=nome;
			this.velocidade=velocidade;
			this.flexibilidade=flexibilidade;
			this.agilidade=agilidade;
			this.coordenacao=coordenacao;
			this.forca=forca;
			this.equilibrio=equilibrio;
			
		}
		
	}
	
}
