import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program {

	private static String connectionString = "jdbc:derby://localhost:3301/JBDB;create=true";

	public static void buildDB() {

		try {

			Connection connection = DriverManager.getConnection(connectionString);

			String sql = "create table Students ("
					+ "id integer not null primary key generated always as identity(start with 1, increment by 1), "
					+ "name varchar(50) not null, " + "age integer not null)";
			System.out.println("Testing: " + sql);
			Statement statement = connection.createStatement();

			statement.executeUpdate(sql);

			System.out.println("Student table has been created.");
		} catch (Exception ex) {
			System.out.println("Error" + ex.getMessage());
		}
	}

	public static void insert(String name, int age) throws SQLException {

		Connection connection = DriverManager.getConnection(connectionString);

		String sql = String.format("insert into Students(name, age) values('%s', %d)", name, age);
		System.out.println("Testing: " + sql);
		PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

		preparedStatement.executeUpdate();

		ResultSet resultSet = preparedStatement.getGeneratedKeys();

		resultSet.next();

		int id = resultSet.getInt(1);

		System.out.println("New Student Added: Name: " + name + ", ID: " + id);
	}

	public static void readAll() throws SQLException {

		Connection connection = DriverManager.getConnection(connectionString);

		Statement statement = connection.createStatement();

		String sql = "select * from Students";

		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {

			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			int age = resultSet.getInt("age");

			System.out.println("id: " + id + ", name: " + name + ", age: " + age);
		}
	}

	public static void update(int id, String name, int age) throws SQLException {

		Connection connection = DriverManager.getConnection(connectionString);

		String sql = String.format("update Students set name='%s', age=%d where id=%d", name, age, id);
		System.out.println("Testing: " + sql);
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.executeUpdate();

		System.out.println("Update succeeded.");
	}

	public static void delete(int id) throws SQLException {

		Connection connection = DriverManager.getConnection(connectionString);

		String sql = String.format("delete from Students where id=%d", id);

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.executeUpdate();

		System.out.println("Delete succeeded.");
	}

	public static void deleteTable() throws SQLException {
		Connection connection = DriverManager.getConnection(connectionString);

		String sql = String.format("drop table Students");

		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		preparedStatement.executeUpdate();

		System.out.println("Delete table succeeded.");
	}

	public static void main(String[] args) {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			buildDB();

			insert("David", 30);
			insert("Maya", 20);
			insert("Jane", 25);
			insert("Max", 37);
			insert("Emma", 24);

			readAll();
			update(4, "Lily", 5);

			delete(1);

			readAll();

			deleteTable();
		} catch (Exception ex) {
			System.out.println("Error " + ex.getMessage());
		}
	}
}