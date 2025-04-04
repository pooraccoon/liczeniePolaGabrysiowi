public class nieWiemOCoChodzi {

    public static double poleProstopadloscianu(double dlugosc, double szerokosc, double wysokosc) {
        return 2 * (dlugosc * szerokosc + dlugosc * wysokosc + szerokosc * wysokosc);
    }

    public static double poleGraniastoslupaTrojkat(double bokTrojkata1, double bokTrojkata2) {
        double polePodstawy = 0.5 * bokTrojkata1 * bokTrojkata2;
        return 2 * polePodstawy + (bokTrojkata1 + bokTrojkata2 + Math.hypot(bokTrojkata1, bokTrojkata2));
    }

    public static double poleGraniastoslupaPieciokat(double dlugosc, double szerokosc, double wysokosc, double cutX, double cutY) {
        double polePodstawy = (dlugosc * szerokosc) - (0.5 * cutX * cutY);
        double przekatna = Math.hypot(cutX, cutY);

        double bok1 = dlugosc - cutX;
        double bok2 = szerokosc;
        double bok3 = dlugosc;
        double bok4 = szerokosc - cutY;

        double obwodPodstawy = bok1 + bok2 + bok3 + bok4 + przekatna;
        double poleBoczne = obwodPodstawy * wysokosc;

        return 2 * polePodstawy + poleBoczne;
    }
}
