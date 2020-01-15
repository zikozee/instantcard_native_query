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

        while(resultSet.next()){
            InstantCard instantCard = InstantCardRowMapper.pojoMapping(resultSet);
            instantCardList.add(instantCard);
        }
        return instantCardList;
    }


}
