package com.xfz.ppmtool.repositories;

import com.xfz.ppmtool.domain.ProjectTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {

    List<ProjectTask> findByProjectIdentifierOrderByPriority(String id);

    ProjectTask findByProjectSequence(String sequence);
}
