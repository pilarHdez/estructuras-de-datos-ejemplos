# Stack
[Stack (Java Platform SE 8 )](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html)

### ReverseString.java
Invertir una cadena utilizando un Stack. 

*Input*: str = "Pilar Hdez" <br/>
*Output*: "zdeH raliP" <br/>

```bash
javac ReverseString.java 
java ReverseString
```

### BalancedParentheses.java
Dada una expresión, examinar si los pares y los órdenes de “{“, “}”, “(“, “)”, “[“, “]” con correctos en la expresión. 

*Input*: exp = “[()]{}{[()()]()}” <br/>
*Output*: true <br/>
<br />
*Input*: str = exp = “[(])” <br/>
*Output*: false <br/>

```bash
javac BalancedParentheses.java 
java BalancedParentheses
```

### StackMax.java
Dada una pila, realizar el seguimiento del valor máximo en ella. El valor máximo puede ser el elemento superior de la pila, pero una vez que se empuja un nuevo elemento o se saca un elemento de la pila, el elemento máximo será ahora del resto de los elementos.

*Input*: 4 19 7 14 20 <br/>
*Output*: Valores máximos en la Pila 4 19 19 19 20 <br/>
<br />
*Input*: 40 19 7 14 20 5 <br/>
*Output*: Valores máximos en la Pila 40 40 40 40 40 4 <br/>

```bash
javac StackMax.java 
java StackMax
```

### SumStacks.java
Dados dos números N1 y N2 representados por dos pilas, de modo que sus dígitos más significativos estén presentes en la parte inferior de la pila, la tarea es calcular y devolver la suma de los dos números en forma de pila.

*Input*: N1={5, 8, 7, 4}, N2={2, 1, 3}  <br/>
*Output*: {6, 0, 8, 7} <br/>
<br />
*Input*: N1={6,4,9,5,7}, N2={213}  <br/>
*Output*: {6, 5, 0, 0, 5} <br/>

```bash
javac SumStacks.java 
java SumStacks
```