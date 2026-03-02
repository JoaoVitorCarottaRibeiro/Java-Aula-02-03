package br.com.fiap.engenhariagame.service;

import br.com.fiap.engenhariagame.domain.Player;

public class ScoreService {

    public void addScore(Player player, int points) {
        player.addScore(points);
    }
}
