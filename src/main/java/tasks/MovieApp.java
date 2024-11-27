import java.util.Scanner;

public class MovieApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Sabit boyutlu array (ilk 3 film için)
        Movie[] movies = new Movie[10]; // Maksimum 10 film alabilecek

        int movieCount = 0; // Şu ana kadar eklenen film sayısı

        while (true) {
            // Menü
            System.out.println("\nMENU:");
            System.out.println("1 - 3 film bilgisi gir");
            System.out.println("2 - Filmleri görüntüle");
            System.out.println("3 - İstediğiniz kadar film bilgisi gir");
            System.out.println("0 - Çıkış yap");
            System.out.print("Seçiminizi yapın: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Boşluğu temizle

            switch (choice) {
                case 1:
                    // 3 film bilgisi gir
                    if (movieCount + 3 <= movies.length) {
                        System.out.println("\n3 film bilgisi giriniz:");
                        for (int i = 0; i < 3; i++) {
                            System.out.print("Film " + (movieCount + 1) + " adı: ");
                            String name = scanner.nextLine();
                            System.out.print("Film " + (movieCount + 1) + " puanı: ");
                            double rating = scanner.nextDouble();
                            scanner.nextLine(); // Boşluğu temizle
                            movies[movieCount] = new Movie(name, rating); // Filmi array'e ekle
                            movieCount++;
                        }
                        System.out.println("3 film bilgisi başarıyla eklendi!");
                    } else {
                        System.out.println("Filmleri eklemek için yeterli alan yok.");
                    }
                    break;

                case 2:
                    // Filmleri görüntüle
                    if (movieCount == 0) {
                        System.out.println("Henüz film bilgisi girilmedi!");
                    } else {
                        System.out.println("\nGirilen Filmler ve Puanları:");
                        for (int i = 0; i < movieCount; i++) {
                            Movie movie = movies[i];
                            System.out.println((i + 1) + ". Film: " + movie.getName() + ", Puan: " + movie.getRating());
                        }
                    }
                    break;

                case 3:
                    // İstediğiniz kadar film bilgisi gir
                    System.out.print("\nKaç film bilgisi eklemek istiyorsunuz? ");
                    int count = scanner.nextInt();
                    scanner.nextLine(); // Boşluğu temizle

                    if (movieCount + count <= movies.length) {
                        System.out.println(count + " film bilgisi giriniz:");
                        for (int i = 0; i < count; i++) {
                            System.out.print("Film " + (movieCount + 1) + " adı: ");
                            String name = scanner.nextLine();
                            System.out.print("Film " + (movieCount + 1) + " puanı: ");
                            double rating = scanner.nextDouble();
                            scanner.nextLine(); // Boşluğu temizle
                            movies[movieCount] = new Movie(name, rating); // Filmi array'e ekle
                            movieCount++;
                        }
                        System.out.println(count + " film bilgisi başarıyla eklendi!");
                    } else {
                        System.out.println("Filmleri eklemek için yeterli alan yok.");
                    }
                    break;

                case 0:
                    // Programdan çık
                    System.out.println("Programdan çıkılıyor...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }
        }
    }
}

// Movie Sınıfı
class Movie {
    private String name;
    private double rating;

    // Constructor
    public Movie(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    // Getter ve Setter'lar
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}

