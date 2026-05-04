package com.baicizhan.main.activity.setting.privatessetting.debug;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.util.SystemUtil;
import com.baicizhan.client.business.webview.hwpay.HwPayManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class DebugHwPayActivity extends BaseAppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f19641b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f19642c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final yz.c0 f19643a = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.w0
        @Override // x00.a
        public final Object invoke() {
            gs.z X0;
            X0 = DebugHwPayActivity.X0(DebugHwPayActivity.this);
            return X0;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final void a(@m80.k Context context) {
            kotlin.jvm.internal.g0.p(context, "context");
            context.startActivity(new Intent(context, (Class<?>) DebugHwPayActivity.class));
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Observer, kotlin.jvm.internal.b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f19644a;

        public b(x00.l function) {
            kotlin.jvm.internal.g0.p(function, "function");
            this.f19644a = function;
        }

        public final boolean equals(@m80.l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof kotlin.jvm.internal.b0)) {
                return kotlin.jvm.internal.g0.g(getFunctionDelegate(), ((kotlin.jvm.internal.b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @m80.k
        public final yz.w<?> getFunctionDelegate() {
            return this.f19644a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f19644a.invoke(obj);
        }
    }

    private final void Q0() {
        final gs.z P0 = P0();
        P0.f57681a.V("华为支付测试");
        P0.f57681a.D(new View.OnClickListener() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugHwPayActivity.R0(DebugHwPayActivity.this, view);
            }
        });
        TextView tvPayConsumed = P0.f57683c;
        kotlin.jvm.internal.g0.o(tvPayConsumed, "tvPayConsumed");
        sa.q.t(tvPayConsumed, 0, new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.r0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 S0;
                S0 = DebugHwPayActivity.S0(DebugHwPayActivity.this, (View) obj);
                return S0;
            }
        }, 1, null);
        TextView tvPayNoConsumed = P0.f57684d;
        kotlin.jvm.internal.g0.o(tvPayNoConsumed, "tvPayNoConsumed");
        sa.q.t(tvPayNoConsumed, 0, new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.s0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 T0;
                T0 = DebugHwPayActivity.T0(DebugHwPayActivity.this, (View) obj);
                return T0;
            }
        }, 1, null);
        TextView tvCopy = P0.f57682b;
        kotlin.jvm.internal.g0.o(tvCopy, "tvCopy");
        sa.q.t(tvCopy, 0, new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.t0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 U0;
                U0 = DebugHwPayActivity.U0(DebugHwPayActivity.this, P0, (View) obj);
                return U0;
            }
        }, 1, null);
        HwPayManager hwPayManager = HwPayManager.INSTANCE;
        hwPayManager.getHwPayResult().observe(this, new b(new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.u0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 V0;
                V0 = DebugHwPayActivity.V0(DebugHwPayActivity.this, (String) obj);
                return V0;
            }
        }));
        hwPayManager.getServiceResp().observe(this, new b(new x00.l() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.v0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 W0;
                W0 = DebugHwPayActivity.W0(DebugHwPayActivity.this, (String) obj);
                return W0;
            }
        }));
    }

    public static final void R0(DebugHwPayActivity debugHwPayActivity, View view) {
        debugHwPayActivity.finish();
    }

    public static final yz.g2 S0(DebugHwPayActivity debugHwPayActivity, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        HwPayManager.INSTANCE.pay(debugHwPayActivity, "{\"productId\":\"x005\", \"productType\":\"0\"; \"count\":1; \"subitemId\":100163, \"extra\":\"{id:1}\"}");
        return yz.g2.f100423a;
    }

    public static final yz.g2 T0(DebugHwPayActivity debugHwPayActivity, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        HwPayManager.INSTANCE.pay(debugHwPayActivity, "{\"productId\":\"X002\", \"productType\":1; \"count\":1; \"subitemId\":100163}");
        return yz.g2.f100423a;
    }

    public static final yz.g2 U0(DebugHwPayActivity debugHwPayActivity, gs.z zVar, View it) {
        kotlin.jvm.internal.g0.p(it, "it");
        SystemUtil.copyToClipboard(debugHwPayActivity, zVar.f57686f.getText().toString());
        va.g.i("复制成功", 0);
        return yz.g2.f100423a;
    }

    public static final yz.g2 V0(DebugHwPayActivity debugHwPayActivity, String str) {
        debugHwPayActivity.P0().f57686f.setText(str);
        TextView tvCopy = debugHwPayActivity.P0().f57682b;
        kotlin.jvm.internal.g0.o(tvCopy, "tvCopy");
        sa.q.z(tvCopy, true);
        return yz.g2.f100423a;
    }

    public static final yz.g2 W0(DebugHwPayActivity debugHwPayActivity, String str) {
        debugHwPayActivity.P0().f57688h.setText(str);
        return yz.g2.f100423a;
    }

    public static final gs.z X0(DebugHwPayActivity debugHwPayActivity) {
        return gs.z.d(debugHwPayActivity.getLayoutInflater());
    }

    public final gs.z P0() {
        return (gs.z) this.f19643a.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, @m80.l Intent intent) {
        super.onActivityResult(i11, i12, intent);
        HwPayManager.INSTANCE.onActivityResult(this, i11, i12, intent);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(P0().getRoot());
        Q0();
    }
}
