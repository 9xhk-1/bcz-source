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
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewAnimator;
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
public class PatternSenToChinFragment extends PatternBaseFragment implements View.OnClickListener {
    public View A;
    public ImageView[] B;
    public View[] C;
    public TextView[] D;

    /* renamed from: s, reason: collision with root package name */
    public TextView f20781s;

    /* renamed from: t, reason: collision with root package name */
    public TextView f20782t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f20783u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f20784v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f20785w;

    /* renamed from: x, reason: collision with root package name */
    public int f20786x;

    /* renamed from: y, reason: collision with root package name */
    public List<Integer> f20787y;

    /* renamed from: z, reason: collision with root package name */
    public ViewAnimator f20788z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements IAudioPlayer.b {
        public a() {
        }

        @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
        public void onPlayStateChanged(IAudioPlayer.State state) {
            if (state == IAudioPlayer.State.Completed) {
                PatternSenToChinFragment.this.f20750k.f(null);
                PatternSenToChinFragment patternSenToChinFragment = PatternSenToChinFragment.this;
                IAudioPlayer iAudioPlayer = patternSenToChinFragment.f20750k;
                TopicRecord topicRecord = patternSenToChinFragment.f20748i;
                ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, topicRecord.sentenceAudio);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements m0.g {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<PatternSenToChinFragment> f20790a;

        public b(PatternSenToChinFragment fragment) {
            this.f20790a = new WeakReference<>(fragment);
        }

        @Override // gi.m0.g
        public void a(String word, m0.e config) {
            PatternSenToChinFragment patternSenToChinFragment = this.f20790a.get();
            if (patternSenToChinFragment == null) {
                return;
            }
            IAudioPlayer iAudioPlayer = patternSenToChinFragment.f20750k;
            TopicRecord topicRecord = patternSenToChinFragment.f20748i;
            ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, topicRecord.wordAudio);
            CharSequence text = patternSenToChinFragment.f20781s.getText();
            if (text instanceof SpannableString) {
                for (p pVar : (p[]) ((SpannableString) text).getSpans(0, text.length(), p.class)) {
                    pVar.setPressed(false);
                }
                patternSenToChinFragment.f20781s.invalidate();
            }
        }
    }

    public PatternSenToChinFragment(Context context, int category) {
        this(context, null, 0, category);
    }

    private void z(int level) {
        if (level == -1) {
            this.A.setVisibility(8);
            this.f20788z.setVisibility(8);
            return;
        }
        int intValue = this.f20787y.get(level).intValue();
        this.f20788z.setVisibility(0);
        this.A.setVisibility(0);
        this.f20788z.setDisplayedChild(intValue);
        IAudioPlayer iAudioPlayer = this.f20750k;
        TopicRecord topicRecord = this.f20748i;
        ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, topicRecord.wordAudio);
    }

    public final void A() {
        m0.j.m(B(this.f20748i.sentence, this.f20781s)).e(getResources().getColor(R.color.main_blue)).h(getContext().getResources().getDimensionPixelSize(R.dimen.T6)).f(this.f20748i.word).g(this.f20748i.sentencePhrase, pb.a.a().getResources().getColor(R.color.main_color_weak_divider)).c().l().k(new b(this)).d().i(this.f20781s);
        this.f20781s.setVisibility(0);
        this.f20787y.clear();
        if (!TextUtils.isEmpty(this.f20748i.sentenceTrans)) {
            this.f20782t.setText(this.f20748i.sentenceTrans);
            this.f20787y.add(0);
        }
        if (!TextUtils.isEmpty(this.f20748i.wordMeanEn)) {
            m0.w(this.f20783u, this.f20748i);
            this.f20787y.add(1);
        }
        if (!TextUtils.isEmpty(this.f20748i.wordMean)) {
            m0.v(this.f20784v, this.f20748i);
            this.f20787y.add(2);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            TopicRecord topicRecord = this.f20749j.get(i11);
            this.C[i11].setOnClickListener(this);
            this.D[i11].setText(topicRecord.wordMean);
            this.B[i11].setVisibility(4);
            f0.e(this.B[i11], l(topicRecord.topicId) ? R.drawable.ic_result_mid_right : R.drawable.ic_result_mid_wrong);
            this.C[i11].setBackgroundResource(R.drawable.button_study_word_option);
        }
        this.f20786x = -1;
        z(-1);
        super.r();
    }

    public final String B(String text, TextView textView) {
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
                this.C[i11].setBackgroundResource(R.drawable.button_study_word_option);
            }
        }
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public boolean k() {
        if (this.f20786x == this.f20787y.size() - 1) {
            return false;
        }
        int i11 = this.f20786x + 1;
        this.f20786x = i11;
        z(i11);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int intValue = ((Integer) v11.getTag()).intValue();
        int i11 = this.f20749j.get(intValue).topicId;
        this.B[intValue].setVisibility(0);
        this.C[intValue].setBackgroundResource(l(i11) ? R.drawable.button_study_word_option_right : R.drawable.button_study_word_option_wrong);
        for (View view : this.C) {
            view.setOnClickListener(null);
        }
        e(i11);
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public View p(LayoutInflater inflater, ViewGroup container) {
        View inflate = inflater.inflate(R.layout.fragment_learning_example_pattern_sen_to_chin_portrait, container, true);
        this.f20781s = (TextView) inflate.findViewById(R.id.topic_sentence);
        this.f20788z = (ViewAnimator) inflate.findViewById(R.id.hint_switcher);
        this.f20782t = (TextView) inflate.findViewById(R.id.topic_sentence_translate);
        this.f20783u = (TextView) inflate.findViewById(R.id.topic_mean_en);
        this.f20784v = (TextView) inflate.findViewById(R.id.topic_mean_cn);
        this.f20785w = (TextView) inflate.findViewById(R.id.sentence_test_frequency);
        this.A = inflate.findViewById(R.id.divider_mid);
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.options);
        this.f20788z.setInAnimation(getContext(), R.anim.business_push_up_in);
        int a11 = i.a(getContext(), 8.0f);
        int color = getResources().getColor(R.color.study_select_button_bg);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(a11);
        gradientDrawable.setColor(color);
        for (int i11 = 0; i11 < 4; i11++) {
            ViewGroup viewGroup2 = (ViewGroup) ((ViewGroup) viewGroup.getChildAt(i11)).getChildAt(0);
            TextView textView = (TextView) viewGroup2.getChildAt(0);
            ImageView imageView = (ImageView) viewGroup2.getChildAt(1);
            this.C[i11] = viewGroup2;
            viewGroup2.setSoundEffectsEnabled(false);
            this.D[i11] = textView;
            this.B[i11] = imageView;
            viewGroup2.setTag(Integer.valueOf(i11));
        }
        this.f20786x = -1;
        z(-1);
        return inflate;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void q() {
        super.q();
        j(false);
        this.f20781s.setText("");
        this.f20783u.setText("");
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void r() {
        A();
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

    public PatternSenToChinFragment(Context context, AttributeSet attrs, int defStyle, int category) {
        super(context, attrs, defStyle, category);
        this.f20786x = -1;
        this.f20787y = new ArrayList(3);
        this.B = new ImageView[4];
        this.C = new View[4];
        this.D = new TextView[4];
        p(LayoutInflater.from(context), this);
    }
}
