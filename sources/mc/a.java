package mc;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kc.h;
import kc.u;
import kotlin.Result;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import w00.j;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "Magics")
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final String f73092a = "com.baicizhan.framework.common.magicdialog.tag";

    public static final void a(@k Fragment fragment, @k String tag) {
        Fragment findFragmentByTag;
        g0.p(fragment, "<this>");
        g0.p(tag, "tag");
        if (fragment.isAdded() && (findFragmentByTag = fragment.getChildFragmentManager().findFragmentByTag(tag)) != null) {
            fragment.getChildFragmentManager().beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
    }

    public static final void b(@k FragmentActivity fragmentActivity, @k String tag) {
        g0.p(fragmentActivity, "<this>");
        g0.p(tag, "tag");
        Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag(tag);
        if (findFragmentByTag == null) {
            return;
        }
        fragmentActivity.getSupportFragmentManager().beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
    }

    public static /* synthetic */ void c(Fragment fragment, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = f73092a;
        }
        a(fragment, str);
    }

    public static /* synthetic */ void d(FragmentActivity fragmentActivity, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = f73092a;
        }
        b(fragmentActivity, str);
    }

    @k
    public static final u.a e(@k Fragment fragment) {
        g0.p(fragment, "<this>");
        Context requireContext = fragment.requireContext();
        g0.o(requireContext, "requireContext()");
        return new u.a(requireContext);
    }

    @k
    public static final u.a f(@k FragmentActivity fragmentActivity) {
        g0.p(fragmentActivity, "<this>");
        return new u.a(fragmentActivity);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kc.d, kc.h] */
    @k
    public static final Object g(@k Fragment fragment, @k String tag, @l x00.l<? super u, g2> lVar, @k x00.l<? super u.a, g2> builder) {
        g0.p(fragment, "<this>");
        g0.p(tag, "tag");
        g0.p(builder, "builder");
        u.a e11 = e(fragment);
        builder.invoke(e11);
        ?? d11 = e11.d();
        u uVar = (u) d11;
        if (lVar != null) {
            lVar.invoke(uVar);
        }
        return l(fragment, d11, tag);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [kc.d, kc.h] */
    public static final void h(@k FragmentActivity fragmentActivity, @k String tag, @l x00.l<? super u, g2> lVar, @k x00.l<? super u.a, g2> builder) {
        g0.p(fragmentActivity, "<this>");
        g0.p(tag, "tag");
        g0.p(builder, "builder");
        u.a f11 = f(fragmentActivity);
        builder.invoke(f11);
        ?? d11 = f11.d();
        u uVar = (u) d11;
        if (lVar != null) {
            lVar.invoke(uVar);
        }
        n(fragmentActivity, d11, tag);
    }

    public static /* synthetic */ Object i(Fragment fragment, String str, x00.l lVar, x00.l lVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = f73092a;
        }
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        return g(fragment, str, lVar, lVar2);
    }

    public static /* synthetic */ void j(FragmentActivity fragmentActivity, String str, x00.l lVar, x00.l lVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = f73092a;
        }
        if ((i11 & 2) != 0) {
            lVar = null;
        }
        h(fragmentActivity, str, lVar, lVar2);
    }

    @w00.k
    @k
    public static final Object k(@k Fragment fragment, @k h dialog) {
        g0.p(fragment, "<this>");
        g0.p(dialog, "dialog");
        return o(fragment, dialog, null, 2, null);
    }

    @w00.k
    @k
    public static final Object l(@k Fragment fragment, @k h dialog, @k String tag) {
        g0.p(fragment, "<this>");
        g0.p(dialog, "dialog");
        g0.p(tag, "tag");
        if (!fragment.isAdded()) {
            Result.a aVar = Result.Companion;
            return Result.m6308constructorimpl(kotlin.e.a(new Throwable("Not added yet!")));
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        g0.o(childFragmentManager, "childFragmentManager");
        dialog.show(childFragmentManager, tag);
        Result.a aVar2 = Result.Companion;
        return Result.m6308constructorimpl(Boolean.TRUE);
    }

    @w00.k
    public static final void m(@k FragmentActivity fragmentActivity, @k h dialog) {
        g0.p(fragmentActivity, "<this>");
        g0.p(dialog, "dialog");
        p(fragmentActivity, dialog, null, 2, null);
    }

    @w00.k
    public static final void n(@k FragmentActivity fragmentActivity, @k h dialog, @k String tag) {
        g0.p(fragmentActivity, "<this>");
        g0.p(dialog, "dialog");
        g0.p(tag, "tag");
        FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        g0.o(supportFragmentManager, "supportFragmentManager");
        dialog.show(supportFragmentManager, tag);
    }

    public static /* synthetic */ Object o(Fragment fragment, h hVar, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = f73092a;
        }
        return l(fragment, hVar, str);
    }

    public static /* synthetic */ void p(FragmentActivity fragmentActivity, h hVar, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = f73092a;
        }
        n(fragmentActivity, hVar, str);
    }
}
