package wrapperclass;

public class Main {
public static void main(String[] args){
String str="01111111";
int radix=2;
Integer intObj=Integer.valueOf(str, radix);//crates an Integer object from string
int intValue=Integer.parseInt(str, radix);//Extract the int value from string
System.out.println("str ="+str);
System.out.println("intObject= "+intObj);
System.out.println("intValue= "+intValue);

}
}