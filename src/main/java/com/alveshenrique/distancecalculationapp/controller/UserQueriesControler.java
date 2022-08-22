package com.alveshenrique.distancecalculationapp.controller;

import com.alveshenrique.distancecalculationapp.entity.UserQuery;
import com.alveshenrique.distancecalculationapp.exception.ResourceNotFoundException;
import com.alveshenrique.distancecalculationapp.repository.UserQueriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/userQueries")
public class UserQueriesControler {

    @Autowired
    private UserQueriesRepository userQueriesRepository;

    // get user queries
    @GetMapping
    public List<UserQuery> getAllUserQueries() {
        return this.userQueriesRepository.findAll();
    }

    // get user query by id
    @CrossOrigin(origins = "https://distance-queries-2fa7c.web.app/")
    @GetMapping("/{id}")
    public UserQuery getByUserQueryId(@PathVariable (value = "id") long userQueryId) {
        return this.userQueriesRepository.findById(userQueryId)
                .orElseThrow(() -> new ResourceNotFoundException("User query not found")
        );
    }

    // create user query
    @CrossOrigin(origins = "https://distance-queries-2fa7c.web.app/")
    @PostMapping
    public UserQuery createUserQuery(@RequestBody UserQuery userQuery) {
        return this.userQueriesRepository.save(userQuery);
    }
    // update user query (not needed)

    // delete user query (not implemented)
}
