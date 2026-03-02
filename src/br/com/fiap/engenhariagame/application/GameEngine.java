package br.com.fiap.engenhariagame.application;

import br.com.fiap.engenhariagame.domain.Mission;
import br.com.fiap.engenhariagame.domain.Player;
import br.com.fiap.engenhariagame.service.BasicMissionValidatorService;
import br.com.fiap.engenhariagame.service.MissionValidatorService;

public class GameEngine {

    private BasicMissionValidatorService validator;

    private MissionValidatorService missionValidatorService;

    public GameEngine(MissionValidatorService service) {
        this.validator = new BasicMissionValidatorService();

        this.missionValidatorService = service;
    }

    public boolean executeMission(Player player, Mission mission) {
        boolean success = validator.validate(mission);

        if (success) {
            player.addScore(mission.getDifficulty() * 10);
        } else {
            player.addScore(-5);
        }

        return success;
    }
}