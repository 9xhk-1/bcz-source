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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends a implements View.OnClickListener {

    /* renamed from: r, reason: collision with root package name */
    public static final String f24493r = "type";

    /* renamed from: g, reason: collision with root package name */
    public int f24494g = 60;

    /* renamed from: h, reason: collision with root package name */
    public TextView f24495h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f24496i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f24497j;

    /* renamed from: k, reason: collision with root package name */
    public TextView f24498k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView f24499l;

    /* renamed from: m, reason: collision with root package name */
    public ImageView f24500m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView f24501n;

    /* renamed from: o, reason: collision with root package name */
    public ImageView f24502o;

    /* renamed from: p, reason: collision with root package name */
    public ImageView f24503p;

    /* renamed from: q, reason: collision with root package name */
    public l0 f24504q;

    private void A(ViewGroup rootView, PhraseTrainingActivity parent) {
        String[] strArr;
        String str;
        String[] strArr2 = new String[3];
        int i11 = this.f24494g;
        if (60 == i11) {
            str = parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getMeanCn();
            strArr = parent.f24468i.getGroupedOptions().split("\\|");
        } else {
            if (64 != i11) {
                return;
            }
            String word = parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getWord();
            String[] split = parent.f24468i.getGroupedTopicIds().split(",");
            for (int i12 = 0; i12 < 3; i12++) {
                strArr2[i12] = parent.f24467h.get(Integer.valueOf(split[i12])).getWord();
            }
            strArr = strArr2;
            str = word;
        }
        this.f24499l = (ImageView) rootView.findViewById(R.id.phrase_training_tag_0);
        this.f24500m = (ImageView) rootView.findViewById(R.id.phrase_training_tag_1);
        this.f24501n = (ImageView) rootView.findViewById(R.id.phrase_training_tag_2);
        this.f24502o = (ImageView) rootView.findViewById(R.id.phrase_training_tag_3);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(this.f24499l);
        arrayList.add(this.f24500m);
        arrayList.add(this.f24501n);
        arrayList.add(this.f24502o);
        this.f24495h = (TextView) rootView.findViewById(R.id.phrase_training_word_0);
        this.f24496i = (TextView) rootView.findViewById(R.id.phrase_training_word_1);
        this.f24497j = (TextView) rootView.findViewById(R.id.phrase_training_word_2);
        this.f24498k = (TextView) rootView.findViewById(R.id.phrase_training_word_3);
        ArrayList arrayList2 = new ArrayList(4);
        arrayList2.add(this.f24495h);
        arrayList2.add(this.f24496i);
        arrayList2.add(this.f24497j);
        arrayList2.add(this.f24498k);
        int round = (int) Math.round(Math.random() * 3.0d);
        TextView textView = (TextView) arrayList2.remove(round);
        textView.setTag(Boolean.TRUE);
        textView.setText(str);
        textView.setOnClickListener(this);
        ((ImageView) arrayList.remove(round)).setImageResource(R.drawable.ic_result_mid_right);
        for (int i13 = 0; i13 < 3; i13++) {
            ((TextView) arrayList2.get(i13)).setTag(Boolean.FALSE);
            ((TextView) arrayList2.get(i13)).setText(strArr[i13]);
            ((TextView) arrayList2.get(i13)).setOnClickListener(this);
        }
    }

    private void B(ViewGroup rootView, final PhraseTrainingActivity parent) {
        View findViewById = rootView.findViewById(R.id.phrase_training_sound_frame);
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.phrase_training_sound);
        ThemeResUtil.setSoundBg(getActivity(), imageView);
        l0 l0Var = new l0(parent.f24469j, parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getWordAudio(), findViewById, imageView);
        this.f24504q = l0Var;
        l0Var.b();
    }

    public static c y(int type) {
        c cVar = new c();
        Bundle bundle = new Bundle();
        bundle.putInt("type", type);
        cVar.setArguments(bundle);
        return cVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        boolean booleanValue = ((Boolean) view.getTag()).booleanValue();
        a.b bVar = this.f24485c;
        if (bVar != null) {
            bVar.i(booleanValue);
        }
        this.f24503p = null;
        TextView textView = this.f24495h;
        if (view == textView) {
            this.f24503p = this.f24499l;
        } else if (view == this.f24496i) {
            this.f24503p = this.f24500m;
        } else if (view == this.f24497j) {
            this.f24503p = this.f24501n;
        } else {
            this.f24503p = this.f24502o;
        }
        if (this.f24503p == null) {
            return;
        }
        textView.setOnClickListener(null);
        this.f24496i.setOnClickListener(null);
        this.f24497j.setOnClickListener(null);
        this.f24498k.setOnClickListener(null);
        this.f24503p.setVisibility(0);
        this.f24504q.d();
        t(booleanValue);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f24494g = getArguments() != null ? getArguments().getInt("type") : this.f24494g;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (x(savedInstanceState)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.phrase_training_fragment_60_64, container, false);
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
        this.f24503p.setVisibility(8);
    }

    public final void z(ViewGroup rootView, PhraseTrainingActivity parent) {
        hc.c.k(new File(PathUtil.reformSuffix(PathUtil.BCZ_HOME + parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getWordImage(), ".jpg"))).h().o((ImageView) rootView.findViewById(R.id.phrase_training_image));
    }
}
