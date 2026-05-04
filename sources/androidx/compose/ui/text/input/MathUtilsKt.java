package androidx.compose.ui.text.input;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i11, int i12, @k x00.a<Integer> aVar) {
        int i13 = i11 + i12;
        return ((i11 ^ i13) & (i12 ^ i13)) < 0 ? aVar.invoke().intValue() : i13;
    }

    public static final int subtractExactOrElse(int i11, int i12, @k x00.a<Integer> aVar) {
        int i13 = i11 - i12;
        return ((i11 ^ i13) & (i12 ^ i11)) < 0 ? aVar.invoke().intValue() : i13;
    }
}
