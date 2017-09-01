package com.oryam.simple.collection;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CollectionTest {

	private List<String> values;

	@Before
	public void setUp() {
		values = Arrays.asList("one", "two", "three");
	}

	@Test
	public void should_uppercase_collection() {
		final List<String> results = CollectionHelper.toUpperCase(values);

		assertThat(results.get(0)).isEqualTo("ONE");
		assertThat(results.get(1)).isEqualTo("TWO");
		assertThat(results.get(2)).isEqualTo("THREE");
	}

	@Test
	public void should_join_collection() {
		final String result = CollectionHelper.join(values);

		assertThat(result).isEqualTo("one,two,three");
	}

	@Test
	public void should_revers_collection() {
		final List<String> results = CollectionHelper.reverse(values);

		assertThat(results.get(0)).isEqualTo("three");
		assertThat(results.get(1)).isEqualTo("two");
		assertThat(results.get(2)).isEqualTo("one");
	}

}
