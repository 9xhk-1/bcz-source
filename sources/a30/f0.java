package a30;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;

/* loaded from: classes8.dex */
public class f0 implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f1757a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.protobuf.n f1758b;

    /* renamed from: c, reason: collision with root package name */
    public final AnnotatedCallableKind f1759c;

    public f0(j0 j0Var, kotlin.reflect.jvm.internal.impl.protobuf.n nVar, AnnotatedCallableKind annotatedCallableKind) {
        this.f1757a = j0Var;
        this.f1758b = nVar;
        this.f1759c = annotatedCallableKind;
    }

    @Override // x00.a
    public Object invoke() {
        List p11;
        p11 = j0.p(this.f1757a, this.f1758b, this.f1759c);
        return p11;
    }
}
