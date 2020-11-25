package org.example.sjoerd.app.services;

import javax.inject.Qualifier;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target ({ElementType.TYPE,ElementType.FIELD,ElementType.PARAMETER})
@Retention (RetentionPolicy.RUNTIME)
@Qualifier
public @interface File {
}
