import java.util.Arrays;

public class StringMethods {
	

	public static void main(String[] args) {

		String name = "LoveLike";
		System.out.println(name.charAt(2));
		System.out.println(name.compareTo("lovelike"));
		System.out.println(name.compareToIgnoreCase("lovelike"));

		System.out.println(name.concat("Nobody"));
		System.out.println(name.contains("ve"));

		System.out.println(name.equals("Love"));

		System.out.println(name.equalsIgnoreCase("lovelike"));

		System.out.println(name.indexOf("e"));
		System.out.println(name.indexOf("ve"));
		System.out.println(name.indexOf("e", 5));

		System.out.println(name.lastIndexOf("e"));
		System.out.println(name.lastIndexOf("e", 5));
		System.out.println(name.length());
		System.out.println(name.matches("regex"));

		System.out.println(name.substring(2));
		System.out.println(name.substring(2, 5));

		char[] ab = name.toCharArray();

		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println("   Does all the trailing extra    spaces get removed     ".trim());



		StringBuilder sb = new StringBuilder(name);
		StringBuilder sbe = new StringBuilder();

		sbe.append("he ");
		sbe.append("is no one");
		System.out.println(sbe);

		System.out.println(sbe.charAt(2));
		sbe.delete(3, 5);
		System.out.println(sbe);
		sbe.deleteCharAt(3);
		System.out.println(sbe.equals("hell"));
		System.out.println(sbe.indexOf("o"));
		System.out.println(sbe.indexOf("o",5));
		

		sbe.insert(3,"who is afraid of noone, ");
		System.out.println(sbe);
		
		System.out.println(sbe.lastIndexOf("o"));;
		System.out.println(sbe.lastIndexOf("o", 29));
		System.out.println(sbe.replace(20, 25, "Everyone"));
		//System.out.println(sbe.reverse());
		System.out.println(sbe.substring(20, 28));


		String s1 = "kanb";
		
		StringBuilder be = new StringBuilder();
		be.append("k");
		be.append("a");
		be.append("nb");
		System.out.println(be.equals((String)s1));
		
		sbe.insert(0, "Addition ");
		System.out.println(sbe);
		

		
	}
}
