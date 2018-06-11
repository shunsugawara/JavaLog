package jp.techacademy.sugawara.shun.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Logを出力させるメソッド
        //Log.d("javatest", "ログへの出力テスト");

        //変数を使ってみる
        /*
        int num = 10;
        Log.d("javatest", String.valueOf(num));
        num = 50;
        Log.d("javatest", String.valueOf(num));
         */
        //演算
        /*
        int num = 10 + 5 - 2 * 4 / 2;
        Log.d("javatest","10+5-2*4/2 = " + String.valueOf(num));
        boolean flag1 = true;
        boolean flag2 = false;
        Log.d("javatest","flag1 && flag2 = " + String.valueOf(flag1&&flag2));
        Log.d("javatest","flag1 && flag2 = " + String.valueOf(flag1||flag2));
        int num2 = 10;
        Log.d("javatest",String.valueOf(num > num2));

        //if
      int num = 60;
        if(num >= 90){
            Log.d("javatest","優");
        }else if(num >= 70){
            Log.d("javatest","良");
        }else if (num>=60){
            Log.d("javatest","可");
        }else{
            Log.d("javatest","優");
        }

        //switch文
        int drink = 1;
        switch(drink){
            case 0:Log.d("javatest","コーヒーを注文しました。"); break;
            case 1:Log.d("javatest","紅茶を注文しました。"); break;
            case 2:Log.d("javatest","ミルクを注文しました。"); break;
            default:Log.d("javatest","注文が誤っています。"); break;
        }
        //for
        for(int i =1; i < 6; i++){
            Log.d("javatest","for文の"+ String.valueOf(i) +"回目");
        }
        //while
        int num = 1;
        while (num < 6){
            Log.d("javatest","while文の"+ String.valueOf(num) +"回目");
            num++;
        }

        //配列
        int[] point = new int[5];
        point[0] = 10;
        point[1] = 6;
        point[2] = 15;
        point[3] = 23;
        point[4] = 17;

        for(int i =0; i < point.length; i++){
            Log.d("javatest", String.valueOf(point[i]));
        }

        //例外
        int num1 = 100;
        int ans = 0;

        try{
            ans = num1 /0;
        }catch(Exception e){
            Log.d("javatest", e.getMessage());
        }
           Log.d("javatest", "ans =" + String.valueOf(ans));

        //関数呼出
        Log.d("javatest",String.valueOf(total(1,10)));

        //他のクラスからインスタンスを生成し、メソッドを利用する(Dog class)
        Dog dog = new Dog("pochi",3);
        dog.say();
        Log.d("javatest","これは、"+Dog.to_jp+"クラスのクラス変数です");
        dog.move();

        //継承クラスの呼出
        BigDog bigDog = new BigDog("tarou",15);
        bigDog.say();
        Log.d("javatest",bigDog.name + "(" + bigDog.age + "歳)"+"「ワン」");
        */

        //課題
        Human man = new Human("taro",25,"スポーツ");
        man.say();
        man.think();



    }

//    //関数
//    private int total(int first, int last){
//        int sum = 0;
//        for(int i = first; i <= last; i++){
//            sum += i;
//        }
//        //Log.d("javatest",String.valueOf(sum));
//        return sum;
//    }
}
