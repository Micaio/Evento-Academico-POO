package data2;
// classe que inclui politica de ocultacao de campos
public class Data2 {
	
	private byte dia,mes; 
	private short ano;
        Data2 (byte d,byte m,short a){
            inicializaData(d,m,a);
            
            
        }
        
	public void inicializaData(byte d,byte m,short a)
	{
	if (dataEValida(d,m,a)) // se a data for válida, inicializa os campos com os
		// valores passados como argumentos
		{
		dia = d; mes = m; ano = a;
		}
	else // caso contrário, inicializa os campos com zero
		{
		dia = 0; mes = 0; ano = 0;
		}
	}
	
	public boolean dataEValida(byte d, byte m, short a) {
		if ((d >=1) && // se o dia for maior ou igual a 1 E
				(d <= 31) && // se o dia for menor ou igual a 31 E
				(m >= 1) &&  //se o mês é > 1
				(m <= 12)) 
			return true; // data válida
		else
			return false; //data não é válida
	}
	
	public boolean eIgual(Data2 outraData)
	{//este acesso é permitido pois a instancia pode acessar seus proprios campos
	if ((dia == outraData.dia) && 
			(mes == outraData.mes) && 
			(ano == outraData.ano)) 
		return true; 
	else
		return false; 
	}
      
        public byte dia(){
            byte kk = this.dia;
            
            return kk;
        }
        public byte mes(){
            byte mes =this.mes;
            return mes;
        }
        public short ano(){
            short ano = this.ano;
            return ano;
        }
        
}