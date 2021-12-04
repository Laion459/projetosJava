package br.univali.exercicio.aula;

public class Triangle implements Shape {

    private double width;
    private double height;
    private double area;
    private double draw;

    @Override
    public Vector2D getCenter() {
        return null;
    }

    public void width() {
        System.out.println("width: " + width);
    }
    public void height() {
        System.out.println("height: " + height);
    }
    public void area() {
        System.out.println("area: " + area);
    }
    public void draw() {
        System.out.println("draw: " + draw);
    }
}
