package tj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.models.UniverseTopicId;
import com.baicizhan.client.business.dataset.models.lookup.DictionaryRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.wikiv2.activity.WikiBasicInfo;
import com.baicizhan.main.wikiv2.activity.WikiPagerActivity;
import com.baicizhan.main.wikiv2.activity.WikiType;
import com.baicizhan.main.wikiv2.studyv2.data.EntryAction;
import com.baicizhan.main.wikiv2.studyv2.data.EntryPage;
import com.baicizhan.main.wikiv2.studyv2.data.u0;
import com.baicizhan.main.wordlist.activity.WordListFragment;
import com.baicizhan.main.wordlist.activity.WordListItem;
import com.baicizhan.online.resource_api.GetTopicResourceChannel;
import com.chauthai.swipereveallayout.SwipeRevealLayout;
import com.jiongji.andriod.card.R;
import gi.h0;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import m9.d;
import tj.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class c0 implements View.OnClickListener {
    public static IAudioPlayer A = null;

    /* renamed from: y, reason: collision with root package name */
    public static final String f90660y = "WordListItemViewHolder";

    /* renamed from: z, reason: collision with root package name */
    public static final int f90661z = 2;

    /* renamed from: a, reason: collision with root package name */
    public int f90662a;

    /* renamed from: b, reason: collision with root package name */
    public WordListItem f90663b;

    /* renamed from: c, reason: collision with root package name */
    public SwipeRevealLayout f90664c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f90665d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f90666e;

    /* renamed from: f, reason: collision with root package name */
    public LinearLayout f90667f;

    /* renamed from: g, reason: collision with root package name */
    public ImageView f90668g;

    /* renamed from: h, reason: collision with root package name */
    public ImageView f90669h;

    /* renamed from: i, reason: collision with root package name */
    public FrameLayout f90670i;

    /* renamed from: j, reason: collision with root package name */
    public FrameLayout f90671j;

    /* renamed from: k, reason: collision with root package name */
    public ImageView f90672k;

    /* renamed from: l, reason: collision with root package name */
    public View f90673l;

    /* renamed from: m, reason: collision with root package name */
    public View f90674m;

    /* renamed from: n, reason: collision with root package name */
    public View f90675n;

    /* renamed from: o, reason: collision with root package name */
    public View f90676o;

    /* renamed from: p, reason: collision with root package name */
    public View f90677p;

    /* renamed from: q, reason: collision with root package name */
    public View f90678q;

    /* renamed from: r, reason: collision with root package name */
    public View f90679r;

    /* renamed from: s, reason: collision with root package name */
    public View f90680s;

    /* renamed from: t, reason: collision with root package name */
    public u f90681t;

    /* renamed from: u, reason: collision with root package name */
    public Context f90682u;

    /* renamed from: v, reason: collision with root package name */
    public qb0.h f90683v;

    /* renamed from: w, reason: collision with root package name */
    public va.f f90684w;

    /* renamed from: x, reason: collision with root package name */
    public qb0.g<d.c> f90685x;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends sa.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WordListItem f90686a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: tj.c0$a$a, reason: collision with other inner class name */
        public class C1205a extends HashMap<String, Object> {
            public C1205a() {
                put(ma.b.H1, ma.v.f73053x[c0.this.f90681t.f90753j - 1]);
                put("topic_id", Integer.valueOf(UniverseTopicId.getTopicId(a.this.f90686a.n())));
                put("click_type", "collect");
            }
        }

        public a(final WordListItem val$data) {
            this.f90686a = val$data;
        }

        public final /* synthetic */ void c(Boolean bool, long[] jArr) {
            if (bool != null) {
                c0.this.p(bool.booleanValue());
            }
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View v11) {
            super.onClick(v11);
            if (c0.this.h() != null) {
                c0.this.h().r(nj.a.a(this.f90686a), new hj.o() { // from class: tj.b0
                    @Override // hj.o
                    public final void a(Boolean bool, long[] jArr) {
                        c0.a.this.c(bool, jArr);
                    }
                });
            }
            q9.x.r().a(4);
            ma.l.e(ma.t.f73011j, ma.a.f72774j5, new HashMap(new C1205a()));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends HashMap<String, Object> {
        public b() {
            put(ma.b.H1, ma.v.f73053x[c0.this.f90681t.f90753j - 1]);
            put(ma.b.G0, (c0.this.f90663b.l() & 1) == 0 ? ma.v.f73051v : ma.v.f73050u);
            put("topic_id", Integer.valueOf(UniverseTopicId.getTopicId(c0.this.f90663b.n())));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends HashMap<String, Object> {
        public c() {
            put(ma.b.H1, ma.v.f73053x[c0.this.f90681t.f90753j - 1]);
            put("topic_id", Integer.valueOf(UniverseTopicId.getTopicId(c0.this.f90663b.n())));
            put("click_type", "hash");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends HashMap<String, Object> {
        public d() {
            put(ma.b.H1, ma.v.f73053x[c0.this.f90681t.f90753j - 1]);
            put("topic_id", Integer.valueOf(UniverseTopicId.getTopicId(c0.this.f90663b.n())));
            put("click_type", "search");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements IAudioPlayer.b {
        @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
        public void onPlayStateChanged(IAudioPlayer.State state) {
            qb.c.d(c0.f90660y, "onPlayStateChanged status = " + state.toString(), new Object[0]);
            if (state == IAudioPlayer.State.Completed) {
                c0.A.destroy();
                c0.A = null;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements IAudioPlayer.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f90694a;

        public g(final File val$audioFile) {
            this.f90694a = val$audioFile;
        }

        @Override // com.baicizhan.client.framework.audio.IAudioPlayer.a
        public void onPlayError(int i11, int i12) {
            qb.c.d(c0.f90660y, "play voice failed onPlayError i = " + i11 + "i1 = " + i12, new Object[0]);
            c0.A.destroy();
            c0.A = null;
            File file = this.f90694a;
            if (file != null) {
                file.deleteOnExit();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ TextView f90696a;

        public i(final TextView val$textView) {
            this.f90696a = val$textView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            TextView textView = this.f90696a;
            textView.setTextColor(textView.getResources().getColorStateList(R.color.word_list_word_color));
        }
    }

    public c0(@NonNull u adapter, Context context, View root) {
        this.f90681t = adapter;
        this.f90664c = (SwipeRevealLayout) root.findViewById(R.id.swipe_layout);
        this.f90674m = root.findViewById(R.id.divider_bottom);
        this.f90675n = root.findViewById(R.id.main_item);
        this.f90665d = (TextView) root.findViewById(R.id.word);
        this.f90666e = (TextView) root.findViewById(R.id.mean_cn);
        this.f90673l = root.findViewById(R.id.divider);
        this.f90668g = (ImageView) root.findViewById(R.id.collect);
        this.f90670i = (FrameLayout) root.findViewById(R.id.kill_switcher);
        this.f90672k = (ImageView) root.findViewById(R.id.detail);
        this.f90667f = (LinearLayout) root.findViewById(R.id.right);
        this.f90669h = (ImageView) root.findViewById(R.id.collect_r);
        this.f90671j = (FrameLayout) root.findViewById(R.id.kill_switcher_r);
        this.f90677p = root.findViewById(R.id.cancel_kill);
        this.f90679r = root.findViewById(R.id.cancel_kill_r);
        this.f90678q = root.findViewById(R.id.kill);
        this.f90680s = root.findViewById(R.id.kill_r);
        this.f90676o = root.findViewById(R.id.bottom_view);
        this.f90682u = context;
    }

    public static void j(Context context, final File audioFile, TopicRecord record) {
        Context applicationContext = context.getApplicationContext();
        if (A == null) {
            A = new q9.l(applicationContext);
        }
        A.f(new f());
        A.j(new g(audioFile));
        if (audioFile != null) {
            A.e(audioFile);
            A.play();
        } else if (record != null) {
            ZPackUtils.loadAudioCompat(A, record, record.wordAudio);
        }
    }

    public final void g() {
        va.f fVar = this.f90684w;
        if (fVar != null) {
            fVar.dismiss();
            this.f90684w = null;
        }
    }

    public final hj.m h() {
        Object obj = this.f90682u;
        if (obj instanceof hj.n) {
            return ((hj.n) obj).l0();
        }
        return null;
    }

    public final /* synthetic */ void i(int i11, List list) {
        p(list.contains(Integer.valueOf(i11)));
    }

    public void k(WordListItem data, int style) {
        this.f90663b = data;
        this.f90665d.setText(data.o());
        this.f90665d.setOnClickListener(this);
        r();
        this.f90675n.setOnClickListener(this);
        this.f90667f.setOnClickListener(this);
        this.f90676o.setOnClickListener(this);
        o();
        a aVar = new a(data);
        this.f90668g.setOnClickListener(aVar);
        this.f90669h.setOnClickListener(aVar);
        this.f90672k.setOnClickListener(this);
        this.f90673l.setVisibility(data.r() ? 0 : 4);
        this.f90674m.setVisibility(data.r() ? 0 : 4);
        if ((style & 2) <= 0) {
            this.f90670i.setVisibility(8);
            this.f90671j.setVisibility(8);
            return;
        }
        this.f90670i.setVisibility(0);
        this.f90671j.setVisibility(0);
        q();
        this.f90670i.setOnClickListener(this);
        this.f90671j.setOnClickListener(this);
    }

    public void l(View view, int topicId, int bookId) {
        Context context = view.getContext();
        if (context != null) {
            GetTopicResourceChannel getTopicResourceChannel = GetTopicResourceChannel.LOOK_UP;
            int j11 = this.f90681t.j();
            if (j11 == 1) {
                getTopicResourceChannel = GetTopicResourceChannel.WORD_LIST_LEARNED;
            } else if (j11 == 2) {
                getTopicResourceChannel = GetTopicResourceChannel.WORD_LIST_UNLEARNED;
            } else if (j11 == 3) {
                getTopicResourceChannel = GetTopicResourceChannel.WORD_LIST_KILLED;
            } else if (j11 == 4) {
                getTopicResourceChannel = GetTopicResourceChannel.WORD_LIST_COLLECTED;
            }
            GetTopicResourceChannel getTopicResourceChannel2 = getTopicResourceChannel;
            u0 u0Var = u0.f26107a;
            u0Var.q(EntryPage.WORD_LIST);
            u0Var.p(EntryAction.CLICK);
            u0Var.j();
            WikiPagerActivity.f25543f.b(context, WikiType.WORD_LIST_WIKI, this.f90681t.k(), new WikiBasicInfo(topicId, bookId), getTopicResourceChannel2);
        }
    }

    public void m(final View view) {
        qb0.g<d.c> gVar = this.f90685x;
        if (gVar != null && !gVar.isUnsubscribed()) {
            this.f90685x.unsubscribe();
        }
        this.f90685x = new e(view);
        m9.d.d().f(this.f90663b.o(), this.f90663b.n()).I3(tb0.a.a()).r5(this.f90685x);
    }

    public void n(WordListItem item, final View view) {
        int bookId = UniverseTopicId.getBookId(item.n());
        int topicId = UniverseTopicId.getTopicId(item.n());
        if (view.getContext() == null) {
            qb.c.i(f90660y, "ERROR !! null == context", new Object[0]);
        } else {
            l(view, topicId, bookId);
        }
    }

    public final void o() {
        final int topicId = UniverseTopicId.getTopicId(this.f90663b.n());
        if (h() != null) {
            h().D(new hj.a() { // from class: tj.a0
                @Override // hj.a
                public final void onResult(Object obj) {
                    c0.this.i(topicId, (List) obj);
                }
            });
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int id2 = v11.getId();
        if (id2 == R.id.main_item) {
            if ((this.f90663b.l() & 1) == 0) {
                this.f90663b.a(1);
            } else {
                this.f90663b.s(1);
            }
            r();
            WordListFragment wordListFragment = this.f90681t.f90754k;
            WordListItem wordListItem = this.f90663b;
            wordListFragment.K(wordListItem, (wordListItem.l() & 1) > 0);
            ma.l.e(ma.t.f73011j, ma.a.f72760h5, new HashMap(new b()));
            return;
        }
        if (id2 != R.id.kill_switcher && id2 != R.id.kill_switcher_r) {
            if (id2 == R.id.detail) {
                n(this.f90663b, v11);
                ma.l.e(ma.t.f73011j, ma.a.f72774j5, new HashMap(new d()));
                return;
            } else {
                if (id2 == R.id.word) {
                    m(v11);
                    s((TextView) v11);
                    return;
                }
                return;
            }
        }
        int topicId = UniverseTopicId.getTopicId(this.f90663b.n());
        if (this.f90678q.getVisibility() != 0) {
            LearnRecordManager.A().l(topicId);
        } else {
            h0.a().b(this.f90664c.getContext(), R.raw.chop);
            LearnRecordManager.A().U(topicId, 0L, 0);
            r3 = true;
        }
        q();
        this.f90681t.f90754k.J(topicId, r3);
        q9.x.r().a(4);
        ma.l.e(ma.t.f73011j, ma.a.f72774j5, new HashMap(new c()));
    }

    public final void p(boolean selected) {
        this.f90668g.setSelected(selected);
        this.f90669h.setSelected(selected);
    }

    public final void q() {
        int bookId = UniverseTopicId.getBookId(this.f90663b.n());
        int topicId = UniverseTopicId.getTopicId(this.f90663b.n());
        if (bookId != LearnRecordManager.A().z()) {
            qb.c.d(f90660y, "update kill status error, bookId: %d, topicId: %d, lmrBookId: %d", Integer.valueOf(bookId), Integer.valueOf(topicId), Integer.valueOf(LearnRecordManager.A().z()));
            this.f90670i.setVisibility(4);
            this.f90671j.setVisibility(4);
        } else {
            boolean R = LearnRecordManager.A().R(topicId);
            this.f90678q.setVisibility(!R ? 0 : 4);
            this.f90680s.setVisibility(!R ? 0 : 4);
            this.f90677p.setVisibility(R ? 0 : 4);
            this.f90679r.setVisibility(R ? 0 : 4);
        }
    }

    public final void r() {
        if ((this.f90663b.l() & 1) == 0) {
            this.f90666e.setText("");
            TextView textView = this.f90666e;
            textView.setBackgroundColor(textView.getContext().getResources().getColor(R.color.main_color_item_press));
            return;
        }
        if (TextUtils.isEmpty(this.f90663b.p())) {
            int topicId = UniverseTopicId.getTopicId(this.f90663b.n());
            DictionaryRecord a11 = i9.i.a(this.f90664c.getContext(), topicId);
            if (a11 != null) {
                this.f90663b.y(a11.meanCn);
                this.f90663b.t(a11.accent);
            } else {
                qb.c.d(f90660y, "cant find topic with id " + topicId, new Object[0]);
            }
        }
        this.f90666e.setText(this.f90663b.p());
        this.f90666e.setBackgroundColor(0);
    }

    public final void s(TextView textView) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(textView, "textColor", textView.getResources().getColor(R.color.main_color_main_word), textView.getResources().getColor(R.color.main_color_blue_light), textView.getResources().getColor(R.color.main_color_main_word));
        ofInt.setDuration(800L);
        ofInt.setEvaluator(new h());
        ofInt.addListener(new i(textView));
        ofInt.start();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends qb0.g<d.c> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f90692a;

        public e(final View val$view) {
            this.f90692a = val$view;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.d(c0.f90660y, "getVoice failed" + e11.getMessage(), new Object[0]);
            if (this.f90692a.getContext() != null) {
                va.g.i("获取单词语音失败", 0);
            }
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(d.c file) {
            Context context = this.f90692a.getContext();
            if (context == null) {
                qb.c.d(c0.f90660y, "play voice failed context = null", new Object[0]);
            } else {
                c0.j(context, file.f72698a, file.f72699b);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements TypeEvaluator {
        public h() {
        }

        @Override // android.animation.TypeEvaluator
        public Object evaluate(float fraction, Object startValue, Object endValue) {
            return endValue;
        }
    }
}
