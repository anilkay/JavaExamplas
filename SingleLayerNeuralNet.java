/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelayernn;

import java.util.ArrayList;

/**
 *
 * @author anilkaynar
 */
public class SingleLayerNeuralNet {

    public SingleLayerNeuralNet(double thresHold,ArrayList  <Double> a,ArrayList  <Double> b,ArrayList  <Double>out) {
       try {
        this.thresHold=thresHold;
        this.inputA=(ArrayList<Double>)a.clone();
        this.inputB=(ArrayList<Double>)b.clone();
        this.EstimatedOutput=(ArrayList<Double>)out.clone();
        weight.add(Double.valueOf(1));
        weight.add(Double.valueOf(1));
        System.out.println("Her sey eklendi.");
       }
       catch(Exception e) {
       System.out.println(e.toString());
       }
    }
    
    ArrayList  <Double>weight=new ArrayList<>();
    ArrayList <Double>inputA;
    ArrayList <Double>inputB;
     ArrayList <Double>EstimatedOutput;
    double thresHold;
    double learningRate=1.5;
    double power=0;
    private void AddtoWeight(double learn,double diff){
    for(int i=0;i<weight.size();i++){
    weight.set(i,(weight.get(i)+learn*diff));
    }
    }
    private double calculatePower(){
        double sum=0;
        double sum2=0;
        try {
        for(int i=0;i<inputA.size();i++){
            sum+=inputA.get(i)*weight.get(0);
        }
        for(int i=0;i<inputB.size();i++){
            sum+=inputB.get(i)*weight.get(1);
        }
        }
        catch(Exception e){
        System.out.println(e.toString());
        }
        return sum+sum2;
    }
    public void iterate(){
        System.out.print("EKlenecek");
        result(0);
        result(1);
        result(2);
        result(3);
    }
    private double result(int which){
    if(thresHold>calculatePower()){
        if(EstimatedOutput.get(which)==1){
             AddtoWeight(learningRate,thresHold-power);
       return result(which);
        }
        else {
            return 0;
                    }
    } 
    else {
        System.out.printf("weight1 %f weight2 %f complete succesfully",weight.get(0),weight.get(1));
        if(EstimatedOutput.get(which)==0){
             AddtoWeight(learningRate,thresHold-power);
         result(which);
        }
    return 1;
    }
    }
}
