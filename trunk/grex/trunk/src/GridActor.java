import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import greenfoot.World;
import greenfoot.core.WorldHandler;
import greenfoot.gui.ControlPanel;
import greenfoot.platforms.standalone.SimulationDelegateStandAlone;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class GridActor {

	private int gridWidth;
	private int gridHeight;
	private int nrOfColumns;
	private int nrOfRows;

	public GridActor(int width, int height, int nrOfColumns, int nrOfRows) {
		gridWidth = width;
		gridHeight = height;
		// setImage(new GreenfootImage(gridWidth, gridHeight));
		this.nrOfColumns = nrOfColumns;
		this.nrOfRows = nrOfRows;

		paint(this.nrOfColumns, this.nrOfRows);
	}

	// public void paint(int nrOfColumns, int nrOfRows) {
	// lock();

	// GreenfootImage lines = getImage();
	// int spaceBetweenColumns = lines.getHeight() / nrOfColumns;
	// int spaceBetweenRows = lines.getWidth() / nrOfRows;
	// int columnSize = 0;
	// int rowSize = 0;
	//
	// for (int rows = 0; rows < nrOfRows; rows++) {
	// lines.drawLine(rowSize, 0, rowSize, gridHeight);
	// rowSize = spaceBetweenRows + rowSize;
	// }
	// lines.drawLine(rowSize - 1, 0, rowSize - 1, gridHeight);
	//
	// for (int columns = 0; columns < nrOfColumns; columns++) {
	// lines.drawLine(0, columnSize, gridWidth, columnSize);
	// columnSize = spaceBetweenColumns + columnSize;
	//
	// }
	// lines.drawLine(0, columnSize - 1, gridWidth, columnSize - 1);

	// lockTest();
	// }

	public void paint(int nrOfColumns, int nrOfRows) {
		JPanel panel = WorldHandler.getInstance().getWorldCanvas();
//		panel.setLayout(new GridLayout(nrOfRows, nrOfColumns));
		DrawGrid grid = new DrawGrid(nrOfRows, nrOfColumns, gridWidth, gridHeight);
		panel.add(grid);
		
	
//		showCheckBox(panel);
	}
	
		private void showCheckBox(JPanel panel){		
//			JCheckBox box = new JCheckBox("show grid");		
//			ControlPanel cpanel = new ControlPanel(new SimulationDelegateStandAlone(), true);
//			panel.add(box);

//			box.setSelected(true);
			
//			if (box.isSelected()){
//				panel.getComponent(0).setVisible(true);
//			}  else {
//				panel.getComponent(0).setVisible(false); 
//			}
		
		}	


	}


