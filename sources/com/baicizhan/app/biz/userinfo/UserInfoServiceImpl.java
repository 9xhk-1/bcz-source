package com.baicizhan.app.biz.userinfo;

import c4.o;
import c40.s0;
import com.baicizhan.app.biz.auth.p;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.microsoft.thrifty.service.a;
import k3.v3;
import k3.x3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.m0;
import l7.i0;
import oa0.r;
import v8.t;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {x3.class})
@u0({"SMAP\nUserInfoServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoServiceImpl.kt\ncom/baicizhan/app/biz/userinfo/UserInfoServiceImpl\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService\n+ 6 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt\n+ 7 ThriftService.kt\ncom/baicizhan/app/biz/thrift/ThriftService$thrift$1\n+ 8 Koin.kt\norg/koin/core/Koin\n+ 9 Scope.kt\norg/koin/core/scope/Scope\n+ 10 TimeMeasurer.kt\ncom/baicizhan/app/biz/base/TimeMeasurerKt\n+ 11 BizCatch.kt\ncom/baicizhan/app/biz/base/BizCatchKt\n+ 12 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 13 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,150:1\n49#2:151\n51#2:155\n46#3:152\n51#3:154\n105#4:153\n6#5:156\n64#6,2:157\n66#6:160\n67#6,2:166\n6#7:159\n124#8,4:161\n142#9:165\n12#10,3:168\n15#10,10:183\n12#11,12:171\n1563#12:193\n1634#12,3:194\n37#13,2:197\n*S KotlinDebug\n*F\n+ 1 UserInfoServiceImpl.kt\ncom/baicizhan/app/biz/userinfo/UserInfoServiceImpl\n*L\n42#1:151\n42#1:155\n42#1:152\n42#1:154\n42#1:153\n46#1:156\n46#1:157,2\n46#1:160\n46#1:166,2\n46#1:159\n46#1:161,4\n46#1:165\n-1#1:168,3\n-1#1:183,10\n-1#1:171,12\n112#1:193\n112#1:194,3\n114#1:197,2\n*E\n"})
/* loaded from: classes3.dex */
public final class UserInfoServiceImpl implements x3, c4.j, p {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final s7.b f15624b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final n7.e f15625c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final r3.d f15626d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final l7.p f15627e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final m0<v3> f15628f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userinfo.UserInfoServiceImpl", f = "UserInfoServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {98}, m = "editAvatar", n = {q9.h.f81940d, "tag$iv", "newRecord", "record", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$editAvatar$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$editAvatar$2$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15631a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15632b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15633c;

        /* renamed from: d, reason: collision with root package name */
        public Object f15634d;

        /* renamed from: e, reason: collision with root package name */
        public int f15635e;

        /* renamed from: f, reason: collision with root package name */
        public int f15636f;

        /* renamed from: g, reason: collision with root package name */
        public int f15637g;

        /* renamed from: h, reason: collision with root package name */
        public int f15638h;

        /* renamed from: i, reason: collision with root package name */
        public long f15639i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f15640j;

        /* renamed from: l, reason: collision with root package name */
        public int f15642l;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15640j = obj;
            this.f15642l |= Integer.MIN_VALUE;
            return UserInfoServiceImpl.this.I1(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userinfo.UserInfoServiceImpl", f = "UserInfoServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {81, 83}, m = "editBirthday", n = {"tag$iv", "record", "birthday", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$editBirthday$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$editBirthday$2$1", "birthdayStamp", "tag$iv", "newRecord", "record", "birthday", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$editBirthday$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$editBirthday$2$1", "birthdayStamp"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4", "J$1", "L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4", "J$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public int f15643a;

        /* renamed from: b, reason: collision with root package name */
        public int f15644b;

        /* renamed from: c, reason: collision with root package name */
        public int f15645c;

        /* renamed from: d, reason: collision with root package name */
        public int f15646d;

        /* renamed from: e, reason: collision with root package name */
        public int f15647e;

        /* renamed from: f, reason: collision with root package name */
        public Object f15648f;

        /* renamed from: g, reason: collision with root package name */
        public Object f15649g;

        /* renamed from: h, reason: collision with root package name */
        public Object f15650h;

        /* renamed from: i, reason: collision with root package name */
        public long f15651i;

        /* renamed from: j, reason: collision with root package name */
        public long f15652j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f15653k;

        /* renamed from: m, reason: collision with root package name */
        public int f15655m;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15653k = obj;
            this.f15655m |= Integer.MIN_VALUE;
            return UserInfoServiceImpl.this.H(0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userinfo.UserInfoServiceImpl", f = "UserInfoServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {72, 74}, m = "editGender", n = {"gender", "tag$iv", "record", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$editGender$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$editGender$2$1", "gender", "tag$iv", "newRecord", "record", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$editGender$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$editGender$2$1"}, s = {"L$0", "L$1", "L$2", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15656a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15657b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15658c;

        /* renamed from: d, reason: collision with root package name */
        public Object f15659d;

        /* renamed from: e, reason: collision with root package name */
        public int f15660e;

        /* renamed from: f, reason: collision with root package name */
        public int f15661f;

        /* renamed from: g, reason: collision with root package name */
        public int f15662g;

        /* renamed from: h, reason: collision with root package name */
        public int f15663h;

        /* renamed from: i, reason: collision with root package name */
        public long f15664i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f15665j;

        /* renamed from: l, reason: collision with root package name */
        public int f15667l;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15665j = obj;
            this.f15667l |= Integer.MIN_VALUE;
            return UserInfoServiceImpl.this.p0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userinfo.UserInfoServiceImpl", f = "UserInfoServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {104, 106}, m = "editLocationInfo", n = {"locationInfo", "tag$iv", "record", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$editLocationInfo$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$editLocationInfo$2$1", "locationInfo", "tag$iv", "newRecord", "record", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$editLocationInfo$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$editLocationInfo$2$1"}, s = {"L$0", "L$1", "L$2", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15668a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15669b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15670c;

        /* renamed from: d, reason: collision with root package name */
        public Object f15671d;

        /* renamed from: e, reason: collision with root package name */
        public int f15672e;

        /* renamed from: f, reason: collision with root package name */
        public int f15673f;

        /* renamed from: g, reason: collision with root package name */
        public int f15674g;

        /* renamed from: h, reason: collision with root package name */
        public int f15675h;

        /* renamed from: i, reason: collision with root package name */
        public long f15676i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f15677j;

        /* renamed from: l, reason: collision with root package name */
        public int f15679l;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15677j = obj;
            this.f15679l |= Integer.MIN_VALUE;
            return UserInfoServiceImpl.this.e0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userinfo.UserInfoServiceImpl", f = "UserInfoServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {64, 66}, m = "editName", n = {"name", "tag$iv", "record", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$editName$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$editName$2$1", "name", "tag$iv", "newRecord", "record", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$editName$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$editName$2$1"}, s = {"L$0", "L$1", "L$2", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15680a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15681b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15682c;

        /* renamed from: d, reason: collision with root package name */
        public Object f15683d;

        /* renamed from: e, reason: collision with root package name */
        public int f15684e;

        /* renamed from: f, reason: collision with root package name */
        public int f15685f;

        /* renamed from: g, reason: collision with root package name */
        public int f15686g;

        /* renamed from: h, reason: collision with root package name */
        public int f15687h;

        /* renamed from: i, reason: collision with root package name */
        public long f15688i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f15689j;

        /* renamed from: l, reason: collision with root package name */
        public int f15691l;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15689j = obj;
            this.f15691l |= Integer.MIN_VALUE;
            return UserInfoServiceImpl.this.j0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userinfo.UserInfoServiceImpl", f = "UserInfoServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {89, 91}, m = "editRole", n = {"role", "tag$iv", "record", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$editRole$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$editRole$2$1", "role", "tag$iv", "newRecord", "record", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$editRole$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$editRole$2$1"}, s = {"L$0", "L$1", "L$2", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15692a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15693b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15694c;

        /* renamed from: d, reason: collision with root package name */
        public Object f15695d;

        /* renamed from: e, reason: collision with root package name */
        public int f15696e;

        /* renamed from: f, reason: collision with root package name */
        public int f15697f;

        /* renamed from: g, reason: collision with root package name */
        public int f15698g;

        /* renamed from: h, reason: collision with root package name */
        public int f15699h;

        /* renamed from: i, reason: collision with root package name */
        public long f15700i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f15701j;

        /* renamed from: l, reason: collision with root package name */
        public int f15703l;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15701j = obj;
            this.f15703l |= Integer.MIN_VALUE;
            return UserInfoServiceImpl.this.i2(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userinfo.UserInfoServiceImpl", f = "UserInfoServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {131, 132}, m = "editSchool", n = {"school", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$editSchool$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$editSchool$2$1", "school", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$editSchool$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$editSchool$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15704a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15705b;

        /* renamed from: c, reason: collision with root package name */
        public int f15706c;

        /* renamed from: d, reason: collision with root package name */
        public int f15707d;

        /* renamed from: e, reason: collision with root package name */
        public int f15708e;

        /* renamed from: f, reason: collision with root package name */
        public int f15709f;

        /* renamed from: g, reason: collision with root package name */
        public long f15710g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f15711h;

        /* renamed from: j, reason: collision with root package name */
        public int f15713j;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15711h = obj;
            this.f15713j |= Integer.MIN_VALUE;
            return UserInfoServiceImpl.this.g0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userinfo.UserInfoServiceImpl", f = "UserInfoServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2}, l = {54, 55, 56}, m = "load", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$load$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$load$2$1", "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$load$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$load$2$1", "tag$iv", "it", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$load$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$load$2$1", "$i$a$-also-UserInfoServiceImpl$load$2$1$userInfo$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "I$0", "J$0", "I$1", "I$2", "I$3", "L$0", "L$2", "I$0", "J$0", "I$1", "I$2", "I$3", "I$4"}, v = 1)
    public static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15714a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15715b;

        /* renamed from: c, reason: collision with root package name */
        public Object f15716c;

        /* renamed from: d, reason: collision with root package name */
        public int f15717d;

        /* renamed from: e, reason: collision with root package name */
        public int f15718e;

        /* renamed from: f, reason: collision with root package name */
        public int f15719f;

        /* renamed from: g, reason: collision with root package name */
        public int f15720g;

        /* renamed from: h, reason: collision with root package name */
        public int f15721h;

        /* renamed from: i, reason: collision with root package name */
        public long f15722i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f15723j;

        /* renamed from: l, reason: collision with root package name */
        public int f15725l;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15723j = obj;
            this.f15725l |= Integer.MIN_VALUE;
            return UserInfoServiceImpl.this.V(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userinfo.UserInfoServiceImpl", f = "UserInfoServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {142}, m = "onLogout", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$onLogout$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$onLogout$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15726a;

        /* renamed from: b, reason: collision with root package name */
        public int f15727b;

        /* renamed from: c, reason: collision with root package name */
        public int f15728c;

        /* renamed from: d, reason: collision with root package name */
        public int f15729d;

        /* renamed from: e, reason: collision with root package name */
        public int f15730e;

        /* renamed from: f, reason: collision with root package name */
        public long f15731f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f15732g;

        /* renamed from: i, reason: collision with root package name */
        public int f15734i;

        public i(j00.c<? super i> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15732g = obj;
            this.f15734i |= Integer.MIN_VALUE;
            return UserInfoServiceImpl.this.A2(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userinfo.UserInfoServiceImpl", f = "UserInfoServiceImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {112}, m = "queryLocationInfo", n = {"tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$queryLocationInfo$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$queryLocationInfo$2$1"}, s = {"L$0", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15735a;

        /* renamed from: b, reason: collision with root package name */
        public int f15736b;

        /* renamed from: c, reason: collision with root package name */
        public int f15737c;

        /* renamed from: d, reason: collision with root package name */
        public int f15738d;

        /* renamed from: e, reason: collision with root package name */
        public int f15739e;

        /* renamed from: f, reason: collision with root package name */
        public long f15740f;

        /* renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f15741g;

        /* renamed from: i, reason: collision with root package name */
        public int f15743i;

        public j(j00.c<? super j> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15741g = obj;
            this.f15743i |= Integer.MIN_VALUE;
            return UserInfoServiceImpl.this.O(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userinfo.UserInfoServiceImpl", f = "UserInfoServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {137}, m = "reportSchool", n = {"schoolName", "tag$iv", "type", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$reportSchool$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$reportSchool$2$1"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3", "I$4"}, v = 1)
    public static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15744a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15745b;

        /* renamed from: c, reason: collision with root package name */
        public int f15746c;

        /* renamed from: d, reason: collision with root package name */
        public int f15747d;

        /* renamed from: e, reason: collision with root package name */
        public int f15748e;

        /* renamed from: f, reason: collision with root package name */
        public int f15749f;

        /* renamed from: g, reason: collision with root package name */
        public int f15750g;

        /* renamed from: h, reason: collision with root package name */
        public long f15751h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f15752i;

        /* renamed from: k, reason: collision with root package name */
        public int f15754k;

        public k(j00.c<? super k> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15752i = obj;
            this.f15754k |= Integer.MIN_VALUE;
            return UserInfoServiceImpl.this.m2(null, 0, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userinfo.UserInfoServiceImpl", f = "UserInfoServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {126}, m = "searchMajor", n = {HiAnalyticsConstant.Direction.REQUEST, "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$searchMajor$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$searchMajor$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class l extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15755a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15756b;

        /* renamed from: c, reason: collision with root package name */
        public int f15757c;

        /* renamed from: d, reason: collision with root package name */
        public int f15758d;

        /* renamed from: e, reason: collision with root package name */
        public int f15759e;

        /* renamed from: f, reason: collision with root package name */
        public int f15760f;

        /* renamed from: g, reason: collision with root package name */
        public long f15761g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f15762h;

        /* renamed from: j, reason: collision with root package name */
        public int f15764j;

        public l(j00.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15762h = obj;
            this.f15764j |= Integer.MIN_VALUE;
            return UserInfoServiceImpl.this.J1(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.userinfo.UserInfoServiceImpl", f = "UserInfoServiceImpl.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {121}, m = "searchSchool", n = {HiAnalyticsConstant.Direction.REQUEST, "tag$iv", "$i$f$measureTimeMillis", "enter$iv", "$i$a$-measureTimeMillis-UserInfoServiceImpl$searchSchool$2", "$i$f$bizCatch", "$i$a$-bizCatch-UserInfoServiceImpl$searchSchool$2$1"}, s = {"L$0", "L$1", "I$0", "J$0", "I$1", "I$2", "I$3"}, v = 1)
    public static final class m extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f15765a;

        /* renamed from: b, reason: collision with root package name */
        public Object f15766b;

        /* renamed from: c, reason: collision with root package name */
        public int f15767c;

        /* renamed from: d, reason: collision with root package name */
        public int f15768d;

        /* renamed from: e, reason: collision with root package name */
        public int f15769e;

        /* renamed from: f, reason: collision with root package name */
        public int f15770f;

        /* renamed from: g, reason: collision with root package name */
        public long f15771g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f15772h;

        /* renamed from: j, reason: collision with root package name */
        public int f15774j;

        public m(j00.c<? super m> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f15772h = obj;
            this.f15774j |= Integer.MIN_VALUE;
            return UserInfoServiceImpl.this.f0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1\n*L\n1#1,122:1\n*E\n"})
    public static final class n implements x00.l<w7.d<t>, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h10.d f15775a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l7.e f15776b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l7.c f15777c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @u0({"SMAP\nThriftServiceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThriftServiceImpl.kt\ncom/baicizhan/app/biz/thrift/ThriftServiceImplKt$thriftImpl$1$1\n*L\n1#1,77:1\n*E\n"})
        public static final class a implements x00.l<d.a, g2> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l7.e f15778a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l7.c f15779b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h10.d f15780c;

            public a(l7.e eVar, l7.c cVar, h10.d dVar) {
                this.f15778a = eVar;
                this.f15779b = cVar;
                this.f15780c = dVar;
            }

            public final void a(d.a randomRetry) {
                g0.p(randomRetry, "$this$randomRetry");
                Integer a11 = this.f15778a.a();
                if (a11 != null) {
                    randomRetry.i(a11.intValue());
                }
                Long b11 = this.f15778a.b();
                if (b11 != null) {
                    randomRetry.h(new Long[]{Long.valueOf(b11.longValue())});
                }
                randomRetry.j(this.f15779b.b(this.f15780c));
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(d.a aVar) {
                a(aVar);
                return g2.f100423a;
            }
        }

        public n(h10.d dVar, l7.e eVar, l7.c cVar) {
            this.f15775a = dVar;
            this.f15776b = eVar;
            this.f15777c = cVar;
        }

        public final void a(w7.d<t> thriftBuilder) {
            g0.p(thriftBuilder, "$this$thriftBuilder");
            y7.f.a(thriftBuilder, new a(this.f15776b, this.f15777c, this.f15775a));
            x00.p<ws.i, a.InterfaceC0480a, ?> pVar = i0.o().get(this.f15775a);
            g0.n(pVar, "null cannot be cast to non-null type kotlin.Function2<com.microsoft.thrifty.protocol.Protocol, com.microsoft.thrifty.service.AsyncClientBase.Listener, T of com.baicizhan.app.biz.thrift.ThriftServiceImplKt.thriftImpl>");
            thriftBuilder.f((x00.p) x0.q(pVar, 2));
            thriftBuilder.g(i0.a.b.f70581a);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(w7.d<t> dVar) {
            a(dVar);
            return g2.f100423a;
        }
    }

    public UserInfoServiceImpl(@m80.k s7.b userInfoStore, @m80.k n7.e userBasicInfo, @m80.k r3.d userRecordStorage, @m80.k com.baicizhan.app.biz.auth.n logoutHub, @m80.k l7.p thriftService) {
        g0.p(userInfoStore, "userInfoStore");
        g0.p(userBasicInfo, "userBasicInfo");
        g0.p(userRecordStorage, "userRecordStorage");
        g0.p(logoutHub, "logoutHub");
        g0.p(thriftService, "thriftService");
        this.f15624b = userInfoStore;
        this.f15625c = userBasicInfo;
        this.f15626d = userRecordStorage;
        this.f15627e = thriftService;
        final m0<s7.c> h11 = userInfoStore.h();
        this.f15628f = kotlinx.coroutines.flow.k.Q1(new kotlinx.coroutines.flow.i<v3>() { // from class: com.baicizhan.app.biz.userinfo.UserInfoServiceImpl$special$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 UserInfoServiceImpl.kt\ncom/baicizhan/app/biz/userinfo/UserInfoServiceImpl\n*L\n1#1,49:1\n50#2:50\n43#3:51\n*E\n"})
            /* renamed from: com.baicizhan.app.biz.userinfo.UserInfoServiceImpl$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f15630a;

                @l00.d(c = "com.baicizhan.app.biz.userinfo.UserInfoServiceImpl$special$$inlined$map$1$2", f = "UserInfoServiceImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.app.biz.userinfo.UserInfoServiceImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(j00.c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.f15630a = jVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r6, j00.c r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.baicizhan.app.biz.userinfo.UserInfoServiceImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.baicizhan.app.biz.userinfo.UserInfoServiceImpl$special$$inlined$map$1$2$1 r0 = (com.baicizhan.app.biz.userinfo.UserInfoServiceImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.app.biz.userinfo.UserInfoServiceImpl$special$$inlined$map$1$2$1 r0 = new com.baicizhan.app.biz.userinfo.UserInfoServiceImpl$special$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r6 = r0.L$3
                        kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.j) r6
                        java.lang.Object r6 = r0.L$1
                        com.baicizhan.app.biz.userinfo.UserInfoServiceImpl$special$$inlined$map$1$2$1 r6 = (com.baicizhan.app.biz.userinfo.UserInfoServiceImpl$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        kotlin.e.n(r7)
                        goto L6d
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        kotlin.e.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f15630a
                        r2 = r6
                        s7.c r2 = (s7.c) r2
                        if (r2 == 0) goto L48
                        k3.v3 r2 = com.baicizhan.app.biz.userinfo.a.k(r2)
                        goto L49
                    L48:
                        r2 = 0
                    L49:
                        java.lang.Object r4 = l00.k.a(r6)
                        r0.L$0 = r4
                        java.lang.Object r4 = l00.k.a(r0)
                        r0.L$1 = r4
                        java.lang.Object r6 = l00.k.a(r6)
                        r0.L$2 = r6
                        java.lang.Object r6 = l00.k.a(r7)
                        r0.L$3 = r6
                        r6 = 0
                        r0.I$0 = r6
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L6d
                        return r1
                    L6d:
                        yz.g2 r6 = yz.g2.f100423a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.userinfo.UserInfoServiceImpl$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super v3> jVar, j00.c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }, s0.a(o.c()), h0.f68148a.c(), null);
        logoutHub.b(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:22:0x00a3, B:24:0x00aa, B:26:0x00ae, B:28:0x00b2, B:30:0x00b6, B:32:0x00ba, B:43:0x0121, B:34:0x00c5, B:36:0x00d0, B:38:0x00e4, B:40:0x00f8, B:42:0x010d), top: B:21:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010d A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:22:0x00a3, B:24:0x00aa, B:26:0x00ae, B:28:0x00b2, B:30:0x00b6, B:32:0x00ba, B:43:0x0121, B:34:0x00c5, B:36:0x00d0, B:38:0x00e4, B:40:0x00f8, B:42:0x010d), top: B:21:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.baicizhan.app.biz.auth.p
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A2(@m80.k j00.c<? super yz.g2> r12) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.userinfo.UserInfoServiceImpl.A2(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0150 A[Catch: all -> 0x0168, TryCatch #2 {all -> 0x0168, blocks: (B:22:0x0149, B:24:0x0150, B:26:0x0154, B:28:0x0158, B:30:0x015c, B:32:0x0160, B:43:0x01c6, B:34:0x016a, B:36:0x0175, B:38:0x0189, B:40:0x019d, B:42:0x01b2), top: B:21:0x0149 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b2 A[Catch: all -> 0x0168, TryCatch #2 {all -> 0x0168, blocks: (B:22:0x0149, B:24:0x0150, B:26:0x0154, B:28:0x0158, B:30:0x015c, B:32:0x0160, B:43:0x01c6, B:34:0x016a, B:36:0x0175, B:38:0x0189, B:40:0x019d, B:42:0x01b2), top: B:21:0x0149 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // k3.x3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object H(int r30, @m80.k j00.c<? super yz.g2> r31) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.userinfo.UserInfoServiceImpl.H(int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fb A[Catch: all -> 0x0113, TryCatch #1 {all -> 0x0113, blocks: (B:21:0x00f4, B:23:0x00fb, B:25:0x00ff, B:27:0x0103, B:29:0x0107, B:31:0x010b, B:42:0x0171, B:33:0x0115, B:35:0x0120, B:37:0x0134, B:39:0x0148, B:41:0x015d), top: B:20:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015d A[Catch: all -> 0x0113, TryCatch #1 {all -> 0x0113, blocks: (B:21:0x00f4, B:23:0x00fb, B:25:0x00ff, B:27:0x0103, B:29:0x0107, B:31:0x010b, B:42:0x0171, B:33:0x0115, B:35:0x0120, B:37:0x0134, B:39:0x0148, B:41:0x015d), top: B:20:0x00f4 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // k3.x3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object I1(@m80.k java.lang.String r25, @m80.k j00.c<? super yz.g2> r26) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.userinfo.UserInfoServiceImpl.I1(java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2 A[Catch: all -> 0x00da, TryCatch #2 {all -> 0x00da, blocks: (B:22:0x00bb, B:24:0x00c2, B:26:0x00c6, B:28:0x00ca, B:30:0x00ce, B:32:0x00d2, B:43:0x0139, B:34:0x00dd, B:36:0x00e8, B:38:0x00fc, B:40:0x0110, B:42:0x0125), top: B:21:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125 A[Catch: all -> 0x00da, TryCatch #2 {all -> 0x00da, blocks: (B:22:0x00bb, B:24:0x00c2, B:26:0x00c6, B:28:0x00ca, B:30:0x00ce, B:32:0x00d2, B:43:0x0139, B:34:0x00dd, B:36:0x00e8, B:38:0x00fc, B:40:0x0110, B:42:0x0125), top: B:21:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.x3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object J1(@m80.k k3.n2 r11, @m80.k j00.c<? super k3.o2> r12) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.userinfo.UserInfoServiceImpl.J1(k3.n2, j00.c):java.lang.Object");
    }

    public final t K2() {
        return (t) w7.f.b(new n(o0.d(t.class), new l7.e(null, null, 3, null), (l7.c) c4.j.f7801a.a().P().h().i(o0.d(l7.c.class), null, null)));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[Catch: all -> 0x0033, LOOP:0: B:13:0x0087->B:15:0x008d, LOOP_END, TryCatch #0 {all -> 0x0033, blocks: (B:11:0x002f, B:12:0x0076, B:13:0x0087, B:15:0x008d, B:17:0x009b), top: B:10:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ff A[Catch: all -> 0x0117, TryCatch #2 {all -> 0x0117, blocks: (B:27:0x00f8, B:29:0x00ff, B:31:0x0103, B:33:0x0107, B:35:0x010b, B:37:0x010f, B:48:0x0176, B:39:0x011a, B:41:0x0125, B:43:0x0139, B:45:0x014d, B:47:0x0162), top: B:26:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0162 A[Catch: all -> 0x0117, TryCatch #2 {all -> 0x0117, blocks: (B:27:0x00f8, B:29:0x00ff, B:31:0x0103, B:33:0x0107, B:35:0x010b, B:37:0x010f, B:48:0x0176, B:39:0x011a, B:41:0x0125, B:43:0x0139, B:45:0x014d, B:47:0x0162), top: B:26:0x00f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // k3.x3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object O(@m80.k j00.c<? super k3.k1[]> r15) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.userinfo.UserInfoServiceImpl.O(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0144 A[Catch: all -> 0x015c, TryCatch #5 {all -> 0x015c, blocks: (B:24:0x013d, B:26:0x0144, B:28:0x0148, B:30:0x014c, B:32:0x0150, B:34:0x0154, B:45:0x01ba, B:36:0x015e, B:38:0x0169, B:40:0x017d, B:42:0x0191, B:44:0x01a6), top: B:23:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01a6 A[Catch: all -> 0x015c, TryCatch #5 {all -> 0x015c, blocks: (B:24:0x013d, B:26:0x0144, B:28:0x0148, B:30:0x014c, B:32:0x0150, B:34:0x0154, B:45:0x01ba, B:36:0x015e, B:38:0x0169, B:40:0x017d, B:42:0x0191, B:44:0x01a6), top: B:23:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b4 A[Catch: all -> 0x00fa, TryCatch #4 {all -> 0x00fa, blocks: (B:59:0x00ce, B:75:0x00b0, B:77:0x00b4), top: B:74:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // k3.x3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object V(@m80.k j00.c<? super k3.v3> r19) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.userinfo.UserInfoServiceImpl.V(j00.c):java.lang.Object");
    }

    @Override // k3.x3
    @m80.k
    public m0<v3> d1() {
        return this.f15628f;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0148 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:22:0x0141, B:24:0x0148, B:26:0x014c, B:28:0x0150, B:30:0x0154, B:32:0x0158, B:43:0x01be, B:34:0x0162, B:36:0x016d, B:38:0x0181, B:40:0x0195, B:42:0x01aa), top: B:21:0x0141 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01aa A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:22:0x0141, B:24:0x0148, B:26:0x014c, B:28:0x0150, B:30:0x0154, B:32:0x0158, B:43:0x01be, B:34:0x0162, B:36:0x016d, B:38:0x0181, B:40:0x0195, B:42:0x01aa), top: B:21:0x0141 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // k3.x3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e0(@m80.k k3.k1 r23, @m80.k j00.c<? super yz.g2> r24) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.userinfo.UserInfoServiceImpl.e0(k3.k1, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c2 A[Catch: all -> 0x00da, TryCatch #2 {all -> 0x00da, blocks: (B:22:0x00bb, B:24:0x00c2, B:26:0x00c6, B:28:0x00ca, B:30:0x00ce, B:32:0x00d2, B:43:0x0139, B:34:0x00dd, B:36:0x00e8, B:38:0x00fc, B:40:0x0110, B:42:0x0125), top: B:21:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125 A[Catch: all -> 0x00da, TryCatch #2 {all -> 0x00da, blocks: (B:22:0x00bb, B:24:0x00c2, B:26:0x00c6, B:28:0x00ca, B:30:0x00ce, B:32:0x00d2, B:43:0x0139, B:34:0x00dd, B:36:0x00e8, B:38:0x00fc, B:40:0x0110, B:42:0x0125), top: B:21:0x00bb }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.x3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f0(@m80.k k3.q2 r11, @m80.k j00.c<? super k3.r2> r12) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.userinfo.UserInfoServiceImpl.f0(k3.q2, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0103 A[Catch: all -> 0x011b, TryCatch #3 {all -> 0x011b, blocks: (B:23:0x00fc, B:25:0x0103, B:27:0x0107, B:29:0x010b, B:31:0x010f, B:33:0x0113, B:44:0x017a, B:35:0x011e, B:37:0x0129, B:39:0x013d, B:41:0x0151, B:43:0x0166), top: B:22:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0166 A[Catch: all -> 0x011b, TryCatch #3 {all -> 0x011b, blocks: (B:23:0x00fc, B:25:0x0103, B:27:0x0107, B:29:0x010b, B:31:0x010f, B:33:0x0113, B:44:0x017a, B:35:0x011e, B:37:0x0129, B:39:0x013d, B:41:0x0151, B:43:0x0166), top: B:22:0x00fc }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // k3.x3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g0(@m80.k k3.l2 r13, @m80.k j00.c<? super yz.g2> r14) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.userinfo.UserInfoServiceImpl.g0(k3.l2, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015d A[Catch: all -> 0x0175, TryCatch #1 {all -> 0x0175, blocks: (B:22:0x0156, B:24:0x015d, B:26:0x0161, B:28:0x0165, B:30:0x0169, B:32:0x016d, B:43:0x01d3, B:34:0x0177, B:36:0x0182, B:38:0x0196, B:40:0x01aa, B:42:0x01bf), top: B:21:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01bf A[Catch: all -> 0x0175, TryCatch #1 {all -> 0x0175, blocks: (B:22:0x0156, B:24:0x015d, B:26:0x0161, B:28:0x0165, B:30:0x0169, B:32:0x016d, B:43:0x01d3, B:34:0x0177, B:36:0x0182, B:38:0x0196, B:40:0x01aa, B:42:0x01bf), top: B:21:0x0156 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // k3.x3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i2(@m80.k k3.k2 r31, @m80.k j00.c<? super yz.g2> r32) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.userinfo.UserInfoServiceImpl.i2(k3.k2, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0147 A[Catch: all -> 0x015f, TryCatch #3 {all -> 0x015f, blocks: (B:22:0x0140, B:24:0x0147, B:26:0x014b, B:28:0x014f, B:30:0x0153, B:32:0x0157, B:43:0x01bd, B:34:0x0161, B:36:0x016c, B:38:0x0180, B:40:0x0194, B:42:0x01a9), top: B:21:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a9 A[Catch: all -> 0x015f, TryCatch #3 {all -> 0x015f, blocks: (B:22:0x0140, B:24:0x0147, B:26:0x014b, B:28:0x014f, B:30:0x0153, B:32:0x0157, B:43:0x01bd, B:34:0x0161, B:36:0x016c, B:38:0x0180, B:40:0x0194, B:42:0x01a9), top: B:21:0x0140 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // k3.x3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j0(@m80.k java.lang.String r29, @m80.k j00.c<? super yz.g2> r30) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.userinfo.UserInfoServiceImpl.j0(java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9 A[Catch: all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:22:0x00b2, B:24:0x00b9, B:26:0x00bd, B:28:0x00c1, B:30:0x00c5, B:32:0x00c9, B:43:0x0130, B:34:0x00d4, B:36:0x00df, B:38:0x00f3, B:40:0x0107, B:42:0x011c), top: B:21:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011c A[Catch: all -> 0x00d1, TryCatch #0 {all -> 0x00d1, blocks: (B:22:0x00b2, B:24:0x00b9, B:26:0x00bd, B:28:0x00c1, B:30:0x00c5, B:32:0x00c9, B:43:0x0130, B:34:0x00d4, B:36:0x00df, B:38:0x00f3, B:40:0x0107, B:42:0x011c), top: B:21:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // k3.x3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m2(@m80.k java.lang.String r11, int r12, @m80.k j00.c<? super yz.g2> r13) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.userinfo.UserInfoServiceImpl.m2(java.lang.String, int, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0156 A[Catch: all -> 0x016e, TryCatch #3 {all -> 0x016e, blocks: (B:22:0x014f, B:24:0x0156, B:26:0x015a, B:28:0x015e, B:30:0x0162, B:32:0x0166, B:43:0x01cc, B:34:0x0170, B:36:0x017b, B:38:0x018f, B:40:0x01a3, B:42:0x01b8), top: B:21:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b8 A[Catch: all -> 0x016e, TryCatch #3 {all -> 0x016e, blocks: (B:22:0x014f, B:24:0x0156, B:26:0x015a, B:28:0x015e, B:30:0x0162, B:32:0x0166, B:43:0x01cc, B:34:0x0170, B:36:0x017b, B:38:0x018f, B:40:0x01a3, B:42:0x01b8), top: B:21:0x014f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // k3.x3
    @m80.l
    @s3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p0(@m80.k com.baicizhan.app.api.service.Gender r31, @m80.k j00.c<? super yz.g2> r32) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.userinfo.UserInfoServiceImpl.p0(com.baicizhan.app.api.service.Gender, j00.c):java.lang.Object");
    }

    @Override // c4.j, pa0.a
    @m80.k
    public /* bridge */ na0.a r() {
        return super.r();
    }
}
