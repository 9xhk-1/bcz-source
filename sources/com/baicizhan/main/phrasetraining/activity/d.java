package com.baicizhan.main.phrasetraining.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.main.phrasetraining.activity.a;
import com.jiongji.andriod.card.R;
import gi.l0;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d extends com.baicizhan.main.phrasetraining.activity.a implements View.OnClickListener {

    /* renamed from: v, reason: collision with root package name */
    public static final String f24505v = "type";

    /* renamed from: g, reason: collision with root package name */
    public int f24506g = 61;

    /* renamed from: h, reason: collision with root package name */
    public TextView f24507h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f24508i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f24509j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f24510k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f24511l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f24512m;

    /* renamed from: n, reason: collision with root package name */
    public TextView f24513n;

    /* renamed from: o, reason: collision with root package name */
    public ImageView f24514o;

    /* renamed from: p, reason: collision with root package name */
    public ImageView f24515p;

    /* renamed from: q, reason: collision with root package name */
    public ImageView f24516q;

    /* renamed from: r, reason: collision with root package name */
    public ImageView f24517r;

    /* renamed from: s, reason: collision with root package name */
    public ImageView f24518s;

    /* renamed from: t, reason: collision with root package name */
    public View f24519t;

    /* renamed from: u, reason: collision with root package name */
    public l0 f24520u;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.f24520u.d();
            d.this.v(true, 0L);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f24520u.b();
        }
    }

    private void A(ViewGroup rootView, PhraseTrainingActivity parent) {
        String sentencen2Trans;
        String sentence2;
        if (61 == this.f24506g) {
            sentencen2Trans = parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getSentenceTrans();
            sentence2 = parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getSentence();
        } else {
            sentencen2Trans = parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getSentencen2Trans();
            sentence2 = parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getSentence2();
        }
        TextView textView = (TextView) rootView.findViewById(R.id.phrase_training_mean);
        this.f24508i = textView;
        textView.setText(sentencen2Trans);
        TextView textView2 = (TextView) rootView.findViewById(R.id.phrase_training_example);
        this.f24509j = textView2;
        textView2.setText(sentence2);
    }

    private void C(ViewGroup rootView, PhraseTrainingActivity parent) {
        String[] strArr = new String[3];
        String word = parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getWord();
        String[] split = parent.f24468i.getGroupedTopicIds().split(",");
        for (int i11 = 0; i11 < 3; i11++) {
            strArr[i11] = parent.f24467h.get(Integer.valueOf(split[i11])).getWord();
        }
        this.f24514o = (ImageView) rootView.findViewById(R.id.phrase_training_tag_0);
        this.f24515p = (ImageView) rootView.findViewById(R.id.phrase_training_tag_1);
        this.f24516q = (ImageView) rootView.findViewById(R.id.phrase_training_tag_2);
        this.f24517r = (ImageView) rootView.findViewById(R.id.phrase_training_tag_3);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(this.f24514o);
        arrayList.add(this.f24515p);
        arrayList.add(this.f24516q);
        arrayList.add(this.f24517r);
        this.f24510k = (TextView) rootView.findViewById(R.id.phrase_training_word_0);
        this.f24511l = (TextView) rootView.findViewById(R.id.phrase_training_word_1);
        this.f24512m = (TextView) rootView.findViewById(R.id.phrase_training_word_2);
        this.f24513n = (TextView) rootView.findViewById(R.id.phrase_training_word_3);
        ArrayList arrayList2 = new ArrayList(4);
        arrayList2.add(this.f24510k);
        arrayList2.add(this.f24511l);
        arrayList2.add(this.f24512m);
        arrayList2.add(this.f24513n);
        int round = (int) Math.round(Math.random() * 3.0d);
        TextView textView = (TextView) arrayList2.remove(round);
        textView.setTag(Boolean.TRUE);
        textView.setText(word);
        textView.setOnClickListener(this);
        ((ImageView) arrayList.remove(round)).setImageResource(R.drawable.ic_result_mid_right);
        for (int i12 = 0; i12 < 3; i12++) {
            ((TextView) arrayList2.get(i12)).setTag(Boolean.FALSE);
            ((TextView) arrayList2.get(i12)).setText(strArr[i12]);
            ((TextView) arrayList2.get(i12)).setOnClickListener(this);
        }
    }

    private void D(ViewGroup rootView, final PhraseTrainingActivity parent) {
        String sentenceAudio = 61 == this.f24506g ? parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getSentenceAudio() : parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getSentence2Audio();
        View findViewById = rootView.findViewById(R.id.phrase_training_sound_frame);
        this.f24519t = findViewById;
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.phrase_training_sound);
        ThemeResUtil.setSoundBg(getActivity(), imageView);
        this.f24520u = new l0(parent.f24469j, sentenceAudio, this.f24519t, imageView);
        this.f24519t.setVisibility(8);
    }

    public static d z(int type) {
        d dVar = new d();
        Bundle bundle = new Bundle();
        bundle.putInt("type", type);
        dVar.setArguments(bundle);
        return dVar;
    }

    public final void B(ViewGroup rootView, PhraseTrainingActivity parent) {
        TextView textView = (TextView) rootView.findViewById(R.id.phrase_training_next_q);
        this.f24507h = textView;
        textView.setOnClickListener(new a());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean booleanValue = ((Boolean) view.getTag()).booleanValue();
        a.b bVar = this.f24485c;
        if (bVar != null) {
            bVar.i(booleanValue);
        }
        this.f24518s = null;
        if (view == this.f24510k) {
            this.f24518s = this.f24514o;
        } else if (view == this.f24511l) {
            this.f24518s = this.f24515p;
        } else if (view == this.f24512m) {
            this.f24518s = this.f24516q;
        } else {
            this.f24518s = this.f24517r;
        }
        ImageView imageView = this.f24518s;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(0);
        this.f24510k.setOnClickListener(null);
        this.f24511l.setOnClickListener(null);
        this.f24512m.setOnClickListener(null);
        this.f24513n.setOnClickListener(null);
        if (!booleanValue) {
            t(false);
            return;
        }
        this.f24509j.setVisibility(0);
        this.f24507h.setVisibility(0);
        this.f24519t.setVisibility(0);
        this.f24483a.postDelayed(new b(), 450L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f24506g = getArguments() != null ? getArguments().getInt("type") : this.f24506g;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (x(savedInstanceState)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.phrase_training_fragment_61_68, container, false);
        PhraseTrainingActivity phraseTrainingActivity = (PhraseTrainingActivity) getActivity();
        B(viewGroup, phraseTrainingActivity);
        A(viewGroup, phraseTrainingActivity);
        C(viewGroup, phraseTrainingActivity);
        D(viewGroup, phraseTrainingActivity);
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
        this.f24518s.setVisibility(8);
    }
}
