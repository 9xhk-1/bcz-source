package com.baicizhan.app.biz.game.model;

import h5.y;
import kotlin.jvm.internal.g0;
import m80.k;
import w3.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {
    @k
    public static final MembershipLevel a(@k y yVar) {
        g0.p(yVar, "<this>");
        return MembershipLevel.Companion.a(yVar.g());
    }

    public static final boolean b(@k y yVar) {
        g0.p(yVar, "<this>");
        return !d(yVar);
    }

    public static final boolean c(@k y yVar) {
        g0.p(yVar, "<this>");
        return yVar.g() == MembershipLevel.TrialVip.getValue() && yVar.e() > g.n();
    }

    public static final boolean d(@k y yVar) {
        g0.p(yVar, "<this>");
        return yVar.g() != MembershipLevel.Free.getValue() && yVar.e() > g.n();
    }
}
