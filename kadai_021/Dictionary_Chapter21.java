package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
		
	private HashMap<String,String> engList = new HashMap<String, String>();
		
		public Dictionary_Chapter21() {
		
			engList.put("apple","りんご");
			engList.put("peach","桃");
			engList.put("banana","バナナ");
			engList.put("lemon","レモン");
			engList.put("pear","梨");
			engList.put("kiwi","キウィ");
			engList.put("strawberry","いちご");
			engList.put("grape","ぶどう");
			engList.put("muscat","マスカット");
		}
		
		public void searchWords(String[] words) {
		
			for(String word : words) {
				if(engList.containsKey(word)) {
				System.out.println(word + "の意味は" + engList.get(word));
			}else {
				System.out.println(word + "は辞書に存在しません");
			}
		}

	}

}
