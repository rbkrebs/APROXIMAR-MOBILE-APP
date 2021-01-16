package com.aproximar.Aproximar.mappers;


import com.aproximar.Aproximar.domain.Candidate;
import com.aproximar.Aproximar.dto.CandidateDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CandidateMapper {

    CandidateMapper INSTANCE = Mappers.getMapper(CandidateMapper.class);

    @Mappings({
            @Mapping(source = "nome", target = "nome"),
            @Mapping(source = "sobre", target = "sobre"),
            @Mapping(source = "email", target = "email"),
            @Mapping(source = "senha", target = "senha")
    })

    Candidate DTOToModel(CandidateDTO candidateDTO);

    CandidateDTO modelToDTO(Candidate candidate);

}
