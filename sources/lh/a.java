package lh;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.baicizhan.client.business.util.ThemeUtil;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.plusreview.data.MatchTestCache;
import com.baicizhan.main.plusreview.data.MatchTestlib;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends Fragment implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    /* renamed from: t, reason: collision with root package name */
    public static final String f71319t = "index";

    /* renamed from: u, reason: collision with root package name */
    public static final int f71320u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f71321v = 5;

    /* renamed from: a, reason: collision with root package name */
    public int f71322a;

    /* renamed from: b, reason: collision with root package name */
    public MatchTestlib.Word f71323b;

    /* renamed from: c, reason: collision with root package name */
    public TopicRecord f71324c;

    /* renamed from: h, reason: collision with root package name */
    public View f71329h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f71330i;

    /* renamed from: j, reason: collision with root package name */
    public TextView f71331j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f71332k;

    /* renamed from: n, reason: collision with root package name */
    public ViewGroup[] f71335n;

    /* renamed from: o, reason: collision with root package name */
    public TextView[] f71336o;

    /* renamed from: p, reason: collision with root package name */
    public ImageView[] f71337p;

    /* renamed from: q, reason: collision with root package name */
    public IAudioPlayer f71338q;

    /* renamed from: r, reason: collision with root package name */
    public ViewOnClickListenerC0860a f71339r;

    /* renamed from: s, reason: collision with root package name */
    public b f71340s;

    /* renamed from: d, reason: collision with root package name */
    public List<Integer> f71325d = new ArrayList(2);

    /* renamed from: e, reason: collision with root package name */
    public List<c> f71326e = new ArrayList(5);

    /* renamed from: f, reason: collision with root package name */
    public boolean f71327f = true;

    /* renamed from: g, reason: collision with root package name */
    public int f71328g = 0;

    /* renamed from: l, reason: collision with root package name */
    public TextView[] f71333l = new TextView[2];

    /* renamed from: m, reason: collision with root package name */
    public TextView[] f71334m = new TextView[2];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: lh.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0860a implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            dt.a.p(a.this.f71330i, a.this.f71330i.getWidth() / 2);
            dt.a.q(a.this.f71330i, a.this.f71330i.getHeight() / 2);
            bt.l.J0(a.this.f71330i, "scaleX", 1.0f, 1.2f, 1.0f).l(300L).s();
            bt.l.J0(a.this.f71330i, "scaleY", 1.0f, 1.2f, 1.0f).l(300L).s();
            ZPackUtils.loadAudioCompat(a.this.f71338q, a.this.f71324c, a.this.f71324c.wordAudio);
        }

        public ViewOnClickListenerC0860a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void U(boolean right, int index);

        void m();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public int f71342a;

        /* renamed from: b, reason: collision with root package name */
        public String f71343b;

        /* renamed from: c, reason: collision with root package name */
        public String f71344c;

        /* renamed from: d, reason: collision with root package name */
        public String f71345d;

        /* renamed from: e, reason: collision with root package name */
        public String f71346e;

        public c() {
        }
    }

    public static a D(int index) {
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putInt("index", index);
        aVar.setArguments(bundle);
        return aVar;
    }

    public final void A(ViewGroup rootView) {
        this.f71339r = new ViewOnClickListenerC0860a();
        View findViewById = rootView.findViewById(R.id.plusreview_match_left);
        this.f71329h = findViewById;
        findViewById.setOnClickListener(this.f71339r);
        TextView textView = (TextView) rootView.findViewById(R.id.plusreview_match_word);
        this.f71330i = textView;
        textView.setText(this.f71324c.word);
        this.f71330i.setOnClickListener(this.f71339r);
        TextView textView2 = (TextView) rootView.findViewById(R.id.plusreview_match_cnmean);
        this.f71331j = textView2;
        textView2.setText(this.f71324c.wordMean);
        this.f71331j.setVisibility(8);
        this.f71331j.setOnClickListener(this.f71339r);
        this.f71332k = (ImageView) rootView.findViewById(R.id.plusreview_match_image);
        ThemeResUtil.setCardBg(getActivity(), this.f71332k);
        TopicRecord topicRecord = this.f71324c;
        ZPackUtils.loadImageCompat(topicRecord, topicRecord.imagePath).f(R.drawable.image_broke_normal_default).h().o(this.f71332k);
        this.f71332k.setVisibility(8);
        this.f71332k.setOnClickListener(this.f71339r);
        this.f71333l[0] = (TextView) rootView.findViewById(R.id.plusreview_match_exam_0);
        this.f71334m[0] = (TextView) rootView.findViewById(R.id.plusreview_match_cnexam_0);
        this.f71333l[1] = (TextView) rootView.findViewById(R.id.plusreview_match_exam_1);
        this.f71334m[1] = (TextView) rootView.findViewById(R.id.plusreview_match_cnexam_1);
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.plusreview_match_right);
        int min = Math.min(viewGroup.getChildCount(), this.f71326e.size());
        this.f71335n = new ViewGroup[min];
        this.f71336o = new TextView[min];
        this.f71337p = new ImageView[min];
        for (int i11 = 0; i11 < min; i11++) {
            this.f71335n[i11] = (ViewGroup) viewGroup.getChildAt(i11);
            this.f71335n[i11].setVisibility(0);
            this.f71335n[i11].setOnClickListener(this);
            this.f71335n[i11].setOnLongClickListener(this);
            this.f71335n[i11].setOnTouchListener(this);
            this.f71335n[i11].setTag(Integer.valueOf(i11));
            this.f71336o[i11] = (TextView) this.f71335n[i11].getChildAt(0);
            this.f71336o[i11].setText(this.f71326e.get(i11).f71343b);
            this.f71337p[i11] = (ImageView) this.f71335n[i11].getChildAt(1);
            if (B(i11)) {
                this.f71337p[i11].setImageResource(R.drawable.ic_result_mid_right);
            }
        }
    }

    public final boolean B(int index) {
        int i11 = this.f71326e.get(index).f71342a;
        Iterator<Integer> it = this.f71325d.iterator();
        while (it.hasNext()) {
            if (i11 == it.next().intValue()) {
                return true;
            }
        }
        return false;
    }

    public final void C(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(160L);
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 0.0f, 2, 1.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(160L);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        view.startAnimation(animationSet);
        view.setVisibility(4);
    }

    public final void E(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        this.f71336o[intValue].setText(this.f71326e.get(intValue).f71343b);
        this.f71336o[intValue].getLayoutParams().width = xb.f.a(getActivity(), 172.0f);
    }

    public final void F(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        this.f71336o[intValue].setText(this.f71326e.get(intValue).f71343b + "\n" + this.f71326e.get(intValue).f71344c);
        this.f71336o[intValue].getLayoutParams().width = xb.f.a(getActivity(), 230.0f);
    }

    public final void G() {
        if (1 == this.f71328g) {
            bt.l.J0(this.f71333l[0], "alpha", 1.0f, 0.5f).l(300L).s();
            bt.l.J0(this.f71334m[0], "alpha", 1.0f, 0.5f).l(300L).s();
        }
        bt.l.J0(this.f71333l[this.f71328g], "alpha", 0.5f, 1.0f).l(300L).s();
        bt.l.J0(this.f71334m[this.f71328g], "alpha", 0.5f, 1.0f).l(300L).s();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f71338q = new q9.l(activity);
        try {
            this.f71340s = (b) activity;
        } catch (ClassCastException unused) {
            throw new ClassCastException(activity.toString() + " must implement OnFragmentInteractionListener");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        b bVar;
        int intValue = ((Integer) view.getTag()).intValue();
        boolean B = B(intValue);
        this.f71337p[intValue].setVisibility(0);
        if (B) {
            int i11 = this.f71328g;
            if (i11 < 2) {
                this.f71333l[i11].setText(Html.fromHtml(this.f71326e.get(intValue).f71345d));
                this.f71334m[this.f71328g].setText(this.f71326e.get(intValue).f71346e);
                G();
                this.f71328g++;
            }
        } else {
            C(this.f71335n[intValue]);
            this.f71327f = false;
        }
        this.f71335n[intValue].setOnClickListener(null);
        if (this.f71328g < 2 || (bVar = this.f71340s) == null) {
            return;
        }
        bVar.U(this.f71327f, this.f71322a);
        y();
        x();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f71322a = getArguments() != null ? getArguments().getInt("index") : 0;
        if (MatchTestCache.getCache().getTestlib() != null) {
            this.f71323b = MatchTestCache.getCache().getTestlib().getReview_words().get(this.f71322a);
            this.f71324c = MatchTestCache.getCache().getTopicRecord();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (this.f71323b == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) inflater.inflate(R.layout.plusreview_fragment_match, container, false);
        z();
        A(viewGroup);
        return viewGroup;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        b bVar = this.f71340s;
        if (bVar != null) {
            bVar.m();
        }
        this.f71340s = null;
        this.f71338q.destroy();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        F(view);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 1 && action != 3) {
            return false;
        }
        E(view);
        return false;
    }

    public final void x() {
        int i11 = 0;
        for (ViewGroup viewGroup : this.f71335n) {
            viewGroup.setOnClickListener(null);
            if (viewGroup.getVisibility() == 0 && !B(i11)) {
                C(viewGroup);
            }
            i11++;
        }
    }

    public final void y() {
        this.f71331j.setVisibility(0);
        this.f71332k.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        this.f71331j.startAnimation(alphaAnimation);
        this.f71332k.startAnimation(alphaAnimation);
    }

    public final void z() {
        List<MatchTestlib.RightOption> arr_right_options = this.f71323b.getArr_right_options();
        Collections.shuffle(arr_right_options);
        String str = "#" + Integer.toHexString(ThemeUtil.getThemeColorWithAttr(getActivity(), R.attr.color_progress));
        if (str.length() == 9) {
            str = "#" + str.substring(3);
        }
        int min = Math.min(2, arr_right_options.size());
        int i11 = 0;
        while (true) {
            if (i11 >= min) {
                break;
            }
            MatchTestlib.RightOption rightOption = arr_right_options.get(i11);
            this.f71325d.add(Integer.valueOf(rightOption.getEn_word_id()));
            c cVar = new c();
            cVar.f71342a = rightOption.getEn_word_id();
            cVar.f71343b = rightOption.getWord();
            cVar.f71344c = rightOption.getMean_cn();
            cVar.f71346e = rightOption.getArr_bing_sentences().get(0).getSentence_trans();
            String sentence = rightOption.getArr_bing_sentences().get(0).getSentence();
            cVar.f71345d = sentence;
            cVar.f71345d = sentence.replaceAll("<i>", "<font color=\"" + str + "\">").replaceAll("</i>", "</font>");
            this.f71326e.add(cVar);
            i11++;
        }
        List<MatchTestlib.Other> arr_other_options = this.f71323b.getArr_other_options();
        Collections.shuffle(arr_other_options);
        int min2 = Math.min(3, arr_other_options.size());
        for (int i12 = 0; i12 < min2; i12++) {
            MatchTestlib.Other other = arr_other_options.get(i12);
            c cVar2 = new c();
            cVar2.f71342a = other.getEn_word_id();
            cVar2.f71343b = other.getWord();
            cVar2.f71344c = other.getMean_cn();
            this.f71326e.add(cVar2);
        }
        Collections.shuffle(this.f71326e);
    }
}
