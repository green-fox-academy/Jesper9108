package com.restexample.demo.Models;

public class Camelizer {

    private String text;
    private String lang;

    public Camelizer() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String camelLangTransform(String inputText) {
        String camelizedText = "";
        for (int i = 0; i < inputText.length(); i++) {
            if (Character.toString(inputText.charAt(i)).matches("[aáoóuúeéiíöőüűAÁOÓUÚEÉIÍÖŐÜŰ]")) {
                camelizedText += inputText.charAt(i) + "v" + Character.toString(inputText.charAt(i)).toLowerCase();
            } else{
                camelizedText += inputText.charAt(i);
            }
        }
        return camelizedText;
    }

}
