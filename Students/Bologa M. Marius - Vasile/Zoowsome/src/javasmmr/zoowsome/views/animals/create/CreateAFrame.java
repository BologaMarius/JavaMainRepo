package javasmmr.zoowsome.views.animals.create;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import javasmmr.zoowsome.models.animals.WaterType.TypeOfWater;
import javasmmr.zoowsome.views.ZooFrame;

/**
 * 
 * @author Marius Bologa
 *
 */
public class CreateAFrame extends ZooFrame {
	/**
	 * 
	 */
	int ten = 10;
	/**
	 * 
	 */
	private JTextField name = new JTextField(ten);
	/**
	 * 
	 */
	private JTextField nrOfLegs = new JTextField(ten);
	/**
	 * 
	 */
	private JTextField dangerPerc = new JTextField(ten);
	/**
	 * 
	 */
	private JTextField maintenanceCost = new JTextField(ten);
	/**
	 * 
	 */
	private JTextField avgSwimDepth = new JTextField(ten);
	/**
	 * 
	 */
	private JButton createButton = new JButton("Create");
	/**
	    * 
	    */
	private JRadioButton fwater = new JRadioButton("Fresh water");
	/**
	 * 
	 */
	private JRadioButton swater = new JRadioButton("Salt water");
	/**
	    * 
	    */
	private JRadioButton shark = new JRadioButton("Shark");
	/**
	 * 
	 */
	private JRadioButton northernPike = new JRadioButton("NorthernPike");
	/**
	 * 
	 */
	private JRadioButton tuna = new JRadioButton("Tuna");

	/**
	 * 
	 * @return The status of the radio button.
	 */
	public final JRadioButton getShark() {
		return shark;
	}

	/**
	 * 
	 * @return The status of the radio button.
	 */
	public final JRadioButton getNorthernPike() {
		return northernPike;
	}

	/**
	 * 
	 * @return The status of the radio button.
	 */
	public final JRadioButton getTuna() {
		return tuna;
	}

	/**
	 * 
	 * @param title
	 *            The title of the frame.
	 */
	public CreateAFrame(final String title) {
		super(title);

		// Sets up the view and adds the components
		contentPanel.setLayout(new GridLayout(2, 7, 0, 0));
		JPanel calcPanel = new JPanel();
		contentPanel.add(calcPanel);
		SpringLayout slPanel = new SpringLayout();
		calcPanel.setLayout(slPanel);
		JLabel l = new JLabel("Name:", JLabel.TRAILING);
		calcPanel.add(l);
		slPanel.putConstraint(SpringLayout.NORTH, l, 25, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l, 0, SpringLayout.WEST, calcPanel);
		l.setLabelFor(name);
		calcPanel.add(name);
		slPanel.putConstraint(SpringLayout.NORTH, name, 25, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, name, 120, SpringLayout.WEST, calcPanel);
		JLabel l1 = new JLabel("Number of legs:", JLabel.TRAILING);
		calcPanel.add(l1);
		l1.setLabelFor(nrOfLegs);
		slPanel.putConstraint(SpringLayout.NORTH, l1, 45, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l1, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(nrOfLegs);
		slPanel.putConstraint(SpringLayout.NORTH, nrOfLegs, 45, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, nrOfLegs, 120, SpringLayout.WEST, calcPanel);
		JLabel l2 = new JLabel("Average swim depth:", JLabel.TRAILING);
		calcPanel.add(l2);
		l2.setLabelFor(avgSwimDepth);
		slPanel.putConstraint(SpringLayout.NORTH, l2, 65, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l2, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(avgSwimDepth);
		slPanel.putConstraint(SpringLayout.NORTH, avgSwimDepth, 65, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, avgSwimDepth, 120, SpringLayout.WEST, calcPanel);
		JLabel l3 = new JLabel("Water type:", JLabel.TRAILING);
		calcPanel.add(l3);
		slPanel.putConstraint(SpringLayout.NORTH, l3, 89, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l3, 0, SpringLayout.WEST, calcPanel);
		l3.setLabelFor(fwater);
		calcPanel.add(fwater);
		slPanel.putConstraint(SpringLayout.NORTH, fwater, 87, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, fwater, 120, SpringLayout.WEST, calcPanel);
		calcPanel.add(swater);
		slPanel.putConstraint(SpringLayout.NORTH, swater, 87, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, swater, 220, SpringLayout.WEST, calcPanel);
		ButtonGroup group = new ButtonGroup();
		group.add(fwater);
		group.add(swater);
		JLabel l4 = new JLabel("Danger percentage:", JLabel.TRAILING);
		calcPanel.add(l4);
		l4.setLabelFor(dangerPerc);
		slPanel.putConstraint(SpringLayout.NORTH, l4, 115, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l4, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(dangerPerc);
		slPanel.putConstraint(SpringLayout.NORTH, dangerPerc, 115, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, dangerPerc, 120, SpringLayout.WEST, calcPanel);
		JLabel l5 = new JLabel("Maintenance cost:", JLabel.TRAILING);
		calcPanel.add(l5);
		l5.setLabelFor(maintenanceCost);
		slPanel.putConstraint(SpringLayout.NORTH, l5, 135, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l5, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(maintenanceCost);
		slPanel.putConstraint(SpringLayout.NORTH, maintenanceCost, 135, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, maintenanceCost, 120, SpringLayout.WEST, calcPanel);
		calcPanel.add(createButton);
		slPanel.putConstraint(SpringLayout.NORTH, createButton, 160, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, createButton, 150, SpringLayout.WEST, calcPanel);
		JLabel l6 = new JLabel("Choose aquatic:", JLabel.TRAILING);
		calcPanel.add(l6);
		l6.setLabelFor(shark);

		slPanel.putConstraint(SpringLayout.NORTH, l6, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, l6, 0, SpringLayout.WEST, calcPanel);
		calcPanel.add(shark);
		slPanel.putConstraint(SpringLayout.NORTH, shark, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, shark, 120, SpringLayout.WEST, calcPanel);
		calcPanel.add(northernPike);
		slPanel.putConstraint(SpringLayout.NORTH, northernPike, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, northernPike, 183, SpringLayout.WEST, calcPanel);
		calcPanel.add(tuna);
		slPanel.putConstraint(SpringLayout.NORTH, tuna, 0, SpringLayout.NORTH, calcPanel);
		slPanel.putConstraint(SpringLayout.WEST, tuna, 280, SpringLayout.WEST, calcPanel);
		ButtonGroup group1 = new ButtonGroup();
		group1.add(shark);
		group1.add(northernPike);
		group1.add(tuna);

	}

	/**
	 * @return The name.
	 */
	public final String getTheName() {
		return name.getText();
	}

	/**
	 * 
	 * @return Number of legs.
	 */
	public final int getNrOfLegs() {
		return Integer.parseInt(nrOfLegs.getText());
	}

	/**
	 * 
	 * @return Average swim depth.
	 */
	public final int getAvgSwimDepth() {
		return Integer.parseInt(avgSwimDepth.getText());
	}

	/**
	 * 
	 * @return Danger percentage.
	 */
	public final double getDangerPerc() {
		return Double.parseDouble(dangerPerc.getText());
	}

	/**
	 * 
	 * @return Maintenance cost.
	 */
	public final double getMaintenanceCost() {
		return Double.parseDouble(maintenanceCost.getText());
	}

	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	/**
	 * 
	 * @param listenForCalcButton
	 *            A button.
	 */
	public final void setCreateButtonActionListener(final ActionListener listenForCalcButton) {

		createButton.addActionListener(listenForCalcButton);

	}

	@Override
	public void goBack() {

	}

	/**
	 * 
	 * @return Fresh water.
	 */
	public final JRadioButton getFwater() {
		return fwater;
	}

	/**
	 * 
	 * @return Salt water.
	 */
	public final JRadioButton getSwater() {
		return swater;
	}

	/**
	 * 
	 * @return Type of water.
	 */
	public final TypeOfWater getWaterType() {
		if (fwater.isSelected()) {
			return TypeOfWater.freshwater;
		} else if (swater.isSelected()) {
			return TypeOfWater.saltwater;
		}
		return null;
	}

}
