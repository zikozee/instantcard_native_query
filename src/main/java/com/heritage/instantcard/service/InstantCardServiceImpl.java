package com.heritage.instantcard.service;

import com.heritage.instantcard.globalHandling.CIFNotFoundException;
import com.heritage.instantcard.model.InstantCard;
import com.heritage.instantcard.query.OracleQuery;
import com.heritage.instantcard.repo.InstantCardRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Service
public class InstantCardServiceImpl implements InstantCardService {

    //Extractor is the better preferred
    public String ORACLE_QUERY = OracleQuery.QUERY_FOR_INSTANT_CARD;

    @Resource(name = "oracle_db")
    private DataSource dataSource;

    @Override
    public InstantCard getSingleEntity(String orgKey) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        InstantCard instantCard = jdbcTemplate
                .queryForObject(ORACLE_QUERY + " where orgKey=?", new Object[] {orgKey}, new InstantCardRowMapper());
        if(instantCard == null){
            throw new CIFNotFoundException("Instant card CIF ID:=> " + orgKey + " does not exist");
        }

        return instantCard;
    }

//    @Override
//    public List<InstantCard> getRowMapperList() {
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//        return jdbcTemplate.query(ORACLE_QUERY, new InstantCardRowMapper());
//    }
//
//    @Override
//    public List<InstantCard> getResultExtractorList() {
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//        return jdbcTemplate.query(ORACLE_QUERY, new InstantCardRowMapper());
//    }
}
