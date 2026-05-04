package com.baicizhan.app.preferences;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import com.baicizhan.client.business.dataset.provider.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBczPreference.andIos.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczPreference.andIos.kt\ncom/baicizhan/app/preferences/BczPreference\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,78:1\n49#2:79\n51#2:83\n49#2:84\n51#2:88\n49#2:89\n51#2:93\n49#2:94\n51#2:98\n49#2:99\n51#2:103\n46#3:80\n51#3:82\n46#3:85\n51#3:87\n46#3:90\n51#3:92\n46#3:95\n51#3:97\n46#3:100\n51#3:102\n105#4:81\n105#4:86\n105#4:91\n105#4:96\n105#4:101\n*S KotlinDebug\n*F\n+ 1 BczPreference.andIos.kt\ncom/baicizhan/app/preferences/BczPreference\n*L\n22#1:79\n22#1:83\n34#1:84\n34#1:88\n46#1:89\n46#1:93\n57#1:94\n57#1:98\n68#1:99\n68#1:103\n22#1:80\n22#1:82\n34#1:85\n34#1:87\n46#1:90\n46#1:92\n57#1:95\n57#1:97\n68#1:100\n68#1:102\n22#1:81\n34#1:86\n46#1:91\n57#1:96\n68#1:101\n*E\n"})
/* loaded from: classes3.dex */
public final class BczPreference implements com.baicizhan.app.preferences.g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final x00.l<j00.c<? super DataStore<Preferences>>, Object> f15782a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.preferences.BczPreference", f = "BczPreference.andIos.kt", i = {}, l = {73, 73}, m = "clean", n = {}, s = {}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f15813a;

        /* renamed from: c, reason: collision with root package name */
        public int f15815c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15813a = obj;
            this.f15815c |= Integer.MIN_VALUE;
            return BczPreference.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.preferences.BczPreference$clean$2", f = "BczPreference.andIos.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<MutablePreferences, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15816a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15817b;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(cVar);
            bVar.f15817b = obj;
            return bVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, j00.c<? super g2> cVar) {
            return ((b) create(mutablePreferences, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutablePreferences mutablePreferences = (MutablePreferences) this.f15817b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15816a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            mutablePreferences.clear();
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.preferences.BczPreference", f = "BczPreference.andIos.kt", i = {0, 0, 1, 1}, l = {57, 59}, m = "getBoolean", n = {a.d.C0245a.f16161a, "defaultValue", a.d.C0245a.f16161a, "defaultValue"}, s = {"L$0", "Z$0", "L$0", "Z$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15818a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f15819b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15820c;

        /* renamed from: e, reason: collision with root package name */
        public int f15822e;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15820c = obj;
            this.f15822e |= Integer.MIN_VALUE;
            return BczPreference.this.b(null, false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.preferences.BczPreference", f = "BczPreference.andIos.kt", i = {0, 0, 1, 1}, l = {68, 70}, m = "getByteArray", n = {a.d.C0245a.f16161a, "defaultValue", a.d.C0245a.f16161a, "defaultValue"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15823a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15824b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15825c;

        /* renamed from: e, reason: collision with root package name */
        public int f15827e;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15825c = obj;
            this.f15827e |= Integer.MIN_VALUE;
            return BczPreference.this.c(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.preferences.BczPreference", f = "BczPreference.andIos.kt", i = {0, 0, 1, 1}, l = {34, 36}, m = "getInt", n = {a.d.C0245a.f16161a, "defaultValue", a.d.C0245a.f16161a, "defaultValue"}, s = {"L$0", "I$0", "L$0", "I$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15828a;

        /* renamed from: b, reason: collision with root package name */
        public int f15829b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15830c;

        /* renamed from: e, reason: collision with root package name */
        public int f15832e;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15830c = obj;
            this.f15832e |= Integer.MIN_VALUE;
            return BczPreference.this.d(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.preferences.BczPreference", f = "BczPreference.andIos.kt", i = {0, 0, 1, 1}, l = {46, 48}, m = "getLong", n = {a.d.C0245a.f16161a, "defaultValue", a.d.C0245a.f16161a, "defaultValue"}, s = {"L$0", "J$0", "L$0", "J$0"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15833a;

        /* renamed from: b, reason: collision with root package name */
        public long f15834b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15835c;

        /* renamed from: e, reason: collision with root package name */
        public int f15837e;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15835c = obj;
            this.f15837e |= Integer.MIN_VALUE;
            return BczPreference.this.h(null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.preferences.BczPreference", f = "BczPreference.andIos.kt", i = {0, 0, 1, 1}, l = {22, 24}, m = "getString", n = {a.d.C0245a.f16161a, "defaultValue", a.d.C0245a.f16161a, "defaultValue"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15838a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15839b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15840c;

        /* renamed from: e, reason: collision with root package name */
        public int f15842e;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15840c = obj;
            this.f15842e |= Integer.MIN_VALUE;
            return BczPreference.this.j(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.preferences.BczPreference", f = "BczPreference.andIos.kt", i = {0, 0, 1, 1}, l = {51, 51}, m = "putBoolean", n = {a.d.C0245a.f16161a, "value", a.d.C0245a.f16161a, "value"}, s = {"L$0", "Z$0", "L$0", "Z$0"}, v = 1)
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15843a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f15844b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15845c;

        /* renamed from: e, reason: collision with root package name */
        public int f15847e;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15845c = obj;
            this.f15847e |= Integer.MIN_VALUE;
            return BczPreference.this.g(null, false, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.preferences.BczPreference$putBoolean$2", f = "BczPreference.andIos.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class i extends SuspendLambda implements x00.p<MutablePreferences, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15848a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15849b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f15850c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f15851d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, boolean z11, j00.c<? super i> cVar) {
            super(2, cVar);
            this.f15850c = str;
            this.f15851d = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            i iVar = new i(this.f15850c, this.f15851d, cVar);
            iVar.f15849b = obj;
            return iVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, j00.c<? super g2> cVar) {
            return ((i) create(mutablePreferences, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutablePreferences mutablePreferences = (MutablePreferences) this.f15849b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15848a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            mutablePreferences.set(PreferencesKeys.booleanKey(this.f15850c), l00.a.a(this.f15851d));
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.preferences.BczPreference", f = "BczPreference.andIos.kt", i = {0, 0, 1, 1}, l = {62, 62}, m = "putByteArray", n = {a.d.C0245a.f16161a, "byteArray", a.d.C0245a.f16161a, "byteArray"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15852a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15853b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15854c;

        /* renamed from: e, reason: collision with root package name */
        public int f15856e;

        public j(j00.c<? super j> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15854c = obj;
            this.f15856e |= Integer.MIN_VALUE;
            return BczPreference.this.e(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.preferences.BczPreference$putByteArray$2", f = "BczPreference.andIos.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class k extends SuspendLambda implements x00.p<MutablePreferences, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15857a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15858b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f15859c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ byte[] f15860d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str, byte[] bArr, j00.c<? super k> cVar) {
            super(2, cVar);
            this.f15859c = str;
            this.f15860d = bArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            k kVar = new k(this.f15859c, this.f15860d, cVar);
            kVar.f15858b = obj;
            return kVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, j00.c<? super g2> cVar) {
            return ((k) create(mutablePreferences, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutablePreferences mutablePreferences = (MutablePreferences) this.f15858b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15857a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            mutablePreferences.set(PreferencesKeys.byteArrayKey(this.f15859c), this.f15860d);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.preferences.BczPreference", f = "BczPreference.andIos.kt", i = {0, 0, 1, 1}, l = {28, 28}, m = "putInt", n = {a.d.C0245a.f16161a, "value", a.d.C0245a.f16161a, "value"}, s = {"L$0", "I$0", "L$0", "I$0"}, v = 1)
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15861a;

        /* renamed from: b, reason: collision with root package name */
        public int f15862b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15863c;

        /* renamed from: e, reason: collision with root package name */
        public int f15865e;

        public l(j00.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15863c = obj;
            this.f15865e |= Integer.MIN_VALUE;
            return BczPreference.this.f(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.preferences.BczPreference$putInt$2", f = "BczPreference.andIos.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class m extends SuspendLambda implements x00.p<MutablePreferences, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15866a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15867b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f15868c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f15869d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, int i11, j00.c<? super m> cVar) {
            super(2, cVar);
            this.f15868c = str;
            this.f15869d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            m mVar = new m(this.f15868c, this.f15869d, cVar);
            mVar.f15867b = obj;
            return mVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, j00.c<? super g2> cVar) {
            return ((m) create(mutablePreferences, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutablePreferences mutablePreferences = (MutablePreferences) this.f15867b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15866a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            mutablePreferences.set(PreferencesKeys.intKey(this.f15868c), l00.a.f(this.f15869d));
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.preferences.BczPreference", f = "BczPreference.andIos.kt", i = {0, 0, 1, 1}, l = {40, 40}, m = "putLong", n = {a.d.C0245a.f16161a, "value", a.d.C0245a.f16161a, "value"}, s = {"L$0", "J$0", "L$0", "J$0"}, v = 1)
    public static final class n extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15870a;

        /* renamed from: b, reason: collision with root package name */
        public long f15871b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15872c;

        /* renamed from: e, reason: collision with root package name */
        public int f15874e;

        public n(j00.c<? super n> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15872c = obj;
            this.f15874e |= Integer.MIN_VALUE;
            return BczPreference.this.i(null, 0L, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.preferences.BczPreference$putLong$2", f = "BczPreference.andIos.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class o extends SuspendLambda implements x00.p<MutablePreferences, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15875a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15876b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f15877c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f15878d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, long j11, j00.c<? super o> cVar) {
            super(2, cVar);
            this.f15877c = str;
            this.f15878d = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            o oVar = new o(this.f15877c, this.f15878d, cVar);
            oVar.f15876b = obj;
            return oVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, j00.c<? super g2> cVar) {
            return ((o) create(mutablePreferences, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutablePreferences mutablePreferences = (MutablePreferences) this.f15876b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15875a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            mutablePreferences.set(PreferencesKeys.stringKey(this.f15877c), String.valueOf(this.f15878d));
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.preferences.BczPreference", f = "BczPreference.andIos.kt", i = {0, 0, 1, 1}, l = {16, 16}, m = "putString", n = {a.d.C0245a.f16161a, "value", a.d.C0245a.f16161a, "value"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
    public static final class p extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15879a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15880b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f15881c;

        /* renamed from: e, reason: collision with root package name */
        public int f15883e;

        public p(j00.c<? super p> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15881c = obj;
            this.f15883e |= Integer.MIN_VALUE;
            return BczPreference.this.k(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.preferences.BczPreference$putString$2", f = "BczPreference.andIos.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class q extends SuspendLambda implements x00.p<MutablePreferences, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f15884a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f15885b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f15886c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f15887d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, String str2, j00.c<? super q> cVar) {
            super(2, cVar);
            this.f15886c = str;
            this.f15887d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            q qVar = new q(this.f15886c, this.f15887d, cVar);
            qVar.f15885b = obj;
            return qVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MutablePreferences mutablePreferences, j00.c<? super g2> cVar) {
            return ((q) create(mutablePreferences, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutablePreferences mutablePreferences = (MutablePreferences) this.f15885b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f15884a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            mutablePreferences.set(PreferencesKeys.stringKey(this.f15886c), this.f15887d);
            return g2.f100423a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BczPreference(@m80.k x00.l<? super j00.c<? super DataStore<Preferences>>, ? extends Object> preferenceProvider) {
        g0.p(preferenceProvider, "preferenceProvider");
        this.f15782a = preferenceProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (androidx.datastore.preferences.core.PreferencesKt.edit((androidx.datastore.core.DataStore) r6, r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.baicizhan.app.preferences.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super yz.g2> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.baicizhan.app.preferences.BczPreference.a
            if (r0 == 0) goto L13
            r0 = r6
            com.baicizhan.app.preferences.BczPreference$a r0 = (com.baicizhan.app.preferences.BczPreference.a) r0
            int r1 = r0.f15815c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15815c = r1
            goto L18
        L13:
            com.baicizhan.app.preferences.BczPreference$a r0 = new com.baicizhan.app.preferences.BczPreference$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f15813a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15815c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r6)
            goto L57
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.e.n(r6)
            goto L46
        L38:
            kotlin.e.n(r6)
            x00.l<j00.c<? super androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>>, java.lang.Object> r6 = r5.f15782a
            r0.f15815c = r4
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L46
            goto L56
        L46:
            androidx.datastore.core.DataStore r6 = (androidx.datastore.core.DataStore) r6
            com.baicizhan.app.preferences.BczPreference$b r2 = new com.baicizhan.app.preferences.BczPreference$b
            r4 = 0
            r2.<init>(r4)
            r0.f15815c = r3
            java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.edit(r6, r2, r0)
            if (r6 != r1) goto L57
        L56:
            return r1
        L57:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.preferences.BczPreference.a(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.baicizhan.app.preferences.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k final java.lang.String r6, final boolean r7, @m80.k j00.c<? super java.lang.Boolean> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.baicizhan.app.preferences.BczPreference.c
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.app.preferences.BczPreference$c r0 = (com.baicizhan.app.preferences.BczPreference.c) r0
            int r1 = r0.f15822e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15822e = r1
            goto L18
        L13:
            com.baicizhan.app.preferences.BczPreference$c r0 = new com.baicizhan.app.preferences.BczPreference$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15820c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15822e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f15818a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r8)
            return r8
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            boolean r7 = r0.f15819b
            java.lang.Object r6 = r0.f15818a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r8)
            goto L54
        L42:
            kotlin.e.n(r8)
            x00.l<j00.c<? super androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>>, java.lang.Object> r8 = r5.f15782a
            r0.f15818a = r6
            r0.f15819b = r7
            r0.f15822e = r4
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L54
            goto L6f
        L54:
            androidx.datastore.core.DataStore r8 = (androidx.datastore.core.DataStore) r8
            kotlinx.coroutines.flow.i r8 = r8.getData()
            com.baicizhan.app.preferences.BczPreference$getBoolean$$inlined$map$1 r2 = new com.baicizhan.app.preferences.BczPreference$getBoolean$$inlined$map$1
            r2.<init>()
            java.lang.Object r6 = l00.k.a(r6)
            r0.f15818a = r6
            r0.f15819b = r7
            r0.f15822e = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.k.w0(r2, r0)
            if (r6 != r1) goto L70
        L6f:
            return r1
        L70:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.preferences.BczPreference.b(java.lang.String, boolean, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.baicizhan.app.preferences.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(@m80.k final java.lang.String r6, @m80.l final byte[] r7, @m80.k j00.c<? super byte[]> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.baicizhan.app.preferences.BczPreference.d
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.app.preferences.BczPreference$d r0 = (com.baicizhan.app.preferences.BczPreference.d) r0
            int r1 = r0.f15827e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15827e = r1
            goto L18
        L13:
            com.baicizhan.app.preferences.BczPreference$d r0 = new com.baicizhan.app.preferences.BczPreference$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15825c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15827e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f15824b
            byte[] r6 = (byte[]) r6
            java.lang.Object r6 = r0.f15823a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r8)
            return r8
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.f15824b
            r7 = r6
            byte[] r7 = (byte[]) r7
            java.lang.Object r6 = r0.f15823a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r8)
            goto L5b
        L49:
            kotlin.e.n(r8)
            x00.l<j00.c<? super androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>>, java.lang.Object> r8 = r5.f15782a
            r0.f15823a = r6
            r0.f15824b = r7
            r0.f15827e = r4
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L5b
            goto L7a
        L5b:
            androidx.datastore.core.DataStore r8 = (androidx.datastore.core.DataStore) r8
            kotlinx.coroutines.flow.i r8 = r8.getData()
            com.baicizhan.app.preferences.BczPreference$getByteArray$$inlined$map$1 r2 = new com.baicizhan.app.preferences.BczPreference$getByteArray$$inlined$map$1
            r2.<init>()
            java.lang.Object r6 = l00.k.a(r6)
            r0.f15823a = r6
            java.lang.Object r6 = l00.k.a(r7)
            r0.f15824b = r6
            r0.f15827e = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.k.w0(r2, r0)
            if (r6 != r1) goto L7b
        L7a:
            return r1
        L7b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.preferences.BczPreference.c(java.lang.String, byte[], j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.baicizhan.app.preferences.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k final java.lang.String r6, final int r7, @m80.k j00.c<? super java.lang.Integer> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.baicizhan.app.preferences.BczPreference.e
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.app.preferences.BczPreference$e r0 = (com.baicizhan.app.preferences.BczPreference.e) r0
            int r1 = r0.f15832e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15832e = r1
            goto L18
        L13:
            com.baicizhan.app.preferences.BczPreference$e r0 = new com.baicizhan.app.preferences.BczPreference$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15830c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15832e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f15828a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r8)
            return r8
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            int r7 = r0.f15829b
            java.lang.Object r6 = r0.f15828a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r8)
            goto L54
        L42:
            kotlin.e.n(r8)
            x00.l<j00.c<? super androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>>, java.lang.Object> r8 = r5.f15782a
            r0.f15828a = r6
            r0.f15829b = r7
            r0.f15832e = r4
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L54
            goto L6f
        L54:
            androidx.datastore.core.DataStore r8 = (androidx.datastore.core.DataStore) r8
            kotlinx.coroutines.flow.i r8 = r8.getData()
            com.baicizhan.app.preferences.BczPreference$getInt$$inlined$map$1 r2 = new com.baicizhan.app.preferences.BczPreference$getInt$$inlined$map$1
            r2.<init>()
            java.lang.Object r6 = l00.k.a(r6)
            r0.f15828a = r6
            r0.f15829b = r7
            r0.f15832e = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.k.w0(r2, r0)
            if (r6 != r1) goto L70
        L6f:
            return r1
        L70:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.preferences.BczPreference.d(java.lang.String, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        if (androidx.datastore.preferences.core.PreferencesKt.edit((androidx.datastore.core.DataStore) r8, r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.baicizhan.app.preferences.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(@m80.k java.lang.String r6, @m80.k byte[] r7, @m80.k j00.c<? super yz.g2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.baicizhan.app.preferences.BczPreference.j
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.app.preferences.BczPreference$j r0 = (com.baicizhan.app.preferences.BczPreference.j) r0
            int r1 = r0.f15856e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15856e = r1
            goto L18
        L13:
            com.baicizhan.app.preferences.BczPreference$j r0 = new com.baicizhan.app.preferences.BczPreference$j
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15854c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15856e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f15853b
            byte[] r6 = (byte[]) r6
            java.lang.Object r6 = r0.f15852a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r8)
            goto L78
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.f15853b
            r7 = r6
            byte[] r7 = (byte[]) r7
            java.lang.Object r6 = r0.f15852a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r8)
            goto L5b
        L49:
            kotlin.e.n(r8)
            x00.l<j00.c<? super androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>>, java.lang.Object> r8 = r5.f15782a
            r0.f15852a = r6
            r0.f15853b = r7
            r0.f15856e = r4
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L5b
            goto L77
        L5b:
            androidx.datastore.core.DataStore r8 = (androidx.datastore.core.DataStore) r8
            com.baicizhan.app.preferences.BczPreference$k r2 = new com.baicizhan.app.preferences.BczPreference$k
            r4 = 0
            r2.<init>(r6, r7, r4)
            java.lang.Object r6 = l00.k.a(r6)
            r0.f15852a = r6
            java.lang.Object r6 = l00.k.a(r7)
            r0.f15853b = r6
            r0.f15856e = r3
            java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.edit(r8, r2, r0)
            if (r6 != r1) goto L78
        L77:
            return r1
        L78:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.preferences.BczPreference.e(java.lang.String, byte[], j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (androidx.datastore.preferences.core.PreferencesKt.edit((androidx.datastore.core.DataStore) r8, r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.baicizhan.app.preferences.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(@m80.k java.lang.String r6, int r7, @m80.k j00.c<? super yz.g2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.baicizhan.app.preferences.BczPreference.l
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.app.preferences.BczPreference$l r0 = (com.baicizhan.app.preferences.BczPreference.l) r0
            int r1 = r0.f15865e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15865e = r1
            goto L18
        L13:
            com.baicizhan.app.preferences.BczPreference$l r0 = new com.baicizhan.app.preferences.BczPreference$l
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15863c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15865e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f15861a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r8)
            goto L6d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            int r7 = r0.f15862b
            java.lang.Object r6 = r0.f15861a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r8)
            goto L54
        L42:
            kotlin.e.n(r8)
            x00.l<j00.c<? super androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>>, java.lang.Object> r8 = r5.f15782a
            r0.f15861a = r6
            r0.f15862b = r7
            r0.f15865e = r4
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L54
            goto L6c
        L54:
            androidx.datastore.core.DataStore r8 = (androidx.datastore.core.DataStore) r8
            com.baicizhan.app.preferences.BczPreference$m r2 = new com.baicizhan.app.preferences.BczPreference$m
            r4 = 0
            r2.<init>(r6, r7, r4)
            java.lang.Object r6 = l00.k.a(r6)
            r0.f15861a = r6
            r0.f15862b = r7
            r0.f15865e = r3
            java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.edit(r8, r2, r0)
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.preferences.BczPreference.f(java.lang.String, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (androidx.datastore.preferences.core.PreferencesKt.edit((androidx.datastore.core.DataStore) r8, r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.baicizhan.app.preferences.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(@m80.k java.lang.String r6, boolean r7, @m80.k j00.c<? super yz.g2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.baicizhan.app.preferences.BczPreference.h
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.app.preferences.BczPreference$h r0 = (com.baicizhan.app.preferences.BczPreference.h) r0
            int r1 = r0.f15847e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15847e = r1
            goto L18
        L13:
            com.baicizhan.app.preferences.BczPreference$h r0 = new com.baicizhan.app.preferences.BczPreference$h
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15845c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15847e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f15843a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r8)
            goto L6d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            boolean r7 = r0.f15844b
            java.lang.Object r6 = r0.f15843a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r8)
            goto L54
        L42:
            kotlin.e.n(r8)
            x00.l<j00.c<? super androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>>, java.lang.Object> r8 = r5.f15782a
            r0.f15843a = r6
            r0.f15844b = r7
            r0.f15847e = r4
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L54
            goto L6c
        L54:
            androidx.datastore.core.DataStore r8 = (androidx.datastore.core.DataStore) r8
            com.baicizhan.app.preferences.BczPreference$i r2 = new com.baicizhan.app.preferences.BczPreference$i
            r4 = 0
            r2.<init>(r6, r7, r4)
            java.lang.Object r6 = l00.k.a(r6)
            r0.f15843a = r6
            r0.f15844b = r7
            r0.f15847e = r3
            java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.edit(r8, r2, r0)
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.preferences.BczPreference.g(java.lang.String, boolean, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r9 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.baicizhan.app.preferences.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(@m80.k final java.lang.String r6, final long r7, @m80.k j00.c<? super java.lang.Long> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.baicizhan.app.preferences.BczPreference.f
            if (r0 == 0) goto L13
            r0 = r9
            com.baicizhan.app.preferences.BczPreference$f r0 = (com.baicizhan.app.preferences.BczPreference.f) r0
            int r1 = r0.f15837e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15837e = r1
            goto L18
        L13:
            com.baicizhan.app.preferences.BczPreference$f r0 = new com.baicizhan.app.preferences.BczPreference$f
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f15835c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15837e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f15833a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r9)
            return r9
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            long r7 = r0.f15834b
            java.lang.Object r6 = r0.f15833a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r9)
            goto L54
        L42:
            kotlin.e.n(r9)
            x00.l<j00.c<? super androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>>, java.lang.Object> r9 = r5.f15782a
            r0.f15833a = r6
            r0.f15834b = r7
            r0.f15837e = r4
            java.lang.Object r9 = r9.invoke(r0)
            if (r9 != r1) goto L54
            goto L6f
        L54:
            androidx.datastore.core.DataStore r9 = (androidx.datastore.core.DataStore) r9
            kotlinx.coroutines.flow.i r9 = r9.getData()
            com.baicizhan.app.preferences.BczPreference$getLong$$inlined$map$1 r2 = new com.baicizhan.app.preferences.BczPreference$getLong$$inlined$map$1
            r2.<init>()
            java.lang.Object r6 = l00.k.a(r6)
            r0.f15833a = r6
            r0.f15834b = r7
            r0.f15837e = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.k.w0(r2, r0)
            if (r6 != r1) goto L70
        L6f:
            return r1
        L70:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.preferences.BczPreference.h(java.lang.String, long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006a, code lost:
    
        if (androidx.datastore.preferences.core.PreferencesKt.edit((androidx.datastore.core.DataStore) r9, r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.baicizhan.app.preferences.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(@m80.k java.lang.String r6, long r7, @m80.k j00.c<? super yz.g2> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.baicizhan.app.preferences.BczPreference.n
            if (r0 == 0) goto L13
            r0 = r9
            com.baicizhan.app.preferences.BczPreference$n r0 = (com.baicizhan.app.preferences.BczPreference.n) r0
            int r1 = r0.f15874e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15874e = r1
            goto L18
        L13:
            com.baicizhan.app.preferences.BczPreference$n r0 = new com.baicizhan.app.preferences.BczPreference$n
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f15872c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15874e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.f15870a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r9)
            goto L6d
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            long r7 = r0.f15871b
            java.lang.Object r6 = r0.f15870a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r9)
            goto L54
        L42:
            kotlin.e.n(r9)
            x00.l<j00.c<? super androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>>, java.lang.Object> r9 = r5.f15782a
            r0.f15870a = r6
            r0.f15871b = r7
            r0.f15874e = r4
            java.lang.Object r9 = r9.invoke(r0)
            if (r9 != r1) goto L54
            goto L6c
        L54:
            androidx.datastore.core.DataStore r9 = (androidx.datastore.core.DataStore) r9
            com.baicizhan.app.preferences.BczPreference$o r2 = new com.baicizhan.app.preferences.BczPreference$o
            r4 = 0
            r2.<init>(r6, r7, r4)
            java.lang.Object r6 = l00.k.a(r6)
            r0.f15870a = r6
            r0.f15871b = r7
            r0.f15874e = r3
            java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.edit(r9, r2, r0)
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.preferences.BczPreference.i(java.lang.String, long, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.baicizhan.app.preferences.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(@m80.k final java.lang.String r6, @m80.k final java.lang.String r7, @m80.k j00.c<? super java.lang.String> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.baicizhan.app.preferences.BczPreference.g
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.app.preferences.BczPreference$g r0 = (com.baicizhan.app.preferences.BczPreference.g) r0
            int r1 = r0.f15842e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15842e = r1
            goto L18
        L13:
            com.baicizhan.app.preferences.BczPreference$g r0 = new com.baicizhan.app.preferences.BczPreference$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15840c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15842e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f15839b
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f15838a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r8)
            return r8
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.f15839b
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.f15838a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r8)
            goto L5b
        L49:
            kotlin.e.n(r8)
            x00.l<j00.c<? super androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>>, java.lang.Object> r8 = r5.f15782a
            r0.f15838a = r6
            r0.f15839b = r7
            r0.f15842e = r4
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L5b
            goto L7a
        L5b:
            androidx.datastore.core.DataStore r8 = (androidx.datastore.core.DataStore) r8
            kotlinx.coroutines.flow.i r8 = r8.getData()
            com.baicizhan.app.preferences.BczPreference$getString$$inlined$map$1 r2 = new com.baicizhan.app.preferences.BczPreference$getString$$inlined$map$1
            r2.<init>()
            java.lang.Object r6 = l00.k.a(r6)
            r0.f15838a = r6
            java.lang.Object r6 = l00.k.a(r7)
            r0.f15839b = r6
            r0.f15842e = r3
            java.lang.Object r6 = kotlinx.coroutines.flow.k.w0(r2, r0)
            if (r6 != r1) goto L7b
        L7a:
            return r1
        L7b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.preferences.BczPreference.j(java.lang.String, java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
    
        if (androidx.datastore.preferences.core.PreferencesKt.edit((androidx.datastore.core.DataStore) r8, r2, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0077, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.baicizhan.app.preferences.g
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(@m80.k java.lang.String r6, @m80.k java.lang.String r7, @m80.k j00.c<? super yz.g2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.baicizhan.app.preferences.BczPreference.p
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.app.preferences.BczPreference$p r0 = (com.baicizhan.app.preferences.BczPreference.p) r0
            int r1 = r0.f15883e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15883e = r1
            goto L18
        L13:
            com.baicizhan.app.preferences.BczPreference$p r0 = new com.baicizhan.app.preferences.BczPreference$p
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f15881c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f15883e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.f15880b
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f15879a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r8)
            goto L78
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            java.lang.Object r6 = r0.f15880b
            r7 = r6
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r6 = r0.f15879a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.e.n(r8)
            goto L5b
        L49:
            kotlin.e.n(r8)
            x00.l<j00.c<? super androidx.datastore.core.DataStore<androidx.datastore.preferences.core.Preferences>>, java.lang.Object> r8 = r5.f15782a
            r0.f15879a = r6
            r0.f15880b = r7
            r0.f15883e = r4
            java.lang.Object r8 = r8.invoke(r0)
            if (r8 != r1) goto L5b
            goto L77
        L5b:
            androidx.datastore.core.DataStore r8 = (androidx.datastore.core.DataStore) r8
            com.baicizhan.app.preferences.BczPreference$q r2 = new com.baicizhan.app.preferences.BczPreference$q
            r4 = 0
            r2.<init>(r6, r7, r4)
            java.lang.Object r6 = l00.k.a(r6)
            r0.f15879a = r6
            java.lang.Object r6 = l00.k.a(r7)
            r0.f15880b = r6
            r0.f15883e = r3
            java.lang.Object r6 = androidx.datastore.preferences.core.PreferencesKt.edit(r8, r2, r0)
            if (r6 != r1) goto L78
        L77:
            return r1
        L78:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.preferences.BczPreference.k(java.lang.String, java.lang.String, j00.c):java.lang.Object");
    }
}
