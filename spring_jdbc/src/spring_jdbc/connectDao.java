package spring_jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class connectDao {

	private JdbcTemplate  jdbctemp;

	public JdbcTemplate getJdbctemp() {
		return jdbctemp;
	}

	public void setJdbctemp(JdbcTemplate jdbctemp) {
		this.jdbctemp = jdbctemp;
	}
	
	public int saveStudent(student s)
	
	{
		int id=s.getId();
		String name=s.getName();
		String Address=s.getAddress();
		String q="insert into student values("+"'"+id+"'"+","+"'"+name+"'"+","+"'"+Address+"'"+")";
		return jdbctemp.update(q);
		
		
		
	}
}
