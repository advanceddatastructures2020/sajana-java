class A
{
 protected int data=40;
 protected void msg()
{
System.out.println("Hello java");
}
}
public class simpleprotected
{
public static void main(String args[])
{
A obj=new A();
System.out.println(obj.data);
obj.msg();
}
}
