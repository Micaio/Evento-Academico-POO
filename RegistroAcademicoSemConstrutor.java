package data2;
public class RegistroAcademicoSemConstrutor {
	private String nomeDoAluno; //um nome
	private int numeroDeMatricula; //numeros de ate 9 digitos
	private Data2 dataDeNascimento;
	private byte codigoDoCurso; // 1 .. 4
	private double percentualDeCobranca; //0 a 100%
	
	/**
	 * 
	 * @param n Nome do individuo
	 * @param m matricula
	 * @param d data de nascimento
	 * @param c codigo do curso ( 1 arq, 2 ciencia comp, 3 eng comp , 4 zoo)
	 * @param p percentual de cobranca 0 a 100 %
	 */
	public void inicializaRegistroAcademicoSemConstrutor(String n, int m, Data2 d, byte c, double p) {
		nomeDoAluno = n; numeroDeMatricula = m; dataDeNascimento =d;
		codigoDoCurso = c; percentualDeCobranca = p;
	}
	
	public double calculaMensalidade() {
		double mensalidade = 0; //inicializa o valor a ser calculado
		if (codigoDoCurso == 1) // arquitetura
				mensalidade = 450.0;
		if (codigoDoCurso == 2) // Ciência da Computação
				mensalidade = 500.00;
		if (codigoDoCurso == 3) // Engenharia da Computação
				mensalidade = 550.00;
		if (codigoDoCurso == 4) // zootecnia
			mensalidade = 380.00;
		
		// calula percentual de cobrança: p =0 -> mensalidade =0.
		if(percentualDeCobranca == 0) 
				mensalidade = 0.0;
		else
				mensalidade = mensalidade * percentualDeCobranca /100;
		return mensalidade;
	}

public void mostra(Data2 i){
   
    System.out.println("Nome do aluno:" + nomeDoAluno);
    System.out.println("Numero da matricula:"+numeroDeMatricula);
    System.out.println("Data de  nascimento:"+i.dia()+"/"+i.mes()+"/"+i.ano());   
    System.out.println("Codigo do curso:" + codigoDoCurso);
    System.out.println("Percentual de  cobrança:"+percentualDeCobranca);
}




}
