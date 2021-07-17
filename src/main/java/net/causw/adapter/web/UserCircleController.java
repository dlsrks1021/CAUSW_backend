package net.causw.adapter.web;

import net.causw.application.UserCircleService;
import net.causw.application.dto.UserCircleDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1/userCircle")
public class UserCircleController {
    private final UserCircleService userCircleService;

    public UserCircleController( UserCircleService userCircleService ){
        this.userCircleService = userCircleService;
    }

    @GetMapping(value = "/{id}")
    @ResponseStatus(value = HttpStatus.OK)
    public UserCircleDto findById(@PathVariable String id) { return this.userCircleService.findById(id); }

}
