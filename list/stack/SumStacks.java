import java.util.Stack;

public class SumStacks{

    public static Stack<Integer> addStack(Stack<Integer> N1,
                                   Stack<Integer> N2)
    {
        Stack<Integer> res = new Stack<Integer>();
        int sum = 0, rem = 0;
        while (!N1.isEmpty() && !N2.isEmpty()) 
        {
            /*
             * Calcular la suma del tope
             */
            sum = (rem + N1.peek() + N2.peek());
            res.add(sum % 10);
            rem = sum / 10;
 
            // Pop al tope de los elementos
            N1.pop();
            N2.pop();
        }
 
        while (!N1.isEmpty()) 
        {
            sum = (rem + N1.peek());
            res.add(sum % 10);
            rem = sum / 10;
            N1.pop();
        }
         
        while (!N2.isEmpty()) 
        {
            sum = (rem + N2.peek());
            res.add(sum % 10);
            rem = sum / 10;
            N2.pop();
        }

        while (rem > 0) 
        {
            res.add(rem);
            rem /= 10;
        }
 
        while (!res.isEmpty()) 
        {
            N1.add(res.peek());
            res.pop();
        }
        res = N1;
        return res;
    }
 
    // Función para imprimir pantalla
    public static void display(Stack<Integer> res)
    {
        int N = res.size();
        String s = "";
        while (!res.isEmpty()) 
        {
            s = String.valueOf(res.peek()) + s;
            res.pop();
        }
 
        System.out.print(s + "\n");
    }
 
    public static void main(String[] args)
    {
        Stack<Integer> N1 = new Stack<Integer>();
        N1.add(5);
        N1.add(8);
        N1.add(7);
        N1.add(4);
          Stack<Integer> N2 = new Stack<Integer>();
        N2.add(2);
        N2.add(1);
        N2.add(3);
          Stack<Integer> res = addStack(N1, N2);
          display(res);
    }
}