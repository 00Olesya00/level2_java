package lesson_1.participator;

import lesson_1.Interface.Participant;

public class Human implements Participant {
    private String nickname;
    private int jump_up;

    private int running;

    public Human(String nickname, int jump_up, int running) {
        this.jump_up = jump_up;
        this.nickname = nickname;
        this.running = running;

    }

    public int getJump_up() {
        return jump_up;
    }

    public void setJump_up(int jump_up) {
        this.jump_up = jump_up;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getRunning() {
        return running;
    }

    public void setRunning(int running) {
        this.running = running;
    }

    @Override
    public void run() {

    }

    @Override
    public void jump() {

    }
}
