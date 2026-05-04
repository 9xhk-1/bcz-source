package c30;

import a30.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDeserializedTypeParameterDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedTypeParameterDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedTypeParameterDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,58:1\n1557#2:59\n1628#2,3:60\n*S KotlinDebug\n*F\n+ 1 DeserializedTypeParameterDescriptor.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedTypeParameterDescriptor\n*L\n51#1:59\n51#1:60,3\n*E\n"})
/* loaded from: classes8.dex */
public final class r0 extends s10.b {

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final a30.o f7757k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final ProtoBuf.TypeParameter f7758l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final b f7759m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r0(@m80.k a30.o r12, @m80.k kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.g0.p(r13, r0)
            d30.n r2 = r12.h()
            p10.h r3 = r12.e()
            q10.g$a r0 = q10.g.A0
            q10.g r4 = r0.b()
            k20.c r0 = r12.g()
            int r1 = r13.getName()
            n20.f r5 = a30.k0.b(r0, r1)
            a30.n0 r0 = a30.n0.f1824a
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Variance r1 = r13.getVariance()
            java.lang.String r6 = "getVariance(...)"
            kotlin.jvm.internal.g0.o(r1, r6)
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = r0.d(r1)
            boolean r7 = r13.getReified()
            p10.x0 r9 = p10.x0.f78622a
            p10.a1$a r10 = p10.a1.a.f78552a
            r1 = r11
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r1.f7757k = r12
            r1.f7758l = r13
            c30.b r13 = new c30.b
            d30.n r12 = r12.h()
            c30.q0 r14 = new c30.q0
            r14.<init>(r11)
            r13.<init>(r12, r14)
            r1.f7759m = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c30.r0.<init>(a30.o, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter, int):void");
    }

    public static final List I0(r0 r0Var) {
        return a00.r0.a6(r0Var.f7757k.c().d().e(r0Var.f7758l, r0Var.f7757k.g()));
    }

    @Override // s10.h
    @m80.k
    public List<e30.r0> G0() {
        List<ProtoBuf.Type> s11 = k20.f.s(this.f7758l, this.f7757k.j());
        if (s11.isEmpty()) {
            return a00.g0.l(u20.e.m(this).y());
        }
        List<ProtoBuf.Type> list = s11;
        v0 i11 = this.f7757k.i();
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i11.u((ProtoBuf.Type) it.next()));
        }
        return arrayList;
    }

    @Override // q10.b, q10.a
    @m80.k
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public b getAnnotations() {
        return this.f7759m;
    }

    @Override // s10.h
    @m80.k
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public Void F0(@m80.k e30.r0 type) {
        kotlin.jvm.internal.g0.p(type, "type");
        throw new IllegalStateException("There should be no cycles for deserialized type parameters, but found for: " + this);
    }
}
