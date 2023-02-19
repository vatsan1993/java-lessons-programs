package Chap4.Ex7;

public class Operations{
    public int add(int a, int b){return a+b;	}
    public int sub(int a, int b){
        if(a>b)	return a -b;
        return b-a;
    }
    public int mul(int a, int b){return a*b;}
    public double div(int a, int b){
        if(b==0) return 0;
        else return (double)a/b;
    }
}

