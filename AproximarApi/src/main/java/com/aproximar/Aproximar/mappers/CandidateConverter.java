package com.aproximar.Aproximar.mappers;


import com.aproximar.Aproximar.domain.Candidate;
import com.aproximar.Aproximar.dto.CandidateDTO;
import org.springframework.stereotype.Component;

@Component
public class CandidateConverter implements CandidateMapper{


    @Override
    public Candidate DTOToModel(CandidateDTO candidateDTO) {

        Candidate candidate = new Candidate();
        candidate.setSobre(candidateDTO.getSobre());
        candidate.setEmail(candidateDTO.getEmail());
        candidate.setNome(candidateDTO.getNome());
        candidate.setSenha(candidateDTO.getSenha());
        candidate.setPontuacao(candidateDTO.getPontuacao());

        return candidate;


    }

    @Override
    public CandidateDTO modelToDTO(Candidate candidate) {

        CandidateDTO candidateDTO = new CandidateDTO();
        candidateDTO.setSobre(candidate.getSobre());
        candidateDTO.setEmail(candidate.getEmail());
        candidateDTO.setNome(candidate.getNome());
        candidateDTO.setSenha(candidate.getSenha());
        candidateDTO.setPontuacao(candidate.getPontuacao());

        return candidateDTO;

    }
}
