package e30;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;

/* loaded from: classes8.dex */
public class e implements x00.l {

    /* renamed from: a, reason: collision with root package name */
    public final Collection f48572a;

    /* renamed from: b, reason: collision with root package name */
    public final TypeCheckerState f48573b;

    /* renamed from: c, reason: collision with root package name */
    public final i30.o f48574c;

    /* renamed from: d, reason: collision with root package name */
    public final i30.h f48575d;

    public e(Collection collection, TypeCheckerState typeCheckerState, i30.o oVar, i30.h hVar) {
        this.f48572a = collection;
        this.f48573b = typeCheckerState;
        this.f48574c = oVar;
        this.f48575d = hVar;
    }

    @Override // x00.l
    public Object invoke(Object obj) {
        yz.g2 x11;
        x11 = kotlin.reflect.jvm.internal.impl.types.b.x(this.f48572a, this.f48573b, this.f48574c, this.f48575d, (TypeCheckerState.a) obj);
        return x11;
    }
}
