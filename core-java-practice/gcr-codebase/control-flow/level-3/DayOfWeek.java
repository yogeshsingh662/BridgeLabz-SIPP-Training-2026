public class DayOfWeek {
    // Sakamoto's algorithm returns 0=Sunday,1=Monday,...
    public static int dayOfWeek(int y, int m, int d) {
        int[] t = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        if (m < 3) y -= 1;
        return (y + y/4 - y/100 + y/400 + t[m-1] + d) % 7;
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            return;
        }
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        if (y < 1582) {
            System.out.println("Year must be >= 1582 for Gregorian calendar.");
            return;
        }
        int dow = dayOfWeek(y, m, d);
        System.out.println(dow); // 0=Sunday,1=Monday,...
    }
}
