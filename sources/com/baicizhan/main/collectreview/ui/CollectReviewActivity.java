package com.baicizhan.main.collectreview.ui;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCaller;
import androidx.annotation.IdRes;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import ch.n;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.managers.experience.StudyBehaviourType;
import com.baicizhan.client.business.util.StringUtil;
import com.baicizhan.client.business.util.ThemeUtil;
import com.baicizhan.client.business.widget.SwipeViewPager;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.collectreview.ui.CollectReviewActivity;
import com.baicizhan.main.collectreview.ui.a;
import com.baicizhan.main.customview.PatternContainer;
import com.baicizhan.main.examassistant.data.MarkedWord;
import com.baicizhan.main.fragment.PatternBaseFragment;
import com.baicizhan.main.global.AppPageStatus;
import com.baicizhan.main.wikiv2.studyv2.data.EntryAction;
import com.baicizhan.main.wikiv2.studyv2.data.WikiStyle;
import com.baicizhan.main.wikiv2.studyv2.data.u0;
import com.jiongji.andriod.card.R;
import fd.t1;
import gi.f0;
import gi.h0;
import hj.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.inject.Inject;
import kc.u;
import ma.t;
import ma.v;
import ni.c;
import org.apache.thrift.TException;
import q9.x;
import qf.c;
import rx.exceptions.CompositeException;
import wf.u;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@qu.b
/* loaded from: classes4.dex */
public class CollectReviewActivity extends yf.g implements a.InterfaceC0301a, View.OnClickListener, PatternContainer.b, PatternBaseFragment.c, li.f {
    public static final String F = "CollectReviewActivity";
    public static final String G = "user_book_id";
    public static final String H = "marked_words_list";
    public static final String I = "learn_type";
    public static final int J = 0;
    public static final int K = 1;
    public static final long L = 15000;
    public static final String M = "asset_load_dialg";
    public Animation A;
    public Animation B;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public u9.d f19958e;

    /* renamed from: f, reason: collision with root package name */
    public View f19959f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f19960g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f19961h;

    /* renamed from: i, reason: collision with root package name */
    public FrameLayout f19962i;

    /* renamed from: j, reason: collision with root package name */
    public PatternBaseFragment f19963j;

    /* renamed from: k, reason: collision with root package name */
    public SwipeViewPager f19964k;

    /* renamed from: l, reason: collision with root package name */
    public qf.c f19965l;

    /* renamed from: m, reason: collision with root package name */
    public qb0.h f19966m;

    /* renamed from: n, reason: collision with root package name */
    public wf.d f19967n;

    /* renamed from: o, reason: collision with root package name */
    public View f19968o;

    /* renamed from: q, reason: collision with root package name */
    public boolean f19970q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f19971r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f19972s;

    /* renamed from: t, reason: collision with root package name */
    public PatternContainer.Direction f19973t;

    /* renamed from: v, reason: collision with root package name */
    public com.baicizhan.main.collectreview.ui.a f19975v;

    /* renamed from: x, reason: collision with root package name */
    public IAudioPlayer f19977x;

    /* renamed from: y, reason: collision with root package name */
    public Animation f19978y;

    /* renamed from: z, reason: collision with root package name */
    public Animation f19979z;

    /* renamed from: p, reason: collision with root package name */
    public LearnRecordManager.Answer f19969p = LearnRecordManager.Answer.CORRECT;

    /* renamed from: u, reason: collision with root package name */
    public LinkedList<c.b> f19974u = new LinkedList<>();

    /* renamed from: w, reason: collision with root package name */
    public Handler f19976w = new Handler();
    public Runnable C = new h();
    public Runnable D = new i();
    public Runnable E = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectReviewActivity.this.x1(0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements IAudioPlayer.a {
        public c() {
        }

        @Override // com.baicizhan.client.framework.audio.IAudioPlayer.a
        public void onPlayError(int what, int extra) {
            qb.c.d(CollectReviewActivity.F, "audip error %d, %d", Integer.valueOf(what), Integer.valueOf(extra));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectReviewActivity.this.f19959f.setVisibility(8);
            CollectReviewActivity.this.s1(PatternContainer.Direction.DOWN, 0, EntryAction.WRONG_ANSWER);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectReviewActivity.this.w1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements SwipeViewPager.b {
        public f() {
        }

        @Override // com.baicizhan.client.business.widget.SwipeViewPager.b
        public void a(SwipeViewPager.Direction direction) {
            if (CollectReviewActivity.this.f19964k.getVisibility() == 0 && CollectReviewActivity.this.f19964k.getCurrentItem() == 0 && direction == SwipeViewPager.Direction.RIGHT) {
                CollectReviewActivity.this.f19973t = PatternContainer.Direction.LEFT;
                CollectReviewActivity.this.h1();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectReviewActivity.this.f1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CollectReviewActivity.this.g1();
            CollectReviewActivity.this.f19975v = com.baicizhan.main.collectreview.ui.a.t("返回主界面", true);
            CollectReviewActivity.this.f19975v.show(CollectReviewActivity.this.getSupportFragmentManager(), CollectReviewActivity.M);
            va.g.i("客官，你的某些单词资源有缺失，需联网更新。\nTip：连接稳定的网络，即可自动更新", 1);
        }
    }

    private void e1(boolean right) {
        wf.d dVar = this.f19967n;
        this.f19958e.c(x.r().l(), dVar != null ? dVar.g() : 0, n.f8667o, right ? StudyBehaviourType.Right : StudyBehaviourType.Wrong);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f1() {
        com.baicizhan.main.collectreview.ui.a t11 = com.baicizhan.main.collectreview.ui.a.t("加载中o(｀ω´ )o", false);
        this.f19975v = t11;
        t11.show(getSupportFragmentManager(), M);
        this.f19976w.postDelayed(this.D, 15000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g1() {
        this.f19976w.removeCallbacks(this.C);
        this.f19976w.removeCallbacks(this.D);
        com.baicizhan.main.collectreview.ui.a aVar = this.f19975v;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h1() {
        Animation animation;
        PatternBaseFragment patternBaseFragment = this.f19963j;
        if (patternBaseFragment != null) {
            patternBaseFragment.j(false);
        }
        this.f19965l.c();
        LearnRecordManager.Answer answer = this.f19969p;
        LearnRecordManager.Answer answer2 = LearnRecordManager.Answer.CORRECT;
        if (answer == answer2) {
            w1();
            this.f19973t = PatternContainer.Direction.RIGHT;
        }
        this.f19959f.setVisibility(8);
        LearnRecordManager.Answer answer3 = this.f19969p;
        if (answer3 == answer2 || answer3 == LearnRecordManager.Answer.KILL) {
            w1();
            animation = this.f19978y;
        } else {
            animation = this.f19973t == PatternContainer.Direction.DOWN ? this.B : this.f19978y;
        }
        this.f19964k.startAnimation(animation);
        animation.setAnimationListener(new b());
    }

    private void j1() {
        this.B = AnimationUtils.loadAnimation(this, R.anim.business_push_up_out);
        Animation loadAnimation = AnimationUtils.loadAnimation(this, R.anim.business_push_down_in);
        this.f19979z = loadAnimation;
        loadAnimation.setDuration(150L);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(this, R.anim.business_push_left_in);
        this.A = loadAnimation2;
        loadAnimation2.setDuration(150L);
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        this.f19978y = translateAnimation;
        translateAnimation.setDuration(150L);
    }

    private void k1() {
        this.f19959f = findViewById(R.id.disable_click);
        ((PatternContainer) findViewById(R.id.container)).setOnFlingListener(this);
        findViewById(R.id.home).setOnClickListener(this);
        this.f19960g = (TextView) findViewById(R.id.remain_count);
        TextView textView = (TextView) findViewById(R.id.last_topic);
        this.f19961h = textView;
        textView.setOnClickListener(this);
        this.f19962i = (FrameLayout) findViewById(R.id.topic_review_container);
        findViewById(R.id.hint).setOnClickListener(this);
        View findViewById = findViewById(R.id.voice);
        this.f19968o = findViewById;
        findViewById.setOnClickListener(this);
        SwipeViewPager swipeViewPager = (SwipeViewPager) findViewById(R.id.wiki_pager);
        this.f19964k = swipeViewPager;
        ViewCompat.setOverScrollMode(swipeViewPager, 2);
        this.f19964k.setFlingListener(new f());
        this.f19964k.setOnPageChangeListener(new g());
    }

    private boolean l1() {
        return this.f19964k.getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s1(final PatternContainer.Direction direction, final int offset, EntryAction action) {
        this.f19976w.removeCallbacks(this.E);
        if (offset >= this.f19974u.size()) {
            return;
        }
        u0 u0Var = u0.f26107a;
        u0Var.p(action);
        u0Var.r(WikiStyle.SEARCH_WIKI);
        u0Var.n(v.f73042m, t1.a(wf.c.e().d()));
        this.f19959f.setVisibility(0);
        Animation animation = direction == PatternContainer.Direction.DOWN ? this.f19979z : this.A;
        this.f19973t = direction;
        this.f19964k.startAnimation(animation);
        this.f19964k.setVisibility(0);
        x1(offset);
        this.f19964k.setCurrentItem(0);
    }

    public static void t1(Context context) {
        u1(context, 0L);
    }

    public static void u1(Context context, long userBookId) {
        Intent intent = new Intent(context, (Class<?>) CollectReviewActivity.class);
        intent.putExtra(G, userBookId);
        intent.putExtra(I, 0);
        context.startActivity(intent);
    }

    public static void v1(Context context, List<MarkedWord> markedWords) {
        if (xb.e.h(markedWords)) {
            qb.c.d(F, "EMPTY words", new Object[0]);
            return;
        }
        Intent intent = new Intent(context, (Class<?>) CollectReviewActivity.class);
        intent.putExtra(I, 1);
        long currentTimeMillis = System.currentTimeMillis();
        xf.g.f98042a.a().put(Long.valueOf(currentTimeMillis), new ArrayList(markedWords));
        intent.putExtra(H, currentTimeMillis);
        context.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w1() {
        this.f19959f.setVisibility(0);
        this.f19966m = wf.c.e().j(this, tb0.a.a()).I3(tb0.a.a()).r5(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x1(int offset) {
        int size = this.f19974u.size() - offset;
        qf.c cVar = this.f19965l;
        if (cVar == null || cVar.getCount() != size) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            c.a aVar = ni.c.f75133d;
            Objects.requireNonNull(aVar);
            yf.d dVar = new yf.d(aVar);
            LinkedList<c.b> linkedList = this.f19974u;
            qf.c cVar2 = new qf.c(supportFragmentManager, this, dVar, linkedList.subList(offset, linkedList.size()), 3);
            this.f19965l = cVar2;
            this.f19964k.setAdapter(cVar2);
        }
    }

    @Override // li.f
    public void C(Integer killedId) {
        h1();
    }

    @Override // com.baicizhan.main.collectreview.ui.a.InterfaceC0301a
    public void N(@IdRes int id2) {
        if (id2 == R.id.cancel_loading) {
            finish();
        }
    }

    @Override // com.baicizhan.main.customview.PatternContainer.b
    public void X(PatternContainer.Direction direction) {
        PatternContainer.Direction direction2 = PatternContainer.Direction.LEFT;
        if (direction == direction2) {
            s1(direction2, 1, EntryAction.SLIDE);
        }
    }

    public final void i1() {
        if (this.f19963j != null) {
            if (!this.f19971r) {
                wf.c.e().h(this.f19967n);
            }
            this.f19971r = true;
            if (this.f19963j.k()) {
                return;
            }
            s1(PatternContainer.Direction.DOWN, 0, EntryAction.CLICK_HINT);
        }
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment.c
    public void k0() {
        i1();
    }

    public final /* synthetic */ g2 m1(View view) {
        finish();
        return null;
    }

    public final /* synthetic */ g2 n1(View view) {
        r1();
        return null;
    }

    public final /* synthetic */ void o1(ij.e eVar) {
        long longExtra = getIntent().getLongExtra(G, 0L);
        wf.c.e().i(new u(eVar.O(), longExtra), p.a(eVar.O(), longExtra));
        w1();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f19964k.getVisibility() != 0) {
            super.onBackPressed();
            return;
        }
        ActivityResultCaller b11 = this.f19965l.b(this.f19964k.getCurrentItem());
        if (b11 == null || !(b11 instanceof li.c)) {
            h1();
        } else {
            if (((li.c) b11).d()) {
                return;
            }
            h1();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        switch (v11.getId()) {
            case R.id.hint /* 2131362679 */:
                i1();
                break;
            case R.id.home /* 2131362693 */:
                finish();
                break;
            case R.id.last_topic /* 2131362797 */:
                s1(PatternContainer.Direction.LEFT, 1, EntryAction.LAST_TAB);
                break;
            case R.id.voice /* 2131363969 */:
                PatternBaseFragment patternBaseFragment = this.f19963j;
                if (patternBaseFragment != null) {
                    patternBaseFragment.w();
                    break;
                }
                break;
        }
    }

    @Override // yf.g, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        ThemeUtil.setThemeOnAppCompatActivityCreate(this);
        super.onCreate(savedInstanceState);
        getWindow().setFormat(-3);
        if (x.r().c(this)) {
            return;
        }
        setContentView(R.layout.activity_collect_review);
        h0.a().d(this, R.raw.chop, R.raw.answer_right, R.raw.answer_error);
        j1();
        k1();
        com.baicizhan.client.framework.audio.a aVar = new com.baicizhan.client.framework.audio.a(this);
        this.f19977x = aVar;
        aVar.j(new c());
        r1();
    }

    @Override // yf.g, com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        hg.n.a();
        PatternBaseFragment patternBaseFragment = this.f19963j;
        if (patternBaseFragment != null) {
            patternBaseFragment.q();
        }
        IAudioPlayer iAudioPlayer = this.f19977x;
        if (iAudioPlayer != null) {
            iAudioPlayer.destroy();
        }
        qb0.h hVar = this.f19966m;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f19966m.unsubscribe();
        }
        wf.c.e().a();
        this.f19976w.removeCallbacksAndMessages(null);
        ig.b.f60539a.b();
        wi.p.f96399a.a();
        xf.g.f98042a.a().remove(Long.valueOf(getIntent().getLongExtra(H, 0L)));
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ig.b.f60539a.c(AppPageStatus.STUDY_MY_FAVOR);
    }

    public final void p1(wf.d topicAsset) {
        qb.c.i(F, "%s", topicAsset.toString());
        g1();
        wf.d dVar = this.f19967n;
        if (dVar != null) {
            this.f19961h.setText(String.format(Locale.CHINA, "%s %s", dVar.e().word, StringUtil.firstLine(dVar.e().wordMean)));
            this.f19961h.setCompoundDrawablesWithIntrinsicBounds(new BitmapDrawable(getResources(), f0.a(this, this.f19969p == LearnRecordManager.Answer.KILL ? R.drawable.ic_state_slash : this.f19970q ? R.drawable.ic_state_wrong : this.f19971r ? R.drawable.ic_state_check : R.drawable.ic_state_right)), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            this.f19961h.setText("");
            this.f19961h.setCompoundDrawables(null, null, null, null);
        }
        this.f19970q = false;
        this.f19971r = false;
        this.f19972s = false;
        this.f19969p = LearnRecordManager.Answer.WRONG;
        this.f19967n = topicAsset;
        this.f19974u.addFirst(new c.b(topicAsset.b(), this.f19967n.g(), this.f19967n.d().g(), 0, null));
        PatternBaseFragment patternBaseFragment = this.f19963j;
        if (patternBaseFragment != null) {
            patternBaseFragment.animate().x(patternBaseFragment.getWidth()).alpha(0.0f).setDuration(300L).setListener(new k(patternBaseFragment)).start();
            patternBaseFragment.setBackgroundColor(getResources().getColor(R.color.main_gray_bg));
        } else {
            this.f19959f.setVisibility(8);
        }
        PatternBaseFragment d11 = hg.n.d(this, wf.c.e().d(), 2);
        this.f19963j = d11;
        this.f19962i.addView(d11, 0);
        this.f19963j.setTranslationX(0.0f);
        this.f19963j.o(this);
        try {
            this.f19963j.v(this.f19967n.f(), this.f19967n.c(), this.f19977x);
        } catch (Exception e11) {
            qb.c.c(F, "", e11);
        }
        this.f19963j.setAlpha(1.0f);
        this.f19976w.removeCallbacks(this.E);
        this.f19976w.postDelayed(this.E, 1000L);
        this.f19960g.setText(String.format(Locale.CHINA, "需复习 %d", Integer.valueOf(wf.c.e().f())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [kc.d, kc.h] */
    public final void q1() {
        qb.c.i(F, "", new Object[0]);
        g1();
        mc.a.n(this, ((u.a) ((u.a) new u.a(this).V(getString(R.string.collect_review_complete_message)).b0(ButtonType.DOUBLE).E(R.string.collect_review_have_a_rest, null, new l() { // from class: yf.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 m12;
                m12 = CollectReviewActivity.this.m1((View) obj);
                return m12;
            }
        })).o(R.string.collect_review_one_more, new l() { // from class: yf.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 n12;
                n12 = CollectReviewActivity.this.n1((View) obj);
                return n12;
            }
        })).d(), "finish");
    }

    public final void r1() {
        if (getIntent().getIntExtra(I, 0) != 1) {
            p.d(this, new rj.e() { // from class: yf.a
                @Override // rj.e
                public final void a(ij.e eVar) {
                    CollectReviewActivity.this.o1(eVar);
                }
            });
            return;
        }
        wf.c e11 = wf.c.e();
        List<MarkedWord> list = xf.g.f98042a.a().get(Long.valueOf(getIntent().getLongExtra(H, 0L)));
        Objects.requireNonNull(list);
        e11.i(new xf.d(list), new xf.a());
        w1();
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment.c
    public boolean x(int topicId) {
        if (l1()) {
            qb.c.i(F, "inWiki , can not answer", new Object[0]);
            return false;
        }
        int d11 = wf.c.e().d();
        boolean z11 = topicId == this.f19967n.g();
        int i11 = z11 ? R.raw.answer_right : R.raw.answer_error;
        if (i9.j.c(i9.j.f60415f, true)) {
            h0.a().b(this, i11);
        }
        boolean z12 = z11 && LearnRecordManager.A().S(this.f19967n.g()) && d11 == 1 && !this.f19972s;
        if (!z11) {
            this.f19959f.setVisibility(0);
            this.f19976w.postDelayed(new d(), 50L);
        }
        if (z11) {
            e1(!this.f19970q);
            if (this.f19970q) {
                wf.c.e().c(this.f19967n);
            } else {
                wf.c.e().b(this.f19967n);
                if (getIntent().getIntExtra(I, 0) == 1) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("topic_id", Integer.valueOf(this.f19967n.g()));
                    ma.l.e(t.f73011j, ma.a.T4, hashMap);
                }
            }
            this.f19969p = LearnRecordManager.Answer.CORRECT;
            if (!z12) {
                this.f19959f.setVisibility(0);
                this.f19976w.postDelayed(new e(), 0);
            }
        } else {
            this.f19970q = true;
            this.f19969p = LearnRecordManager.Answer.WRONG;
        }
        return false;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j extends qb0.g<wf.d> {
        public j() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            List<Throwable> exceptions;
            qb.c.c(CollectReviewActivity.F, "load problem failed when review collect.", e11);
            boolean z11 = e11 instanceof TException;
            if (!z11 && (e11 instanceof CompositeException) && (exceptions = ((CompositeException) e11).getExceptions()) != null) {
                Iterator<Throwable> it = exceptions.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (it.next() instanceof TException) {
                        z11 = true;
                        break;
                    }
                }
            }
            if (z11) {
                CollectReviewActivity.this.f19976w.post(CollectReviewActivity.this.D);
            } else {
                va.g.g(R.string.main_unknown_info, 0);
                CollectReviewActivity.this.finish();
            }
        }

        @Override // qb0.g
        public void onStart() {
            CollectReviewActivity.this.f19976w.postDelayed(CollectReviewActivity.this.C, CollectReviewActivity.this.f19975v == null ? 0L : 1000L);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(wf.d topicAsset) {
            if (topicAsset == null) {
                CollectReviewActivity.this.q1();
            } else {
                CollectReviewActivity.this.p1(topicAsset);
                wf.c.e().k(topicAsset);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Animation.AnimationListener {
        public b() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            CollectReviewActivity.this.f19964k.setVisibility(8);
            CollectReviewActivity.this.f19965l.c();
            CollectReviewActivity collectReviewActivity = CollectReviewActivity.this;
            FragmentManager supportFragmentManager = collectReviewActivity.getSupportFragmentManager();
            CollectReviewActivity collectReviewActivity2 = CollectReviewActivity.this;
            c.a aVar = ni.c.f75133d;
            Objects.requireNonNull(aVar);
            collectReviewActivity.f19965l = new qf.c(supportFragmentManager, collectReviewActivity2, new yf.d(aVar), Collections.EMPTY_LIST, 0);
            CollectReviewActivity.this.f19964k.setAdapter(CollectReviewActivity.this.f19965l);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements ViewPager.OnPageChangeListener {
        public g() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i11) {
            CollectReviewActivity.this.f19965l.c();
            u0 u0Var = u0.f26107a;
            u0Var.p(EntryAction.SLIDE);
            u0Var.n(v.f73042m, t1.a(wf.c.e().d()));
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i11, float v11, int i12) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class k implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ PatternBaseFragment f19990a;

        public k(final PatternBaseFragment val$lastReviewView) {
            this.f19990a = val$lastReviewView;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            CollectReviewActivity.this.f19962i.removeView(this.f19990a);
            this.f19990a.q();
            this.f19990a.setBackgroundColor(0);
            hg.n.e(this.f19990a);
            CollectReviewActivity.this.f19959f.setVisibility(8);
            this.f19990a.setX(0.0f);
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
