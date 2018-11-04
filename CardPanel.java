import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CardPanel extends JPanel {
    // card components
    private JLabel labelTop;
    private JLabel labelMid;
    private JLabel labelBot;
    private JLabel labelHab;

    // utility variables
    private int labelClicked = -1;

    // constructor
    public CardPanel() {
        setVisible(false);
        setup();
    }

    // initialize components
    private void setup() {
        // layout tools
        setLayout(new GridBagLayout());
        GridBagConstraints gbc;

        // labelTop
        labelTop = new JLabel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(labelTop, gbc);

        // labelMid
        labelMid = new JLabel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(labelMid, gbc);

        // labelBot
        labelBot = new JLabel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(labelBot, gbc);

        // labelHab
        labelHab = new JLabel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(labelHab, gbc);
    }

    public void showAttack(AttackCard c) {
        System.out.println("Showing attack");
        setBackground(Color.green);
        labelTop.setText(c.getPara1());
        labelBot.setText(c.getPara2());

        setVisible(true);

        // TODO: replace with actual dismissal
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setVisible(false);
    }

    public int showChallenge(ChallengeCard c) {
        System.out.println("Showing challenge");
        setBackground(Color.CYAN);
        labelTop.setText(c.getChoice1());
        labelMid.setText(c.getMiddlePara());
        labelBot.setText(c.getChoice2());

        labelTop.addMouseListener(new LabelListener());
        labelBot.addMouseListener(new LabelListener());

        setVisible(true);

        while (labelClicked == -1) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int ret = labelClicked;
        labelClicked = -1;

        setVisible(false);

        return ret;
    }

    public void showNaturalDisaster(NaturalDisasterCard c) {
        System.out.println("Showing natural disaster");
        setBackground(Color.PINK);
        labelTop.setText(c.getPara1());
        labelMid.setText(c.getPara2());
        labelBot.setText(c.getPara3());
        if ((c.getHabitatSafe())) {
            labelHab.setText("HABITAT SAFE");
        } else {
            labelHab.setText(null);
        }

        setVisible(true);

        // TODO: replace with actual dismissal
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setVisible(false);
    }

    private class LabelListener implements MouseListener {
        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getComponent().equals(labelTop)) {
                labelClicked = 0;
            }
            else if (e.getComponent().equals(labelBot)) {
                labelClicked = 1;
            }
        }
    }
}
