package oda;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class FunctionPlot extends JPanel {
   // @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        // Função original sqrt(1 - x)
        g2d.setColor(Color.BLUE);
        g2d.setStroke(new BasicStroke(2));
        for (int x = 0; x < width; x++) {
            double xValue = (double) x / width;
            double yValue = Math.sqrt(1 - xValue);
            int y = height - (int) (yValue * height);
            g2d.draw(new Line2D.Double(x, y, x, y));
        }

        // Aproximação linear em a = 0
        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(2));
        double xValue0_99 = 0.99;
        double yValue0_99 = 1 - 0.5 * xValue0_99 - 0.125 * Math.pow(xValue0_99, 2);
        int y0_99 = height - (int) (yValue0_99 * height);
        g2d.draw(new Line2D.Double(width * xValue0_99, y0_99 - 5, width * xValue0_99, y0_99 + 5));

        g2d.setColor(Color.GREEN);
        g2d.setStroke(new BasicStroke(2));
        double xValue0_9 = 0.9;
        double yValue0_9 = 1 - 0.5 * xValue0_9 - 0.125 * Math.pow(xValue0_9, 2);
        int y0_9 = height - (int) (yValue0_9 * height);
        g2d.draw(new Line2D.Double(width * xValue0_9, y0_9 - 5, width * xValue0_9, y0_9 + 5));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
			public void run() {
			    JFrame frame = new JFrame("Function Plot");
			    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    frame.add(new FunctionPlot());
			    frame.setSize(400, 400);
			    frame.setLocationRelativeTo(null);
			    frame.setVisible(true);
			}
		});
    }
}
