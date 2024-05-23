import static org.junit.Assert.*;
import org.junit.Test;
import java.io.File;
import java.util.*;
import java.io.FileNotFoundException;

public class TestFunction {

    public static int[] fileReader() throws FileNotFoundException {
        Scanner file = new Scanner(new File("testik.txt"));
        String line = file.nextLine();
        String[] sps2 = line.split(" ");
        int[] sps = new int[sps2.length];
        for (int i = 0; i < sps2.length; i++){
            sps[i] = Integer.parseInt(sps2[i]);
        }
        return sps;
    }

    public static int[] fileReader1() throws FileNotFoundException {
        Scanner file = new Scanner(new File("speedtest1.txt"));
        String line = file.nextLine();
        String[] sps2 = line.split(" ");
        int[] sps = new int[sps2.length];
        for (int i = 0; i < sps2.length; i++){
            sps[i] = Integer.parseInt(sps2[i]);
        }
        return sps;
    }

    public static int[] fileReader2() throws FileNotFoundException {
        Scanner file = new Scanner(new File("speedtest2.txt"));
        String line = file.nextLine();
        String[] sps2 = line.split(" ");
        int[] sps = new int[sps2.length];
        for (int i = 0; i < sps2.length; i++){
            sps[i] = Integer.parseInt(sps2[i]);
        }
        return sps;
    }

    public static int[] fileReader3() throws FileNotFoundException {
        Scanner file = new Scanner(new File("speedtest3.txt"));
        String line = file.nextLine();
        String[] sps2 = line.split(" ");
        int[] sps = new int[sps2.length];
        for (int i = 0; i < sps2.length; i++){
            sps[i] = Integer.parseInt(sps2[i]);
        }
        return sps;
    }

    public static int[] fileReader4() throws FileNotFoundException {
        Scanner file = new Scanner(new File("speedtest4.txt"));
        String line = file.nextLine();
        String[] sps2 = line.split(" ");
        int[] sps = new int[sps2.length];
        for (int i = 0; i < sps2.length; i++){
            sps[i] = Integer.parseInt(sps2[i]);
        }
        return sps;
    }

    public static int[] fileReader5() throws FileNotFoundException {
        Scanner file = new Scanner(new File("speedtest5.txt"));
        String line = file.nextLine();
        String[] sps2 = line.split(" ");
        int[] sps = new int[sps2.length];
        for (int i = 0; i < sps2.length; i++){
            sps[i] = Integer.parseInt(sps2[i]);
        }
        return sps;
    }

    public static int[] fileReader6() throws FileNotFoundException {
        Scanner file = new Scanner(new File("speedtest6.txt"));
        String line = file.nextLine();
        String[] sps2 = line.split(" ");
        int[] sps = new int[sps2.length];
        for (int i = 0; i < sps2.length; i++){
            sps[i] = Integer.parseInt(sps2[i]);
        }
        return sps;
    }

    @Test
    public void testMin()  {
        int[] arr;
        try {
            arr = fileReader();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        assertEquals(1, Main._min(arr));
    }

    @Test
    public void testMax()  {
        int[] arr;
        try {
            arr = fileReader();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        assertEquals(5, Main._max(arr));
    }

    @Test
    public void testSum()  {
        int[] arr;
        try {
            arr = fileReader();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        assertEquals(15, Main._sum(arr));
    }

    @Test
    public void testMul()  {
        int[] arr;
        try {
            arr = fileReader();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        assertEquals(120, Main._mult(arr));
    }

    @Test
    public void testspeed1Min()  {
        int[] arr;
        try {
            arr = fileReader1();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._min(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed2Min()  {
        int[] arr;
        try {
            arr = fileReader2();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._min(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed3Min()  {
        int[] arr;
        try {
            arr = fileReader3();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._min(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed4Min()  {
        int[] arr;
        try {
            arr = fileReader4();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._min(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed5Min()  {
        int[] arr;
        try {
            arr = fileReader5();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._min(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed6Min()  {
        int[] arr;
        try {
            arr = fileReader6();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._min(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed1Max()  {
        int[] arr;
        try {
            arr = fileReader1();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._max(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed2Max()  {
        int[] arr;
        try {
            arr = fileReader2();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._max(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed3Max()  {
        int[] arr;
        try {
            arr = fileReader3();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._max(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed4Max()  {
        int[] arr;
        try {
            arr = fileReader4();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._max(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed5Max()  {
        int[] arr;
        try {
            arr = fileReader5();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._max(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed6Max()  {
        int[] arr;
        try {
            arr = fileReader6();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._max(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed1Sum()  {
        int[] arr;
        try {
            arr = fileReader1();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._sum(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed2Sum()  {
        int[] arr;
        try {
            arr = fileReader2();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._sum(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed3Sum()  {
        int[] arr;
        try {
            arr = fileReader3();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._sum(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed4Sum()  {
        int[] arr;
        try {
            arr = fileReader4();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._sum(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed5Sum()  {
        int[] arr;
        try {
            arr = fileReader5();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._sum(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed6Sum()  {
        int[] arr;
        try {
            arr = fileReader6();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._sum(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed1Mult()  {
        int[] arr;
        try {
            arr = fileReader1();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._mult(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed2Mult()  {
        int[] arr;
        try {
            arr = fileReader2();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._mult(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed3Mult()  {
        int[] arr;
        try {
            arr = fileReader3();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._mult(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed4Mult()  {
        int[] arr;
        try {
            arr = fileReader4();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._mult(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed5Mult()  {
        int[] arr;
        try {
            arr = fileReader5();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._mult(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

    @Test
    public void testspeed6Mult()  {
        int[] arr;
        try {
            arr = fileReader6();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int start = (int) System.nanoTime();

        for (int i = 0; i < 100; i++){
            Main._mult(arr);
        }

        System.out.print(((int) System.nanoTime() - start)/100);
    }

}
