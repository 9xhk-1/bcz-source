package yz;

import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j00.f
@y0(version = "1.7")
@j2(markerClass = {kotlin.c.class})
/* loaded from: classes8.dex */
public abstract class l<T, R> {
    public /* synthetic */ l(kotlin.jvm.internal.v vVar) {
        this();
    }

    @m80.l
    public abstract Object b(T t11, @m80.k j00.c<? super R> cVar);

    @m80.l
    public abstract <U, S> Object c(@m80.k k<U, S> kVar, U u11, @m80.k j00.c<? super S> cVar);

    @n(level = DeprecationLevel.ERROR, message = "'invoke' should not be called from DeepRecursiveScope. Use 'callRecursive' to do recursion in the heap instead of the call stack.", replaceWith = @w0(expression = "this.callRecursive(value)", imports = {}))
    @m80.k
    public final Void d(@m80.k k<?, ?> kVar, @m80.l Object obj) {
        kotlin.jvm.internal.g0.p(kVar, "<this>");
        throw new UnsupportedOperationException("Should not be called from DeepRecursiveScope");
    }

    public l() {
    }
}
