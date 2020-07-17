package com.heritage.instantcard.repo;

import com.heritage.instantcard.model.InstantCard;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InstantCardExtractor implements ResultSetExtractor<List<InstantCard>> {
    @Override
    public List<InstantCard> extractData(ResultSet resultSet) throws SQLException, DataAccessException {
        List<InstantCard> instantCardList = new ArrayList<>();
        
//        ResultSetMetaData rsmd = resultSet.getMetaData();
//        int columnsNumber = rsmd.getColumnCount();
//        while (resultSet.next()) {
//            for (int i = 1; i <= columnsNumber; i++) {
//                if (i > 1) System.out.print(",  ");
//                String columnValue = resultSet.getString(i);
//                System.out.print(columnValue + " " + rsmd.getColumnName(i));
//            }
//            System.out.println("");
//        }
        while(resultSet.next()){
            InstantCard instantCard = InstantCardRowMapper.pojoMapping(resultSet);
            instantCardList.add(instantCard);
        }
        return instantCardList;
    }


}
