package com.baicizhan.main.activity.setting.privatessetting.debug;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.base.BaseAppCompatActivity;
import com.esotericsoftware.spine.android.SpineView;
import com.esotericsoftware.spine.android.bounds.ContentMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class DebugSpineActivity extends BaseAppCompatActivity {

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final a f19647h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f19648i = 8;

    /* renamed from: e, reason: collision with root package name */
    public int f19653e;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final com.esotericsoftware.spine.android.c f19649a = new com.esotericsoftware.spine.android.c(new ml.d() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.k2
        @Override // ml.d
        public final void a(com.esotericsoftware.spine.android.c cVar) {
            DebugSpineActivity.T0(cVar);
        }
    });

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final com.esotericsoftware.spine.android.c f19650b = new com.esotericsoftware.spine.android.c(new ml.d() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.l2
        @Override // ml.d
        public final void a(com.esotericsoftware.spine.android.c cVar) {
            DebugSpineActivity.S0(cVar);
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final com.esotericsoftware.spine.android.c f19651c = new com.esotericsoftware.spine.android.c(new ml.d() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.m2
        @Override // ml.d
        public final void a(com.esotericsoftware.spine.android.c cVar) {
            DebugSpineActivity.R0(cVar);
        }
    });

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final com.esotericsoftware.spine.android.c f19652d = new com.esotericsoftware.spine.android.c(new ml.d() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.n2
        @Override // ml.d
        public final void a(com.esotericsoftware.spine.android.c cVar) {
            DebugSpineActivity.U0(cVar);
        }
    });

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String[] f19654f = {"ani_idle", "ani_angry", "ani_happy", "ani_impatience"};

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final yz.c0 f19655g = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.o2
        @Override // x00.a
        public final Object invoke() {
            gs.b0 h12;
            h12 = DebugSpineActivity.h1(DebugSpineActivity.this);
            return h12;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public final void a(@m80.k Context context) {
            kotlin.jvm.internal.g0.p(context, "context");
            context.startActivity(new Intent(context, (Class<?>) DebugSpineActivity.class));
        }

        public a() {
        }
    }

    public static final void R0(com.esotericsoftware.spine.android.c controller) {
        kotlin.jvm.internal.g0.p(controller, "controller");
        controller.m().J(0.8f, 0.8f);
        controller.j().d(0.5f);
        controller.i().x(0, "ani_idle", true);
    }

    public static final void S0(com.esotericsoftware.spine.android.c controller) {
        kotlin.jvm.internal.g0.p(controller, "controller");
        controller.m().J(0.8f, 0.8f);
        controller.j().d(0.5f);
        controller.i().x(0, "ani_idle", true);
    }

    public static final void T0(com.esotericsoftware.spine.android.c controller) {
        kotlin.jvm.internal.g0.p(controller, "controller");
        controller.m().J(0.8f, 0.8f);
        controller.j().d(0.5f);
        controller.i().x(0, "ani_idle", true);
    }

    public static final void U0(com.esotericsoftware.spine.android.c controller) {
        kotlin.jvm.internal.g0.p(controller, "controller");
        controller.i().x(0, "Tzcg", true);
    }

    private final void c1() {
        gs.b0 a12 = a1();
        a12.f54211a.V("spine");
        a12.f54211a.D(new View.OnClickListener() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.p2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugSpineActivity.d1(DebugSpineActivity.this, view);
            }
        });
        SpineView.b e11 = new SpineView.b(this, this.f19649a).e("spine/miguan.atlas", "spine/miguan.skel");
        ContentMode contentMode = ContentMode.FIT;
        SpineView a11 = e11.d(contentMode).a();
        a11.setOnClickListener(new View.OnClickListener() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.q2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugSpineActivity.e1(DebugSpineActivity.this, view);
            }
        });
        a12.f54212b.addView(a11, 1000, 1000);
        SpineView a13 = new SpineView.b(this, this.f19650b).e("spine/fox_mini.atlas.txt", "spine/fox_mini.skel.bytes").d(contentMode).a();
        a13.setOnClickListener(new View.OnClickListener() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.r2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugSpineActivity.f1(DebugSpineActivity.this, view);
            }
        });
        a12.f54212b.addView(a13, 1000, 500);
        SpineView a14 = new SpineView.b(this, this.f19651c).e("spine/shelic.atlas.txt", "spine/sheli.skel.bytes").a();
        a14.setOnClickListener(new View.OnClickListener() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.s2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DebugSpineActivity.g1(DebugSpineActivity.this, view);
            }
        });
        a12.f54212b.addView(a14, 1000, 500);
        a12.f54212b.addView(new SpineView.b(this, this.f19652d).e("spine/Tzcg.atlas.txt", "spine/Tzcg.skel.bytes").a(), 500, 500);
    }

    public static final void d1(DebugSpineActivity debugSpineActivity, View view) {
        debugSpineActivity.finish();
    }

    public static final void e1(DebugSpineActivity debugSpineActivity, View view) {
        com.esotericsoftware.spine.a i11 = debugSpineActivity.f19649a.i();
        String[] strArr = debugSpineActivity.f19654f;
        int i12 = debugSpineActivity.f19653e;
        debugSpineActivity.f19653e = i12 + 1;
        i11.x(0, strArr[i12 % strArr.length], true);
    }

    public static final void f1(DebugSpineActivity debugSpineActivity, View view) {
        com.esotericsoftware.spine.a i11 = debugSpineActivity.f19650b.i();
        String[] strArr = debugSpineActivity.f19654f;
        int i12 = debugSpineActivity.f19653e;
        debugSpineActivity.f19653e = i12 + 1;
        i11.x(0, strArr[i12 % strArr.length], true);
    }

    public static final void g1(DebugSpineActivity debugSpineActivity, View view) {
        com.esotericsoftware.spine.a i11 = debugSpineActivity.f19651c.i();
        String[] strArr = debugSpineActivity.f19654f;
        int i12 = debugSpineActivity.f19653e;
        debugSpineActivity.f19653e = i12 + 1;
        i11.x(0, strArr[i12 % strArr.length], true);
    }

    public static final gs.b0 h1(DebugSpineActivity debugSpineActivity) {
        return gs.b0.d(debugSpineActivity.getLayoutInflater());
    }

    @m80.k
    public final com.esotericsoftware.spine.android.c V0() {
        return this.f19651c;
    }

    @m80.k
    public final com.esotericsoftware.spine.android.c W0() {
        return this.f19650b;
    }

    @m80.k
    public final com.esotericsoftware.spine.android.c X0() {
        return this.f19649a;
    }

    @m80.k
    public final com.esotericsoftware.spine.android.c Y0() {
        return this.f19652d;
    }

    public final int Z0() {
        return this.f19653e;
    }

    public final gs.b0 a1() {
        return (gs.b0) this.f19655g.getValue();
    }

    @m80.k
    public final String[] b1() {
        return this.f19654f;
    }

    public final void i1(int i11) {
        this.f19653e = i11;
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@m80.l Bundle bundle) {
        super.onCreate(bundle);
        setContentView(a1().getRoot());
        c1();
    }
}
