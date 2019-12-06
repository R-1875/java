package Array;

public class CPU {
	
	private class MotherBoard{
		
		public void Process()
		{
			System.out.println("MotherBoard processes the data\n");
		}
		
		public void Importance()
		{
			System.out.println("MotherBoard is the heart of CPU\n");
		}
		
	}
	
	public void  Caclulate()
	{
		MotherBoard mb = new MotherBoard();
		mb. Process();
		mb.Importance();
	}

}
