package uti;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Task3SierpinskiTriangleFrame extends JFrame {
	static int r = 135, gr = 38, b = 87;



	private JTextField jtfOrder = new JTextField("0", 5); // Order
	private Task3SierpinskiTrianglePanel trianglePanel = new Task3SierpinskiTrianglePanel(); // To display the pattern

	public Task3SierpinskiTriangleFrame() {
// Panel to hold label, text field, and a button
		JPanel panel = new JPanel();
		panel.add(new JLabel("Enter an order: "));
		panel.add(jtfOrder);
		jtfOrder.setHorizontalAlignment(SwingConstants.RIGHT);
// Add a Sierpinski triangle panel to the frame
		add(trianglePanel);
		add(panel, BorderLayout.SOUTH);
// Register a listener
		jtfOrder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				trianglePanel.setOrder(Integer.parseInt(jtfOrder.getText()));
			}
		});

	}

}

