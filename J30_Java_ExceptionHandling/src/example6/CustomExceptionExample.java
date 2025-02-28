package example6;

public class CustomExceptionExample {
	static void checkNumber(int number) throws CustomException {
        if (number < 0) {
            throw new CustomException("Negatif sayılar kabul edilmez!");
        } else {
            System.out.println("Sayı: " + number);
        }
    }
public static void main(String[] args) {
    try {
        checkNumber(-5);
    } catch (CustomException e) {
        System.out.println("Özel Hata Yakalandı: " + e.getMessage());
    }
}
}