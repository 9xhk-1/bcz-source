package com.baicizhan.main.plusreview.fragment;

import com.baicizhan.main.plusreview.fragment.WordReadingFragment;
import kotlin.jvm.internal.g0;
import m80.k;
import org.junit.jupiter.api.j2;
import rf.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a {
    public static final void a(@k String[] args) {
        g0.p(args, "args");
        WordReadingFragment.a aVar = WordReadingFragment.F;
        System.out.println((Object) aVar.a("test(da)"));
        System.out.println((Object) aVar.a("test/da"));
        System.out.println((Object) aVar.a("test/da(dfsa)"));
        System.out.println((Object) aVar.a("give sb. a thing"));
        System.out.println((Object) aVar.a("left-swing"));
        System.out.println((Object) aVar.a("left... swing"));
    }

    @k
    public static final String b(@k i iVar) {
        g0.p(iVar, "<this>");
        return iVar.p() + j2.O + iVar.q() + j2.O + iVar.t() + " - " + iVar.v() + " - " + iVar.o() + "ms, {" + iVar.x() + "}, " + iVar.u();
    }
}
