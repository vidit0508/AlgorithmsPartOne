package cousera.project.learning;

public class KaratsubaMultiplication {

	// function to multiply two long numbers -- start

	public long karatsubaMultiply(long numOne, long numTwo) {

		// get number of digits in each number
		int sizeOne = getLength(numOne);
		int sizeTwo = getLength(numTwo);

		// get max length from two number
		int maxlength = Math.max(sizeOne, sizeTwo);

		// for small values multiply directly
		if (maxlength < 10)
			return numOne * numTwo;

		// divide max length by 2, and round off
		maxlength = (maxlength / 2) + (maxlength % 2);

		// get multiplier
		long multiplier = (long) Math.pow(10, maxlength);

		// now solve sub expressions
		long b = numOne / multiplier; // 2406, 1, 0, 0
		long a = numOne - (b * multiplier); // 1994, 994, 994, 994
		long d = numTwo / multiplier; // 2, 28, 28, 28
		long c = numTwo - (d * maxlength); // 28555, 28471, 28387, 28303

		// do recursive calls
		long one = karatsubaMultiply(a, c); // (1994, 28555), (994, 28471), (994, 28387), (994, 28303)
		long two = karatsubaMultiply(a + b, c + d);
		long three = karatsubaMultiply(b, d);

		return one + ((two - one - three) * multiplier) + (three * (long) (Math.pow(10, 2 * maxlength)));
	}

	// function to multiply two long numbers -- end

	// function to calculate no.of digits in number -- start

	public int getLength(long num) {

		int counter = 0;

		while (num != 0) {
			num /= 10;
			counter++;
		}

		return counter;
	}

	// function to calculate no.of digits in number -- start

	public static void main(String[] args) {

		KaratsubaMultiplication karatsuba = new KaratsubaMultiplication();
		System.out.println(karatsuba.karatsubaMultiply(22240619L, 24061994));

	}

}
