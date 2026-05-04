package androidx.constraintlayout.compose;

import androidx.annotation.IntRange;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes2.dex */
public final class Skip {

    @k
    private final String description;

    private /* synthetic */ Skip(String str) {
        this.description = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Skip m5565boximpl(String str) {
        return new Skip(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static String m5568constructorimpl(String str) {
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5569equalsimpl(String str, Object obj) {
        return (obj instanceof Skip) && g0.g(str, ((Skip) obj).m5573unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5570equalsimpl0(String str, String str2) {
        return g0.g(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5571hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5572toStringimpl(String str) {
        return "Skip(description=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m5569equalsimpl(this.description, obj);
    }

    @k
    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        return m5571hashCodeimpl(this.description);
    }

    public String toString() {
        return m5572toStringimpl(this.description);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m5573unboximpl() {
        return this.description;
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m5567constructorimpl(@IntRange(from = 0) int i11, @IntRange(from = 1) int i12, @IntRange(from = 1) int i13) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        sb2.append(':');
        sb2.append(i12);
        sb2.append('x');
        sb2.append(i13);
        return m5568constructorimpl(sb2.toString());
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m5566constructorimpl(@IntRange(from = 0) int i11, @IntRange(from = 1) int i12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        sb2.append(':');
        sb2.append(i12);
        return m5568constructorimpl(sb2.toString());
    }
}
