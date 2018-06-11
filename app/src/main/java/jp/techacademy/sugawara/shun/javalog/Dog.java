package jp.techacademy.sugawara.shun.javalog;

import android.util.Log;
/*
class Dog {
    static String to_jp ="";
    String name ;
    int age;

    //コンストラクタ
    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }
    //発言メソッド
    public void say(){
        Log.d("javatest",this.name + "(" + this.age + "歳)"+"「ワンワン」");
    }

}
//抽象クラス（animal)を継承する
class Dog extends Animal {
    static String to_jp ="犬";

    //コンストラクタ
    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }
    //紹介
    public void intoroduce(){
        Log.d("javatest","これは、Animalクラスを継承して作成した犬クラスです。");
    }
    //発言メソッド
    @Override
    public void say(){
        Log.d("javatest",this.name + "(" + this.age + "歳)"+"「ワンワン」");
    }
    //抽象クラス（animal)を継承する
*/

//interfaceを使用する
class Dog extends Animal implements Movable {
        static String to_jp ="犬";

        //コンストラクタ
        public Dog(String name,int age){
            this.name = name;
            this.age = age;
        }
        //紹介
        public void intoroduce(){
            Log.d("javatest","これは、Animalクラスを継承して作成した犬クラスです。");
        }
        //発言メソッド
        @Override
        public void say(){
            Log.d("javatest",this.name + "(" + this.age + "歳)"+"「ワンワン」");
        }
        @Override
        public void move(){
            Log.d("javatest", this.name + "(" + this.age + "歳)" + "は全力で走った。");

        }

}
