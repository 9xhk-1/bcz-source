package h40;

import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class t0<T> extends c40.a<T> implements l00.c {

    /* renamed from: d, reason: collision with root package name */
    @w00.g
    @m80.k
    public final j00.c<T> f58273d;

    /* JADX WARN: Multi-variable type inference failed */
    public t0(@m80.k kotlin.coroutines.d dVar, @m80.k j00.c<? super T> cVar) {
        super(dVar, true, true);
        this.f58273d = cVar;
    }

    @Override // c40.a
    public void Z1(@m80.l Object obj) {
        j00.c<T> cVar = this.f58273d;
        cVar.resumeWith(c40.e0.a(obj, cVar));
    }

    @Override // c40.r2
    public void e0(@m80.l Object obj) {
        m.d(IntrinsicsKt__IntrinsicsJvmKt.e(this.f58273d), c40.e0.a(obj, this.f58273d));
    }

    @Override // l00.c
    @m80.l
    public final l00.c getCallerFrame() {
        j00.c<T> cVar = this.f58273d;
        if (cVar instanceof l00.c) {
            return (l00.c) cVar;
        }
        return null;
    }

    @Override // l00.c
    @m80.l
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // c40.r2
    public final boolean q1() {
        return true;
    }

    public void e2() {
    }
}
