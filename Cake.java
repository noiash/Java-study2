
public class Cake {

	public static void main(String[] args) {
		
		//定数の定義
		final String CAKE_NAME_SHT = "ショートケーキ"; //ショートケーキ　名前
		final int CAKE_PRICE_SHT = 320; //ショートケーキ　値段
		final String CAKE_NAME_MNB = "モンブラン"; //モンブラン　名前
		final int CAKE_PRICE_MNB = 350; //モンブラン　値段
		final String CAKE_NAME_CHO = "チョコレートケーキ"; //チョコレートケーキ　名前
		final int CAKE_PRICE_CHO = 370; //チョコレートケーキ　値段
		final String CAKE_NAME_ICH = "いちごのタルト"; //いちごのタルト　名前
		final int CAKE_PRICE_ICH = 400; //いちごのタルト　値段
		final String CAKE_NAME_CHZ = "チーズケーキ"; //チーズケーキ　名前
		final int CAKE_PRICE_CHZ = 300; //チーズケーキ　値段
		
		final int DISCOUNT_APPLYING_PRICE = 1000; //割引が適用される金額
		final double DISCOUNT_LATE = 0.8; //割引率　80％
		final double TAX = 1.08; //消費税 
		
		//支払額の計算
		String checkCakeName = ""; //処理対象のケーキ名
		int chenkCakeCount = 0; //処理対象のケーキの個数
		int totalPrice = 0; //合計金額
		int payment = 0; //支払額
		
		//合計金額を表示する
		for (int i = 0; i < args.length; i += 2) { //コマンドライン引数からケーキ名と個数
			
			//処理対象のケーキ名と個数を取得
			checkCakeName = args[i];
			chenkCakeCount = Integer.parseInt(args[i + 1]);
			
			//合計金額の計算
			//ケーキ名ごとに小計を算出して合計金額に足し込む
			switch (checkCakeName) {
			
			//ケーキ名が「ショートケーキ」の場合
			case CAKE_NAME_SHT:
				totalPrice += CAKE_PRICE_SHT * chenkCakeCount;
				break;
			//ケーキ名が「モンブラン」の場合
			case CAKE_NAME_MNB:
				totalPrice += CAKE_PRICE_MNB * chenkCakeCount;
				break;
				//ケーキ名が「チョコレートケーキ」の場合
			case CAKE_NAME_CHO:
				totalPrice += CAKE_PRICE_CHO * chenkCakeCount;
				break;
				//ケーキ名が「いちごのタルト」の場合
			case CAKE_NAME_ICH:
				totalPrice += CAKE_PRICE_ICH * chenkCakeCount;
				break;
				//ケーキ名が「チーズケーキ」の場合
			case CAKE_NAME_CHZ:
				totalPrice += CAKE_PRICE_CHZ * chenkCakeCount;
				break;
			}
		}
		
		//支払額を計算する
		if (totalPrice > DISCOUNT_APPLYING_PRICE) { //合計金額が割引対象である場合
			//割引率を加味した税込額を計算して支払額とする
			payment = (int)(totalPrice * DISCOUNT_LATE * TAX); //整数型でキャストする
		} else { //合計金額が割引対象でない場合
			//税込額を計算して支払額とする
			payment = (int)(totalPrice * TAX); //整数型でキャストする
		}
		
		System.out.println("合計金額は" + payment + "円です。");
	}

}
