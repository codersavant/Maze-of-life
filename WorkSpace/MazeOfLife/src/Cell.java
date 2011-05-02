
public class Cell {
		private int X,Y;
		private byte neighbors;
		private boolean Alive;

		public Cell(int x, int y)
		{
			X = x;
			Y = y;
			neighbors = 0;
			Alive = false;
		}
		public void check()
		{
			if(neighbors > 3 || neighbors < 2)
				Alive = false;
			if(neighbors == 3 && !Alive)
				Alive = true;
			if(neighbors == 3 && neighbors == 2 && Alive)
				Alive = true;
		}
		public void setAlive(boolean alive)
		{
			this.Alive = alive;
		}
		public boolean isAlive()
		{
			return Alive;
		}
		public void addNeighbors()
		{
			neighbors++;
		}
		public void reset()
		{
			neighbors = 0;
		}
		public void SetX(int x)
		{
			X += x;
		}
		public void SetY(int y)
		{
			Y += y;
		}
		public int getX()
		{
			return X;
		}
		public int getY()
		{
			return Y;
		}
}
