package yte.intern.springweb;

import lombok.Getter;
import lombok.Setter;

public record Comment(long _postId, long _id, String _name, String _email, String _body) {
}
