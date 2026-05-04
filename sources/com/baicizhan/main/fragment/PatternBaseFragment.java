package com.baicizhan.main.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.customview.FrameLayoutAutoSizeFix;
import com.baicizhan.main.fragment.PatternBaseFragment;
import fd.t1;
import hg.l;
import java.util.List;
import ma.u;
import ma.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class PatternBaseFragment extends FrameLayoutAutoSizeFix {

    /* renamed from: l, reason: collision with root package name */
    public static final String f20734l = "PatternBaseFragment";

    /* renamed from: m, reason: collision with root package name */
    public static final int f20735m = 4;

    /* renamed from: n, reason: collision with root package name */
    public static final int f20736n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static final int f20737o = 1;

    /* renamed from: p, reason: collision with root package name */
    public static final int f20738p = 2;

    /* renamed from: q, reason: collision with root package name */
    public static final int f20739q = 3;

    /* renamed from: r, reason: collision with root package name */
    public static final long f20740r = 500;

    /* renamed from: b, reason: collision with root package name */
    public l f20741b;

    /* renamed from: c, reason: collision with root package name */
    public Handler f20742c;

    /* renamed from: d, reason: collision with root package name */
    public int f20743d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20744e;

    /* renamed from: f, reason: collision with root package name */
    public int f20745f;

    /* renamed from: g, reason: collision with root package name */
    public c f20746g;

    /* renamed from: h, reason: collision with root package name */
    public int f20747h;

    /* renamed from: i, reason: collision with root package name */
    public TopicRecord f20748i;

    /* renamed from: j, reason: collision with root package name */
    public List<TopicRecord> f20749j;

    /* renamed from: k, reason: collision with root package name */
    public IAudioPlayer f20750k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PatternBaseFragment.this.g();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PatternBaseFragment.this.w();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void k0();

        default boolean s(int topicId, boolean ignoreWiki) {
            return false;
        }

        boolean x(int topicId);
    }

    public PatternBaseFragment(Context context, int category) {
        this(context, null, 0, category);
    }

    public void e(final int topicId) {
        f(topicId, false);
    }

    public void f(final int topicId, final boolean ignoreWiki) {
        if (this.f20746g != null) {
            post(new Runnable() { // from class: hg.k
                @Override // java.lang.Runnable
                public final void run() {
                    PatternBaseFragment.this.m(ignoreWiki, topicId);
                }
            });
        }
    }

    public void g() {
        this.f20741b.a(this, getContext());
    }

    public int getPatternType() {
        return this.f20745f;
    }

    public final String i(int category) {
        return category != 0 ? category != 1 ? category != 2 ? category != 3 ? "" : v.f73036g : v.f73042m : v.f73041l : v.f73035f;
    }

    public abstract void j(boolean retain);

    public abstract boolean k();

    public boolean l(int topicId) {
        return this.f20748i.topicId == topicId;
    }

    public final /* synthetic */ void m(boolean z11, int i11) {
        if (z11) {
            this.f20746g.s(i11, true);
        } else {
            this.f20746g.x(i11);
        }
        t(i11);
    }

    public void n() {
        ma.l.b("study-detail-common", "choose_in_recite_click", u.b(new String[]{"topic_id", "strategy_id", ma.b.f72925m0, ma.b.f72928n0, "plan_type"}, new String[]{this.f20748i.topicId + "", t1.a(this.f20745f), "-1", "1", i(this.f20743d)}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void o(Activity activity) {
        this.f20746g = (c) activity;
        this.f20744e = true;
        this.f20741b.h();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return super.onSaveInstanceState();
    }

    public abstract View p(LayoutInflater inflater, ViewGroup container);

    public void q() {
        this.f20744e = false;
    }

    public void r() {
        g();
    }

    public void s() {
        if (com.baicizhan.base.a.a(getContext())) {
            this.f20742c.post(new a());
        }
    }

    public void setPatternType(int patternType) {
        this.f20745f = patternType;
    }

    public void t(int answerTopicId) {
        String str;
        String[] strArr = {"topic_id", "strategy_id", ma.b.f72925m0, ma.b.f72928n0, "plan_type"};
        String str2 = this.f20748i.topicId + "";
        String a11 = t1.a(this.f20745f);
        if (answerTopicId == -1) {
            str = "null";
        } else {
            str = answerTopicId + "";
        }
        ma.l.b("study-detail-common", "choose_in_recite_click", u.b(strArr, new String[]{str2, a11, str, l(answerTopicId) ? "1" : "0", i(this.f20743d)}));
    }

    public void u() {
        ma.l.b("study-detail-common", ma.a.f72851u5, u.b(new String[]{"topic_id", "strategy_id", "plan_type"}, new String[]{this.f20748i.topicId + "", t1.a(this.f20745f), i(this.f20743d)}));
    }

    public void v(int rightIndex, List<TopicRecord> topicOptions, IAudioPlayer audioPlayer) {
        this.f20747h = rightIndex;
        this.f20749j = topicOptions;
        this.f20748i = topicOptions.get(rightIndex);
        this.f20750k = audioPlayer;
        r();
        x();
        u();
    }

    public abstract void w();

    public void x() {
        postDelayed(new b(), 500L);
    }

    public PatternBaseFragment(Context context, AttributeSet attrs, int defStyle, int category) {
        super(context, attrs, defStyle);
        this.f20741b = new l();
        this.f20742c = new Handler();
        this.f20744e = false;
        this.f20743d = category;
        qb.c.b(f20734l, "category: %s", i(category));
    }

    public void h() {
    }
}
