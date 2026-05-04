package androidx.compose.ui.tooling.preview;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes2.dex */
public @interface PreviewParameter {
    int limit() default Integer.MAX_VALUE;

    Class<? extends PreviewParameterProvider<?>> provider();
}
