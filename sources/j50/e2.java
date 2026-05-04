package j50;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface e2<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object b(e2 e2Var, h10.d dVar, List list, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get-gIAlu-s");
        }
        if ((i11 & 2) != 0) {
            list = a00.h0.J();
        }
        return e2Var.a(dVar, list);
    }

    @m80.k
    Object a(@m80.k h10.d<Object> dVar, @m80.k List<? extends h10.r> list);
}
