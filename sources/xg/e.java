package xg;

import a00.h0;
import a00.i0;
import a00.l0;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import c4.j;
import c40.h1;
import c40.r0;
import com.baicizhan.client.business.lookup.Word;
import com.baicizhan.client.business.lookup.rx.LookupEngine;
import dd.h;
import i9.i;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import k3.d1;
import k3.q0;
import k3.q1;
import k3.x2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import xg.e;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordSearchPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordSearchPlugin.kt\ncom/baicizhan/main/home/player/plugin/WordSearchPlugin\n+ 2 BizSdk.kt\ncom/baicizhan/app/biz/BizSdk\n+ 3 SdkContext.kt\ncom/baicizhan/app/biz/context/SdkContextKt\n+ 4 Koin.kt\norg/koin/core/Koin\n+ 5 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,59:1\n10#2:60\n43#3:61\n124#4,4:62\n142#5:66\n*S KotlinDebug\n*F\n+ 1 WordSearchPlugin.kt\ncom/baicizhan/main/home/player/plugin/WordSearchPlugin\n*L\n19#1:60\n19#1:61\n19#1:62,4\n19#1:66\n*E\n"})
/* loaded from: classes4.dex */
public final class e implements d1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final int f98050c = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f98051a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c0 f98052b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.player.plugin.WordSearchPlugin$lookup$2", f = "WordSearchPlugin.kt", i = {0, 0}, l = {33}, m = "invokeSuspend", n = {"$this$withContext", "output"}, s = {"L$0", "L$1"}, v = 1)
    @u0({"SMAP\nWordSearchPlugin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordSearchPlugin.kt\ncom/baicizhan/main/home/player/plugin/WordSearchPlugin$lookup$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1563#2:60\n1634#2,3:61\n*S KotlinDebug\n*F\n+ 1 WordSearchPlugin.kt\ncom/baicizhan/main/home/player/plugin/WordSearchPlugin$lookup$2\n*L\n47#1:60\n47#1:61,3\n*E\n"})
    public static final class a extends SuspendLambda implements p<r0, j00.c<? super List<? extends q1>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f98053a;

        /* renamed from: b, reason: collision with root package name */
        public int f98054b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f98055c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f98057e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f98058f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f98059g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, int i11, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f98057e = context;
            this.f98058f = str;
            this.f98059g = i11;
        }

        public static final int k(String str, Word word, Word word2) {
            if (!g0.g(word.getWord(), str) || g0.g(word2.getWord(), str)) {
                return (g0.g(word.getWord(), str) || !g0.g(word2.getWord(), str)) ? 0 : 1;
            }
            return -1;
        }

        public static final int m(p pVar, Object obj, Object obj2) {
            return ((Number) pVar.invoke(obj, obj2)).intValue();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = e.this.new a(this.f98057e, this.f98058f, this.f98059g, cVar);
            aVar.f98055c = obj;
            return aVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(r0 r0Var, j00.c<? super List<q1>> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LookupEngine.Params params;
            r0 r0Var = (r0) this.f98055c;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f98054b;
            if (i11 == 0) {
                kotlin.e.n(obj);
                LookupEngine.Params params2 = new LookupEngine.Params();
                String str = this.f98058f;
                int i12 = this.f98059g;
                params2.keyword = str;
                params2.token = params2.token;
                params2.limit = i12;
                k3.r0 k11 = e.this.k();
                this.f98055c = r0Var;
                this.f98053a = params2;
                this.f98054b = 1;
                Object t11 = k11.t(this);
                if (t11 == l11) {
                    return l11;
                }
                params = params2;
                obj = t11;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                params = (LookupEngine.Params) this.f98053a;
                kotlin.e.n(obj);
            }
            List<Word> g11 = i.g(this.f98057e, ((q0) obj).m(), params.keyword, params.limit);
            if (g11 == null) {
                return h0.J();
            }
            final String str2 = this.f98058f;
            final p pVar = new p() { // from class: xg.c
                @Override // x00.p
                public final Object invoke(Object obj2, Object obj3) {
                    int k12;
                    k12 = e.a.k(str2, (Word) obj2, (Word) obj3);
                    return Integer.valueOf(k12);
                }
            };
            l0.r0(g11, new Comparator() { // from class: xg.d
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    int m11;
                    m11 = e.a.m(p.this, obj2, obj3);
                    return m11;
                }
            });
            List<Word> list = g11;
            ArrayList arrayList = new ArrayList(i0.d0(list, 10));
            for (Word word : list) {
                String id2 = word.getId();
                g0.o(id2, "getId(...)");
                int parseInt = Integer.parseInt(id2);
                String word2 = word.getWord();
                g0.o(word2, "getWord(...)");
                String cnmean = word.getCnmean();
                g0.o(cnmean, "getCnmean(...)");
                String accent = word.getAccent();
                g0.o(accent, "getAccent(...)");
                arrayList.add(new q1(parseInt, word2, cnmean, accent));
            }
            return arrayList;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super List<? extends q1>> cVar) {
            return invoke2(r0Var, (j00.c<? super List<q1>>) cVar);
        }
    }

    public e(@k Context context) {
        g0.p(context, "context");
        this.f98051a = context;
        this.f98052b = e0.c(new x00.a() { // from class: xg.b
            @Override // x00.a
            public final Object invoke() {
                k3.r0 m11;
                m11 = e.m(e.this);
                return m11;
            }
        });
    }

    public static final k3.r0 m(e eVar) {
        h.g(eVar.f98051a);
        return (k3.r0) ((x2) j.f7801a.a().P().h().i(o0.d(k3.r0.class), null, null));
    }

    @Override // k3.d1.b
    @l
    public Object d(@k String str, @k j00.c<? super List<q1>> cVar) {
        return l(this.f98051a, str, 10, cVar);
    }

    public final k3.r0 k() {
        return (k3.r0) this.f98052b.getValue();
    }

    public final Object l(Context context, String str, int i11, j00.c<? super List<q1>> cVar) {
        return c40.i.h(h1.c(), new a(context, str, i11, null), cVar);
    }
}
