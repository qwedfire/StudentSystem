/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package 練習學生管理;

/**
 *
 * @author LAND
 */
public class Student {

    private static int SERIAL_NUMBER = 1;
    private int ID;
    private String classroom;
    private String name;
    private int score;

    public Student() {
        setID();
        setclassroom();
        setname();
        setscore();
    }

    public void setID() {
        this.ID = SERIAL_NUMBER;
        SERIAL_NUMBER++;
    }

    public int getID() {
        return this.ID;
    }

    public void setclassroom() {
        String randomclass = "";
        randomclass += (char) (Math.random() * (100 - 97 + 1) + 97);
        this.classroom = randomclass;
    }

    public String getclassroom() {
        return this.classroom;
    }

    public void setname() {
        String randomname = "";
        for (int i = 0; i < 3; i++) {
            randomname += (char) (Math.random() * (122 - 97 + 1) + 97);
        }
        this.name = randomname;
    }

    public String getname() {
        return this.name;
    }

    public void setscore() {
        int randomscore = (int) (Math.random() * 100 + 1);
        this.score = randomscore;
    }

    public void settscore(int score) {
        this.score = score;
    }

    public int getscore() {
        return this.score;
    }

    public String toString() {
        return "班級:" + this.classroom + " 座號:" + this.ID + " 姓名:" + this.name + " 分數:" + this.score;
    }
}
