package com.example.lab03;

public class TextNote extends com.example.lab03.Note {
    private String textContent;

    public TextNote(String title, String createdDate) {
        super();
    }

    public String getTextContent(){
        return textContent;
    }

    public void setTextContent(String content){
        if (!content.isEmpty()){
            this.textContent = content;
        }
    }

    @Override
    public void display() {
        System.out.println(title+":"+content+"("+createdDate+")");
    }


}
