package com.baicizhan.main.phrasetraining.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import bt.l;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.client.business.util.ThemeUtil;
import com.baicizhan.main.phrasetraining.activity.a;
import com.jiongji.andriod.card.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class f extends com.baicizhan.main.phrasetraining.activity.a implements View.OnClickListener {

    /* renamed from: g, reason: collision with root package name */
    public TextView f24533g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<ImageView> f24534h = new ArrayList<>(3);

    /* renamed from: i, reason: collision with root package name */
    public ArrayList<TextView> f24535i = new ArrayList<>(3);

    /* renamed from: j, reason: collision with root package name */
    public ArrayList<Button> f24536j = new ArrayList<>(3);

    /* renamed from: k, reason: collision with root package name */
    public int f24537k;

    /* renamed from: l, reason: collision with root package name */
    public int f24538l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            f.this.v(true, 0L);
        }
    }

    private void A(ViewGroup rootView, PhraseTrainingActivity parent) {
        String[] split = parent.f24468i.getGroupedTopicIds().split(",");
        this.f24538l = split.length;
        ArrayList arrayList = new ArrayList(this.f24538l);
        ArrayList arrayList2 = new ArrayList(this.f24538l);
        for (String str : split) {
            arrayList.add(PathUtil.reformSuffix(PathUtil.BCZ_HOME + parent.f24467h.get(Integer.valueOf(str)).getWordImage(), ".jpg"));
            arrayList2.add(parent.f24467h.get(Integer.valueOf(str)).getWord());
        }
        this.f24534h.add((ImageView) rootView.findViewById(R.id.phrase_training_image_0));
        this.f24534h.add((ImageView) rootView.findViewById(R.id.phrase_training_image_1));
        this.f24534h.add((ImageView) rootView.findViewById(R.id.phrase_training_image_2));
        this.f24535i.add((TextView) rootView.findViewById(R.id.phrase_training_word_0));
        this.f24535i.add((TextView) rootView.findViewById(R.id.phrase_training_word_1));
        this.f24535i.add((TextView) rootView.findViewById(R.id.phrase_training_word_2));
        this.f24536j.add((Button) rootView.findViewById(R.id.phrase_training_select_0));
        this.f24536j.add((Button) rootView.findViewById(R.id.phrase_training_select_1));
        this.f24536j.add((Button) rootView.findViewById(R.id.phrase_training_select_2));
        if (2 == this.f24538l) {
            this.f24535i.get(2).setVisibility(8);
            this.f24536j.get(2).setVisibility(8);
            this.f24534h.get(2).setVisibility(8);
        }
        for (int i11 = 0; i11 < this.f24538l; i11++) {
            this.f24536j.get(i11).setText((CharSequence) arrayList2.get(i11));
            this.f24536j.get(i11).setTag(Integer.valueOf(i11));
            this.f24536j.get(i11).setOnClickListener(this);
            if (i11 != 0) {
                ImageView imageView = this.f24534h.get(i11);
                dt.a.u(imageView, 0.85f);
                dt.a.v(imageView, 0.85f);
                dt.a.o(imageView, 0.1f);
            }
        }
        for (int i12 = 0; i12 < this.f24538l; i12++) {
            ImageView imageView2 = this.f24534h.get(i12);
            ThemeResUtil.setCardBg(getActivity(), imageView2);
            TextView textView = this.f24535i.get(i12);
            int random = (int) (Math.random() * arrayList2.size());
            String str2 = (String) arrayList.remove(random);
            String str3 = (String) arrayList2.remove(random);
            hc.c.k(new File(str2)).h().o(imageView2);
            imageView2.setTag(str3);
            textView.setText(str3);
        }
    }

    public static f y() {
        return new f();
    }

    private void z(ViewGroup rootView, PhraseTrainingActivity parent) {
        TextView textView = (TextView) rootView.findViewById(R.id.phrase_training_next_q);
        this.f24533g = textView;
        textView.setOnClickListener(new a());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Button button = (Button) view;
        if (!button.getText().toString().equals((String) this.f24534h.get(this.f24537k).getTag())) {
            a.b bVar = this.f24485c;
            if (bVar != null) {
                bVar.i(false);
            }
            button.setTextColor(-65536);
            return;
        }
        a.b bVar2 = this.f24485c;
        if (bVar2 != null) {
            bVar2.i(true);
        }
        Iterator<Button> it = this.f24536j.iterator();
        while (it.hasNext()) {
            it.next().setTextColor(ThemeUtil.getThemeColorWithAttr(getActivity(), R.attr.color_list_text1));
        }
        button.setVisibility(4);
        button.setOnClickListener(null);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(100L);
        button.startAnimation(alphaAnimation);
        this.f24535i.get(this.f24537k).setVisibility(0);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(100L);
        this.f24535i.get(this.f24537k).startAnimation(alphaAnimation2);
        int i11 = this.f24537k + 1;
        this.f24537k = i11;
        if (i11 >= this.f24538l) {
            this.f24533g.setVisibility(0);
            return;
        }
        l.J0(this.f24534h.get(i11), "scaleX", 0.85f, 1.0f).l(200L).s();
        l.J0(this.f24534h.get(this.f24537k), "scaleY", 0.85f, 1.0f).l(200L).s();
        l.J0(this.f24534h.get(this.f24537k), "alpha", 0.1f, 1.0f).l(200L).s();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (x(savedInstanceState)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.phrase_training_fragment_65, container, false);
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
        bVar.z(0, null);
    }
}
