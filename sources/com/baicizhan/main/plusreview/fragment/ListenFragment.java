package com.baicizhan.main.plusreview.fragment;

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
import com.baicizhan.main.fragment.PatternBaseFragment;
import com.jiongji.andriod.card.R;
import gi.f0;
import gi.l0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class ListenFragment extends PatternBaseFragment implements View.OnClickListener {
    public static final String D = "ListenFragment";
    public ImageView[] A;
    public int B;
    public boolean C;

    /* renamed from: s, reason: collision with root package name */
    public ViewSwitcher f24682s;

    /* renamed from: t, reason: collision with root package name */
    public ImageView f24683t;

    /* renamed from: u, reason: collision with root package name */
    public l0 f24684u;

    /* renamed from: v, reason: collision with root package name */
    public ImageView f24685v;

    /* renamed from: w, reason: collision with root package name */
    public com.baicizhan.client.framework.audio.a f24686w;

    /* renamed from: x, reason: collision with root package name */
    public com.baicizhan.client.framework.audio.a f24687x;

    /* renamed from: y, reason: collision with root package name */
    public l0 f24688y;

    /* renamed from: z, reason: collision with root package name */
    public ViewGroup[] f24689z;

    public ListenFragment(Context context, int category) {
        this(context, null, 0, category);
    }

    private void y(int level) {
        l0 l0Var;
        if (level == 0) {
            l0 l0Var2 = this.f24684u;
            if (l0Var2 != null) {
                l0Var2.b();
            }
        } else if (level > 0 && (l0Var = this.f24688y) != null) {
            l0Var.b();
        }
        if (level < 0) {
            this.f24682s.setDisplayedChild(0);
        } else {
            this.f24682s.setDisplayedChild(level);
        }
    }

    private void z() {
        if (this.f24682s.getDisplayedChild() != 0) {
            this.f24682s.reset();
        }
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void j(boolean retain) {
        int i11 = 0;
        while (true) {
            ImageView[] imageViewArr = this.A;
            if (i11 >= imageViewArr.length) {
                return;
            }
            if (imageViewArr[i11].getVisibility() != 0 || !retain) {
                this.A[i11].setVisibility(8);
                this.f24689z[i11].setOnClickListener(this);
                this.f24689z[i11].setBackgroundResource(R.drawable.button_study_word_option);
            }
            i11++;
        }
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public boolean k() {
        int i11 = this.B + 1;
        this.B = i11;
        if (i11 < this.f24682s.getChildCount()) {
            y(this.B);
            return true;
        }
        this.B = 0;
        y(-1);
        return false;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void o(Activity activity) {
        super.o(activity);
        this.f24686w = new com.baicizhan.client.framework.audio.a(activity);
        this.f24687x = new com.baicizhan.client.framework.audio.a(activity);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        this.A[intValue].setVisibility(0);
        for (ViewGroup viewGroup : this.f24689z) {
            viewGroup.setOnClickListener(null);
        }
        this.f24689z[intValue].setBackgroundResource(l(this.f20749j.get(intValue).topicId) ? R.drawable.button_study_word_option_right : R.drawable.button_study_word_option_wrong);
        e(this.f20749j.get(intValue).topicId);
        this.C = true;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public View p(LayoutInflater inflater, ViewGroup container) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.plusreview_fragment_listen_portrait, container, true);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.option_container);
        for (int i11 = 0; i11 < 4; i11++) {
            this.f24689z[i11] = (ViewGroup) viewGroup2.getChildAt(i11);
            ViewGroup[] viewGroupArr = this.f24689z;
            viewGroupArr[i11] = (ViewGroup) viewGroupArr[i11].getChildAt(0);
            this.f24689z[i11].setTag(Integer.valueOf(i11));
            this.A[i11] = (ImageView) this.f24689z[i11].getChildAt(1);
        }
        this.f24682s = (ViewSwitcher) viewGroup.findViewById(R.id.hint_switcher);
        this.f24683t = (ImageView) viewGroup.findViewById(R.id.plusreview_listen_word);
        ThemeResUtil.setSpeakWordBg(getContext(), this.f24683t);
        this.f24685v = (ImageView) viewGroup.findViewById(R.id.plusreview_listen_example);
        ThemeResUtil.setSpeakSeBg(getContext(), this.f24685v);
        return viewGroup;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void q() {
        super.q();
        z();
        this.B = 0;
        com.baicizhan.client.framework.audio.a aVar = this.f24686w;
        if (aVar != null) {
            aVar.destroy();
        }
        com.baicizhan.client.framework.audio.a aVar2 = this.f24687x;
        if (aVar2 != null) {
            aVar2.destroy();
        }
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void r() {
        this.C = false;
        int i11 = 0;
        while (i11 < 4) {
            this.f24689z[i11].setOnClickListener(this);
            this.f24689z[i11].setBackgroundResource(R.drawable.button_study_word_option);
            this.f24689z[i11].setContentDescription(String.valueOf(i11 == this.f20747h));
            TopicRecord topicRecord = this.f20749j.get(i11);
            int i12 = topicRecord.topicId;
            ((TextView) this.f24689z[i11].getChildAt(0)).setText(TextUtils.isEmpty(topicRecord.wordMean) ? "" : topicRecord.wordMean.trim());
            if (l(i12)) {
                f0.e(this.A[i11], R.drawable.ic_result_mid_right);
            } else {
                f0.e(this.A[i11], R.drawable.ic_result_mid_wrong);
            }
            this.A[i11].setVisibility(8);
            i11++;
        }
        com.baicizhan.client.framework.audio.a aVar = this.f24686w;
        TopicRecord topicRecord2 = this.f20748i;
        this.f24684u = new l0(aVar, topicRecord2, topicRecord2.wordAudio, this.f24683t);
        com.baicizhan.client.framework.audio.a aVar2 = this.f24687x;
        TopicRecord topicRecord3 = this.f20748i;
        this.f24688y = new l0(aVar2, topicRecord3, topicRecord3.sentenceAudio, this.f24685v);
        g();
        super.r();
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void w() {
        if (this.B == 0) {
            this.f24684u.b();
        } else {
            this.f24688y.b();
        }
    }

    public ListenFragment(Context context, AttributeSet attrs, int defStyle, int category) {
        super(context, attrs, defStyle, category);
        this.f24689z = new ViewGroup[4];
        this.A = new ImageView[4];
        this.B = 0;
        this.C = false;
        p(LayoutInflater.from(context), this);
    }
}
