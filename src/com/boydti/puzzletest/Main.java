package com.boydti.puzzletest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
    	
    	// If you are generating files
    	boolean generate = false;
    	
    	if (generate) // Generate random files
    	{
	    	int WIDTH = 4;
	    	int HEIGHT = 3;
	    	int num_files = 1000;
	    	boolean rand = true;
	    	Generator generator = new Generator();
	    	generator.generate(WIDTH, HEIGHT, num_files, rand);
    	}
    	else // Testing
    	{
    		int WIDTH = 3;
    		int HEIGHT = 3;
    		String METHOD = "AS";
    		int num_tests = 10;
    		String classpath = "com.boydti.puzzle.Main";
    		boolean random = false;
    		try {
    			new Tester(classpath, WIDTH, HEIGHT, METHOD, num_tests, random);
    		}
    		catch (Exception e) {
    			e.printStackTrace();
    		}
    		
    	}
    	
    	
    	
    }
}
