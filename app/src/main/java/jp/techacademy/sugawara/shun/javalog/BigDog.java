package jp.techacademy.sugawara.shun.javalog;

import android.util.Log;

//継承クラスの練習


class BigDog extends Dog {
    static String to_jp = "大型犬";

    public BigDog(String name, int age){
        super(name,age);
    }
    public void introduce(){
        Log.d("javatest","これは大型犬クラスです。");
    }
}
