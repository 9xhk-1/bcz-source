package a30;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes8.dex */
public class s0 implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f1853a;

    /* renamed from: b, reason: collision with root package name */
    public final ProtoBuf.Type f1854b;

    public s0(v0 v0Var, ProtoBuf.Type type) {
        this.f1853a = v0Var;
        this.f1854b = type;
    }

    @Override // x00.a
    public Object invoke() {
        List r11;
        r11 = v0.r(this.f1853a, this.f1854b);
        return r11;
    }
}
