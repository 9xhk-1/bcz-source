package com.baicizhan.main.phrasetraining.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.main.phrasetraining.activity.a;
import com.jiongji.andriod.card.R;
import gi.l0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class h extends a implements View.OnClickListener {

    /* renamed from: g, reason: collision with root package name */
    public ImageView f24545g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f24546h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f24547i;

    /* renamed from: j, reason: collision with root package name */
    public ImageView f24548j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f24549k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f24550l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView f24551m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView f24552n;

    /* renamed from: o, reason: collision with root package name */
    public ImageView f24553o;

    /* renamed from: p, reason: collision with root package name */
    public l0 f24554p;

    private void A(ViewGroup rootView, final PhraseTrainingActivity parent) {
        View findViewById = rootView.findViewById(R.id.phrase_training_sound_frame);
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.phrase_training_sound);
        ThemeResUtil.setSoundBg(getActivity(), imageView);
        l0 l0Var = new l0(parent.f24469j, parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getWordAudio(), findViewById, imageView);
        this.f24554p = l0Var;
        l0Var.b();
    }

    public static h y() {
        return new h();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean booleanValue = ((Boolean) view.getTag()).booleanValue();
        a.b bVar = this.f24485c;
        if (bVar != null) {
            bVar.i(booleanValue);
        }
        this.f24553o = null;
        ImageView imageView = this.f24545g;
        if (view == imageView) {
            this.f24553o = this.f24549k;
        } else if (view == this.f24546h) {
            this.f24553o = this.f24550l;
        } else if (view == this.f24547i) {
            this.f24553o = this.f24551m;
        } else if (view == this.f24548j) {
            this.f24553o = this.f24552n;
        }
        if (this.f24553o == null) {
            return;
        }
        imageView.setOnClickListener(null);
        this.f24546h.setOnClickListener(null);
        this.f24547i.setOnClickListener(null);
        this.f24548j.setOnClickListener(null);
        this.f24554p.d();
        this.f24553o.setVisibility(0);
        t(booleanValue);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (x(savedInstanceState)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.phrase_training_fragment_67, container, false);
        PhraseTrainingActivity phraseTrainingActivity = (PhraseTrainingActivity) getActivity();
        z(viewGroup, phraseTrainingActivity);
        A(viewGroup, phraseTrainingActivity);
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
        this.f24553o.setVisibility(8);
    }

    public final void z(ViewGroup rootView, PhraseTrainingActivity parent) {
        int topicId = parent.f24468i.getTopicId();
        String[] split = parent.f24468i.getGroupedTopicIds().split(",");
        ((TextView) rootView.findViewById(R.id.phrase_training_word)).setText(parent.f24467h.get(Integer.valueOf(topicId)).getWord());
        int round = (int) Math.round(Math.random() * 3.0d);
        this.f24545g = (ImageView) rootView.findViewById(R.id.phrase_training_img_0);
        ThemeResUtil.setCardBg(getActivity(), this.f24545g);
        this.f24545g.setOnClickListener(this);
        this.f24546h = (ImageView) rootView.findViewById(R.id.phrase_training_img_1);
        ThemeResUtil.setCardBg(getActivity(), this.f24546h);
        this.f24546h.setOnClickListener(this);
        this.f24547i = (ImageView) rootView.findViewById(R.id.phrase_training_img_2);
        ThemeResUtil.setCardBg(getActivity(), this.f24547i);
        this.f24547i.setOnClickListener(this);
        this.f24548j = (ImageView) rootView.findViewById(R.id.phrase_training_img_3);
        ThemeResUtil.setCardBg(getActivity(), this.f24548j);
        this.f24548j.setOnClickListener(this);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(this.f24545g);
        arrayList.add(this.f24546h);
        arrayList.add(this.f24547i);
        arrayList.add(this.f24548j);
        ImageView imageView = (ImageView) arrayList.remove(round);
        imageView.setTag(Boolean.TRUE);
        hc.c.k(new File(PathUtil.reformSuffix(PathUtil.BCZ_HOME + parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getWordImage(), ".jpg"))).h().o(imageView);
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            ImageView imageView2 = (ImageView) it.next();
            imageView2.setTag(Boolean.FALSE);
            hc.c.k(new File(PathUtil.reformSuffix(PathUtil.BCZ_HOME + parent.f24467h.get(Integer.valueOf(split[i11])).getWordImage(), ".jpg"))).h().o(imageView2);
            i11++;
        }
        this.f24549k = (ImageView) rootView.findViewById(R.id.phrase_training_tag_0);
        this.f24550l = (ImageView) rootView.findViewById(R.id.phrase_training_tag_1);
        this.f24551m = (ImageView) rootView.findViewById(R.id.phrase_training_tag_2);
        this.f24552n = (ImageView) rootView.findViewById(R.id.phrase_training_tag_3);
        ArrayList arrayList2 = new ArrayList(4);
        arrayList2.add(this.f24549k);
        arrayList2.add(this.f24550l);
        arrayList2.add(this.f24551m);
        arrayList2.add(this.f24552n);
        ((ImageView) arrayList2.remove(round)).setImageResource(R.drawable.right_big_normal_default);
    }
}
