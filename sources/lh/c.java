package lh;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.util.ThemeUtil;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.client.business.widget.WordErrFeedbackFragment;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.plusreview.data.MatchTestCache;
import com.baicizhan.main.plusreview.data.MatchTestlib;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends Fragment implements View.OnClickListener {

    /* renamed from: o, reason: collision with root package name */
    public static final String f71347o = "index";

    /* renamed from: a, reason: collision with root package name */
    public int f71348a;

    /* renamed from: b, reason: collision with root package name */
    public MatchTestlib.Word f71349b;

    /* renamed from: c, reason: collision with root package name */
    public TopicRecord f71350c;

    /* renamed from: d, reason: collision with root package name */
    public List<b> f71351d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public IAudioPlayer f71352e;

    /* renamed from: f, reason: collision with root package name */
    public RecyclerView f71353f;

    /* renamed from: g, reason: collision with root package name */
    public C0861c f71354g;

    /* renamed from: h, reason: collision with root package name */
    public View f71355h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f71356i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f71357j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f71358k;

    /* renamed from: l, reason: collision with root package name */
    public Button f71359l;

    /* renamed from: m, reason: collision with root package name */
    public Button f71360m;

    /* renamed from: n, reason: collision with root package name */
    public e f71361n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnKeyListener {
        public a() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View v11, int keyCode, KeyEvent event) {
            if (event.getAction() != 0 || 4 != keyCode || c.this.f71361n == null) {
                return false;
            }
            c.this.f71361n.P(c.this);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        public SpannableString f71363a;

        /* renamed from: b, reason: collision with root package name */
        public String f71364b;

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: lh.c$c, reason: collision with other inner class name */
    public class C0861c extends RecyclerView.Adapter<d> {
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(d holder, int position) {
            b bVar = (b) c.this.f71351d.get(position);
            holder.f71367a.setText(bVar.f71363a);
            holder.f71368b.setText(bVar.f71364b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d onCreateViewHolder(ViewGroup parent, int viewType) {
            return c.this.new d(LayoutInflater.from(parent.getContext()).inflate(R.layout.plusreview_match_example_item, parent, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return c.this.f71351d.size();
        }

        public C0861c() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: collision with root package name */
        public TextView f71367a;

        /* renamed from: b, reason: collision with root package name */
        public TextView f71368b;

        public d(View view) {
            super(view);
            this.f71367a = (TextView) view.findViewById(R.id.plusreview_match_exam);
            this.f71368b = (TextView) view.findViewById(R.id.plusreview_match_cnexam);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
        void I();

        void P(Fragment fragment);

        void S();
    }

    private void w() {
        int indexOf;
        List<MatchTestlib.RightOption> arr_right_options = this.f71349b.getArr_right_options();
        Collections.shuffle(arr_right_options);
        int size = arr_right_options.size();
        for (int i11 = 0; i11 < size; i11++) {
            for (MatchTestlib.BingSentence bingSentence : arr_right_options.get(i11).getArr_bing_sentences()) {
                b bVar = new b();
                bVar.f71364b = bingSentence.getSentence_trans();
                String sentence = bingSentence.getSentence();
                ArrayList<String> arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                do {
                    int indexOf2 = sentence.indexOf("<i>");
                    indexOf = sentence.indexOf("</i>");
                    if (indexOf2 < 0 || indexOf < 0) {
                        break;
                    }
                    String substring = sentence.substring(indexOf2 + 3, indexOf);
                    arrayList.add(substring);
                    sentence = sentence.replaceFirst("<i>" + substring + "</i>", substring);
                    arrayList2.add(Integer.valueOf(indexOf2));
                    if (indexOf2 < 0) {
                        break;
                    }
                } while (indexOf >= 0);
                bVar.f71363a = new SpannableString(sentence);
                int i12 = 0;
                for (String str : arrayList) {
                    int intValue = ((Integer) arrayList2.get(i12)).intValue();
                    if (intValue >= 0) {
                        bVar.f71363a.setSpan(new ForegroundColorSpan(ThemeUtil.getThemeColorWithAttr(getActivity(), R.attr.color_progress)), intValue, str.length() + intValue, 34);
                    }
                    i12++;
                }
                this.f71351d.add(bVar);
            }
        }
    }

    private void x(ViewGroup rootView) {
        View findViewById = rootView.findViewById(R.id.plusreview_match_wiki_word_infos);
        this.f71355h = findViewById;
        findViewById.setOnClickListener(this);
        TextView textView = (TextView) rootView.findViewById(R.id.plusreview_match_wiki_word);
        this.f71356i = textView;
        textView.setText(this.f71350c.word);
        this.f71356i.setOnClickListener(this);
        TextView textView2 = (TextView) rootView.findViewById(R.id.plusreview_match_wiki_cnmean);
        this.f71357j = textView2;
        textView2.setText(this.f71350c.wordMean);
        this.f71357j.setOnClickListener(this);
        ImageView imageView = (ImageView) rootView.findViewById(R.id.plusreview_match_wiki_image);
        this.f71358k = imageView;
        imageView.setOnClickListener(this);
        TopicRecord topicRecord = this.f71350c;
        ZPackUtils.loadImageCompat(topicRecord, topicRecord.imagePath).f(R.drawable.image_broke_normal_default).h().o(this.f71358k);
        Button button = (Button) rootView.findViewById(R.id.plusreview_match_wiki_notify_err);
        this.f71359l = button;
        button.setOnClickListener(this);
        Button button2 = (Button) rootView.findViewById(R.id.plusreview_match_wiki_continue);
        this.f71360m = button2;
        button2.setOnClickListener(this);
        this.f71354g = new C0861c();
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.plusreview_match_wiki_exams);
        this.f71353f = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        this.f71353f.setAdapter(this.f71354g);
    }

    public static c y(int index) {
        c cVar = new c();
        Bundle bundle = new Bundle();
        bundle.putInt("index", index);
        cVar.setArguments(bundle);
        return cVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getView().setFocusableInTouchMode(true);
        getView().requestFocus();
        getView().setOnKeyListener(new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f71352e = new q9.l(activity);
        try {
            e eVar = (e) activity;
            this.f71361n = eVar;
            eVar.S();
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.toString() + " must implement OnFragmentInteractionListener");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.f71360m) {
            e eVar = this.f71361n;
            if (eVar != null) {
                eVar.P(this);
                return;
            }
            return;
        }
        if (view == this.f71359l) {
            WordErrFeedbackFragment.Word word = new WordErrFeedbackFragment.Word();
            word.c(this.f71350c.topicId);
            word.d(this.f71350c.word);
            WordErrFeedbackFragment.A(word, false).show(getActivity().getSupportFragmentManager(), "feedback");
            return;
        }
        dt.a.p(this.f71356i, r5.getWidth() / 2);
        dt.a.q(this.f71356i, r5.getHeight() / 2);
        bt.l.J0(this.f71356i, "scaleX", 1.0f, 1.2f, 1.0f).l(300L).s();
        bt.l.J0(this.f71356i, "scaleY", 1.0f, 1.2f, 1.0f).l(300L).s();
        IAudioPlayer iAudioPlayer = this.f71352e;
        TopicRecord topicRecord = this.f71350c;
        ZPackUtils.loadAudioCompat(iAudioPlayer, topicRecord, topicRecord.wordAudio);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f71348a = getArguments() != null ? getArguments().getInt("index") : 0;
        this.f71349b = MatchTestCache.getCache().getTestlib().getReview_words().get(this.f71348a);
        this.f71350c = MatchTestCache.getCache().getTopicRecord();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.plusreview_fragment_match_wiki, container, false);
        w();
        x(viewGroup);
        return viewGroup;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        e eVar = this.f71361n;
        if (eVar != null) {
            eVar.I();
        }
        this.f71361n = null;
        this.f71352e.destroy();
    }
}
