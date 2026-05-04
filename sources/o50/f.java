package o50;

import a00.h0;
import f50.b0;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.l;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class f {
    public /* synthetic */ f(v vVar) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f50.i d(f fVar, h10.d dVar, List list, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContextual");
        }
        if ((i11 & 2) != 0) {
            list = h0.J();
        }
        return fVar.c(dVar, list);
    }

    @f50.f
    public abstract void a(@m80.k j jVar);

    @f50.f
    @n(level = DeprecationLevel.HIDDEN, message = "Deprecated in favor of overload with default parameter", replaceWith = @w0(expression = "getContextual(kclass)", imports = {}))
    public final /* synthetic */ f50.i b(h10.d kclass) {
        g0.p(kclass, "kclass");
        return c(kclass, h0.J());
    }

    @l
    @f50.f
    public abstract <T> f50.i<T> c(@m80.k h10.d<T> dVar, @m80.k List<? extends f50.i<?>> list);

    public abstract boolean e();

    @l
    @f50.f
    public abstract <T> f50.e<T> g(@m80.k h10.d<? super T> dVar, @l String str);

    @l
    @f50.f
    public abstract <T> b0<T> h(@m80.k h10.d<? super T> dVar, @m80.k T t11);

    public f() {
    }

    @f50.h
    public static /* synthetic */ void f() {
    }
}
