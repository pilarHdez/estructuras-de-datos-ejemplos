# TreeSet
[TreeSet (Java Platform SE 8 )](https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html)

### NaturalOrder.java
Ejemplo orden natural en TreeSet
```bash
javac treeSet/*.java
java treeSet/NaturalOrder
```
### CustomOrder.java
Ejemplo orden personalizado en TreeSet
```bash
javac treeSet/*.java
java treeSet/CustomOrder
```

### ClosestSmaller.java 
Dado un arreglo de números enteros, encontrar el elemento más pequeño más cercano para cada elemento. Si no hay un elemento más pequeño, imprimir -1. 

*Input*: arr[] = {10, 5, 11, 6, 20, 12} 
*Output*: 6, -1, 10, 5, 12, 11
<br/>
*Input*: arr[] = {10, 5, 11, 10, 20, 12}
*Output*: 5 -1 10 5 12 11

```bash
javac ClosestSmaller.java 
java ClosestSmaller
```

### MaxValidTriplet.java 
Dado un arreglo de números enteros. La tarea es encontrar el valor máximo de arr[i] + arr[j] * arr[k] entre cada tripleta (i, j, k) tal que arr[i] < arr[j] < arr[k] y i < j < k. Si no existe ninguna tripleta, imprimir -1.

*Input*: arr[]={7, 9, 3, 8, 11, 10}
*Output*: 106
<br/>
*Input*: arr[]={1, 2, 3}
*Output*: 7

```bash
javac MaxValidTriplet.java 
java MaxValidTriplet
```