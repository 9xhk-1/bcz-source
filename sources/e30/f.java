package e30;

import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;

/* loaded from: classes8.dex */
public class f implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final TypeCheckerState f48577a;

    /* renamed from: b, reason: collision with root package name */
    public final i30.o f48578b;

    /* renamed from: c, reason: collision with root package name */
    public final i30.h f48579c;

    /* renamed from: d, reason: collision with root package name */
    public final i30.h f48580d;

    public f(TypeCheckerState typeCheckerState, i30.o oVar, i30.h hVar, i30.h hVar2) {
        this.f48577a = typeCheckerState;
        this.f48578b = oVar;
        this.f48579c = hVar;
        this.f48580d = hVar2;
    }

    @Override // x00.a
    public Object invoke() {
        boolean y11;
        y11 = kotlin.reflect.jvm.internal.impl.types.b.y(this.f48577a, this.f48578b, this.f48579c, this.f48580d);
        return Boolean.valueOf(y11);
    }
}
