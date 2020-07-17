package collections;

import com.google.common.collect.ImmutableSet;

import java.util.Set;

public class Immutable_Collections {


    //創造不可變集合 , 用於多執行續安全


    ImmutableSet<String> set = ImmutableSet.of("a","b");


    public ImmutableSet<String> copySetToImmu(Set<String> set){

        return ImmutableSet.copyOf(set);
    }

    public void asList(){

        set.asList().//ImmutableList
                get(0);//extends List.get()
    }


    public static void main(String[] args) {



    }
}
