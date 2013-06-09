package com.drjun.board.model;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: dr.jun
 * Date: 13. 6. 7.
 * Time: 오후 5:50
 * To change this template use File | Settings | File Templates.
 */
public class Board {

    public Board(){
        if(id == 0){
            Random oRandom = new Random();
            int index = oRandom.nextInt(10000000) + 1;
            this.id = index;
        }
    }

    public Board(int id, String title, String writer, String pw, String content) {

        if(id == 0){
            Random oRandom = new Random();
            int index = oRandom.nextInt(10000000) + 1;
            this.id = index;
        }else{
            this.id = id;
        }

        this.title = title;
        this.writer = writer;
        this.pw = pw;
        this.content = content;
    }

    private int id;
    private String title;
    private String writer;
    private String pw;
    private String content;

    public Board(String title, String writer, String pw, String Content) {

        Random oRandom = new Random();
        int index = oRandom.nextInt(10000000) + 1;

        setId(index);
        setTitle(title);
        setWriter(writer);
        setPw(pw);
        setContent(Content);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
