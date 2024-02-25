package yte.intern.springweb;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public record Post(Long userId, Long id, String title, String body) {

}
