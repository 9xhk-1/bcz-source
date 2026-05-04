package com.baicizhan.main.fragment;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.models.WordClozeRecord;
import com.baicizhan.client.business.debug.DebugConfig;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.customview.ClozeTextView;
import com.baicizhan.main.customview.ClozeTraditionHintView;
import com.baicizhan.main.customview.DialView;
import com.baicizhan.main.customview.HighlightTextView;
import com.bumptech.glide.load.engine.GlideException;
import com.jiongji.andriod.card.R;
import com.xiaomi.mipush.sdk.Constants;
import f9.a;
import gi.m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import q9.x;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class PatternClozeFragment extends PatternBaseFragment implements DialView.b {
    public static String F = "PatternClozeFragment";
    public View A;
    public View B;
    public TextView C;
    public int D;
    public boolean E;

    /* renamed from: s, reason: collision with root package name */
    public ClozeTextView f20763s;

    /* renamed from: t, reason: collision with root package name */
    public FrameLayout f20764t;

    /* renamed from: u, reason: collision with root package name */
    public DialView f20765u;

    /* renamed from: v, reason: collision with root package name */
    public TextView f20766v;

    /* renamed from: w, reason: collision with root package name */
    public HighlightTextView f20767w;

    /* renamed from: x, reason: collision with root package name */
    public HighlightTextView f20768x;

    /* renamed from: y, reason: collision with root package name */
    public HighlightTextView f20769y;

    /* renamed from: z, reason: collision with root package name */
    public ClozeTraditionHintView f20770z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            c.b(PatternClozeFragment.F, "click ClozeTextView", new Object[0]);
            CharSequence k11 = ((ClozeTextView) v11).k();
            c.b(PatternClozeFragment.F, "clear opt=" + ((Object) k11), new Object[0]);
            if (k11 != null) {
                PatternClozeFragment.this.f20765u.c(k11);
            }
        }
    }

    public PatternClozeFragment(Context context, int category) {
        super(context, category);
        this.E = false;
        p(LayoutInflater.from(context), this);
    }

    private void A() {
        View view;
        this.f20764t.removeAllViews();
        this.C.setVisibility(8);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), R.anim.business_push_up_in);
        int i11 = this.D;
        if (i11 != 1) {
            if (i11 == 2) {
                this.f20764t.addView(this.f20766v);
                w();
            } else if (i11 == 3) {
                if (this.f20748i.clozeData.options.size() == 1) {
                    FrameLayout frameLayout = this.f20764t;
                    view = this.f20768x;
                    frameLayout.addView(view);
                } else {
                    FrameLayout frameLayout2 = this.f20764t;
                    view = this.B;
                    frameLayout2.addView(view);
                }
            }
            view = null;
        } else {
            FrameLayout frameLayout3 = this.f20764t;
            view = this.A;
            frameLayout3.addView(view);
            w();
        }
        if (view != null) {
            view.startAnimation(loadAnimation);
        }
    }

    @Override // com.baicizhan.main.customview.DialView.b
    public void a(int row, int col) {
        if (this.f20765u.f(row, col)) {
            this.f20765u.b(row, col);
            this.f20763s.j(this.f20765u.d(row, col));
            return;
        }
        this.f20765u.e(row, col);
        this.f20763s.l(this.f20765u.d(row, col));
        if (this.f20763s.getHighlightText().toString().contains("__")) {
            return;
        }
        this.f20765u.setClickable(false);
        this.E = true;
        if (this.f20763s.getAnswer().equals(this.f20748i.clozeData.cloze.replaceAll("[\\[\\]]|-", ""))) {
            this.f20746g.x(this.f20748i.topicId);
            t(this.f20748i.topicId);
        } else {
            this.f20746g.x(this.f20748i.topicId + 1);
            t(-1);
        }
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void j(boolean retain) {
        this.f20763s.i();
        this.f20765u.a();
        this.f20765u.setClickable(true);
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public boolean k() {
        int i11 = this.D;
        if (i11 >= 3) {
            return false;
        }
        this.D = i11 + 1;
        this.f20764t.setVisibility(0);
        if (this.D == 3) {
            int size = this.f20748i.clozeData.tips.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                i12 += this.f20748i.clozeData.tips.get(i13).size();
            }
            if (i12 == 0) {
                return false;
            }
        }
        A();
        return true;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public View p(LayoutInflater inflater, ViewGroup container) {
        View inflate = inflater.inflate(R.layout.pattern_cloze_portrait, container, true);
        this.B = inflate.findViewById(R.id.double_hint);
        this.f20763s = (ClozeTextView) inflate.findViewById(R.id.cloze_text);
        this.f20764t = (FrameLayout) inflate.findViewById(R.id.hint_placeholder);
        this.f20765u = (DialView) inflate.findViewById(R.id.dial_view);
        this.f20767w = (HighlightTextView) inflate.findViewById(R.id.left_hint);
        this.f20768x = (HighlightTextView) inflate.findViewById(R.id.media_hint);
        this.f20769y = (HighlightTextView) inflate.findViewById(R.id.right_hint);
        this.f20766v = (TextView) inflate.findViewById(R.id.phonetic_hint);
        this.f20770z = (ClozeTraditionHintView) inflate.findViewById(R.id.trandition_hint);
        this.A = inflate.findViewById(R.id.trandition_hint_container);
        this.C = (TextView) inflate.findViewById(R.id.cnmean);
        this.f20765u.setDelegate(this);
        this.f20763s.setOnClickListener(new a());
        return inflate;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void q() {
        super.q();
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void r() {
        super.r();
        this.E = false;
        TopicRecord topicRecord = this.f20748i;
        if (topicRecord != null && topicRecord.clozeData == null) {
            WordClozeRecord wordClozeRecord = x.r().I().get(Integer.valueOf(this.f20748i.topicId));
            if (wordClozeRecord != null) {
                this.f20748i.clozeData = wordClozeRecord.getFormatClozeData();
                if (this.f20748i.clozeData == null || TextUtils.isEmpty(wordClozeRecord.getClozeData())) {
                    c.d("", "local cached cloze data is null, option [%s], cloze record [%s]", this.f20748i.toString(), wordClozeRecord.toString());
                }
            } else {
                c.d("", "local cached word cloze record is null, topic id [%d]", Integer.valueOf(this.f20748i.topicId));
            }
        }
        this.D = 0;
        this.f20764t.setVisibility(8);
        this.f20764t.removeAllViews();
        this.C.setVisibility(0);
        this.f20765u.setClickable(true);
        this.f20765u.a();
        c.b(F, "clozeData = " + this.f20748i.clozeData, new Object[0]);
        c.b(F, "cloze = " + this.f20748i.clozeData.cloze, new Object[0]);
        this.f20763s.setProblem(this.f20748i.clozeData.cloze);
        this.f20763s.setContentDescription(this.f20748i.clozeData.cloze);
        this.C.setText(this.f20748i.wordMean.replace(GlideException.a.f28776d, "\n"));
        this.f20766v.setText(this.f20748i.phonetic);
        z();
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer();
        c.b(F, "tips[0] = " + this.f20748i.clozeData.tips.get(0).toString(), new Object[0]);
        if (this.f20748i.clozeData.options.size() == 1) {
            Iterator<String> it = this.f20748i.clozeData.tips.get(0).iterator();
            while (it.hasNext()) {
                stringBuffer2.append(it.next());
                stringBuffer2.append('\n');
            }
        } else {
            c.b(F, "tips[1] = " + this.f20748i.clozeData.tips.get(1).toString(), new Object[0]);
            Iterator<String> it2 = this.f20748i.clozeData.tips.get(0).iterator();
            while (it2.hasNext()) {
                stringBuffer.append(it2.next());
                stringBuffer.append('\n');
            }
            Iterator<String> it3 = this.f20748i.clozeData.tips.get(1).iterator();
            while (it3.hasNext()) {
                stringBuffer3.append(it3.next());
                stringBuffer3.append('\n');
            }
        }
        this.f20767w.setHighlightText(stringBuffer.toString().replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, ""));
        this.f20768x.setHighlightText(stringBuffer2.toString().replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, ""));
        this.f20769y.setHighlightText(stringBuffer3.toString().replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, ""));
        TopicRecord topicRecord2 = this.f20748i;
        String str = topicRecord2.sentence;
        String str2 = str;
        for (a.b bVar : f9.a.h(str, topicRecord2.word, null)) {
            str2 = str2.replaceAll(str.substring(bVar.f51340a, bVar.f51341b), "____");
        }
        m0.s(this.f20770z.getHintView(), str2);
        TopicRecord topicRecord3 = this.f20748i;
        ZPackUtils.loadImageCompat(topicRecord3, topicRecord3.imagePath).o(this.f20770z.getImageView());
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void w() {
        IAudioPlayer iAudioPlayer = this.f20750k;
        TopicRecord topicRecord = this.f20748i;
        ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, this.D != 1 ? topicRecord.wordAudio : topicRecord.sentenceAudio);
    }

    public final void z() {
        LinkedList linkedList = new LinkedList();
        Matcher matcher = Pattern.compile("\\[[^\\]]*\\]").matcher(this.f20748i.clozeData.cloze);
        while (matcher.find()) {
            linkedList.add(matcher.group(0).substring(1, matcher.group(0).length() - 1));
        }
        c.b(F, "rightOpt = " + linkedList.toString(), new Object[0]);
        LinkedList linkedList2 = new LinkedList();
        Iterator<String> it = this.f20748i.clozeData.options.iterator();
        while (it.hasNext()) {
            linkedList2.addAll(Arrays.asList(it.next().split("\\|")));
        }
        c.b(F, "candidates = " + linkedList2.toString(), new Object[0]);
        ArrayList arrayList = new ArrayList(new HashSet(linkedList2));
        Collections.shuffle(arrayList);
        linkedList.addAll(arrayList.subList(0, Math.min(9 - linkedList.size(), arrayList.size())));
        if (!DebugConfig.getsIntance().enable || !DebugConfig.getsIntance().fixOptionPosition) {
            Collections.shuffle(linkedList);
        }
        c.b(F, "fianalOptions = " + linkedList.toString(), new Object[0]);
        this.f20765u.setText((String[]) linkedList.toArray(new String[0]));
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void x() {
    }
}
