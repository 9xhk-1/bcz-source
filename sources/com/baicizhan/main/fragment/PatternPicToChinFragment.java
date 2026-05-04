package com.baicizhan.main.fragment;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.util.SimpleSpannableBuilder;
import com.baicizhan.client.business.util.ThemeUtil;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.jiongji.andriod.card.R;
import gi.f0;
import gi.m0;
import gi.u;
import i9.j;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class PatternPicToChinFragment extends PatternBaseFragment implements View.OnClickListener {
    public static final String L = "PatternPicToChinFragment";
    public int A;
    public List<Integer> B;
    public ViewAnimator C;
    public TextView[] D;
    public ImageView[] E;
    public View[] F;
    public ImageView G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;

    /* renamed from: s, reason: collision with root package name */
    public ImageView f20772s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f20773t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f20774u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f20775v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f20776w;

    /* renamed from: x, reason: collision with root package name */
    public TextView f20777x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f20778y;

    /* renamed from: z, reason: collision with root package name */
    public TextView f20779z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            if (PatternPicToChinFragment.this.f20779z.getVisibility() == 0) {
                PatternPicToChinFragment.this.B();
                return;
            }
            PatternPicToChinFragment patternPicToChinFragment = PatternPicToChinFragment.this;
            if (patternPicToChinFragment.A < 0) {
                patternPicToChinFragment.A = 0;
            }
            patternPicToChinFragment.D();
        }
    }

    public PatternPicToChinFragment(Context context, int category) {
        this(context, null, 0, category);
    }

    private void C(int level) {
        if (level == -1) {
            this.C.setVisibility(8);
            B();
        } else {
            int intValue = this.B.get(level).intValue();
            if (intValue == 0) {
                this.C.setVisibility(8);
                D();
            } else {
                this.C.setVisibility(0);
                this.f20774u.setVisibility(8);
                this.C.setDisplayedChild(intValue - 1);
                if (this.C.getCurrentView().getId() == R.id.topic_sentence_hint) {
                    IAudioPlayer iAudioPlayer = this.f20750k;
                    TopicRecord topicRecord = this.f20748i;
                    ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, topicRecord.sentenceAudio);
                } else {
                    IAudioPlayer iAudioPlayer2 = this.f20750k;
                    TopicRecord topicRecord2 = this.f20748i;
                    ZPackUtils.loadAudioCompat(iAudioPlayer2, topicRecord2, topicRecord2.wordAudio);
                }
            }
        }
        E(level);
    }

    public final void B() {
        if (this.f20779z.getVisibility() == 0) {
            this.f20779z.setVisibility(8);
            this.f20773t.setText(this.f20748i.word);
            this.f20774u.setVisibility(0);
        }
    }

    public final void D() {
        if (this.f20779z.getVisibility() == 8) {
            if (j.c(j.f60415f, true)) {
                this.f20750k.a(R.raw.etyma_expand);
            }
            this.f20779z.setVisibility(0);
            this.f20773t.setText(this.f20778y);
            this.f20774u.setVisibility(8);
        }
    }

    public final void E(int level) {
        int width = this.f20772s.getWidth();
        int height = this.f20772s.getHeight();
        if (this.J == 0 || this.K == 0) {
            this.J = (width * 3) / 5;
            this.K = (height * 3) / 5;
        }
        int i11 = level >= 0 ? this.J : -1;
        int i12 = level >= 0 ? this.K : -2;
        ViewGroup.LayoutParams layoutParams = this.f20772s.getLayoutParams();
        layoutParams.width = i11;
        layoutParams.height = i12;
        this.f20772s.setLayoutParams(layoutParams);
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void j(boolean retain) {
        for (int i11 = 0; i11 < 4; i11++) {
            if (this.E[i11].getVisibility() != 0 || !retain) {
                this.E[i11].setVisibility(4);
                this.F[i11].setOnClickListener(this);
                this.F[i11].setBackgroundResource(R.drawable.button_study_word_option);
            }
        }
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public boolean k() {
        if (this.A == this.B.size() - 1) {
            return false;
        }
        int i11 = this.A + 1;
        this.A = i11;
        C(i11);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int intValue = ((Integer) v11.getTag()).intValue();
        int i11 = this.f20749j.get(intValue).topicId;
        this.E[intValue].setVisibility(0);
        this.F[intValue].setBackgroundResource(l(i11) ? R.drawable.button_study_word_option_right : R.drawable.button_study_word_option_wrong);
        for (View view : this.F) {
            view.setOnClickListener(null);
        }
        e(i11);
        this.H = true;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public View p(LayoutInflater inflater, ViewGroup container) {
        View inflate = inflater.inflate(R.layout.fragment_learning_example_pattern_pic_to_chin_portrait, container, true);
        this.I = j.e("show_deformation", 1) == 2;
        this.f20772s = (ImageView) inflate.findViewById(R.id.topic_deformation_image);
        this.f20773t = (TextView) inflate.findViewById(R.id.topic_word);
        this.f20774u = (TextView) inflate.findViewById(R.id.topic_phonetic);
        this.C = (ViewAnimator) inflate.findViewById(R.id.hint_switcher);
        this.f20775v = (TextView) inflate.findViewById(R.id.topic_sentence);
        this.G = (ImageView) inflate.findViewById(R.id.topic_image);
        this.f20776w = (TextView) inflate.findViewById(R.id.topic_mean_en);
        this.f20777x = (TextView) inflate.findViewById(R.id.topic_mean_cn);
        this.f20779z = (TextView) inflate.findViewById(R.id.topic_etyma);
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.option_container);
        this.C.setInAnimation(getContext(), R.anim.business_push_up_in);
        for (int i11 = 0; i11 < 4; i11++) {
            ViewGroup viewGroup2 = (ViewGroup) ((ViewGroup) viewGroup.getChildAt(i11)).getChildAt(0);
            TextView textView = (TextView) viewGroup2.getChildAt(0);
            ImageView imageView = (ImageView) viewGroup2.getChildAt(1);
            this.F[i11] = viewGroup2;
            viewGroup2.setSoundEffectsEnabled(false);
            this.D[i11] = textView;
            this.E[i11] = imageView;
            viewGroup2.setTag(Integer.valueOf(i11));
        }
        return inflate;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void q() {
        super.q();
        this.f20772s.setImageDrawable(null);
        this.G.setImageDrawable(null);
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void r() {
        this.H = false;
        this.f20773t.setText(this.f20748i.word);
        if (TextUtils.isEmpty(this.f20748i.phonetic)) {
            this.f20774u.setVisibility(8);
        } else {
            this.f20774u.setVisibility(0);
            this.f20774u.setText(this.f20748i.phonetic);
        }
        if (this.I) {
            TopicRecord topicRecord = this.f20748i;
            if (ZPackUtils.resourceFileExistsCompat(topicRecord, topicRecord.deformationImagePath)) {
                this.f20772s.setVisibility(0);
                this.f20772s.setImageDrawable(null);
                TopicRecord topicRecord2 = this.f20748i;
                ZPackUtils.loadImageCompat(topicRecord2, topicRecord2.deformationImagePath).f(R.drawable.image_broke_normal_default).o(this.f20772s);
                this.f20773t.setTextColor(getResources().getColor(R.color.study_word_normal));
            } else {
                this.f20772s.setVisibility(8);
                this.f20773t.setTextColor(ThemeUtil.getThemeColorWithAttr(getContext(), R.attr.color_list_text2));
            }
        } else {
            this.f20773t.setTextColor(getResources().getColor(R.color.study_word));
            this.f20772s.setVisibility(8);
        }
        this.f20773t.setTextSize(2, 32.0f);
        this.B.clear();
        if (TextUtils.isEmpty(this.f20748i.wordEtyma) || TextUtils.isEmpty(this.f20748i.wordEtyma.trim())) {
            this.f20773t.setTextColor(getResources().getColor(R.color.study_word_normal));
            this.f20773t.setOnClickListener(null);
        } else {
            int color = getResources().getColor(R.color.study_word);
            this.f20773t.setTextColor(color);
            TopicRecord topicRecord3 = this.f20748i;
            List<String> a11 = u.a(topicRecord3.word, topicRecord3.wordEtyma);
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
                this.f20778y = simpleSpannableBuilder.build();
                this.f20773t.setOnClickListener(new a());
                this.f20779z.setText(this.f20748i.wordEtyma);
                this.B.add(0);
            }
        }
        this.f20779z.setVisibility(8);
        if (TextUtils.isEmpty(this.f20748i.sentence)) {
            this.f20775v.setText("");
        } else {
            m0.o(this.f20775v, this.f20748i);
            if (!TextUtils.isEmpty(this.f20748i.sentenceTrans)) {
                this.f20775v.append("\n" + this.f20748i.sentenceTrans);
            }
            this.B.add(1);
        }
        this.G.setImageDrawable(null);
        if (this.f20748i.bookId > 0) {
            this.G.setVisibility(0);
            TopicRecord topicRecord4 = this.f20748i;
            ZPackUtils.loadImageCompat(topicRecord4, topicRecord4.imagePath).f(R.drawable.image_broke_normal_default).o(this.G);
        } else {
            this.G.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f20748i.wordMeanEn)) {
            m0.w(this.f20776w, this.f20748i);
            this.B.add(2);
        }
        int i12 = 0;
        while (i12 < 4) {
            TopicRecord topicRecord5 = this.f20749j.get(i12);
            this.F[i12].setOnClickListener(this);
            this.D[i12].setText(topicRecord5.wordMean);
            this.F[i12].setContentDescription(String.valueOf(i12 == this.f20747h));
            this.E[i12].setVisibility(4);
            f0.e(this.E[i12], l(topicRecord5.topicId) ? R.drawable.ic_result_mid_right : R.drawable.ic_result_mid_wrong);
            this.F[i12].setBackgroundResource(R.drawable.button_study_word_option);
            i12++;
        }
        this.A = -1;
        C(-1);
        super.r();
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void w() {
        TopicRecord topicRecord = this.f20748i;
        if (topicRecord.bookId > 0) {
            ZPackUtils.loadAudioCompat(this.f20750k, topicRecord, topicRecord.wordAudio);
        } else {
            this.f20750k.e(new File(this.f20748i.wordAudio));
        }
    }

    public PatternPicToChinFragment(Context context, AttributeSet attrs, int defStyle, int category) {
        super(context, attrs, defStyle, category);
        this.A = -1;
        this.B = new ArrayList(3);
        this.D = new TextView[4];
        this.E = new ImageView[4];
        this.F = new View[4];
        this.H = false;
        this.I = true;
        p(LayoutInflater.from(context), this);
    }
}
