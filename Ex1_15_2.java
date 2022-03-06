/*-< 演習：Ex1_15_2 >---------------------------------
コメントに従って2次元配列からデータを抽出して画面に表示するプログラムを作ってください。
----------------------------------------------------*/
import java.util.ArrayList;
import java.util.List;

class Ex1_15_2{
	public static void main (String[] args) {
		
		/*
		**犬の情報を持つ配列。格納されている情報は以下のとおり。
		**  - dogs[x][0]：名前
		**  - dogs[x][1]：年齢
		**  - dogs[x][2]：性別
		*/
		String[][] dogs = {
		                    {"モコ" , "4歳"  , "メス"} ,
		                    {"ムギ" , "2歳"  , "オス"} ,
		                    {"ブブ" , "3歳"  , "メス"} ,
		                    {"シロ" , "8歳"  , "オス"} ,
		                    {"ブブ" , "3歳"  , "メス"} ,
		                    {"ペロ" , "1歳"  , "メス"} ,
		                    {"ルル" , "14歳" , "オス"} ,
		                    {"モモ" , "10歳" , "メス"} ,
		                    {"ポチ" , "6歳"  , "オス"} ,
		                    {"エル" , "2歳"  , "メス"} 
		                  };
		
		/*以下のプログラムを作成してください。
		**  ①Sring型を扱うArrayList「adultFemaleDogsList」を作成する
		**  ②2次元配列dogsから以下の条件にあてはまる名前を抽出し、すべてadultFemaleDogsListに格納する
		**     - 4歳以上
		**     - メス
		**    ※ヒント：年齢の文字列から「歳」を除去する方法について調べてみよう！
		**  ③adultFemaleDogsListに格納されているすべてのデータをprintlnで表示する
		*/
		
		final String REMOVE_CHAR_SAI = "歳";	//所外する文字（歳）
		final int BORDER_AGE = 4;           //年齢の境界線
		final String SEX_FEMALE = "メス";	//性別（）
		
		//String型を扱うArrayList「adultFemaleDogsList」を作成する
		List<String> adultFemaleDogsList = new ArrayList<String>();
		
		//２次元配列dogsから以下の条件に当てはまる名前を抽出し、すべてadultFemaleDogsListに格納する
		for (int i = 0; i < dogs.length; i++) {
			
			//4際以上かつメスである場合、adultFemaleDogsListに名前を格納する
			if (Integer.parseInt(dogs[i][1].replace(REMOVE_CHAR_SAI, "")) >= BORDER_AGE && dogs[i][2].equals(SEX_FEMALE)) {
				
				adultFemaleDogsList.add(dogs[i][0]);
				
			}
		}
		
		//adultFemaleDogsListに格納されている全てのデータをprintlnで表示する
		for (int i = 0; i < adultFemaleDogsList.size(); i++) {
			
			System.out.println(adultFemaleDogsList.get(i));
			
		}
		
	}
}

