package j50;

import java.util.ArrayList;
import kotlinx.serialization.MissingFieldException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h2 {
    @f50.h
    public static final void a(@m80.k int[] seenArray, @m80.k int[] goldenMaskArray, @m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(seenArray, "seenArray");
        kotlin.jvm.internal.g0.p(goldenMaskArray, "goldenMaskArray");
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int length = goldenMaskArray.length;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = goldenMaskArray[i11] & (~seenArray[i11]);
            if (i12 != 0) {
                for (int i13 = 0; i13 < 32; i13++) {
                    if ((i12 & 1) != 0) {
                        arrayList.add(descriptor.i((i11 * 32) + i13));
                    }
                    i12 >>>= 1;
                }
            }
        }
        throw new MissingFieldException(arrayList, descriptor.k());
    }

    @f50.h
    public static final void b(int i11, int i12, @m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i13 = (~i11) & i12;
        for (int i14 = 0; i14 < 32; i14++) {
            if ((i13 & 1) != 0) {
                arrayList.add(descriptor.i(i14));
            }
            i13 >>>= 1;
        }
        throw new MissingFieldException(arrayList, descriptor.k());
    }
}
