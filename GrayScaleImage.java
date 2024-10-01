import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class GrayScaleImage extends JPanel {

    private BufferedImage image;

    public GrayScaleImage() {
        try {
            image = ImageIO.read(new File("git.png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        // Grayscale conversion
        ColorConvertOp op = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null);
        BufferedImage grayImage = op.filter(image, null);
        // Draw the original and grayscale images side by side
        g2d.drawImage(image, 0, 0, null);
        g2d.drawImage(grayImage, image.getWidth(), 0, null);
        g2d.dispose();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GrayScale Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GrayScaleImage grayScaleImage = new GrayScaleImage();
        frame.add(grayScaleImage);
        frame.pack();
        frame.setVisible(true);
    }
}
