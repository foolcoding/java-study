package schedule;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Handler {

	private ScheduleDAO dao = new ScheduleDAO();
	
	public void selectAll() {
		ArrayList<ScheduleDTO> list = new ArrayList<>();
		list = dao.selectAll();
		for(ScheduleDTO ob : list) {
			System.out.printf("%s : %s ~ %s\n",
					ob.getTitle(), 
					ob.getStart_date(), 
					ob.getEnd_date());
		}
		
	}
	
	public String selectVersion() {
		return dao.selectVersion();
	}
	
	public Date getSysdate() {
		return dao.getSysdate();
	}

	public List<ScheduleDTO> selectMonth(int m1) {
		return dao.selectMonth(m1);
	}

	public int add(ScheduleDTO dto) {
		int row = 0;
		dao.add(dto);
		return row;
	}

	public int delete(String sche) {
		int row = 0;
		dao.delete(sche);
		return row;
	}


}
