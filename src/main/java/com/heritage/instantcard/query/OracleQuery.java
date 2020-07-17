package com.heritage.instantcard.query;

public class OracleQuery {
    private OracleQuery(){}
    public static String QUERY_FOR_INSTANT_CARD = "select AccountId ,Bank_Id, OrgKey,OrgType,cust_First_Name as FirstName,cust_Middle_Name as MiddleName,cust_Last_Name as LastName,SALUTATION as Title,Gender,BIRTH_DAY as DayOfBirth,\n" +
            "BIRTH_MONTH as MonthOfBirth,BIRTH_YEAR as YearOfBirth,CUST_DOB as DateOfBirth ,CUST_TYPE_CODE as CustomerType,\n" +
            "CUST_LANGUAGE as Language,PHONE_CELL as CellPhone,(select ref_desc from tbaadm.rct where ref_code = a.city and del_flg = 'N' AND ref_rec_type = '01' and rownum < 2 )City,\n" +
            "city as CityCode,RelationshipOpeningDate,Status,Manager,MAIDENNAMEOFMOTHER as MotherMaidenName,UniqueId,UniqueIdType,StaffEmployeeId,\n" +
            "short_name, Blacklisted,Negated,Suspended,PreferredName,RecordStatus,NAME,DefaultAddressType,PreferredPhone,StartDate,\n" +
            "(select acct_crncy_code from tbaadm.gam where cif_id = a.orgkey and acct_cls_flg = 'N' and acct_crncy_code = 'NGN' and rownum < 2) CurrencyCode,PRIMARY_SOL_ID,\n" +
            "(select sol_desc from tbaadm.sol where sol_id = a.PRIMARY_SOL_ID) PrimaryBranch,(select cust_id from tbaadm.gam where cif_id = a.orgkey and acct_cls_flg = 'N' and rownum < 2) CustomerId,\n" +
            "Entity_Cre_Flag as EntityCreditFlag,IseBankingEnabled,IsSmsBankingEnabled,\n" +
            "SubSegment,IsWapBankingEnabled,AlreadyCreatedInEbanking,SmsBankingMobileNumber,AccessOwnerSegment,\n" +
            "AccessOwnerGroup,PreferredPhoneType,PreferredEmail,ADDRESS_LINE1 as AddressLine1, ADDRESS_LINE2 as AddressLine2,ADDRESS_LINE3 as AddressLine3,\n" +
            "(select ref_desc from tbaadm.rct where ref_code = a.state and del_flg = 'N' AND ref_rec_type = '02' )State,\n" +
            "State as StateCode,(select ref_desc from tbaadm.rct where ref_code = a.country and del_flg = 'N' AND ref_rec_type = '03' and rownum < 2)Country,\n" +
            "Country as CountryCode,Zip from crmuser.accounts a";
}
