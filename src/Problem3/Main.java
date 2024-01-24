package Problem3;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[] {
                new UpwardHat(),
                new UpwardHat(),
                new DownwardHat(),
                new FaceMaker(),
                new Vertical()
        };
        for (Figure figure : figures) {
            figure.getFigure();
        }

        System.out.println();
        for (Figure figure : figures) {
            figure.getFigure();
            System.out.println(" : " + figure.getClass().getSimpleName()  );

        }
    }
}
