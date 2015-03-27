public class Dna_pairs {
	public static void main(String[] args){
		String strand_1 = "AATGCCTATGGC";
		String pair;
		for(int i = 0; i < strand_1.length(); i++){
			char c = strand_1.charAt(i);
			String C = Character.toString(c);

			if(C.equals("A"))
			{
				System.out.println("A T");
			}
			else if(C.equals("T"))
			{
				System.out.println("T A");
			}
			else if(C.equals("G"))
			{
				System.out.println("G C");
			}
			else if (C.equals("C"))
			{
				System.out.println("C G");
			}
			else
			{
				System.out.println("ERROR");
			}
		}

	}
}
