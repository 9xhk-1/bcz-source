package v40;

import kotlin.jvm.internal.g0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j<T> implements e<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l<T, String> f92981a;

    /* JADX WARN: Multi-variable type inference failed */
    public j(@m80.k l<? super T, String> string) {
        g0.p(string, "string");
        this.f92981a = string;
    }

    @Override // v40.e
    public void b(T t11, @m80.k Appendable builder, boolean z11) {
        g0.p(builder, "builder");
        builder.append(this.f92981a.invoke(t11));
    }
}
