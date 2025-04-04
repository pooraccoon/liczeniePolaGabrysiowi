public class Main extends nieWiemOCoChodzi {
    public static void main(String[] args) {

        System.out.println("Płyty prostokątne:");

// Płyta nr 1 – 1000x2000 mm – obrzeża: lewa, prawa, góra (bez dolnej krawędzi)
        System.out.println(poleProstopadloscianu(100, 200, 1.8) - 200 * 1.8); // bez dolnej krawędzi

// Płyta nr 2 – identyczna jak nr 1
        System.out.println(poleProstopadloscianu(100, 200, 1.8) - 200 * 1.8); // bez dolnej krawędzi

// Płyta nr 3 – 800x1034 mm – wszystkie obrzeża
        System.out.println(poleProstopadloscianu(80, 103.4, 1.8)); // wszystkie krawędzie

// Płyta nr 4 – 800x1182 mm – wszystkie obrzeża
        System.out.println(poleProstopadloscianu(80, 118.2, 1.8)); // wszystkie krawędzie

// Płyta nr 5 – 615x1964 mm – tylko jeden dłuższy bok ma obrzeże
        System.out.println(poleProstopadloscianu(61.5, 196.4, 1.8) - 2 * 61.5 * 1.8 - 196.4 * 1.8); // tylko 1x bok długi


        System.out.println("Płyty trójkątne:");
        System.out.println(poleGraniastoslupaTrojkat(34.2, 98.2)); //brak obrzeży/ścian bocznych (tylko 2*podstawa)

        System.out.println("Płyty pięciokątne:");
        System.out.println(poleGraniastoslupaPieciokat(96.8, 200, 1.8, 36, 10) - 200 * 1.8); //
    }
}



