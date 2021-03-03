package com.mba.katafoobar;

import com.mba.katafoobar.service.FooBarQuixService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

@SpringBootTest
class FooBarQuixServiceTest {

	@Autowired
	FooBarQuixService fooBarQuixService;

	@DisplayName("Test program that convert an input number into a string")
	@ParameterizedTest(name = "{index} ==> Description du test : {0}")
	@MethodSource("list_of_examples")
	void test_convertNumberToString(String descryptionTest,String input,String output) {
		String result = fooBarQuixService.numberToString(input);
		Assertions.assertEquals(result,output);
	}

	static Stream<Arguments> list_of_examples() {
		return Stream.of(
				arguments("1 should return 1", "1", "1"),
				arguments("3 should return FooFoo", "3", "FooFoo"),
				arguments("5 should return BarBar", "5", "BarBar"),
				arguments("7 should return Quix", "7", "Quix"),
				arguments("9 should return Foo", "9", "Foo"),
				arguments("51 should return FooBar", "51", "FooBar"),
				arguments("53 should return BarFoo", "53", "BarFoo"),
				arguments("33 should return FooFooFoo", "33", "FooFooFoo"),
				arguments("27 should return FooQuix", "27", "FooQuix"),
				arguments("15 should return FooBarBar", "15", "FooBarBar"));
	}
}
