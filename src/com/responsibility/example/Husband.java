package com.responsibility.example;

/**
 * Created by toryang on 7/14/16.
 */
public class Husband extends Handler {

    public Husband() {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWomen women) {
        System.out.println("-----妻子的向丈夫请示-----");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是: 同意");
    }
}