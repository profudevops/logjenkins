package mx.com.profutruro.logjenkins.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import mx.com.profutruro.logjenkins.model.GitFlow;
import mx.com.profutruro.logjenkins.repository.GitFlowRespository;

@RestController
public class GitFlowController {

    private GitFlowRespository gitFlow;

    @Autowired
    public GitFlowController(GitFlowRespository gitFlow) {
        this.gitFlow = gitFlow;
    }

    @GetMapping("/gitflow/all")
    Iterable<GitFlow> all() {
        return gitFlow.findAll();
    }

    @GetMapping("/gitflow/{id}")
    GitFlow userById(@PathVariable Long id) {
        return gitFlow.findById(id).orElseThrow(() -> new ResponseStatusException(
                HttpStatus.NOT_FOUND));
    }

    @PostMapping("/gitflow/save")
	GitFlow save(@RequestBody GitFlow user) {
        return gitFlow.save(user);
    }

}
