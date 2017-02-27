package com.rivc.superrecyclerview.bean;

/**
 * Created by Riven on 2017/2/27.
 * Email: 1819485687@qq.com
 */
public class Person {

    private String name;
    private String iconUrl;
    private String backgroundUrl;

    public Person(String name, String iconUrl, String backgroundUrl) {
        this.name = name;
        this.iconUrl = iconUrl;
        this.backgroundUrl = backgroundUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getBackgroundUrl() {
        return backgroundUrl;
    }

    public void setBackgroundUrl(String backgroundUrl) {
        this.backgroundUrl = backgroundUrl;
    }
}
