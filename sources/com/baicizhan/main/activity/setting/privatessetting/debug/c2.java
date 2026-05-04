package com.baicizhan.main.activity.setting.privatessetting.debug;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.baicizhan.client.business.auth.share.ShareDelegate;
import com.baicizhan.client.business.auth.share.ShareParams;
import com.baicizhan.client.business.okhttp.DnsMgr;
import com.baicizhan.client.business.util.SystemUtil;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.framework.common.magicdialog.Action;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.wordlistv2.WordListV2Activity;
import com.jiongji.andriod.card.R;
import gs.ca;
import kc.s;
import kc.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c2 extends Fragment {

    /* renamed from: c, reason: collision with root package name */
    public static final String f19679c = "DebugSettingFragment";

    /* renamed from: a, reason: collision with root package name */
    public ca f19680a;

    /* renamed from: b, reason: collision with root package name */
    public j2 f19681b;

    public static String M(Context context) {
        return null;
    }

    private void N(LayoutInflater inflater) {
        ca e11 = ca.e(inflater);
        this.f19680a = e11;
        e11.j(this.f19681b);
        this.f19680a.setLifecycleOwner(this);
    }

    private void O() {
        j2 j2Var = (j2) new ViewModelProvider(this).get(j2.class);
        this.f19681b = j2Var;
        j2Var.v().observe(this, new Observer() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.w1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c2.this.P((String) obj);
            }
        });
        this.f19681b.n().observe(this, new Observer() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.z1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c2.this.Z((Void) obj);
            }
        });
        this.f19681b.m().observe(this, new Observer() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.a2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c2.this.a0((Void) obj);
            }
        });
        this.f19681b.l().observe(this, new Observer() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.b2
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c2.this.e0((Void) obj);
            }
        });
        this.f19681b.z().observe(this, new Observer() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.l1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c2.this.f0((Void) obj);
            }
        });
        this.f19681b.w().observe(this, new Observer() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.m1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c2.this.S((Void) obj);
            }
        });
        this.f19681b.o().observe(this, new Observer() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.n1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c2.this.T((Void) obj);
            }
        });
        this.f19681b.u().observe(this, new Observer() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.o1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c2.this.U((Void) obj);
            }
        });
        this.f19681b.s().observe(this, new Observer() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.p1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c2.this.V((Void) obj);
            }
        });
        this.f19681b.q().observe(this, new Observer() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.q1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c2.this.W((Void) obj);
            }
        });
        this.f19681b.k().observe(this, new Observer() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.x1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c2.this.X((Void) obj);
            }
        });
        this.f19681b.j().observe(this, new Observer() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.y1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c2.this.Y((Void) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a0(Void r22) {
        BczWebExecutorKt.startNormalWeb(getContext(), BczWebExecutorKt.URL_WEB_JS_TEST_LAB);
    }

    public final /* synthetic */ void P(String str) {
        this.f19680a.f54425k.v(str);
    }

    public final /* synthetic */ void Q(int i11) {
        if (i11 == 0) {
            this.f19681b.H(DnsMgr.TestServer.Test1);
        } else if (i11 != 1) {
            this.f19681b.H(DnsMgr.TestServer.NONE);
        } else {
            this.f19681b.H(DnsMgr.TestServer.Test2);
        }
    }

    public final /* synthetic */ yz.g2 R(String str, View view) {
        SystemUtil.copyToClipboard(requireContext(), str);
        va.g.i("复制成功", 0);
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13, types: [kc.d, kc.h] */
    public final /* synthetic */ void S(Void r52) {
        String n11 = eh.c.n();
        final String g11 = eh.c.g("tr", n11);
        mc.a.k(this, ((u.a) ((u.a) ((u.a) new u.a(requireActivity()).V("原始口令 -> \"" + n11 + "\"\n\n加密后的口令 -> \"" + g11 + "\"").b0(ButtonType.TRIPLE).e(R.layout.layout_dialog_prompt_buttons_triple)).H("分享到微信", Action.RECOMMENDED, new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.r1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 g02;
                g02 = c2.this.g0(g11, (View) obj);
                return g02;
            }
        })).w("复制口令", new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.s1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 R;
                R = c2.this.R(g11, (View) obj);
                return R;
            }
        })).d());
    }

    public final /* synthetic */ void T(Void r22) {
        DebugNewGuideActivity.f19645b.a(requireContext());
    }

    public final /* synthetic */ void U(Void r22) {
        DebugHwPayActivity.f19641b.a(requireActivity());
    }

    public final /* synthetic */ void V(Void r22) {
        DebugSpineActivity.f19647h.a(requireContext());
    }

    public final /* synthetic */ void W(Void r22) {
        WordListV2Activity.f27829j.a(requireActivity());
    }

    public final /* synthetic */ void X(Void r22) {
        DebugApiTestActivity.f19616b.a(requireContext());
    }

    public final /* synthetic */ void Y(Void r22) {
        AdCacheDetailActivity.f19594a.a(requireContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void Z(Void r42) {
        mc.a.k(this, ((kc.s) new s.a(requireContext()).Q(new String[]{"test1", "test2", "none"}).d()).m0(new s.b() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.k1
            @Override // kc.s.b
            public final void a(int i11) {
                c2.this.Q(i11);
            }
        }));
    }

    public final /* synthetic */ yz.g2 b0(String str, View view) {
        BczWebExecutorKt.startNormalWeb(getContext(), str);
        return null;
    }

    public final /* synthetic */ yz.g2 c0(View view) {
        BczWebExecutorKt.startNormalWeb(getContext(), "https://sss.baicizhan.com/native-jsapi-lab/api/labs/web-view/open-in-web-view");
        return null;
    }

    public final /* synthetic */ yz.g2 d0(View view) {
        BczWebExecutorKt.startNormalWeb(getContext(), "https://sss.baicizhan.com/native-jsapi-lab/api/labs/web-view/open-in-web-view");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void e0(Void r52) {
        final String M = M(getContext());
        if (M == null || !M.startsWith("http")) {
            M = "请在web测试页面内生成url并复制";
        }
        u.a V = new u.a(getContext()).V(M);
        if (M.startsWith("http")) {
            ((u.a) ((u.a) V.b0(ButtonType.TRIPLE).e(R.layout.layout_dialog_prompt_buttons_triple)).H("跳转", Action.RECOMMENDED, new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.t1
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 b02;
                    b02 = c2.this.b0(M, (View) obj);
                    return b02;
                }
            })).w("重新生成", new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.u1
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 c02;
                    c02 = c2.this.c0((View) obj);
                    return c02;
                }
            });
        } else {
            V.H("前往", Action.RECOMMENDED, new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.v1
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 d02;
                    d02 = c2.this.d0((View) obj);
                    return d02;
                }
            });
        }
        ((kc.u) V.d()).show(getChildFragmentManager(), "");
    }

    public final /* synthetic */ void f0(Void r22) {
        DebugWatchActivity.f19656d.a(requireContext());
    }

    public final /* synthetic */ yz.g2 g0(String str, View view) {
        ShareParams shareParams = new ShareParams();
        shareParams.f16061e = ShareParams.ShareType.TEXT;
        shareParams.f16063g = str;
        ShareDelegate.i(requireActivity()).v(shareParams).w(ShareChannel.WEIXIN);
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        O();
        this.f19681b.start();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        N(inflater);
        return this.f19680a.getRoot();
    }
}
