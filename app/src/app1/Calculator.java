package app1;

public class Calculator {
	int age =22;
    public static void main(String[] args) {
    	Calculator c =new Calculator();
    	System.out.println(c.add(100, 1000));
    	c.add(70, 900);
    	c.sub(50, 10);
    	c.mul(3,9);
    	c.div(100,10);
    }
    public int add(int i,int j)
    {
    	int k=i+j;
    	 return k;
    }
    
    protected int sub(int i,int j)
    {
    	int k=i-j;
    	return k;
    }
    int mul(int i,int j)
    {
    	int k=i*j;
    		return k;
    }
    private int div(int i,int j)	 
    {
    	int k=i/j;
        return k;
    }

}
