# ArrayList
[ArrayList (Java Platform SE 8 )](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)

### UglyNumbers.java 
Dado un arreglo de números enteros positivos, la tarea es ordenar solo aquellos elementos que son números "feos" en sus posiciones relativas en el arreglo (las posiciones de otros elementos no deben verse afectadas). Entiéndase como números "feos", aquellos cuyos únicos factores primos son 2, 3 o 5, por convención el número 1 es considerado número "feo". 

*Input*: arr[] = {13, 9, 11, 3, 2} <br/>
*Output*: 13 2 11 3 9 <br/>
9, 3 y 2 son los únicos números "feos" en el arreglo <br/>
<br/>
*Input*: arr[] = {1, 2, 3, 7, 12, 10} <br/>
*Output*: 1 2 3 7 10 12 <br/>

```bash
java UglyNumbers.java 
javac UglyNumbers
```

### PermutationsString.java
Dada una cadena  imprimir todas las permutaciones distintas.
Una permutación es un arreglo de todo o parte de un conjunto de objetos, con respecto al orden del arreglo.
Por ejemplo, las palabras ‘bat’ y ‘tab’ representan dos permutación distintas de una palabra similar de tres letras.

*Input*: str = “abbb” <br/>
*Output*: [abbb, babb, bbab, bbba] <br/>
<br/>
*Input*: str = “abc” <br/>
*Output*: [abc, bac, bca, acb, cab, cba] <br/>

```bash
java PermutationsString.java 
javac PermutationsString
```

### PhoneDigitsWords.java
Dado el teclado de un móvil y las teclas que deben presionarse, imprimir todas las palabras que se pueden generar presionando estos números.
1-> ABC <br/>
2-> DEF <br/>
3-> GHI <br/>
4-> JKL <br/>
5-> MNO <br/>
6-> PQR <br/>
7-> STU <br/>
8-> VWX <br/>
9-> YZ <br/>

*Input*: str = "12"  <br/>
*Output*: [ad, bd, cd, ae, be, ce, af, bf, cf] <br/>
La cadena que se pueden formar presionando 1 es a, b, c y presionando 2 caracteres d, e, f pueden formarse.
Entonces todas las palabras serán una combinación donde primero
el carácter pertenece a a, b, c y el segundo carácter pertenece a d, e, f
<br/>
*Input*: str = "4" <br/>
*Output*: [j, k, l] <br/>

```bash
java PhoneDigitsWords.java 
javac PhoneDigitsWords
```

### SubsequencesString.java
Dada una cadena, imprimir todas sus subsecuencias.
Una subsecuencia es una secuencia que puede derivarse de otra secuencia eliminando algunos o ningún elemento sin cambiar el orden de los elementos restantes.

*Input*: str = “abc”  <br/>
*Output*: a b ab c ac bc abc <br/>
<br/>
*Input*: str = “geek” <br/>
*Output*: g e ge e ge ee gee k gk ek gek ek gek eek geek <br/>

```bash
java SubsequencesString.java 
javac SubsequencesString
```