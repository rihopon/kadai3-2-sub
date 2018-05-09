package snakecamel;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

class SnakeCamelTest extends SnakeCamelUtil {

	@Test
	void スネークケースをキャメルケースに変換するメソッド(){
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AppleCake";
		String actual = scu.snakeToCamelcase("apple_cake");
		assertThat(actual,is(expected));
	}
	
	@Test
	void キャメルケースをスネークケースに変換するメソッド() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "apple_cake";
		String actual = scu.camelToSnakecase("AppleCake");
		assertThat(actual,is(expected));
	}
	
	@Test
	void 大文字にするメソッド() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Apple";
		String actual = scu.capitalize("apple");
		assertThat(actual,is(expected));
	}
	
	@Test
	void 小文字にするメソッド() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "apple";
		String actual = scu.uncapitalize("Apple");
		assertThat(actual,is(expected));
	}
	

}
