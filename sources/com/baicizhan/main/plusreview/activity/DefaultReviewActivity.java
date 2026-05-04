package com.baicizhan.main.plusreview.activity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;
import com.baicizhan.client.business.dataset.models.OfflineStateRecord;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.managers.experience.StudyBehaviourType;
import com.baicizhan.client.business.util.AutoSizeMgr;
import com.baicizhan.client.business.util.StringUtil;
import com.baicizhan.client.business.util.ThemeUtil;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.client.business.widget.SwipeViewPager;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.customview.PatternContainer;
import com.baicizhan.main.fragment.PatternBaseFragment;
import com.baicizhan.main.global.AppPageStatus;
import com.baicizhan.main.plusreview.activity.DefaultReviewActivity;
import com.baicizhan.main.plusreview.data.AudioRecorderModel;
import com.baicizhan.main.plusreview.fragment.WordReadingFragment;
import com.baicizhan.main.plusreview.fragment.WriteFragment;
import com.baicizhan.main.wikiv2.studyv2.data.EntryAction;
import com.baicizhan.main.wikiv2.studyv2.data.EntryPage;
import com.baicizhan.main.wikiv2.studyv2.data.WikiStyle;
import com.baicizhan.main.wikiv2.studyv2.data.p0;
import com.baicizhan.main.wikiv2.studyv2.data.u0;
import com.baicizhan.main.wikiv2.studyv2.data.v0;
import com.jiongji.andriod.card.R;
import fd.t1;
import gi.h0;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kc.u;
import org.junit.jupiter.api.j2;
import qf.c;
import rf.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@qu.b
/* loaded from: classes4.dex */
public class DefaultReviewActivity extends jh.h implements View.OnClickListener, PatternBaseFragment.c, li.f, WriteFragment.c {
    public static final long A1 = 15000;
    public static final int B1 = 102;

    /* renamed from: w1, reason: collision with root package name */
    public static final String f24580w1 = "DefaultReviewActivity";

    /* renamed from: x1, reason: collision with root package name */
    public static final int f24581x1 = 400;

    /* renamed from: y1, reason: collision with root package name */
    public static final int f24582y1 = 999;

    /* renamed from: z1, reason: collision with root package name */
    public static final String f24583z1 = "type";
    public boolean A;
    public boolean B;
    public int C;
    public int D;
    public nh.a E;
    public long F;
    public int G;
    public sh.f H;
    public qb0.h I;
    public FragmentManager K;
    public FrameLayout L;
    public PatternBaseFragment M;
    public PatternContainer O;
    public SwipeViewPager P;
    public qf.c Q;
    public IAudioPlayer R;
    public View S;
    public View T;
    public View U;
    public int X;
    public b0 Z;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public u9.d f24584e;

    /* renamed from: f, reason: collision with root package name */
    public Animation f24585f;

    /* renamed from: f0, reason: collision with root package name */
    public AudioRecorderModel f24586f0;

    /* renamed from: f1, reason: collision with root package name */
    public File f24587f1;

    /* renamed from: g, reason: collision with root package name */
    public Animation f24588g;

    /* renamed from: h, reason: collision with root package name */
    public Animation f24589h;

    /* renamed from: i, reason: collision with root package name */
    public Animation f24591i;

    /* renamed from: j1, reason: collision with root package name */
    public int f24594j1;

    /* renamed from: k, reason: collision with root package name */
    public c0 f24595k;

    /* renamed from: k1, reason: collision with root package name */
    public PopupWindow f24596k1;

    /* renamed from: m, reason: collision with root package name */
    public ad.a f24599m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f24601n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f24603o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f24605p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f24607q;

    /* renamed from: r, reason: collision with root package name */
    public View f24609r;

    /* renamed from: s, reason: collision with root package name */
    public ProgressBar f24611s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f24613t;

    /* renamed from: u, reason: collision with root package name */
    public TopicRecord f24615u;

    /* renamed from: v, reason: collision with root package name */
    public TopicRecord f24617v;

    /* renamed from: v1, reason: collision with root package name */
    public SparseArray<List<String>> f24618v1;

    /* renamed from: w, reason: collision with root package name */
    public int f24619w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f24620x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f24621y;

    /* renamed from: z, reason: collision with root package name */
    public PatternContainer.Direction f24622z;

    /* renamed from: j, reason: collision with root package name */
    public Handler f24593j = new Handler();

    /* renamed from: l, reason: collision with root package name */
    public boolean f24597l = false;
    public LearnRecordManager.Answer J = LearnRecordManager.Answer.CORRECT;
    public LinkedList<c.b> N = new LinkedList<>();
    public boolean V = false;
    public boolean W = false;
    public boolean Y = false;

    /* renamed from: h1, reason: collision with root package name */
    public WordReadingFragment.b f24590h1 = new k();

    /* renamed from: i1, reason: collision with root package name */
    public h.c f24592i1 = new t();

    /* renamed from: l1, reason: collision with root package name */
    public int f24598l1 = 0;

    /* renamed from: m1, reason: collision with root package name */
    public Runnable f24600m1 = new a0();

    /* renamed from: n1, reason: collision with root package name */
    public boolean f24602n1 = false;

    /* renamed from: o1, reason: collision with root package name */
    public int f24604o1 = 0;

    /* renamed from: p1, reason: collision with root package name */
    public Runnable f24606p1 = new c();

    /* renamed from: q1, reason: collision with root package name */
    public Runnable f24608q1 = new d();

    /* renamed from: r1, reason: collision with root package name */
    public boolean f24610r1 = false;

    /* renamed from: s1, reason: collision with root package name */
    public Runnable f24612s1 = new j();

    /* renamed from: t1, reason: collision with root package name */
    public boolean f24614t1 = false;

    /* renamed from: u1, reason: collision with root package name */
    public sa.h f24616u1 = new sa.h(this);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a0 implements Runnable {
        public a0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultReviewActivity.this.f2(0);
            DefaultReviewActivity.this.f24602n1 = true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<DefaultReviewActivity> f24626a;

        /* renamed from: b, reason: collision with root package name */
        public int f24627b;

        /* renamed from: c, reason: collision with root package name */
        public List<TopicRecord> f24628c;

        /* renamed from: d, reason: collision with root package name */
        public int f24629d;

        @Override // java.lang.Runnable
        public void run() {
            DefaultReviewActivity defaultReviewActivity = this.f24626a.get();
            if (defaultReviewActivity == null) {
                return;
            }
            int indexOfChild = defaultReviewActivity.L.indexOfChild(defaultReviewActivity.M);
            if (indexOfChild >= 0) {
                if (defaultReviewActivity.W) {
                    defaultReviewActivity.v1();
                } else {
                    int i11 = this.f24629d;
                    if (i11 > 1 && i11 <= 100) {
                        qb.c.d("", "plusreview exchange example fragment error! fragment to add has not been removed: [" + indexOfChild + j2.O + defaultReviewActivity.M + "; and retried: " + this.f24629d + "; has not exchanged", new Object[0]);
                    }
                    if (this.f24629d <= 100) {
                        defaultReviewActivity.O.postDelayed(this, 360L);
                        this.f24629d++;
                        return;
                    }
                    defaultReviewActivity.v1();
                }
            }
            defaultReviewActivity.L.addView(defaultReviewActivity.M, 0);
            defaultReviewActivity.M.o(defaultReviewActivity);
            try {
                defaultReviewActivity.M.v(this.f24627b, this.f24628c, defaultReviewActivity.R);
            } catch (Exception e11) {
                qb.c.c(DefaultReviewActivity.f24580w1, "", e11);
                defaultReviewActivity.d2(true);
            }
            defaultReviewActivity.P1(true);
        }

        public b0(DefaultReviewActivity activity) {
            this.f24626a = new WeakReference<>(activity);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultReviewActivity.this.x1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<DefaultReviewActivity> f24631a;

        public c0(DefaultReviewActivity activity) {
            this.f24631a = new WeakReference<>(activity);
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultReviewActivity defaultReviewActivity = this.f24631a.get();
            if (defaultReviewActivity == null) {
                return;
            }
            defaultReviewActivity.c2();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultReviewActivity.this.f24613t.setText("返回主界面");
            DefaultReviewActivity.this.f24613t.setEnabled(true);
            va.g.i("客官，你的某些单词资源有缺失，需联网更新。\nTip：连接稳定的网络，即可自动更新", 1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements IAudioPlayer.b {
        public e() {
        }

        @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
        public void onPlayStateChanged(IAudioPlayer.State state) {
            if (IAudioPlayer.State.Completed == state) {
                DefaultReviewActivity.this.R.f(null);
                DefaultReviewActivity.this.R.j(null);
                ZPackUtils.loadAudioCompat(DefaultReviewActivity.this.R, DefaultReviewActivity.this.f24617v, DefaultReviewActivity.this.f24617v.wordAudio);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements IAudioPlayer.a {
        public f() {
        }

        @Override // com.baicizhan.client.framework.audio.IAudioPlayer.a
        public void onPlayError(int i11, int i12) {
            DefaultReviewActivity.this.R.f(null);
            DefaultReviewActivity.this.R.j(null);
            ZPackUtils.loadAudioCompat(DefaultReviewActivity.this.R, DefaultReviewActivity.this.f24617v, DefaultReviewActivity.this.f24617v.wordAudio);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultReviewActivity.this.P1(true);
            if (DefaultReviewActivity.this.f24610r1) {
                DefaultReviewActivity.this.f24610r1 = false;
            } else {
                DefaultReviewActivity.this.S1(PatternContainer.Direction.DOWN, 0, EntryAction.WRONG_ANSWER);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (DefaultReviewActivity.this.isFinishing() || DefaultReviewActivity.this.E == null) {
                return;
            }
            DefaultReviewActivity.this.E.dismiss();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultReviewActivity.this.c2();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.baicizhan.learning_strategy.util.e<Integer, Integer> s11 = DefaultReviewActivity.this.f24599m.u().s();
            DefaultReviewActivity.this.f24601n.setText(DefaultReviewActivity.this.getString(R.string.main_new_count_portrait, s11.a(), s11.b()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class k implements WordReadingFragment.b {
        public k() {
        }

        @Override // com.baicizhan.main.plusreview.fragment.WordReadingFragment.b
        public void a() {
            DefaultReviewActivity.this.d2(true);
        }

        @Override // com.baicizhan.main.plusreview.fragment.WordReadingFragment.b
        public void b() {
            DefaultReviewActivity.this.O1();
        }

        @Override // com.baicizhan.main.plusreview.fragment.WordReadingFragment.b
        public void onStart() {
            DefaultReviewActivity.this.f24586f0.start();
        }

        @Override // com.baicizhan.main.plusreview.fragment.WordReadingFragment.b
        public void onStop() {
            DefaultReviewActivity.this.f24586f0.stop();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultReviewActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class m extends ArrayList<String> {
        public m() {
            add(ma.a.f72707a1);
            add(ma.a.f72770j1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class n extends ArrayList<String> {
        public n() {
            add(ma.a.f72735e1);
            add(ma.a.f72798n1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class o extends ArrayList<String> {
        public o() {
            add(ma.a.f72728d1);
            add(ma.a.f72791m1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class p extends ArrayList<String> {
        public p() {
            add(ma.a.Z0);
            add(ma.a.f72763i1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class q extends ArrayList<String> {
        public q() {
            add(ma.a.Y0);
            add(ma.a.f72756h1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class r extends ArrayList<String> {
        public r() {
            add(ma.a.f72714b1);
            add(ma.a.f72777k1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class s extends ArrayList<String> {
        public s() {
            add(ma.a.f72721c1);
            add(ma.a.f72784l1);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class u implements IAudioPlayer.a {
        public u() {
        }

        @Override // com.baicizhan.client.framework.audio.IAudioPlayer.a
        public void onPlayError(int what, int extra) {
            qb.c.d(DefaultReviewActivity.f24580w1, "audip error %d, %d", Integer.valueOf(what), Integer.valueOf(extra));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class v implements PatternContainer.b {
        public v() {
        }

        @Override // com.baicizhan.main.customview.PatternContainer.b
        public void X(PatternContainer.Direction direction) {
            PatternContainer.Direction direction2 = PatternContainer.Direction.LEFT;
            if (direction == direction2) {
                DefaultReviewActivity.this.S1(direction2, 1, EntryAction.SLIDE);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class w implements SwipeViewPager.b {
        public w() {
        }

        @Override // com.baicizhan.client.business.widget.SwipeViewPager.b
        public void a(SwipeViewPager.Direction direction) {
            if (DefaultReviewActivity.this.D1() && DefaultReviewActivity.this.P.getCurrentItem() == DefaultReviewActivity.this.f24604o1 && direction == SwipeViewPager.Direction.RIGHT) {
                DefaultReviewActivity.this.f24622z = PatternContainer.Direction.LEFT;
                DefaultReviewActivity.this.z1();
            }
        }
    }

    public DefaultReviewActivity() {
        SparseArray<List<String>> sparseArray = new SparseArray<>();
        this.f24618v1 = sparseArray;
        sparseArray.put(23, new m());
        this.f24618v1.put(5, new n());
        this.f24618v1.put(4, new o());
        this.f24618v1.put(24, new p());
        this.f24618v1.put(3, new q());
        this.f24618v1.put(21, new r());
        this.f24618v1.put(22, new s());
    }

    private void A1() {
        if (this.M != null) {
            if (!this.f24621y) {
                LearnRecordManager.A().P(this.G);
            }
            this.f24621y = true;
            if (this.M.k()) {
                return;
            }
            S1(PatternContainer.Direction.DOWN, 0, EntryAction.CLICK_HINT);
        }
    }

    private void B1() {
        this.f24591i = AnimationUtils.loadAnimation(this, R.anim.business_push_up_out);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.business_push_down_in);
        this.f24588g = loadAnimation;
        loadAnimation.setDuration(150L);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.business_push_left_in);
        this.f24589h = loadAnimation2;
        loadAnimation2.setDuration(150L);
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        this.f24585f = translateAnimation;
        translateAnimation.setDuration(300L);
    }

    private void C1() {
        hg.n.a();
        hg.n.f(this, this.f24594j1, 2, 1);
        this.K = getSupportFragmentManager();
        PatternContainer patternContainer = (PatternContainer) findViewById(R.id.learning_page);
        this.O = patternContainer;
        patternContainer.setOnFlingListener(new v());
        this.L = (FrameLayout) findViewById(R.id.example_placeholder);
        findViewById(R.id.home).setOnClickListener(this);
        this.f24601n = (TextView) findViewById(R.id.new_count);
        TextView textView = (TextView) findViewById(R.id.last_topic);
        this.f24607q = textView;
        textView.setOnClickListener(this);
        this.S = findViewById(R.id.hint);
        this.T = findViewById(R.id.kill);
        View findViewById = findViewById(R.id.voice);
        this.U = findViewById;
        findViewById.setVisibility(5 == this.f24594j1 ? 4 : 0);
        int i11 = this.f24594j1;
        if (4 == i11 || 5 == i11) {
            findViewById(R.id.learning_footer).setVisibility(8);
        } else {
            this.S.setOnClickListener(this);
            this.T.setOnClickListener(this);
            this.U.setOnClickListener(this);
        }
        View findViewById2 = findViewById(R.id.progress_layout);
        this.f24609r = findViewById2;
        this.f24611s = (ProgressBar) findViewById2.findViewById(R.id.loading_progress);
        TextView textView2 = (TextView) this.f24609r.findViewById(R.id.cancel_loading);
        this.f24613t = textView2;
        textView2.setOnClickListener(this);
        SwipeViewPager swipeViewPager = (SwipeViewPager) findViewById(R.id.wiki_pager);
        this.P = swipeViewPager;
        swipeViewPager.setOverScrollMode(2);
        this.P.setFlingListener(new w());
        this.P.setOnPageChangeListener(new x());
        this.E = new nh.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean D1() {
        return this.P.getVisibility() == 0;
    }

    private boolean E1() {
        return this.f24609r.getVisibility() == 0;
    }

    private void F1() {
        if (i9.j.c(i9.j.f60415f, true)) {
            h0.a().b(this, R.raw.chop);
        }
        this.J = LearnRecordManager.Answer.KILL;
        if (LearnRecordManager.A().y() <= 50) {
            this.X--;
        }
        LearnRecordManager.A().U(this.G, w1(), this.f24619w);
        c2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J1() {
        TopicRecord topicRecord = this.f24617v;
        if (topicRecord != null) {
            this.f24615u = topicRecord;
            this.f24607q.setText(String.format(Locale.CHINA, "%s %s", topicRecord.word, StringUtil.firstLine(topicRecord.wordMean)));
            this.f24607q.setCompoundDrawablesWithIntrinsicBounds(this.J == LearnRecordManager.Answer.KILL ? R.drawable.ic_state_slash : this.f24620x ? R.drawable.ic_state_wrong : this.f24621y ? R.drawable.ic_state_check : R.drawable.ic_state_right, 0, 0, 0);
            this.A = this.f24620x;
            this.B = this.f24621y;
        } else {
            this.f24607q.setText("");
            this.f24607q.setCompoundDrawables(null, null, null, null);
        }
        this.f24620x = false;
        this.f24621y = false;
        this.G = this.H.c();
        this.N.addFirst(new c.b(q9.x.r().l(), this.G, null, 0, this.H.j()));
        this.J = LearnRecordManager.Answer.WRONG;
        this.F = System.currentTimeMillis();
        this.H.p();
        TopicRecord j11 = this.H.j();
        this.f24617v = j11;
        this.f24619w = ZPackUtils.getZpkTagIdCompat(j11);
        List<TopicRecord> d11 = this.H.d();
        int indexOf = d11.indexOf(this.f24617v);
        PatternBaseFragment patternBaseFragment = this.M;
        if (patternBaseFragment != null) {
            patternBaseFragment.q();
            patternBaseFragment.animate().x(patternBaseFragment.getWidth()).alpha(0.0f).setDuration(300L).setListener(new z(patternBaseFragment)).start();
            this.W = false;
            patternBaseFragment.setBackgroundColor(getResources().getColor(R.color.main_color_weak_bg));
        }
        PatternBaseFragment d12 = hg.n.d(this, this.f24594j1, 1);
        this.M = d12;
        if (d12 instanceof WriteFragment) {
            ((WriteFragment) d12).setOnControlListener(this);
        } else if (d12 instanceof WordReadingFragment) {
            ((WordReadingFragment) d12).setOnWordReadingListener(this.f24590h1);
            ((WordReadingFragment) this.M).setOutputFile(this.f24587f1);
            ((WordReadingFragment) this.M).k0();
        }
        this.M.setAlpha(1.0f);
        t1(indexOf, d11);
        this.f24593j.removeCallbacks(this.f24600m1);
        this.f24593j.postDelayed(this.f24600m1, 1000L);
        e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void K1() {
        if (sh.f.n(this.f24594j1) && this.Y) {
            mc.a.n(this, ((kc.u) ((u.a) new u.a(this).U(R.string.review_task_complete_message).C(R.string.i_know)).b0(ButtonType.SINGLE_POSITIVE).d()).B(new DialogInterface.OnDismissListener() { // from class: jh.d
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    DefaultReviewActivity.this.H1(dialogInterface);
                }
            }), "finish");
        } else {
            this.f24593j.postDelayed(new l(), 1000L);
        }
        if (this.f24598l1 > 1) {
            N1();
        }
    }

    private void L1() {
        LinkedList<c.b> linkedList = this.N;
        if (linkedList != null) {
            Iterator<c.b> it = linkedList.iterator();
            while (it.hasNext()) {
                c.b next = it.next();
                if (LearnRecordManager.A().R(next.f82090b)) {
                    sh.k.D().s(next.f82090b);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P1(boolean enabled) {
        this.f24607q.setEnabled(enabled);
        this.S.setEnabled(enabled);
        this.T.setEnabled(enabled);
        this.U.setEnabled(enabled);
        this.O.setEnabled(enabled);
    }

    @SuppressLint({"InflateParams"})
    private void R1(View anchor, CharSequence text) {
        qb.c.b("leijie", "showStatusTip " + ((Object) text), new Object[0]);
        PopupWindow popupWindow = this.f24596k1;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        View inflate = getLayoutInflater().inflate(R.layout.learning_status_tip_window, (ViewGroup) null, false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(getResources().getColor(R.color.main_color_white));
        gradientDrawable.setCornerRadius(xb.i.a(this, 4.0f));
        TextView textView = (TextView) inflate.findViewById(R.id.text);
        lq.c.b(textView, gradientDrawable);
        textView.setText(text);
        PopupWindow popupWindow2 = new PopupWindow(inflate, -2, -2);
        this.f24596k1 = popupWindow2;
        popupWindow2.setTouchable(true);
        this.f24596k1.setFocusable(true);
        this.f24596k1.setOutsideTouchable(false);
        this.f24596k1.setBackgroundDrawable(new ColorDrawable(0));
        this.f24596k1.setAnimationStyle(R.style.Animations_fade_in_out);
        Rect rect = new Rect();
        anchor.getGlobalVisibleRect(rect);
        this.f24596k1.showAtLocation(this.O, 51, ((rect.left + rect.right) - xb.i.a(this, 220.0f)) / 2, rect.bottom);
    }

    public static boolean T1(Context context, int type) {
        if (type != 23 && type != 5 && type != 4 && type != 24 && type != 21 && type != 22 && type != 3) {
            return false;
        }
        Intent intent = new Intent(context, (Class<?>) DefaultReviewActivity.class);
        intent.putExtra("type", type);
        context.startActivity(intent);
        return true;
    }

    public static boolean U1(Context context) {
        return T1(context, 22);
    }

    public static boolean V1(Context context) {
        return T1(context, 21);
    }

    public static boolean W1(Context context) {
        return T1(context, 3);
    }

    public static boolean X1(Context context) {
        return T1(context, 23);
    }

    public static boolean Y1(Context context) {
        return T1(context, 5);
    }

    public static boolean Z1(Context context) {
        return T1(context, 4);
    }

    private boolean a2(Bundle savedInstanceState) {
        if (savedInstanceState == null || !savedInstanceState.getBoolean("exit", false)) {
            return false;
        }
        qb.c.d("", "DefaultReviewActivity is recreated and data is lost, finish!", new Object[0]);
        finish();
        return true;
    }

    private void b2() {
        F1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c2() {
        d2(false);
    }

    private void e2() {
        this.f24593j.removeCallbacks(this.f24612s1);
        this.f24593j.postDelayed(this.f24612s1, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f2(int offset) {
        int size = this.N.size() - offset;
        qf.c cVar = this.Q;
        if (cVar == null || cVar.getCount() != size) {
            FragmentManager fragmentManager = this.K;
            LinkedList<c.b> linkedList = this.N;
            qf.c cVar2 = new qf.c(fragmentManager, this, linkedList.subList(offset, linkedList.size()));
            this.Q = cVar2;
            this.P.setAdapter(cVar2);
        }
    }

    private void t1(int rightIdx, List<TopicRecord> options) {
        this.O.removeCallbacks(this.Z);
        if (this.Z == null) {
            this.Z = new b0();
        }
        this.Z.f24627b = rightIdx;
        this.Z.f24628c = options;
        this.O.post(this.Z);
    }

    private void u1(boolean right) {
        this.f24584e.c(q9.x.r().l(), this.G, ch.n.b(this.f24594j1), right ? StudyBehaviourType.Right : StudyBehaviourType.Wrong);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v1() {
        this.L.removeView(this.M);
        this.M.q();
        this.M.setBackgroundColor(0);
        hg.n.e(this.M);
        this.T.setOnClickListener(this);
        this.W = true;
        PatternBaseFragment d11 = hg.n.d(this, this.f24594j1, 1);
        this.M = d11;
        if (d11 instanceof WriteFragment) {
            ((WriteFragment) d11).setOnControlListener(this);
        }
    }

    private long w1() {
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - this.F;
        this.F = currentTimeMillis;
        return j11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x1() {
        qb.c.b(f24580w1, "enterLoading", new Object[0]);
        this.f24593j.postDelayed(this.f24608q1, 15000L);
        this.f24609r.setVisibility(0);
        this.f24611s.setProgress(0);
        this.f24613t.setText("加载中o(｀ω´ )o");
        this.f24613t.setEnabled(false);
        this.f24609r.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y1() {
        this.f24593j.removeCallbacks(this.f24606p1);
        this.f24593j.removeCallbacks(this.f24608q1);
        this.f24609r.setVisibility(4);
        this.f24609r.setOnClickListener(this);
    }

    @Override // li.f
    public void C(Integer killedId) {
        L1();
        z1();
    }

    public final /* synthetic */ void G1(File file) {
        this.f24587f1 = file;
    }

    public final /* synthetic */ void H1(DialogInterface dialogInterface) {
        finish();
    }

    public final /* synthetic */ void I1(DialogInterface dialogInterface) {
        this.f24614t1 = false;
    }

    public final void M1() {
        if (this.f24618v1.indexOfKey(this.f24594j1) == -1) {
            return;
        }
        ma.l.a(ma.t.f73011j, this.f24618v1.get(this.f24594j1, null).get(0));
    }

    public final void N1() {
        if (this.f24618v1.indexOfKey(this.f24594j1) == -1) {
            return;
        }
        ma.l.a(ma.t.f73011j, this.f24618v1.get(this.f24594j1, null).get(1));
    }

    public final void O1() {
        if (this.f24614t1) {
            return;
        }
        this.f24614t1 = true;
        if (ContextCompat.checkSelfPermission(this, "android.permission.RECORD_AUDIO") != 0) {
            this.f24616u1.j("android.permission.RECORD_AUDIO");
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.RECORD_AUDIO"}, 102);
        }
    }

    public final void Q1() {
        if (sh.f.n(this.f24594j1)) {
            String g11 = sh.f.g(q9.x.r().l(), this.f24594j1);
            int i11 = this.f24594j1;
            int a11 = gi.m.a(i11, (i11 == 22 || i11 == 4) ? 20 : 50);
            if (q9.x.r().t(g11) < a11 || a11 <= 0) {
                if (this.X >= q9.x.r().u(g11, a11)) {
                    this.Y = true;
                }
            }
        }
    }

    public void S1(final PatternContainer.Direction direction, final int offset, EntryAction action) {
        if (!this.f24602n1 || offset > 0) {
            p0.f26080a.b(false);
        }
        if (!this.f24602n1) {
            this.f24593j.removeCallbacks(this.f24600m1);
            f2(0);
        }
        if (offset >= this.N.size()) {
            return;
        }
        this.O.setEnabled(false);
        this.f24622z = direction;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.P, "translationX", xb.f.i(this), 0.0f).setDuration(200L);
        if (direction == PatternContainer.Direction.DOWN) {
            duration = ObjectAnimator.ofFloat(this.P, "translationY", -xb.f.f(this), 0.0f).setDuration(200L);
        }
        duration.addListener(new a());
        duration.start();
        this.P.setVisibility(0);
        this.f24604o1 = offset;
        this.P.setOffset(offset);
        this.P.setCurrentItem(offset);
        if (v0.f26118a.b()) {
            u0.f26107a.r(WikiStyle.TEST_GUIDE_WIKI);
        } else {
            u0.f26107a.r(WikiStyle.STUDY_WIKI);
        }
        u0 u0Var = u0.f26107a;
        u0Var.q(EntryPage.SELF_TRAINING);
        u0Var.p(action);
        u0Var.n(ma.v.f73041l, t1.a(this.f24594j1));
        ZPackUtils.loadAudioCompat(this.R, this.N.get(offset).f82093e, this.N.get(offset).f82093e.wordAudio);
    }

    public final void d2(boolean force) {
        this.f24602n1 = false;
        if (force || !(this.f24609r.getVisibility() == 0 || this.J == LearnRecordManager.Answer.WRONG)) {
            if (force) {
                LearnRecordManager.A().s(this.G, w1(), this.f24619w, true);
            }
            sh.k.D().t(this.H);
            int i11 = this.f24598l1 + 1;
            this.f24598l1 = i11;
            if (i11 == 2) {
                M1();
            }
            if (sh.k.D().J() == 0) {
                K1();
            } else {
                P1(false);
                this.I = sh.k.D().I().I3(tb0.a.a()).r5(new y());
            }
        }
    }

    @Override // android.app.Activity
    public void finish() {
        sh.k.D().P();
        super.finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        AutoSizeMgr.INSTANCE.adjust(super.getResources());
        return super.getResources();
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment.c
    public void k0() {
        A1();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!D1()) {
            super.onBackPressed();
            return;
        }
        ActivityResultCaller b11 = this.Q.b(this.P.getCurrentItem());
        if (b11 == null || !(b11 instanceof li.c)) {
            z1();
        } else {
            if (((li.c) b11).d()) {
                return;
            }
            z1();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        switch (v11.getId()) {
            case R.id.cancel_loading /* 2131362099 */:
            case R.id.home /* 2131362693 */:
                finish();
                break;
            case R.id.hint /* 2131362679 */:
                A1();
                break;
            case R.id.kill /* 2131362790 */:
                b2();
                break;
            case R.id.last_topic /* 2131362797 */:
                S1(PatternContainer.Direction.LEFT, 1, EntryAction.LAST_TAB);
                break;
            case R.id.voice /* 2131363969 */:
                PatternBaseFragment patternBaseFragment = this.M;
                if (patternBaseFragment != null) {
                    patternBaseFragment.w();
                    break;
                }
                break;
        }
    }

    @Override // jh.h, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFormat(-3);
        ThemeUtil.setThemeOnAppCompatActivityCreate(this);
        if (q9.x.r().c(this)) {
            return;
        }
        setVolumeControlStream(3);
        h0.a().d(this, R.raw.chop, R.raw.answer_right, R.raw.answer_error);
        sh.k.D().Q(this);
        if (a2(savedInstanceState)) {
            return;
        }
        int intExtra = getIntent().getIntExtra("type", -1);
        this.f24594j1 = intExtra;
        if (intExtra < 0) {
            finish();
            return;
        }
        if (5 == intExtra) {
            getWindow().addFlags(128);
        }
        setContentView(R.layout.activity_learning_portrait);
        B1();
        C1();
        ad.a s11 = q9.x.r().s();
        this.f24599m = s11;
        this.X = s11.u().s().b().intValue();
        Q1();
        com.baicizhan.client.framework.audio.a aVar = new com.baicizhan.client.framework.audio.a(this);
        this.R = aVar;
        aVar.j(new u());
        OfflineStateRecord m11 = q9.x.r().m();
        this.C = m11.comboCount;
        this.D = m11.maxComboCount;
        this.f24595k = new c0(this);
        AudioRecorderModel audioRecorderModel = (AudioRecorderModel) new ViewModelProvider(this).get(AudioRecorderModel.class);
        this.f24586f0 = audioRecorderModel;
        audioRecorderModel.setListener(this.f24592i1);
        this.f24586f0.getRecordingFile().observe(this, new Observer() { // from class: jh.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                DefaultReviewActivity.this.G1((File) obj);
            }
        });
        wi.p.f96399a.c(LayoutInflater.from(this), (ViewGroup) findViewById(R.id.content));
        hj.p.c(this);
    }

    @Override // jh.h, com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        hg.n.a();
        PatternContainer patternContainer = this.O;
        if (patternContainer != null) {
            patternContainer.removeCallbacks(this.Z);
        }
        PatternBaseFragment patternBaseFragment = this.M;
        if (patternBaseFragment != null) {
            patternBaseFragment.q();
        }
        IAudioPlayer iAudioPlayer = this.R;
        if (iAudioPlayer != null) {
            iAudioPlayer.destroy();
        }
        qb0.h hVar = this.I;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.I.unsubscribe();
        }
        this.f24593j.removeCallbacksAndMessages(null);
        ig.b.f60539a.b();
        System.gc();
        wi.p.f96399a.a();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f24599m == null) {
            return;
        }
        String g11 = sh.f.g(q9.x.r().l(), this.f24594j1);
        com.baicizhan.learning_strategy.util.e<Integer, Integer> s11 = this.f24599m.u().s();
        q9.x.r().d0(g11, q9.x.r().t(g11) + (this.X - s11.b().intValue()));
        this.X = s11.b().intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        this.f24616u1.f();
        if (requestCode == 102) {
            if (grantResults.length != 0 && grantResults[0] == 0) {
                PatternBaseFragment patternBaseFragment = this.M;
                if (patternBaseFragment instanceof WordReadingFragment) {
                    ((WordReadingFragment) patternBaseFragment).setRecordPermissionGranted(true);
                }
            } else if (!ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.RECORD_AUDIO")) {
                mc.a.n(this, ((kc.u) ((u.a) new u.a(this).L(R.string.word_reading_dialog_no_record_permission_title).U(R.string.word_reading_dialog_no_record_permission_rejected).C(R.string.i_know)).b0(ButtonType.SINGLE_POSITIVE).d()).B(new DialogInterface.OnDismissListener() { // from class: jh.b
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        DefaultReviewActivity.this.I1(dialogInterface);
                    }
                }), "no-permission");
            }
            this.f24614t1 = false;
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ig.b.f60539a.c(AppPageStatus.STUDY_REINFORCE);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onResumeFragments() {
        super.onResumeFragments();
        if (this.f24597l) {
            return;
        }
        this.f24593j.postDelayed(this.f24595k, 300L);
        this.f24597l = true;
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("exit", true);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        OfflineStateRecord m11 = q9.x.r().m();
        if (m11 != null) {
            m11.comboCount = this.C;
            m11.maxComboCount = this.D;
            i9.a.p(this, m11);
        }
    }

    @Override // com.baicizhan.main.plusreview.fragment.WriteFragment.c
    public void p() {
        b2();
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment.c
    public boolean s(int topicId, boolean ignoreWiki) {
        this.f24610r1 = ignoreWiki;
        return x(topicId);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f2  */
    @Override // com.baicizhan.main.fragment.PatternBaseFragment.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean x(int r15) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.plusreview.activity.DefaultReviewActivity.x(int):boolean");
    }

    public void z1() {
        Animation animation;
        PatternBaseFragment patternBaseFragment = this.M;
        if (patternBaseFragment != null) {
            patternBaseFragment.j(false);
        }
        e2();
        this.P.setVisibility(4);
        this.Q.c();
        if (this.f24615u != null) {
            this.f24607q.setCompoundDrawablesWithIntrinsicBounds(LearnRecordManager.A().R(this.f24615u.topicId) ? R.drawable.ic_state_slash : this.A ? R.drawable.ic_state_wrong : this.B ? R.drawable.ic_state_check : R.drawable.ic_state_right, 0, 0, 0);
        }
        if (LearnRecordManager.A().R(this.G)) {
            this.J = LearnRecordManager.Answer.KILL;
        }
        LearnRecordManager.Answer answer = this.J;
        if (answer == LearnRecordManager.Answer.CORRECT || answer == LearnRecordManager.Answer.KILL) {
            c2();
            animation = this.f24585f;
        } else {
            PatternContainer.Direction direction = this.f24622z;
            animation = direction == PatternContainer.Direction.DOWN ? this.f24591i : direction == PatternContainer.Direction.LEFT ? this.f24585f : null;
        }
        if (animation != null) {
            this.O.setEnabled(true);
            this.P.startAnimation(animation);
            animation.setAnimationListener(new b());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class t extends h.c {
        public t() {
        }

        @Override // rf.h.c, rf.h.b
        public void c(int code) {
            if (DefaultReviewActivity.this.M instanceof WordReadingFragment) {
                ((WordReadingFragment) DefaultReviewActivity.this.M).Q(code);
            }
        }

        @Override // rf.h.c, rf.h.b
        public void b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class y extends qb0.g<sh.f> {
        public y() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c("", "load problem failed when reviewing.", e11);
            va.g.g(R.string.main_unknown_info, 0);
            DefaultReviewActivity.this.finish();
        }

        @Override // qb0.g
        public void onStart() {
            DefaultReviewActivity.this.f24593j.postDelayed(DefaultReviewActivity.this.f24606p1, 1000L);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(sh.f problemAsset) {
            if (problemAsset == null) {
                DefaultReviewActivity.this.K1();
                return;
            }
            DefaultReviewActivity.this.H = problemAsset;
            DefaultReviewActivity.this.y1();
            DefaultReviewActivity.this.J1();
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Animator.AnimatorListener {
        public a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            p0.f26080a.b(true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            DefaultReviewActivity.this.P.setVisibility(4);
            DefaultReviewActivity.this.Q.c();
            if (DefaultReviewActivity.this.f24594j1 == 5) {
                ((WordReadingFragment) DefaultReviewActivity.this.M).q0();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class x implements ViewPager.OnPageChangeListener {
        public x() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i11) {
            DefaultReviewActivity.this.Q.c();
            c.b a11 = DefaultReviewActivity.this.Q.a(i11);
            IAudioPlayer iAudioPlayer = DefaultReviewActivity.this.R;
            TopicRecord topicRecord = a11.f82093e;
            ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, topicRecord.wordAudio);
            u0 u0Var = u0.f26107a;
            u0Var.p(EntryAction.SLIDE);
            u0Var.n(ma.v.f73041l, t1.a(DefaultReviewActivity.this.f24594j1));
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i11, float v11, int i12) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class z implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PatternBaseFragment f24654a;

        public z(final PatternBaseFragment val$lastFragment) {
            this.f24654a = val$lastFragment;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            DefaultReviewActivity.this.L.removeView(this.f24654a);
            this.f24654a.setBackgroundColor(0);
            hg.n.e(this.f24654a);
            DefaultReviewActivity.this.W = true;
            this.f24654a.setX(0.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
        }
    }
}
