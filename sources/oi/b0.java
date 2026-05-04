package oi;

import a00.h0;
import a00.l1;
import a00.r0;
import android.app.Application;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.SparseBooleanArray;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.dataset.models.TopicRecord;
import com.baicizhan.client.business.dataset.models.lookup.DictionaryRecord;
import com.baicizhan.client.business.util.TopicIdMapingUtils;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.activity.errorfb.WordErrorFeedbackActivity;
import com.baicizhan.main.wikiv2.lookup.WikiType;
import com.baicizhan.main.wikiv2.lookup.data.WordBugData;
import com.baicizhan.main.wikiv2.studyv2.data.EntryAction;
import com.baicizhan.main.wikiv2.studyv2.data.j0;
import com.baicizhan.online.resource_api.DictWiki;
import com.baicizhan.online.resource_api.GetTopicResourceChannel;
import com.baicizhan.online.resource_api.ResourceService;
import com.baicizhan.online.resource_api.TopicResourceV2;
import com.baicizhan.online.resource_api.WordBasicInfo;
import com.baicizhan.online.resource_api.WordBugType;
import com.baicizhan.online.resource_api.WordDictV2;
import com.baicizhan.online.user_study_api.UserLimitInfoV2;
import com.jiongji.andriod.card.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import pi.m0;
import pi.o0;
import pi.q0;
import qi.b;
import qi.f;
import qi.j;
import rx.c;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordWikiModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordWikiModel.kt\ncom/baicizhan/main/wikiv2/lookup/WordWikiModel\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 standard_ext.kt\ncom/baicizhan/client/business/util/Standard_extKt\n*L\n1#1,399:1\n35#2:400\n1869#3,2:401\n1869#3,2:403\n1878#3,3:412\n1#4:405\n18#5,3:406\n18#5,3:409\n*S KotlinDebug\n*F\n+ 1 WordWikiModel.kt\ncom/baicizhan/main/wikiv2/lookup/WordWikiModel\n*L\n140#1:400\n282#1:401,2\n304#1:403,2\n358#1:412,3\n338#1:406,3\n344#1:409,3\n*E\n"})
/* loaded from: classes3.dex */
public final class b0 extends AndroidViewModel implements hj.n {

    /* renamed from: u, reason: collision with root package name */
    @m80.k
    public static final a f76991u = new a(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f76992v = 8;

    /* renamed from: w, reason: collision with root package name */
    public static final String f76993w = b0.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final SparseBooleanArray f76994a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final q9.l f76995b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public qb0.h f76996c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public qb0.h f76997d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<qi.b> f76998e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Object> f76999f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f77000g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<List<?>> f77001h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Integer> f77002i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Triple<Integer, Integer, Boolean>> f77003j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final LiveData<Object> f77004k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final LiveData<Boolean> f77005l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final LiveData<List<?>> f77006m;

    /* renamed from: n, reason: collision with root package name */
    @m80.k
    public final LiveData<Integer> f77007n;

    /* renamed from: o, reason: collision with root package name */
    @m80.k
    public final LiveData<Triple<Integer, Integer, Boolean>> f77008o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f77009p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public final b f77010q;

    /* renamed from: r, reason: collision with root package name */
    @m80.l
    public hj.m f77011r;

    /* renamed from: s, reason: collision with root package name */
    @m80.l
    public j0 f77012s;

    /* renamed from: t, reason: collision with root package name */
    public int f77013t;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final WeakReference<b0> f77014a;

        public b(@m80.k b0 model) {
            g0.p(model, "model");
            this.f77014a = new WeakReference<>(model);
        }

        @Override // android.os.Handler
        public void handleMessage(@m80.k Message msg) {
            g0.p(msg, "msg");
            super.handleMessage(msg);
            b0 b0Var = this.f77014a.get();
            if (b0Var == null) {
                return;
            }
            Object obj = msg.obj;
            Triple triple = obj instanceof Triple ? (Triple) obj : null;
            if (triple != null) {
                b0Var.f77003j.setValue(triple);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77015a;

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
                iArr[IAudioPlayer.State.Paused.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IAudioPlayer.State.Completed.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f77015a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@m80.k Application application) {
        super(application);
        g0.p(application, "application");
        this.f76994a = new SparseBooleanArray();
        q9.l lVar = new q9.l(application);
        this.f76995b = lVar;
        this.f76998e = new MutableLiveData<>();
        MutableLiveData<Object> mutableLiveData = new MutableLiveData<>();
        this.f76999f = mutableLiveData;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.f77000g = mutableLiveData2;
        MutableLiveData<List<?>> mutableLiveData3 = new MutableLiveData<>();
        this.f77001h = mutableLiveData3;
        MutableLiveData<Integer> mutableLiveData4 = new MutableLiveData<>();
        this.f77002i = mutableLiveData4;
        MutableLiveData<Triple<Integer, Integer, Boolean>> mutableLiveData5 = new MutableLiveData<>();
        this.f77003j = mutableLiveData5;
        this.f77004k = mutableLiveData;
        this.f77005l = mutableLiveData2;
        this.f77006m = mutableLiveData3;
        this.f77007n = mutableLiveData4;
        this.f77008o = mutableLiveData5;
        this.f77010q = new b(this);
        lVar.f(new IAudioPlayer.b() { // from class: oi.m
            @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
            public final void onPlayStateChanged(IAudioPlayer.State state) {
                b0.q(b0.this, state);
            }
        });
        com.baicizhan.main.wikiv2.studyv2.data.u0 u0Var = com.baicizhan.main.wikiv2.studyv2.data.u0.f26107a;
        EntryAction d11 = u0Var.d();
        this.f77012s = new j0(d11 != null ? d11.getActon() : null, u0Var.a(), u0Var.b());
    }

    public static final g2 H(b0 b0Var, File file) {
        b0Var.f76995b.e(file);
        return g2.f100423a;
    }

    public static final void I(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void J(b0 b0Var, int i11, int i12, Throwable th2) {
        qb.c.c(f76993w, "play audio: ", th2);
        b0Var.f77010q.obtainMessage(0, new Triple(Integer.valueOf(i11), Integer.valueOf(i12), Boolean.FALSE)).sendToTarget();
    }

    public static /* synthetic */ void L(b0 b0Var, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i12 = -1;
        }
        b0Var.K(i11, i12);
    }

    public static final rx.c<ArrayList<pi.w>> O(final b0 b0Var, final int i11) {
        rx.c j12 = rx.c.j1(new c.a() { // from class: oi.v
            @Override // wb0.b
            public final void call(Object obj) {
                b0.P(b0.this, i11, (qb0.g) obj);
            }
        });
        final x00.l lVar = new x00.l() { // from class: oi.w
            @Override // x00.l
            public final Object invoke(Object obj) {
                rx.c Q;
                Q = b0.Q(b0.this, (DictionaryRecord) obj);
                return Q;
            }
        };
        return j12.b2(new wb0.p() { // from class: oi.x
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c R;
                R = b0.R(x00.l.this, obj);
                return R;
            }
        });
    }

    public static final void P(b0 b0Var, int i11, qb0.g gVar) {
        DictionaryRecord a11 = i9.i.a(b0Var.getApplication(), i11);
        if (a11 != null) {
            if (gVar != null) {
                gVar.onNext(a11);
            }
        } else if (gVar != null) {
            gVar.onError(new RuntimeException("null DictionaryRecord"));
        }
    }

    public static final rx.c Q(b0 b0Var, DictionaryRecord dictionaryRecord) {
        ArrayList arrayList = new ArrayList();
        b.a aVar = qi.b.f82191m;
        g0.m(dictionaryRecord);
        qi.b b11 = aVar.b(dictionaryRecord);
        b0Var.f76998e.postValue(b11);
        arrayList.add(new pi.d(b11));
        arrayList.add(new pi.g0(0, 1, null));
        return rx.c.M2(arrayList);
    }

    public static final rx.c R(x00.l lVar, Object obj) {
        return (rx.c) lVar.invoke(obj);
    }

    public static final rx.c S(int i11, int i12, GetTopicResourceChannel getTopicResourceChannel, ResourceService.Client client) {
        try {
            return rx.c.M2(client.get_topic_resource_v2(TopicIdMapingUtils.buildTopicKey(i11, i12), getTopicResourceChannel, false, false, true, true, true));
        } catch (Exception e11) {
            return rx.c.T1(e11);
        }
    }

    public static final rx.c T(b0 b0Var, int i11, TopicResourceV2 topicResourceV2) {
        g0.m(topicResourceV2);
        return b0Var.s(topicResourceV2, i11);
    }

    public static final g2 U(b0 b0Var, ArrayList arrayList) {
        b0Var.f77001h.setValue(arrayList);
        return g2.f100423a;
    }

    public static final void V(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void W(final b0 b0Var, int i11, Throwable th2) {
        qb.c.c(f76993w, "fetch wiki: ", th2);
        rx.c<ArrayList<pi.w>> w52 = O(b0Var, i11).I3(tb0.a.a()).w5(bc0.c.e());
        final x00.l lVar = new x00.l() { // from class: oi.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 X;
                X = b0.X(b0.this, (ArrayList) obj);
                return X;
            }
        };
        w52.u5(new wb0.b() { // from class: oi.t
            @Override // wb0.b
            public final void call(Object obj) {
                b0.Y(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: oi.u
            @Override // wb0.b
            public final void call(Object obj) {
                b0.Z(b0.this, (Throwable) obj);
            }
        });
    }

    public static final g2 X(b0 b0Var, ArrayList arrayList) {
        b0Var.f77001h.setValue(arrayList);
        return g2.f100423a;
    }

    public static final void Y(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void Z(b0 b0Var, Throwable th2) {
        qb.c.c(f76993w, "fetch wiki from local: ", th2);
        b0Var.f77001h.setValue(null);
    }

    public static final void q(b0 b0Var, IAudioPlayer.State state) {
        int i11 = state == null ? -1 : c.f77015a[state.ordinal()];
        if (i11 == 1) {
            b0Var.f77009p = true;
            return;
        }
        if (i11 == 2 || i11 == 3) {
            if (b0Var.f77009p) {
                b0Var.F();
                b0Var.f77009p = false;
                return;
            }
            return;
        }
        if (i11 != 4) {
            return;
        }
        b0Var.F();
        b0Var.f77009p = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void u(b0 b0Var, String str, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = l1.z();
        }
        b0Var.t(str, map);
    }

    private final String z(int i11) {
        String string = getApplication().getResources().getString(i11);
        g0.o(string, "getString(...)");
        return string;
    }

    public final int A() {
        return this.f77013t;
    }

    @m80.k
    public final LiveData<Boolean> B() {
        return this.f77005l;
    }

    @m80.k
    public final LiveData<List<?>> C() {
        return this.f77006m;
    }

    public final boolean D(int i11) {
        return this.f76994a.get(i11);
    }

    @Override // hj.n
    public void E(@m80.l hj.m mVar) {
        this.f77011r = mVar;
    }

    public final void F() {
        Triple<Integer, Integer, Boolean> value = this.f77003j.getValue();
        if (value != null) {
            this.f77010q.obtainMessage(0, new Triple(value.getFirst(), value.getSecond(), Boolean.FALSE)).sendToTarget();
        }
    }

    public final void G(String str, final int i11, final int i12) {
        this.f77010q.obtainMessage(0, new Triple(Integer.valueOf(i11), Integer.valueOf(i12), Boolean.TRUE)).sendToTarget();
        qb0.h hVar = this.f76997d;
        if (hVar != null) {
            hVar.unsubscribe();
        }
        rx.c<File> I3 = m9.d.d().e(str).I3(tb0.a.a());
        final x00.l lVar = new x00.l() { // from class: oi.y
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 H;
                H = b0.H(b0.this, (File) obj);
                return H;
            }
        };
        this.f76997d = I3.u5(new wb0.b() { // from class: oi.z
            @Override // wb0.b
            public final void call(Object obj) {
                b0.I(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: oi.a0
            @Override // wb0.b
            public final void call(Object obj) {
                b0.J(b0.this, i11, i12, (Throwable) obj);
            }
        });
    }

    public final void K(int i11, int i12) {
        Object b32;
        Object b33;
        qi.c cVar;
        String p11;
        this.f76995b.stop();
        List<?> value = this.f77001h.getValue();
        if (value == null || (b32 = r0.b3(value, i11)) == null) {
            return;
        }
        if (b32 instanceof pi.d) {
            String y11 = ((pi.d) b32).c().y();
            if (y11 != null) {
                G(y11, i11, i12);
                return;
            }
            return;
        }
        if (b32 instanceof pi.a0) {
            String p12 = ((pi.a0) b32).e().p();
            if (p12 != null) {
                G(p12, i11, i12);
                return;
            }
            return;
        }
        if (!(b32 instanceof pi.m) || (b33 = r0.b3(((pi.m) b32).e().d(), i12)) == null || !(b33 instanceof qi.c) || (p11 = (cVar = (qi.c) b33).p()) == null || p11.length() == 0) {
            return;
        }
        G(cVar.p(), i11, i12);
    }

    public final void M() {
        ArrayList arrayList = new ArrayList();
        TopicRecord topicRecord = new TopicRecord();
        List<?> value = this.f77001h.getValue();
        if (value != null) {
            for (Object obj : value) {
                if (obj instanceof pi.d) {
                    pi.d dVar = (pi.d) obj;
                    arrayList.add(new WordBugData(z(R.string.lookup_item_basic_word), dVar.b()));
                    topicRecord.bookId = dVar.c().p();
                    topicRecord.topicId = dVar.c().u();
                    topicRecord.word = dVar.c().z();
                } else if (obj instanceof pi.a) {
                    pi.a aVar = (pi.a) obj;
                    arrayList.add(new WordBugData(aVar.d(), aVar.b()));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        WordErrorFeedbackActivity.P0(getApplication(), topicRecord, arrayList);
    }

    public final void N(final int i11, final int i12, @m80.k final GetTopicResourceChannel channel) {
        g0.p(channel, "channel");
        qb0.h hVar = this.f76996c;
        if (hVar != null) {
            hVar.unsubscribe();
        }
        rx.c<ArrayList<pi.w>> w52 = (!rb.d.f(getApplication()) ? O(this, i11) : com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/resource_api")).b2(new wb0.p() { // from class: oi.n
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c S;
                S = b0.S(i11, i12, channel, (ResourceService.Client) obj);
                return S;
            }
        }).b2(new wb0.p() { // from class: oi.o
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c T;
                T = b0.T(b0.this, i12, (TopicResourceV2) obj);
                return T;
            }
        })).I3(tb0.a.a()).w5(bc0.c.e());
        final x00.l lVar = new x00.l() { // from class: oi.p
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 U;
                U = b0.U(b0.this, (ArrayList) obj);
                return U;
            }
        };
        this.f76996c = w52.u5(new wb0.b() { // from class: oi.q
            @Override // wb0.b
            public final void call(Object obj) {
                b0.V(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: oi.r
            @Override // wb0.b
            public final void call(Object obj) {
                b0.W(b0.this, i11, (Throwable) obj);
            }
        });
    }

    public final void a0(int i11, boolean z11) {
        if (this.f76994a.get(i11) != z11) {
            this.f76994a.put(i11, z11);
            this.f77002i.postValue(Integer.valueOf(i11));
        }
    }

    public final void b0(boolean z11) {
        this.f77000g.setValue(Boolean.valueOf(z11));
    }

    public final void c0(int i11) {
        this.f77013t = i11;
    }

    public final void d0() {
        this.f76995b.stop();
    }

    public final void e0(@m80.k FragmentActivity fragmentActivity) {
        g0.p(fragmentActivity, "fragmentActivity");
    }

    public final void f0(int i11) {
        a0(i11, !this.f76994a.get(i11));
    }

    @Override // hj.n
    @m80.l
    public hj.m l0() {
        return this.f77011r;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f77010q.removeCallbacksAndMessages(null);
        this.f76995b.stop();
        this.f76995b.destroy();
    }

    public final rx.c<ArrayList<pi.w>> s(TopicResourceV2 topicResourceV2, int i11) {
        WordDictV2 wordDictV2;
        WordBasicInfo wordBasicInfo;
        qi.e d11;
        WordDictV2 wordDictV22;
        WordBasicInfo wordBasicInfo2;
        qi.j a11;
        WordDictV2 wordDictV23;
        WordDictV2 wordDictV24;
        WordDictV2 wordDictV25;
        qi.i a12;
        qi.c b11;
        qi.h c11;
        List<b.C1020b> f11;
        UserLimitInfoV2 G = q9.x.r().G();
        oi.a aVar = new oi.a(G != null ? G.wiki_component_cfg : null);
        ArrayList arrayList = new ArrayList();
        HashMap<String, Integer> hashMap = new HashMap<>();
        qi.b c12 = qi.b.f82191m.c(topicResourceV2, i11);
        b.c r11 = c12.r();
        if (r11 != null && (f11 = r11.f()) != null) {
            for (b.C1020b c1020b : f11) {
                hashMap.put(c1020b.h(), Integer.valueOf(c1020b.f()));
            }
        }
        this.f76998e.postValue(c12);
        arrayList.add(new pi.d(c12));
        Pair<Boolean, Integer> b12 = aVar.b(WikiType.WORD_VARIATIONS);
        if (b12 != null && (c11 = qi.h.c(topicResourceV2, true)) != null) {
            arrayList.add(new o0(z(R.string.lookup_item_deform), c11, b12.getFirst().booleanValue(), b12.getSecond().intValue()));
        }
        Pair<Boolean, Integer> b13 = aVar.b(WikiType.SENTENCE_ILLUSTRATION);
        if (b13 != null && (b11 = qi.c.f82213i.b(topicResourceV2)) != null) {
            arrayList.add(new pi.a0(z(R.string.lookup_item_img_sentence), b11, b13.getFirst().booleanValue(), b13.getSecond().intValue()));
        }
        Pair<Boolean, Integer> b14 = aVar.b(WikiType.PARAPHRASES);
        int i12 = 0;
        if (b14 != null) {
            if (hashMap.isEmpty()) {
                qb.c.d(f76993w, "paraphrasesOrder is empty!", new Object[0]);
            } else {
                qi.e b15 = qi.e.f82223b.b(topicResourceV2, hashMap);
                if (b15 != null) {
                    arrayList.add(new pi.m(z(R.string.lookup_item_details), b15, b14.getFirst().booleanValue(), b14.getSecond().intValue(), 0, 16, null));
                }
            }
        }
        Pair<Boolean, Integer> b16 = aVar.b(WikiType.WORD_VIDEO);
        if (b16 != null && (a12 = qi.i.f82245b.a(topicResourceV2)) != null) {
            arrayList.add(new q0(z(R.string.lookup_tv), a12, b16.getFirst().booleanValue(), b16.getSecond().intValue()));
        }
        Pair<Boolean, Integer> b17 = aVar.b(WikiType.PHRASES);
        if (b17 != null) {
            f.a aVar2 = qi.f.f82232b;
            DictWiki dictWiki = topicResourceV2.dict_wiki;
            qi.f a13 = aVar2.a((dictWiki == null || (wordDictV25 = dictWiki.dict) == null) ? null : wordDictV25.short_phrases);
            if (a13 != null) {
                arrayList.add(new pi.t(z(R.string.lookup_item_phrases), a13, b17.getFirst().booleanValue(), b17.getSecond().intValue()));
            }
        }
        Pair<Boolean, Integer> b18 = aVar.b(WikiType.WORD_SYNONYM);
        if (b18 != null) {
            j.a aVar3 = qi.j.f82248b;
            DictWiki dictWiki2 = topicResourceV2.dict_wiki;
            qi.j b19 = aVar3.b((dictWiki2 == null || (wordDictV24 = dictWiki2.dict) == null) ? null : wordDictV24.synonyms);
            if (b19 != null) {
                arrayList.add(new pi.j0(z(R.string.lookup_item_synonyms), b19, WordBugType.SYNONYM, b18.getFirst().booleanValue(), b18.getSecond().intValue()));
            }
        }
        Pair<Boolean, Integer> b21 = aVar.b(WikiType.WORD_ANTONYM);
        if (b21 != null) {
            j.a aVar4 = qi.j.f82248b;
            DictWiki dictWiki3 = topicResourceV2.dict_wiki;
            qi.j b22 = aVar4.b((dictWiki3 == null || (wordDictV23 = dictWiki3.dict) == null) ? null : wordDictV23.antonyms);
            if (b22 != null) {
                arrayList.add(new pi.j0(z(R.string.lookup_item_antonym), b22, WordBugType.ANTONYM, b21.getFirst().booleanValue(), b21.getSecond().intValue()));
            }
        }
        Pair<Boolean, Integer> b23 = aVar.b(WikiType.WORD_SIMILAR);
        if (b23 != null && (a11 = qi.j.f82248b.a(topicResourceV2.similar_words)) != null) {
            arrayList.add(new pi.j0(z(R.string.lookup_item_similar), a11, WordBugType.SIMILAR, b23.getFirst().booleanValue(), b23.getSecond().intValue()));
        }
        Pair<Boolean, Integer> b24 = aVar.b(WikiType.WORD_ETYMON);
        if (b24 != null) {
            DictWiki dictWiki4 = topicResourceV2.dict_wiki;
            String str = (dictWiki4 == null || (wordDictV22 = dictWiki4.dict) == null || (wordBasicInfo2 = wordDictV22.word_basic_info) == null) ? null : wordBasicInfo2.etyma;
            if (str != null && str.length() != 0) {
                arrayList.add(new pi.x(z(R.string.lookup_item_etyma), str, WordBugType.ETYMA, b24.getFirst().booleanValue(), b24.getSecond().intValue()));
            }
        }
        Pair<Boolean, Integer> b25 = aVar.b(WikiType.PARAPHRASES_EN);
        if (b25 != null && (d11 = qi.e.f82223b.d(topicResourceV2)) != null) {
            arrayList.add(new pi.m(z(R.string.lookup_item_enmean), d11, b25.getFirst().booleanValue(), b25.getSecond().intValue(), 1));
        }
        Pair<Boolean, Integer> b26 = aVar.b(WikiType.WORD_PICTOGRAM);
        if (b26 != null) {
            DictWiki dictWiki5 = topicResourceV2.dict_wiki;
            String str2 = (dictWiki5 == null || (wordDictV2 = dictWiki5.dict) == null || (wordBasicInfo = wordDictV2.word_basic_info) == null) ? null : wordBasicInfo.deformation_img_uri;
            if (str2 != null && str2.length() != 0) {
                String z11 = z(R.string.lookup_item_deformation);
                Uri parse = Uri.parse(gj.c.a(str2));
                g0.o(parse, "parse(...)");
                arrayList.add(new m0(z11, parse, b26.getFirst().booleanValue(), b26.getSecond().intValue()));
            }
        }
        arrayList.add(new pi.g0(0, 1, null));
        e0.d(arrayList);
        for (Object obj : arrayList) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                h0.b0();
            }
            pi.w wVar = (pi.w) obj;
            this.f76994a.put(i12, wVar instanceof pi.a ? ((pi.a) wVar).c() : true);
            i12 = i13;
        }
        rx.c<ArrayList<pi.w>> M2 = rx.c.M2(arrayList);
        g0.o(M2, "just(...)");
        return M2;
    }

    public final void t(@m80.k String eventId, @m80.k Map<String, ? extends Object> map) {
        g0.p(eventId, "eventId");
        g0.p(map, "map");
        Map<String, ? extends Object> j02 = l1.j0(h1.a("topic_id", Integer.valueOf(this.f77013t)));
        j0 j0Var = this.f77012s;
        if (j0Var != null) {
            String f11 = j0Var.f();
            if (f11 == null) {
                f11 = "";
            }
            j02.putAll(l1.W(h1.a(ma.b.f72923l1, f11), h1.a("plan_type", j0Var.g()), h1.a("strategy_id", j0Var.h())));
        }
        j02.putAll(map);
        com.baicizhan.main.wikiv2.studyv2.data.u0.f26107a.h(eventId, j02);
    }

    public final void v() {
        com.baicizhan.main.wikiv2.studyv2.data.u0 u0Var = com.baicizhan.main.wikiv2.studyv2.data.u0.f26107a;
        j0 j0Var = this.f77012s;
        if (j0Var != null) {
            EntryAction d11 = u0Var.d();
            j0Var.i(d11 != null ? d11.getActon() : null);
        }
    }

    @m80.k
    public final LiveData<Object> w() {
        return this.f77004k;
    }

    @m80.k
    public final LiveData<Triple<Integer, Integer, Boolean>> x() {
        return this.f77008o;
    }

    @m80.k
    public final LiveData<Integer> y() {
        return this.f77007n;
    }
}
