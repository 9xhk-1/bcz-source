package k10;

import java.lang.reflect.Type;

/* loaded from: classes8.dex */
public class e2 implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.r f64928a;

    /* renamed from: b, reason: collision with root package name */
    public final int f64929b;

    /* renamed from: c, reason: collision with root package name */
    public final yz.c0 f64930c;

    public e2(kotlin.reflect.jvm.internal.r rVar, int i11, yz.c0 c0Var) {
        this.f64928a = rVar;
        this.f64929b = i11;
        this.f64930c = c0Var;
    }

    @Override // x00.a
    public Object invoke() {
        Type r11;
        r11 = kotlin.reflect.jvm.internal.r.r(this.f64928a, this.f64929b, this.f64930c);
        return r11;
    }
}
