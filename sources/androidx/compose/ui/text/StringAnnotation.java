package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
public final class StringAnnotation implements AnnotatedString.Annotation {

    @k
    private final String value;

    private /* synthetic */ StringAnnotation(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StringAnnotation m4507boximpl(String str) {
        return new StringAnnotation(str);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4509equalsimpl(String str, Object obj) {
        return (obj instanceof StringAnnotation) && g0.g(str, ((StringAnnotation) obj).m4513unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4510equalsimpl0(String str, String str2) {
        return g0.g(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4511hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4512toStringimpl(String str) {
        return "StringAnnotation(value=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m4509equalsimpl(this.value, obj);
    }

    @k
    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m4511hashCodeimpl(this.value);
    }

    public String toString() {
        return m4512toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m4513unboximpl() {
        return this.value;
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m4508constructorimpl(@k String str) {
        return str;
    }
}
