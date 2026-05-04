package v40;

import kotlin.jvm.internal.g0;
import u30.f0;
import u30.u;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f<T> implements e<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l<T, Integer> f92970a;

    /* renamed from: b, reason: collision with root package name */
    public final int f92971b;

    /* renamed from: c, reason: collision with root package name */
    public final int f92972c;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@m80.k l<? super T, Integer> number, int i11, int i12) {
        g0.p(number, "number");
        this.f92970a = number;
        this.f92971b = i11;
        this.f92972c = i12;
    }

    @Override // v40.e
    public void b(T t11, @m80.k Appendable builder, boolean z11) {
        g0.p(builder, "builder");
        int intValue = this.f92970a.invoke(t11).intValue();
        int i11 = t40.f.c()[this.f92971b];
        int i12 = intValue - this.f92972c;
        if (i12 >= 0 && i12 < i11) {
            String valueOf = String.valueOf(intValue % t40.f.c()[this.f92971b]);
            u.a(builder, f0.v2("0", Math.max(0, this.f92971b - valueOf.length())), valueOf);
        } else {
            if (intValue >= 0) {
                builder.append("+");
            }
            builder.append(String.valueOf(intValue));
        }
    }
}
