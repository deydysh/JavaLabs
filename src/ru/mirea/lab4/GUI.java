package ru.mirea.lab4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUI extends JFrame {
    JPanel[] pnl = new JPanel[3];
    int firstScore = 0, secondScore = 0;
    JLabel result = new JLabel("Result: 0 X 0");
    JLabel last = new JLabel("Last Scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");
    JButton button = new JButton("Real madrid");
    JButton button2 = new JButton("AC Milan");
    public GUI() {
        CustomListener listener = new CustomListener();
        setTitle("Score Panel");
        setLayout(new GridLayout(3, 1));
        setSize(300,300);
        for (int i = 0 ; i < pnl.length ; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }

        pnl[0].add(result, BorderLayout.NORTH);
        pnl[1].add(last, BorderLayout.WEST);
        pnl[1].add(winner, BorderLayout.EAST);
        pnl[2].add(button, BorderLayout.WEST);
        pnl[2].add(button2, BorderLayout.EAST);
        button.addMouseListener(listener);
        button2.addMouseListener(listener);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {

        GUI score = new GUI();
    }
    public class CustomListener implements MouseListener {
        public void mouseClicked(MouseEvent e) {
            JButton button = (JButton) e.getSource();
            String title = button.getText();
            if (title == "AC Milan") {
                firstScore++;
                last.setText("Last to score: AC Milan");
            } else {
                secondScore++;
                last.setText("Last to score: Real Madrid");
            }
            result.setText("Result: " + secondScore + " x " + firstScore);
            if (firstScore > secondScore) {
                winner.setText("Winner: AC Milan");
            } else if (firstScore < secondScore) {
                winner.setText("Winner: RealMadrid");
            } else winner.setText("Winner: DRAW");
        }
        public void mouseEntered(MouseEvent e) {
        }
        public void mouseExited(MouseEvent e) {
        }
        public void mousePressed(MouseEvent e) {
        }
        public void mouseReleased(MouseEvent e) {
        }
    }
}
