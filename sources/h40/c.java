package h40;

import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@IgnoreJRERequirement
/* loaded from: classes8.dex */
public final class c extends k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c f58185a = new c();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f58186b = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends ClassValue<x00.l<? super Throwable, ? extends Throwable>> {
        @Override // java.lang.ClassValue
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public x00.l<Throwable, Throwable> computeValue(Class<?> cls) {
            x00.l<Throwable, Throwable> g11;
            kotlin.jvm.internal.g0.n(cls, "null cannot be cast to non-null type java.lang.Class<out kotlin.Throwable>");
            g11 = s.g(cls);
            return g11;
        }
    }

    @Override // h40.k
    @m80.k
    public x00.l<Throwable, Throwable> a(@m80.k Class<? extends Throwable> cls) {
        Object obj;
        obj = f58186b.get(cls);
        return (x00.l) obj;
    }
}
