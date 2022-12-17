package furnetureShop;

public abstract class Furniture {
    protected boolean isClean, isColored;
    protected int width, height;

    protected String color;

    abstract public void clean();
    abstract public void paint(String color);

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsClean() {
        return isClean;
    }

    public void setIsClean(boolean clean) {
        isClean = clean;
    }

    public boolean getIsColored() {
        return isColored;
    }

    public void setIsColored(boolean colored) {
        isColored = colored;
    }

    @Override
    public String toString() {
        return "Width = " + width + " Height = " + height + '\n'
                + "Color: " + color + " Status: " + (isClean ? "cleaned" : "dirty") + '\n'
                + "Colored status: " + (isColored ? "colored" : "original color");
    }
}