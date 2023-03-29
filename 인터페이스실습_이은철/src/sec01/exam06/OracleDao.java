package sec01.exam06;

public class OracleDao implements DataAccessObject{


	@Override
	public void select() {
		System.out.println("Oracle DB에서 검색");
	}
		// TODO Auto-generated method stub
		
	

	@Override
	public void insert() {
		System.out.println("Oracle DB에서 삽입");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		System.out.println("Oracle DB에서 수정");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB에서 삭제");
		// TODO Auto-generated method stub
		
	}
}

