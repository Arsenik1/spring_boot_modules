package yte.intern.springweb;

import jakarta.validation.Constraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Constraint(validatedBy = usernameValidator.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface username
{
    String message() default "Sorry, passwords does not match";
}

