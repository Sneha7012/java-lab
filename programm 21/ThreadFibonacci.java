class FibonacciRunnable implements Runnable{
int n;
FibonacciRunnable(int n){
this.n=n;
}
public void run(){
int a=0,b=1;
System.out.println("First "+n+" Fibonacci numbers:");
for(int i=0;i<n;i++){
System.out.print(a+" ");
int next=a+b;
a=b;
b=next;
}
System.out.println();
}}

class EvenNumbersRunnable implements Runnable{
int start,end;
EvenNumbersRunnable(int start,int end){
this.start=start;
this.end=end;
}
public void run(){
System.out.println("/n");
System.out.println("Even numbers from "+start+" to "+end+":");
for(int i=start;i<=end;i++){
if(i%2==0){
System.out.print(i+" ");
}}
System.out.println();
}}

public class ThreadFibonacci{
public static void main(String[] args){
Thread fibThread=new Thread(new FibonacciRunnable(10));
Thread evenThread=new Thread(new EvenNumbersRunnable(1,20));
fibThread.start();
evenThread.start();
}}
