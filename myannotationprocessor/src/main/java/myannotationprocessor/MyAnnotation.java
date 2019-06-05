package myannotationprocessor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 杨博 (Yang Bo)
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface MyAnnotation {
}
