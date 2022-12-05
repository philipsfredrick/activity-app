package com.tamingthymeleaf.app.service.impl;

import com.tamingthymeleaf.app.entity.Team;
import com.tamingthymeleaf.app.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamServiceImpl implements TeamService {


    @Override
    public List<Team> getTeams() {
        List<Team> teams = new ArrayList<>();
        teams.add(new Team(1, "Initiates"));
        teams.add(new Team(2, "Knights"));
        teams.add(new Team(3, "Padawns"));
        teams.add(new Team(4, "Rookies"));
        teams.add(new Team(5, "Wizards"));
        return teams;
    }

    @Override
    public List<Team> getTeamInfo(String teamId) {
        List<Team> info = new ArrayList<>();;
        return null;
    }
}
