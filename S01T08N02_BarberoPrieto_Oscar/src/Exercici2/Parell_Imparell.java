package Exercici2;

import java.util.*;
import java.util.stream.Collectors;

public class Parell_Imparell {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(22, 21, 12, 56, 45, 76, 15, 39);

		String result = convertirLlistaParImpar(nums);

		System.out.println(result);

	}

	public static String convertirLlistaParImpar(List<Integer> nums) {

		return nums.stream().map(n -> (n % 2 == 0 ? "e" : "o")+n).collect(Collectors.joining(","));
	}

}