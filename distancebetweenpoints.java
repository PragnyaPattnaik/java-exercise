import java.util.Scanner;

public class distancebetweenpoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the latitude of the 1st point: ");
        double lat1 = input.nextDouble();

        System.out.println("Enter the longitude of the 1st point: ");
        double lon1 = input.nextDouble();

        System.out.println("Enter the latitude of the 2nd point: ");
        double lat2 = input.nextDouble();

        System.out.println("Enter the longitude of the 2nd point: ");
        double lon2 = input.nextDouble();

        System.out.println("The distance between those points is: " + 
            distance_between_latlon(lat1, lon1, lat2, lon2) + " km\n");
    }

    public static double distance_between_latlon(double lat1, double lon1, double lat2, double lon2) {
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double earthRadius = 6371.01; // Radius of the Earth in kilometers
        return earthRadius * Math.acos(
            Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2)
        );
    }
}
