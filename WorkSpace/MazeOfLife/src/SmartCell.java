
public class SmartCell extends Cell {

	int XL, YL;
	public SmartCell(int x, int y, int xl, int yl) {
		super(x, y);
		XL = xl;
		YL = yl;
	}

	public void move(int d)
	{
		switch(d)
		{
		case 1:
		{
			if(getY() > 0 && YL < getX())
			SetY(-1);
			if(getX() > 0 && XL < getX())
			SetX(-1);
			break;
		}
		case 2:
		{
			if(getY() > 0 && YL < getX())
			SetY(-1);
			break;
		}
		case 3:
		{
			if(getY() > 0 && YL < getX())
				SetY(-1);
			if(getX() > 0 && XL < getX())
				SetX(1);
			break;
		}
		case 4:
		{
			if(getX() > 0 && XL < getX())
			SetX(-1);
			break;
		}
		case 5:
		{
			if(getX() > 0 && XL < getX())
				SetX(1);
		}
		case 6:
		{
			if(getY() > 0 && YL < getX())
				SetY(1);
			if(getX() > 0 && XL < getX())
				SetX(-1);
			break;	
		}
		case 7:
		{
			if(getY() > 0 && YL < getX())
				SetY(1);
			break;
		}
		case 8:
		{
			if(getY() > 0 && YL < getX())
				SetY(1);
			if(getX() > 0 && XL < getX())
				SetX(1);
			break;
		}
		}
	}

}
