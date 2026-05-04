package androidx.room.concurrent;

import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class AtomicsKt {
    @k
    public static final Void loop(@k AtomicInteger atomicInteger, @k l<? super Integer, g2> action) {
        g0.p(atomicInteger, "<this>");
        g0.p(action, "action");
        while (true) {
            action.invoke(Integer.valueOf(atomicInteger.get()));
        }
    }
}
