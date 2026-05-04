package com.baicizhan.app.biz.game.repo.book;

import f4.n0;
import h5.j;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import p8.b0;
import p8.c1;
import p8.e1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {
    @k
    public static final j a(@k c1 c1Var) {
        g0.p(c1Var, "<this>");
        int i11 = c1Var.f79718a;
        String str = c1Var.f79719b;
        String str2 = c1Var.f79723f;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        List<Integer> list = c1Var.f79720c;
        int i12 = c1Var.f79721d;
        Integer num = c1Var.f79722e;
        return new j(i11, str, str3, list, i12, num != null ? num.intValue() : 0);
    }

    @k
    public static final n0 b(@k e1 e1Var, @k k50.a json, long j11) {
        g0.p(e1Var, "<this>");
        g0.p(json, "json");
        long j12 = e1Var.f79780a.f79718a;
        b0 b0Var = e1Var.f79781b;
        return new n0(j12, b0Var.f79679b, b0Var.f79678a, j11, json.g(j.Companion.serializer(), a(e1Var.f79780a)).toString());
    }
}
