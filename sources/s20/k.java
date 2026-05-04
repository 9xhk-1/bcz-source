package s20;

import e30.c1;
import e30.r0;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nconstantValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 constantValues.kt\norg/jetbrains/kotlin/resolve/constants/EnumValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,320:1\n1#2:321\n*E\n"})
/* loaded from: classes8.dex */
public final class k extends g<Pair<? extends n20.b, ? extends n20.f>> {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final n20.b f87445b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final n20.f f87446c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@m80.k n20.b enumClassId, @m80.k n20.f enumEntryName) {
        super(h1.a(enumClassId, enumEntryName));
        g0.p(enumClassId, "enumClassId");
        g0.p(enumEntryName, "enumEntryName");
        this.f87445b = enumClassId;
        this.f87446c = enumEntryName;
    }

    @Override // s20.g
    @m80.k
    public r0 a(@m80.k p10.a0 module) {
        c1 s11;
        g0.p(module, "module");
        p10.b b11 = p10.t.b(module, this.f87445b);
        if (b11 != null) {
            if (!q20.h.A(b11)) {
                b11 = null;
            }
            if (b11 != null && (s11 = b11.s()) != null) {
                return s11;
            }
        }
        return g30.i.d(ErrorTypeKind.ERROR_ENUM_TYPE, this.f87445b.toString(), this.f87446c.toString());
    }

    @m80.k
    public final n20.f c() {
        return this.f87446c;
    }

    @Override // s20.g
    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f87445b.h());
        sb2.append('.');
        sb2.append(this.f87446c);
        return sb2.toString();
    }
}
