import java.util.*;

public class Bot {
	private Random randomGenerator;
    private ArrayList<String> defaultResponses;
    private HashMap<String, String> responseMap;
	
	public Bot() {
		defaultResponses = new ArrayList<String>();
        responseMap = new HashMap<String, String>();
        fillResponses();
        fillDefaultResponses();
        randomGenerator = new Random();
    }
	
    public String generateResponse(HashSet<String> words)
    {
        for(String word : words)
        {
            String response = responseMap.get(word);
            if(response != null)
            {
                return response;
            }
        }
        return pickDefaultResponse();
    }
    
    private void fillResponses()
    {
        responseMap.put("sapi", "Benar sekali. Aku hewan ternak!");
        responseMap.put("ayam", "Aku hewan ternak!");
        responseMap.put("kucing", "Salah, aku bukan hewan ternak!");
    }
    
    private void fillDefaultResponses()
    {
        defaultResponses.add("Masukkan yang ada di pilihan saja ya!");
    }
    
    private String pickDefaultResponse()
    {
        int index = randomGenerator.nextInt(defaultResponses.size());
        return defaultResponses.get(index);
    }

}
