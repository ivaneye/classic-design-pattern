package com.ivaneye.memento;

/**
 * 帖子Model(Memento)
 *
 * @author ivaneye
 * @since 2021-02-10 11:35:18
 */
public class Post {

    // 帖子标题
    private String title;
    // 帖子内容
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
