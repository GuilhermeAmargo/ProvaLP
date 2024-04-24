public class Main {
    static int max = 10;
    static int [] stack = new int [max];

    static int top =-1;
    public static void main (String[] args) {
    for (int i = 1; i < 16;i++)
        push(i);
    for (int i = 1; i < 16;i++)
        System.out.println(pop());
    }
    static void push (int element){
        if(top == stack.length-1){
            System.out.println("Pilha cheia");
        } else {
            top++;
            stack[top] = element;
        }
    }

    static int pop(){
      if(isEmpty()){
          System.out.println("Pilha vazia");
          return -1;
      }  else {
          int myReturn = stack[top];
          top --;
          return myReturn;
          //return stack[top--];
      }
    }

    static boolean isEmpty(){
        if(top==-1)
            return true;
        return false;
        //return (top==-1);
    }
}
