package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comentario;
import entities.Post;

public class Y_ExercicioPost {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Tenha uma boa viagem!");
		Comentario c2 = new Comentario("Wow isso foi impressionante!");
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44 "),
				"Viajando para Nova Zelandia",
				"Eu vou visitar este país maravilhoso!",
				12);
		p1.adicionarComentario(c1);
		p1.adicionarComentario(c2);
		
		Comentario c3 = new Comentario("Boa noite!");
		Comentario c4 = new Comentario("Que a força esteja com você.");
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19 "),
				"Boa noite rapazes",
				"Vejo vocês amanhã",
				5);
		p2.adicionarComentario(c3);
		p2.adicionarComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
