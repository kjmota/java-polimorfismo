
public class Aluno {
		
	public String name;
	public String course;
	public double note1, note2, note3, note4;
	
	public double calculaMedia () {
		return (note1 + note2 + note3 + note4) / 4;
	}

	public String getSituacao() {
		double media = this.calculaMedia();
		
		if (media >= 7) {
			return "Aprovado.";
		} 
			return "Reprovado.";
		}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
	
}