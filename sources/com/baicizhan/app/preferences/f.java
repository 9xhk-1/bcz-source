package com.baicizhan.app.preferences;

import a00.h0;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import androidx.datastore.preferences.core.Preferences;
import c40.h1;
import c40.l3;
import c40.s0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import okio.f;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f implements com.baicizhan.app.preferences.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f15891a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<String, DataStore<Preferences>> f15892b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final n40.a f15893c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.preferences.DataStoreFactory$create$1", f = "BczPreferenceFactory.andIos.kt", i = {0, 0}, l = {45}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0"}, v = 1)
    @u0({"SMAP\nBczPreferenceFactory.andIos.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczPreferenceFactory.andIos.kt\ncom/baicizhan/app/preferences/DataStoreFactory$create$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,39:1\n116#2,8:40\n125#2,2:55\n382#3,7:48\n*S KotlinDebug\n*F\n+ 1 BczPreferenceFactory.andIos.kt\ncom/baicizhan/app/preferences/DataStoreFactory$create$1\n*L\n20#1:40,8\n20#1:55,2\n21#1:48,7\n*E\n"})
    public static final class a extends SuspendLambda implements l<j00.c<? super DataStore<Preferences>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f15894a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15895b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15896c;

        /* renamed from: d, reason: collision with root package name */
        public int f15897d;

        /* renamed from: e, reason: collision with root package name */
        public int f15898e;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f15900g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, j00.c<? super a> cVar) {
            super(1, cVar);
            this.f15900g = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return f.this.new a(this.f15900g, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super DataStore<Preferences>> cVar) {
            return ((a) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            f fVar;
            n40.a aVar;
            String str;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f15898e;
            if (i11 == 0) {
                kotlin.e.n(obj);
                n40.a aVar2 = f.this.f15893c;
                fVar = f.this;
                String str2 = this.f15900g;
                this.f15894a = aVar2;
                this.f15895b = fVar;
                this.f15896c = str2;
                this.f15897d = 0;
                this.f15898e = 1;
                if (aVar2.lock(null, this) == l11) {
                    return l11;
                }
                aVar = aVar2;
                str = str2;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f15896c;
                fVar = (f) this.f15895b;
                aVar = (n40.a) this.f15894a;
                kotlin.e.n(obj);
            }
            try {
                Map map = fVar.f15892b;
                Object obj2 = map.get(str);
                if (obj2 == null) {
                    obj2 = fVar.f(str);
                    map.put(str, obj2);
                }
                DataStore dataStore = (DataStore) obj2;
                aVar.unlock(null);
                return dataStore;
            } catch (Throwable th2) {
                aVar.unlock(null);
                throw th2;
            }
        }
    }

    public f(@k String _workingPath) {
        g0.p(_workingPath, "_workingPath");
        this.f15891a = _workingPath;
        this.f15892b = new LinkedHashMap();
        this.f15893c = n40.g.b(false, 1, null);
    }

    public static final okio.f g(f fVar, String str) {
        return f.a.h(okio.f.f77539b, fVar.f15891a + '/' + str + b.f15888a, false, 1, null);
    }

    @Override // com.baicizhan.app.preferences.a
    @k
    public g a(@k String preference) {
        g0.p(preference, "preference");
        return new BczPreference(new a(preference, null));
    }

    public final DataStore<Preferences> f(final String str) {
        return PreferenceDataStoreFactory.INSTANCE.createWithPath(d.b(), h0.J(), s0.a(h1.c().plus(l3.c(null, 1, null))), new x00.a() { // from class: com.baicizhan.app.preferences.e
            @Override // x00.a
            public final Object invoke() {
                okio.f g11;
                g11 = f.g(f.this, str);
                return g11;
            }
        });
    }
}
