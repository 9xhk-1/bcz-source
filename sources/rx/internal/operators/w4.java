package rx.internal.operators;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class w4<T, R> implements wb0.p<T, R> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<R> f86326a;

    public w4(Class<R> cls) {
        this.f86326a = cls;
    }

    @Override // wb0.p
    public R call(T t11) {
        return this.f86326a.cast(t11);
    }
}
