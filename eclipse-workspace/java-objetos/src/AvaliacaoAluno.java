
public class AvaliacaoAluno extends Aluno {

	public static void main(String[] args) {
		Aluno student1 = new Aluno ();
		student1.name = "Marcos Silva";
		student1.course = "Teste de Softwares";
		student1.note1 = 7;
		student1.note2 = 5.7;
		student1.note3 = 8;
		student1.note4 = 10;
		
		Aluno student2 = new Aluno ();
		student2.name = "Karina da Mota";
		student2.course = "Teste de Softwares";
		student2.note1 = 5;
		student2.note2 = 5;
		student2.note3 = 8;
		student2.note4 = 7;
		
		System.out.println("O aluno " + student1.getName() + " do curso de " + 
				student1.getCourse() + " está com nota " + student1.calculaMedia() + " e encontra-se " + student1.getSituacao());
		
		System.out.println("----------------");
		
		System.out.println("O aluno " + student2.getName() + " do curso de " + 
				student2.getCourse() + " está com nota " + student2.calculaMedia() + " e encontra-se " + student2.getSituacao());
	}

}
