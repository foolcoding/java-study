package phonebook1;

import java.util.List;

public class Handler {
	public void showList() {
		DAO dao = new DAO();
		
		List<PhoneBookDTO> list = dao.showlist();
		
		for(PhoneBookDTO ob : list) {
			System.out.printf("%s %s %d %s\n", 
					ob.getName(), 
					ob.getPnum(), 	
					ob.getAge(),
					ob.getFavorite());
		}
	}
	
	public int add(PhoneBookDTO ob) {
		int row = 0;
		DAO dao = new DAO();
		row = dao.add(ob);		
		return row;
	}
	
	public int pnumModify(String name, String pnum) {
		int row = 0;
		DAO dao = new DAO();
		row = dao.pnumModify(pnum, name);
		return row;
	}
	
	public int favoriteModify(String name) {
		int row = 0;
		DAO dao = new DAO();
		row = dao.favoriteModify(name);
		return row;
	}
	
	public int delete(String name) {
		int row = 0;
		DAO dao = new DAO();
		row = dao.delete(name);
		return row;
	}
	
	
}
