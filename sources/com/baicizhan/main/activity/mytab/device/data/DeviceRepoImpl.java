package com.baicizhan.main.activity.mytab.device.data;

import androidx.compose.runtime.internal.StabilityInferred;
import c40.h1;
import com.baicizhan.client.business.thrift.m;
import com.baicizhan.online.user_book.DeviceAdvInfo;
import j00.c;
import java.util.List;
import javax.inject.Inject;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import l00.d;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nDeviceRepoImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceRepoImpl.kt\ncom/baicizhan/main/activity/mytab/device/data/DeviceRepoImpl\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,48:1\n49#2:49\n51#2:53\n49#2:54\n51#2:58\n46#3:50\n51#3:52\n46#3:55\n51#3:57\n105#4:51\n105#4:56\n*S KotlinDebug\n*F\n+ 1 DeviceRepoImpl.kt\ncom/baicizhan/main/activity/mytab/device/data/DeviceRepoImpl\n*L\n20#1:49\n20#1:53\n22#1:54\n22#1:58\n20#1:50\n20#1:52\n22#1:55\n22#1:57\n20#1:51\n22#1:56\n*E\n"})
/* loaded from: classes4.dex */
public final class DeviceRepoImpl implements ie.a {

    /* renamed from: b, reason: collision with root package name */
    public static final int f18618b = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final nc.a f18619a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements l<DeviceAdvInfo, ie.b> {
        public a() {
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ie.b invoke(DeviceAdvInfo deviceAdvInfo) {
            int i11 = deviceAdvInfo.device_type;
            String name = deviceAdvInfo.name;
            g0.o(name, "name");
            String link = deviceAdvInfo.link;
            g0.o(link, "link");
            String image = deviceAdvInfo.image;
            g0.o(image, "image");
            String str = deviceAdvInfo.super_logo;
            String str2 = null;
            if (str != null) {
                DeviceRepoImpl deviceRepoImpl = DeviceRepoImpl.this;
                long j11 = deviceAdvInfo.super_timestamp;
                if (j11 != 0) {
                    if (j11 > deviceRepoImpl.c().getLong("device_key_" + deviceAdvInfo.device_type, 0L)) {
                        str2 = str;
                    }
                }
            }
            return new ie.b(i11, name, link, image, str2, deviceAdvInfo.super_timestamp);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements l<ie.b, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f18627a = new b();

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(ie.b device) {
            g0.p(device, "device");
            return Integer.valueOf(device.j());
        }
    }

    @Inject
    public DeviceRepoImpl(@q9.k @k nc.a mem) {
        g0.p(mem, "mem");
        this.f18619a = mem;
    }

    @Override // ie.a
    @k
    public i<List<ie.b>> a() {
        final i b11 = m.f16659a.b("/rpc/user_book");
        final i<List<DeviceAdvInfo>> iVar = new i<List<DeviceAdvInfo>>() { // from class: com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DeviceRepoImpl.kt\ncom/baicizhan/main/activity/mytab/device/data/DeviceRepoImpl\n*L\n1#1,49:1\n50#2:50\n21#3:51\n*E\n"})
            /* renamed from: com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f18621a;

                @d(c = "com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$1$2", f = "DeviceRepoImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
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
                    this.f18621a = jVar;
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
                        boolean r0 = r7 instanceof com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$1$2$1 r0 = (com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$1$2$1 r0 = new com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$1$2$1
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
                        com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$1$2$1 r6 = (com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$1.AnonymousClass2.AnonymousClass1) r6
                        kotlin.e.n(r7)
                        goto L69
                    L31:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L39:
                        kotlin.e.n(r7)
                        kotlinx.coroutines.flow.j r7 = r5.f18621a
                        r2 = r6
                        com.baicizhan.online.user_book.UserBookService$Client r2 = (com.baicizhan.online.user_book.UserBookService.Client) r2
                        java.util.List r2 = r2.get_device_sku_info()
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
                        if (r6 != r1) goto L69
                        return r1
                    L69:
                        yz.g2 r6 = yz.g2.f100423a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super List<DeviceAdvInfo>> jVar, c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        };
        return kotlinx.coroutines.flow.k.P0(new i<List<? extends ie.b>>() { // from class: com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$2

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @u0({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DeviceRepoImpl.kt\ncom/baicizhan/main/activity/mytab/device/data/DeviceRepoImpl\n*L\n1#1,49:1\n50#2:50\n23#3:51\n35#3,4:52\n*E\n"})
            /* renamed from: com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements j {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ j f18624a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ DeviceRepoImpl f18625b;

                @d(c = "com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$2$2", f = "DeviceRepoImpl.kt", i = {0, 0, 0, 0, 0}, l = {50}, m = "emit", n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 1)
                /* renamed from: com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$2$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar, DeviceRepoImpl deviceRepoImpl) {
                    this.f18624a = jVar;
                    this.f18625b = deviceRepoImpl;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r7, j00.c r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$2$2$1 r0 = (com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$2$2$1 r0 = new com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$2$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L39
                        if (r2 != r3) goto L31
                        java.lang.Object r7 = r0.L$3
                        kotlinx.coroutines.flow.j r7 = (kotlinx.coroutines.flow.j) r7
                        java.lang.Object r7 = r0.L$1
                        com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$2$2$1 r7 = (com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$2.AnonymousClass2.AnonymousClass1) r7
                        kotlin.e.n(r8)
                        goto L83
                    L31:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L39:
                        kotlin.e.n(r8)
                        kotlinx.coroutines.flow.j r8 = r6.f18624a
                        r2 = r7
                        java.util.List r2 = (java.util.List) r2
                        kotlin.jvm.internal.g0.m(r2)
                        java.lang.Iterable r2 = (java.lang.Iterable) r2
                        q30.m r2 = a00.r0.E1(r2)
                        com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$a r4 = new com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$a
                        com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl r5 = r6.f18625b
                        r4.<init>()
                        q30.m r2 = q30.k0.N1(r2, r4)
                        com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$b r4 = com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl.b.f18627a
                        q30.m r2 = q30.k0.I0(r2, r4)
                        java.util.List r2 = q30.k0.I3(r2)
                        java.lang.Object r4 = l00.k.a(r7)
                        r0.L$0 = r4
                        java.lang.Object r4 = l00.k.a(r0)
                        r0.L$1 = r4
                        java.lang.Object r7 = l00.k.a(r7)
                        r0.L$2 = r7
                        java.lang.Object r7 = l00.k.a(r8)
                        r0.L$3 = r7
                        r7 = 0
                        r0.I$0 = r7
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r2, r0)
                        if (r7 != r1) goto L83
                        return r1
                    L83:
                        yz.g2 r7 = yz.g2.f100423a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.mytab.device.data.DeviceRepoImpl$getMyDevices$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, j00.c):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.i
            public Object collect(j<? super List<? extends ie.b>> jVar, c cVar) {
                Object collect = i.this.collect(new AnonymousClass2(jVar, this), cVar);
                return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
            }
        }, h1.c());
    }

    @Override // ie.a
    public void b(int i11, long j11) {
        if (j11 != 0) {
            this.f18619a.n("device_key_" + i11, j11);
        }
    }

    @k
    public final nc.a c() {
        return this.f18619a;
    }
}
