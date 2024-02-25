package yte.intern.springweb;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

public class User {

    @NotBlank(message = "Invalid")
    public String name;
    @NotBlank(message = "Invalid")
    public String surname;
    @NotBlank(message = "Invalid")
    @Email
    public String mail;
    @PastOrPresent
    @JsonFormat(pattern = "dd/MM/yyyy")
    public LocalDate bday;
    @Size(min = 0, max = 250)
    public String address;
    @NotBlank(message = "Invalid")
    @username
    public String username;
    @Min(12)
    @Max(100)
    public long age;

}
