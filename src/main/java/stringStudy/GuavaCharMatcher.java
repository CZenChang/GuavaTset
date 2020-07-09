package stringStudy;

import com.google.common.base.CharMatcher;

public class GuavaCharMatcher {

    public String matcher1(){
        //只配ascII
        return CharMatcher.ascii().retainFrom("aa  aaaa  aa 中文");

    }
    public String matcher2(){
        //breakingWhitespace 只配空白
        return CharMatcher.breakingWhitespace().retainFrom("aa  aaaa  aa 中文");

    }

    public static void main(String[] args) {
        GuavaCharMatcher m=new GuavaCharMatcher();
        System.out.println(m.matcher1());//中文非ascII,所以不會顯示
        System.out.println(m.matcher2().length());//空白長度
    }

}
