package snakecamel;

public class Main {
	public void main(String[] args) {
SnakeCamelUtil scu = new SnakeCamelUtil();
String snake_case1 = scu.snakeToCamelcase("abc");
System.out.println("abc"+snake_case1);
String snake_case2 = scu.snakeToCamelcase("abc_def");
System.out.println("abc_def"+snake_case2);
String snake_case3 = scu.snakeToCamelcase("abc_def_gh");
System.out.println("abc_def_gh"+snake_case3);
String snake_case4 = scu.snakeToCamelcase("abc__def___gh");
System.out.println("abc__def___gh"+snake_case4);
String snake_case5 = scu.snakeToCamelcase("_abc_def__");
System.out.println("_abc_def__"+snake_case5);
	}
}
