package v40;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c<T> implements e<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f92965a;

    public c(@m80.k String string) {
        g0.p(string, "string");
        this.f92965a = string;
    }

    @Override // v40.e
    public void b(T t11, @m80.k Appendable builder, boolean z11) {
        g0.p(builder, "builder");
        builder.append(this.f92965a);
    }
}
