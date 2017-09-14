/*A binary watch has 4 LEDs(8,4,2,1) on the top which represent the hours (0-11), and the 6 LEDs(32,16,8,4,2,1) on the bottom represent the minutes (0-59).

Each LED represents a zero or one, with the least significant bit on the right.

Time is read as sum of led numbers glowing on top (hours): sum of led numbers glowing on bottom(minutes).

Given the number of led's glowing, return all the possible times.
 */

public List<String> readBinaryWatch(int num) {
	ArrayList<String> result = new ArrayList<>();
	for (int i = 0; i < 12; i++) {
		for (int j = 0; j < 60; j++) {
			if (Integer.bitCount(i) + Integer.bitCount(j) == num) {  //the number of leds glowing should = number of 1 bits in the hours+minutes since its a binary clock
				result.add(String.format("%d:%02d", i, j)); //2d is just a formatting saying 2 integers will be here after ':'
			}
		}
	}
	return result;
}