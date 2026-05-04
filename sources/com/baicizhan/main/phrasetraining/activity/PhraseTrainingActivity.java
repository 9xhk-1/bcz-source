package com.baicizhan.main.phrasetraining.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.baicizhan.base.BaseFragmentActivity;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.phrasetraining.activity.a;
import com.baicizhan.main.phrasetraining.data.bean.Phrase;
import com.baicizhan.main.phrasetraining.data.bean.PhraseGroup;
import com.baicizhan.main.phrasetraining.data.bean.TopicPatterns;
import com.jiongji.andriod.card.R;
import hj.p;
import i9.j;
import ih.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import me.jessyan.autosize.internal.CancelAdapt;
import q9.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class PhraseTrainingActivity extends BaseFragmentActivity implements i.b, a.b, CancelAdapt {

    /* renamed from: s, reason: collision with root package name */
    public static final String f24457s = "PhraseTrainingActivity";

    /* renamed from: t, reason: collision with root package name */
    public static final String f24458t = "groups";

    /* renamed from: u, reason: collision with root package name */
    public static final String f24459u = "cur_group_index";

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<Integer> f24460a;

    /* renamed from: b, reason: collision with root package name */
    public int f24461b;

    /* renamed from: c, reason: collision with root package name */
    public int f24462c;

    /* renamed from: d, reason: collision with root package name */
    public List<PhraseGroup> f24463d;

    /* renamed from: e, reason: collision with root package name */
    public ih.i f24464e;

    /* renamed from: g, reason: collision with root package name */
    public TopicPatterns f24466g;

    /* renamed from: h, reason: collision with root package name */
    public Map<Integer, Phrase> f24467h;

    /* renamed from: i, reason: collision with root package name */
    public TopicPatterns.Topic f24468i;

    /* renamed from: j, reason: collision with root package name */
    public IAudioPlayer f24469j;

    /* renamed from: k, reason: collision with root package name */
    public View f24470k;

    /* renamed from: l, reason: collision with root package name */
    public ProgressBar f24471l;

    /* renamed from: m, reason: collision with root package name */
    public int f24472m;

    /* renamed from: n, reason: collision with root package name */
    public int f24473n;

    /* renamed from: o, reason: collision with root package name */
    public ProgressBar f24474o;

    /* renamed from: p, reason: collision with root package name */
    public b f24475p;

    /* renamed from: f, reason: collision with root package name */
    public boolean f24465f = false;

    /* renamed from: q, reason: collision with root package name */
    public Handler f24476q = new Handler();

    /* renamed from: r, reason: collision with root package name */
    public boolean f24477r = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PhraseTrainingActivity.this.finish();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<PhraseTrainingActivity> f24479a;

        public b(PhraseTrainingActivity activity) {
            this.f24479a = new WeakReference<>(activity);
        }

        @Override // java.lang.Runnable
        public void run() {
            PhraseTrainingActivity phraseTrainingActivity = this.f24479a.get();
            if (phraseTrainingActivity == null) {
                return;
            }
            phraseTrainingActivity.f24474o.setVisibility(0);
        }
    }

    private void N0() {
        View findViewById = findViewById(R.id.phrase_training_home);
        this.f24470k = findViewById;
        findViewById.setOnClickListener(new a());
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.phrase_training_progress);
        this.f24471l = progressBar;
        ThemeResUtil.setBacizhanProgress2(this, progressBar);
        this.f24474o = (ProgressBar) findViewById(R.id.phrase_training_load_progress);
        this.f24475p = new b(this);
    }

    public static void O0(Context context, ArrayList<Integer> groups, int curIndex) {
        Intent intent = new Intent(context, (Class<?>) PhraseTrainingActivity.class);
        intent.putIntegerArrayListExtra(f24458t, groups);
        intent.putExtra(f24459u, curIndex);
        context.startActivity(intent);
    }

    public final void J0() {
        this.f24474o.setProgress(0);
        this.f24476q.postDelayed(this.f24475p, 1000L);
        this.f24462c = this.f24460a.get(this.f24461b).intValue();
        ih.i a11 = new i.a().b(getAssets()).c(this).d(this.f24462c).a();
        this.f24464e = a11;
        a11.l();
    }

    public final void K0(int action, Object cookie) {
        Fragment y11;
        Fragment fragment;
        if (this.f24465f) {
            List<TopicPatterns.Topic> arrTopics = this.f24466g.getArrTopics();
            if (1 == action) {
                fragment = g.z(true);
            } else if (2 == action) {
                FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                beginTransaction.remove((Fragment) cookie);
                beginTransaction.commit();
                getSupportFragmentManager().popBackStack();
                fragment = null;
            } else {
                if (arrTopics == null || arrTopics.isEmpty()) {
                    y11 = i.y();
                    int i11 = (this.f24472m * 100) / this.f24473n;
                    this.f24471l.setProgress(i11 <= 100 ? i11 : 100);
                    this.f24472m++;
                    j.n(hh.b.f59340j + this.f24462c, true);
                } else {
                    TopicPatterns.Topic remove = arrTopics.remove(0);
                    this.f24468i = remove;
                    int typeHint = remove.getTypeHint();
                    switch (typeHint) {
                        case 59:
                            y11 = com.baicizhan.main.phrasetraining.activity.b.y();
                            break;
                        case 60:
                        case 64:
                            y11 = c.y(typeHint);
                            break;
                        case 61:
                        case 68:
                            y11 = d.z(typeHint);
                            break;
                        case 62:
                            y11 = e.y();
                            break;
                        case 63:
                        default:
                            y11 = null;
                            break;
                        case 65:
                            y11 = f.y();
                            break;
                        case 66:
                            y11 = g.z(false);
                            break;
                        case 67:
                            y11 = h.y();
                            break;
                    }
                    if (y11 != null) {
                        int i12 = (this.f24472m * 100) / this.f24473n;
                        this.f24471l.setProgress(i12 <= 100 ? i12 : 100);
                        this.f24472m++;
                    }
                }
                fragment = y11;
            }
            if (fragment != null) {
                FragmentTransaction beginTransaction2 = getSupportFragmentManager().beginTransaction();
                beginTransaction2.setCustomAnimations(R.anim.alpha_fade_in, R.anim.alpha_fade_out);
                beginTransaction2.replace(R.id.phrase_training_qa_container, fragment);
                if (1 == action) {
                    beginTransaction2.addToBackStack(null);
                }
                beginTransaction2.commitAllowingStateLoss();
            }
        }
    }

    public final void L0(Fragment last) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.remove(last);
        beginTransaction.commit();
        this.f24461b = (this.f24461b + 1) % this.f24460a.size();
        J0();
    }

    public final boolean M0() {
        Intent intent = getIntent();
        this.f24460a = intent.getIntegerArrayListExtra(f24458t);
        this.f24461b = intent.getIntExtra(f24459u, 0);
        ArrayList<Integer> arrayList = this.f24460a;
        if (arrayList == null || arrayList.isEmpty() || this.f24460a.size() <= this.f24461b) {
            return false;
        }
        this.f24463d = PhraseGroup.getPhraseGroups(getAssets());
        J0();
        return true;
    }

    public final boolean P0(Bundle savedInstanceState) {
        if (savedInstanceState == null || !savedInstanceState.getBoolean("exit", false)) {
            return false;
        }
        qb.c.d(f24457s, "PhraseTrainingActivity is recreated and data is lost, finish!", new Object[0]);
        this.f24477r = true;
        finish();
        return true;
    }

    @Override // com.baicizhan.main.phrasetraining.activity.a.b
    public void Q() {
        finish();
    }

    @Override // ih.i.b
    public void d(boolean success, int code) {
        this.f24476q.removeCallbacks(this.f24475p);
        this.f24474o.setVisibility(8);
        this.f24465f = success;
        if (!success) {
            va.g.g(code != -4 ? code != -3 ? code != -2 ? code != -1 ? R.string.phrase_training_load_failed : R.string.phrase_training_load_failed_for_data : R.string.phrase_training_load_failed_for_net : R.string.phrase_training_load_failed_for_net_offline : R.string.phrase_training_load_failed_for_net_usr_reject, 0);
            finish();
            return;
        }
        this.f24471l.setProgress(0);
        this.f24472m = 0;
        TopicPatterns j11 = this.f24464e.j();
        this.f24466g = j11;
        this.f24473n = j11.getArrTopics().size();
        this.f24467h = this.f24464e.i();
        K0(0, null);
    }

    @Override // ih.i.b
    public void g(int progress) {
        this.f24474o.setProgress(progress);
    }

    @Override // com.baicizhan.main.phrasetraining.activity.a.b
    public void i(boolean right) {
        this.f24469j.a(right ? R.raw.answer_right : R.raw.answer_error);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (P0(savedInstanceState)) {
            return;
        }
        setContentView(R.layout.phrase_training_main);
        N0();
        M0();
        this.f24469j = new l(this);
        p.c(this);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, com.baicizhan.base.LoadingDialogActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (!this.f24477r) {
            this.f24464e.h();
            this.f24469j.destroy();
            this.f24476q.removeCallbacks(this.f24475p);
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
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("exit", true);
    }

    @Override // com.baicizhan.main.phrasetraining.activity.a.b
    public void q0(Fragment last) {
        L0(last);
    }

    @Override // com.baicizhan.main.phrasetraining.activity.a.b
    public void z(int action, Object cookie) {
        K0(action, cookie);
    }

    @Override // ih.i.b
    public void c() {
    }
}
