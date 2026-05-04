package a00;

import java.util.Iterator;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class k0 extends j0 {
    public static final <T> void i0(@m80.k Iterator<? extends T> it, @m80.k x00.l<? super T, g2> operation) {
        kotlin.jvm.internal.g0.p(it, "<this>");
        kotlin.jvm.internal.g0.p(operation, "operation");
        while (it.hasNext()) {
            operation.invoke(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o00.f
    public static final <T> Iterator<T> j0(Iterator<? extends T> it) {
        kotlin.jvm.internal.g0.p(it, "<this>");
        return it;
    }

    @m80.k
    public static final <T> Iterator<a1<T>> k0(@m80.k Iterator<? extends T> it) {
        kotlin.jvm.internal.g0.p(it, "<this>");
        return new c1(it);
    }
}
