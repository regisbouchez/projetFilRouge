package com.dojo.stage.exposition;

import com.dojo.stage.application.OutputService;
import com.dojo.stage.domain.OutputFile;
import com.dojo.stage.infrastructure.OutputFileJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class OutputResource {

    @Autowired
    private OutputService outputService;

    @RequestMapping(method = RequestMethod.GET, path = {"/outputs/"})
    public List<OutputFile> listAllOutputs() {
        return this.outputService.listAll(); }

    @RequestMapping(method = RequestMethod.POST, path = {"/outputs"})
    @ResponseStatus(HttpStatus.CREATED)
    public Long createOutput(@Valid @RequestBody OutputFileDTO outputFileDTO) {
        return this.outputService.create(OutputAdapter.transformToOutputFile(outputFileDTO));
    }
}
