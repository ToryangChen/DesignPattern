package com.builder.example;

import java.util.ArrayList;

/**
 * Created by toryang on 7/12/16.
 */
public abstract class CarModel {

    private ArrayList<String> sequence = new ArrayList<String>();

    protected abstract void start();

    protected abstract void alarm();

    protected abstract void engineBoom();

    protected abstract void stop();

    final public void run(){
        for (int i=0;i<sequence.size();i++){
            String actionName = this.sequence.get(i);

            if (actionName.equalsIgnoreCase("start")){
                this.start();
            }else if (actionName.equalsIgnoreCase("stop")){
                this.stop();
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm();
            }else if (actionName.equalsIgnoreCase("engine boom")){
                this.engineBoom();
            }
        }
    }

    public void setSequence(ArrayList<String> sequence){
        this.sequence = sequence;
    }
}
