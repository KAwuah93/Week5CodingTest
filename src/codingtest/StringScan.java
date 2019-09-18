package codingtest;

public class StringScan {
	
	public static void main(String args[]) {
		String whole = "subsubsibsabStringSubsub";
		String whole2 = "";
		
		String sub = "sub";
		String sub2 = "";
		
		//System.out.println(Scan(whole,sub,0));
		System.out.println(RepeatScan(whole2,sub2,1));
	}
	
	//main method that checks to see if the String is included
	public static boolean RepeatScan(String check, String sub, int occurence) {
		if (check.equals("") || sub.equals("")) return false;
		int rptScan = Scan(check,sub,0);
		if(rptScan >= occurence) return true;
		return false;
	}
	public static int Scan(String whole, String sub, int y) {
		for(int i = 0; i <= whole.length() - sub.length(); i++) {
			if( whole.substring(i, i + sub.length()).equals(sub)){
				return Scan( whole.substring(i+sub.length()), sub, y+=1);
			}
		}
		return y;
	}
}
