package honorOfKings;

public class Battle {

		//-------------------------����Ӣ��--Mp, Hp, Exp, X, Y, Name
		PartPerson person1= new PartPerson(100, 100, 100, 8, 8, '8');	
		
		//---------------------------------�����ͼ
	    Maps map= new Maps();
	
//-----------------------------------------------------------------------������
	 
    //-----------------------չ�ֵ�ͼ
	public void displayMaps() {
		
		map.Mapsmain();

	}

	//----------------------��ʼӢ��λ��
    public void initHerroPosition(int x, int y, char name) {
    	map.initPosition(x, y, name);
    }
	
//-------------------------------------------------------------------------�����ƺ���
	public void battleMain() {
		
		//-----------��Ϸ��ʼʱ�ĵ�ͼ
		displayMaps();

		//------------Ӣ��λ�ó�ʼ
		initHerroPosition(person1.positionX, person1.positionY, person1.personName);
		displayMaps();
	}
	
}
