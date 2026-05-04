package com.baicizhan.main.phrasetraining.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.baicizhan.main.phrasetraining.activity.a;
import com.baicizhan.main.phrasetraining.data.bean.PhraseGroup;
import com.google.android.material.timepicker.TimeModel;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class i extends com.baicizhan.main.phrasetraining.activity.a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.b bVar = i.this.f24485c;
            if (bVar != null) {
                bVar.Q();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i iVar = i.this;
            a.b bVar = iVar.f24485c;
            if (bVar != null) {
                bVar.q0(iVar);
            }
        }
    }

    private void A(ViewGroup rootView, PhraseTrainingActivity parent) {
        ((TextView) rootView.findViewById(R.id.phrase_training_course_finished)).setText(getString(R.string.phrase_training_course_finished, String.format(TimeModel.f32587h, Integer.valueOf(parent.f24461b + 1))));
        List<PhraseGroup.Phrase> phrases = parent.f24463d.get(parent.f24461b).getPhrases();
        ArrayList arrayList = new ArrayList(8);
        arrayList.add((TextView) rootView.findViewById(R.id.phrase_training_word_0));
        arrayList.add((TextView) rootView.findViewById(R.id.phrase_training_word_1));
        arrayList.add((TextView) rootView.findViewById(R.id.phrase_training_word_2));
        arrayList.add((TextView) rootView.findViewById(R.id.phrase_training_word_3));
        arrayList.add((TextView) rootView.findViewById(R.id.phrase_training_word_4));
        arrayList.add((TextView) rootView.findViewById(R.id.phrase_training_word_5));
        arrayList.add((TextView) rootView.findViewById(R.id.phrase_training_word_6));
        arrayList.add((TextView) rootView.findViewById(R.id.phrase_training_word_7));
        ArrayList arrayList2 = new ArrayList(8);
        arrayList2.add((TextView) rootView.findViewById(R.id.phrase_training_mean_0));
        arrayList2.add((TextView) rootView.findViewById(R.id.phrase_training_mean_1));
        arrayList2.add((TextView) rootView.findViewById(R.id.phrase_training_mean_2));
        arrayList2.add((TextView) rootView.findViewById(R.id.phrase_training_mean_3));
        arrayList2.add((TextView) rootView.findViewById(R.id.phrase_training_mean_4));
        arrayList2.add((TextView) rootView.findViewById(R.id.phrase_training_mean_5));
        arrayList2.add((TextView) rootView.findViewById(R.id.phrase_training_mean_6));
        arrayList2.add((TextView) rootView.findViewById(R.id.phrase_training_mean_7));
        int min = Math.min(phrases.size(), arrayList.size());
        for (int i11 = 0; i11 < min; i11++) {
            ((TextView) arrayList.get(i11)).setText(phrases.get(i11).getWord());
            ((TextView) arrayList.get(i11)).setVisibility(0);
            ((TextView) arrayList2.get(i11)).setText(parent.f24467h.get(Integer.valueOf(phrases.get(i11).getTopicId())).getMeanCn().replaceAll("\n", ""));
            ((TextView) arrayList2.get(i11)).setVisibility(0);
        }
    }

    public static i y() {
        return new i();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (x(savedInstanceState)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.phrase_training_fragment_over, container, false);
        A(viewGroup, (PhraseTrainingActivity) getActivity());
        z(viewGroup);
        return viewGroup;
    }

    public final void z(ViewGroup rootView) {
        ((Button) rootView.findViewById(R.id.phrase_training_back_list)).setOnClickListener(new a());
        ((Button) rootView.findViewById(R.id.phrase_training_continue_next_course)).setOnClickListener(new b());
    }

    @Override // com.baicizhan.main.phrasetraining.activity.a
    public void w(boolean right) {
    }
}
