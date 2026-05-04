package com.baicizhan.main.activity;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Handler;
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
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.baicizhan.client.business.dataset.models.OfflineStateRecord;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.managers.experience.StudyBehaviourType;
import com.baicizhan.client.business.thrift.ThriftRequest;
import com.baicizhan.client.business.util.AutoSizeMgr;
import com.baicizhan.client.business.util.RxFlowUtilsKt;
import com.baicizhan.client.business.util.StringUtil;
import com.baicizhan.client.business.util.TempStatus;
import com.baicizhan.client.business.util.TimeUtil;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.client.business.widget.SwipeViewPager;
import com.baicizhan.client.business.widget.WikiVideoView;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.activity.daka.dakapage.DakaActivity;
import com.baicizhan.main.customview.PatternContainer;
import com.baicizhan.main.fragment.PatternBaseFragment;
import com.baicizhan.main.wikiv2.studyv2.data.EntryAction;
import com.baicizhan.main.wikiv2.studyv2.data.EntryPage;
import com.baicizhan.main.wikiv2.studyv2.data.WikiStyle;
import com.baicizhan.main.wikiv2.studyv2.data.p0;
import com.baicizhan.main.wikiv2.studyv2.data.t0;
import com.baicizhan.main.wikiv2.studyv2.data.u0;
import com.baicizhan.main.wikiv2.studyv2.data.v0;
import com.baicizhan.online.bs_users.BBUserFinishPlanInfo;
import com.baicizhan.online.bs_users.BSUsers;
import com.jiongji.andriod.card.R;
import fd.d1;
import fd.p1;
import fd.t1;
import gi.a0;
import gi.f0;
import gi.h0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.inject.Inject;
import kc.u;
import org.apache.thrift.transport.TTransportException;
import org.junit.jupiter.api.j2;
import qf.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@qu.b
/* loaded from: classes4.dex */
public class LearningActivity extends d1 implements View.OnClickListener, PatternBaseFragment.c, li.f {
    public static final long A1 = 15000;

    /* renamed from: v1, reason: collision with root package name */
    public static final String f17976v1 = "LearningActivity";

    /* renamed from: w1, reason: collision with root package name */
    public static boolean f17977w1 = true;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f17978x1 = 400;

    /* renamed from: y1, reason: collision with root package name */
    public static final int f17979y1 = 999;

    /* renamed from: z1, reason: collision with root package name */
    public static final String f17980z1 = "config_dialog_detention_in_study";
    public int A;
    public boolean B;
    public boolean C;
    public PatternContainer.Direction D;
    public int E;
    public int F;
    public nh.a G;
    public long H;
    public int I;
    public sh.f J;
    public int K;
    public qb0.h L;
    public ViewGroup N;
    public FrameLayout O;
    public PatternBaseFragment P;
    public PatternContainer R;
    public FragmentManager S;
    public SwipeViewPager T;
    public qf.c U;
    public IAudioPlayer V;
    public View W;
    public View X;
    public View Y;

    /* renamed from: f, reason: collision with root package name */
    public Animation f17982f;

    /* renamed from: f1, reason: collision with root package name */
    public int f17984f1;

    /* renamed from: g, reason: collision with root package name */
    public Animation f17985g;

    /* renamed from: h, reason: collision with root package name */
    public Animation f17986h;

    /* renamed from: h1, reason: collision with root package name */
    public int f17987h1;

    /* renamed from: i, reason: collision with root package name */
    public Animation f17988i;

    /* renamed from: i1, reason: collision with root package name */
    public w f17989i1;

    /* renamed from: j, reason: collision with root package name */
    public Animation f17990j;

    /* renamed from: k1, reason: collision with root package name */
    @Inject
    public com.baicizhan.client.business.managers.winningstreak.a f17993k1;

    /* renamed from: l, reason: collision with root package name */
    public ad.a f17994l;

    /* renamed from: l1, reason: collision with root package name */
    @Inject
    public u9.d f17995l1;

    /* renamed from: m, reason: collision with root package name */
    public TextView f17996m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f17998n;

    /* renamed from: n1, reason: collision with root package name */
    public PopupWindow f17999n1;

    /* renamed from: o, reason: collision with root package name */
    public TextView f18000o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f18002p;

    /* renamed from: q, reason: collision with root package name */
    public View f18004q;

    /* renamed from: r, reason: collision with root package name */
    public ProgressBar f18006r;

    /* renamed from: s, reason: collision with root package name */
    public TextView f18008s;

    /* renamed from: t, reason: collision with root package name */
    public TopicRecord f18010t;

    /* renamed from: u, reason: collision with root package name */
    public TopicRecord f18012u;

    /* renamed from: v, reason: collision with root package name */
    public int f18014v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f18015w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f18016x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f18017y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f18018z;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17981e = false;

    /* renamed from: k, reason: collision with root package name */
    public Handler f17992k = new Handler();
    public LearnRecordManager.Answer M = LearnRecordManager.Answer.CORRECT;
    public LinkedList<c.b> Q = new LinkedList<>();
    public p1 Z = new p1();

    /* renamed from: f0, reason: collision with root package name */
    public boolean f17983f0 = false;

    /* renamed from: j1, reason: collision with root package name */
    public int f17991j1 = 0;

    /* renamed from: m1, reason: collision with root package name */
    public int f17997m1 = -1;

    /* renamed from: o1, reason: collision with root package name */
    public Runnable f18001o1 = new v();

    /* renamed from: p1, reason: collision with root package name */
    public int f18003p1 = 0;

    /* renamed from: q1, reason: collision with root package name */
    public boolean f18005q1 = false;

    /* renamed from: r1, reason: collision with root package name */
    public Runnable f18007r1 = new c();

    /* renamed from: s1, reason: collision with root package name */
    public Runnable f18009s1 = new d();

    /* renamed from: t1, reason: collision with root package name */
    public boolean f18011t1 = false;

    /* renamed from: u1, reason: collision with root package name */
    public Runnable f18013u1 = new m();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LearningActivity.this.z1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LearningActivity.this.f18008s.setText("返回主界面");
            LearningActivity.this.f18008s.setEnabled(true);
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
                LearningActivity.this.V.f(null);
                LearningActivity.this.V.j(null);
                ZPackUtils.loadAudioCompat(LearningActivity.this.V, LearningActivity.this.f18012u, LearningActivity.this.f18012u.wordAudio);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements IAudioPlayer.a {
        public f() {
        }

        @Override // com.baicizhan.client.framework.audio.IAudioPlayer.a
        public void onPlayError(int i11, int i12) {
            LearningActivity.this.V.f(null);
            LearningActivity.this.V.j(null);
            ZPackUtils.loadAudioCompat(LearningActivity.this.V, LearningActivity.this.f18012u, LearningActivity.this.f18012u.wordAudio);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LearningActivity.this.N1(true);
            LearningActivity.this.C1(false);
            PatternBaseFragment patternBaseFragment = LearningActivity.this.P;
            if (patternBaseFragment != null) {
                patternBaseFragment.j(false);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LearningActivity.this.N1(true);
            PatternBaseFragment patternBaseFragment = LearningActivity.this.P;
            if (patternBaseFragment != null) {
                patternBaseFragment.j(false);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LearningActivity.this.P1(PatternContainer.Direction.DOWN, 0, EntryAction.SENTENCEPIC_CORRECT);
            LearningActivity.this.f18011t1 = false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (LearningActivity.this.isFinishing() || LearningActivity.this.G == null) {
                return;
            }
            LearningActivity.this.G.dismiss();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class k implements IAudioPlayer.a {
        public k() {
        }

        @Override // com.baicizhan.client.framework.audio.IAudioPlayer.a
        public void onPlayError(int what, int extra) {
            qb.c.d(LearningActivity.f17976v1, "audip error %d, %d", Integer.valueOf(what), Integer.valueOf(extra));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LearningActivity.this.U1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class m implements Runnable {
        public m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.baicizhan.learning_strategy.util.e<Integer, Integer> s11 = LearningActivity.this.f17994l.u().s();
            qb.c.i(LearningActivity.f17976v1, "first %d, second %d", s11.a(), s11.b());
            LearningActivity.this.f17996m.setText(LearningActivity.this.getString(R.string.main_new_count_portrait, s11.a(), s11.b()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class o implements PatternContainer.b {
        public o() {
        }

        @Override // com.baicizhan.main.customview.PatternContainer.b
        public void X(PatternContainer.Direction direction) {
            PatternContainer.Direction direction2 = PatternContainer.Direction.LEFT;
            if (direction == direction2) {
                if (LearningActivity.this.P1(direction2, 1, EntryAction.SLIDE)) {
                    LearningActivity.this.I1(false);
                }
            } else {
                PatternContainer.Direction direction3 = PatternContainer.Direction.DOWN;
                if (direction == direction3) {
                    LearningActivity.this.K1();
                    LearningActivity.this.P1(direction3, 0, EntryAction.SLIDE);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class p implements SwipeViewPager.b {
        public p() {
        }

        @Override // com.baicizhan.client.business.widget.SwipeViewPager.b
        public void a(SwipeViewPager.Direction direction) {
            if (LearningActivity.this.G1() && LearningActivity.this.T.getCurrentItem() == LearningActivity.this.f18003p1 && direction == SwipeViewPager.Direction.RIGHT) {
                LearningActivity.this.D = PatternContainer.Direction.LEFT;
                LearningActivity.this.B1();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class r extends kc.r {
        public r() {
        }

        @Override // kc.r, kc.q
        public void onDialogNegativeClick(@NonNull View view) {
            LearningActivity.this.finish();
            ma.l.a(ma.t.f73006e, ma.a.f72747g);
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View view) {
            ma.l.a(ma.t.f73006e, ma.a.f72740f);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class t implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PatternBaseFragment f18038a;

        public t(final PatternBaseFragment val$lastFragment) {
            this.f18038a = val$lastFragment;
        }

        @Override // java.lang.Runnable
        public void run() {
            LearningActivity.this.O.removeView(this.f18038a);
            this.f18038a.q();
            this.f18038a.setBackgroundColor(0);
            hg.n.e(this.f18038a);
            LearningActivity.this.X.setOnClickListener(LearningActivity.this);
            LearningActivity.this.f17983f0 = true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class v implements Runnable {
        public v() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LearningActivity.this.W1(0);
            LearningActivity.this.f18005q1 = true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class w implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<LearningActivity> f18044a;

        /* renamed from: b, reason: collision with root package name */
        public int f18045b;

        /* renamed from: c, reason: collision with root package name */
        public List<TopicRecord> f18046c;

        /* renamed from: d, reason: collision with root package name */
        public int f18047d;

        @Override // java.lang.Runnable
        public void run() {
            LearningActivity learningActivity = this.f18044a.get();
            if (learningActivity == null) {
                return;
            }
            int indexOfChild = learningActivity.O.indexOfChild(learningActivity.P);
            if (indexOfChild >= 0) {
                if (learningActivity.f17983f0) {
                    learningActivity.x1();
                } else {
                    int i11 = this.f18047d;
                    if (i11 > 1 && i11 <= 100) {
                        qb.c.d("", "plusreview exchange example fragment error! fragment to add has not been removed: [" + indexOfChild + j2.O + learningActivity.P + "; and retried: " + this.f18047d + "; has not exchanged", new Object[0]);
                    }
                    if (this.f18047d <= 100) {
                        learningActivity.R.postDelayed(this, 360L);
                        this.f18047d++;
                        return;
                    }
                    learningActivity.x1();
                }
            }
            learningActivity.P.setAlpha(1.0f);
            learningActivity.O.addView(learningActivity.P, 0);
            learningActivity.P.o(learningActivity);
            try {
                learningActivity.P.v(this.f18045b, this.f18046c, learningActivity.V);
            } catch (Exception e11) {
                qb.c.c(LearningActivity.f17976v1, "", e11);
            }
            learningActivity.N1(true);
            learningActivity.Z.g(learningActivity.K, learningActivity.I);
        }

        public w(LearningActivity activity) {
            this.f18044a = new WeakReference<>(activity);
        }
    }

    private void A1() {
        this.f17992k.removeCallbacks(this.f18007r1);
        this.f17992k.removeCallbacks(this.f18009s1);
        this.f18004q.setVisibility(4);
        this.f18004q.setOnClickListener(this);
    }

    private void F1() {
        PatternContainer patternContainer = (PatternContainer) findViewById(R.id.learning_page);
        this.R = patternContainer;
        patternContainer.setOnFlingListener(new o());
        this.O = (FrameLayout) findViewById(R.id.example_placeholder);
        findViewById(R.id.home).setOnClickListener(this);
        this.f17996m = (TextView) findViewById(R.id.new_count);
        TextView textView = (TextView) findViewById(R.id.last_topic);
        this.f18002p = textView;
        textView.setOnClickListener(this);
        View findViewById = findViewById(R.id.hint);
        this.W = findViewById;
        findViewById.setOnClickListener(this);
        View findViewById2 = findViewById(R.id.kill);
        this.X = findViewById2;
        findViewById2.setOnClickListener(this);
        View findViewById3 = findViewById(R.id.voice);
        this.Y = findViewById3;
        findViewById3.setOnClickListener(this);
        View findViewById4 = findViewById(R.id.progress_layout);
        this.f18004q = findViewById4;
        this.f18006r = (ProgressBar) findViewById4.findViewById(R.id.loading_progress);
        TextView textView2 = (TextView) this.f18004q.findViewById(R.id.cancel_loading);
        this.f18008s = textView2;
        textView2.setOnClickListener(this);
        this.S = getSupportFragmentManager();
        SwipeViewPager swipeViewPager = (SwipeViewPager) findViewById(R.id.wiki_pager);
        this.T = swipeViewPager;
        ViewCompat.setOverScrollMode(swipeViewPager, 2);
        this.T.setFlingListener(new p());
        this.T.setOnPageChangeListener(new q());
        this.G = new nh.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J1() {
        A1();
        TopicRecord topicRecord = this.f18012u;
        if (topicRecord != null) {
            this.f18010t = topicRecord;
            this.f18002p.setText(String.format(Locale.CHINA, "%s %s", topicRecord.word, StringUtil.firstLine(topicRecord.wordMean)));
            this.f18002p.setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(getResources(), f0.a(this, this.M == LearnRecordManager.Answer.KILL ? R.drawable.ic_state_slash : this.f18015w ? R.drawable.ic_state_wrong : this.f18016x ? R.drawable.ic_state_check : R.drawable.ic_state_right)), (Drawable) null, (Drawable) null, (Drawable) null);
            this.B = this.f18015w;
            this.C = this.f18016x;
        } else {
            this.f18002p.setText("");
            this.f18002p.setCompoundDrawables(null, null, null, null);
        }
        this.f18015w = false;
        this.f18016x = false;
        this.f18017y = false;
        this.f18018z = false;
        this.I = this.J.c();
        this.Q.addFirst(new c.b(q9.x.r().l(), this.I, null, this.K, this.J.j()));
        this.M = LearnRecordManager.Answer.WRONG;
        this.H = System.currentTimeMillis();
        this.A = 0;
        this.X.setEnabled(true);
        this.J.p();
        TopicRecord j11 = this.J.j();
        this.f18012u = j11;
        this.f18014v = ZPackUtils.getZpkTagIdCompat(j11);
        List<TopicRecord> d11 = this.J.d();
        int indexOf = d11.indexOf(this.f18012u);
        PatternBaseFragment patternBaseFragment = this.P;
        if (patternBaseFragment != null) {
            this.f17983f0 = false;
            t tVar = new t(patternBaseFragment);
            if (this.f17981e) {
                this.O.post(tVar);
                this.f17981e = false;
            } else {
                patternBaseFragment.animate().x(patternBaseFragment.getWidth()).alpha(0.0f).setDuration(300L).setListener(new u(patternBaseFragment, tVar)).start();
                patternBaseFragment.setBackgroundColor(getResources().getColor(R.color.main_color_weak_bg));
            }
        }
        this.P = hg.n.d(this, this.K, this.f17991j1);
        u1(indexOf, d11);
        this.f17992k.removeCallbacks(this.f18001o1);
        this.f17992k.postDelayed(this.f18001o1, 1000L);
        V1();
        this.f17987h1++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L1() {
        a0.h(true);
        nd.d.c(this);
        LearnRecordManager A = LearnRecordManager.A();
        if (!rb.d.f(this)) {
            dg.b.f(getApplicationContext(), A.z(), q9.x.r().q()).r5(new n());
        }
        DakaActivity.g1(this);
        q9.x.r().i0(true);
        BBUserFinishPlanInfo bBUserFinishPlanInfo = new BBUserFinishPlanInfo();
        bBUserFinishPlanInfo.setBook_id(A.z());
        bBUserFinishPlanInfo.setTotal_words_count(A.I());
        int H = A.H();
        bBUserFinishPlanInfo.setNew_words_count(H);
        if (H > 0) {
            bBUserFinishPlanInfo.setIs_book_finished(false);
        } else {
            bBUserFinishPlanInfo.setIs_book_finished(A.E() == 0);
        }
        com.baicizhan.client.business.thrift.c.b().a(new x(this, bBUserFinishPlanInfo));
        S1();
        ad.c u11 = q9.x.r().s().u();
        if (u11 == null || u11.k() == 0) {
            ma.l.b(ma.t.f73003b, ma.a.F, ma.u.a("plan_type", ma.v.f73035f));
        } else {
            ma.l.b(ma.t.f73003b, ma.a.D, ma.u.a("plan_type", ma.v.f73036g));
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U1() {
        this.f18005q1 = false;
        qb.c.b(f17976v1, "tryNextProblem", new Object[0]);
        if (this.M == LearnRecordManager.Answer.WRONG) {
            return;
        }
        sh.k.D().t(this.J);
        N1(false);
        this.L = sh.k.D().I().r5(new s());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z1() {
        this.f17992k.postDelayed(this.f18009s1, 15000L);
        this.f18004q.setVisibility(0);
        this.f18006r.setProgress(0);
        this.f18008s.setText("加载中o(｀ω´ )o");
        this.f18008s.setEnabled(false);
        this.f18004q.setOnClickListener(this);
    }

    public void B1() {
        Animation animation;
        PatternBaseFragment patternBaseFragment = this.P;
        if (patternBaseFragment != null) {
            patternBaseFragment.j(false);
        }
        V1();
        this.T.setVisibility(4);
        this.U.c();
        if (this.f18010t != null) {
            this.f18002p.setCompoundDrawablesWithIntrinsicBounds(LearnRecordManager.A().R(this.f18010t.topicId) ? R.drawable.ic_state_slash : this.B ? R.drawable.ic_state_wrong : this.C ? R.drawable.ic_state_check : R.drawable.ic_state_right, 0, 0, 0);
        }
        if (LearnRecordManager.A().R(this.I)) {
            this.M = LearnRecordManager.Answer.KILL;
        }
        LearnRecordManager.Answer answer = this.M;
        if (answer == LearnRecordManager.Answer.CORRECT || answer == LearnRecordManager.Answer.KILL) {
            this.f17981e = true;
            U1();
            animation = this.f17982f;
        } else {
            PatternContainer.Direction direction = this.D;
            animation = direction == PatternContainer.Direction.DOWN ? this.f17990j : direction == PatternContainer.Direction.LEFT ? this.f17982f : null;
        }
        if (animation != null) {
            this.R.setEnabled(true);
            this.T.startAnimation(animation);
            animation.setAnimationListener(new b());
        }
    }

    @Override // li.f
    public void C(Integer killedId) {
        M1();
        B1();
    }

    public final void C1(boolean fromHint) {
        if (fromHint) {
            this.f18017y = true;
        }
        PatternBaseFragment patternBaseFragment = this.P;
        if (patternBaseFragment != null) {
            if (patternBaseFragment.k()) {
                this.Z.e(fromHint);
                return;
            }
            K1();
            EntryAction entryAction = EntryAction.WRONG_ANSWER;
            if (fromHint) {
                entryAction = EntryAction.CLICK_HINT;
            }
            P1(PatternContainer.Direction.DOWN, 0, entryAction);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D1() {
        ma.l.a(ma.t.f73003b, ma.a.f72733e);
        y9.e f11 = y9.e.f();
        long f12 = i9.f.f(this, f17980z1);
        long startOfDay = TimeUtil.getStartOfDay(System.currentTimeMillis());
        if (f12 == startOfDay || !f11.e(y9.c.f99693a)) {
            finish();
            return;
        }
        try {
            if (f11.d(y9.c.f99693a, "text")) {
                Map map = (Map) f11.c(y9.c.f99693a, "text");
                mc.a.m(this, ((kc.u) ((u.a) ((u.a) new u.a(this).V((String) map.get("content")).F((String) map.get(ma.b.H0))).p((String) map.get(ma.b.I0))).d()).f0(new r()));
                i9.f.m(this, f17980z1, startOfDay);
            }
        } catch (Exception e11) {
            qb.c.c(f17976v1, "param error", e11);
            finish();
        }
    }

    public final void E1() {
        this.f17990j = AnimationUtils.loadAnimation(this, R.anim.business_push_up_out);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.business_push_down_in);
        this.f17986h = loadAnimation;
        loadAnimation.setDuration(400L);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.business_push_left_in);
        this.f17988i = loadAnimation2;
        loadAnimation2.setDuration(150L);
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        this.f17982f = translateAnimation;
        translateAnimation.setDuration(300L);
        Animation loadAnimation3 = AnimationUtils.loadAnimation(this, android.R.anim.fade_out);
        this.f17985g = loadAnimation3;
        loadAnimation3.setDuration(50L);
    }

    public boolean G1() {
        return this.T.getVisibility() == 0;
    }

    public void H1() {
        if (i9.j.c(i9.j.f60415f, true)) {
            h0.a().b(this, R.raw.chop);
        }
        w1();
        this.M = LearnRecordManager.Answer.KILL;
        LearnRecordManager.A().U(this.I, y1(), this.f18014v);
        this.P.n();
        this.X.startAnimation(this.f17985g);
        this.X.setOnClickListener(null);
        U1();
    }

    public final void K1() {
        if (!this.f18016x) {
            LearnRecordManager.A().P(this.I);
        }
        this.f18016x = true;
    }

    public final void M1() {
        LinkedList<c.b> linkedList = this.Q;
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

    public final void N1(boolean enabled) {
        this.f18002p.setEnabled(enabled);
        this.W.setEnabled(enabled);
        this.X.setEnabled(enabled);
        this.Y.setEnabled(enabled);
        this.R.setEnabled(enabled);
    }

    @SuppressLint({"InflateParams"})
    public final void O1(View anchor, CharSequence text) {
        PopupWindow popupWindow = this.f17999n1;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        View inflate = getLayoutInflater().inflate(R.layout.learning_status_tip_window, (ViewGroup) null, false);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(getResources().getColor(R.color.main_color_white));
        gradientDrawable.setCornerRadius(xb.i.a(this, 4.0f));
        TextView textView = (TextView) inflate.findViewById(R.id.text);
        ViewCompat.setBackground(textView, gradientDrawable);
        textView.setText(text);
        PopupWindow popupWindow2 = new PopupWindow(inflate, -2, -2);
        this.f17999n1 = popupWindow2;
        popupWindow2.setTouchable(true);
        this.f17999n1.setFocusable(true);
        this.f17999n1.setOutsideTouchable(false);
        this.f17999n1.setBackgroundDrawable(new ColorDrawable(0));
        this.f17999n1.setAnimationStyle(R.style.Animations_fade_in_out);
        Rect rect = new Rect();
        anchor.getGlobalVisibleRect(rect);
        this.f17999n1.showAtLocation(this.R, 8388659, ((rect.left + rect.right) - xb.i.a(this, 220.0f)) / 2, rect.bottom);
    }

    public boolean P1(PatternContainer.Direction direction, final int offset, EntryAction action) {
        if (!this.f18005q1 || offset > 0) {
            p0.f26080a.b(false);
        }
        if (!this.f18005q1) {
            this.f17992k.removeCallbacks(this.f18001o1);
            qb.c.b(f17976v1, "update wiki adapter", new Object[0]);
            W1(0);
        }
        if (offset >= this.Q.size()) {
            return false;
        }
        if (offset == 0) {
            this.f18018z = true;
        }
        this.f18003p1 = offset;
        this.T.setOffset(offset);
        this.T.setCurrentItem(offset);
        u0 u0Var = u0.f26107a;
        u0Var.p(action);
        u0Var.n(t0.a(this.f17991j1), t1.a(this.K));
        PatternBaseFragment patternBaseFragment = this.P;
        if (patternBaseFragment != null) {
            patternBaseFragment.h();
        }
        ZPackUtils.loadAudioCompat(this.V, this.Q.get(offset).f82093e, this.Q.get(offset).f82093e.wordAudio);
        this.T.setVisibility(0);
        this.R.setEnabled(false);
        this.D = direction;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.T, "translationX", xb.f.i(this), 0.0f).setDuration(200L);
        if (direction == PatternContainer.Direction.DOWN) {
            duration = ObjectAnimator.ofFloat(this.T, "translationY", -xb.f.f(this), 0.0f).setDuration(200L);
        }
        duration.addListener(new a());
        duration.start();
        return true;
    }

    public final void T1() {
        if (this.Z.f() || this.f18011t1) {
            return;
        }
        H1();
    }

    public final void V1() {
        this.f17992k.removeCallbacks(this.f18013u1);
        this.f17992k.postDelayed(this.f18013u1, 500L);
    }

    public final void W1(int offset) {
        int size = this.Q.size() - offset;
        qf.c cVar = this.U;
        if (cVar == null || cVar.getCount() != size) {
            FragmentManager fragmentManager = this.S;
            LinkedList<c.b> linkedList = this.Q;
            qf.c cVar2 = new qf.c(fragmentManager, this, linkedList.subList(offset, linkedList.size()));
            this.U = cVar2;
            this.T.setAdapter(cVar2);
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity
    public boolean enableCustomSystemBar() {
        return true;
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

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (!G1()) {
            super.onBackPressed();
            return;
        }
        ActivityResultCaller b11 = this.U.b(this.T.getCurrentItem());
        if (b11 == null || !(b11 instanceof li.c)) {
            B1();
        } else {
            if (((li.c) b11).d()) {
                return;
            }
            B1();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        switch (v11.getId()) {
            case R.id.cancel_loading /* 2131362099 */:
                finish();
                break;
            case R.id.hint /* 2131362679 */:
                C1(true);
                break;
            case R.id.home /* 2131362693 */:
                D1();
                break;
            case R.id.kill /* 2131362790 */:
                T1();
                break;
            case R.id.last_topic /* 2131362797 */:
                if (P1(PatternContainer.Direction.LEFT, 1, EntryAction.LAST_TAB)) {
                    I1(true);
                    break;
                }
                break;
            case R.id.voice /* 2131363969 */:
                PatternBaseFragment patternBaseFragment = this.P;
                if (patternBaseFragment != null) {
                    patternBaseFragment.w();
                    break;
                }
                break;
        }
    }

    @Override // fd.d1, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        q9.x.r().w0(true);
        getWindow().setFormat(-3);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 512);
        updateStatusBar();
        if (q9.x.r().s() != null && q9.x.r().s().u() != null && q9.x.r().s().u().k() > 0) {
            this.f17991j1 = 3;
        }
        hg.n.f(this, 1, 2, this.f17991j1);
        hg.n.f(this, 2, 2, this.f17991j1);
        hg.n.f(this, 3, 2, this.f17991j1);
        hg.n.f(this, 23, 2, this.f17991j1);
        h0.a().d(this, R.raw.chop, R.raw.answer_right, R.raw.answer_error);
        sh.k.D().Q(this);
        if (q9.x.r().c(this)) {
            return;
        }
        setVolumeControlStream(3);
        if (!q9.x.r().J() || q9.x.r().s() == null) {
            qb.c.d(f17976v1, "launch learning activity failed for study data invalid.", new Object[0]);
            finish();
            return;
        }
        setRequestedOrientation(1);
        setContentView(R.layout.activity_learning_portrait);
        this.N = (ViewGroup) getWindow().getDecorView();
        E1();
        F1();
        this.Z.h(this);
        ad.a s11 = q9.x.r().s();
        this.f17994l = s11;
        this.f17984f1 = s11.u().s().a().intValue();
        com.baicizhan.client.framework.audio.a aVar = new com.baicizhan.client.framework.audio.a(this);
        this.V = aVar;
        aVar.j(new k());
        OfflineStateRecord m11 = q9.x.r().m();
        if (m11 != null) {
            this.E = m11.comboCount;
            this.F = m11.maxComboCount;
        }
        U1();
        i80.c.f().v(this);
        oh.c.c().f();
        wi.p.f96399a.c(LayoutInflater.from(this), (ViewGroup) findViewById(R.id.content));
        hj.p.c(this);
        if (v0.f26118a.b()) {
            u0.f26107a.r(WikiStyle.TEST_GUIDE_WIKI);
        } else {
            u0.f26107a.r(WikiStyle.STUDY_WIKI);
        }
        u0.f26107a.q(EntryPage.RECITE_PAGE);
    }

    @Override // fd.d1, com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        try {
            sh.e.e().a();
            hg.n.a();
            Handler handler = this.f17992k;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            qb0.h hVar = this.L;
            if (hVar != null && !hVar.isUnsubscribed()) {
                this.L.unsubscribe();
            }
            PatternBaseFragment patternBaseFragment = this.P;
            if (patternBaseFragment != null) {
                patternBaseFragment.q();
                this.P = null;
            }
            IAudioPlayer iAudioPlayer = this.V;
            if (iAudioPlayer != null) {
                iAudioPlayer.destroy();
                this.V = null;
            }
            PatternContainer patternContainer = this.R;
            if (patternContainer != null) {
                patternContainer.removeCallbacks(this.f17989i1);
            }
        } catch (Exception e11) {
            qb.c.p(f17976v1, "pre super destroy ", e11);
        }
        try {
            super.onDestroy();
            TempStatus.sRemindStudyDialogEnabled = true;
        } catch (Throwable th2) {
            qb.c.p(f17976v1, "", th2);
        }
        i80.c.f().A(this);
        oh.c.c().g();
        wi.p.f96399a.a();
    }

    @i80.l
    public void onEventMainThread(WikiVideoView.d event) {
        SwipeViewPager swipeViewPager = this.T;
        if (swipeViewPager != null) {
            swipeViewPager.setLocked(event.f17251a);
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Q1();
        R1();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onResumeFragments() {
        super.onResumeFragments();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        OfflineStateRecord m11 = q9.x.r().m();
        if (m11 != null) {
            m11.comboCount = this.E;
            m11.maxComboCount = this.F;
            i9.a.p(this, m11);
        }
    }

    public final void u1(int rightIdx, List<TopicRecord> options) {
        this.R.removeCallbacks(this.f17989i1);
        if (this.f17989i1 == null) {
            this.f17989i1 = new w();
        }
        this.f17989i1.f18045b = rightIdx;
        this.f17989i1.f18046c = options;
        this.R.post(this.f17989i1);
    }

    public final void v1(boolean right) {
        this.f17995l1.c(q9.x.r().l(), this.I, ch.n.a(this.K), right ? StudyBehaviourType.Right : StudyBehaviourType.Wrong);
    }

    public final void w1() {
        com.baicizhan.client.business.managers.winningstreak.d dVar = (com.baicizhan.client.business.managers.winningstreak.d) RxFlowUtilsKt.asRxJava(this.f17993k1.f()).t6().b();
        if (this.f17993k1.enable()) {
            xa.b.b(dVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c6  */
    @Override // com.baicizhan.main.fragment.PatternBaseFragment.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean x(int r13) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.LearningActivity.x(int):boolean");
    }

    public final void x1() {
        this.O.removeView(this.P);
        this.P.q();
        this.P.setBackgroundColor(0);
        hg.n.e(this.P);
        this.X.setOnClickListener(this);
        this.f17983f0 = true;
        this.P = hg.n.d(this, this.K, this.f17991j1);
    }

    public final long y1() {
        long currentTimeMillis = System.currentTimeMillis();
        long j11 = currentTimeMillis - this.H;
        this.H = currentTimeMillis;
        return j11;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class n extends qb0.g<List<Integer>> {
        public n() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c("", "write daka date error.", e11);
        }

        @Override // qb0.c
        public void onNext(List<Integer> integers) {
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class s extends qb0.g<sh.f> {
        public s() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(LearningActivity.f17976v1, "", e11);
            va.g.g(R.string.main_unknown_info, 0);
            LearningActivity.this.finish();
        }

        @Override // qb0.g
        public void onStart() {
            LearningActivity.this.f17992k.postDelayed(LearningActivity.this.f18007r1, 1000L);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(sh.f problemAsset) {
            qb.c.b(LearningActivity.f17976v1, "onNext " + problemAsset, new Object[0]);
            if (problemAsset == null) {
                LearningActivity.this.L1();
                return;
            }
            LearningActivity.this.J = problemAsset;
            yc.b w11 = q9.x.r().w(LearningActivity.this.J.c());
            LearningActivity learningActivity = LearningActivity.this;
            learningActivity.K = learningActivity.f17994l.n().C(w11).W();
            if (LearningActivity.f17977w1 && LearningActivity.this.K == 1) {
                ma.l.a(ma.t.f73021t, ma.a.f72715b2);
                LearningActivity.f17977w1 = false;
            }
            LearningActivity.this.J1();
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
            LearningActivity.this.T.setVisibility(4);
            LearningActivity.this.U.c();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class q implements ViewPager.OnPageChangeListener {
        public q() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i11) {
            LearningActivity.this.U.c();
            c.b a11 = LearningActivity.this.U.a(i11);
            IAudioPlayer iAudioPlayer = LearningActivity.this.V;
            TopicRecord topicRecord = a11.f82093e;
            ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, topicRecord.wordAudio);
            u0 u0Var = u0.f26107a;
            u0Var.p(EntryAction.SLIDE);
            u0Var.n(t0.a(LearningActivity.this.f17991j1), t1.a(LearningActivity.this.K));
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i11, float v11, int i12) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class u implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PatternBaseFragment f18040a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f18041b;

        public u(final PatternBaseFragment val$lastFragment, final Runnable val$detachRunnable) {
            this.f18040a = val$lastFragment;
            this.f18041b = val$detachRunnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            this.f18040a.setX(0.0f);
            LearningActivity.this.O.post(this.f18041b);
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
    public static class x extends ThriftRequest<BSUsers.Client, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<LearningActivity> f18048a;

        /* renamed from: b, reason: collision with root package name */
        public final BBUserFinishPlanInfo f18049b;

        public x(LearningActivity activity, BBUserFinishPlanInfo finishPlanInfo) {
            super("/rpc/users");
            this.f18048a = new WeakReference<>(activity);
            this.f18049b = finishPlanInfo;
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(BSUsers.Client client) throws Exception {
            if (this.f18048a.get() == null) {
                return null;
            }
            return Integer.valueOf(client.finish_plan_notify(this.f18049b));
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            if (exception instanceof TTransportException) {
                return;
            }
            qb.c.c(LearningActivity.f17976v1, "", exception);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(Integer integer) {
        }
    }

    public final void Q1() {
    }

    public final void R1() {
    }

    public final void S1() {
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment.c
    public void k0() {
    }

    public final void I1(boolean click) {
    }
}
