package com.baicizhan.main.selftest.activity;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.baicizhan.base.BaseFragmentActivity;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.client.business.widget.DirectionalViewPager;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.main.activity.SingleWikiActivity;
import com.baicizhan.main.global.AppPageStatus;
import com.baicizhan.main.wikiv2.studyv2.data.EntryAction;
import com.baicizhan.main.wikiv2.studyv2.data.EntryPage;
import com.baicizhan.main.wikiv2.studyv2.data.WikiStyle;
import com.baicizhan.main.wikiv2.studyv2.data.u0;
import com.baicizhan.main.wikiv2.studyv2.data.v0;
import com.jiongji.andriod.card.R;
import hj.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kc.r;
import kc.u;
import ma.t;
import ma.v;
import q9.l;
import q9.x;
import qb0.h;
import th.s;
import va.g;
import yh.a;
import yh.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SelfTestActivity extends BaseFragmentActivity implements View.OnClickListener {

    /* renamed from: v, reason: collision with root package name */
    public static final String f24956v = "SelfTestActivity";

    /* renamed from: w, reason: collision with root package name */
    public static final int f24957w = 10000;

    /* renamed from: c, reason: collision with root package name */
    public yh.c f24960c;

    /* renamed from: d, reason: collision with root package name */
    public f f24961d;

    /* renamed from: e, reason: collision with root package name */
    public a.e f24962e;

    /* renamed from: g, reason: collision with root package name */
    public h f24964g;

    /* renamed from: h, reason: collision with root package name */
    public DirectionalViewPager f24965h;

    /* renamed from: i, reason: collision with root package name */
    public wh.a f24966i;

    /* renamed from: j, reason: collision with root package name */
    public va.f f24967j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f24968k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f24969l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView f24970m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f24971n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f24972o;

    /* renamed from: q, reason: collision with root package name */
    public IAudioPlayer f24974q;

    /* renamed from: r, reason: collision with root package name */
    public Handler f24975r;

    /* renamed from: a, reason: collision with root package name */
    public boolean f24958a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24959b = false;

    /* renamed from: f, reason: collision with root package name */
    public List<Integer> f24963f = new ArrayList();

    /* renamed from: p, reason: collision with root package name */
    public int f24973p = 0;

    /* renamed from: s, reason: collision with root package name */
    public Runnable f24976s = null;

    /* renamed from: t, reason: collision with root package name */
    public final int f24977t = 1;

    /* renamed from: u, reason: collision with root package name */
    public int f24978u = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f24983a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TopicRecord f24984b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f24985c;

        public c(final int val$killedIndex, final TopicRecord val$record, final int val$currentItem) {
            this.f24983a = val$killedIndex;
            this.f24984b = val$record;
            this.f24985c = val$currentItem;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f24983a >= SelfTestActivity.this.f24962e.f100147c.size()) {
                return;
            }
            SelfTestActivity.this.f24962e.f100147c.remove(this.f24983a);
            SelfTestActivity.this.f24966i.e(this.f24984b);
            wh.a aVar = new wh.a(SelfTestActivity.this.getSupportFragmentManager());
            aVar.f(SelfTestActivity.this.f24966i.c());
            SelfTestActivity.this.f24965h.removeAllViewsInLayout();
            SelfTestActivity.this.f24965h.setAdapter(aVar);
            SelfTestActivity.this.f24966i = aVar;
            SelfTestActivity.this.f24965h.L(this.f24985c, false);
            SelfTestActivity.this.f24976s = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends r {
        public d() {
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View v11) {
            SelfTestActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements c.InterfaceC1367c {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<SelfTestActivity> f24989a;

        public f(SelfTestActivity activity) {
            this.f24989a = new WeakReference<>(activity);
        }

        @Override // yh.c.InterfaceC1367c
        public void a(a.e result) {
            SelfTestActivity selfTestActivity = this.f24989a.get();
            if (selfTestActivity == null) {
                return;
            }
            if (result == null) {
                g.g(R.string.selftest_no_word, 0);
                selfTestActivity.finish();
                return;
            }
            List<Integer> list = result.f100147c;
            if (list == null || list.isEmpty()) {
                selfTestActivity.f24960c.e(selfTestActivity, null);
            } else if (!result.f100145a && result.f100146b) {
                selfTestActivity.f24960c.f(selfTestActivity, null);
            } else {
                selfTestActivity.b1(result);
                selfTestActivity.l1();
            }
        }

        @Override // yh.c.InterfaceC1367c
        public void b(a.e result) {
            List<Integer> list;
            SelfTestActivity selfTestActivity = this.f24989a.get();
            if (selfTestActivity == null) {
                return;
            }
            if (result == null || (list = result.f100147c) == null || list.isEmpty()) {
                g.g(R.string.selftest_no_word, 0);
                selfTestActivity.finish();
            } else {
                selfTestActivity.b1(result);
                selfTestActivity.l1();
            }
        }

        @Override // yh.c.InterfaceC1367c
        public void c(a.e result) {
            List<Integer> list;
            SelfTestActivity selfTestActivity = this.f24989a.get();
            if (selfTestActivity == null) {
                return;
            }
            if (result == null || (list = result.f100147c) == null || list.isEmpty()) {
                g.g(R.string.selftest_no_word, 0);
                selfTestActivity.finish();
            } else {
                selfTestActivity.b1(result);
                selfTestActivity.l1();
            }
        }

        @Override // yh.c.InterfaceC1367c
        public void onExit() {
            SelfTestActivity selfTestActivity = this.f24989a.get();
            if (selfTestActivity == null) {
                return;
            }
            selfTestActivity.Y0();
            selfTestActivity.finish();
        }
    }

    private void h1() {
        va.f fVar = this.f24967j;
        if (fVar != null) {
            fVar.show();
        }
    }

    private void init() {
        this.f24975r = new Handler();
        this.f24974q = new l(this);
        va.f fVar = new va.f(this);
        this.f24967j = fVar;
        fVar.f(getText(R.string.loading_progress));
        this.f24967j.setCancelable(false);
        f fVar2 = new f(this);
        this.f24961d = fVar2;
        this.f24960c = new yh.c(this, fVar2);
        DirectionalViewPager directionalViewPager = (DirectionalViewPager) findViewById(R.id.words_gallery);
        this.f24965h = directionalViewPager;
        directionalViewPager.setOverScrollMode(2);
        wh.a aVar = new wh.a(getSupportFragmentManager());
        this.f24966i = aVar;
        this.f24965h.setAdapter(aVar);
        this.f24965h.setOnPageChangeListener(new a());
        this.f24970m = (ImageView) findViewById(R.id.home);
        this.f24968k = (TextView) findViewById(R.id.remember_the_word_btn);
        this.f24969l = (TextView) findViewById(R.id.forget_the_word_btn);
        this.f24971n = (TextView) findViewById(R.id.last_topic);
        this.f24972o = (TextView) findViewById(R.id.words_left);
        this.f24970m.setOnClickListener(this);
        this.f24968k.setOnClickListener(this);
        this.f24969l.setOnClickListener(this);
        this.f24971n.setOnClickListener(this);
        c1();
        p.c(this);
    }

    public static void k1(Context context) {
        context.startActivity(new Intent(context, (Class<?>) SelfTestActivity.class));
    }

    public final TopicRecord X0(int topicId) {
        try {
            return s.b(this, x.r().l(), topicId).t6().p();
        } catch (Exception unused) {
            qb.c.d("", "self testing failed for resource not valid, record is [{null}]", new Object[0]);
            return null;
        }
    }

    public final void Y0() {
        va.f fVar = this.f24967j;
        if (fVar != null) {
            fVar.dismiss();
        }
    }

    public final void Z0(int index) {
        h1();
        this.f24973p = index;
        this.f24964g = s.c(x.r().l(), this.f24962e.f100147c.get(index).intValue()).I3(tb0.a.a()).r5(new e());
    }

    public final void a1() {
        h1();
        this.f24959b = true;
        a.e eVar = this.f24962e;
        if (eVar.f100145a && eVar.f100146b) {
            this.f24960c.f(this, this.f24963f);
        } else {
            this.f24960c.e(this, this.f24963f);
        }
        if (this.f24978u > 0) {
            ma.l.a(t.f73011j, ma.a.f72749g1);
        }
    }

    public final void b1(a.e result) {
        this.f24959b = false;
        this.f24962e = result;
        this.f24963f.clear();
        wh.a aVar = new wh.a(getSupportFragmentManager());
        this.f24966i = aVar;
        this.f24965h.setAdapter(aVar);
        Y0();
    }

    public final void c1() {
        h1();
        this.f24960c.i();
        this.f24959b = true;
    }

    public void d1() {
        TopicRecord b11 = this.f24966i.b(this.f24965h.getCurrentItem());
        ZPackUtils.loadAudioCompat(this.f24974q, b11, b11.wordAudio);
    }

    public final void e1() {
        int currentItem = this.f24965h.getCurrentItem();
        TopicRecord b11 = this.f24966i.b(currentItem);
        View findViewWithTag = this.f24965h.findViewWithTag(b11);
        if (findViewWithTag == null) {
            f1(currentItem, b11);
        } else {
            findViewWithTag.animate().alpha(0.0f).setDuration(500L).setListener(new b(currentItem, b11)).start();
        }
    }

    public final void f1(final int killedIndex, final TopicRecord record) {
        if (this.f24965h.getCurrentItem() == this.f24962e.f100147c.size() - 1) {
            a1();
            return;
        }
        int currentItem = this.f24965h.getCurrentItem();
        this.f24976s = new c(killedIndex, record, currentItem);
        if (j1(currentItem + 1)) {
            return;
        }
        this.f24975r.postDelayed(this.f24976s, 600L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g1(final int index) {
        if (rb.d.f(this)) {
            Z0(index);
        } else {
            mc.a.m(this, ((u) new u.a(this).L(R.string.attention).b0(ButtonType.SINGLE_POSITIVE).V("检测不到网络，请联网后重试").d()).f0(new d()));
        }
    }

    public final void i1(TopicRecord record) {
        if (record == null) {
            g.g(R.string.base_toast_failed, 0);
            return;
        }
        u0 u0Var = u0.f26107a;
        u0Var.q(EntryPage.SELF_TEST);
        if (v0.f26118a.b()) {
            u0Var.r(WikiStyle.TEST_GUIDE_WIKI);
        } else {
            u0Var.r(WikiStyle.STUDY_WIKI);
        }
        u0Var.n(v.f73041l, "");
        Intent intent = new Intent(this, (Class<?>) SingleWikiActivity.class);
        intent.putExtra(SingleWikiActivity.f18206i, record);
        intent.putExtra(SingleWikiActivity.f18207j, 5);
        startActivityForResult(intent, 10000);
        this.f24958a = true;
        ZPackUtils.loadAudioCompat(this.f24974q, record, record.wordAudio);
    }

    public final boolean j1(int index) {
        if (index <= this.f24966i.getCount() - 1) {
            this.f24965h.L(index, true);
            TopicRecord b11 = this.f24966i.b(this.f24965h.getCurrentItem());
            ZPackUtils.loadAudioCompat(this.f24974q, b11, b11.wordAudio);
            return false;
        }
        if (index != this.f24966i.getCount()) {
            throw new IllegalArgumentException("index必须等于mAdapter.getCount()");
        }
        if (index > this.f24962e.f100147c.size() - 1) {
            List<Integer> list = this.f24963f;
            List<Integer> list2 = this.f24962e.f100147c;
            list.add(list2.get(list2.size() - 1));
            a1();
            return true;
        }
        TopicRecord X0 = X0(this.f24962e.f100147c.get(index).intValue());
        if (X0 == null) {
            g1(index);
            return true;
        }
        this.f24966i.a(X0);
        this.f24966i.notifyDataSetChanged();
        this.f24965h.L(index, true);
        TopicRecord b12 = this.f24966i.b(this.f24965h.getCurrentItem());
        ZPackUtils.loadAudioCompat(this.f24974q, b12, b12.wordAudio);
        this.f24972o.setText(getString(R.string.words_left, Integer.valueOf(this.f24962e.f100147c.size() - this.f24966i.getCount())));
        if (index <= 0) {
            return false;
        }
        this.f24963f.add(this.f24962e.f100147c.get(index - 1));
        return false;
    }

    public final void l1() {
        j1(0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        TopicRecord b11;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != 10000) {
            return;
        }
        this.f24958a = false;
        if (data == null || (b11 = this.f24966i.b(this.f24965h.getCurrentItem())) == null || b11.topicId != data.getIntExtra(SingleWikiActivity.f18208k, 0)) {
            return;
        }
        e1();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        switch (v11.getId()) {
            case R.id.forget_the_word_btn /* 2131362594 */:
                u0.f26107a.p(EntryAction.CLICK);
                i1(this.f24966i.b(this.f24965h.getCurrentItem()));
                break;
            case R.id.home /* 2131362693 */:
                finish();
                break;
            case R.id.last_topic /* 2131362797 */:
                Object tag = v11.getTag();
                if (tag instanceof TopicRecord) {
                    u0.f26107a.p(EntryAction.LAST_TAB);
                    i1((TopicRecord) tag);
                    break;
                }
                break;
            case R.id.remember_the_word_btn /* 2131363447 */:
                this.f24978u++;
                j1(this.f24965h.getCurrentItem() + 1);
                if (this.f24978u == 1) {
                    ma.l.a(t.f73011j, ma.a.X0);
                    break;
                }
                break;
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(16777216, 16777216);
        setContentView(R.layout.activity_self_test);
        init();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        IAudioPlayer iAudioPlayer = this.f24974q;
        if (iAudioPlayer != null) {
            iAudioPlayer.destroy();
            this.f24974q = null;
        }
        h hVar = this.f24964g;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f24964g.unsubscribe();
        }
        Y0();
        ig.b.f60539a.b();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        if (this.f24959b || this.f24958a) {
            return;
        }
        this.f24962e = this.f24960c.j(new ArrayList(this.f24963f));
        this.f24963f.clear();
        TopicRecord b11 = this.f24966i.b(r0.getCount() - 1);
        wh.a aVar = new wh.a(getSupportFragmentManager());
        this.f24966i = aVar;
        this.f24965h.setAdapter(aVar);
        this.f24966i.a(b11);
        this.f24966i.notifyDataSetChanged();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        DirectionalViewPager directionalViewPager = this.f24965h;
        if (directionalViewPager != null) {
            int currentItem = directionalViewPager.getCurrentItem();
            this.f24965h.setAdapter(this.f24966i);
            this.f24965h.setCurrentItem(currentItem);
        }
        ig.b.f60539a.c(AppPageStatus.STUDY_REINFORCE);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends qb0.g<TopicRecord> {
        public e() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            if (SelfTestActivity.this.isFinishing()) {
                return;
            }
            g.g(R.string.download_res_fail, 0);
            SelfTestActivity.this.finish();
            SelfTestActivity.this.f24976s = null;
            View findViewWithTag = SelfTestActivity.this.f24965h.findViewWithTag(SelfTestActivity.this.f24966i.b(SelfTestActivity.this.f24965h.getCurrentItem()));
            if (findViewWithTag != null) {
                findViewWithTag.clearAnimation();
            }
            SelfTestActivity.this.Y0();
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(TopicRecord topicRecord) {
            if (SelfTestActivity.this.isFinishing()) {
                return;
            }
            SelfTestActivity.this.Y0();
            SelfTestActivity selfTestActivity = SelfTestActivity.this;
            selfTestActivity.j1(selfTestActivity.f24973p);
            if (SelfTestActivity.this.f24976s != null) {
                SelfTestActivity.this.f24975r.postDelayed(SelfTestActivity.this.f24976s, 600L);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements DirectionalViewPager.i {
        public a() {
        }

        @Override // com.baicizhan.client.business.widget.DirectionalViewPager.i
        public void onPageSelected(int position) {
            TopicRecord b11 = SelfTestActivity.this.f24966i.b(position - 1);
            if (b11 == null || LearnRecordManager.A().R(b11.topicId)) {
                if (b11 == null) {
                    SelfTestActivity.this.f24971n.setText("");
                    SelfTestActivity.this.f24971n.setTag(null);
                    return;
                }
                return;
            }
            SelfTestActivity.this.f24971n.setText(b11.word + " " + b11.wordMean);
            SelfTestActivity.this.f24971n.setTag(b11);
        }

        @Override // com.baicizhan.client.business.widget.DirectionalViewPager.i
        public void onPageScrollStateChanged(int state) {
        }

        @Override // com.baicizhan.client.business.widget.DirectionalViewPager.i
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Animator.AnimatorListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f24980a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TopicRecord f24981b;

        public b(final int val$currentIndex, final TopicRecord val$r) {
            this.f24980a = val$currentIndex;
            this.f24981b = val$r;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            SelfTestActivity.this.f1(this.f24980a, this.f24981b);
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
