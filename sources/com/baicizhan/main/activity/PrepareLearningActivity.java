package com.baicizhan.main.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import androidx.annotation.NonNull;
import com.baicizhan.base.BaseActivity;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.activity.PrepareLearningActivity;
import com.baicizhan.main.rx.SchedulePrepareObservables;
import com.baicizhan.online.advertise_api.AdvertiseLoadingModule;
import com.jiongji.andriod.card.R;
import gi.f0;
import hg.n;
import i9.j;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import kc.r;
import kc.u;
import org.junit.jupiter.api.j2;
import q9.l;
import q9.x;
import qb0.h;
import r9.b;
import sh.k;
import sh.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class PrepareLearningActivity extends BaseActivity {

    /* renamed from: i, reason: collision with root package name */
    public static final String f18143i = "PrepareLearningActivity_TAG";

    /* renamed from: a, reason: collision with root package name */
    public r9.b f18144a;

    /* renamed from: c, reason: collision with root package name */
    public h f18146c;

    /* renamed from: f, reason: collision with root package name */
    public g f18149f;

    /* renamed from: g, reason: collision with root package name */
    public h f18150g;

    /* renamed from: h, reason: collision with root package name */
    public IAudioPlayer f18151h;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18145b = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18147d = false;

    /* renamed from: e, reason: collision with root package name */
    public Handler f18148e = new Handler();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f0.b(PrepareLearningActivity.this, f0.f53762b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<Boolean> {
        public b() {
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            if (aBoolean.booleanValue()) {
                if (PrepareLearningActivity.this.f18150g != null) {
                    PrepareLearningActivity.this.f18150g.unsubscribe();
                }
                PrepareLearningActivity.this.O0();
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends r {
        public c() {
        }

        @Override // kc.r, kc.q
        public void onDialogNegativeClick(@NonNull View view) {
            uf.a.c();
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View view) {
            uf.a.f(PrepareLearningActivity.this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Callable<Object> {
        public e() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() throws Exception {
            k.D().L();
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements b.d {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<PrepareLearningActivity> f18157a;

        @Override // r9.b.d
        public void a() {
            PrepareLearningActivity prepareLearningActivity = this.f18157a.get();
            if (prepareLearningActivity == null) {
                return;
            }
            prepareLearningActivity.f18145b = true;
            prepareLearningActivity.N0();
        }

        public f(PrepareLearningActivity activity) {
            this.f18157a = new WeakReference<>(activity);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<PrepareLearningActivity> f18158a;

        public g(PrepareLearningActivity activity) {
            this.f18158a = new WeakReference<>(activity);
        }

        @Override // java.lang.Runnable
        public void run() {
            PrepareLearningActivity prepareLearningActivity = this.f18158a.get();
            if (prepareLearningActivity == null || prepareLearningActivity.isFinishing()) {
                return;
            }
            prepareLearningActivity.startActivity(new Intent(prepareLearningActivity, (Class<?>) LearningActivity.class));
            prepareLearningActivity.finish();
        }
    }

    public final void N0() {
        int z11 = k.D().z();
        qb.c.b(f18143i, "checkPrepared: " + z11 + j2.O + this.f18145b, new Object[0]);
        if (z11 == 0 || !this.f18145b || isFinishing() || this.f18147d) {
            return;
        }
        qb.c.b(f18143i, "checkPrepared start learning", new Object[0]);
        this.f18147d = true;
        g gVar = this.f18149f;
        if (gVar == null) {
            this.f18149f = new g(this);
        } else {
            this.f18148e.removeCallbacks(gVar);
        }
        this.f18148e.postDelayed(this.f18149f, this.f18144a.k());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void O0() {
        x.r().z0(true);
        ad.c u11 = x.r().s().u();
        qb.c.i(f18143i, "ss == null ? %b", Boolean.valueOf(u11 == null));
        if (u11 == null) {
            mc.a.m(this, ((u) ((u.a) ((u.a) new u.a(this).U(R.string.main_unknown_info).C(R.string.main_alert_no_road_map_confirm)).n(R.string.main_alert_no_road_map_cancel)).d()).f0(new c()));
            return;
        }
        k.D().C(new o(u11));
        k.D().Q(this);
        this.f18146c = k.D().y().I3(tb0.a.a()).r5(new d());
        rx.c.z2(new e()).w5(bc0.c.e()).p5();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (x.r().c(this)) {
            return;
        }
        if (x.r().s() == null) {
            finish();
            return;
        }
        setVolumeControlStream(3);
        l lVar = new l(this);
        this.f18151h = lVar;
        lVar.j(new IAudioPlayer.a() { // from class: fd.f3
            @Override // com.baicizhan.client.framework.audio.IAudioPlayer.a
            public final void onPlayError(int i11, int i12) {
                qb.c.d(PrepareLearningActivity.f18143i, "audio error %d, %d", Integer.valueOf(i11), Integer.valueOf(i12));
            }
        });
        if (j.c(j.f60415f, true)) {
            this.f18151h.a(R.raw.chop);
        }
        setContentView(R.layout.advertisement_layout);
        this.f18144a = r9.b.i(this, null).q(AdvertiseLoadingModule.MODULE_MAIN).p(new f());
        UserRecord p11 = x.r().p();
        if (p11 != null && p11.getIsNewUser()) {
            this.f18144a.u(true);
        }
        this.f18144a.m();
        n.a();
        findViewById(R.id.ad_content).post(new a());
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        h hVar = this.f18146c;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f18146c.unsubscribe();
        }
        n.a();
        r9.b bVar = this.f18144a;
        if (bVar != null) {
            bVar.h();
        }
        g gVar = this.f18149f;
        if (gVar != null) {
            this.f18148e.removeCallbacks(gVar);
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        h hVar = this.f18150g;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f18150g.unsubscribe();
        }
        this.f18150g = null;
        IAudioPlayer iAudioPlayer = this.f18151h;
        if (iAudioPlayer != null) {
            iAudioPlayer.destroy();
            this.f18151h = null;
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f18150g != null) {
            return;
        }
        this.f18150g = SchedulePrepareObservables.E().I3(tb0.a.a()).r5(new b());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends qb0.g<sh.f> {
        public d() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            va.g.g(R.string.main_unknown_info, 0);
            PrepareLearningActivity.this.finish();
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(sh.f problemAsset) {
            PrepareLearningActivity.this.N0();
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
