package stringStudy;

import com.google.common.base.Joiner;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class JoinOfString {


    /**
     * Joiner : 合併字串使用的class
     */
    public void joiner_On () {

        /**
         *使用on()創立物件, 設定區分符號
         * Joiner.on().skipNulls()
         */


        Joiner joiner=Joiner.on(",")
                .skipNulls();//遇到null不加入

        //不同字串利用.join(),加入
        String skipNull=joiner.join("a",null,"b");

        System.out.println("joiner_On_skipNull : "+skipNull);


        /**
         * Joiner.on().useForNull()
         */
        Joiner joiner2=Joiner.on(",")
                .useForNull("發現null");//遇到null, 替換成指定文字

        String j2_useForNull=joiner2.join("a",null,"b");

        System.out.println("joiner_On_useForNull : "+j2_useForNull);


    }

    void join_overloadTest(){

        Joiner joiner=Joiner.on(",").skipNulls();
        /**
         * join(Obj)
         * 呼叫obj.toString生成字串
         */

        LocalDateTime lt= LocalDateTime.now();
        LocalDateTime lt1 = LocalDateTime.now();
        String a1=joiner.join(lt,lt1);
        System.out.println("join(obj) : "+a1);



        /**
         * join(Iterable parts) ,join(Iterator parts)
         * collection Implemented  Iterable<E>    ex : List
         * 會用遍歷疊代器取出每一項,再 join進去
         * 內部會呼叫iterator.next()
         */
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add(null);
        al.add("b");

        joiner=Joiner.on(",").skipNulls();
        String a2=joiner.join(al);
        System.out.println("join(Iterable parts) : "+a2);




        /**
         * join(obj[])
         * 類似 iterator
         */
        Integer[] array={1,2,3};

        joiner=Joiner.on(",").skipNulls();
        String a3= joiner.join(array);

        System.out.println("join(obj[]) : "+a3);
    }



    public static void main(String[] args) {

        JoinOfString js=new JoinOfString();

        js.joiner_On();

        js.join_overloadTest();

    }
}
