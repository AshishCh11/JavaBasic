import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Test4 {
	public static void main(String args[])
	{
		String str = "aabbcccdddaaaabbccc";

		String chars[] = str.split("");
		Map<String, Integer> compressMap = new LinkedHashMap<String, Integer>();
		for(String s: chars) {
		if("".equals(s))
		    continue;
		Integer count = compressMap.get(s);
		if(count != null)
		    compressMap.put(s, ++count);
		else
		    compressMap.put(s, 1);
		}

		StringBuffer output = new StringBuffer("");
		for (Map.Entry<String, Integer> entry : compressMap.entrySet()) {
		    output.append(entry.getValue()).append(entry.getKey());
		}
		System.out.println(output);
		
	}
	}
	
	
	



