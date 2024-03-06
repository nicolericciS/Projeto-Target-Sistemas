
public class InversaoString {
	
	private String palavra = "nicole"; 
	
	public String Inverter() {
		char[] chars = palavra.toCharArray();
        int start = 0;
        int end = palavra.length() - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            
            start++;
            end--;
        }
        return new String(chars);
	}
	
}