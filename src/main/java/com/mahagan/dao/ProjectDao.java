package com.mahagan.dao;

import com.mahagan.domain.Project;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class ProjectDao {
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public ProjectDao(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }
    private final String SQL_FOR_PROJECT="INSERT INTO PROJECT VALUES(:projectNo,:title,:decription,:duration,:status )";
    public int insertProjects(Project project){
        MapSqlParameterSource parameterSource=new MapSqlParameterSource();
        parameterSource.addValue("projectNo",project.getProjectNo());
        parameterSource.addValue("title",project.getTitle());
        parameterSource.addValue("decription",project.getDecription());
        parameterSource.addValue("duration",project.getDuration());
        parameterSource.addValue("status",project.getStatus());

        int rowCount=namedParameterJdbcTemplate.update(SQL_FOR_PROJECT,parameterSource);
        return rowCount;
    }
}
