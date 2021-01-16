package com.aproximar.Aproximar.repository;

import com.aproximar.Aproximar.domain.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface CandidateRepository extends JpaRepository<Candidate,Long> {

    Optional<Candidate> findCandidateByEmail(String email);

    List<Candidate> findCandidateBySoftSkillsIs(String softSkill);

}
