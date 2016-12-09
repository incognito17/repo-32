package tpe.testate.crypter;

public class CrypterImpl implements Crypter {
	/**
	 * Methode zum enkrypten.
	 */
	@Override
	public String encrypt(String input) {
		//Hier wird der eingegebene String in Kleinbuchstaben umgewandelt mittels toLowerCase()
		String lower = input.toLowerCase();
		String tmp1 ="";
		
		//Hier werden die ungültigen Zeichen aussortiert und
		//nur die gültigen Zeichen werden in einen temporären String aufgenommen.
		for(int i=0; i<lower.length();i++){
			if((lower.charAt(i)<='9'&& lower.charAt(i)>='0')|| 
			(lower.charAt(i)<='z' && lower.charAt(i)>= 'a')||(lower.charAt(i)==' ' )){
				
				tmp1 += lower.charAt(i);
			}
		}
		//Hier wird der temporäre String in einen Char-array umgewandelt.
		char [] tmp = new char[tmp1.length()];
		for(int j=0; j<tmp1.length();j++){
			tmp[j]=tmp1.charAt(j);
			}
		//Hier findet die eigentliche Umkodierung statt.
		//Die einzelnen Zeichen werden gemäß den Vorgabenvertauscht.
		for (int n= 0; n<tmp.length; n++){
			char c=tmp[n];
			switch(c){
				case 'e': tmp[n]='3';
			          break;	
				case '3': tmp[n]='e';
			          break;	
				case 'l': tmp[n]='1';
			          break;	
				case '1': tmp[n]='l';
			          break;	
				case 'o': tmp[n]='0';
			          break;	
				case '0': tmp[n]='o';
			          break;	
				case 'a': tmp[n]='4';
			          break;	
				case '4': tmp[n]='a';
			          break;	
				case 't': tmp[n]='7';
			          break;	
				case '7': tmp[n]='t';
			          break;	
			 }
			}
		String output = new String (tmp);
		return output;
	}
	/**
	 * Methode zum Dekrypten.
	 */
	@Override
	public String decrypt(String input) throws IllegalArgumentException {
		//Der eingegebene String wird in ein Char-array umgewandelt.
		char [] tmpD = new char[input.length()];
		for(int j=0; j<input.length();j++){
			tmpD[j]=input.charAt(j);
			}
		//Hier wird zunächst in einer for-Schleife geprüft ob der nun
		//umgewandelte Char-array ungültige Zeichen enthält, 
		//falls ja wird eine IllegalArgumentException geworfen.
		for (int n= 0; n<tmpD.length; n++){
			if(tmpD[n]>='A' && tmpD[n]<='Z'){
				
				throw new IllegalArgumentException();
				
			}else if(tmpD[n]=='Ä'||tmpD[n]=='Ü' ||tmpD[n]=='Ö' 
					|| tmpD[n]=='ü'||tmpD[n]=='ä' ||tmpD[n]=='ö' ){
				
				throw new IllegalArgumentException();
				
			}else if(tmpD[n]=='&'||tmpD[n]=='$'||tmpD[n]=='%' ||tmpD[n]=='/' 
					||tmpD[n]=='?' ||tmpD[n]=='!'||tmpD[n]=='§'){
				
				throw new IllegalArgumentException();
				
			//Andernfalls, falls keine Exception geworfen wurde, wurd nun dekodiert
			//dies passiert nach demselben Prinzip wir kodiert wurde.
			}else{
				char c=tmpD[n];
			switch(c){
				case 'e': tmpD[n]='3';
				          break;	
				case '3': tmpD[n]='e';
				          break;	
			    case 'l': tmpD[n]='1';
				          break;	
				case '1': tmpD[n]='l';
				          break;	
				case 'o': tmpD[n]='0';
				          break;	
				case '0': tmpD[n]='o';
				          break;	
				case 'a': tmpD[n]='4';
				          break;	
				case '4': tmpD[n]='a';
				          break;	
				case 't': tmpD[n]='7';
				          break;	
				case '7': tmpD[n]='t';
				          break;	
				 }
				}
			}
		String output = new String (tmpD);
		return output;
	}
	}