package ct;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a<T> extends c<T, Float> {
    public a(String str) {
        super(Float.class, str);
    }

    @Override // ct.c
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void f(T t11, Float f11) {
        h(t11, f11.floatValue());
    }

    public abstract void h(T t11, float f11);
}
