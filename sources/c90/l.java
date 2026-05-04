package c90;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class l implements p80.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final g0 f8414a;

    /* renamed from: b, reason: collision with root package name */
    public final o f8415b;

    /* renamed from: c, reason: collision with root package name */
    public final f90.d f8416c;

    /* renamed from: d, reason: collision with root package name */
    public final Object[] f8417d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8418e;

    public l(g0 formatter, o methodContext, f90.d arguments, int invocationIndex) {
        this.f8414a = formatter;
        this.f8415b = methodContext;
        this.f8416c = arguments;
        this.f8417d = c(methodContext, arguments.get());
        this.f8418e = invocationIndex;
    }

    public static Object[] c(o methodContext, Object[] arguments) {
        if (methodContext.e()) {
            return arguments;
        }
        int b11 = methodContext.b();
        return arguments.length > b11 ? Arrays.copyOf(arguments, b11) : arguments;
    }

    @Override // p80.g0
    public String a(int invocationIndex) {
        return this.f8414a.p(invocationIndex, this.f8416c, this.f8417d);
    }

    @Override // p80.g0
    public List<p80.m> b() {
        return Collections.singletonList(new o0(this.f8415b, this.f8417d, this.f8418e));
    }
}
