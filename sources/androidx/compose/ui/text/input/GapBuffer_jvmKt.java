package androidx.compose.ui.text.input;

import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class GapBuffer_jvmKt {
    public static final void toCharArray(@k String str, @k char[] cArr, int i11, int i12, int i13) {
        g0.n(str, "null cannot be cast to non-null type java.lang.String");
        str.getChars(i12, i13, cArr, i11);
    }
}
