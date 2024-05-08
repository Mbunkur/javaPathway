public class HugeInteger {
    private int[] digits;

    public HugeInteger() {
        digits = new int[40];
    }

    public static HugeInteger parse(String number) {
        HugeInteger hugeInteger = new HugeInteger();
        for (int i = 0; i < number.length(); i++) {
            char digitChar = number.charAt(i);
            if (Character.isDigit(digitChar)) {
                hugeInteger.digits[i] = Character.getNumericValue(digitChar);
            } else {
                throw new IllegalArgumentException("Invalid character in number: " + digitChar);
            }
        }
        return hugeInteger;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean leadingZeros = true;
        for (int digit : digits) {
            if (digit != 0) {
                leadingZeros = false;
            }
            if (!leadingZeros) {
                sb.append(digit);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public HugeInteger add(HugeInteger other) {
        HugeInteger result = new HugeInteger();
        int carry = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + other.digits[i] + carry;
            result.digits[i] = sum % 10;
            carry = sum / 10;
        }
        return result;
    }

    public HugeInteger subtract(HugeInteger other) {
        HugeInteger result = new HugeInteger();
        int borrow = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            int diff = digits[i] - other.digits[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result.digits[i] = diff;
        }
        return result;
    }

    public boolean isEqualTo(HugeInteger other) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] != other.digits[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean isNotEqualTo(HugeInteger other) {
        return !isEqualTo(other);
    }

    public boolean isGreaterThan(HugeInteger other) {
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > other.digits[i]) {
                return true;
            } else if (digits[i] < other.digits[i]) {
                return false;
            }
        }
        return false;
    }

    public boolean isLessThan(HugeInteger other) {
        return !isGreaterThan(other) && !isEqualTo(other);
    }

    public boolean isGreaterThanOrEqualTo(HugeInteger other) {
        return !isLessThan(other);
    }

    public boolean isLessThanOrEqualTo(HugeInteger other) {
        return !isGreaterThan(other);
    }

    public boolean isZero() {
        for (int digit : digits) {
            if (digit != 0) {
                return false;
            }
        }
        return true;
    }
}
