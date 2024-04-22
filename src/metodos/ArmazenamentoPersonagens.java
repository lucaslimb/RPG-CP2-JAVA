package metodos;

import java.util.ArrayList;
import java.util.List;

public class ArmazenamentoPersonagens {

	    private static List<Personagem> personagens = new ArrayList<>();

	    public static void adicionarPersonagem(Personagem personagem) {
	        personagens.add(personagem);
	    }

	    public static List<Personagem> getPersonagens() {
	        return personagens;
	    }

	    public static void limparPersonagens() {
	        personagens.clear();
	    }
	    
	    public static String getNome(int index) {
	        List<Personagem> listaPersonagens = ArmazenamentoPersonagens.getPersonagens();

	        Personagem personagem = listaPersonagens.get(index);
	        String nome = personagem.getNome();
	        return nome;
	    }
	    public static String getClasse(int index) {
	        List<Personagem> listaPersonagens = ArmazenamentoPersonagens.getPersonagens();

	        Personagem personagem = listaPersonagens.get(index);
	        String classe = personagem.getClasse();
	        return classe;
	    }
	    public static String getRaca(int index) {
	        List<Personagem> listaPersonagens = ArmazenamentoPersonagens.getPersonagens();

	        Personagem personagem = listaPersonagens.get(index);
	        String raca = personagem.getRaca();
	        return raca;
	    }
	    public static String getRating(int index) {
	        List<Personagem> listaPersonagens = ArmazenamentoPersonagens.getPersonagens();

	        Personagem personagem = listaPersonagens.get(index);
	        String rating = personagem.getRating();
	        return rating;
	    }

	}
	

