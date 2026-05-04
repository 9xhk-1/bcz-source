package com.baicizhan.main.fragment;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.jiongji.andriod.card.R;
import gi.f0;
import gi.l0;
import q9.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ExtendedListenFragment extends PatternBaseFragment implements View.OnClickListener {
    public static final String C = "ExtendedListenFragment";
    public int A;
    public boolean B;

    /* renamed from: s, reason: collision with root package name */
    public ViewSwitcher f20726s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f20727t;

    /* renamed from: u, reason: collision with root package name */
    public l0 f20728u;

    /* renamed from: v, reason: collision with root package name */
    public ImageView f20729v;

    /* renamed from: w, reason: collision with root package name */
    public IAudioPlayer f20730w;

    /* renamed from: x, reason: collision with root package name */
    public l0 f20731x;

    /* renamed from: y, reason: collision with root package name */
    public ViewGroup[] f20732y;

    /* renamed from: z, reason: collision with root package name */
    public ImageView[] f20733z;

    public ExtendedListenFragment(Context context, int category) {
        this(context, null, 0, category);
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void j(boolean retain) {
        int i11 = 0;
        while (true) {
            ImageView[] imageViewArr = this.f20733z;
            if (i11 >= imageViewArr.length) {
                return;
            }
            if (imageViewArr[i11].getVisibility() != 0 || !retain) {
                this.f20733z[i11].setVisibility(8);
                this.f20732y[i11].setOnClickListener(this);
                this.f20732y[i11].setBackgroundResource(R.drawable.button_study_word_option);
            }
            i11++;
        }
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public boolean k() {
        int i11 = this.A + 1;
        this.A = i11;
        if (i11 < this.f20726s.getChildCount()) {
            y(this.A);
            return true;
        }
        this.A = 0;
        y(-1);
        return false;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void o(Activity activity) {
        super.o(activity);
        this.f20730w = new l(activity);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        this.f20733z[intValue].setVisibility(0);
        for (ViewGroup viewGroup : this.f20732y) {
            viewGroup.setOnClickListener(null);
        }
        this.f20732y[intValue].setBackgroundResource(l(this.f20749j.get(intValue).topicId) ? R.drawable.button_study_word_option_right : R.drawable.button_study_word_option_wrong);
        e(this.f20749j.get(intValue).topicId);
        this.B = true;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public View p(LayoutInflater inflater, ViewGroup container) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.plusreview_fragment_listen_portrait, container, true);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.option_container);
        for (int i11 = 0; i11 < 4; i11++) {
            this.f20732y[i11] = (ViewGroup) viewGroup2.getChildAt(i11);
            ViewGroup[] viewGroupArr = this.f20732y;
            viewGroupArr[i11] = (ViewGroup) viewGroupArr[i11].getChildAt(0);
            this.f20732y[i11].setTag(Integer.valueOf(i11));
            this.f20733z[i11] = (ImageView) this.f20732y[i11].getChildAt(1);
        }
        this.f20726s = (ViewSwitcher) viewGroup.findViewById(R.id.hint_switcher);
        this.f20727t = (ImageView) viewGroup.findViewById(R.id.plusreview_listen_word);
        ThemeResUtil.setSpeakWordBg(getContext(), this.f20727t);
        this.f20729v = (ImageView) viewGroup.findViewById(R.id.plusreview_listen_example);
        ThemeResUtil.setSpeakSeBg(getContext(), this.f20729v);
        return viewGroup;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void q() {
        super.q();
        z();
        this.A = 0;
        IAudioPlayer iAudioPlayer = this.f20730w;
        if (iAudioPlayer != null) {
            iAudioPlayer.destroy();
        }
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void r() {
        super.r();
        this.B = false;
        for (int i11 = 0; i11 < 4; i11++) {
            this.f20732y[i11].setOnClickListener(this);
            this.f20732y[i11].setBackgroundResource(R.drawable.button_study_word_option);
            TopicRecord topicRecord = this.f20749j.get(i11);
            int i12 = topicRecord.topicId;
            ((TextView) this.f20732y[i11].getChildAt(0)).setText(TextUtils.isEmpty(topicRecord.wordMean) ? "" : topicRecord.wordMean.trim());
            if (l(i12)) {
                f0.e(this.f20733z[i11], R.drawable.ic_result_mid_right);
            } else {
                f0.e(this.f20733z[i11], R.drawable.ic_result_mid_wrong);
            }
            this.f20733z[i11].setVisibility(8);
        }
        IAudioPlayer iAudioPlayer = this.f20730w;
        TopicRecord topicRecord2 = this.f20748i;
        this.f20728u = new l0(iAudioPlayer, topicRecord2, topicRecord2.wordAudio, this.f20727t);
        IAudioPlayer iAudioPlayer2 = this.f20730w;
        TopicRecord topicRecord3 = this.f20748i;
        this.f20731x = new l0(iAudioPlayer2, topicRecord3, topicRecord3.sentenceAudio, this.f20729v);
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void w() {
        if (this.A == 0) {
            this.f20728u.b();
        } else {
            this.f20731x.b();
        }
    }

    public final void y(int level) {
        if (level == 0) {
            this.f20728u.b();
        } else if (level > 0) {
            this.f20731x.b();
        }
        if (level < 0) {
            this.f20726s.setDisplayedChild(0);
        } else {
            this.f20726s.setDisplayedChild(level);
        }
    }

    public final void z() {
        if (this.f20726s.getDisplayedChild() != 0) {
            this.f20726s.setDisplayedChild(0);
        }
    }

    public ExtendedListenFragment(Context context, AttributeSet attrs, int defStyle, int category) {
        super(context, attrs, defStyle, category);
        this.f20732y = new ViewGroup[4];
        this.f20733z = new ImageView[4];
        this.A = 0;
        this.B = false;
        p(LayoutInflater.from(context), this);
    }
}
