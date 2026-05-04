package ki;

import a00.i0;
import c40.h1;
import c40.m0;
import com.baicizhan.main.vld.model.VocabularyDeviceInfo;
import com.baicizhan.online.user_book.MachineBindHint;
import com.baicizhan.online.user_book.UserBookService;
import com.baicizhan.online.user_book.UserMachineInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g implements ki.f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m0 f66556a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.model.DeviceManagerImpl", f = "DeviceManager.kt", i = {}, l = {57}, m = "getBondingTips-IoAF18A", n = {}, s = {}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f66557a;

        /* renamed from: c, reason: collision with root package name */
        public int f66559c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f66557a = obj;
            this.f66559c |= Integer.MIN_VALUE;
            Object b11 = g.this.b(this);
            return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : Result.m6307boximpl(b11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.model.DeviceManagerImpl$getBondingTips$2", f = "DeviceManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @u0({"SMAP\nDeviceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceManager.kt\ncom/baicizhan/main/vld/model/DeviceManagerImpl$getBondingTips$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1563#2:62\n1634#2,3:63\n*S KotlinDebug\n*F\n+ 1 DeviceManager.kt\ncom/baicizhan/main/vld/model/DeviceManagerImpl$getBondingTips$2\n*L\n58#1:62\n58#1:63,3\n*E\n"})
    public static final class b extends SuspendLambda implements x00.l<j00.c<? super List<? extends ki.a>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f66560a;

        public b(j00.c<? super b> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return g.this.new b(cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super List<ki.a>> cVar) {
            return ((b) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f66560a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            List<MachineBindHint> list = g.this.f().get_machine_bind_hint();
            g0.o(list, "get_machine_bind_hint(...)");
            List<MachineBindHint> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            for (MachineBindHint machineBindHint : list2) {
                String str = machineBindHint.text;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                String str3 = machineBindHint.pic;
                if (str3 != null) {
                    str2 = str3;
                }
                arrayList.add(new ki.a(str, str2));
            }
            return arrayList;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super List<? extends ki.a>> cVar) {
            return invoke2((j00.c<? super List<ki.a>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.model.DeviceManagerImpl", f = "DeviceManager.kt", i = {}, l = {34}, m = "getDevices-IoAF18A", n = {}, s = {}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f66562a;

        /* renamed from: c, reason: collision with root package name */
        public int f66564c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f66562a = obj;
            this.f66564c |= Integer.MIN_VALUE;
            Object a11 = g.this.a(this);
            return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : Result.m6307boximpl(a11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.model.DeviceManagerImpl$getDevices$2", f = "DeviceManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @u0({"SMAP\nDeviceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceManager.kt\ncom/baicizhan/main/vld/model/DeviceManagerImpl$getDevices$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1563#2:62\n1634#2,3:63\n*S KotlinDebug\n*F\n+ 1 DeviceManager.kt\ncom/baicizhan/main/vld/model/DeviceManagerImpl$getDevices$2\n*L\n35#1:62\n35#1:63,3\n*E\n"})
    public static final class d extends SuspendLambda implements x00.l<j00.c<? super List<? extends VocabularyDeviceInfo>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f66565a;

        public d(j00.c<? super d> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return g.this.new d(cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(j00.c<? super List<VocabularyDeviceInfo>> cVar) {
            return ((d) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f66565a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            List<UserMachineInfo> list = g.this.f().get_user_machine_infos_v2();
            g0.o(list, "get_user_machine_infos_v2(...)");
            List<UserMachineInfo> list2 = list;
            ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
            for (UserMachineInfo userMachineInfo : list2) {
                long j11 = userMachineInfo.machine_id;
                int i11 = userMachineInfo.device_type;
                String user_machine_name = userMachineInfo.user_machine_name;
                g0.o(user_machine_name, "user_machine_name");
                String machine_pic = userMachineInfo.machine_pic;
                g0.o(machine_pic, "machine_pic");
                String machine_model = userMachineInfo.machine_model;
                g0.o(machine_model, "machine_model");
                String sn_id = userMachineInfo.sn_id;
                g0.o(sn_id, "sn_id");
                String machine_version = userMachineInfo.machine_version;
                g0.o(machine_version, "machine_version");
                arrayList.add(new VocabularyDeviceInfo(j11, i11, user_machine_name, machine_pic, machine_model, sn_id, machine_version, userMachineInfo.machine_connect_status != 0));
            }
            return arrayList;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Object invoke(j00.c<? super List<? extends VocabularyDeviceInfo>> cVar) {
            return invoke2((j00.c<? super List<VocabularyDeviceInfo>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.model.DeviceManagerImpl", f = "DeviceManager.kt", i = {0, 0}, l = {53}, m = "remove-0E7RQCE", n = {"id", "deviceType"}, s = {"J$0", "I$0"}, v = 1)
    public static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f66567a;

        /* renamed from: b, reason: collision with root package name */
        public int f66568b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f66569c;

        /* renamed from: e, reason: collision with root package name */
        public int f66571e;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f66569c = obj;
            this.f66571e |= Integer.MIN_VALUE;
            Object d11 = g.this.d(0L, 0, this);
            return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : Result.m6307boximpl(d11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.model.DeviceManagerImpl$remove$2", f = "DeviceManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class f extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f66572a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f66574c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f66575d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j11, int i11, j00.c<? super f> cVar) {
            super(1, cVar);
            this.f66574c = j11;
            this.f66575d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return g.this.new f(this.f66574c, this.f66575d, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((f) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f66572a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            g.this.f().remove_bind_machine_v2(this.f66574c, this.f66575d);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.model.DeviceManagerImpl", f = "DeviceManager.kt", i = {0, 0, 0}, l = {49}, m = "rename-BWLJW6A", n = {"name", "id", "deviceType"}, s = {"L$0", "J$0", "I$0"}, v = 1)
    /* renamed from: ki.g$g, reason: collision with other inner class name */
    public static final class C0772g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public long f66576a;

        /* renamed from: b, reason: collision with root package name */
        public int f66577b;

        /* renamed from: c, reason: collision with root package name */
        public Object f66578c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f66579d;

        /* renamed from: f, reason: collision with root package name */
        public int f66581f;

        public C0772g(j00.c<? super C0772g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f66579d = obj;
            this.f66581f |= Integer.MIN_VALUE;
            Object c11 = g.this.c(0L, 0, null, this);
            return c11 == kotlin.coroutines.intrinsics.b.l() ? c11 : Result.m6307boximpl(c11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.vld.model.DeviceManagerImpl$rename$2", f = "DeviceManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class h extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f66582a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f66584c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f66585d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f66586e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j11, String str, int i11, j00.c<? super h> cVar) {
            super(1, cVar);
            this.f66584c = j11;
            this.f66585d = str;
            this.f66586e = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return g.this.new h(this.f66584c, this.f66585d, this.f66586e, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super g2> cVar) {
            return ((h) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f66582a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            g.this.f().rename_machine_v2(this.f66584c, this.f66585d, this.f66586e);
            return g2.f100423a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ki.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k j00.c<? super kotlin.Result<? extends java.util.List<com.baicizhan.main.vld.model.VocabularyDeviceInfo>>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ki.g.c
            if (r0 == 0) goto L14
            r0 = r8
            ki.g$c r0 = (ki.g.c) r0
            int r1 = r0.f66564c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f66564c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            ki.g$c r0 = new ki.g$c
            r0.<init>(r8)
            goto L12
        L1a:
            java.lang.Object r8 = r4.f66562a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f66564c
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.e.n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.m6317unboximpl()
            return r8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            kotlin.e.n(r8)
            c40.m0 r1 = r7.f66556a
            ki.g$d r3 = new ki.g$d
            r8 = 0
            r3.<init>(r8)
            r4.f66564c = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L50
            return r0
        L50:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.g.a(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ki.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k j00.c<? super kotlin.Result<? extends java.util.List<ki.a>>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ki.g.a
            if (r0 == 0) goto L14
            r0 = r8
            ki.g$a r0 = (ki.g.a) r0
            int r1 = r0.f66559c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f66559c = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            ki.g$a r0 = new ki.g$a
            r0.<init>(r8)
            goto L12
        L1a:
            java.lang.Object r8 = r4.f66557a
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f66559c
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.e.n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.m6317unboximpl()
            return r8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            kotlin.e.n(r8)
            c40.m0 r1 = r7.f66556a
            ki.g$b r3 = new ki.g$b
            r8 = 0
            r3.<init>(r8)
            r4.f66559c = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r8 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L50
            return r0
        L50:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.g.b(j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // ki.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(long r12, int r14, @m80.k java.lang.String r15, @m80.k j00.c<? super kotlin.Result<yz.g2>> r16) {
        /*
            r11 = this;
            r0 = r16
            boolean r2 = r0 instanceof ki.g.C0772g
            if (r2 == 0) goto L16
            r2 = r0
            ki.g$g r2 = (ki.g.C0772g) r2
            int r3 = r2.f66581f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f66581f = r3
        L14:
            r7 = r2
            goto L1c
        L16:
            ki.g$g r2 = new ki.g$g
            r2.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.f66579d
            java.lang.Object r9 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r7.f66581f
            r8 = 1
            if (r2 == 0) goto L3f
            if (r2 != r8) goto L37
            java.lang.Object r2 = r7.f66578c
            java.lang.String r2 = (java.lang.String) r2
            kotlin.e.n(r0)
            kotlin.Result r0 = (kotlin.Result) r0
            java.lang.Object r0 = r0.m6317unboximpl()
            return r0
        L37:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L3f:
            kotlin.e.n(r0)
            c40.m0 r10 = r11.f66556a
            ki.g$h r0 = new ki.g$h
            r6 = 0
            r1 = r11
            r2 = r12
            r5 = r14
            r4 = r15
            r0.<init>(r2, r4, r5, r6)
            java.lang.Object r1 = l00.k.a(r15)
            r7.f66578c = r1
            r7.f66576a = r12
            r7.f66577b = r14
            r7.f66581f = r8
            r4 = 0
            r6 = r7
            r7 = 2
            r8 = 0
            r5 = r0
            r3 = r10
            java.lang.Object r0 = com.baicizhan.main.word_book.data.impl.c.d(r3, r4, r5, r6, r7, r8)
            if (r0 != r9) goto L67
            return r9
        L67:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.g.c(long, int, java.lang.String, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // ki.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(long r12, int r14, @m80.k j00.c<? super kotlin.Result<yz.g2>> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof ki.g.e
            if (r0 == 0) goto L14
            r0 = r15
            ki.g$e r0 = (ki.g.e) r0
            int r1 = r0.f66571e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f66571e = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            ki.g$e r0 = new ki.g$e
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r4.f66569c
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.f66571e
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            kotlin.e.n(r15)
            kotlin.Result r15 = (kotlin.Result) r15
            java.lang.Object r12 = r15.m6317unboximpl()
            return r12
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            kotlin.e.n(r15)
            c40.m0 r1 = r11.f66556a
            ki.g$f r3 = new ki.g$f
            r10 = 0
            r6 = r11
            r7 = r12
            r9 = r14
            r5 = r3
            r5.<init>(r7, r9, r10)
            r4.f66567a = r7
            r4.f66568b = r9
            r4.f66571e = r2
            r2 = 0
            r5 = 2
            r6 = 0
            java.lang.Object r12 = com.baicizhan.main.word_book.data.impl.c.d(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto L58
            return r0
        L58:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.g.d(long, int, j00.c):java.lang.Object");
    }

    public final UserBookService.Client f() {
        return (UserBookService.Client) new com.baicizhan.client.business.thrift.l("/rpc/user_book").a();
    }

    public g(@m80.k m0 coroutineDispatcher) {
        g0.p(coroutineDispatcher, "coroutineDispatcher");
        this.f66556a = coroutineDispatcher;
    }

    public /* synthetic */ g(m0 m0Var, int i11, v vVar) {
        this((i11 & 1) != 0 ? h1.c() : m0Var);
    }
}
