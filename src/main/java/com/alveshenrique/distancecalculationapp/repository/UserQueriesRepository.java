package com.alveshenrique.distancecalculationapp.repository;

import com.alveshenrique.distancecalculationapp.entity.UserQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserQueriesRepository extends JpaRepository<UserQuery, Long> {
}
