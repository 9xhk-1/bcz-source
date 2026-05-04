package j10;

import a30.j0;
import h10.h;
import h10.i;
import k10.q2;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import m80.k;
import m80.l;
import x00.p;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nreflectLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 reflectLambda.kt\nkotlin/reflect/jvm/ReflectLambdaKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* loaded from: classes8.dex */
public final class f {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReference implements p<j0, ProtoBuf.Function, g> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f63129a = new a();

        public a() {
            super(2);
        }

        @Override // x00.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g invoke(j0 p02, ProtoBuf.Function p12) {
            g0.p(p02, "p0");
            g0.p(p12, "p1");
            return p02.s(p12);
        }

        @Override // kotlin.jvm.internal.CallableReference, h10.c
        public final String getName() {
            return "loadFunction";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final h getOwner() {
            return o0.d(j0.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }
    }

    @j10.a
    @l
    public static final <R> i<R> a(@k w<? extends R> wVar) {
        g0.p(wVar, "<this>");
        Metadata metadata = (Metadata) wVar.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] d12 = metadata.d1();
        if (d12.length == 0) {
            d12 = null;
        }
        if (d12 == null) {
            return null;
        }
        Pair<m20.f, ProtoBuf.Function> j11 = m20.i.j(d12, metadata.d2());
        m20.f component1 = j11.component1();
        ProtoBuf.Function component2 = j11.component2();
        m20.e eVar = new m20.e(metadata.mv(), (metadata.xi() & 8) != 0);
        Class<?> cls = wVar.getClass();
        ProtoBuf.TypeTable typeTable = component2.getTypeTable();
        g0.o(typeTable, "getTypeTable(...)");
        return new kotlin.reflect.jvm.internal.g(kotlin.reflect.jvm.internal.a.f67085d, (g) q2.h(cls, component2, component1, new k20.g(typeTable), eVar, a.f63129a));
    }
}
