package Tetris;

/**
 * Created by kvlad_000 on 07.07.2016.
 */
    import java.awt.*;
    import java.awt.event.KeyAdapter;
    import java.awt.event.KeyEvent;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JPanel;

    public class test extends JFrame {

        private JLabel label;

        public test() {
            super("Test frame");
            createGUI();
        }

        public void createGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            panel.setFocusable(true);

            label = new JLabel();
            label.setFont(new Font("Calibri", Font.PLAIN, 10));
            label.setHorizontalAlignment(JLabel.LEFT);

            panel.addKeyListener(new KeyAdapter() {

                public void keyReleased(KeyEvent e) {
                    label.setText(e.getKeyText(e.getKeyCode()));
                }
            });

            panel.add(label, BorderLayout.LINE_START);

            setPreferredSize(new Dimension(200, 200));
            getContentPane().add(panel);
        }

        public static void main(String[] args) {
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    JFrame.setDefaultLookAndFeelDecorated(true);
                    test frame = new test();
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }
            });
        }
    }
