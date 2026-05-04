package a30;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;

/* loaded from: classes8.dex */
public class g0 implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f1760a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f1761b;

    /* renamed from: c, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.protobuf.n f1762c;

    /* renamed from: d, reason: collision with root package name */
    public final AnnotatedCallableKind f1763d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1764e;

    /* renamed from: f, reason: collision with root package name */
    public final ProtoBuf.ValueParameter f1765f;

    public g0(j0 j0Var, m0 m0Var, kotlin.reflect.jvm.internal.impl.protobuf.n nVar, AnnotatedCallableKind annotatedCallableKind, int i11, ProtoBuf.ValueParameter valueParameter) {
        this.f1760a = j0Var;
        this.f1761b = m0Var;
        this.f1762c = nVar;
        this.f1763d = annotatedCallableKind;
        this.f1764e = i11;
        this.f1765f = valueParameter;
    }

    @Override // x00.a
    public Object invoke() {
        List C;
        C = j0.C(this.f1760a, this.f1761b, this.f1762c, this.f1763d, this.f1764e, this.f1765f);
        return C;
    }
}
