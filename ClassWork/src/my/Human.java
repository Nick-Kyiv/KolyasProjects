package my;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

public class Human {
    private static NumberFormat numberFormat = new DecimalFormat(".00");
    public boolean student;
    public String name;
    public String secondName;
    public byte[] marks;

    public void changeMinAndMax() {
        int iMax = 0, iMin = 0;
        for (int j = 1; j < marks.length; j++) {
            if (marks[iMax] < marks[j]) {
                iMax = j;
            }
            if (marks[iMin] > marks[j]) {
                iMin = j;
            }
        }
        byte tmp = marks[iMax];
        marks[iMax] = marks[iMin];
        marks[iMin] = tmp;
    }

    public float getMainArithmetical() {
        int sum = 0;
        for (byte mark : marks) {
            sum += mark;
        }
        return (float) sum / marks.length;
    }

    @Override
    public String toString() {
        return "Human{" +
                "\n\tstudent=" + student +
                "\n\tname='" + name + '\'' +
                "\n\tsecondName='" + secondName + '\'' +
                "\n\tmarks=" + Arrays.toString(marks) +
                "\n\tmain arithmetical=" + numberFormat.format(getMainArithmetical()) +
                "\n}";
    }
}
