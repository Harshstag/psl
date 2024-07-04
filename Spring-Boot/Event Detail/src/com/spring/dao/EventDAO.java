package com.spring.dao;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import com.spring.entity.Event;
import java.sql.ResultSet;
import java.sql.Types;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
//Fill your code here
public class EventDAO {
    
    //Fill your code here
    

	public List<Event> getAllEvents(){
		//fill your code
		 
    }
    
    public String getEventById(int id){
    	  //Fill your code here
        
        
        
    }
    
	public void createEvent(int id,String eventName,String organiser,String organiserNumber,String hallName, String location) {
        
	    //Fill your code here


	}           
    }
