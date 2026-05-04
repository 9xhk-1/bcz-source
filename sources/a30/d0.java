package a30;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;

/* loaded from: classes8.dex */
public class d0 implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f1747a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.protobuf.n f1748b;

    /* renamed from: c, reason: collision with root package name */
    public final AnnotatedCallableKind f1749c;

    public d0(j0 j0Var, kotlin.reflect.jvm.internal.impl.protobuf.n nVar, AnnotatedCallableKind annotatedCallableKind) {
        this.f1747a = j0Var;
        this.f1748b = nVar;
        this.f1749c = annotatedCallableKind;
    }

    @Override // x00.a
    public Object invoke() {
        List k11;
        k11 = j0.k(this.f1747a, this.f1748b, this.f1749c);
        return k11;
    }
}
