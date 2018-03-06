
public class Problem_17 {

	public static void main(String[] args){

	int one = "one".length();
	
	int two = "two".length();
	
	int three = "three".length();
	
	int four = "four".length();
	
	int five = "five".length();
	
	int six = "six".length();
	
	int seven = "seven".length();
	
	int eight = "eight".length();
	
	int nine = "nine".length();
	
	int ten = "ten".length();
	
	int eleven = "eleven".length();
	
	int twelve = "twelve".length();
	
	int thirteen = "thirteen".length();
	
	int fourteen = "fourteen".length();
	
	int fifteen = "fifteen".length();
	
	int sixteen = "sixteen".length();
	
	int seventeen = "seventeen".length();
	
	int eighteen = "eighteen".length();
	
	int nineteen = "nineteen".length();
	
	int twenty = "twenty".length();
	
	int thirty = "thirty".length();
	
	int forty = "forty".length();
	
	int fifty = "fifty".length();
	
	int sixty = "sixty".length();
	
	int seventy = "seventy".length();
	
	int eighty = "eighty".length();
	
	int ninety = "ninety".length();
	
	int hundred = "hundred".length();
	
	int thousand = "onethousand".length();
	
	int and = "and".length();
		
	int first_99 = (one+two+three+four+five+six+seven+eight+nine)*9+ten+eleven+twelve+thirteen+fourteen+fifteen+sixteen+seventeen+eighteen+nineteen+(twenty+thirty+forty+fifty+sixty+seventy+eighty+ninety)*10
			;
	
	int hundreds = (one+two+three+four+five+six+seven+eight+nine+(hundred)*9)*100;
	
	int additional = (and)*99*9 + thousand;
	
	int all = (first_99)*10 + hundreds + additional;
	
	System.out.println(first_99);
	System.out.println(hundreds);
	System.out.println(additional);
	System.out.println(all);
	
	
	}
}
