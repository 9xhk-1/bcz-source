package io.ktor.network.util;

import c40.r0;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final long f61132a = Long.MAX_VALUE;

    @k
    public static final b b(@k r0 r0Var, @k String name, long j11, @k x00.a<Long> clock, @k l<? super j00.c<? super g2>, ? extends Object> onTimeout) {
        g0.p(r0Var, "<this>");
        g0.p(name, "name");
        g0.p(clock, "clock");
        g0.p(onTimeout, "onTimeout");
        return new b(name, j11, clock, r0Var, onTimeout);
    }

    public static /* synthetic */ b c(r0 r0Var, String str, long j11, x00.a aVar, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        if ((i11 & 4) != 0) {
            aVar = new x00.a() { // from class: io.ktor.network.util.c
                @Override // x00.a
                public final Object invoke() {
                    long d11;
                    d11 = d.d();
                    return Long.valueOf(d11);
                }
            };
        }
        return b(r0Var, str, j11, aVar, lVar);
    }

    public static final long d() {
        return io.ktor.util.date.a.d();
    }

    public static final <T> T e(@m80.l b bVar, @k x00.a<? extends T> block) {
        g0.p(block, "block");
        if (bVar == null) {
            return block.invoke();
        }
        bVar.f();
        try {
            return block.invoke();
        } finally {
            d0.d(1);
            bVar.g();
            d0.c(1);
        }
    }
}
