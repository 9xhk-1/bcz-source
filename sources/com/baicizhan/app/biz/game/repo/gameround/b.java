package com.baicizhan.app.biz.game.repo.gameround;

import a00.r0;
import f4.o0;
import h5.m;
import j50.f;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m3.k2;
import m80.k;
import p8.h0;
import p8.k0;
import q30.k0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Convert.kt\ncom/baicizhan/app/biz/game/repo/gameround/ConvertKt\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n+ 3 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,69:1\n147#2:70\n113#3:71\n113#3:72\n*S KotlinDebug\n*F\n+ 1 Convert.kt\ncom/baicizhan/app/biz/game/repo/gameround/ConvertKt\n*L\n19#1:70\n32#1:71\n62#1:72\n*E\n"})
/* loaded from: classes3.dex */
public final class b {
    @k
    public static final o0 b(@k m mVar, @k k50.a json) {
        g0.p(mVar, "<this>");
        g0.p(json, "json");
        String t11 = mVar.t();
        long n11 = mVar.n();
        long z11 = mVar.z();
        String v11 = mVar.v();
        long x11 = mVar.x();
        List<k2> B = mVar.B();
        json.getSerializersModule();
        return new o0(t11, n11, json.a(new f(k2.Companion.serializer()), B), mVar.r(), mVar.p(), z11, x11, v11);
    }

    @k
    public static final o0 c(@k h0 h0Var, long j11, @k k50.a json) {
        g0.p(h0Var, "<this>");
        g0.p(json, "json");
        String str = h0Var.f79846a;
        long j12 = h0Var.f79850e;
        long j13 = h0Var.f79851f;
        List I3 = k0.I3(k0.N1(r0.E1(h0Var.f79849d), new l() { // from class: com.baicizhan.app.biz.game.repo.gameround.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                k2 d11;
                d11 = b.d((p8.k0) obj);
                return d11;
            }
        }));
        json.getSerializersModule();
        return new o0(str, j11, json.a(new f(k2.Companion.serializer()), I3), h0Var.f79847b, h0Var.f79848c, j12, j13, "");
    }

    public static final k2 d(p8.k0 it) {
        g0.p(it, "it");
        return g(it);
    }

    @k
    public static final m e(@k o0 o0Var, @k k50.a json) {
        g0.p(o0Var, "<this>");
        g0.p(json, "json");
        String n11 = o0Var.n();
        long k11 = o0Var.k();
        long q11 = o0Var.q();
        String o11 = o0Var.o();
        long p11 = o0Var.p();
        String r11 = o0Var.r();
        json.getSerializersModule();
        return new m(n11, k11, (List) json.c(new f(k2.Companion.serializer()), r11), o0Var.m(), o0Var.l(), q11, p11, o11);
    }

    @k
    public static final p8.k0 f(@k k2 k2Var) {
        g0.p(k2Var, "<this>");
        return new k0.a().d(k2Var.j()).b(k2Var.f()).c(k2Var.h()).build();
    }

    @k
    public static final k2 g(@k p8.k0 k0Var) {
        g0.p(k0Var, "<this>");
        return new k2(k0Var.f79966a, k0Var.f79967b, k0Var.f79968c);
    }
}
