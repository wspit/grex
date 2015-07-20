import greenfoot.core.WorldHandler;

import java.awt.FlowLayout;

import javax.swing.JPanel;

public class GridActor {

	private int gridWidth;
	private int gridHeight;
	private int nrOfColumns;
	private int nrOfRows;

	public GridActor(int width, int height, int nrOfColumns, int nrOfRows) {
		gridWidth = width;
		gridHeight = height;
		this.nrOfColumns = nrOfColumns;
		this.nrOfRows = nrOfRows;

		paint(this.nrOfColumns, this.nrOfRows);
	}

	public void paint(int nrOfColumns, int nrOfRows) {
		JPanel panel = WorldHandler.getInstance().getWorldCanvas();
		DrawGrid grid = new DrawGrid(nrOfRows, nrOfColumns, gridWidth,
				gridHeight);
		FlowLayout lm = (FlowLayout) panel.getLayout();
		lm.setVgap(0);		
		panel.add(grid);
	
		
		
		
	}
}
