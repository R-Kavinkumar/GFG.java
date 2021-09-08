/* It is used to achieve total abstraction. Since java does not support multiple inheritance in case of class,
 but by using interface it can achieve multiple inheritance .
 It is also used to achieve loose coupling. Interfaces are used to implement abstraction.*/
package com.company;
    interface kkr {
        void kkr();
    }
    class kavin implements kkr {

        public void kkr(){
            System.out.println("IAM FROM KAVIN CLASS");
        }
    }
    class nishanth implements kkr{
        public void kkr(){
            System.out.println("IAM FROM NISHANTH CLASS");
        }
    }
class interface_demo {
        public static void main(String[] args){
            kavin a=new kavin();
            a.kkr();
            nishanth b =new nishanth();
            b.kkr();
        }
}