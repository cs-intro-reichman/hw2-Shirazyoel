public class TimeCalc {

    public static void main(String[] args) {
        String Whatisthetime = args[0];
        int MinutesToAdd = Integer.parseInt(args[1]);
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));

        int Totalminutes = (int)((hours * 60) +  (int)minutes + MinutesToAdd);
        int Totalhours = (int)(Totalminutes/60);
        int Newhours = (int)(Totalhours % 24);
        int Newminutes = Totalminutes - (int)(Totalhours * 60);

        if (Newhours < 10) {
            System.out.print( "0");
        }
        System.out.print(Newhours + ":");

        if (Newminutes < 10) {
            System.out.print( "0");
        }
        System.out.println(Newminutes);
    }
}

