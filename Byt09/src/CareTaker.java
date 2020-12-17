import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private String url;
	 private List<State> stateList;
	 File file = new File("C:\\Users\\test\\Documents\\GitHub\\Byt\\BYT09_s19241\\Byt09\\src\\StatesFile");
	 FileWriter fr;
	 

	 public CareTaker() {
		 stateList = new ArrayList<State>();
		 
	 }
	 
	 
	   public void add(State state) throws IOException{
	      stateList.add(state);
	      WriteStateToFile(state);
	   }

	   public State get(int index){
	      return stateList.get(index);
	   }
	   
	   public void WriteStateToFile(State s) throws IOException {
		   try {
			   fr = new FileWriter(file);
			   fr.write("State #"+s.getState());
			   
			   for(Webpage wl : s.getWebpages()) {
				   fr.write(System.getProperty("line.separator"));
				   fr.write(wl.toString());  
			   }
			  		   
		   }catch(IOException e) {
			   e.printStackTrace();
		   }
		   finally {
			   
			 fr.close();  
			   
		   }   
			   
		   }
		   
	   }

