package infrastructure.Converters;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONConverter {
	//private static JSONConverter
	private static ObjectMapper objectMapper = null;
	
	public static ObjectMapper getInstance(){
		if(objectMapper == null){
			objectMapper = new ObjectMapper();
		}
		return objectMapper;
	}

}
