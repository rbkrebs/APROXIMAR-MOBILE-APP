package com.aproximar.Aproximar.service;

import com.aproximar.Aproximar.domain.Candidate;
import com.aproximar.Aproximar.domain.SoftSkill;
import com.aproximar.Aproximar.dto.CandidateDTO;
import com.aproximar.Aproximar.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CandidateServImpl implements EntidadeService<Candidate> {

    @Autowired
    private CandidateRepository candidateRepository;

    @Override
    public Candidate salvar(Candidate candidate) {
        return candidateRepository.save(candidate);
    }

    @Override
    public List<Candidate> buscarTodos() {

        return candidateRepository.findAll();

    }

    @Override
    public Candidate buscarPorEmail(String email) {

        return candidateRepository.findCandidateByEmail(email).get();

    }

    @Override
    public List<Candidate> buscarCandidatePorSkill(String softSkill) {

        return candidateRepository.findCandidateBySoftSkillsIs(softSkill);
    }


}
