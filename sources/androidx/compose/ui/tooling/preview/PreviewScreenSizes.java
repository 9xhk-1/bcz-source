package androidx.compose.ui.tooling.preview;

import androidx.compose.ui.tooling.preview.Preview;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import zz.c;
import zz.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@Preview.Container({@Preview(device = Devices.PHONE, name = "Phone", showSystemUi = true), @Preview(device = "spec:width=411dp,height=891dp,orientation=landscape,dpi=420", name = "Phone - Landscape", showSystemUi = true), @Preview(device = Devices.FOLDABLE, name = "Unfolded Foldable", showSystemUi = true), @Preview(device = Devices.TABLET, name = "Tablet", showSystemUi = true), @Preview(device = Devices.DESKTOP, name = "Desktop", showSystemUi = true)})
@c(AnnotationRetention.BINARY)
@d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes2.dex */
public @interface PreviewScreenSizes {
}
