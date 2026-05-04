package com.baicizhan.main.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.client.business.webview.ui.NoActionBarWebActivity;
import com.baicizhan.client.fm.activity.AudioCenterActivity;
import com.baicizhan.client.video.activity.WordTVActivity;
import com.baicizhan.main.activity.FastTestActivity;
import com.baicizhan.main.customview.SkillTrainingMainItemView;
import com.baicizhan.main.module.ReviewAdModule;
import com.baicizhan.main.phrasetraining.activity.PhraseGroupActivity;
import com.baicizhan.main.plusreview.activity.DefaultPreloadActivity;
import com.jiongji.andriod.card.R;
import gi.m;
import java.util.HashMap;
import java.util.Map;
import ma.l;
import ma.t;
import q9.x;
import sa.c;
import xb.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SkillTrainFragment extends Fragment implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public SkillTrainingMainItemView f20811a;

    /* renamed from: b, reason: collision with root package name */
    public SkillTrainingMainItemView f20812b;

    /* renamed from: c, reason: collision with root package name */
    public SkillTrainingMainItemView f20813c;

    /* renamed from: d, reason: collision with root package name */
    public SkillTrainingMainItemView f20814d;

    /* renamed from: e, reason: collision with root package name */
    public SkillTrainingMainItemView f20815e;

    /* renamed from: f, reason: collision with root package name */
    public SkillTrainingMainItemView f20816f;

    /* renamed from: g, reason: collision with root package name */
    public SkillTrainingMainItemView f20817g;

    /* renamed from: h, reason: collision with root package name */
    public SkillTrainingMainItemView f20818h;

    /* renamed from: i, reason: collision with root package name */
    public SkillTrainingMainItemView f20819i;

    /* renamed from: j, reason: collision with root package name */
    public SkillTrainingMainItemView f20820j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f20821k;

    /* renamed from: l, reason: collision with root package name */
    public View f20822l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Map f20823a;

        public a(final Map val$param) {
            this.f20823a = val$param;
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            ReviewAdModule reviewAdModule = ReviewAdModule.f24424a;
            if (TextUtils.isEmpty(reviewAdModule.i())) {
                return;
            }
            NoActionBarWebActivity.start(SkillTrainFragment.this.getContext(), reviewAdModule.i());
            this.f20823a.put("id", reviewAdModule.j());
            l.e(t.f73022u, ma.a.f72729d2, this.f20823a);
        }
    }

    public static SkillTrainFragment D() {
        return new SkillTrainFragment();
    }

    public final void A() {
        DefaultPreloadActivity.i1(getActivity());
        l.a(t.f73011j, ma.a.M0);
    }

    public final void B(View root) {
        View findViewById = root.findViewById(R.id.word_tv);
        findViewById.setBackgroundResource(R.drawable.bg_skill_training_item_video);
        View findViewById2 = root.findViewById(R.id.word_fm);
        findViewById2.setBackgroundResource(R.drawable.bg_skill_training_item_fm);
        ((TextView) findViewById.findViewById(R.id.title)).setText(R.string.skill_training_tv);
        ((ImageView) findViewById.findViewById(R.id.image)).setImageResource(R.drawable.review_wordstv);
        ((TextView) findViewById2.findViewById(R.id.title)).setText(R.string.skill_training_fm);
        ((ImageView) findViewById2.findViewById(R.id.image)).setImageResource(R.drawable.review_wordsradio);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
    }

    public final View C(LayoutInflater inflater, ViewGroup container) {
        View inflate = inflater.inflate(R.layout.fragment_skill_train, container, false);
        B(inflate);
        this.f20821k = (ImageView) inflate.findViewById(R.id.ad_image);
        this.f20822l = inflate.findViewById(R.id.ad_container);
        SkillTrainingMainItemView skillTrainingMainItemView = (SkillTrainingMainItemView) inflate.findViewById(R.id.walk_listen);
        this.f20817g = skillTrainingMainItemView;
        skillTrainingMainItemView.a(R.drawable.ic_skill_training_walk_listen).e(R.string.walk_listen_title).b(this);
        SkillTrainingMainItemView skillTrainingMainItemView2 = (SkillTrainingMainItemView) inflate.findViewById(R.id.self_test);
        this.f20818h = skillTrainingMainItemView2;
        skillTrainingMainItemView2.a(R.drawable.ic_skill_training_self_test).e(R.string.self_test_title).b(this);
        SkillTrainingMainItemView skillTrainingMainItemView3 = (SkillTrainingMainItemView) inflate.findViewById(R.id.en_mean);
        this.f20811a = skillTrainingMainItemView3;
        skillTrainingMainItemView3.a(R.drawable.ic_skill_training_en_to_cn).e(R.string.en_mean_title).c(R.string.en_mean_subtitle).b(this);
        SkillTrainingMainItemView skillTrainingMainItemView4 = (SkillTrainingMainItemView) inflate.findViewById(R.id.cn_word);
        this.f20812b = skillTrainingMainItemView4;
        skillTrainingMainItemView4.a(R.drawable.ic_skill_training_cn_to_en).e(R.string.cn_word_title).c(R.string.cn_word_subtitle).b(this);
        SkillTrainingMainItemView skillTrainingMainItemView5 = (SkillTrainingMainItemView) inflate.findViewById(R.id.hear_recognize);
        this.f20813c = skillTrainingMainItemView5;
        skillTrainingMainItemView5.a(R.drawable.ic_skill_training_hear_recognize).e(R.string.hear_recognize_title).c(R.string.hear_recognize_subtitle).b(this);
        SkillTrainingMainItemView skillTrainingMainItemView6 = (SkillTrainingMainItemView) inflate.findViewById(R.id.spell);
        this.f20814d = skillTrainingMainItemView6;
        skillTrainingMainItemView6.a(R.drawable.ic_skill_training_spell).e(R.string.spell_title).c(R.string.spell_subtitle).b(this);
        SkillTrainingMainItemView skillTrainingMainItemView7 = (SkillTrainingMainItemView) inflate.findViewById(R.id.spell_review);
        this.f20815e = skillTrainingMainItemView7;
        skillTrainingMainItemView7.a(R.drawable.ic_skill_training_spell_review).e(R.string.spell_review_title).c(R.string.spell_review_subtitle).b(this);
        SkillTrainingMainItemView skillTrainingMainItemView8 = (SkillTrainingMainItemView) inflate.findViewById(R.id.full_spell);
        this.f20816f = skillTrainingMainItemView8;
        skillTrainingMainItemView8.a(R.drawable.ic_skill_training_full_spell).e(R.string.full_spell_title).c(R.string.full_spell_subtitle).b(this);
        SkillTrainingMainItemView skillTrainingMainItemView9 = (SkillTrainingMainItemView) inflate.findViewById(R.id.read_review);
        this.f20819i = skillTrainingMainItemView9;
        skillTrainingMainItemView9.a(R.drawable.ic_skill_training_read_review).e(R.string.read_review_title).c(R.string.read_review_subtitle).b(this);
        SkillTrainingMainItemView skillTrainingMainItemView10 = (SkillTrainingMainItemView) inflate.findViewById(R.id.phrase_review);
        this.f20820j = skillTrainingMainItemView10;
        skillTrainingMainItemView10.a(R.drawable.ic_skill_training_phrase).e(R.string.phrase_review_title).c(R.string.cn_word_subtitle).b(this);
        H();
        return inflate;
    }

    public final void E() {
        l.a(t.f73011j, ma.a.O0);
        PhraseGroupActivity.R0(getActivity());
    }

    public final void F() {
        DefaultPreloadActivity.h1(getActivity());
        ka.a.h(getActivity());
        l.a(t.f73011j, ma.a.V0);
    }

    public final void G() {
        ReviewAdModule reviewAdModule = ReviewAdModule.f24424a;
        if (TextUtils.isEmpty(reviewAdModule.h())) {
            this.f20822l.setVisibility(8);
            return;
        }
        this.f20822l.setVisibility(0);
        HashMap hashMap = new HashMap();
        hashMap.put("id", reviewAdModule.j());
        l.e(t.f73022u, ma.a.f72722c2, hashMap);
        ViewGroup.LayoutParams layoutParams = this.f20821k.getLayoutParams();
        layoutParams.height = (int) (((f.i(getContext()) - f.a(getContext(), 40.0f)) * 3) / 9.0d);
        this.f20821k.setLayoutParams(layoutParams);
        hc.c.l(reviewAdModule.h()).j(R.drawable.ic_train_ad_holder).f(R.drawable.ic_train_ad_holder).o(this.f20821k);
        this.f20821k.setOnClickListener(new a(hashMap));
    }

    public void H() {
        int l11 = x.r().l();
        if ((l11 != 16 && l11 != 31 && l11 != 409) || DeviceUtil.isDuoQin() || 0 == i9.f.f(getActivity(), i9.f.N)) {
            this.f20820j.setVisibility(8);
        } else {
            this.f20820j.setVisibility(0);
        }
        G();
    }

    public final void I() {
        FastTestActivity.l1(getActivity());
        l.a(t.f73011j, ma.a.N0);
    }

    public final void J() {
        DefaultPreloadActivity.b1(getActivity());
        ka.a.i(getActivity());
        l.a(t.f73011j, ma.a.S0);
    }

    public final void K() {
        DefaultPreloadActivity.a1(getActivity());
        ka.a.i(getActivity());
        l.a(t.f73011j, ma.a.T0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        switch (v11.getId()) {
            case R.id.cn_word /* 2131362156 */:
                t();
                break;
            case R.id.en_mean /* 2131362445 */:
                v();
                break;
            case R.id.full_spell /* 2131362612 */:
                w();
                break;
            case R.id.hear_recognize /* 2131362665 */:
                z();
                break;
            case R.id.phrase_review /* 2131363229 */:
                E();
                break;
            case R.id.read_review /* 2131363428 */:
                F();
                break;
            case R.id.self_test /* 2131363557 */:
                I();
                break;
            case R.id.spell /* 2131363633 */:
                J();
                break;
            case R.id.spell_review /* 2131363634 */:
                K();
                break;
            case R.id.walk_listen /* 2131363974 */:
                A();
                break;
            case R.id.word_fm /* 2131364047 */:
                x();
                break;
            case R.id.word_tv /* 2131364063 */:
                y();
                break;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return C(inflater, container);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        int l11 = x.r().l();
        String g11 = sh.f.g(l11, 3);
        int a11 = m.a(3, 50);
        int t11 = x.r().t(g11);
        if (t11 > a11 && a11 != 0) {
            t11 %= a11;
        }
        this.f20811a.d(t11, a11);
        String g12 = sh.f.g(l11, 24);
        int a12 = m.a(24, 50);
        int t12 = x.r().t(g12);
        if (t12 > a12 && a12 != 0) {
            t12 %= a12;
        }
        this.f20812b.d(t12, a12);
        int l12 = x.r().l();
        String g13 = sh.f.g(l12, 23);
        int a13 = m.a(23, 50);
        int t13 = x.r().t(g13);
        if (t13 > a13 && a13 != 0) {
            t13 %= a13;
        }
        this.f20813c.d(t13, a13);
        String g14 = sh.f.g(l12, 21);
        int a14 = m.a(21, 50);
        int t14 = x.r().t(g14);
        if (t14 > a14 && a14 != 0) {
            t14 %= a14;
        }
        this.f20814d.d(t14, a14);
        String g15 = sh.f.g(l12, 22);
        int a15 = m.a(22, 20);
        int t15 = x.r().t(g15);
        if (t15 > a15 && a15 != 0) {
            t15 %= a15;
        }
        this.f20815e.d(t15, a15);
        String g16 = sh.f.g(l12, 4);
        int a16 = m.a(4, 20);
        int t16 = x.r().t(g16);
        if (t16 > a16 && a16 != 0) {
            t16 %= a16;
        }
        this.f20816f.d(t16, a16);
        String g17 = sh.f.g(l12, 5);
        int a17 = m.a(5, 50);
        int t17 = x.r().t(g17);
        if (t17 > a17 && a17 != 0) {
            t17 %= a17;
        }
        this.f20819i.d(t17, a17);
    }

    public final void t() {
        DefaultPreloadActivity.g1(getActivity());
        l.a(t.f73011j, ma.a.Q0);
    }

    public final void v() {
        DefaultPreloadActivity.c1(getActivity());
        ka.a.f(getActivity());
        l.a(t.f73011j, ma.a.P0);
    }

    public final void w() {
        DefaultPreloadActivity.j1(getActivity());
        ka.a.i(getActivity());
        l.a(t.f73011j, ma.a.U0);
    }

    public final void x() {
        AudioCenterActivity.N0(getActivity());
        ka.a.c(getActivity());
        l.a(t.f73003b, ma.a.O);
    }

    public final void y() {
        getActivity().startActivity(new Intent(getActivity(), (Class<?>) WordTVActivity.class));
        ka.a.q(getActivity());
        l.a(t.f73003b, ma.a.N);
    }

    public final void z() {
        DefaultPreloadActivity.d1(getActivity());
        ka.a.f(getActivity());
        l.a(t.f73011j, ma.a.R0);
    }
}
