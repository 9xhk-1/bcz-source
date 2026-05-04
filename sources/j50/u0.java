package j50;

import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
@kotlin.jvm.internal.u0({"SMAP\nInlineClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n+ 2 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,44:1\n107#2,10:45\n*S KotlinDebug\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n*L\n22#1:45,10\n*E\n"})
/* loaded from: classes8.dex */
public final class u0 extends l2 {

    /* renamed from: m, reason: collision with root package name */
    public final boolean f63474m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(@m80.k String name, @m80.k p0<?> generatedSerializer) {
        super(name, generatedSerializer, 1);
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(generatedSerializer, "generatedSerializer");
        this.f63474m = true;
    }

    @Override // j50.l2
    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        h50.f fVar = (h50.f) obj;
        if (!kotlin.jvm.internal.g0.g(k(), fVar.k())) {
            return false;
        }
        u0 u0Var = (u0) obj;
        if (!u0Var.isInline() || !Arrays.equals(v(), u0Var.v()) || h() != fVar.h()) {
            return false;
        }
        int h11 = h();
        for (int i11 = 0; i11 < h11; i11++) {
            if (!kotlin.jvm.internal.g0.g(e(i11).k(), fVar.e(i11).k()) || !kotlin.jvm.internal.g0.g(e(i11).getKind(), fVar.e(i11).getKind())) {
                return false;
            }
        }
        return true;
    }

    @Override // j50.l2
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // j50.l2, h50.f
    public boolean isInline() {
        return this.f63474m;
    }
}
