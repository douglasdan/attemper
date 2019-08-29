package com.github.attemper.core.dao.application;

import com.github.attemper.common.base.BaseMapper;
import com.github.attemper.common.result.app.project.Project;
import com.github.attemper.common.result.app.project.ProjectInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface ProjectMapper extends BaseMapper<Project> {

    List<Project> getAll(Map<String, Object> paramMap);

    void saveInfo(Map<String, Object> paramMap);

    List<ProjectInfo> listInfo(Map<String, Object> paramMap);

    void deleteInfo(Map<String, Object> paramMap);

    List<String> listExecutor(Map<String, Object> paramMap);

    void deleteExecutors(Map<String, Object> paramMap);

    void addExecutors(Map<String, Object> paramMap);
}