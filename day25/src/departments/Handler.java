package departments;

import java.util.ArrayList;
import java.util.List;

public class Handler {

	DepartmentsDAO dao = new DepartmentsDAO();
	
	public void selectList() {
		ArrayList<DepartmentsDTO> list = new ArrayList<>();
		list = dao.selectList();
		for(DepartmentsDTO ob : list) {
			System.out.printf("%d, %s, %d, %d\n",
			ob.getDEPARTMENT_ID(),
			ob.getDEPARTMENT_NAME(),
			ob.getMANAGER_ID(),
			ob.getLOCATION_ID());
		}
		
	}

	public int add(DepartmentsDTO dto) {
		int row = 0;
		row = dao.add(dto);
		return row;
	}

}
