package com.baicizhan.main.phrasetraining.activity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.baicizhan.main.phrasetraining.activity.a;
import com.baicizhan.main.phrasetraining.data.bean.PhraseGroup;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e extends com.baicizhan.main.phrasetraining.activity.a {

    /* renamed from: g, reason: collision with root package name */
    public TextView f24523g;

    /* renamed from: i, reason: collision with root package name */
    public String f24525i;

    /* renamed from: k, reason: collision with root package name */
    public String f24527k;

    /* renamed from: m, reason: collision with root package name */
    public String f24529m;

    /* renamed from: n, reason: collision with root package name */
    public String f24530n;

    /* renamed from: o, reason: collision with root package name */
    public String f24531o;

    /* renamed from: h, reason: collision with root package name */
    public boolean f24524h = true;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList<String> f24526j = new ArrayList<>(3);

    /* renamed from: l, reason: collision with root package name */
    public ArrayList<String> f24528l = new ArrayList<>(3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.v(true, 0L);
        }
    }

    private void A(ViewGroup rootView, PhraseTrainingActivity parent) {
        TextView textView = (TextView) rootView.findViewById(R.id.phrase_training_next_q);
        this.f24523g = textView;
        textView.setOnClickListener(new a());
    }

    public static e y() {
        return new e();
    }

    public final void B(ViewGroup rootView, PhraseTrainingActivity parent) {
        if (this.f24524h) {
            ((TextView) rootView.findViewById(R.id.phrase_training_62_q_start_tip)).setText(this.f24525i);
            ((TextView) rootView.findViewById(R.id.phrase_training_62_q_end_tip)).setText(this.f24527k);
            ArrayList arrayList = new ArrayList();
            arrayList.add((TextView) rootView.findViewById(R.id.phrase_training_62_q_word_0));
            arrayList.add((TextView) rootView.findViewById(R.id.phrase_training_62_q_word_1));
            arrayList.add((TextView) rootView.findViewById(R.id.phrase_training_62_q_word_2));
            arrayList.add((TextView) rootView.findViewById(R.id.phrase_training_62_q_word_3));
            int min = Math.min(this.f24526j.size(), arrayList.size());
            for (int i11 = 0; i11 < min; i11++) {
                ((TextView) arrayList.get(i11)).setText(this.f24526j.get(i11));
                ((TextView) arrayList.get(i11)).setVisibility(0);
            }
            return;
        }
        ((TextView) rootView.findViewById(R.id.phrase_training_62_a_middle_tip)).setText(this.f24529m);
        ((TextView) rootView.findViewById(R.id.phrase_training_62_a_middle_mean)).setText(this.f24530n);
        ((TextView) rootView.findViewById(R.id.phrase_training_62_a_end_tip)).setText(this.f24531o);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((TextView) rootView.findViewById(R.id.phrase_training_62_a_word_0));
        arrayList2.add((TextView) rootView.findViewById(R.id.phrase_training_62_a_word_1));
        arrayList2.add((TextView) rootView.findViewById(R.id.phrase_training_62_a_word_2));
        arrayList2.add((TextView) rootView.findViewById(R.id.phrase_training_62_a_word_3));
        int min2 = Math.min(this.f24528l.size(), arrayList2.size());
        for (int i12 = 0; i12 < min2; i12++) {
            ((TextView) arrayList2.get(i12)).setText(this.f24528l.get(i12));
            ((TextView) arrayList2.get(i12)).setVisibility(0);
        }
    }

    public final boolean C(String seg, PhraseTrainingActivity parent) {
        Iterator<PhraseGroup.Phrase> it = parent.f24463d.get(parent.f24461b).getPhrases().iterator();
        while (it.hasNext()) {
            if (it.next().getWord().equals(seg)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (x(savedInstanceState)) {
            return null;
        }
        PhraseTrainingActivity phraseTrainingActivity = (PhraseTrainingActivity) getActivity();
        if (!z(phraseTrainingActivity)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(this.f24524h ? R.layout.phrase_training_fragment_62_question : R.layout.phrase_training_fragment_62_answer, container, false);
        B(viewGroup, phraseTrainingActivity);
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

    public final boolean z(PhraseTrainingActivity parent) {
        String tips = parent.f24468i.getTips();
        int i11 = 0;
        if (TextUtils.isEmpty(tips)) {
            return false;
        }
        String[] split = tips.replaceAll("\n", "").split("#");
        qb.c.b("whiz", "QA tips: " + tips.replaceAll("\n", ""), new Object[0]);
        int length = split.length;
        for (int i12 = 0; i12 < length; i12++) {
            qb.c.b("whiz", "QA tip: " + split[i12], new Object[0]);
        }
        if (tips.startsWith("#")) {
            this.f24524h = false;
            int length2 = split.length;
            while (i11 < length2) {
                String str = split[i11];
                String replaceAll = str.replaceAll(" ", "");
                if (C(str, parent)) {
                    this.f24528l.add(str);
                } else if (!replaceAll.equals(j2.O) && !replaceAll.equals(",") && !replaceAll.equals("，") && !replaceAll.equals("， ") && !replaceAll.equals("")) {
                    if (this.f24529m == null) {
                        this.f24529m = str;
                    } else if (this.f24530n == null) {
                        this.f24530n = str;
                    } else if (this.f24531o == null) {
                        this.f24531o = str;
                    }
                }
                i11++;
            }
        } else {
            this.f24524h = true;
            int length3 = split.length;
            while (i11 < length3) {
                String str2 = split[i11];
                String replaceAll2 = str2.replaceAll(" ", "");
                if (C(str2, parent)) {
                    this.f24526j.add(str2);
                } else if (!replaceAll2.equals(j2.O) && !replaceAll2.equals(",") && !replaceAll2.equals("，") && !replaceAll2.equals("， ") && !replaceAll2.equals("")) {
                    if (this.f24525i == null) {
                        this.f24525i = str2;
                    } else if (this.f24527k == null) {
                        this.f24527k = str2;
                    }
                }
                i11++;
            }
        }
        return true;
    }
}
