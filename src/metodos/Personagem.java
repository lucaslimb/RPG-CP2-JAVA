package metodos;

public class Personagem {

	    private String nome;
	    private String classe;
	    private String raca;
	    private String rating;
	    
	    public Personagem(String nome, String classe, String raca, String rating) {
	       this.nome = nome;
	       this.classe = classe;
	       this.raca = raca;
	       this.rating = rating;
	    }

		public String getNome() {
			return nome;
		}

		public String getClasse() {
			return classe;
		}

		public String getRaca() {
			return raca;
		}

		public String getRating() {
			return rating;
		}
	    
	}