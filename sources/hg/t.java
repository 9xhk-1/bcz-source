package hg;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.baicizhan.client.business.dataset.models.SimilarWordRecord;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.util.TopicTextRenderHelper;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.jiongji.andriod.card.R;
import m9.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class t extends Dialog implements View.OnClickListener {

    /* renamed from: j, reason: collision with root package name */
    public static final String f59313j = "SimilarWordDialog";

    /* renamed from: a, reason: collision with root package name */
    public SimilarWordRecord f59314a;

    /* renamed from: b, reason: collision with root package name */
    public TopicRecord f59315b;

    /* renamed from: c, reason: collision with root package name */
    public TopicRecord f59316c;

    /* renamed from: d, reason: collision with root package name */
    public int f59317d;

    /* renamed from: e, reason: collision with root package name */
    public View f59318e;

    /* renamed from: f, reason: collision with root package name */
    public com.baicizhan.client.framework.audio.a f59319f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f59320g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f59321h;

    /* renamed from: i, reason: collision with root package name */
    public qb0.h f59322i;

    public t(Context context, SimilarWordRecord similarRecord, TopicRecord mMainTopic, TopicRecord mSimilarTopic, com.baicizhan.client.framework.audio.a audioPlayer) {
        super(context, R.style.SimilarDialogStyle);
        this.f59319f = audioPlayer;
        this.f59315b = mMainTopic;
        this.f59314a = similarRecord;
        this.f59316c = mSimilarTopic;
        b();
    }

    public void b() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.fragment_wiki_diff_portrait, (ViewGroup) null, false);
        setContentView(inflate, new ViewGroup.LayoutParams(-1, -1));
        this.f59318e = inflate.findViewById(R.id.panel);
        this.f59317d = getContext().getResources().getColor(R.color.main_blue);
        Pair<SpannableString, SpannableString> c11 = c(this.f59315b.word, this.f59316c.word);
        View findViewById = inflate.findViewById(R.id.topic1);
        d(findViewById, this.f59315b, (SpannableString) c11.first);
        this.f59320g = (ImageView) findViewById.findViewById(R.id.accent_voice);
        View findViewById2 = inflate.findViewById(R.id.topic2);
        d(findViewById2, this.f59316c, (SpannableString) c11.second);
        this.f59321h = (ImageView) findViewById2.findViewById(R.id.accent_voice);
        findViewById(R.id.close).setOnClickListener(this);
    }

    public final Pair<SpannableString, SpannableString> c(String a11, String b11) {
        f9.b bVar = new f9.b();
        Pair<SpannableString, SpannableString> pair = new Pair<>(new SpannableString(a11), new SpannableString(b11));
        float c11 = bVar.c(a11, b11);
        if (c11 < a11.length() * 0.5f && c11 < b11.length() * 0.5f) {
            return pair;
        }
        int[] a12 = bVar.a();
        int[] b12 = bVar.b();
        f((SpannableString) pair.first, a12[0], a12[1], this.f59317d);
        f((SpannableString) pair.second, b12[0], b12[1], this.f59317d);
        return pair;
    }

    public final void d(View view, TopicRecord record, SpannableString hlWord) {
        view.setOnClickListener(this);
        ((TextView) view.findViewById(R.id.topic_word)).setText(hlWord);
        ((TextView) view.findViewById(R.id.topic_phonetic)).setText(record.phonetic);
        ((TextView) view.findViewById(R.id.topic_mean_cn)).setText(record.wordMean);
        TextView textView = (TextView) view.findViewById(R.id.topic_sentence);
        int color = getContext().getResources().getColor(R.color.main_blue);
        TopicTextRenderHelper.TopicTextRender.with(record.sentence).highlightColor(color).highlightKey(record.word).highlightPhrase(record.sentencePhrase, getContext().getResources().getColor(R.color.main_color_weak_divider)).into(textView);
        ((TextView) view.findViewById(R.id.topic_sentence_mean_cn)).setText(record.sentenceTrans);
    }

    public final void e(int id2) {
        qb0.h hVar = this.f59322i;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f59322i.unsubscribe();
        }
        TopicRecord topicRecord = id2 == R.id.topic1 ? this.f59315b : this.f59316c;
        this.f59322i = m9.d.d().f(topicRecord.word, topicRecord.getUniverseTopicId()).I3(tb0.a.a()).r5(new a(id2 == R.id.topic1 ? this.f59320g : this.f59321h, id2 != R.id.topic1 ? this.f59320g : this.f59321h));
    }

    public final void f(SpannableString s11, int start, int end, int color) {
        s11.setSpan(new ForegroundColorSpan(color), start, end, 33);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        switch (id2) {
            case R.id.close /* 2131362149 */:
                dismiss();
                break;
            case R.id.topic1 /* 2131363829 */:
            case R.id.topic2 /* 2131363830 */:
                e(id2);
                break;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<d.c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ImageView f59323a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ImageView f59324b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: hg.t$a$a, reason: collision with other inner class name */
        public class C0674a implements IAudioPlayer.b {
            public C0674a() {
            }

            @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
            public void onPlayStateChanged(IAudioPlayer.State state) {
                if (state == IAudioPlayer.State.Completed || state == IAudioPlayer.State.Stopped) {
                    AnimationDrawable animationDrawable = (AnimationDrawable) a.this.f59323a.getTag();
                    if (animationDrawable != null) {
                        animationDrawable.stop();
                    }
                    a.this.f59323a.setImageResource(R.drawable.ic_searchwords_voice_2);
                    return;
                }
                if (state == IAudioPlayer.State.Playing) {
                    AnimationDrawable animationDrawable2 = (AnimationDrawable) a.this.f59323a.getTag();
                    if (animationDrawable2 != null) {
                        animationDrawable2.start();
                    }
                    a.this.f59323a.setImageDrawable(animationDrawable2);
                }
            }
        }

        public a(final ImageView val$voiceCurrent, final ImageView val$voiceOther) {
            this.f59323a = val$voiceCurrent;
            this.f59324b = val$voiceOther;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            va.g.i("获取单词语音失败", 0);
            qb.c.c(t.f59313j, "", e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(d.c fileInfo) {
            t.this.f59319f.f(new C0674a());
            fileInfo.a(t.this.f59319f);
            if (this.f59323a.getTag() == null) {
                this.f59323a.setTag(t.this.getContext().getResources().getDrawable(R.drawable.animation_searchwords_voice));
            }
            this.f59324b.setImageResource(R.drawable.ic_searchwords_voice_2);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
