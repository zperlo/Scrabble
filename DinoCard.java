import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

/**
 * An implementation of JPanel that displays the stats of a Dinosaur
 *
 * @author Jacob Rich
 * @version 1.4
 * @since 2018-12-6
 */
public class DinoCard extends JPanel {

    // static card level components

    // title label
    private JLabel title;

    // info labels
    private JLabel labelName;
    private JLabel labelDiet;
    private JLabel labelHabitat;

    // stat labels
    private JLabel labelSpe;
    private JLabel labelSiz;
    private JLabel labelInt;
    private JLabel labelDef;
    private JLabel labelWep;
    private JLabel labelSen;
    private JLabel labelROR;
    private JLabel labelATA;

    // dynamic card level components

    // info labels
    private JLabel dinoName;
    private JLabel dinoDiet;
    private JLabel dinoHabitat;

    // stat header
    private JLabel labelStatHeader;

    // stat value labels
    private JLabel dinoSpe;
    private JLabel dinoSiz;
    private JLabel dinoInt;
    private JLabel dinoDef;
    private JLabel dinoWep;
    private JLabel dinoSen;
    private JLabel dinoROR;
    private JLabel dinoATA;

    // image label
    private JLabel imageLabel;

    private Font statFont;

    /**
     * Sets the LayoutManager and adds all components to it.
     *
     * @param player The player whose stats are on display
     * @param ir a preloaded IconRef
     * @param bg the background color to be used
     * @see Player
     * @see java.awt.GridBagLayout
     * @see java.awt.GridBagConstraints
     * @see javax.swing.JLabel
     * @see Dinosaur
     * @see javax.swing.BorderFactory
     * @see java.awt.Font
     * @see java.awt.Component
     */
    public DinoCard(Player player, IconRef ir, Color bg) {
        Dinosaur d = player.getDino();

        setLayout(new GridBagLayout());
        setBackground(bg);
        GridBagConstraints gbc;

        // static label configuration

        // title label
        title = new JLabel("DINOSAUR DATA CARD");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(title, gbc);
        // info labels
        // labelName
        labelName = new JLabel("Name:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(7, 7, 7, 7);
        gbc.anchor = GridBagConstraints.WEST;
        add(labelName, gbc);
        // labelDiet
        labelDiet = new JLabel("Diet:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(labelDiet, gbc);
        // labelHabitat
        labelHabitat = new JLabel("Habitat:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(labelHabitat, gbc);
        // stat labels
        // labelSpe
        labelSpe = new JLabel("SPEED");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(labelSpe, gbc);
        // labelSiz
        labelSiz = new JLabel("SIZE");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(labelSiz, gbc);
        // labelInt
        labelInt = new JLabel("INTELLIGENCE");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(labelInt, gbc);
        // labelDef
        labelDef = new JLabel("DEFENSES");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(labelDef, gbc);
        // labelWep
        labelWep = new JLabel("WEAPONS");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(labelWep, gbc);
        // labelSen
        labelSen = new JLabel("SENSES");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 10;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(labelSen, gbc);
        // labelROR
        labelROR = new JLabel("RATE OF REPRODUCTION");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 11;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(labelROR, gbc);
        // labelATA
        labelATA = new JLabel("ABILITY TO ADAPT");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 12;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(labelATA, gbc);

        // dynamic label configuration

        // info labels
        // dinoName
        dinoName = new JLabel(d.getName());
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(dinoName, gbc);
        // dinoDiet
        dinoDiet = new JLabel((d.isHerbivore()) ? "Herbivore" : "Carnivore");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(dinoDiet, gbc);
        // dinoHabitat
        dinoHabitat = new JLabel(d.getHabitat());
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(dinoHabitat, gbc);
        // stat header
        labelStatHeader = new JLabel(d.getName() + " Statistics:");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(labelStatHeader, gbc);
        // stat labels
        // dinoSpe
        dinoSpe = new JLabel(getMinusZeroPlus(d.getSpeed()));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(dinoSpe, gbc);
        // dinoSiz
        dinoSiz = new JLabel(getMinusZeroPlus(d.getSize()));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(dinoSiz, gbc);
        // dinoInt
        dinoInt = new JLabel(getMinusZeroPlus(d.getIntelligence()));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(dinoInt, gbc);
        // dinoDef
        dinoDef = new JLabel(getMinusZeroPlus(d.getDefenses()));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(dinoDef, gbc);
        // dinoWep
        dinoWep = new JLabel(getMinusZeroPlus(d.getWeapons()));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(dinoWep, gbc);
        // dinoSen
        dinoSen = new JLabel(getMinusZeroPlus(d.getSenses()));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(dinoSen, gbc);
        // dinoROR
        dinoROR = new JLabel(getMinusZeroPlus(d.getRor()));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(dinoROR, gbc);
        // dinoATA
        dinoATA = new JLabel(getMinusZeroPlus(d.getAta()));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(dinoATA, gbc);
        // image label
        imageLabel = new JLabel(ir.getCompareToHuman(d));
        imageLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));
        imageLabel.setBackground(bg);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 13;
        gbc.gridwidth = 3;
        gbc.insets = new Insets(7, 7, 7, 7);
        add(imageLabel, gbc);

        statFont = new Font(title.getFont().getName(), Font.BOLD, (int) (title.getFont().getSize() * 1.5));
        for (Component c : this.getComponents()) {
            c.setFont(statFont);
        }
    }

    /**
     * Given an int representing a dinosaur's stat, get an appropriate String representation
     *
     * @param statValue the int to convert
     * @return the converted String
     */
    private String getMinusZeroPlus(int statValue) {
        switch(statValue) {
            case -1: return "-";
            case 0: return "0";
            case 1: return "+";
        }
        return "X";
    }

    /**
     * Update a dinosaur's stat labels to show evolved values.
     *
     * @param i the type of evolution to occur
     * @see javax.swing.JLabel
     */
    public void evolve(int i) {
        switch (i) {
            case 2:
                dinoSpe.setText("<html><font color=00ffff><font style=bold>+</html>");
                labelSpe.setText("<html><font color=00ffff><font style=bold>SPEED</html>");
                dinoSiz.setText("<html><font color=00ffff><font style=bold>+</html>");
                labelSiz.setText("<html><font color=00ffff><font style=bold>SIZE</html>");
                break;
            case 3:
                dinoSen.setText("<html><font color=00ffff><font style=bold>+</html>");
                labelSen.setText("<html><font color=00ffff><font style=bold>SENSES</html>");
                dinoInt.setText("<html><font color=00ffff><font style=bold>+</html>");
                labelInt.setText("<html><font color=00ffff><font style=bold>INTELLIGENCE</html>");
                break;
            default:
                break;
        }
    }

    /**
     * gets the text of a specific JLabel for use in attack situations
     *
     * @param stat the stat to get labels for
     * @param wantsValue whether the stat value (true) or the stat name (false) is wanted
     * @return the appropriate JLabel
     * @see javax.swing.JLabel
     */
    public JLabel getLabel(String stat, boolean wantsValue) {
        JLabel valueLabel = null;
        JLabel statLabel = null;
        switch (stat.toUpperCase()) {
            case "SPEED":
                valueLabel = new JLabel();
                statLabel = new JLabel();
                valueLabel.setText(dinoSpe.getText());
                statLabel.setText(labelSpe.getText());
                break;
            case "SIZE":
                valueLabel = new JLabel();
                statLabel = new JLabel();
                valueLabel.setText(dinoSiz.getText());
                statLabel.setText(labelSiz.getText());
                break;
            case "INTELLIGENCE":
                valueLabel = new JLabel();
                statLabel = new JLabel();
                valueLabel.setText(dinoInt.getText());
                statLabel.setText(labelInt.getText());
                break;
            case "DEFENSES":
                valueLabel = new JLabel();
                statLabel = new JLabel();
                valueLabel.setText(dinoDef.getText());
                statLabel.setText(labelDef.getText());
                break;
            case "WEAPONS":
                valueLabel = new JLabel();
                statLabel = new JLabel();
                valueLabel.setText(dinoWep.getText());
                statLabel.setText(labelWep.getText());
                break;
            case "SENSES":
                valueLabel = new JLabel();
                statLabel = new JLabel();
                valueLabel.setText(dinoSen.getText());
                statLabel.setText(labelSen.getText());
                break;
            case "ROR":
                valueLabel = new JLabel();
                statLabel = new JLabel();
                valueLabel.setText(dinoROR.getText());
                statLabel.setText(labelROR.getText());
                break;
            case "ATA":
                valueLabel = new JLabel();
                statLabel = new JLabel();
                valueLabel.setText(dinoATA.getText());
                statLabel.setText(labelATA.getText());
                break;
            default:
                break;
        }
        return wantsValue ? valueLabel : statLabel;
    }
}
