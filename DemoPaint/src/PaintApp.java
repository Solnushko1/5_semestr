import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PaintApp extends JFrame {

    private Tool currentTool;

    //Окно рисования
    public PaintApp() {
        setTitle("Доисторический Paint");
        setSize(600, 600); //квадратное окно, но можно сделать больше по желанию
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel toolPanel = new JPanel();
        JButton pencilButton = new JButton("Pencil");
        JButton brushButton = new JButton("Brush");
        JButton eraserButton = new JButton("Eraser");

        //для кнопок
        pencilButton.addActionListener(e -> {
            currentTool = ToolFactory.getTool("pencil");
        });

        brushButton.addActionListener(e -> {
            currentTool = ToolFactory.getTool("brush");
        });

        eraserButton.addActionListener(e -> {
            currentTool = ToolFactory.getTool("eraser");
        });


        toolPanel.add(pencilButton);
        toolPanel.add(brushButton);
        toolPanel.add(eraserButton);

        add(toolPanel, BorderLayout.SOUTH);

        DrawingPanel drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private class DrawingPanel extends JPanel {
        private int prevX, prevY;
        private boolean drawing;

        // Кнопки мышки
        public DrawingPanel() {
            setBackground(Color.WHITE);// GREEN,BLUE,RED и тд. цвет фона

            addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    prevX = e.getX();
                    prevY = e.getY();
                    drawing = true;
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    drawing = false;
                }
            });

            addMouseMotionListener(new MouseAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    if (drawing && currentTool != null) {
                        Graphics g = getGraphics();
                        currentTool.use(g, e.getX(), e.getY());
                        g.dispose();
                        prevX = e.getX();
                        prevY = e.getY();
                    }
                }
            });
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(PaintApp::new);
    }
}
