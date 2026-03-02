package br.com.fiap.engenhariagame.domain;

public class Player {

    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
        this.score = 0;

    }

    public void addScore(int points) {
        if (points > 0){
            this.score +=points;
        }
    }

    public int getScore() {
            return score;
    }

}
