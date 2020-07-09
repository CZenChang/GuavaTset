package stringStudy;

import com.google.common.base.Splitter;

import java.util.Iterator;

public class SpliterOfString {


    public void split_on () {
        Iterable a=  Splitter.on(',')
                    .trimResults()//結果字串去空白
                    .omitEmptyStrings()//結果字串忽略空白字串""
                    .limit(4)//限制拆分數量
                    .split("foo,bar,,   qux, ");//split(CharSequence sequence)

        //直接接ForEach
//        Splitter.on(',')
//                .split("foo,bar,,   qux, ")
//                .forEach( (str) -> System.out.println(str) );

        a.forEach((str) -> System.out.println(str));

    }



    public void split_onPattern(){
        Splitter.onPattern("\\W{1}")
                .omitEmptyStrings()
                .trimResults()
                .splitToList("foo,bar,,   qux, ")
                .forEach((str) -> System.out.println(str));

    }



    public  void  fixlength(){

        Splitter.fixedLength(3)//固定長度切分
                .split("foo,bar,,    qux, ")
                .forEach((str)->System.out.println(str));
    }







    public static void main(String[] args) {

        SpliterOfString s=new SpliterOfString();

        s.split_on();

        s.split_onPattern();

        s.fixlength();
    }
}
