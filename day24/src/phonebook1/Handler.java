package phonebook1;

import java.util.List;

public class Handler {
	public void showList() {
		DAO dao = new DAO();
		
		List<PhoneBookDTO> list = dao.showlist();
		
		for(PhoneBookDTO ob : list) {
			System.out.printf("%d %s %s %d %s\n", 
					ob.getIdx(),
					ob.getName(), 
					ob.getPnum(), 	
					ob.getAge(),
					ob.getFavorite());
		}
	}
	
	public int insert(PhoneBookDTO ob) {
		int row = 0;
		DAO dao = new DAO();
		row = dao.insert(ob);		
		return row;
	}
	
	public int pnumModify(String name, String pnum) {
		int row = 0;
		DAO dao = new DAO();
		row = dao.pnumModify(name, pnum);
		return row;
	}
	
	public int favoriteModify(String name) {
		int row = 0;
		DAO dao = new DAO();
		row = dao.favoriteModify(name);
		return row;
	}
	
	public int delete(int idx) {
		int row = 0;
		DAO dao = new DAO();
		row = dao.delete(idx);
		return row;
	}
	
	
}
