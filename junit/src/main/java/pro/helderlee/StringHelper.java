package pro.helderlee;

public class StringHelper {

	public String truncateAInFirst2Positions(String str) {
		String first2Chars = str.substring(0, 2);
		String stringMinusFirst2Chars = str.substring(2);

		String first2CharsTruncated = first2Chars.replaceAll("A", "");

		return first2CharsTruncated + stringMinusFirst2Chars;
	}

	public boolean areFirstAndLastTwoCharactersTheSame(String str) {

		if (str.length() <= 1) {
			return false;
		}

		if (str.length() == 2) {
			return true;
		}

		String first2Chars = str.substring(0, 2);

		String last2Chars = str.substring(str.length() - 2);

		return first2Chars.equals(last2Chars);
	}

}