package com.baicizhan.main.plusreview.fragment;

import android.content.Context;
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
import com.baicizhan.main.fragment.PatternBaseFragment;
import com.bumptech.glide.load.engine.GlideException;
import com.jiongji.andriod.card.R;
import gi.f0;
import gi.m0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class MeanToWordFragment extends PatternBaseFragment implements View.OnClickListener {
    public static final String C = "MeanToWordFragment";
    public View[] A;
    public boolean B;

    /* renamed from: s, reason: collision with root package name */
    public TextView f24690s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f24691t;

    /* renamed from: u, reason: collision with root package name */
    public TextView f24692u;

    /* renamed from: v, reason: collision with root package name */
    public int f24693v;

    /* renamed from: w, reason: collision with root package name */
    public List<Integer> f24694w;

    /* renamed from: x, reason: collision with root package name */
    public ViewAnimator f24695x;

    /* renamed from: y, reason: collision with root package name */
    public TextView[] f24696y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView[] f24697z;

    public MeanToWordFragment(Context context, int category) {
        this(context, null, 0, category);
    }

    private void y(int level) {
        if (level == -1) {
            this.f24695x.setVisibility(8);
            return;
        }
        this.f24695x.setVisibility(0);
        this.f24695x.setDisplayedChild(this.f24694w.get(level).intValue());
        if (this.f24695x.getCurrentView().getId() == R.id.topic_sentence_hint) {
            IAudioPlayer iAudioPlayer = this.f20750k;
            TopicRecord topicRecord = this.f20748i;
            ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, topicRecord.sentenceAudio);
        }
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void j(boolean retain) {
        for (int i11 = 0; i11 < 4; i11++) {
            if (this.f24697z[i11].getVisibility() != 0 || !retain) {
                this.f24697z[i11].setVisibility(4);
                this.A[i11].setOnClickListener(this);
                this.A[i11].setBackgroundResource(R.drawable.button_study_word_option);
            }
        }
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public boolean k() {
        if (this.f24693v == this.f24694w.size() - 1) {
            return false;
        }
        int i11 = this.f24693v + 1;
        this.f24693v = i11;
        y(i11);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int intValue = ((Integer) v11.getTag()).intValue();
        int i11 = this.f20749j.get(intValue).topicId;
        this.f24697z[intValue].setVisibility(0);
        this.A[intValue].setBackgroundResource(l(i11) ? R.drawable.button_study_word_option_right : R.drawable.button_study_word_option_wrong);
        for (View view : this.A) {
            view.setOnClickListener(null);
        }
        e(i11);
        this.B = true;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public View p(LayoutInflater inflater, ViewGroup container) {
        View inflate = inflater.inflate(R.layout.plusreview_fragment_mean_to_word_portrait, container, true);
        this.f24690s = (TextView) inflate.findViewById(R.id.topic_word_mean_cn);
        this.f24695x = (ViewAnimator) inflate.findViewById(R.id.hint_switcher);
        this.f24691t = (ImageView) inflate.findViewById(R.id.topic_image);
        this.f24692u = (TextView) inflate.findViewById(R.id.topic_sentence);
        ViewGroup viewGroup = (ViewGroup) inflate.findViewById(R.id.option_container);
        this.f24695x.setInAnimation(getContext(), R.anim.business_push_up_in);
        for (int i11 = 0; i11 < 4; i11++) {
            ViewGroup viewGroup2 = (ViewGroup) ((ViewGroup) viewGroup.getChildAt(i11)).getChildAt(0);
            TextView textView = (TextView) viewGroup2.getChildAt(0);
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            ImageView imageView = (ImageView) viewGroup2.getChildAt(1);
            this.A[i11] = viewGroup2;
            viewGroup2.setSoundEffectsEnabled(false);
            this.f24696y[i11] = textView;
            this.f24697z[i11] = imageView;
            viewGroup2.setTag(Integer.valueOf(i11));
        }
        return inflate;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void q() {
        super.q();
        this.f24691t.setImageDrawable(null);
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void r() {
        this.f24690s.setText(this.f20748i.wordMean.replace(GlideException.a.f28776d, "\n"));
        this.f24694w.clear();
        if (TextUtils.isEmpty(this.f20748i.sentence)) {
            this.f24692u.setText("");
        } else {
            int indexOf = this.f20748i.sentence.toLowerCase().indexOf(this.f20748i.word);
            if (indexOf >= 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) this.f20748i.sentence, 0, indexOf);
                sb2.append("______");
                TopicRecord topicRecord = this.f20748i;
                sb2.append((CharSequence) topicRecord.sentence, indexOf + topicRecord.word.length(), this.f20748i.sentence.length());
                this.f24692u.setText(sb2);
            } else {
                this.f24692u.setText(this.f20748i.sentence);
            }
            m0.p(this.f24692u, this.f20748i);
        }
        this.f24691t.setImageDrawable(null);
        TopicRecord topicRecord2 = this.f20748i;
        ZPackUtils.loadImageCompat(topicRecord2, topicRecord2.imagePath).f(R.drawable.image_broke_normal_default).o(this.f24691t);
        this.f24694w.add(0);
        int i11 = 0;
        while (i11 < 4) {
            TopicRecord topicRecord3 = this.f20749j.get(i11);
            this.A[i11].setOnClickListener(this);
            this.A[i11].setBackgroundResource(R.drawable.button_study_word_option);
            this.A[i11].setContentDescription(String.valueOf(i11 == this.f20747h));
            this.f24696y[i11].setText(topicRecord3.word);
            this.f24697z[i11].setVisibility(4);
            f0.e(this.f24697z[i11], l(topicRecord3.topicId) ? R.drawable.ic_result_mid_right : R.drawable.ic_result_mid_wrong);
            i11++;
        }
        this.f24693v = -1;
        y(-1);
        super.r();
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void w() {
        IAudioPlayer iAudioPlayer = this.f20750k;
        TopicRecord topicRecord = this.f20748i;
        ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, topicRecord.wordAudio);
    }

    public MeanToWordFragment(Context context, AttributeSet attrs, int defStyle, int category) {
        super(context, attrs, defStyle, category);
        this.f24693v = -1;
        this.f24694w = new ArrayList(3);
        this.f24696y = new TextView[4];
        this.f24697z = new ImageView[4];
        this.A = new View[4];
        this.B = false;
        p(LayoutInflater.from(context), this);
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void x() {
    }
}
