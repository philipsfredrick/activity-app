package com.tamingthymeleaf.app.service;

import com.tamingthymeleaf.app.entity.Team;

import java.util.List;

public interface TeamService {

    List<Team> getTeams();
    List<Team> getTeamInfo(String teamId);
}
