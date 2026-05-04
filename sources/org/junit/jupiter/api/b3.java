package org.junit.jupiter.api;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD})
@API(since = "5.0", status = API.Status.STABLE)
@l3
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface b3 {
    public static final String R = "{displayName}";
    public static final String S = "{currentRepetition}";
    public static final String T = "{totalRepetitions}";
    public static final String U = "repetition {currentRepetition} of {totalRepetitions}";
    public static final String V = "{displayName} :: repetition {currentRepetition} of {totalRepetitions}";

    @API(since = "5.10", status = API.Status.EXPERIMENTAL)
    int failureThreshold() default Integer.MAX_VALUE;

    String name() default "repetition {currentRepetition} of {totalRepetitions}";

    int value();
}
