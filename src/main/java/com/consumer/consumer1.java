package com.consumer;

import java.util.function.Consumer;

   class Demo implements Consumer<Integer> {
    @Override
    public void accept(Integer t) {
        System.out.println(t);

    }

       public static void main(String[] args) {
           Demo d =new Demo();
           d.accept(4);
       }

}

