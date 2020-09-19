package com.habuma.spitter.mvc.rest;

import com.habuma.spitter.domain.Spitter;
import com.habuma.spitter.domain.Spittle;
import com.habuma.spitter.service.SpitterService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

//@Controller
@RequestMapping("/spitters")
public class SpittersController {
    private SpitterService spitterService;

    @Inject
    public SpittersController(SpitterService spitterService) {
        this.spitterService = spitterService;
    }

    @RequestMapping(value = "/{spitterName}/spittles",
            method = RequestMethod.GET)
    public @ResponseBody
    List<Spittle> spittlesForSpitter(
            @PathVariable("spitterName") String spitterName) {
        Spitter spitter = spitterService.getSpitter(spitterName);
        return spitterService.getSpittlesForSpitter(spitter);
    }
}
