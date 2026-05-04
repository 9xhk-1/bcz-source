package androidx.compose.ui.tooling.preview;

import androidx.compose.ui.tooling.preview.Preview;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import sn.c;
import zz.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Preview.Container({@Preview(fontScale = 0.85f, name = "85%"), @Preview(fontScale = 1.0f, name = "100%"), @Preview(fontScale = 1.15f, name = "115%"), @Preview(fontScale = c.f88847a, name = "130%"), @Preview(fontScale = 1.5f, name = "150%"), @Preview(fontScale = 1.8f, name = "180%"), @Preview(fontScale = 2.0f, name = "200%")})
@zz.c(AnnotationRetention.BINARY)
@d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface PreviewFontScale {
}
