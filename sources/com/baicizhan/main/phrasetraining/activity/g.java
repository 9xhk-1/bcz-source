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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class g extends com.baicizhan.main.phrasetraining.activity.a {

    /* renamed from: j, reason: collision with root package name */
    public static final String f24540j = "is_wiki";

    /* renamed from: g, reason: collision with root package name */
    public boolean f24541g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextView f24542h;

    /* renamed from: i, reason: collision with root package name */
    public l0 f24543i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.f24543i.d();
            g.this.v(true, 0L);
        }
    }

    private void A(ViewGroup rootView, PhraseTrainingActivity parent) {
        TextView textView = (TextView) rootView.findViewById(R.id.phrase_training_next_q);
        this.f24542h = textView;
        textView.setOnClickListener(new a());
    }

    private void B(ViewGroup rootView, final PhraseTrainingActivity parent) {
        View findViewById = rootView.findViewById(R.id.phrase_training_sound_frame);
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.phrase_training_sound);
        ThemeResUtil.setSoundBg(getActivity(), imageView);
        l0 l0Var = new l0(parent.f24469j, parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getSentenceAudio(), findViewById, imageView);
        this.f24543i = l0Var;
        l0Var.b();
    }

    public static g z(boolean wiki) {
        g gVar = new g();
        Bundle bundle = new Bundle();
        bundle.putBoolean(f24540j, wiki);
        gVar.setArguments(bundle);
        return gVar;
    }

    public final void C(ViewGroup rootView, PhraseTrainingActivity parent) {
        String reformSuffix = PathUtil.reformSuffix(PathUtil.BCZ_HOME + parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getWordImage(), ".jpg");
        String word = parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getWord();
        String meanCn = parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getMeanCn();
        String sentence = parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getSentence();
        String str = "*" + parent.f24467h.get(Integer.valueOf(parent.f24468i.getTopicId())).getExamInfo();
        hc.c.k(new File(reformSuffix)).h().o((ImageView) rootView.findViewById(R.id.phrase_training_image));
        ((TextView) rootView.findViewById(R.id.phrase_training_word)).setText(word);
        ((TextView) rootView.findViewById(R.id.phrase_training_mean)).setText(meanCn);
        ((TextView) rootView.findViewById(R.id.phrase_training_example)).setText(sentence);
        ((TextView) rootView.findViewById(R.id.phrase_training_test_from)).setText(str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f24541g = getArguments() != null ? getArguments().getBoolean(f24540j) : false;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (x(savedInstanceState)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.phrase_training_fragment_66, container, false);
        PhraseTrainingActivity phraseTrainingActivity = (PhraseTrainingActivity) getActivity();
        C(viewGroup, phraseTrainingActivity);
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
        if (this.f24541g) {
            bVar.z(2, this);
        } else {
            bVar.z(0, null);
        }
    }
}
