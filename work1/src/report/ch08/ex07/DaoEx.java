package report.ch08.ex07;

public class DaoEx {

	public static void dbWork(DataAccessObject deo){
		deo.select();
		deo.insert();
		deo.update();
		deo.delete();
	}

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

}
