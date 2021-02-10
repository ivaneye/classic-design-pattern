package com.ivaneye.memento;

/**
 * 帖子参数(Originator)
 *
 * @author ivaneye
 * @since 2021-02-10 11:35:18
 */
public class PostParam {

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

    public Post getPost() {
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        return post;
    }

    public PostParam restore(Post post) {
        this.title = post.getTitle();
        this.content = post.getContent();
        return this;
    }

    @Override
    public String toString() {
        return "PostParam{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
