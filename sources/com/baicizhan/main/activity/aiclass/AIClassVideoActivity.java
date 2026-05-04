package com.baicizhan.main.activity.aiclass;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.main.activity.aiclass.AIClassVideoActivity;
import com.baicizhan.main.activity.aiclass.LoadingStatus;
import com.baicizhan.main.activity.aiclass.video.BczVideoView;
import com.baicizhan.main.activity.aiclass.video.PlayerState;
import com.baicizhan.main.activity.aiclass.video.VideoControllerView;
import com.google.android.material.timepicker.RadialViewGroup;
import com.jiongji.andriod.card.R;
import gd.m;
import gs.g;
import gs.q3;
import java.util.LinkedHashMap;
import java.util.List;
import jd.e0;
import kc.d;
import kc.q;
import kc.u;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import ma.t;
import sa.h;
import w00.o;
import yz.g2;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nAIClassVideoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIClassVideoActivity.kt\ncom/baicizhan/main/activity/aiclass/AIClassVideoActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,319:1\n1#2:320\n*E\n"})
/* loaded from: classes4.dex */
public final class AIClassVideoActivity extends BaseAppCompatActivity implements VideoControllerView.c {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final String f18238g = "chapter_id";

    /* renamed from: a, reason: collision with root package name */
    @l
    public g f18240a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public gd.l f18241b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public hd.c f18242c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public String f18243d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f18236e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f18237f = 8;

    /* renamed from: h, reason: collision with root package name */
    public static final String f18239h = AIClassVideoActivity.class.getSimpleName();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @o
        public final void a(@k Context context, long j11) {
            g0.p(context, "context");
            Intent intent = new Intent(context, (Class<?>) AIClassVideoActivity.class);
            intent.putExtra("chapter_id", j11);
            context.startActivity(intent);
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements Observer, b0 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f18247a;

        public c(x00.l function) {
            g0.p(function, "function");
            this.f18247a = function;
        }

        public final boolean equals(@l Object obj) {
            if ((obj instanceof Observer) && (obj instanceof b0)) {
                return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.b0
        @k
        public final w<?> getFunctionDelegate() {
            return this.f18247a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f18247a.invoke(obj);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d implements q {
        public d() {
        }

        @Override // kc.q
        public void onDialogNegativeClick(View v11) {
            g0.p(v11, "v");
            hd.d.f59178b.a(AIClassVideoActivity.this.getIntent().getLongExtra("chapter_id", 0L)).show(AIClassVideoActivity.this.getSupportFragmentManager(), "quit");
        }

        @Override // kc.q
        public void onDialogPositiveClick(View v11) {
            g0.p(v11, "v");
            gd.l lVar = AIClassVideoActivity.this.f18241b;
            if (lVar != null) {
                lVar.M();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAIClassVideoActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIClassVideoActivity.kt\ncom/baicizhan/main/activity/aiclass/AIClassVideoActivity$showSkipConfirmDialog$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,319:1\n1#2:320\n*E\n"})
    public static final class e implements q {
        public e() {
        }

        @Override // kc.q
        public void onDialogNegativeClick(View v11) {
            g0.p(v11, "v");
            Long valueOf = Long.valueOf(AIClassVideoActivity.this.getIntent().getLongExtra("chapter_id", -1L));
            if (valueOf.longValue() == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("type", ma.b.T);
                linkedHashMap.put("chapter_id", String.valueOf(longValue));
                g2 g2Var = g2.f100423a;
                ma.l.e(t.f73027z, ma.a.W2, linkedHashMap);
            }
            gd.l lVar = AIClassVideoActivity.this.f18241b;
            if (lVar != null) {
                lVar.w();
            }
        }

        @Override // kc.q
        public void onDialogPositiveClick(View v11) {
            g0.p(v11, "v");
            Long valueOf = Long.valueOf(AIClassVideoActivity.this.getIntent().getLongExtra("chapter_id", -1L));
            if (valueOf.longValue() == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("type", ma.b.S);
                linkedHashMap.put("chapter_id", String.valueOf(longValue));
                g2 g2Var = g2.f100423a;
                ma.l.e(t.f73027z, ma.a.W2, linkedHashMap);
            }
            gd.l lVar = AIClassVideoActivity.this.f18241b;
            if (lVar != null) {
                lVar.M();
            }
        }
    }

    public static final void X0(AIClassVideoActivity aIClassVideoActivity, View view) {
        aIClassVideoActivity.k1();
    }

    public static final void Y0(AIClassVideoActivity aIClassVideoActivity, View view) {
        gd.l lVar = aIClassVideoActivity.f18241b;
        if (lVar != null) {
            lVar.N();
        }
    }

    public static final g2 a1(AIClassVideoActivity aIClassVideoActivity, id.q qVar) {
        if (qVar == null) {
            return g2.f100423a;
        }
        hd.c.f59166e.a(qVar.h()).show(aIClassVideoActivity.getSupportFragmentManager(), "question");
        return g2.f100423a;
    }

    public static final g2 b1(AIClassVideoActivity aIClassVideoActivity, String str) {
        AIClassVideoActivity aIClassVideoActivity2;
        if (TextUtils.isEmpty(str)) {
            aIClassVideoActivity2 = aIClassVideoActivity;
        } else {
            g0.m(str);
            aIClassVideoActivity2 = aIClassVideoActivity;
            BczWebExecutorKt.startFullScreenWeb$default(aIClassVideoActivity2, str, 0, 0, 12, null);
        }
        aIClassVideoActivity2.finish();
        return g2.f100423a;
    }

    public static final g2 c1(AIClassVideoActivity aIClassVideoActivity, Integer num) {
        q3 q3Var;
        TextView textView;
        String string;
        g gVar = aIClassVideoActivity.f18240a;
        if (gVar != null && (q3Var = gVar.f54968a) != null && (textView = q3Var.f56444b) != null) {
            if (num != null && num.intValue() == 0) {
                string = "";
            } else {
                g0.m(num);
                string = aIClassVideoActivity.getString(num.intValue());
                g0.o(string, "getString(...)");
            }
            textView.setText(string);
        }
        return g2.f100423a;
    }

    public static final g2 d1(AIClassVideoActivity aIClassVideoActivity, LoadingStatus loadingStatus) {
        q3 q3Var;
        g gVar = aIClassVideoActivity.f18240a;
        if (gVar != null && (q3Var = gVar.f54968a) != null) {
            q3Var.f56445c.setVisibility(loadingStatus == LoadingStatus.SUCCESS ? 8 : 0);
            if (loadingStatus != LoadingStatus.LOADING) {
                q3Var.f56446d.setVisibility(8);
                q3Var.f56444b.setVisibility(0);
                q3Var.f56447e.setVisibility(0);
            } else {
                q3Var.f56446d.setVisibility(0);
                q3Var.f56444b.setVisibility(8);
                q3Var.f56447e.setVisibility(8);
            }
        }
        return g2.f100423a;
    }

    public static final g2 e1(AIClassVideoActivity aIClassVideoActivity, PlayerState playerState) {
        VideoControllerView videoControllerView;
        g gVar = aIClassVideoActivity.f18240a;
        if (gVar != null && (videoControllerView = gVar.f54969b) != null) {
            videoControllerView.setPlaying(playerState == PlayerState.PLAYING);
        }
        return g2.f100423a;
    }

    public static final g2 f1(AIClassVideoActivity aIClassVideoActivity, Long l11) {
        VideoControllerView videoControllerView;
        g gVar = aIClassVideoActivity.f18240a;
        if (gVar != null && (videoControllerView = gVar.f54969b) != null) {
            if (l11.longValue() <= 0) {
                l11 = null;
            }
            if (l11 == null) {
                return g2.f100423a;
            }
            videoControllerView.A0(0L, l11.longValue());
        }
        return g2.f100423a;
    }

    public static final g2 g1(AIClassVideoActivity aIClassVideoActivity, Long l11) {
        VideoControllerView videoControllerView;
        g gVar = aIClassVideoActivity.f18240a;
        if (gVar != null && (videoControllerView = gVar.f54969b) != null) {
            g0.m(l11);
            VideoControllerView.B0(videoControllerView, l11.longValue(), 0L, 2, null);
        }
        return g2.f100423a;
    }

    public static final g2 h1(AIClassVideoActivity aIClassVideoActivity, String str) {
        aIClassVideoActivity.f18243d = str;
        return g2.f100423a;
    }

    public static final g2 i1(AIClassVideoActivity aIClassVideoActivity, Bitmap bitmap) {
        VideoControllerView videoControllerView;
        g gVar = aIClassVideoActivity.f18240a;
        if (gVar != null && (videoControllerView = gVar.f54969b) != null) {
            if (bitmap == null) {
                return g2.f100423a;
            }
            videoControllerView.v0(bitmap);
        }
        return g2.f100423a;
    }

    public static final g2 j1(AIClassVideoActivity aIClassVideoActivity, Boolean bool) {
        VideoControllerView videoControllerView;
        g gVar = aIClassVideoActivity.f18240a;
        if (gVar != null && (videoControllerView = gVar.f54969b) != null) {
            g0.m(bool);
            videoControllerView.setFinished(bool.booleanValue());
        }
        return g2.f100423a;
    }

    public static final void n1(h hVar, AIClassVideoActivity aIClassVideoActivity, boolean z11, List mutableList, List mutableList1) {
        g0.p(mutableList, "mutableList");
        g0.p(mutableList1, "mutableList1");
        hVar.f();
        if (!z11) {
            va.g.g(R.string.common_toast_no_storage_permission, 0);
            return;
        }
        gd.l lVar = aIClassVideoActivity.f18241b;
        if (lVar != null) {
            lVar.P();
        }
        gd.l lVar2 = aIClassVideoActivity.f18241b;
        if (lVar2 != null) {
            lVar2.M();
        }
    }

    @o
    public static final void o1(@k Context context, long j11) {
        f18236e.a(context, j11);
    }

    @Override // com.baicizhan.main.activity.aiclass.video.VideoControllerView.c
    public void M(long j11) {
        e0 C;
        gd.l lVar = this.f18241b;
        if (lVar == null || (C = lVar.C()) == null) {
            return;
        }
        C.t(j11);
    }

    @Override // com.baicizhan.main.activity.aiclass.video.VideoControllerView.c
    public void T(@k VideoControllerView.State state) {
        g0.p(state, "state");
        gd.l lVar = this.f18241b;
        if (lVar != null) {
            lVar.O(state == VideoControllerView.State.SEEKING);
        }
    }

    public final void W0() {
        q3 q3Var;
        TextView textView;
        q3 q3Var2;
        ImageView imageView;
        VideoControllerView videoControllerView;
        BczVideoView bczVideoView;
        getWindow().addFlags(8192);
        getWindow().addFlags(128);
        g gVar = (g) DataBindingUtil.setContentView(this, R.layout.activity_ai_class_video);
        this.f18240a = gVar;
        if (gVar != null && (bczVideoView = gVar.f54970c) != null) {
            gd.l lVar = this.f18241b;
            g0.m(lVar);
            bczVideoView.j(lVar.C(), this);
        }
        g gVar2 = this.f18240a;
        if (gVar2 != null && (videoControllerView = gVar2.f54969b) != null) {
            videoControllerView.setOnControlListener(this);
        }
        g gVar3 = this.f18240a;
        if (gVar3 != null && (q3Var2 = gVar3.f54968a) != null && (imageView = q3Var2.f56443a) != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: gd.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    AIClassVideoActivity.X0(AIClassVideoActivity.this, view);
                }
            });
        }
        g gVar4 = this.f18240a;
        if (gVar4 == null || (q3Var = gVar4.f54968a) == null || (textView = q3Var.f56447e) == null) {
            return;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: gd.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIClassVideoActivity.Y0(AIClassVideoActivity.this, view);
            }
        });
    }

    public final void Z0() {
        gd.l lVar = (gd.l) new ViewModelProvider(this, new m(this)).get(gd.l.class);
        lVar.A().observe(this, new c(new x00.l() { // from class: gd.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 a12;
                a12 = AIClassVideoActivity.a1(AIClassVideoActivity.this, (id.q) obj);
                return a12;
            }
        }));
        lVar.y().observe(this, new c(new x00.l() { // from class: gd.t
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 b12;
                b12 = AIClassVideoActivity.b1(AIClassVideoActivity.this, (String) obj);
                return b12;
            }
        }));
        lVar.z().d().observe(this, new c(new x00.l() { // from class: gd.u
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 c12;
                c12 = AIClassVideoActivity.c1(AIClassVideoActivity.this, (Integer) obj);
                return c12;
            }
        }));
        lVar.z().f().observe(this, new c(new x00.l() { // from class: gd.v
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 d12;
                d12 = AIClassVideoActivity.d1(AIClassVideoActivity.this, (LoadingStatus) obj);
                return d12;
            }
        }));
        lVar.C().o().observe(this, new c(new x00.l() { // from class: gd.w
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 e12;
                e12 = AIClassVideoActivity.e1(AIClassVideoActivity.this, (PlayerState) obj);
                return e12;
            }
        }));
        lVar.C().n().observe(this, new c(new x00.l() { // from class: gd.x
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f12;
                f12 = AIClassVideoActivity.f1(AIClassVideoActivity.this, (Long) obj);
                return f12;
            }
        }));
        lVar.C().m().observe(this, new c(new x00.l() { // from class: gd.y
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 g12;
                g12 = AIClassVideoActivity.g1(AIClassVideoActivity.this, (Long) obj);
                return g12;
            }
        }));
        lVar.C().p().observe(this, new c(new x00.l() { // from class: gd.z
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 h12;
                h12 = AIClassVideoActivity.h1(AIClassVideoActivity.this, (String) obj);
                return h12;
            }
        }));
        lVar.B().observe(this, new c(new x00.l() { // from class: gd.o
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 i12;
                i12 = AIClassVideoActivity.i1(AIClassVideoActivity.this, (Bitmap) obj);
                return i12;
            }
        }));
        lVar.D().observe(this, new c(new x00.l() { // from class: gd.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 j12;
                j12 = AIClassVideoActivity.j1(AIClassVideoActivity.this, (Boolean) obj);
                return j12;
            }
        }));
        this.f18241b = lVar;
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity
    public boolean enableCustomSystemBar() {
        return true;
    }

    @Override // com.baicizhan.main.activity.aiclass.video.VideoControllerView.c
    @l
    public Bitmap i0(@k String positionDesc, int i11, int i12, boolean z11) {
        g0.p(positionDesc, "positionDesc");
        String str = this.f18243d;
        if (str == null) {
            return null;
        }
        String str2 = str + "." + positionDesc + ".jpg";
        long currentTimeMillis = System.currentTimeMillis();
        if (!z11) {
            return hc.c.p(str2).get();
        }
        hc.c.l(str2).c(i11, i12, new b(positionDesc, z11, currentTimeMillis));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k1() {
        gd.l lVar = this.f18241b;
        if (lVar != null) {
            lVar.K();
        }
        mc.a.n(this, ((u) ((u.a) d.a.r(d.a.I(new u.a(this).L(R.string.ai_class_close_confirm_dialog_title).U(R.string.ai_class_close_confirm_dialog_content), R.string.ai_class_close_confirm_dialog_continue, null, null, 6, null), R.string.ai_class_close_confirm_dialog_quit, null, 2, null)).d()).f0(new d()), "close");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l1() {
        gd.l lVar = this.f18241b;
        if (lVar != null) {
            lVar.K();
        }
        mc.a.n(this, ((u) ((u.a) d.a.r(d.a.I(new u.a(this).L(R.string.ai_class_skip_confirm_dialog_title).U(R.string.ai_class_skip_confirm_dialog_content), R.string.ai_class_skip_confirm_dialog_continue, null, null, 6, null), R.string.ai_class_skip_confirm_dialog_quit, null, 2, null)).d()).f0(new e()), RadialViewGroup.f32580d);
    }

    public final void m1() {
        if (Build.VERSION.SDK_INT > 28 || jt.c.c(this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            gd.l lVar = this.f18241b;
            if (lVar != null) {
                lVar.P();
                return;
            }
            return;
        }
        gd.l lVar2 = this.f18241b;
        if (lVar2 != null) {
            lVar2.K();
        }
        final h hVar = new h(this, false, 2, null);
        h.l(hVar, "android.permission.WRITE_EXTERNAL_STORAGE", null, 2, null);
        jt.c.b(this).b("android.permission.WRITE_EXTERNAL_STORAGE").i(new kt.d() { // from class: gd.q
            @Override // kt.d
            public final void a(boolean z11, List list, List list2) {
                AIClassVideoActivity.n1(sa.h.this, this, z11, list, list2);
            }
        });
    }

    @Override // com.baicizhan.main.activity.aiclass.video.VideoControllerView.c
    public void o() {
        m1();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        Z0();
        W0();
        p1();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        BczVideoView bczVideoView;
        g gVar = this.f18240a;
        if (gVar != null && (bczVideoView = gVar.f54970c) != null) {
            bczVideoView.q();
        }
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, @l KeyEvent keyEvent) {
        if (i11 != 4) {
            return super.onKeyDown(i11, keyEvent);
        }
        r0();
        return true;
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        gd.l lVar = this.f18241b;
        if (lVar != null) {
            lVar.K();
        }
        super.onPause();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        gd.l lVar = this.f18241b;
        if (lVar != null) {
            lVar.M();
        }
        super.onResume();
    }

    public final void p1() {
        Long valueOf = Long.valueOf(getIntent().getLongExtra("chapter_id", -1L));
        if (valueOf.longValue() == -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            finish();
            return;
        }
        long longValue = valueOf.longValue();
        gd.l lVar = this.f18241b;
        if (lVar != null) {
            lVar.G(longValue);
        }
    }

    @Override // com.baicizhan.main.activity.aiclass.video.VideoControllerView.c
    public void q(float f11) {
        e0 C;
        gd.l lVar = this.f18241b;
        if (lVar == null || (C = lVar.C()) == null) {
            return;
        }
        C.r(f11);
    }

    @Override // com.baicizhan.main.activity.aiclass.video.VideoControllerView.c
    public void r0() {
        k1();
    }

    @Override // com.baicizhan.main.activity.aiclass.video.VideoControllerView.c
    public void s0() {
        gd.l lVar = this.f18241b;
        if (lVar != null) {
            lVar.L();
        }
    }

    @Override // com.baicizhan.main.activity.aiclass.video.VideoControllerView.c
    public void w(boolean z11) {
        if (!z11) {
            l1();
            return;
        }
        gd.l lVar = this.f18241b;
        if (lVar != null) {
            lVar.w();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements hc.d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f18244a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f18245b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f18246c;

        public b(String str, boolean z11, long j11) {
            this.f18244a = str;
            this.f18245b = z11;
            this.f18246c = j11;
        }

        @Override // hc.d
        public void onSuccess() {
        }

        @Override // hc.d
        public void a(Exception exc) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }
}
