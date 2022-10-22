package jsonSortTraning;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSort {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		if(args.length == 1) {
			if("-help".equals(args[0])) {
				System.out.println("アプリケーション「JSONソート」は、JSON形式のファイル内の情報を\n入力キーを元に並べ替えて結果を表示します。");		
				return;
			}else {
				return;
			}
		}
		
		//System.out.println("並べ替える項目はなんですか？");
		//System.out.println("[0:番号 1:クラス 2:年齢 3:点数]");
		
		
		//System.out.println("並替種別を指定してください。");
		//System.out.println("[0:昇順 1:降順]");

		
		try {
			ObjectMapper mapper = new ObjectMapper();
			JsonNode root = mapper.readTree(new File("src/jsonSortTraning/input.json"));
			System.out.println("番号 名前 クラス 年齢 点数");
			for(JsonNode n : root.get("datas")) {
				String data_no = n.get("no").asText();
				String data_name = n.get("name").asText();
				String data_class = n.get("kurasu").asText();
				int age = n.get("age").asInt();
				int val = n.get("val").asInt();
				System.out.println(data_no + " " + data_name + " " + data_class + " " + age + " " + val);
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}

}
