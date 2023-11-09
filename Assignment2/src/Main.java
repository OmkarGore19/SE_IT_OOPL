public class Main
{
    public static void main (String[]args)
    {
        Publication[] array =
                {
                        new Book ("Programming with Java  A Primer", "E. Balagurusamy", 600, 10),
                        new Magazine ("Karmanya", 150, 69, "September 2022","December 2022"),
                        new Book ("The scam",  "Sucheta Dalal", 500, 10)
                };


        for (int i = 0; i < array.length; i++)
        {

            array[i].saleCopy ();
            System.out.println ();
        }
    }
}