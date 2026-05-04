package com.baicizhan.main.selftest.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import bt.q;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.managers.experience.TaskAction;
import com.baicizhan.client.business.util.RxFlowUtilsKt;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.selftest.activity.WalkListenActivity;
import com.baicizhan.main.wikiv2.studyv2.data.EntryAction;
import com.baicizhan.main.wikiv2.studyv2.data.EntryPage;
import com.baicizhan.main.wikiv2.studyv2.data.WikiStyle;
import com.baicizhan.main.wikiv2.studyv2.data.u0;
import com.baicizhan.main.wikiv2.studyv2.data.v0;
import com.bumptech.glide.load.engine.GlideException;
import com.jiongji.andriod.card.R;
import com.kyleduo.switchbutton.SwitchButton;
import fd.t1;
import gs.lo;
import hj.p;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import javax.inject.Inject;
import kc.r;
import kc.u;
import ma.t;
import ma.v;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@qu.b
/* loaded from: classes4.dex */
public class WalkListenActivity extends vh.a implements View.OnClickListener, IAudioPlayer.b, IAudioPlayer.a, kb.f, li.f {
    public static final String L = "WalkListenActivity_TAG";
    public static final String M = "user_set_speed";
    public static final int N = 0;
    public static final int O = 1;
    public static final int P = 0;
    public va.f A;
    public PowerManager.WakeLock H;
    public qb0.h J;
    public n K;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public u9.f f24990e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f24991f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f24992g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f24993h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f24994i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f24995j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f24996k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f24997l;

    /* renamed from: m, reason: collision with root package name */
    public m f24998m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f24999n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f25000o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f25001p;

    /* renamed from: q, reason: collision with root package name */
    public View f25002q;

    /* renamed from: r, reason: collision with root package name */
    public li.c f25003r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f25004s;

    /* renamed from: t, reason: collision with root package name */
    public IAudioPlayer f25005t;

    /* renamed from: x, reason: collision with root package name */
    public qb0.h f25009x;

    /* renamed from: y, reason: collision with root package name */
    public sh.f f25010y;

    /* renamed from: z, reason: collision with root package name */
    public sh.f f25011z;

    /* renamed from: u, reason: collision with root package name */
    public boolean f25006u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f25007v = false;

    /* renamed from: w, reason: collision with root package name */
    public String f25008w = "1.0x";
    public boolean B = false;
    public int C = 0;
    public boolean D = false;
    public int E = 0;
    public Handler F = new Handler();
    public Runnable G = new d();
    public int I = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements IAudioPlayer.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TopicRecord f25012a;

        public a(final TopicRecord val$record) {
            this.f25012a = val$record;
        }

        @Override // com.baicizhan.client.framework.audio.IAudioPlayer.a
        public void onPlayError(int what, int extra) {
            qb.c.d("", "walklisten play word error, what[%d], extra[%d], audio[%s]", Integer.valueOf(what), Integer.valueOf(extra), this.f25012a.wordAudio);
            if (WalkListenActivity.this.isFinishing()) {
                return;
            }
            if (!zh.b.d()) {
                WalkListenActivity.this.u1();
                WalkListenActivity.this.m1(false);
                return;
            }
            WalkListenActivity.this.f25005t.f(WalkListenActivity.this);
            WalkListenActivity.this.f25005t.j(WalkListenActivity.this);
            IAudioPlayer iAudioPlayer = WalkListenActivity.this.f25005t;
            TopicRecord topicRecord = this.f25012a;
            ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, topicRecord.sentenceAudio);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Callable<Void> {
        public c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            qb.c.i(WalkListenActivity.L, "circlePlay init ProblemLoader", new Object[0]);
            sh.k.D().C(yh.d.d().f());
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WalkListenActivity.this.z1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements IAudioPlayer.a {
        public e() {
        }

        @Override // com.baicizhan.client.framework.audio.IAudioPlayer.a
        public void onPlayError(int what, int extra) {
            qb.c.d(WalkListenActivity.L, "audip error %d, %d", Integer.valueOf(what), Integer.valueOf(extra));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            WalkListenActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements CompoundButton.OnCheckedChangeListener {
        public g() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            zh.b.g(isChecked);
            WalkListenActivity.this.f24999n.setVisibility(isChecked ? 0 : 8);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements CompoundButton.OnCheckedChangeListener {
        public h() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            zh.b.f(isChecked);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i implements m.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f25021a;

        public i(final View val$v) {
            this.f25021a = val$v;
        }

        @Override // com.baicizhan.main.selftest.activity.WalkListenActivity.m.a
        public void a(String speed) {
            if (speed.equals(WalkListenActivity.this.f25008w)) {
                qb.c.i(WalkListenActivity.L, "duplicate set speed %s", speed);
                return;
            }
            WalkListenActivity.this.f25008w = speed;
            WalkListenActivity.this.I1();
            qb.c.i(WalkListenActivity.L, "%s", speed);
            try {
                WalkListenActivity.this.f25005t.b(Float.parseFloat(speed.replace("x", "")));
                nc.b.b().p(WalkListenActivity.M, WalkListenActivity.this.f25008w);
                WalkListenActivity.this.K.removeMessages(0);
            } catch (Exception e11) {
                qb.c.c(WalkListenActivity.L, "", e11);
            }
        }

        @Override // com.baicizhan.main.selftest.activity.WalkListenActivity.m.a
        public void dismiss() {
            final View view = this.f25021a;
            view.postDelayed(new Runnable() { // from class: vh.f
                @Override // java.lang.Runnable
                public final void run() {
                    view.setEnabled(true);
                }
            }, 300L);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WalkListenActivity.this.f25002q.setVisibility(8);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class l implements IAudioPlayer.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TopicRecord f25026a;

        public l(final TopicRecord val$record) {
            this.f25026a = val$record;
        }

        public final /* synthetic */ void b(TopicRecord topicRecord) {
            WalkListenActivity.this.f25005t.f(WalkListenActivity.this);
            WalkListenActivity.this.f25005t.j(WalkListenActivity.this);
            ZPackUtils.loadAudioCompat(WalkListenActivity.this.f25005t, topicRecord, topicRecord.sentenceAudio);
        }

        @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
        public void onPlayStateChanged(IAudioPlayer.State state) {
            if (WalkListenActivity.this.isFinishing()) {
                return;
            }
            if (state != IAudioPlayer.State.Completed) {
                if (state == IAudioPlayer.State.Playing) {
                    WalkListenActivity.this.m1(true);
                    return;
                }
                if (IAudioPlayer.State.Stopped == state) {
                    WalkListenActivity.this.f25006u = false;
                }
                WalkListenActivity.this.m1(false);
                return;
            }
            if (!zh.b.d()) {
                WalkListenActivity.this.u1();
                WalkListenActivity.this.m1(false);
            } else {
                n nVar = WalkListenActivity.this.K;
                final TopicRecord topicRecord = this.f25026a;
                nVar.postDelayed(new Runnable() { // from class: vh.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        WalkListenActivity.l.this.b(topicRecord);
                    }
                }, 800L);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class m {

        /* renamed from: a, reason: collision with root package name */
        public a f25028a;

        /* renamed from: b, reason: collision with root package name */
        public lo f25029b;

        /* renamed from: c, reason: collision with root package name */
        public PopupWindow f25030c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public interface a {
            void a(String speed);

            void dismiss();
        }

        public m(a speedListener) {
            this.f25028a = speedListener;
        }

        public final /* synthetic */ void c(View view) {
            this.f25028a.a(((TextView) view).getText().toString());
            this.f25030c.dismiss();
        }

        public final /* synthetic */ void d() {
            a aVar = this.f25028a;
            if (aVar != null) {
                aVar.dismiss();
            }
        }

        public void e(View v11) {
            lo e11 = lo.e(LayoutInflater.from(v11.getContext()));
            this.f25029b = e11;
            e11.j(new View.OnClickListener() { // from class: vh.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WalkListenActivity.m.this.c(view);
                }
            });
            PopupWindow popupWindow = this.f25030c;
            if (popupWindow != null && popupWindow.isShowing()) {
                this.f25030c.dismiss();
            }
            PopupWindow popupWindow2 = new PopupWindow(this.f25029b.getRoot(), -2, -2);
            this.f25030c = popupWindow2;
            popupWindow2.setOutsideTouchable(true);
            this.f25030c.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: vh.i
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    WalkListenActivity.m.this.d();
                }
            });
            this.f25030c.showAsDropDown(v11, -xb.i.a(v11.getContext(), 30.0f), xb.i.a(v11.getContext(), 15.0f));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class n extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<WalkListenActivity> f25031a;

        public n(WalkListenActivity activity) {
            this.f25031a = new WeakReference<>(activity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            WalkListenActivity walkListenActivity = this.f25031a.get();
            if (walkListenActivity != null && msg.what == 0) {
                walkListenActivity.F1();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class o implements q.g {

        /* renamed from: a, reason: collision with root package name */
        public final TopicRecord f25032a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f25033b = false;

        public o(TopicRecord record) {
            this.f25032a = record;
        }

        @Override // bt.q.g
        public void a(q anim) {
            if (anim.Q() < 0.5f || this.f25033b) {
                return;
            }
            WalkListenActivity.this.f24993h.setText(this.f25032a.word);
            WalkListenActivity.this.f24995j.setText(this.f25032a.wordMean.replace(GlideException.a.f28776d, "\n"));
            WalkListenActivity.this.f24994i.setText(this.f25032a.phonetic);
            WalkListenActivity.this.f25001p.setText(this.f25032a.sentenceTrans);
            WalkListenActivity.this.f25000o.setText(this.f25032a.sentence);
            this.f25033b = true;
        }
    }

    private void A1() {
        this.f25003r.j(this);
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.business_push_down_in, R.anim.business_push_down_out).add(R.id.walklisten_wiki_container, (Fragment) this.f25003r).commitAllowingStateLoss();
    }

    public static void C1(Context context) {
        context.startActivity(new Intent(context, (Class<?>) WalkListenActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F1() {
        int i11 = this.I + 1;
        this.I = i11;
        if (i11 == 3) {
            ma.l.a(t.f73011j, ma.a.W0);
        }
        if (sh.k.D().J() == 0) {
            qb.c.i(L, "nextId == 0", new Object[0]);
            s1();
        } else {
            if (this.f25006u || 1 == this.C || this.B) {
                return;
            }
            D1();
            sh.k.D().t(this.f25010y);
            this.f25011z = this.f25010y;
            this.f25009x = sh.k.D().I().r5(new k());
        }
    }

    private void J1() {
        this.f24991f.setText(getString(R.string.walklisten_waiting_pass, Integer.valueOf(yh.d.d().e())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o1() {
        va.f fVar = this.A;
        if (fVar == null || !fVar.isShowing() || isFinishing()) {
            return;
        }
        this.A.dismiss();
    }

    private void p1() {
        findViewById(R.id.walklisten_home).setOnClickListener(new f());
        this.f24991f = (TextView) findViewById(R.id.walklisten_waitting_pass);
        TextView textView = (TextView) findViewById(R.id.walklisten_last_topic);
        this.f24992g = textView;
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) findViewById(R.id.walklisten_word);
        this.f24993h = textView2;
        textView2.setOnClickListener(this);
        this.f24994i = (TextView) findViewById(R.id.walklisten_accent);
        this.f24995j = (TextView) findViewById(R.id.walklisten_cnmean);
        this.f24996k = (ImageView) findViewById(R.id.walklisten_sound);
        this.f24999n = (LinearLayout) findViewById(R.id.sentence_area);
        this.f25000o = (TextView) findViewById(R.id.sentence_en);
        this.f25001p = (TextView) findViewById(R.id.sentence_ch);
        ThemeResUtil.setSoundBg(this, this.f24996k);
        m1(false);
        SwitchButton switchButton = (SwitchButton) findViewById(R.id.walklisten_sentence_switch);
        switchButton.setChecked(zh.b.d());
        this.f24999n.setVisibility(zh.b.d() ? 0 : 8);
        switchButton.setOnCheckedChangeListener(new g());
        SwitchButton switchButton2 = (SwitchButton) findViewById(R.id.circle_play_switch);
        switchButton2.setChecked(zh.b.c());
        switchButton2.setOnCheckedChangeListener(new h());
        TextView textView3 = (TextView) findViewById(R.id.play_speed);
        this.f24997l = textView3;
        textView3.setOnClickListener(new View.OnClickListener() { // from class: vh.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WalkListenActivity.this.B1(view);
            }
        });
        I1();
        this.f25002q = findViewById(R.id.walklisten_wiki_container);
        TextView textView4 = (TextView) findViewById(R.id.toggle);
        this.f25004s = textView4;
        textView4.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r1() {
        v1();
        J1();
        TopicRecord j11 = this.f25010y.j();
        bt.l l11 = bt.l.J0(this.f24993h, "alpha", 1.0f, 0.0f, 1.0f).l(800L);
        l11.G(new o(j11));
        l11.s();
        bt.l.J0(this.f24995j, "alpha", 1.0f, 0.0f, 1.0f).l(800L).s();
        bt.l.J0(this.f24994i, "alpha", 1.0f, 0.0f, 1.0f).l(800L).s();
        bt.l.J0(this.f24999n, "alpha", 1.0f, 0.0f, 1.0f).l(800L).s();
        t1(j11);
        sh.f fVar = this.f25011z;
        if (fVar != null) {
            TopicRecord j12 = fVar.j();
            this.f24992g.setText(j12.word + " " + j12.wordMean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s1() {
        if (zh.b.c()) {
            n1();
        } else {
            this.f25007v = true;
            this.f25005t.a(R.raw.walklisten_end);
        }
        if (this.I != 0) {
            ma.l.a(t.f73011j, ma.a.f72742f1);
        }
    }

    private void y1() {
        String g11 = sh.f.g(x.r().l(), 7);
        int a11 = gi.m.a(7, 50);
        if (x.r().t(g11) < a11 || a11 <= 0) {
            if (yh.d.d().e() >= x.r().u(g11, a11)) {
                this.D = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z1() {
        va.f fVar = this.A;
        if (fVar == null || fVar.isShowing() || isFinishing()) {
            return;
        }
        this.A.show();
    }

    public final void B1(View v11) {
        if (this.f24998m == null) {
            this.f24998m = new m(new i(v11));
        }
        this.f24998m.e(v11);
        v11.setEnabled(false);
    }

    @Override // li.f
    public void C(Integer killedId) {
        D1();
        if (LearnRecordManager.A().R(this.f25010y.j().topicId)) {
            this.C = 0;
            F1();
            this.C = 1;
        }
    }

    public final boolean D1() {
        if (!K1()) {
            return false;
        }
        this.f25003r.q();
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.business_push_down_in, R.anim.business_push_down_out).remove((Fragment) this.f25003r).commitAllowingStateLoss();
        this.f25002q.postDelayed(new j(), 300L);
        return true;
    }

    public final void E1() {
        PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService(c6.d.f8118j)).newWakeLock(1, "WalkListenActivity_TAG:wakelock");
        this.H = newWakeLock;
        if (newWakeLock != null) {
            newWakeLock.acquire();
        }
    }

    public final boolean G1() {
        if (K1()) {
            return true;
        }
        if (this.f25010y == null) {
            return false;
        }
        u0.f26107a.p(EntryAction.CLICK);
        this.E = this.f25010y.j().topicId;
        this.f25002q.setVisibility(0);
        this.f25003r = v0.f26118a.c(this.f25010y.j().topicId, this.f25010y.j().bookId);
        ZPackUtils.loadAudioCompat(this.f25005t, this.f25010y.j(), this.f25010y.j().wordAudio);
        A1();
        return true;
    }

    public final void H1() {
        PowerManager.WakeLock wakeLock = this.H;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }

    public final void I1() {
        this.f24997l.setText(getString(R.string.walk_listen_speed_unit, this.f25008w));
    }

    public final boolean K1() {
        Object obj;
        return (this.f25002q.getVisibility() != 0 || (obj = this.f25003r) == null || ((Fragment) obj).isDetached()) ? false : true;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        yh.d.d().i();
        qb0.h hVar = this.J;
        if (hVar == null || hVar.isUnsubscribed()) {
            return;
        }
        this.J.unsubscribe();
    }

    public final void l1() {
        String g11 = sh.f.g(x.r().l(), 7);
        x.r().d0(g11, x.r().t(g11) + 1);
    }

    public final void m1(boolean run) {
        AnimationDrawable animationDrawable = (AnimationDrawable) this.f24996k.getBackground();
        if (run) {
            animationDrawable.start();
        } else {
            animationDrawable.stop();
            animationDrawable.selectDrawable(0);
        }
    }

    public final void n1() {
        qb0.h hVar = this.J;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.J.unsubscribe();
        }
        this.J = rx.c.z2(new c()).w5(bc0.c.a()).I3(tb0.a.a()).r5(new b());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (R.id.toggle == id2) {
            if (this.C == 0) {
                this.C = 1;
                this.f25004s.setText(R.string.walklisten_resume);
                this.f25005t.stop();
                return;
            } else {
                this.C = 0;
                this.f25004s.setText(R.string.walklisten_pause);
                w1();
                return;
            }
        }
        if (R.id.walklisten_last_topic != id2) {
            if (R.id.walklisten_word == id2) {
                this.C = 1;
                this.f25004s.setText(R.string.walklisten_resume);
                G1();
                this.f25005t.stop();
                return;
            }
            return;
        }
        if (this.f25011z != null) {
            this.f25002q.setVisibility(0);
            this.f25003r = v0.f26118a.c(this.f25011z.j().topicId, this.f25011z.j().bookId);
            this.E = this.f25011z.j().topicId;
            ZPackUtils.loadAudioCompat(this.f25005t, this.f25011z.j(), this.f25011z.j().wordAudio);
            u0.f26107a.p(EntryAction.LAST_TAB);
            A1();
            this.f25005t.stop();
            this.C = 1;
            this.f25004s.setText(R.string.walklisten_resume);
        }
    }

    @Override // vh.a, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (x.r().c(this)) {
            return;
        }
        setContentView(R.layout.walklisten_play);
        this.K = new n(this);
        com.baicizhan.client.framework.audio.a aVar = new com.baicizhan.client.framework.audio.a(this);
        this.f25005t = aVar;
        aVar.h(this);
        this.f25005t.j(new e());
        try {
            String string = nc.b.b().getString(M, "1.0x");
            this.f25008w = string;
            this.f25005t.b(Float.parseFloat(string.replace("x", "")));
        } catch (Exception e11) {
            qb.c.c(L, "", e11);
        }
        p1();
        va.f fVar = new va.f(this);
        this.A = fVar;
        fVar.setCancelable(false);
        this.A.e(R.string.loading_data);
        sh.k.D().Q(this);
        setVolumeControlStream(3);
        p.c(this);
        y1();
        F1();
        E1();
        u0 u0Var = u0.f26107a;
        u0Var.q(EntryPage.WALKMAN);
        u0Var.n(v.f73041l, t1.a(7));
        if (v0.f26118a.b()) {
            u0Var.r(WikiStyle.TEST_GUIDE_WIKI);
        } else {
            u0Var.r(WikiStyle.STUDY_WIKI);
        }
    }

    @Override // vh.a, com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        RxFlowUtilsKt.asRxJava(this.f24990e.a()).w5(bc0.c.e()).u5(new wb0.b() { // from class: vh.c
            @Override // wb0.b
            public final void call(Object obj) {
                WalkListenActivity.K0((Boolean) obj);
            }
        }, new wb0.b() { // from class: vh.d
            @Override // wb0.b
            public final void call(Object obj) {
                qb.c.c(WalkListenActivity.L, "", (Throwable) obj);
            }
        });
        IAudioPlayer iAudioPlayer = this.f25005t;
        if (iAudioPlayer != null) {
            iAudioPlayer.destroy();
        }
        n nVar = this.K;
        if (nVar != null) {
            nVar.removeMessages(0);
        }
        sh.k.D().P();
        qb0.h hVar = this.f25009x;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f25009x.unsubscribe();
        }
        wi.p.f96399a.a();
        H1();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        li.c cVar;
        if (4 == keyCode && (cVar = this.f25003r) != null) {
            if (!cVar.d()) {
                if (D1()) {
                    this.C = 0;
                    this.f25004s.setText(R.string.walklisten_pause);
                    w1();
                }
            }
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer.a
    public void onPlayError(int what, int extra) {
        qb.c.d("", "walklisten play sentence error, what[%d], extra[%d], record[%s]", Integer.valueOf(what), Integer.valueOf(extra), this.f25011z.j() == null ? "null" : this.f25011z.j().toString());
        u1();
        m1(false);
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
    public void onPlayStateChanged(IAudioPlayer.State state) {
        if (IAudioPlayer.State.Completed == state) {
            u1();
            m1(false);
        } else if (IAudioPlayer.State.Stopped == state) {
            this.f25006u = false;
            m1(false);
        } else if (IAudioPlayer.State.Playing == state) {
            m1(true);
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // kb.f
    public void p0(boolean canDuck) {
        if (this.C == 0) {
            this.C = 1;
            this.f25004s.setText(R.string.walklisten_resume);
            G1();
            this.f25005t.stop();
        }
    }

    public final /* synthetic */ void q1(DialogInterface dialogInterface) {
        finish();
    }

    public final void t1(final TopicRecord record) {
        if (isFinishing()) {
            return;
        }
        this.f25005t.f(new l(record));
        this.f25005t.j(new a(record));
        this.f25006u = ZPackUtils.loadAudioCompat(this.f25005t, record, record.wordAudio);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u1() {
        TopicRecord j11;
        this.f25006u = false;
        if (this.f25007v) {
            this.f25007v = false;
            if (this.D) {
                mc.a.n(this, ((u) ((u.a) new u.a(this).U(R.string.review_task_complete_message).C(R.string.i_know)).b0(ButtonType.SINGLE_POSITIVE).d()).B(new DialogInterface.OnDismissListener() { // from class: vh.e
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        WalkListenActivity.this.q1(dialogInterface);
                    }
                }), "finish");
                return;
            } else {
                finish();
                return;
            }
        }
        sh.f fVar = this.f25010y;
        if (fVar != null && (j11 = fVar.j()) != null && yh.d.d().b(j11.topicId)) {
            l1();
        }
        x1();
    }

    public final void v1() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("fake");
        if (findFragmentByTag != null) {
            getSupportFragmentManager().beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
    }

    public final void w1() {
        if (this.f25006u || 1 == this.C) {
            return;
        }
        D1();
        if (this.f25010y != null) {
            o1();
            J1();
            TopicRecord j11 = this.f25010y.j();
            this.f24993h.setText(j11.word);
            this.f24995j.setText(j11.wordMean.replace(GlideException.a.f28776d, "\n"));
            this.f24994i.setText(j11.phonetic);
            t1(j11);
            sh.f fVar = this.f25011z;
            if (fVar != null) {
                TopicRecord j12 = fVar.j();
                this.f24992g.setText(j12.word + " " + j12.wordMean);
            }
        }
    }

    public final void x1() {
        this.K.sendEmptyMessageDelayed(0, 1500L);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class k extends qb0.g<sh.f> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends r {
            public a() {
            }

            @Override // kc.r, kc.q
            public void onDialogPositiveClick(@NonNull View v11) {
                WalkListenActivity.this.finish();
            }
        }

        public k() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(WalkListenActivity.L, "onError ", e11);
            WalkListenActivity.this.o1();
            WalkListenActivity.this.F.removeCallbacks(WalkListenActivity.this.G);
            WalkListenActivity.this.D1();
            WalkListenActivity.this.B = true;
            WalkListenActivity walkListenActivity = WalkListenActivity.this;
            mc.a.n(walkListenActivity, ((u) new u.a(walkListenActivity).U(R.string.download_res_fail).b0(ButtonType.SINGLE_POSITIVE).d()).f0(new a()), "error");
        }

        @Override // qb0.g
        public void onStart() {
            WalkListenActivity.this.F.postDelayed(WalkListenActivity.this.G, 1000L);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(sh.f problemAsset) {
            qb.c.b(WalkListenActivity.L, "onNext " + problemAsset, new Object[0]);
            WalkListenActivity.this.o1();
            WalkListenActivity.this.F.removeCallbacks(WalkListenActivity.this.G);
            if (problemAsset == null) {
                WalkListenActivity.this.s1();
                return;
            }
            WalkListenActivity.this.f24990e.c(TaskAction.Listening, true, 1);
            WalkListenActivity.this.f25010y = problemAsset;
            WalkListenActivity.this.r1();
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<Void> {
        public b() {
        }

        @Override // qb0.c
        public void onCompleted() {
            WalkListenActivity.this.F1();
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Void aVoid) {
        }
    }

    @Override // kb.f
    public void t() {
    }

    public static /* synthetic */ void K0(Boolean bool) {
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public void onSaveInstanceState(@NonNull Bundle outState) {
    }
}
