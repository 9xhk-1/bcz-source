package kotlinx.coroutines.flow.internal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class x<T> implements j00.c<T>, l00.c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final j00.c<T> f68289a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f68290b;

    /* JADX WARN: Multi-variable type inference failed */
    public x(@m80.k j00.c<? super T> cVar, @m80.k kotlin.coroutines.d dVar) {
        this.f68289a = cVar;
        this.f68290b = dVar;
    }

    @Override // l00.c
    @m80.l
    public l00.c getCallerFrame() {
        j00.c<T> cVar = this.f68289a;
        if (cVar instanceof l00.c) {
            return (l00.c) cVar;
        }
        return null;
    }

    @Override // j00.c
    @m80.k
    public kotlin.coroutines.d getContext() {
        return this.f68290b;
    }

    @Override // l00.c
    @m80.l
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // j00.c
    public void resumeWith(@m80.k Object obj) {
        this.f68289a.resumeWith(obj);
    }
}
