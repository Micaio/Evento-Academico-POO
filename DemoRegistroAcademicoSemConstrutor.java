package data2;

public class DemoRegistroAcademicoSemConstrutor {

	public static void main(String[] args) {
		RegistroAcademicoSemConstrutor andre = new RegistroAcademicoSemConstrutor();
		RegistroAcademicoSemConstrutor marcos = new RegistroAcademicoSemConstrutor(); //sugestao
		Data2 d = new Data2((byte)19,(byte)11,(short)2019);
		
		
		andre.inicializaRegistroAcademicoSemConstrutor("andre freitas",123, d, (byte)  3,(double) 50.0 );

		System.out.println("mensalidade de andre "+ andre.calculaMensalidade());
		System.out.println("mensalidade de marcos "+ marcos.calculaMensalidade());
                andre.mostra(d);
	}

}