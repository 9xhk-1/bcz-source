package androidx.compose.ui.text.font;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
@u0({"SMAP\nDeviceFontFamilyNameFont.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceFontFamilyNameFont.android.kt\nandroidx/compose/ui/text/font/DeviceFontFamilyName\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,134:1\n114#2,8:135\n*S KotlinDebug\n*F\n+ 1 DeviceFontFamilyNameFont.android.kt\nandroidx/compose/ui/text/font/DeviceFontFamilyName\n*L\n78#1:135,8\n*E\n"})
/* loaded from: classes2.dex */
public final class DeviceFontFamilyName {

    @k
    private final String name;

    private /* synthetic */ DeviceFontFamilyName(String str) {
        this.name = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DeviceFontFamilyName m4633boximpl(String str) {
        return new DeviceFontFamilyName(str);
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m4634constructorimpl(@k String str) {
        if (!(str.length() > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("name may not be empty");
        }
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4635equalsimpl(String str, Object obj) {
        return (obj instanceof DeviceFontFamilyName) && g0.g(str, ((DeviceFontFamilyName) obj).m4639unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4636equalsimpl0(String str, String str2) {
        return g0.g(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4637hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4638toStringimpl(String str) {
        return "DeviceFontFamilyName(name=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m4635equalsimpl(this.name, obj);
    }

    @k
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return m4637hashCodeimpl(this.name);
    }

    public String toString() {
        return m4638toStringimpl(this.name);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m4639unboximpl() {
        return this.name;
    }
}
