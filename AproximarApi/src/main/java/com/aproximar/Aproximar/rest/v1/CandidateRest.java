package com.aproximar.Aproximar.rest.v1;


import com.aproximar.Aproximar.controller.CandidateController;
import com.aproximar.Aproximar.dto.CandidateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/candidate")
@CrossOrigin(origins = "*")
public class CandidateRest {


    @Autowired
    private CandidateController candidateController;

    @GetMapping("/candidates")
    public List<CandidateDTO> buscarTodos(){

        return candidateController.buscarTodos();

    }


    @PostMapping("")
    public CandidateDTO salvarCandidate(@Validated @RequestBody CandidateDTO candidateDTO){

        return candidateController.salvar(candidateDTO);

    }

    @GetMapping("/{email}")
    public CandidateDTO buscarCandidatePorEmail(@Validated @PathVariable String email){

        return candidateController.buscarCandidatePorEmail(email);

    }
}
