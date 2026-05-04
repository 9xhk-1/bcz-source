package fd;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.annotation.NonNull;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.main.activity.LearningActivity;
import com.jiongji.andriod.card.R;
import fd.m1;
import java.util.HashMap;
import jg.g;
import kc.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class p1 {

    /* renamed from: c, reason: collision with root package name */
    public static final String f51693c = "LearnGuideChecker";

    /* renamed from: a, reason: collision with root package name */
    public LearningActivity f51694a;

    /* renamed from: b, reason: collision with root package name */
    public int f51695b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends kc.r {
        public a() {
        }

        @Override // kc.r, kc.q
        public void onDialogPositiveClick(@NonNull View v11) {
            gi.v.a(4);
            p1.this.f51694a.H1();
        }
    }

    public static /* synthetic */ void b() {
        jg.d.g(jg.d.f64078b);
        gi.v.a(256);
    }

    public void d() {
        if (!gi.v.c(64) || this.f51694a.G1()) {
            return;
        }
        new SpannableString(this.f51694a.getString(R.string.main_guide_done_wrong)).setSpan(new ForegroundColorSpan(this.f51695b), 15, 17, 33);
        m1.f(this.f51694a).m(this.f51694a.P, R.id.kill, R.id.hint, R.id.voice).o().e().h();
        gi.v.a(64);
    }

    public void e(boolean fromHint) {
        if (fromHint && gi.v.c(32) && !this.f51694a.G1()) {
            m1.f(this.f51694a).s(R.layout.fragment_guide_review_after_kill).h();
            gi.v.a(32);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean f() {
        if (!gi.v.c(4)) {
            return false;
        }
        LearningActivity learningActivity = this.f51694a;
        mc.a.m(learningActivity, ((kc.u) ((u.a) new u.a(learningActivity).L(R.string.main_guide_first_blood_title).U(R.string.main_guide_first_blood).C(R.string.main_guide_first_blood_confirm)).d()).f0(new a()));
        return true;
    }

    public void g(int mCurrentType, int currentId) {
        qb.c.b(f51693c, "checkNewProblem " + mCurrentType, new Object[0]);
        if (mCurrentType == 2 && fh.a.a(currentId) && jg.d.e(jg.d.f64078b)) {
            jg.g b11 = new g.a().a(jg.d.a(this.f51694a, R.layout.view_recall_guide_first, R.id.next)).a(jg.d.d(this.f51694a, R.layout.view_recall_guide_second, R.id.next, R.id.top_img)).b(this.f51694a.N);
            b11.i(new g.b() { // from class: fd.n1
                @Override // jg.g.b
                public final void onFinish() {
                    p1.b();
                }
            });
            b11.j();
            return;
        }
        if (gi.v.d()) {
            if (gi.v.c(128) && mCurrentType == 1) {
                gi.v.a(128);
                final HashMap hashMap = new HashMap();
                hashMap.put("topic_id", "" + currentId);
                hashMap.put("strategy_id", t1.a(mCurrentType));
                hashMap.put("plan_type", ma.v.f73035f);
                m1.f(this.f51694a).t(R.string.main_guide_sentence_image_option).k(this.f51694a.P, true, R.id.topic_sentence).o().r(new m1.f() { // from class: fd.o1
                    @Override // fd.m1.f
                    public final void onDismiss() {
                        ma.l.b(ma.t.f73003b, ma.a.f72870x3, hashMap);
                    }
                }).h();
                ma.l.b(ma.t.f73003b, ma.a.f72863w3, hashMap);
                return;
            }
            if (mCurrentType == 2 && gi.v.c(256) && !LearnRecordManager.A().T(currentId)) {
                gi.v.a(256);
                m1.f(this.f51694a).t(R.string.main_guide_pattern_2).k(this.f51694a.P, true, R.id.topic_word).o().e().h();
                return;
            }
            if (gi.v.c(512) && mCurrentType == 3) {
                gi.v.a(512);
                m1.f(this.f51694a).t(R.string.main_guide_pattern_3).k(this.f51694a.P, true, R.id.word_container).o().e().h();
            } else if (gi.v.c(16) && LearnRecordManager.A().B() > 0) {
                gi.v.a(16);
                m1.f(this.f51694a).s(R.layout.fragment_guide_review).h();
            } else {
                if (!gi.v.c(8) || LearnRecordManager.A().B() < 3) {
                    return;
                }
                gi.v.a(8);
                m1.f(this.f51694a).s(R.layout.fragment_guide_review_triple_kill).h();
            }
        }
    }

    public void h(LearningActivity activity) {
        this.f51694a = activity;
        this.f51695b = activity.getResources().getColor(R.color.main_blue);
    }
}
