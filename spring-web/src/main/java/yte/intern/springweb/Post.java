package yte.intern.springweb;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Post {
    @Getter
    @Setter
    @NoArgsConstructor
    private class Comment
    {
        private int _postId;
        private int _id;
        private String _email;
        private String _body;
    }

    private int _userId;
    private int _id;
    private String _title;
    private String _body;
}
