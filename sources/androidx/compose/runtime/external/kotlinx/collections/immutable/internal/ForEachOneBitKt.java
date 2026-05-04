package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ForEachOneBitKt {
    public static final void forEachOneBit(int i11, @k p<? super Integer, ? super Integer, g2> pVar) {
        int i12 = 0;
        while (i11 != 0) {
            int lowestOneBit = Integer.lowestOneBit(i11);
            pVar.invoke(Integer.valueOf(lowestOneBit), Integer.valueOf(i12));
            i12++;
            i11 ^= lowestOneBit;
        }
    }
}
