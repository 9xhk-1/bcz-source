package com.baicizhan.main.plusreview.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import com.baicizhan.base.BaseFragmentActivity;
import com.baicizhan.client.business.util.ThemeUtil;
import com.baicizhan.client.business.view.QuizStateProgressBar;
import com.baicizhan.main.plusreview.data.MatchTestCache;
import com.baicizhan.main.plusreview.data.MatchTestlib;
import com.baicizhan.main.plusreview.data.db.MatchResultRecord;
import com.baicizhan.main.plusreview.data.load.MatchTestSyncService;
import com.jiongji.andriod.card.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import lh.a;
import lh.c;
import q9.x;
import qb0.g;
import sh.f;
import sh.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class MatchReviewActivity extends BaseFragmentActivity implements View.OnClickListener, a.b, c.e {

    /* renamed from: v, reason: collision with root package name */
    public static final String f24656v = "MatchReviewActivity";

    /* renamed from: w, reason: collision with root package name */
    public static final int f24657w = 10;

    /* renamed from: a, reason: collision with root package name */
    public MatchTestlib f24658a;

    /* renamed from: b, reason: collision with root package name */
    public List<MatchTestlib.Word> f24659b;

    /* renamed from: c, reason: collision with root package name */
    public Map<Integer, MatchResultRecord> f24660c;

    /* renamed from: h, reason: collision with root package name */
    public f f24665h;

    /* renamed from: i, reason: collision with root package name */
    public View f24666i;

    /* renamed from: j, reason: collision with root package name */
    public View f24667j;

    /* renamed from: k, reason: collision with root package name */
    public QuizStateProgressBar f24668k;

    /* renamed from: l, reason: collision with root package name */
    public View f24669l;

    /* renamed from: m, reason: collision with root package name */
    public View f24670m;

    /* renamed from: n, reason: collision with root package name */
    public View f24671n;

    /* renamed from: o, reason: collision with root package name */
    public View f24672o;

    /* renamed from: p, reason: collision with root package name */
    public View f24673p;

    /* renamed from: q, reason: collision with root package name */
    public View f24674q;

    /* renamed from: r, reason: collision with root package name */
    public ProgressBar f24675r;

    /* renamed from: t, reason: collision with root package name */
    public c f24677t;

    /* renamed from: d, reason: collision with root package name */
    public SparseArray<f> f24661d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    public int f24662e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f24663f = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24664g = false;

    /* renamed from: s, reason: collision with root package name */
    public Handler f24676s = new Handler();

    /* renamed from: u, reason: collision with root package name */
    public boolean f24678u = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MatchReviewActivity.this.f24668k.setCursor(MatchReviewActivity.this.f24662e);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<MatchReviewActivity> f24681a;

        public c(MatchReviewActivity activity) {
            this.f24681a = new WeakReference<>(activity);
        }

        @Override // java.lang.Runnable
        public void run() {
            MatchReviewActivity matchReviewActivity = this.f24681a.get();
            if (matchReviewActivity == null) {
                return;
            }
            matchReviewActivity.b1();
        }
    }

    private void U0() {
        this.f24666i = findViewById(R.id.plusreview_match_top);
        View findViewById = findViewById(R.id.plusreview_match_home);
        this.f24667j = findViewById;
        findViewById.setOnClickListener(this);
        this.f24668k = (QuizStateProgressBar) findViewById(R.id.plusereview_match_qsp);
        this.f24669l = findViewById(R.id.plusreview_match_bottom);
        View findViewById2 = findViewById(R.id.plusreview_match_continue);
        this.f24670m = findViewById2;
        findViewById2.setOnClickListener(this);
        this.f24670m.setVisibility(8);
        View findViewById3 = findViewById(R.id.plusreview_match_to_wiki);
        this.f24671n = findViewById3;
        findViewById3.setOnClickListener(this);
        this.f24671n.setVisibility(8);
        this.f24672o = findViewById(R.id.plusereview_match_qa_container);
        View findViewById4 = findViewById(R.id.plusreview_match_wiki_container);
        this.f24673p = findViewById4;
        findViewById4.setOnClickListener(this);
        View findViewById5 = findViewById(R.id.plusreview_match_progress_layout);
        this.f24674q = findViewById5;
        findViewById5.setOnClickListener(this);
        this.f24675r = (ProgressBar) findViewById(R.id.plusreview_match_progress);
    }

    private boolean V0() {
        return this.f24674q.getVisibility() == 0;
    }

    public static void a1(Context context) {
        context.startActivity(new Intent(context, (Class<?>) MatchReviewActivity.class));
    }

    @Override // lh.c.e
    public void I() {
        this.f24673p.setVisibility(8);
        Z0(true);
    }

    @Override // lh.c.e
    public void P(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.business_push_down_in, R.anim.business_push_down_out).remove(fragment).commitAllowingStateLoss();
    }

    public final void R0() {
        this.f24674q.setVisibility(0);
    }

    @Override // lh.c.e
    public void S() {
        Z0(false);
    }

    public final void S0() {
        this.f24674q.setVisibility(8);
    }

    public final void T0() {
        int size = this.f24659b.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            int result = this.f24660c.get(Integer.valueOf(this.f24659b.get(i11).getWord_topic_id())).getResult();
            if (result == -1) {
                iArr[i11] = 0;
            } else if (result != 1) {
                iArr[i11] = -1;
            } else {
                iArr[i11] = 1;
            }
        }
        new QuizStateProgressBar.a().d(this.f24668k).b(this.f24662e).c(iArr).a();
    }

    @Override // lh.a.b
    public void U(boolean z11, int i11) {
        int word_topic_id = this.f24659b.get(i11).getWord_topic_id();
        MatchResultRecord matchResultRecord = this.f24660c.get(Integer.valueOf(word_topic_id));
        if (matchResultRecord == null) {
            matchResultRecord = new MatchResultRecord();
            matchResultRecord.setTopicId(word_topic_id);
            this.f24660c.put(Integer.valueOf(word_topic_id), matchResultRecord);
        }
        matchResultRecord.setResult(z11 ? 1 : -1);
        this.f24662e = i11;
        this.f24668k.x(i11, z11 ? 1 : 0);
        this.f24664g = X0();
        this.f24670m.setVisibility(0);
        this.f24671n.setVisibility(0);
    }

    public final void W0() {
        this.f24670m.setVisibility(8);
        this.f24671n.setVisibility(8);
        MatchTestCache.getCache().setTopicRecord(this.f24665h.j());
        getSupportFragmentManager().beginTransaction().setCustomAnimations(android.R.anim.fade_in, R.anim.business_push_right_out).replace(R.id.plusereview_match_qa_container, lh.a.D(this.f24662e)).commitAllowingStateLoss();
    }

    public final boolean X0() {
        boolean z11;
        boolean z12;
        int size = this.f24659b.size();
        int min = Math.min(10, size);
        int i11 = 0;
        while (true) {
            if (i11 >= min) {
                z11 = true;
                break;
            }
            if (this.f24660c.get(Integer.valueOf(this.f24659b.get(i11).getWord_topic_id())).getResult() != 1) {
                z11 = false;
                break;
            }
            i11++;
        }
        int i12 = this.f24662e;
        int i13 = min - 1;
        if (i12 >= i13 && !z11) {
            this.f24662e = -1;
        } else if (i12 >= size - 1) {
            this.f24662e = i13;
        }
        int i14 = this.f24662e + 1;
        while (true) {
            if (i14 >= size) {
                z12 = false;
                break;
            }
            if (this.f24660c.get(Integer.valueOf(this.f24659b.get(i14).getWord_topic_id())).getResult() != 1) {
                this.f24662e = i14;
                z12 = true;
                break;
            }
            i14++;
        }
        if (!z12) {
            int i15 = 0;
            while (true) {
                if (i15 >= size) {
                    break;
                }
                if (this.f24660c.get(Integer.valueOf(this.f24659b.get(i15).getWord_topic_id())).getResult() != 1) {
                    this.f24662e = i15;
                    z12 = true;
                    break;
                }
                i15++;
            }
        }
        return !z12;
    }

    public final void Y0() {
        finish();
    }

    public final void Z0(boolean show) {
        this.f24666i.setVisibility(show ? 0 : 4);
        this.f24669l.setVisibility(show ? 0 : 4);
        this.f24672o.setVisibility(show ? 0 : 4);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(300L);
        this.f24666i.startAnimation(show ? alphaAnimation : alphaAnimation2);
        this.f24669l.startAnimation(show ? alphaAnimation : alphaAnimation2);
        View view = this.f24672o;
        if (!show) {
            alphaAnimation = alphaAnimation2;
        }
        view.startAnimation(alphaAnimation);
    }

    public final void b1() {
        int i11 = this.f24662e;
        this.f24663f = i11;
        if (this.f24664g) {
            Log.d("whiz", "finish today for completed.");
            Y0();
            return;
        }
        f fVar = this.f24661d.get(i11);
        if (fVar == null) {
            k.D().t(this.f24665h);
            k.D().I().r5(new b());
        } else {
            this.f24665h = fVar;
            S0();
            W0();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f24670m) {
            this.f24668k.postDelayed(new a(), 400L);
            b1();
        } else if (view != this.f24671n) {
            if (view == this.f24667j) {
                finish();
            }
        } else {
            Z0(false);
            this.f24673p.setVisibility(0);
            getSupportFragmentManager().beginTransaction().setCustomAnimations(R.anim.business_push_down_in, R.anim.business_push_down_out).add(R.id.plusreview_match_wiki_container, lh.c.y(this.f24663f)).commitAllowingStateLoss();
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ThemeUtil.setThemeOnActivityCreate(this);
        MatchTestlib testlib = MatchTestCache.getCache().getTestlib();
        this.f24658a = testlib;
        if (testlib == null) {
            qb.c.d(f24656v, "MatchReviewActivity is recreated and data is lost, finish!", new Object[0]);
            finish();
        } else {
            if (x.r().c(this)) {
                return;
            }
            k.D().Q(this);
            setContentView(R.layout.plusreview_match);
            U0();
            this.f24659b = this.f24658a.getReview_words();
            this.f24660c = this.f24658a.getResult_records();
            this.f24664g = X0();
            T0();
            this.f24677t = new c(this);
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f24658a != null) {
            MatchTestSyncService.start(this);
        }
        System.gc();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f24678u) {
            return;
        }
        this.f24676s.postDelayed(this.f24677t, 300L);
        this.f24678u = true;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends g<f> {
        public b() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            va.g.i("网络不畅，加载失败", 0);
            MatchReviewActivity.this.finish();
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(f problemAsset) {
            if (problemAsset != null) {
                MatchReviewActivity.this.f24665h = problemAsset;
                MatchReviewActivity.this.S0();
                MatchReviewActivity.this.W0();
                MatchReviewActivity.this.f24661d.put(MatchReviewActivity.this.f24663f, problemAsset);
                return;
            }
            MatchReviewActivity.this.Y0();
            Log.d("whiz", "finish today for null problem, has next? " + k.D().A());
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    @Override // lh.a.b
    public void m() {
    }
}
