package com.baicizhan.main.fragment;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.baicizhan.base.d;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.jiongji.andriod.card.R;
import gi.f0;
import gi.m0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import qb.c;
import va.p;
import xb.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class PatternSenToPicFragment extends PatternBaseFragment implements View.OnClickListener {
    public View A;
    public ImageView[] B;
    public ImageView[] C;

    /* renamed from: s, reason: collision with root package name */
    public TextView f20791s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f20792t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f20793u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f20794v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f20795w;

    /* renamed from: x, reason: collision with root package name */
    public int f20796x;

    /* renamed from: y, reason: collision with root package name */
    public List<Integer> f20797y;

    /* renamed from: z, reason: collision with root package name */
    public ViewAnimator f20798z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements IAudioPlayer.b {
        public a() {
        }

        @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
        public void onPlayStateChanged(IAudioPlayer.State state) {
            if (state == IAudioPlayer.State.Completed) {
                PatternSenToPicFragment.this.f20750k.f(null);
                PatternSenToPicFragment patternSenToPicFragment = PatternSenToPicFragment.this;
                IAudioPlayer iAudioPlayer = patternSenToPicFragment.f20750k;
                TopicRecord topicRecord = patternSenToPicFragment.f20748i;
                ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, topicRecord.sentenceAudio);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements m0.g {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<PatternSenToPicFragment> f20800a;

        public b(PatternSenToPicFragment fragment) {
            this.f20800a = new WeakReference<>(fragment);
        }

        @Override // gi.m0.g
        public void a(String word, m0.e config) {
            PatternSenToPicFragment patternSenToPicFragment = this.f20800a.get();
            if (patternSenToPicFragment == null) {
                return;
            }
            IAudioPlayer iAudioPlayer = patternSenToPicFragment.f20750k;
            TopicRecord topicRecord = patternSenToPicFragment.f20748i;
            ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, topicRecord.wordAudio);
            CharSequence text = patternSenToPicFragment.f20791s.getText();
            if (text instanceof SpannableString) {
                for (p pVar : (p[]) ((SpannableString) text).getSpans(0, text.length(), p.class)) {
                    pVar.setPressed(false);
                }
                patternSenToPicFragment.f20791s.invalidate();
            }
        }
    }

    public PatternSenToPicFragment(Context context, int category) {
        this(context, null, 0, category);
    }

    private void A() {
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.T6);
        if (com.baicizhan.base.a.a(getContext())) {
            dimensionPixelSize = (int) (dimensionPixelSize * d.g());
        }
        int color = getResources().getColor(R.color.main_blue);
        int color2 = pb.a.a().getResources().getColor(R.color.main_color_weak_divider);
        m0.j.m(B(this.f20748i.sentence, this.f20791s)).e(color).h(dimensionPixelSize).f(this.f20748i.word).g(this.f20748i.sentencePhrase, color2).c().l().k(new b(this)).d().i(this.f20791s);
        this.f20791s.setVisibility(0);
        this.f20797y.clear();
        if (!TextUtils.isEmpty(this.f20748i.sentenceTrans)) {
            this.f20792t.setText(this.f20748i.sentenceTrans);
            this.f20797y.add(0);
        }
        if (!TextUtils.isEmpty(this.f20748i.wordMeanEn)) {
            m0.w(this.f20793u, this.f20748i);
            this.f20797y.add(1);
        }
        if (!TextUtils.isEmpty(this.f20748i.wordMean)) {
            m0.v(this.f20794v, this.f20748i);
            this.f20797y.add(2);
        }
        String str = ed.a.f49644a.a().get(Integer.valueOf(this.f20748i.topicId));
        if (TextUtils.isEmpty(str)) {
            this.f20795w.setVisibility(8);
        } else {
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ja.a(color2), 0, spannableString.length(), 33);
            this.f20795w.setText(spannableString);
            this.f20795w.setVisibility(0);
        }
        int i11 = 0;
        while (i11 < 4) {
            TopicRecord topicRecord = this.f20749j.get(i11);
            this.C[i11].setImageDrawable(null);
            ZPackUtils.loadImageCompat(topicRecord, topicRecord.imagePath).f(R.drawable.image_broke_normal_default).o(this.C[i11]);
            this.C[i11].setTag(Integer.valueOf(i11));
            this.C[i11].setContentDescription(String.valueOf(i11 == this.f20747h));
            this.C[i11].setOnClickListener(this);
            this.B[i11].setVisibility(4);
            f0.e(this.B[i11], l(topicRecord.topicId) ? R.drawable.ic_study_result_pic_right : R.drawable.ic_study_result_pic_wrong);
            i11++;
        }
        this.f20796x = -1;
        z(-1);
    }

    private String B(String text, TextView textView) {
        TextPaint paint = textView.getPaint();
        float measuredWidth = textView.getMeasuredWidth() - ((int) paint.measureText("Ww"));
        if (paint.measureText(text) <= measuredWidth) {
            return text;
        }
        List<String> asList = Arrays.asList(text.split("\\s"));
        int i11 = 0;
        int i12 = 0;
        while (i11 < asList.size()) {
            if (paint.measureText((String) asList.get(i11)) >= measuredWidth) {
                c.d(PatternBaseFragment.f20734l, "word %s is too long to split", asList.get(i11));
                return text;
            }
            int i13 = i11 + 1;
            if (paint.measureText(TextUtils.join(" ", asList.subList(i12, i13))) > measuredWidth) {
                int i14 = i11 - 1;
                asList.set(i14, ((String) asList.get(i14)) + "\n");
                i12 = i11;
            }
            i11 = i13;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : asList) {
            stringBuffer.append(str);
            if (!str.contains("\n")) {
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

    private void z(int level) {
        if (level == -1) {
            this.f20798z.setVisibility(8);
            this.A.setVisibility(8);
            return;
        }
        int intValue = this.f20797y.get(level).intValue();
        this.f20798z.setVisibility(0);
        this.A.setVisibility(0);
        this.f20798z.setDisplayedChild(intValue);
        IAudioPlayer iAudioPlayer = this.f20750k;
        TopicRecord topicRecord = this.f20748i;
        ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, topicRecord.wordAudio);
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void h() {
        IAudioPlayer iAudioPlayer = this.f20750k;
        if (iAudioPlayer != null) {
            iAudioPlayer.f(null);
        }
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void j(boolean retain) {
        for (int i11 = 0; i11 < 4; i11++) {
            if (this.B[i11].getVisibility() != 0 || !retain) {
                this.B[i11].setVisibility(4);
                this.C[i11].setOnClickListener(this);
            }
        }
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public boolean k() {
        if (this.f20796x == this.f20797y.size() - 1) {
            return false;
        }
        int i11 = this.f20796x + 1;
        this.f20796x = i11;
        z(i11);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int intValue = ((Integer) v11.getTag()).intValue();
        int i11 = this.f20749j.get(intValue).topicId;
        this.B[intValue].setVisibility(0);
        for (ImageView imageView : this.C) {
            imageView.setOnClickListener(null);
        }
        e(i11);
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public View p(LayoutInflater inflater, ViewGroup container) {
        View inflate = inflater.inflate(R.layout.fragment_learning_example_pattern_sen_to_pic_portrait, container, true);
        this.f20791s = (TextView) inflate.findViewById(R.id.topic_sentence);
        this.f20798z = (ViewAnimator) inflate.findViewById(R.id.hint_switcher);
        this.f20792t = (TextView) inflate.findViewById(R.id.topic_sentence_translate);
        this.f20793u = (TextView) inflate.findViewById(R.id.topic_mean_en);
        this.f20794v = (TextView) inflate.findViewById(R.id.topic_mean_cn);
        this.f20795w = (TextView) inflate.findViewById(R.id.sentence_test_frequency);
        this.A = inflate.findViewById(R.id.divider_mid);
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.option_container);
        this.f20798z.setInAnimation(getContext(), R.anim.business_push_up_in);
        int a11 = i.a(getContext(), 8.0f);
        int color = getResources().getColor(R.color.study_select_button_bg);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(a11);
        gradientDrawable.setColor(color);
        for (int i11 = 0; i11 < 4; i11++) {
            FrameLayout frameLayout = (FrameLayout) ((FrameLayout) viewGroup.getChildAt(i11)).getChildAt(0);
            ImageView imageView = (ImageView) frameLayout.getChildAt(0);
            frameLayout.getChildAt(1).setVisibility(8);
            ImageView imageView2 = (ImageView) frameLayout.getChildAt(2);
            this.C[i11] = imageView;
            imageView.setSoundEffectsEnabled(false);
            this.B[i11] = imageView2;
            lq.c.b(frameLayout, gradientDrawable);
        }
        this.f20796x = -1;
        z(-1);
        return inflate;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void q() {
        super.q();
        for (ImageView imageView : this.C) {
            imageView.setImageDrawable(null);
        }
        j(false);
        this.f20791s.setText("");
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void r() {
        A();
        super.r();
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void w() {
        IAudioPlayer iAudioPlayer = this.f20750k;
        TopicRecord topicRecord = this.f20748i;
        if (ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, topicRecord.wordAudio)) {
            this.f20750k.f(new a());
            return;
        }
        IAudioPlayer iAudioPlayer2 = this.f20750k;
        TopicRecord topicRecord2 = this.f20748i;
        ZPackUtils.loadAudioCompat(iAudioPlayer2, topicRecord2, topicRecord2.sentenceAudio);
    }

    public PatternSenToPicFragment(Context context, AttributeSet attrs, int defStyle, int category) {
        super(context, attrs, defStyle, category);
        this.f20796x = -1;
        this.f20797y = new ArrayList(3);
        this.B = new ImageView[4];
        this.C = new ImageView[4];
        p(LayoutInflater.from(context), this);
    }
}
