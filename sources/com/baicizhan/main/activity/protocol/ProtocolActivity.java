package com.baicizhan.main.activity.protocol;

import a00.l1;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.main.activity.protocol.ProtocolActivity;
import com.jiongji.andriod.card.R;
import gs.u1;
import java.util.Map;
import kc.d;
import kc.u;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import me.o;
import qb.c;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ProtocolActivity extends BaseAppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f18891b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f18892c = 8;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String f18893d = "Protocol_TAG";

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c0 f18894a = e0.c(new x00.a() { // from class: me.a
        @Override // x00.a
        public final Object invoke() {
            Map M0;
            M0 = ProtocolActivity.M0();
            return M0;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final String a() {
            return ProtocolActivity.f18893d;
        }

        public final void b(@k Activity context, int i11) {
            g0.p(context, "context");
            c.i(a(), "%b", Boolean.valueOf(o.f73181a.x()));
            context.startActivityForResult(new Intent(context, (Class<?>) ProtocolActivity.class), i11);
        }

        public a() {
        }
    }

    public static final Map M0() {
        return l1.W(new Pair("《用户协议》", pb.a.a().getString(R.string.url_bcz_protocol)), new Pair("《隐私政策》", pb.a.a().getString(R.string.url_private_protocol)), new Pair("《儿童隐私政策》", pb.a.a().getString(R.string.url_child_private_protocol)));
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [kc.d, kc.h] */
    public static final void N0(ProtocolActivity protocolActivity, View view) {
        mc.a.p(protocolActivity, ((u.a) d.a.r(d.a.I(new u.a(protocolActivity).U(R.string.app_protocol_refuse_confirm_content), R.string.app_protocol_refuse_confirm_ok, null, null, 6, null), R.string.protocol_reject, null, 2, null)).d(), null, 2, null);
    }

    public static final void O0(ProtocolActivity protocolActivity, u1 u1Var, View view) {
        o oVar = o.f73181a;
        oVar.D(true);
        oVar.C(true);
        c.i(f18893d, "confirm !!!", new Object[0]);
        protocolActivity.setResult(-1);
        u1Var.f56933b.setEnabled(false);
        protocolActivity.finish();
        protocolActivity.overridePendingTransition(R.anim.alpha_fade_in, R.anim.alpha_fade_out);
    }

    public final Map<String, String> L0() {
        return (Map) this.f18894a.getValue();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        final u1 c11 = u1.c(getLayoutInflater());
        c11.f56937f.setOnClickListener(new View.OnClickListener() { // from class: me.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProtocolActivity.N0(ProtocolActivity.this, view);
            }
        });
        c11.f56933b.setOnClickListener(new View.OnClickListener() { // from class: me.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProtocolActivity.O0(ProtocolActivity.this, c11, view);
            }
        });
        o oVar = o.f73181a;
        TextView protocolContent = c11.f56936e;
        g0.o(protocolContent, "protocolContent");
        Map<String, String> L0 = L0();
        String string = getString(R.string.protocol_content);
        g0.o(string, "getString(...)");
        oVar.A(protocolContent, L0, string, true);
        setContentView(c11.getRoot());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }
}
