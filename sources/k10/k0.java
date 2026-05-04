package k10;

import java.lang.reflect.Type;
import kotlin.reflect.jvm.internal.f;

/* loaded from: classes8.dex */
public class k0 implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final e30.r0 f64952a;

    /* renamed from: b, reason: collision with root package name */
    public final f.a f64953b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.f f64954c;

    public k0(e30.r0 r0Var, f.a aVar, kotlin.reflect.jvm.internal.f fVar) {
        this.f64952a = r0Var;
        this.f64953b = aVar;
        this.f64954c = fVar;
    }

    @Override // x00.a
    public Object invoke() {
        Type h02;
        h02 = f.a.h0(this.f64952a, this.f64953b, this.f64954c);
        return h02;
    }
}
