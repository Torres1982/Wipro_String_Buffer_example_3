import java.lang.StringBuffer;

class Day2Task11 {
	public static void main(String args[]) {
		String string = "Barcelona";
		String copiesOfString = createNcopiesOfString(string);
		
		System.out.println(copiesOfString);	
	}
	
	public static String createNcopiesOfString(String string) {
		String result = "";
		String subString = "";
		int stringLength = string.length();
		StringBuffer buffer1;
		StringBuffer buffer2;
		
		if (stringLength < 2) {
			result = string;
		} else {
			subString = string.substring(0, 2);
			buffer1 = new StringBuffer("");
			buffer2 = new StringBuffer(subString);
			
			for (int i = 0; i < stringLength; i++) {
				buffer1.append(buffer2);
			}
			result = buffer1.toString();
		}
		return result;
	}
}