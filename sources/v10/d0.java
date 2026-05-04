package v10;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReflectJavaRecordComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaRecordComponent.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaRecordComponent\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
/* loaded from: classes8.dex */
public final class d0 extends y implements f20.w {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Object f92831a;

    public d0(@m80.k Object recordComponent) {
        kotlin.jvm.internal.g0.p(recordComponent, "recordComponent");
        this.f92831a = recordComponent;
    }

    @Override // v10.y
    @m80.k
    public Member P() {
        Method c11 = a.f92812a.c(this.f92831a);
        if (c11 != null) {
            return c11;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // f20.w
    public boolean b() {
        return false;
    }

    @Override // f20.w
    @m80.k
    public f20.x getType() {
        Class<?> d11 = a.f92812a.d(this.f92831a);
        if (d11 != null) {
            return new s(d11);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
