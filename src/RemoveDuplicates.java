import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		ArrayList<String> duplicateList = new ArrayList<String>();
		duplicateList.add("1 BIRAÈKO MJESTO BERLIN 32578");
		duplicateList.add("2 BIRAÈKO MJESTO BERLIN 32578");
		duplicateList.add("3 BIRAÈKO MJESTO ZAGREB 12546");
		duplicateList.add("4 BIRAÈKO MJESTO ZAGREB 12546");
		
		
		for(int i=0; i<=duplicateList.size()-1; i++) {
		String parts[] = duplicateList.get(i).split(" ", 2);
		
		
				for(int j = i+1; j<=duplicateList.size()-1; j++) {
				String parts2 [] = duplicateList.get(j).split(" " ,2);
					if(parts[1].equals(parts2[1])){
						//ako su jednaki ostatci
						duplicateList.remove(i);
						//System.out.println(duplicateList.get(j));
					}}
		}
		
		for(int i=0; i<= duplicateList.size()-1;i++) {
			String parts[] = duplicateList.get(i).split(" ",2);
			parts[0] = Integer.toString(i+1);
					System.out.println(parts[0] + " " +parts[1]);
		}
		
		
					
	
	}

}
