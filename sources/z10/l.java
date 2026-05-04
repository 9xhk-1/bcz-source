package z10;

import a00.k1;
import a00.l1;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import n10.o;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJavaAnnotationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaRetentionAnnotationDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
/* loaded from: classes8.dex */
public final class l extends c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f100620h = {o0.u(new PropertyReference1Impl(o0.d(l.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final d30.i f100621g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(@m80.k f20.a annotation, @m80.k b20.k c11) {
        super(c11, annotation, o.a.L);
        g0.p(annotation, "annotation");
        g0.p(c11, "c");
        this.f100621g = c11.e().f(new k(this));
    }

    public static final Map i(l lVar) {
        s20.g<?> b11 = f.f100611a.b(lVar.c());
        Map k11 = b11 != null ? k1.k(h1.a(d.f100605a.c(), b11)) : null;
        return k11 == null ? l1.z() : k11;
    }

    @Override // z10.c, q10.c
    @m80.k
    public Map<n20.f, s20.g<?>> a() {
        return (Map) d30.m.a(this.f100621g, this, f100620h[0]);
    }
}
