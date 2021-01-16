package com.aproximar.Aproximar.controller;


import com.aproximar.Aproximar.domain.Candidate;
import com.aproximar.Aproximar.dto.CandidateDTO;
import com.aproximar.Aproximar.mappers.CandidateConverter;
import com.aproximar.Aproximar.service.CandidateServImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CandidateController {

    @Autowired
    private CandidateServImpl candidateServ;

    @Autowired
    private CandidateConverter candidateConverter;

    public CandidateDTO salvar(CandidateDTO candidateDTO){
        return candidateConverter.modelToDTO(
                candidateServ.
                        salvar(candidateConverter
                                .DTOToModel(
                                        candidateDTO))
        );
    }

    public CandidateDTO buscarCandidatePorEmail(String email){

        return candidateConverter.modelToDTO(
                candidateServ.
                        buscarPorEmail(email)
        );
    }

    public List<CandidateDTO> buscarTodos(){

        List<CandidateDTO> listCandidateDTO = new ArrayList<>();
        candidateServ.buscarTodos().forEach(candidate -> listCandidateDTO.add(
                candidateConverter.modelToDTO(candidate))
        );

        return listCandidateDTO;
    }



}
