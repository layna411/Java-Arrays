class PrintAtoZ {
    public static void printChar(char ch) {
        if (ch > 'Z') return; // Base case: Stop when beyond 'Z'
        
        System.out.print(ch + " "); 
        printChar((char) (ch + 1)); // Recursive call with next character
    }

    public static void main(String[] args) {
        printChar('A'); // Start from 'A'
    }
}