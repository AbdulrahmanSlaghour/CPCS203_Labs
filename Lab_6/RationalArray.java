public class RationalArray  {
    public static void main(String[] args) throws Exception {
        RationalNumber list1[] = {new RationalNumber(3, 4), new RationalNumber(1, 3), new RationalNumber(1, 2)};
        RationalNumber list2[] = {new RationalNumber(2, 5), new RationalNumber(1, 4), new RationalNumber(3, 5)};

        RationalNumber list3[] = new RationalNumber[3]; //array is initialized empty because the result will be calculated in the same display loop below
        RationalNumber list4[] = new RationalNumber[3]; //array is initialized empty because the result will be calculated in the same display loop below


        System.out.printf("%-10s %-10s %-10s %-10s\n", "LIST1", "LIST2", "ADD", "MULTIPLY");
        for (int i = 0; i < 3; i++) {
            list3[i] = list1[i].add(list2[i]);
            list4[i] = list1[i].multiply(list2[i]);
            System.out.printf("%-10s %-10s %-10s %-10s\n", list1[i].toString(), list2[i].toString(), list3[i].toString(), list4[i].toString());
        }
    }
}
