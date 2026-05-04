package org.junit.jupiter.api;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@API(since = "5.9", status = API.Status.STABLE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes9.dex */
public @interface w2 {
    public static final int Q = 1073741823;

    int value();
}
