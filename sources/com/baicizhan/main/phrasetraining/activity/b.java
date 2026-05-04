package com.baicizhan.main.phrasetraining.activity;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.client.business.util.ThemeUtil;
import com.baicizhan.main.phrasetraining.activity.a;
import com.jiongji.andriod.card.R;
import gi.l0;
import java.io.File;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends a implements View.OnClickListener {

    /* renamed from: g, reason: collision with root package name */
    public ImageView f24488g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f24489h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f24490i;

    /* renamed from: j, reason: collision with root package name */
    public ImageView f24491j;

    /* renamed from: k, reason: collision with root package name */
    public l0 f24492k;

    public static b y() {
        return new b();
    }

    public final void A(ViewGroup rootView, PhraseTrainingActivity parent) {
        String reformSuffix = PathUtil.reformSuffix(PathUtil.BCZ_HOME + parent.f24468i.getGroupedOptions(), ".jpg");
        String reformSuffix2 = PathUtil.reformSuffix(PathUtil.BCZ_HOME + parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getWordImage(), ".jpg");
        this.f24488g = (ImageView) rootView.findViewById(R.id.phrase_training_img_0);
        ThemeResUtil.setCardBg(getActivity(), this.f24488g);
        this.f24488g.setOnClickListener(this);
        this.f24489h = (ImageView) rootView.findViewById(R.id.phrase_training_img_1);
        ThemeResUtil.setCardBg(getActivity(), this.f24489h);
        this.f24489h.setOnClickListener(this);
        this.f24490i = (ImageView) rootView.findViewById(R.id.phrase_training_tag_0);
        this.f24491j = (ImageView) rootView.findViewById(R.id.phrase_training_tag_1);
        if (((int) Math.round(Math.random())) == 0) {
            this.f24488g.setTag(Boolean.TRUE);
            hc.c.k(new File(reformSuffix2)).h().o(this.f24488g);
            this.f24490i.setImageResource(R.drawable.right_big_normal_default);
            this.f24489h.setTag(Boolean.FALSE);
            hc.c.k(new File(reformSuffix)).h().o(this.f24489h);
            this.f24491j.setImageResource(R.drawable.wrong_big_normal_default);
            return;
        }
        this.f24488g.setTag(Boolean.FALSE);
        hc.c.k(new File(reformSuffix)).h().o(this.f24488g);
        this.f24490i.setImageResource(R.drawable.wrong_big_normal_default);
        this.f24489h.setTag(Boolean.TRUE);
        hc.c.k(new File(reformSuffix2)).h().o(this.f24489h);
        this.f24491j.setImageResource(R.drawable.right_big_normal_default);
    }

    public final void B(ViewGroup rootView, final PhraseTrainingActivity parent) {
        View findViewById = rootView.findViewById(R.id.phrase_training_sound_frame);
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.phrase_training_sound);
        ThemeResUtil.setSoundBg(getActivity(), imageView);
        l0 l0Var = new l0(parent.f24469j, parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getSentenceAudio(), findViewById, imageView);
        this.f24492k = l0Var;
        l0Var.b();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean booleanValue = ((Boolean) view.getTag()).booleanValue();
        a.b bVar = this.f24485c;
        if (bVar != null) {
            bVar.i(booleanValue);
        }
        ImageView imageView = this.f24488g;
        ImageView imageView2 = view == imageView ? this.f24490i : view == this.f24489h ? this.f24491j : null;
        if (imageView2 == null) {
            return;
        }
        imageView.setOnClickListener(null);
        this.f24489h.setOnClickListener(null);
        this.f24492k.d();
        imageView2.setVisibility(0);
        t(booleanValue);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (x(savedInstanceState)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.phrase_training_fragment_59, container, false);
        PhraseTrainingActivity phraseTrainingActivity = (PhraseTrainingActivity) getActivity();
        z(viewGroup, phraseTrainingActivity);
        A(viewGroup, phraseTrainingActivity);
        B(viewGroup, phraseTrainingActivity);
        return viewGroup;
    }

    @Override // com.baicizhan.main.phrasetraining.activity.a
    public void w(boolean right) {
        a.b bVar = this.f24485c;
        if (bVar == null) {
            return;
        }
        if (right) {
            bVar.z(0, null);
        } else {
            bVar.z(1, null);
        }
        this.f24490i.setVisibility(8);
        this.f24491j.setVisibility(8);
    }

    public final void z(ViewGroup rootView, PhraseTrainingActivity parent) {
        String sentence = parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getSentence();
        String sentenceWordHighlight = parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getSentenceWordHighlight();
        SpannableString spannableString = new SpannableString(sentence);
        Locale locale = Locale.US;
        int indexOf = sentence.toLowerCase(locale).indexOf(sentenceWordHighlight.toLowerCase(locale));
        if (indexOf >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(ThemeUtil.getThemeColorWithAttr(getActivity(), R.attr.color_progress)), indexOf, sentenceWordHighlight.length() + indexOf, 34);
        }
        ((TextView) rootView.findViewById(R.id.phrase_training_example)).setText(spannableString);
    }
}
