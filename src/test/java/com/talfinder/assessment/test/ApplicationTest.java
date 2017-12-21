package com.talfinder.assessment.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.talfinder.assessment.Paragraph;

public class ApplicationTest {

	@Test
	public void testParagraph() {
		StringBuilder input = new StringBuilder();
		input.append("glob is I\n");
		input.append("prok is V\n");
		input.append("glob glob Silver is 34 Credits\n");
		input.append("glob prok Gold is 57800 Credits\n");
		input.append("how many Credits is Silver Gold ?\n");

		List<String> expectedList = new ArrayList<String>();
		expectedList.add("Silver Gold is 245650 Credits");

		Paragraph paragraph = new Paragraph();
		try {
			List<String> actualList = paragraph.read(input);
			assertEquals(expectedList, actualList);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testParagraph2() {
		StringBuilder input = new StringBuilder();
		input.append("glob is I\n");
		input.append("prok is V\n");
		input.append("pish is X\n");
		input.append("tegj is L\n");
		input.append("glob glob Silver is 34 Credits\n");
		input.append("glob prok Gold is 57800 Credits\n");
		input.append("pish pish Iron is 3910 Credits\n");
		input.append("how much is pish tegj glob glob ?\n");
		input.append("how many Credits is glob prok Silver ?\n");
		input.append("how many Credits is glob prok Gold ?\n");
		input.append("how many Credits is glob prok Iron ?\n");
		input.append("how much wood could a woodchuck chuck if a woodchuck could chuck wood ?\n");

		List<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("pish tegj glob glob is 42");
		expectedOutput.add("glob prok Silver is 68 Credits");
		expectedOutput.add("glob prok Gold is 57800 Credits");
		expectedOutput.add("glob prok Iron is 782 Credits");
		expectedOutput.add("I have no idea what you are talking about");

		Paragraph paragraph = new Paragraph();
		try {
			List<String> actualOutput = paragraph.read(input);
			assertEquals(expectedOutput, actualOutput);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testParagraph3() {
		StringBuilder input = new StringBuilder();
		input.append("glob is I\n");
		input.append("prok is V\n");
		input.append("pish is X\n");
		input.append("how much is pish prok glob ?\n");
		input.append("tegj is L\n");
		input.append("how much is pish tegj glob glob ?\n");
		input.append("glob glob Silver is 34 Credits\n");
		input.append("glob prok Gold is 57800 Credits\n");
		input.append("how many Credits is glob prok Gold ?\n");

		List<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("pish prok glob is 16");
		expectedOutput.add("pish tegj glob glob is 42");
		expectedOutput.add("glob prok Gold is 57800 Credits");

		Paragraph paragraph = new Paragraph();
		try {
			List<String> actualOutput = paragraph.read(input);
			assertEquals(expectedOutput, actualOutput);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testParagraph4() {
		StringBuilder input = new StringBuilder();
		input.append("prok is I\n");
		input.append("how much is glob ?\n");
		input.append("how much is prok ?\n");
		input.append("glob is V\n");
		input.append("how much is glob ?\n");

		List<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("I have no idea what you are talking about");
		expectedOutput.add("prok is 1");
		expectedOutput.add("glob is 5");

		Paragraph paragraph = new Paragraph();
		try {
			List<String> actualOutput = paragraph.read(input);
			assertEquals(expectedOutput, actualOutput);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testParagraph5() {
		StringBuilder input = new StringBuilder();
		input.append("prok is I\n");
		input.append("glob is V\n");
		input.append("pish is X\n");
		input.append("how much is prok glob pish ?\n");
		input.append("how much is pish glob prok ?\n");
		input.append("how much is ?\n");

		List<String> expectedOutput = new ArrayList<String>();
		expectedOutput.add("prok glob pish is wrong Roman number, voilated roman number format");
		expectedOutput.add("pish glob prok is 16");
		expectedOutput.add("I have no idea what you are talking about");

		Paragraph paragraph = new Paragraph();
		try {
			List<String> actualOutput = paragraph.read(input);
			assertEquals(expectedOutput, actualOutput);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
