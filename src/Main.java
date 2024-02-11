import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;
public class Main {




        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


            double lat1; // Широта первой точки
            double lon1; // Долгота первой точки
            double lat2; // Широта второй точки
            double lon2; // Долгота второй точки
            System.out.print("Координата 1 \n");
            lat1 = scanner.nextDouble();
            System.out.print("Координата 2\n");
            lon1 = scanner.nextDouble();
            System.out.print("Координата 1\n");
            lat2 = scanner.nextDouble();
            System.out.print("Координата 2\n");
            lon2 = scanner.nextDouble();




            double distance = calculateDistance(lat1, lon1, lat2, lon2);

            System.out.println("Расстояние между точками: " + distance + " км");
        }

        public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
            int earthRadiusKm = 6371;

            double dLat = Math.toRadians(lat2 - lat1);
            double dLon = Math.toRadians(lon2 - lon1);

            lat1 = Math.toRadians(lat1);
            lat2 = Math.toRadians(lat2);

            double a = Math.sin(dLat/2) * Math.sin(dLat/2) +
                    Math.sin(dLon/2) * Math.sin(dLon/2) * Math.cos(lat1) * Math.cos(lat2);
            double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
            double distance = earthRadiusKm * c;

            return distance;
        }
    }


