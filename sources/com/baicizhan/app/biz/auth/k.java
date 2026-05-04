package com.baicizhan.app.biz.auth;

import c40.r0;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {n.class, o.class})
@u0({"SMAP\nDeviceChangeHub.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceChangeHub.kt\ncom/baicizhan/app/biz/auth/DevicesChangeHub\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1563#2:43\n1634#2,3:44\n1869#2,2:47\n*S KotlinDebug\n*F\n+ 1 DeviceChangeHub.kt\ncom/baicizhan/app/biz/auth/DevicesChangeHub\n*L\n33#1:43\n33#1:44,3\n37#1:47,2\n*E\n"})
/* loaded from: classes3.dex */
public final class k implements l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<j> f13712a = new ArrayList();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.DevicesChangeHub", f = "DeviceChangeHub.kt", i = {0, 0, 0, 0, 0, 0}, l = {38}, m = "notifyDeviceChange", n = {"scope", "$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-DevicesChangeHub$notifyDeviceChange$3"}, s = {"L$0", "L$1", "L$3", "L$4", "I$0", "I$1"}, v = 1)
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f13713a;

        /* renamed from: b, reason: collision with root package name */
        public Object f13714b;

        /* renamed from: c, reason: collision with root package name */
        public Object f13715c;

        /* renamed from: d, reason: collision with root package name */
        public Object f13716d;

        /* renamed from: e, reason: collision with root package name */
        public Object f13717e;

        /* renamed from: f, reason: collision with root package name */
        public int f13718f;

        /* renamed from: g, reason: collision with root package name */
        public int f13719g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f13720h;

        /* renamed from: j, reason: collision with root package name */
        public int f13722j;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f13720h = obj;
            this.f13722j |= Integer.MIN_VALUE;
            return k.this.c(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.auth.DevicesChangeHub$notifyDeviceChange$2$1", f = "DeviceChangeHub.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f13723a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j f13724b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f13724b = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f13724b, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f13723a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                j jVar = this.f13724b;
                this.f13723a = 1;
                if (jVar.c(this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return g2.f100423a;
        }
    }

    @Override // com.baicizhan.app.biz.auth.l
    public void a(@m80.k j listener) {
        g0.p(listener, "listener");
        this.f13712a.add(listener);
    }

    @Override // com.baicizhan.app.biz.auth.l
    public void b(@m80.k j listener) {
        g0.p(listener, "listener");
        this.f13712a.remove(listener);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(@m80.k j00.c<? super yz.g2> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.baicizhan.app.biz.auth.k.a
            if (r0 == 0) goto L13
            r0 = r15
            com.baicizhan.app.biz.auth.k$a r0 = (com.baicizhan.app.biz.auth.k.a) r0
            int r1 = r0.f13722j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13722j = r1
            goto L18
        L13:
            com.baicizhan.app.biz.auth.k$a r0 = new com.baicizhan.app.biz.auth.k$a
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f13720h
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f13722j
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 != r4) goto L3c
            int r2 = r0.f13718f
            java.lang.Object r5 = r0.f13717e
            c40.x0 r5 = (c40.x0) r5
            java.lang.Object r5 = r0.f13715c
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.f13714b
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.lang.Object r7 = r0.f13713a
            c40.r0 r7 = (c40.r0) r7
            kotlin.e.n(r15)
            goto L90
        L3c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L44:
            kotlin.e.n(r15)
            c40.m0 r15 = c4.o.b()
            r2 = 0
            c40.a0 r5 = c40.l3.c(r2, r4, r2)
            kotlin.coroutines.d r15 = r15.plus(r5)
            c40.r0 r5 = c40.s0.a(r15)
            java.util.List<com.baicizhan.app.biz.auth.j> r15 = r14.f13712a
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r11 = new java.util.ArrayList
            r6 = 10
            int r6 = a00.i0.d0(r15, r6)
            r11.<init>(r6)
            java.util.Iterator r15 = r15.iterator()
        L6b:
            boolean r6 = r15.hasNext()
            if (r6 == 0) goto L88
            java.lang.Object r6 = r15.next()
            com.baicizhan.app.biz.auth.j r6 = (com.baicizhan.app.biz.auth.j) r6
            com.baicizhan.app.biz.auth.k$b r8 = new com.baicizhan.app.biz.auth.k$b
            r8.<init>(r6, r2)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            c40.x0 r6 = c40.i.b(r5, r6, r7, r8, r9, r10)
            r11.add(r6)
            goto L6b
        L88:
            java.util.Iterator r15 = r11.iterator()
            r2 = r3
            r7 = r5
            r6 = r11
            r5 = r15
        L90:
            boolean r15 = r5.hasNext()
            if (r15 == 0) goto Lc4
            java.lang.Object r15 = r5.next()
            r8 = r15
            c40.x0 r8 = (c40.x0) r8
            java.lang.Object r9 = l00.k.a(r7)
            r0.f13713a = r9
            java.lang.Object r9 = l00.k.a(r6)
            r0.f13714b = r9
            r0.f13715c = r5
            java.lang.Object r15 = l00.k.a(r15)
            r0.f13716d = r15
            java.lang.Object r15 = l00.k.a(r8)
            r0.f13717e = r15
            r0.f13718f = r2
            r0.f13719g = r3
            r0.f13722j = r4
            java.lang.Object r15 = r8.i(r0)
            if (r15 != r1) goto L90
            return r1
        Lc4:
            z6.b r8 = z6.b.f101032b
            r12 = 4
            r13 = 0
            java.lang.String r9 = "IDeviceChangeHub"
            java.lang.String r10 = "notifyLogout: done"
            r11 = 0
            z6.b.j(r8, r9, r10, r11, r12, r13)
            yz.g2 r15 = yz.g2.f100423a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.auth.k.c(j00.c):java.lang.Object");
    }
}
