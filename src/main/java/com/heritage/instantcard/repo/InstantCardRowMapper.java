package com.heritage.instantcard.repo;

import com.heritage.instantcard.model.InstantCard;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InstantCardRowMapper implements RowMapper<InstantCard> {

    @Override
    public InstantCard mapRow(ResultSet resultSet, int i) throws SQLException {
        return pojoMapping(resultSet);
    }

    static InstantCard pojoMapping(ResultSet resultSet) throws SQLException {
        InstantCard instantCard = new InstantCard();

        instantCard.setAccountId(resultSet.getString("AccountId"));
        instantCard.setBankId(resultSet.getString("BankId"));
        instantCard.setOrgKey(resultSet.getString("OrgKey"));
        instantCard.setOrgType(resultSet.getString("OrgType"));
        instantCard.setFirstName(resultSet.getString("FirstName"));
        instantCard.setMiddleName(resultSet.getString("MiddleName"));
        instantCard.setLastName(resultSet.getString("LastName"));
        instantCard.setTitle(resultSet.getString("Title"));
        instantCard.setGender(resultSet.getString("Gender"));
        instantCard.setDayOfBirth(resultSet.getString("DayOfBirth"));
        instantCard.setMonthOfBirth(resultSet.getString("MonthOfBirth"));
        instantCard.setYearOfBirth(resultSet.getString("YearOfBirth"));
        instantCard.setDateOfBirth(resultSet.getString("DateOfBirth"));
        instantCard.setCustomerType(resultSet.getString("CustomerType"));
        instantCard.setLanguage(resultSet.getString("Language"));
        instantCard.setCellPhone(resultSet.getString("CellPhone"));
        instantCard.setCity(resultSet.getString("City"));
        instantCard.setCityCode(resultSet.getString("CityCode"));
        instantCard.setRelationshipOpeningDate(resultSet.getString("RelationshipOpeningDate"));
        instantCard.setStatus(resultSet.getString("Status"));
        instantCard.setManager(resultSet.getString("Manager"));
        instantCard.setMotherMaidenName(resultSet.getString("MotherMaidenName"));
        instantCard.setUniqueId(resultSet.getString("UniqueId"));
        instantCard.setUniqueIdType(resultSet.getString("UniqueIdType"));
        instantCard.setStaffEmployeeId(resultSet.getString("StaffEmployeeId"));
        instantCard.setShortName(resultSet.getString("ShortName"));
        instantCard.setBlacklisted(resultSet.getString("Blacklisted"));
        instantCard.setNegated(resultSet.getString("Negated"));
        instantCard.setSuspended(resultSet.getString("Suspended"));
        instantCard.setPreferredName(resultSet.getString("PreferredName"));
        instantCard.setRecordStatus(resultSet.getString("RecordStatus"));
        instantCard.setName(resultSet.getString("Name"));
        instantCard.setDefaultAddressType(resultSet.getString("DefaultAddressType"));
        instantCard.setPreferredPhone(resultSet.getString("PreferredPhone"));
        instantCard.setStartDate(resultSet.getString("StartDate"));
        instantCard.setCurrencyCode(resultSet.getString("CurrencyCode"));
        instantCard.setPrimarySolId(resultSet.getString("PrimarySolId"));
        instantCard.setPrimaryBranch(resultSet.getString("PrimaryBranch"));
        instantCard.setCustomerId(resultSet.getString("CustomerId"));
        instantCard.setEntityCreditFlag(resultSet.getString("EntityCreditFlag"));
        instantCard.setIseBankingEnabled(resultSet.getString("IseBankingEnabled"));
        instantCard.setIsSmsBankingEnabled(resultSet.getString("IsSmsBankingEnabled"));
        instantCard.setSubSegment(resultSet.getString("SubSegment"));
        instantCard.setIsWapBankingEnabled(resultSet.getString("IsWapBankingEnabled"));
        instantCard.setAlreadyCreatedInEbanking(resultSet.getString("AlreadyCreatedInEbanking"));
        instantCard.setSmsBankingMobileNumber(resultSet.getString("SmsBankingMobileNumber"));
        instantCard.setAccessOwnerSegment(resultSet.getString("AccessOwnerSegment"));
        instantCard.setAccessOwnerGroup(resultSet.getString("AccessOwnerGroup"));
        instantCard.setPreferredPhoneType(resultSet.getString("PreferredPhoneType"));
        instantCard.setPreferredEmail(resultSet.getString("PreferredEmail"));
        instantCard.setAddressLine1(resultSet.getString("AddressLine1"));
        instantCard.setAddressLine2(resultSet.getString("AddressLine2"));
        instantCard.setAddressLine3(resultSet.getString("AddressLine3"));
        instantCard.setState(resultSet.getString("State"));
        instantCard.setStateCode(resultSet.getString("StateCode"));
        instantCard.setCountry(resultSet.getString("Country"));
        instantCard.setCountryCode(resultSet.getString("CountryCode"));
        instantCard.setZip(resultSet.getString("Zip"));
        return instantCard;
    }
}
