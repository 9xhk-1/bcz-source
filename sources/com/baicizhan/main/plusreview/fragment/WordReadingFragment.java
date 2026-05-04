package com.baicizhan.main.plusreview.fragment;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.client.business.widget.WordTextView;
import com.baicizhan.main.fragment.PatternBaseFragment;
import com.baicizhan.main.plusreview.fragment.WordReadingFragment;
import com.jiongji.andriod.card.R;
import com.xiaomi.mipush.sdk.Constants;
import gs.ej;
import i9.f;
import java.io.File;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.text.Regex;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;
import q9.x;
import qb0.h;
import rb.d;
import rf.h;
import rf.i;
import rf.j;
import u30.k0;
import va.g;
import xb.o;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordReadingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordReadingFragment.kt\ncom/baicizhan/main/plusreview/fragment/WordReadingFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,406:1\n1#2:407\n*E\n"})
/* loaded from: classes4.dex */
public final class WordReadingFragment extends PatternBaseFragment {

    @k
    public static final a F = new a(null);
    public static final int G = 8;
    public static final String H = WordReadingFragment.class.getSimpleName();
    public static final int I = 500;
    public static final int J = 10000;
    public static final int K = 1008;
    public static final int L = 70;
    public static final int M = -1;
    public static final int N = -2;
    public static final int O = -3;

    @k
    public static final String P = "<UNK>";

    @l
    public h A;

    @l
    public h B;

    @l
    public h C;
    public boolean D;
    public ej E;

    /* renamed from: s, reason: collision with root package name */
    public boolean f24698s;

    /* renamed from: t, reason: collision with root package name */
    @l
    public b f24699t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f24700u;

    /* renamed from: v, reason: collision with root package name */
    public int f24701v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f24702w;

    /* renamed from: x, reason: collision with root package name */
    @l
    public File f24703x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f24704y;

    /* renamed from: z, reason: collision with root package name */
    @l
    public String f24705z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final String a(@k String s11) {
            g0.p(s11, "s");
            return new Regex(" +").replace(new Regex("[-()/.]").replace(s11, " "), " ");
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a();

        void b();

        void onStart();

        void onStop();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends sa.c {
        public c() {
        }

        @Override // sa.c, android.view.View.OnClickListener
        public void onClick(View view) {
            super.onClick(view);
            b bVar = WordReadingFragment.this.f24699t;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public WordReadingFragment(@l Context context, @l AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.D = f.c(context, f.f60386n);
        LayoutInflater from = LayoutInflater.from(context);
        g0.o(from, "from(...)");
        p(from, this);
    }

    public static final void R(int i11, WordReadingFragment wordReadingFragment) {
        boolean z11 = false;
        if (i11 == 1) {
            g.g(R.string.word_reading_max_duration_tip, 0);
        } else if (i11 == -2 && DeviceUtil.isMeizu()) {
            g.g(R.string.word_reading_toast_no_record_permission_title, 0);
            z11 = true;
        }
        wordReadingFragment.o0(z11);
        wordReadingFragment.f0();
    }

    public static final boolean S(WordReadingFragment wordReadingFragment, Ref.LongRef longRef, Ref.LongRef longRef2, ej ejVar, View view, MotionEvent motionEvent) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!wordReadingFragment.f24698s) {
            long j11 = longRef.element;
            if (j11 == 0 || j11 + longRef2.element < elapsedRealtime) {
                qb.c.b(H, "request permission audio", new Object[0]);
                longRef.element = elapsedRealtime;
                b bVar = wordReadingFragment.f24699t;
                if (bVar != null) {
                    bVar.b();
                }
            }
            return false;
        }
        int action = motionEvent.getAction();
        ej ejVar2 = null;
        if (action != 0) {
            if (action == 1) {
                p0(wordReadingFragment, false, 1, null);
                return false;
            }
            if (action != 3) {
                return false;
            }
            wordReadingFragment.o0(true);
            return false;
        }
        if (!d.f(wordReadingFragment.getContext())) {
            g.g(R.string.toast_no_network_and_retry, 0);
            return true;
        }
        if (wordReadingFragment.D) {
            wordReadingFragment.setTipVisible(false);
            wordReadingFragment.D = false;
            f.j(wordReadingFragment.getContext(), f.f60386n, true);
        }
        WordTextView.Mode mode = ejVar.f54808m.getMode();
        WordTextView.Mode mode2 = WordTextView.Mode.NONE;
        if (mode != mode2) {
            ej ejVar3 = wordReadingFragment.E;
            if (ejVar3 == null) {
                g0.S("binding");
            } else {
                ejVar2 = ejVar3;
            }
            ejVar2.f54808m.setMode(mode2);
        }
        wordReadingFragment.n0();
        return false;
    }

    public static final void U(i iVar, WordReadingFragment wordReadingFragment) {
        if (iVar != null) {
            wordReadingFragment.setScoringResult(k0.n3(iVar.x(), P, false, 2, null) ? 100 : iVar.o() < 500 ? -1 : iVar.v());
        } else {
            g2 g2Var = g2.f100423a;
            wordReadingFragment.setScoringResult(-2);
        }
    }

    public static final g2 W(final WordReadingFragment wordReadingFragment, final j jVar) {
        int f11 = jVar.f();
        if (f11 == 0) {
            wordReadingFragment.T(jVar.g());
        } else if (f11 != 1) {
            wordReadingFragment.setScoringResult(-3);
        } else {
            Runnable runnable = new Runnable() { // from class: lh.j
                @Override // java.lang.Runnable
                public final void run() {
                    WordReadingFragment.X(WordReadingFragment.this, jVar);
                }
            };
            long y11 = jVar.g().y();
            qb.c.b(H, "wait for " + jVar.g().y(), new Object[0]);
            g2 g2Var = g2.f100423a;
            wordReadingFragment.postDelayed(runnable, y11);
        }
        return g2.f100423a;
    }

    public static final void X(WordReadingFragment wordReadingFragment, j jVar) {
        wordReadingFragment.V(jVar.g().u());
    }

    public static final void Y(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void Z(WordReadingFragment wordReadingFragment, Throwable th2) {
        qb.c.d(H, th2.getMessage(), new Object[0]);
        wordReadingFragment.setScoringResult(-2);
    }

    public static final g2 b0(final WordReadingFragment wordReadingFragment, final j jVar) {
        String str = H;
        qb.c.b(str, "requestRecordScore: " + jVar.f(), new Object[0]);
        int f11 = jVar.f();
        if (f11 == 0) {
            wordReadingFragment.T(jVar.g());
        } else if (f11 != 1) {
            wordReadingFragment.setScoringResult(-3);
        } else {
            Runnable runnable = new Runnable() { // from class: lh.i
                @Override // java.lang.Runnable
                public final void run() {
                    WordReadingFragment.c0(WordReadingFragment.this, jVar);
                }
            };
            long y11 = jVar.g().y();
            qb.c.b(str, "wait for " + jVar.g().y(), new Object[0]);
            g2 g2Var = g2.f100423a;
            wordReadingFragment.postDelayed(runnable, y11);
        }
        return g2.f100423a;
    }

    public static final void c0(WordReadingFragment wordReadingFragment, j jVar) {
        wordReadingFragment.V(jVar.g().u());
    }

    public static final void d0(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void e0(WordReadingFragment wordReadingFragment, Throwable th2) {
        qb.c.d(H, "requestRecordScore error: " + th2.getMessage(), new Object[0]);
        wordReadingFragment.setScoringResult(-2);
    }

    public static final g2 g0(final WordReadingFragment wordReadingFragment, float f11) {
        if (f11 <= 0.0f) {
            g.g(R.string.word_reading_toast_record_failed, 0);
            return g2.f100423a;
        }
        if (f11 <= 500.0f) {
            wordReadingFragment.setScoringResult(-1);
        } else {
            ej ejVar = wordReadingFragment.E;
            if (ejVar == null) {
                g0.S("binding");
                ejVar = null;
            }
            ejVar.f54808m.setMode(WordTextView.Mode.LOADING);
            Context context = wordReadingFragment.getContext();
            g0.o(context, "getContext(...)");
            String P2 = wordReadingFragment.P(context);
            h hVar = wordReadingFragment.A;
            if (hVar != null) {
                hVar.unsubscribe();
            }
            rx.c<rf.l> c11 = kh.c.f66526a.c(P2, 1008);
            final x00.l lVar = new x00.l() { // from class: lh.m
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 h02;
                    h02 = WordReadingFragment.h0(WordReadingFragment.this, (rf.l) obj);
                    return h02;
                }
            };
            wordReadingFragment.A = c11.u5(new wb0.b() { // from class: lh.n
                @Override // wb0.b
                public final void call(Object obj) {
                    WordReadingFragment.i0(x00.l.this, obj);
                }
            }, new wb0.b() { // from class: lh.o
                @Override // wb0.b
                public final void call(Object obj) {
                    WordReadingFragment.j0(WordReadingFragment.this, (Throwable) obj);
                }
            });
        }
        return g2.f100423a;
    }

    private final String getLogicRequestId() {
        UserRecord p11 = x.r().p();
        Integer valueOf = p11 != null ? Integer.valueOf(p11.getUniqueId()) : null;
        TopicRecord topicRecord = this.f20748i;
        return "bcz_" + valueOf + "_" + topicRecord.bookId + "_" + topicRecord.topicId + "_" + System.currentTimeMillis();
    }

    public static final g2 h0(WordReadingFragment wordReadingFragment, rf.l lVar) {
        if (lVar.f() == 0) {
            wordReadingFragment.f24705z = lVar.g().d();
            String logicRequestId = wordReadingFragment.getLogicRequestId();
            a aVar = F;
            String word = wordReadingFragment.f20748i.word;
            g0.o(word, "word");
            wordReadingFragment.a0(logicRequestId, aVar.a(word), wordReadingFragment.f24703x);
        } else {
            wordReadingFragment.setScoringResult(-3);
        }
        return g2.f100423a;
    }

    public static final void i0(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void j0(WordReadingFragment wordReadingFragment, Throwable th2) {
        qb.c.d(H, String.valueOf(th2), new Object[0]);
        wordReadingFragment.setScoringResult(-2);
    }

    private final void l0() {
        ej ejVar = this.E;
        ej ejVar2 = null;
        if (ejVar == null) {
            g0.S("binding");
            ejVar = null;
        }
        ejVar.f54803h.setAlpha(0.0f);
        ej ejVar3 = this.E;
        if (ejVar3 == null) {
            g0.S("binding");
            ejVar3 = null;
        }
        ejVar3.f54800e.setAlpha(0.0f);
        ej ejVar4 = this.E;
        if (ejVar4 == null) {
            g0.S("binding");
            ejVar4 = null;
        }
        ejVar4.f54803h.setVisibility(0);
        ej ejVar5 = this.E;
        if (ejVar5 == null) {
            g0.S("binding");
            ejVar5 = null;
        }
        ejVar5.f54800e.setVisibility(0);
        ej ejVar6 = this.E;
        if (ejVar6 == null) {
            g0.S("binding");
            ejVar6 = null;
        }
        ejVar6.f54803h.animate().alpha(1.0f).start();
        ej ejVar7 = this.E;
        if (ejVar7 == null) {
            g0.S("binding");
        } else {
            ejVar2 = ejVar7;
        }
        ejVar2.f54800e.animate().alpha(1.0f).start();
    }

    public static /* synthetic */ void p0(WordReadingFragment wordReadingFragment, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        wordReadingFragment.o0(z11);
    }

    private final void setScoringResult(int i11) {
        ej ejVar = null;
        if (i11 >= 70) {
            ej ejVar2 = this.E;
            if (ejVar2 == null) {
                g0.S("binding");
            } else {
                ejVar = ejVar2;
            }
            ejVar.f54808m.setMode(WordTextView.Mode.NORMAL);
            e(this.f20748i.topicId);
            return;
        }
        if (i11 == -1) {
            ej ejVar3 = this.E;
            if (ejVar3 == null) {
                g0.S("binding");
            } else {
                ejVar = ejVar3;
            }
            ejVar.f54808m.setMode(WordTextView.Mode.NONE);
            g.g(R.string.word_reading_toast_record_too_short, 0);
            return;
        }
        if (i11 == -2) {
            ej ejVar4 = this.E;
            if (ejVar4 == null) {
                g0.S("binding");
            } else {
                ejVar = ejVar4;
            }
            ejVar.f54808m.setMode(WordTextView.Mode.NONE);
            g.g(R.string.word_reading_toast_scoring_net_error, 0);
            return;
        }
        if (i11 == -3) {
            ej ejVar5 = this.E;
            if (ejVar5 == null) {
                g0.S("binding");
            } else {
                ejVar = ejVar5;
            }
            ejVar.f54808m.setMode(WordTextView.Mode.NONE);
            g.g(R.string.word_reading_toast_scoring_error, 0);
            return;
        }
        ej ejVar6 = this.E;
        if (ejVar6 == null) {
            g0.S("binding");
            ejVar6 = null;
        }
        ejVar6.f54808m.setMode(WordTextView.Mode.ERROR);
        this.f24701v++;
        ej ejVar7 = this.E;
        if (ejVar7 == null) {
            g0.S("binding");
        } else {
            ejVar = ejVar7;
        }
        if (ejVar.f54803h.getVisibility() == 0) {
            e(-1);
        } else {
            l0();
            f(-1, true);
        }
    }

    private final void setTipVisible(boolean z11) {
        ej ejVar = this.E;
        if (ejVar == null) {
            g0.S("binding");
            ejVar = null;
        }
        ejVar.f54807l.setVisibility(z11 ? 0 : 4);
    }

    public final void O() {
        h hVar = this.A;
        if (hVar != null) {
            hVar.unsubscribe();
        }
        h hVar2 = this.B;
        if (hVar2 != null) {
            hVar2.unsubscribe();
        }
        h hVar3 = this.C;
        if (hVar3 != null) {
            hVar3.unsubscribe();
        }
    }

    public final String P(Context context) {
        return Build.MODEL + Constants.ACCEPT_TIME_SEPARATOR_SERVER + Build.MANUFACTURER + Constants.ACCEPT_TIME_SEPARATOR_SERVER + o.a(context);
    }

    public final void Q(final int i11) {
        this.f24702w = false;
        post(new Runnable() { // from class: lh.h
            @Override // java.lang.Runnable
            public final void run() {
                WordReadingFragment.R(i11, this);
            }
        });
    }

    public final void T(final i iVar) {
        qb.c.b(H, "res: " + (iVar != null ? com.baicizhan.main.plusreview.fragment.a.b(iVar) : null), new Object[0]);
        post(new Runnable() { // from class: lh.q
            @Override // java.lang.Runnable
            public final void run() {
                WordReadingFragment.U(rf.i.this, this);
            }
        });
    }

    public final void V(String str) {
        qb.c.b(H, "queryRecordScore: " + this.f20748i.word + j2.O + str, new Object[0]);
        h hVar = this.C;
        if (hVar != null) {
            hVar.unsubscribe();
        }
        rx.c<j> a11 = kh.c.f66526a.a(str);
        final x00.l lVar = new x00.l() { // from class: lh.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 W;
                W = WordReadingFragment.W(WordReadingFragment.this, (rf.j) obj);
                return W;
            }
        };
        this.C = a11.u5(new wb0.b() { // from class: lh.k
            @Override // wb0.b
            public final void call(Object obj) {
                WordReadingFragment.Y(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: lh.l
            @Override // wb0.b
            public final void call(Object obj) {
                WordReadingFragment.Z(WordReadingFragment.this, (Throwable) obj);
            }
        });
    }

    public final void a0(String str, String str2, File file) {
        if (file == null || !file.exists()) {
            qb.c.d(H, file + " not exist", new Object[0]);
            return;
        }
        qb.c.b(H, "transcript: " + this.f20748i.word + j2.O + str2, new Object[0]);
        h hVar = this.B;
        if (hVar != null) {
            hVar.unsubscribe();
        }
        kh.c cVar = kh.c.f66526a;
        String str3 = this.f24705z;
        g0.m(str3);
        rx.c<j> b11 = cVar.b(str3, str, str2, file);
        final x00.l lVar = new x00.l() { // from class: lh.r
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 b02;
                b02 = WordReadingFragment.b0(WordReadingFragment.this, (rf.j) obj);
                return b02;
            }
        };
        this.B = b11.u5(new wb0.b() { // from class: lh.s
            @Override // wb0.b
            public final void call(Object obj) {
                WordReadingFragment.d0(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: lh.f
            @Override // wb0.b
            public final void call(Object obj) {
                WordReadingFragment.e0(WordReadingFragment.this, (Throwable) obj);
            }
        });
    }

    public final void f0() {
        if (this.f24704y) {
            this.f24704y = false;
            return;
        }
        h.a aVar = rf.h.f83975g;
        Context context = getContext();
        g0.o(context, "getContext(...)");
        aVar.e(context, this.f24703x, new x00.l() { // from class: lh.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 g02;
                g02 = WordReadingFragment.g0(WordReadingFragment.this, ((Float) obj).floatValue());
                return g02;
            }
        });
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public boolean k() {
        if (this.f24700u) {
            return false;
        }
        this.f24700u = true;
        return true;
    }

    public final void k0() {
        ej ejVar = this.E;
        ej ejVar2 = null;
        if (ejVar == null) {
            g0.S("binding");
            ejVar = null;
        }
        ejVar.f54808m.setMode(WordTextView.Mode.NONE);
        ej ejVar3 = this.E;
        if (ejVar3 == null) {
            g0.S("binding");
            ejVar3 = null;
        }
        ejVar3.f54803h.setVisibility(4);
        ej ejVar4 = this.E;
        if (ejVar4 == null) {
            g0.S("binding");
            ejVar4 = null;
        }
        ejVar4.f54800e.setVisibility(4);
        ej ejVar5 = this.E;
        if (ejVar5 == null) {
            g0.S("binding");
        } else {
            ejVar2 = ejVar5;
        }
        ejVar2.f54804i.setVisibility(4);
        this.f24701v = 0;
    }

    public final void m0() {
        ej ejVar = this.E;
        ej ejVar2 = null;
        if (ejVar == null) {
            g0.S("binding");
            ejVar = null;
        }
        if (ejVar.f54804i.getVisibility() != 0) {
            ej ejVar3 = this.E;
            if (ejVar3 == null) {
                g0.S("binding");
                ejVar3 = null;
            }
            ejVar3.f54804i.setAlpha(0.0f);
            ej ejVar4 = this.E;
            if (ejVar4 == null) {
                g0.S("binding");
                ejVar4 = null;
            }
            ejVar4.f54804i.setVisibility(0);
            ej ejVar5 = this.E;
            if (ejVar5 == null) {
                g0.S("binding");
            } else {
                ejVar2 = ejVar5;
            }
            ejVar2.f54804i.animate().alpha(1.0f).setStartDelay(150L).start();
        }
    }

    public final void n0() {
        this.f24702w = true;
        ej ejVar = this.E;
        ej ejVar2 = null;
        if (ejVar == null) {
            g0.S("binding");
            ejVar = null;
        }
        ejVar.f54806k.setText(getResources().getString(R.string.review_record_state_unpress_done));
        ej ejVar3 = this.E;
        if (ejVar3 == null) {
            g0.S("binding");
        } else {
            ejVar2 = ejVar3;
        }
        ejVar2.f54805j.A();
        O();
        b bVar = this.f24699t;
        if (bVar != null) {
            bVar.onStart();
        }
    }

    public final void o0(boolean z11) {
        b bVar;
        ej ejVar = this.E;
        ej ejVar2 = null;
        if (ejVar == null) {
            g0.S("binding");
            ejVar = null;
        }
        ejVar.f54806k.setText(getResources().getString(R.string.review_record_state_press_record));
        ej ejVar3 = this.E;
        if (ejVar3 == null) {
            g0.S("binding");
            ejVar3 = null;
        }
        ejVar3.f54805j.m();
        ej ejVar4 = this.E;
        if (ejVar4 == null) {
            g0.S("binding");
        } else {
            ejVar2 = ejVar4;
        }
        ejVar2.f54805j.setFrame(0);
        this.f24704y = z11;
        if (!this.f24702w || (bVar = this.f24699t) == null) {
            return;
        }
        bVar.onStop();
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    @k
    public View p(@k LayoutInflater inflater, @k ViewGroup container) {
        g0.p(inflater, "inflater");
        g0.p(container, "container");
        final ej d11 = ej.d(inflater, container, true);
        g0.m(d11);
        this.E = d11;
        d11.f54804i.setOnClickListener(new c());
        final Ref.LongRef longRef = new Ref.LongRef();
        final Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = 1000L;
        d11.f54797b.setOnTouchListener(new View.OnTouchListener() { // from class: lh.p
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean S;
                S = WordReadingFragment.S(WordReadingFragment.this, longRef, longRef2, d11, view, motionEvent);
                return S;
            }
        });
        if (!this.D) {
            setTipVisible(true);
            this.D = true;
        }
        this.f24698s = ContextCompat.checkSelfPermission(getContext(), "android.permission.RECORD_AUDIO") == 0;
        ConstraintLayout root = d11.getRoot();
        g0.o(root, "getRoot(...)");
        return root;
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void q() {
        super.q();
        qb.c.b(H, "detached", new Object[0]);
        O();
    }

    public final void q0() {
        if (this.f24701v >= 3) {
            m0();
        }
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void r() {
        ej ejVar = this.E;
        ej ejVar2 = null;
        if (ejVar == null) {
            g0.S("binding");
            ejVar = null;
        }
        WordTextView wordTextView = ejVar.f54808m;
        String word = this.f20748i.word;
        g0.o(word, "word");
        wordTextView.setWord(word);
        ej ejVar3 = this.E;
        if (ejVar3 == null) {
            g0.S("binding");
            ejVar3 = null;
        }
        ejVar3.f54809n.setText(this.f20748i.wordMean);
        ej ejVar4 = this.E;
        if (ejVar4 == null) {
            g0.S("binding");
            ejVar4 = null;
        }
        ejVar4.f54803h.setText(this.f20748i.word);
        ej ejVar5 = this.E;
        if (ejVar5 == null) {
            g0.S("binding");
        } else {
            ejVar2 = ejVar5;
        }
        ejVar2.f54800e.setText(this.f20748i.phonetic);
    }

    public final void setOnWordReadingListener(@k b l11) {
        g0.p(l11, "l");
        this.f24699t = l11;
    }

    public final void setOutputFile(@k File file) {
        g0.p(file, "file");
        this.f24703x = file;
    }

    public final void setRecordPermissionGranted(boolean z11) {
        this.f24698s = z11;
    }

    public WordReadingFragment(@l Context context, int i11) {
        this(context, null, 0, i11);
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void w() {
    }

    @Override // com.baicizhan.main.fragment.PatternBaseFragment
    public void j(boolean z11) {
    }
}
