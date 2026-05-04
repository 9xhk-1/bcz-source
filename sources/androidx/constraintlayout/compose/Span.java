package androidx.constraintlayout.compose;

import androidx.annotation.IntRange;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
public final class Span {

    @k
    private final String description;

    private /* synthetic */ Span(String str) {
        this.description = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Span m5574boximpl(String str) {
        return new Span(str);
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m5577constructorimpl(@k String str) {
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5578equalsimpl(String str, Object obj) {
        return (obj instanceof Span) && g0.g(str, ((Span) obj).m5582unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5579equalsimpl0(String str, String str2) {
        return g0.g(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5580hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5581toStringimpl(String str) {
        return "Span(description=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m5578equalsimpl(this.description, obj);
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        return m5580hashCodeimpl(this.description);
    }

    public String toString() {
        return m5581toStringimpl(this.description);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m5582unboximpl() {
        return this.description;
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m5576constructorimpl(@IntRange(from = 0) int i11, @IntRange(from = 1) int i12, @IntRange(from = 1) int i13) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        sb2.append(':');
        sb2.append(i12);
        sb2.append('x');
        sb2.append(i13);
        return m5577constructorimpl(sb2.toString());
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m5575constructorimpl(@IntRange(from = 0) int i11, @IntRange(from = 1) int i12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        sb2.append(':');
        sb2.append(i12);
        return m5577constructorimpl(sb2.toString());
    }
}
