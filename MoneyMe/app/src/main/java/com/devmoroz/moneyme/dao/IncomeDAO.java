package com.devmoroz.moneyme.dao;

import com.devmoroz.moneyme.models.Income;
import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

public class IncomeDAO extends BaseDaoImpl<Income, Integer> {

    public IncomeDAO(ConnectionSource connectionSource,
                   Class<Income> dataClass) throws SQLException {
        super(connectionSource, dataClass);
    }
}