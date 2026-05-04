package com.baicizhan.main.wikiv2.lookup.wikiv2;

import a00.l1;
import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.baicizhan.app.api.service.model.BookLanguageType;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.activity.errorfb.WordErrorFeedbackActivity;
import com.baicizhan.main.wikiv2.lookup.data.WordBugData;
import com.baicizhan.online.resource_api.WordBugType;
import com.jiongji.andriod.card.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import k3.j3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import l3.j2;
import l3.k2;
import l3.y2;
import si.c;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@av.b
@u0({"SMAP\nWikiSceneViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WikiSceneViewModel.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/WikiSceneViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,367:1\n1563#2:368\n1634#2,3:369\n1869#2,2:372\n*S KotlinDebug\n*F\n+ 1 WikiSceneViewModel.kt\ncom/baicizhan/main/wikiv2/lookup/wikiv2/WikiSceneViewModel\n*L\n173#1:368\n173#1:369,3\n198#1:372,2\n*E\n"})
/* loaded from: classes3.dex */
public final class o0 extends ViewModel {

    @m80.k
    public static final a B = new a(null);
    public static final int C = 8;

    @m80.k
    public static final String D = "WikiSceneViewModel";

    @m80.k
    public static final String E = "lookup";

    @m80.k
    public static final String F = "wordlist";

    @m80.k
    public final LiveData<String> A;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Application f25678a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final k3.s0 f25679b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final j3 f25680c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public String f25681d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<si.c> f25682e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final LiveData<si.c> f25683f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<List<Object>> f25684g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f25685h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final LiveData<Boolean> f25686i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Throwable> f25687j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final LiveData<Throwable> f25688k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<y2> f25689l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final LiveData<y2> f25690m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<BookLanguageType> f25691n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final LiveData<BookLanguageType> f25692o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f25693p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final LiveData<Boolean> f25694q;

    /* renamed from: r, reason: collision with root package name */
    public int f25695r;

    /* renamed from: s, reason: collision with root package name */
    public int f25696s;

    /* renamed from: t, reason: collision with root package name */
    @m80.l
    public hj.m f25697t;

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public final yz.c0 f25698u;

    /* renamed from: v, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f25699v;

    /* renamed from: w, reason: collision with root package name */
    @m80.k
    public final LiveData<Boolean> f25700w;

    /* renamed from: x, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f25701x;

    /* renamed from: y, reason: collision with root package name */
    @m80.k
    public final LiveData<Boolean> f25702y;

    /* renamed from: z, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<String> f25703z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25704a;

        static {
            int[] iArr = new int[IAudioPlayer.State.values().length];
            try {
                iArr[IAudioPlayer.State.Playing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IAudioPlayer.State.Stopped.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IAudioPlayer.State.Completed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f25704a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wikiv2.lookup.wikiv2.WikiSceneViewModel$loadWordAccentSetting$1", f = "WikiSceneViewModel.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f25705a;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return o0.this.new c(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f25705a;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    k3.s0 s0Var = o0.this.f25679b;
                    this.f25705a = 1;
                    obj = s0Var.i0(this);
                    if (obj == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                String str = (String) ((Map) obj).get("accent");
                o0.this.f25693p.setValue(l00.a.a(!kotlin.jvm.internal.g0.g(str, "0")));
                qb.c.b(o0.D, "用户发音设置: accent=" + str + ", isUsAccent=" + o0.this.f25693p.getValue(), new Object[0]);
            } catch (Exception e11) {
                qb.c.c(o0.D, "加载发音设置失败", e11);
                o0.this.f25693p.setValue(l00.a.a(true));
            }
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.wikiv2.lookup.wikiv2.WikiSceneViewModel$requestWiki$1", f = "WikiSceneViewModel.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {137, 150, 154}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-WikiSceneViewModel$requestWiki$1$1", "$this$launch", "$this$invokeSuspend_u24lambda_u243", "$i$a$-runCatching-WikiSceneViewModel$requestWiki$1$4", "$this$launch", "$this$invokeSuspend_u24lambda_u243", "$i$a$-runCatching-WikiSceneViewModel$requestWiki$1$4"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0"}, v = 1)
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f25707a;

        /* renamed from: b, reason: collision with root package name */
        public int f25708b;

        /* renamed from: c, reason: collision with root package name */
        public int f25709c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f25710d;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f25712f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f25713g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i11, int i12, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f25712f = i11;
            this.f25713g = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            d dVar = o0.this.new d(this.f25712f, this.f25713g, cVar);
            dVar.f25710d = obj;
            return dVar;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x013d, code lost:
        
            if (r13 == r1) goto L48;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x015b  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0199  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0101 A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:8:0x001f, B:9:0x0140, B:10:0x0142, B:24:0x0033, B:25:0x011c, B:36:0x00f5, B:38:0x0101, B:42:0x0125), top: B:2:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0125 A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:8:0x001f, B:9:0x0140, B:10:0x0142, B:24:0x0033, B:25:0x011c, B:36:0x00f5, B:38:0x0101, B:42:0x0125), top: B:2:0x0013 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 435
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.wikiv2.lookup.wikiv2.o0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public o0(@m80.k Application application, @m80.k k3.s0 gameService, @m80.k j3 topicResourceService) {
        kotlin.jvm.internal.g0.p(application, "application");
        kotlin.jvm.internal.g0.p(gameService, "gameService");
        kotlin.jvm.internal.g0.p(topicResourceService, "topicResourceService");
        this.f25678a = application;
        this.f25679b = gameService;
        this.f25680c = topicResourceService;
        this.f25681d = "lookup";
        MutableLiveData<si.c> mutableLiveData = new MutableLiveData<>();
        this.f25682e = mutableLiveData;
        this.f25683f = mutableLiveData;
        this.f25684g = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.f25685h = mutableLiveData2;
        this.f25686i = mutableLiveData2;
        MutableLiveData<Throwable> mutableLiveData3 = new MutableLiveData<>();
        this.f25687j = mutableLiveData3;
        this.f25688k = mutableLiveData3;
        MutableLiveData<y2> mutableLiveData4 = new MutableLiveData<>();
        this.f25689l = mutableLiveData4;
        this.f25690m = mutableLiveData4;
        MutableLiveData<BookLanguageType> mutableLiveData5 = new MutableLiveData<>();
        this.f25691n = mutableLiveData5;
        this.f25692o = mutableLiveData5;
        MutableLiveData<Boolean> mutableLiveData6 = new MutableLiveData<>(Boolean.TRUE);
        this.f25693p = mutableLiveData6;
        this.f25694q = mutableLiveData6;
        this.f25698u = yz.e0.c(new x00.a() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.n0
            @Override // x00.a
            public final Object invoke() {
                q9.l u11;
                u11 = o0.u(o0.this);
                return u11;
            }
        });
        P();
        MutableLiveData<Boolean> mutableLiveData7 = new MutableLiveData<>();
        this.f25699v = mutableLiveData7;
        this.f25700w = mutableLiveData7;
        MutableLiveData<Boolean> mutableLiveData8 = new MutableLiveData<>();
        this.f25701x = mutableLiveData8;
        this.f25702y = mutableLiveData8;
        MutableLiveData<String> mutableLiveData9 = new MutableLiveData<>();
        this.f25703z = mutableLiveData9;
        this.A = mutableLiveData9;
    }

    private final String G(int i11) {
        String string = this.f25678a.getResources().getString(i11);
        kotlin.jvm.internal.g0.o(string, "getString(...)");
        return string;
    }

    public static final void R(boolean z11, o0 o0Var, IAudioPlayer.State state) {
        int i11 = state == null ? -1 : b.f25704a[state.ordinal()];
        if (i11 == 1) {
            if (z11) {
                o0Var.f25699v.setValue(Boolean.TRUE);
                return;
            } else {
                o0Var.f25701x.setValue(Boolean.TRUE);
                return;
            }
        }
        if (i11 == 2 || i11 == 3) {
            MutableLiveData<Boolean> mutableLiveData = o0Var.f25699v;
            Boolean bool = Boolean.FALSE;
            mutableLiveData.setValue(bool);
            o0Var.f25701x.setValue(bool);
        }
    }

    public static final g2 S(o0 o0Var, boolean z11, File file) {
        o0Var.A().e(file);
        if (z11) {
            o0Var.f25699v.setValue(Boolean.TRUE);
        } else {
            o0Var.f25701x.setValue(Boolean.TRUE);
        }
        return g2.f100423a;
    }

    public static final void T(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void U(o0 o0Var, Throwable th2) {
        qb.c.c(D, "play audio error", th2);
        va.g.i("播放失败", 0);
        MutableLiveData<Boolean> mutableLiveData = o0Var.f25699v;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        o0Var.f25701x.setValue(bool);
    }

    public static final void W(o0 o0Var, String str, IAudioPlayer.State state) {
        int i11 = state == null ? -1 : b.f25704a[state.ordinal()];
        if (i11 == 1) {
            o0Var.f25703z.setValue(str);
            return;
        }
        if (i11 == 2 || i11 == 3) {
            MutableLiveData<Boolean> mutableLiveData = o0Var.f25699v;
            Boolean bool = Boolean.FALSE;
            mutableLiveData.setValue(bool);
            o0Var.f25701x.setValue(bool);
            o0Var.f25703z.setValue(null);
        }
    }

    public static final g2 X(o0 o0Var, String str, File file) {
        o0Var.A().e(file);
        o0Var.f25703z.setValue(str);
        return g2.f100423a;
    }

    public static final void Y(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void Z(o0 o0Var, Throwable th2) {
        qb.c.c(D, "play sentence audio error", th2);
        va.g.i("播放失败", 0);
        MutableLiveData<Boolean> mutableLiveData = o0Var.f25699v;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        o0Var.f25701x.setValue(bool);
        o0Var.f25703z.setValue(null);
    }

    public static final void f0(x00.l lVar, Boolean bool, long[] jArr) {
        kotlin.jvm.internal.g0.p(jArr, "<unused var>");
        lVar.invoke(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
    }

    public static final q9.l u(o0 o0Var) {
        return new q9.l(o0Var.f25678a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void z(o0 o0Var, String str, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = l1.z();
        }
        o0Var.y(str, map);
    }

    public final q9.l A() {
        return (q9.l) this.f25698u.getValue();
    }

    @m80.k
    public final LiveData<BookLanguageType> B() {
        return this.f25692o;
    }

    @m80.k
    public final LiveData<Throwable> C() {
        return this.f25688k;
    }

    @m80.k
    public final LiveData<String> D() {
        return this.A;
    }

    public final void E(@m80.l hj.m mVar) {
        this.f25697t = mVar;
    }

    @m80.k
    public final String F() {
        return this.f25681d;
    }

    @m80.k
    public final MutableLiveData<List<Object>> H() {
        return this.f25684g;
    }

    @m80.k
    public final LiveData<si.c> I() {
        return this.f25683f;
    }

    @m80.k
    public final LiveData<y2> J() {
        return this.f25690m;
    }

    public final boolean K() {
        return this.f25692o.getValue() == null || this.f25692o.getValue() == BookLanguageType.English;
    }

    @m80.k
    public final LiveData<Boolean> L() {
        return this.f25686i;
    }

    @m80.k
    public final LiveData<Boolean> M() {
        return this.f25702y;
    }

    @m80.k
    public final LiveData<Boolean> N() {
        return this.f25700w;
    }

    @m80.k
    public final LiveData<Boolean> O() {
        return this.f25694q;
    }

    public final void P() {
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new c(null), 3, null);
    }

    public final void Q(@m80.l String str, final boolean z11) {
        if (str != null) {
            d0();
            A().f(new IAudioPlayer.b() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.e0
                @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
                public final void onPlayStateChanged(IAudioPlayer.State state) {
                    o0.R(z11, this, state);
                }
            });
            rx.c<File> e11 = m9.d.d().e(str);
            final x00.l lVar = new x00.l() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.f0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 S;
                    S = o0.S(o0.this, z11, (File) obj);
                    return S;
                }
            };
            e11.u5(new wb0.b() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.g0
                @Override // wb0.b
                public final void call(Object obj) {
                    o0.T(x00.l.this, obj);
                }
            }, new wb0.b() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.h0
                @Override // wb0.b
                public final void call(Object obj) {
                    o0.U(o0.this, (Throwable) obj);
                }
            });
        }
    }

    public final void V(@m80.l final String str) {
        if (str != null) {
            d0();
            A().f(new IAudioPlayer.b() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.i0
                @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
                public final void onPlayStateChanged(IAudioPlayer.State state) {
                    o0.W(o0.this, str, state);
                }
            });
            rx.c<File> e11 = m9.d.d().e(str);
            final x00.l lVar = new x00.l() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.j0
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 X;
                    X = o0.X(o0.this, str, (File) obj);
                    return X;
                }
            };
            e11.u5(new wb0.b() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.k0
                @Override // wb0.b
                public final void call(Object obj) {
                    o0.Y(x00.l.this, obj);
                }
            }, new wb0.b() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.l0
                @Override // wb0.b
                public final void call(Object obj) {
                    o0.Z(o0.this, (Throwable) obj);
                }
            });
        }
    }

    public final void a0() {
        ArrayList arrayList = new ArrayList();
        TopicRecord topicRecord = new TopicRecord();
        si.c value = this.f25682e.getValue();
        if (value != null) {
            arrayList.add(new WordBugData(G(R.string.lookup_item_basic_word), WordBugType.BASIC));
            topicRecord.bookId = 0;
            topicRecord.topicId = value.s();
            topicRecord.word = value.t();
        }
        if (arrayList.isEmpty()) {
            return;
        }
        WordErrorFeedbackActivity.P0(this.f25678a, topicRecord, arrayList);
    }

    public final void b0(int i11, int i12) {
        qb.c.b(D, "request wiki:" + i11 + "," + i12 + ", sceneType=" + this.f25681d, new Object[0]);
        this.f25695r = i11;
        this.f25696s = i12;
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new d(i12, i11, null), 3, null);
    }

    public final void c0(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f25681d = str;
    }

    public final void d0() {
        A().stop();
        MutableLiveData<Boolean> mutableLiveData = this.f25699v;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        this.f25701x.setValue(bool);
        this.f25703z.setValue(null);
    }

    public final void e0(@m80.k si.c wordInfo, @m80.k final x00.l<? super Boolean, g2> callback) {
        kotlin.jvm.internal.g0.p(wordInfo, "wordInfo");
        kotlin.jvm.internal.g0.p(callback, "callback");
        hj.m mVar = this.f25697t;
        if (mVar != null) {
            mVar.r(nj.a.f75140b.a(wordInfo), new hj.o() { // from class: com.baicizhan.main.wikiv2.lookup.wikiv2.m0
                @Override // hj.o
                public final void a(Boolean bool, long[] jArr) {
                    o0.f0(x00.l.this, bool, jArr);
                }
            });
        } else {
            callback.invoke(Boolean.FALSE);
        }
    }

    @m80.l
    public final hj.m l0() {
        return this.f25697t;
    }

    public final List<String> v(List<Integer> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            switch (((Number) it.next()).intValue()) {
                case 1:
                    arrayList.add("中考");
                    break;
                case 2:
                    arrayList.add("高考");
                    break;
                case 3:
                    arrayList.add("CET4");
                    break;
                case 4:
                    arrayList.add("CET6");
                    break;
                case 5:
                    arrayList.add("考研");
                    break;
                case 6:
                    arrayList.add("IELTS");
                    break;
                case 7:
                    arrayList.add("TOEFL");
                    break;
                case 8:
                    arrayList.add("SAT");
                    break;
                case 9:
                    arrayList.add("GMAT");
                    break;
                case 10:
                    arrayList.add("GRE");
                    break;
            }
        }
        return arrayList;
    }

    public final c.a w(List<Integer> list) {
        String str;
        if (list.isEmpty()) {
            return null;
        }
        switch (((Number) a00.r0.G2(list)).intValue()) {
            case 1:
                str = "中考";
                break;
            case 2:
                str = "高考";
                break;
            case 3:
                str = "CET4";
                break;
            case 4:
                str = "CET6";
                break;
            case 5:
                str = "考研";
                break;
            case 6:
                str = "IELTS";
                break;
            case 7:
                str = "TOEFL";
                break;
            case 8:
                str = "SAT";
                break;
            case 9:
                str = "GMAT";
                break;
            case 10:
                str = "GRE";
                break;
            default:
                return null;
        }
        return new c.a(5, str, 0);
    }

    public final si.c x(y2 y2Var) {
        k2 q02 = y2Var.q0();
        List<j2> Y = y2Var.Y();
        ArrayList arrayList = new ArrayList(a00.i0.d0(Y, 10));
        for (j2 j2Var : Y) {
            arrayList.add(new c.b(j2Var.q(), j2Var.m()));
        }
        c.a w11 = w(y2Var.W());
        return new si.c(q02.r(), q02.t(), q02.l(), q02.j(), q02.p(), q02.n(), arrayList, v(y2Var.W()), w11);
    }

    public final void y(@m80.k String eventId, @m80.k Map<String, ? extends Object> params) {
        kotlin.jvm.internal.g0.p(eventId, "eventId");
        kotlin.jvm.internal.g0.p(params, "params");
    }
}
