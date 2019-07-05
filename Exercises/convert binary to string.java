public String toBinary(int n) {
    if (n <= 1 ) {
        return String.valueOf(n);
    }
    return toBinary(n / 2) + String.valueOf(n % 2);
}