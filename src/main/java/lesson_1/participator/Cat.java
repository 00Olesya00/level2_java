package lesson_1.participator;

import lesson_1.Interface.Participant;

public class Cat implements Participant {
    private String nickname;
    private int jump_up;
    private int running;


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getJump_up() {
        return jump_up;
    }

    public void setJump_up(int jump_up) {
        this.jump_up = jump_up;
    }

    public int getRunning() {
        return running;
    }

    public void setRunning(int running) {
        this.running = running;
    }

    public Cat(String nickname, int jump_up, int running) {
        this.jump_up = jump_up;
        this.nickname = nickname;
        this.running = running;


    }

    @Override
    public void jump() {

    }

    @Override
    public void run() {

    }
}



