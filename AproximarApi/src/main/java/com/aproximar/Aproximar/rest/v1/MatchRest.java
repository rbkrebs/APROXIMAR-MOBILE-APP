package com.aproximar.Aproximar.rest.v1;


import com.aproximar.Aproximar.controller.CandidateController;
import com.aproximar.Aproximar.domain.Match;
import com.aproximar.Aproximar.dto.CandidateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/match")
@CrossOrigin(origins = "*")
public class MatchRest {


    @Autowired
    private CandidateController candidateController;

    @PostMapping("{email}")
    public CandidateDTO salvarMatch(@Validated @RequestBody Match match,
                             @Validated @PathVariable String email ){

        return candidateController.salvarMatch(match, email);

    }

    @GetMapping("/{softskill}")
    public List<CandidateDTO> buscarCandidatePorEmail(@Validated @PathVariable String softSkill){

        return candidateController.buscarCandidatePorSkill(softSkill);

    }

}
