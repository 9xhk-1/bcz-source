package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class StringAnnotationKt {
    @k
    public static final AnnotatedString.Range<String> unbox(@k AnnotatedString.Range<? extends AnnotatedString.Annotation> range) {
        AnnotatedString.Annotation item = range.getItem();
        g0.n(item, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
        return new AnnotatedString.Range<>(((StringAnnotation) item).m4513unboximpl(), range.getStart(), range.getEnd(), range.getTag());
    }
}
