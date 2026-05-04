package c40;

import kotlin.DeprecationLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.c1(markerClass = {h2.class})
/* loaded from: classes8.dex */
public interface n<T> extends j00.c<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static /* synthetic */ boolean a(n nVar, Throwable th2, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i11 & 1) != 0) {
                th2 = null;
            }
            return nVar.a(th2);
        }

        public static /* synthetic */ Object b(n nVar, Object obj, Object obj2, int i11, Object obj3) {
            if (obj3 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryResume");
            }
            if ((i11 & 2) != 0) {
                obj2 = null;
            }
            return nVar.t(obj, obj2);
        }
    }

    <R extends T> void A(R r11, @m80.l x00.q<? super Throwable, ? super R, ? super kotlin.coroutines.d, yz.g2> qVar);

    @y1
    void B(@m80.k m0 m0Var, @m80.k Throwable th2);

    boolean a(@m80.l Throwable th2);

    boolean e();

    boolean isActive();

    boolean isCancelled();

    @y1
    void l(@m80.k m0 m0Var, T t11);

    @m80.l
    @g2
    <R extends T> Object n(R r11, @m80.l Object obj, @m80.l x00.q<? super Throwable, ? super R, ? super kotlin.coroutines.d, yz.g2> qVar);

    void p(@m80.k x00.l<? super Throwable, yz.g2> lVar);

    @g2
    void s(@m80.k Object obj);

    @m80.l
    @g2
    Object t(T t11, @m80.l Object obj);

    @m80.l
    @g2
    Object v(@m80.k Throwable th2);

    @yz.n(level = DeprecationLevel.WARNING, message = "Use the overload that also accepts the `value` and the coroutine context in lambda", replaceWith = @yz.w0(expression = "resume(value) { cause, _, _ -> onCancellation(cause) }", imports = {}))
    void x(T t11, @m80.l x00.l<? super Throwable, yz.g2> lVar);

    @g2
    void y();
}
