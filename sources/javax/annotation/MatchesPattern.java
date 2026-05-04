package javax.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.regex.Pattern;
import javax.annotation.meta.TypeQualifier;
import javax.annotation.meta.TypeQualifierValidator;
import javax.annotation.meta.When;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@TypeQualifier(applicableTo = String.class)
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes8.dex */
public @interface MatchesPattern {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Checker implements TypeQualifierValidator<MatchesPattern> {
        @Override // javax.annotation.meta.TypeQualifierValidator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public When a(MatchesPattern matchesPattern, Object obj) {
            return Pattern.compile(matchesPattern.value(), matchesPattern.flags()).matcher((String) obj).matches() ? When.ALWAYS : When.NEVER;
        }
    }

    int flags() default 0;

    @RegEx
    String value();
}
