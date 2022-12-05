package com.tamingthymeleaf.app.controller;

import com.tamingthymeleaf.app.entity.Team;
import com.tamingthymeleaf.app.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/teams")
@RequiredArgsConstructor
public class TeamController {
//    private final TeamService teamService;

    @GetMapping()
    public String index(Model model) {
//        List<Team> teams = teamService.getTeams();
//        model.addAttribute("teams", teams);
        return "teams/list";
    }

//    @GetMapping("/{id}")
//    public String teamInfo(@PathVariable("id") String teamId, Model model) {
//        model.addAttribute("teamInfo", teamService.getTeamInfo(teamId));
//        return "teams/info";
//    }
//
//    @GetMapping("/{teamId}/players/{playerId}")
//    public String playerOnTeamInfo(@PathVariable("teamId") String teamId,
//                                   @PathVariable("playerId") String playerId, Model model) {
//        model.addAttribute("player", teamService.getPlayerOnTeam(teamId, playerId));
//        return "teams/info";
//    }
//
//    @PostMapping("/edit/{id}")
//    public String editTeamName(@PathVariable("id") String teamId, @ModelAttribute("editTeamFormData") editTeamFormDataformdata) {
//        teamService.changeTeamName(teamId, formData.getTeamName());
//        return "redirect:/teams/all";
//    }
}
