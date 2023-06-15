package report.ch08.ex07;

public record MySqlDao() implements DataAccessObject {

	public void select() {
		System.out.println("MySql db에서 검색");
	}

	public void insert() {
		System.out.println("MySql db에 삽입");
	}

	public void update() {
		System.out.println("MySql db에 수정");
	}

	public void delete() {
		System.out.println("MySql db에 삭제");
	}

}
