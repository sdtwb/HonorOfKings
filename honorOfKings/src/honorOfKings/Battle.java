package honorOfKings;

public class Battle {

		//-------------------------定义英雄--Mp, Hp, Exp, X, Y, Name
		PartPerson person1= new PartPerson(100, 100, 100, 8, 8, '8');	
		
		//---------------------------------定义地图
	    Maps map= new Maps();
	
//-----------------------------------------------------------------------函数区
	 
    //-----------------------展现地图
	public void displayMaps() {
		
		map.Mapsmain();

	}

	//----------------------初始英雄位置
    public void initHerroPosition(int x, int y, char name) {
    	map.initPosition(x, y, name);
    }
	
//-------------------------------------------------------------------------主控制函数
	public void battleMain() {
		
		//-----------游戏开始时的地图
		displayMaps();

		//------------英雄位置初始
		initHerroPosition(person1.positionX, person1.positionY, person1.personName);
		displayMaps();
	}
	
}
