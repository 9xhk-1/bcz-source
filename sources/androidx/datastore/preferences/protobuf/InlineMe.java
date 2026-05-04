package androidx.datastore.preferences.protobuf;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Documented
/* loaded from: classes2.dex */
@interface InlineMe {
    String[] imports() default {};

    String replacement();

    String[] staticImports() default {};
}
