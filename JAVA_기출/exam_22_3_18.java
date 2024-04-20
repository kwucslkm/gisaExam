class exam_22_3_18 {
    public static void main(String[] args) {
        int[] inData = makeAry();
        for (int i = 0; i < inData.length; i++)
            System.out.println(inData[i]);
    }

    static int[] makeAry() {
        int[] tmp = new int[4];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = i;
        }
        return tmp;
    }
}