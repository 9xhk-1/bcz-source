package com.baicizhan.main.fragment;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.util.SimpleSpannableBuilder;
import com.baicizhan.client.business.util.StringUtil;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.fragment.PatternWordToPicFragment;
import com.jiongji.andriod.card.R;
import gi.f0;
import gi.m0;
import gi.u;
import i9.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ma.l;
import ma.t;
import sa.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class PatternWordToPicFragment extends PatternBaseFragment implements View.OnClickListener {
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    public TextView A;
    public TextView B;
    public TextView C;
    public ViewGroup D;
    public ViewGroup E;
    public ViewGroup F;
    public ImageView G;
    public ImageView[] H;
    public ImageView[] I;
    public TextView[] J;

    /* renamed from: s, reason: collision with root package name */
    public TextView f20801s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f20802t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f20803u;

    /* renamed from: v, reason: collision with root package name */
    public ViewAnimator f20804v;

    /* renamed from: w, reason: collision with root package name */
    public int f20805w;

    /* renamed from: x, reason: collision with root package name */
    public List<Integer> f20806x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f20807y;

    /* renamed from: z, reason: collision with root package name */
    public TextView f20808z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends c {
        public a() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            PatternWordToPicFragment.this.setRecallLayoutHide(true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            if (PatternWordToPicFragment.this.f20808z.getVisibility() == 0) {
                PatternWordToPicFragment.this.E();
                return;
            }
            if (PatternWordToPicFragment.this.f20805w < 0) {
                PatternWordToPicFragment.this.f20805w = 0;
            }
            PatternWordToPicFragment.this.K();
        }
    }

    public PatternWordToPicFragment(Context context, int category) {
        this(context, null, 0, category);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        if (this.f20808z.getVisibility() == 0) {
            this.f20808z.setVisibility(8);
            this.A.setText(this.f20748i.word);
            this.B.setVisibility(0);
        }
    }

    private void F(int level) {
        if (level == -1) {
            this.f20804v.setVisibility(8);
            E();
            return;
        }
        if (level < 0 || level > this.f20806x.size() - 1) {
            return;
        }
        int intValue = this.f20806x.get(level).intValue();
        if (intValue == 0) {
            this.f20804v.setVisibility(8);
            K();
            return;
        }
        this.f20804v.setVisibility(0);
        this.f20804v.setDisplayedChild(intValue - 1);
        IAudioPlayer iAudioPlayer = this.f20750k;
        TopicRecord topicRecord = this.f20748i;
        ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, intValue == 1 ? topicRecord.sentenceAudio : topicRecord.wordAudio);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        if (this.f20808z.getVisibility() == 8) {
            if (j.c(j.f60415f, true)) {
                this.f20750k.a(R.raw.etyma_expand);
            }
            this.f20808z.setVisibility(0);
            this.A.setText(this.f20807y);
            this.B.setVisibility(8);
        }
    }

    private void setHasRecallFunction(boolean show) {
        this.D.setVisibility(show ? 0 : 8);
        this.F.setVisibility(show ? 0 : 8);
        if (show) {
            return;
        }
        this.E.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRecallLayoutHide(boolean isHide) {
        this.D.setVisibility(isHide ? 8 : 0);
        this.E.setVisibility(isHide ? 0 : 4);
    }

    public final void G() {
        if (!fh.a.a(this.f20748i.topicId)) {
            setHasRecallFunction(false);
        } else {
            setHasRecallFunction(true);
            I();
        }
    }

    public final /* synthetic */ void H(View view) {
        J();
    }

    public final void I() {
        boolean c11 = fh.a.c(getContext());
        hc.c.i(c11 ? R.drawable.ic_invisible : R.drawable.ic_visible).o(this.G);
        setRecallLayoutHide(c11);
    }

    public final void J() {
        boolean c11 = fh.a.c(getContext());
        fh.a.d(getContext(), !c11);
        I();
        HashMap hashMap = new HashMap();
        hashMap.put("switch_type", Integer.valueOf(c11 ? 1 : 0));
        l.e(t.f73003b, ma.a.V3, hashMap);
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void j(boolean retain) {
        for (int i11 = 0; i11 < 4; i11++) {
            if (this.H[i11].getVisibility() != 0 || !retain) {
                this.H[i11].setVisibility(4);
                this.I[i11].setOnClickListener(this);
            }
        }
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public boolean k() {
        if (this.f20805w == this.f20806x.size() - 1) {
            return false;
        }
        int i11 = this.f20805w + 1;
        this.f20805w = i11;
        F(i11);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int intValue = ((Integer) v11.getTag()).intValue();
        int i11 = this.f20749j.get(intValue).topicId;
        this.H[intValue].setVisibility(0);
        for (ImageView imageView : this.I) {
            imageView.setOnClickListener(null);
        }
        e(i11);
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public View p(LayoutInflater inflater, ViewGroup container) {
        View inflate = inflater.inflate(R.layout.fragment_learning_example_pattern_word_to_pic_portrait, container, true);
        this.A = (TextView) inflate.findViewById(R.id.topic_word);
        this.B = (TextView) inflate.findViewById(R.id.topic_phonetic);
        this.f20808z = (TextView) inflate.findViewById(R.id.topic_etyma);
        this.f20804v = (ViewAnimator) inflate.findViewById(R.id.hint_switcher);
        this.f20801s = (TextView) inflate.findViewById(R.id.topic_sentence);
        this.f20802t = (TextView) inflate.findViewById(R.id.topic_mean_en);
        this.f20803u = (TextView) inflate.findViewById(R.id.topic_mean_cn);
        this.E = (ViewGroup) inflate.findViewById(R.id.option_container);
        this.f20804v.setInAnimation(getContext(), R.anim.business_push_up_in);
        for (int i11 = 0; i11 < 4; i11++) {
            FrameLayout frameLayout = (FrameLayout) ((FrameLayout) this.E.getChildAt(i11)).getChildAt(0);
            ImageView imageView = (ImageView) frameLayout.getChildAt(0);
            ImageView imageView2 = (ImageView) frameLayout.getChildAt(2);
            TextView textView = (TextView) frameLayout.getChildAt(1);
            this.I[i11] = imageView;
            imageView.setSoundEffectsEnabled(false);
            this.H[i11] = imageView2;
            this.J[i11] = textView;
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.answer_verify_btn);
        this.C = textView2;
        textView2.setOnClickListener(new a());
        this.D = (ViewGroup) inflate.findViewById(R.id.recall_layout);
        this.F = (ViewGroup) inflate.findViewById(R.id.recall_switch_layout);
        this.G = (ImageView) inflate.findViewById(R.id.recall_switch_image);
        this.F.setOnClickListener(new View.OnClickListener() { // from class: hg.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PatternWordToPicFragment.this.H(view);
            }
        });
        return inflate;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void q() {
        super.q();
        for (ImageView imageView : this.I) {
            imageView.setImageDrawable(null);
        }
        j(false);
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void r() {
        getContext().getResources().getDimensionPixelSize(R.dimen.T5);
        int color = getResources().getColor(R.color.study_word);
        this.f20806x.clear();
        this.A.setText(this.f20748i.word);
        if (TextUtils.isEmpty(this.f20748i.phonetic)) {
            this.B.setVisibility(8);
        } else {
            this.B.setText(this.f20748i.phonetic);
            this.B.setVisibility(0);
        }
        if (TextUtils.isEmpty(this.f20748i.wordEtyma) || TextUtils.isEmpty(this.f20748i.wordEtyma.trim())) {
            this.A.setTextColor(getResources().getColor(R.color.study_word_normal));
            this.A.setOnClickListener(null);
        } else {
            this.A.setTextColor(color);
            TopicRecord topicRecord = this.f20748i;
            List<String> a11 = u.a(topicRecord.word, topicRecord.wordEtyma);
            int color2 = getResources().getColor(R.color.study_word_normal);
            int color3 = getResources().getColor(R.color.main_color_word_b8);
            if (a11.size() > 0) {
                SimpleSpannableBuilder simpleSpannableBuilder = new SimpleSpannableBuilder();
                simpleSpannableBuilder.append(a11.get(0), new ForegroundColorSpan(color));
                int i11 = 1;
                while (i11 < a11.size()) {
                    simpleSpannableBuilder.append("+", new ForegroundColorSpan(color3));
                    simpleSpannableBuilder.append(a11.get(i11), new ForegroundColorSpan(i11 == a11.size() - 1 ? color : color2));
                    i11++;
                }
                this.f20807y = simpleSpannableBuilder.build();
                this.A.setOnClickListener(new b());
                this.f20808z.setText(this.f20748i.wordEtyma);
                this.f20806x.add(0);
            }
        }
        this.f20808z.setVisibility(8);
        if (!TextUtils.isEmpty(this.f20748i.sentence)) {
            m0.o(this.f20801s, this.f20748i);
            if (!TextUtils.isEmpty(this.f20748i.sentenceTrans)) {
                this.f20801s.append("\n" + this.f20748i.sentenceTrans);
            }
            this.f20806x.add(1);
        }
        if (!TextUtils.isEmpty(this.f20748i.wordMeanEn)) {
            m0.w(this.f20802t, this.f20748i);
            this.f20806x.add(2);
        }
        if (!TextUtils.isEmpty(this.f20748i.wordMean)) {
            m0.v(this.f20803u, this.f20748i);
            this.f20806x.add(3);
        }
        G();
        int i12 = 0;
        while (i12 < 4) {
            TopicRecord topicRecord2 = this.f20749j.get(i12);
            this.I[i12].setImageDrawable(null);
            ZPackUtils.loadImageCompat(topicRecord2, topicRecord2.imagePath).f(R.drawable.image_broke_normal_default).o(this.I[i12]);
            this.I[i12].setTag(Integer.valueOf(i12));
            this.I[i12].setContentDescription(String.valueOf(i12 == this.f20747h));
            this.I[i12].setOnClickListener(this);
            if (j.c("show_image_mean", true)) {
                this.J[i12].setText(StringUtil.unlines(topicRecord2.wordMean));
                this.J[i12].setVisibility(0);
            } else {
                this.J[i12].setVisibility(8);
            }
            this.H[i12].setVisibility(4);
            f0.e(this.H[i12], l(topicRecord2.topicId) ? R.drawable.ic_study_result_pic_right : R.drawable.ic_study_result_pic_wrong);
            i12++;
        }
        this.f20805w = -1;
        F(-1);
        super.r();
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void t(int answerTopicId) {
        String str;
        String[] strArr = {"topic_id", "strategy_id", ma.b.f72925m0, ma.b.f72928n0, "plan_type"};
        String str2 = this.f20748i.topicId + "";
        String str3 = fh.a.b(getContext(), this.f20748i.topicId) ? "wordpic_recall" : "wordpic";
        if (answerTopicId == -1) {
            str = "null";
        } else {
            str = answerTopicId + "";
        }
        l.b("study-detail-common", "choose_in_recite_click", ma.u.b(strArr, new String[]{str2, str3, str, l(answerTopicId) ? "1" : "0", i(this.f20743d)}));
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void w() {
        IAudioPlayer iAudioPlayer = this.f20750k;
        TopicRecord topicRecord = this.f20748i;
        ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, topicRecord.wordAudio);
    }

    public PatternWordToPicFragment(Context context, AttributeSet attrs, int defStyle, int category) {
        super(context, attrs, defStyle, category);
        this.f20806x = new ArrayList(3);
        this.H = new ImageView[4];
        this.I = new ImageView[4];
        this.J = new TextView[4];
        p(LayoutInflater.from(context), this);
    }
}
