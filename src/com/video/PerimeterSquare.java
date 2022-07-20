package com.video;

public class PerimeterSquare {
    public void getPerimeter(String str) throws PerimeterException {
        Square kv = new Square();

        try {
            int side = Integer.parseInt(str);
            kv.setA(0);
        } catch (NumberFormatException ex) {
            throw new PerimeterException("String is incorrect!", ex);
        } catch (PerimeterException e) {
            System.err.println(e.getMessage());
        }
    }
}
