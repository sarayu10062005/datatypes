public class BasicsDTs {
    public static void main(String[] args) {
        byte Byte = 123;
        short Short = 2410;
        char Letter = '@';
        String Name = "Artha";
        int Integer = 10;
        long Long = 1223456789L;
        float Decimal = 9.8f;
        double Double = 2410d;
        boolean IO = true; 

        System.out.printf("%s of Roll number: %d, is assigned to room number: %d\n", Name, Integer, Byte);
        System.out.printf("Numbers: %d, %d, %f, %f\n", Short, Long, Decimal, Double);
        System.out.printf("%c, %b", Letter, IO);
        
    }
}
