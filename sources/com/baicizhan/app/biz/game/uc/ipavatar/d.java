package com.baicizhan.app.biz.game.uc.ipavatar;

import com.baicizhan.app.biz.game.model.IpAvatarState;
import h5.u;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.l;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nGetUnlockedIpResourcesUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GetUnlockedIpResourcesUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/GetUnlockedIpResourcesUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1563#2:92\n1634#2,3:93\n774#2:96\n865#2:97\n1761#2,3:98\n866#2:101\n*S KotlinDebug\n*F\n+ 1 GetUnlockedIpResourcesUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/GetUnlockedIpResourcesUC\n*L\n82#1:92\n82#1:93,3\n86#1:96\n86#1:97\n87#1:98,3\n86#1:101\n*E\n"})
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final q5.f f14823a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14824a;

        static {
            int[] iArr = new int[IpAvatarState.values().length];
            try {
                iArr[IpAvatarState.Traveling.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f14824a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.GetUnlockedIpResourcesUC", f = "GetUnlockedIpResourcesUC.kt", i = {0, 0, 1, 1}, l = {43, 46}, m = "invoke", n = {"ipAvatarState", "avatarAppHomePageInfo", "ipAvatarState", "avatarAppHomePageInfo"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14825a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14826b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f14827c;

        /* renamed from: e, reason: collision with root package name */
        public int f14829e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14827c = obj;
            this.f14829e |= Integer.MIN_VALUE;
            return d.this.d(null, null, this);
        }
    }

    public d(@m80.k q5.f ipResourceRepo) {
        g0.p(ipResourceRepo, "ipResourceRepo");
        this.f14823a = ipResourceRepo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002d, code lost:
    
        if (r6 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<h5.u> b(java.util.List<h5.u> r5, java.util.List<h8.a> r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L30
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = a00.i0.d0(r6, r1)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L13:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L29
            java.lang.Object r1 = r6.next()
            h8.a r1 = (h8.a) r1
            int r1 = r1.f58851a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L13
        L29:
            java.util.Set r6 = a00.r0.f6(r0)
            if (r6 == 0) goto L30
            goto L34
        L30:
            java.util.Set r6 = a00.w1.k()
        L34:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L3f:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L8c
            java.lang.Object r1 = r5.next()
            r2 = r1
            h5.u r2 = (h5.u) r2
            java.util.List r3 = r2.g()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L88
            java.util.List r2 = r2.g()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L6a
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L6a
            goto L3f
        L6a:
            java.util.Iterator r2 = r2.iterator()
        L6e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L3f
            java.lang.Object r3 = r2.next()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r3 = r6.contains(r3)
            if (r3 == 0) goto L6e
        L88:
            r0.add(r1)
            goto L3f
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.d.b(java.util.List, java.util.List):java.util.List");
    }

    public final Object c(h8.d dVar, j00.c<? super List<u>> cVar) {
        h8.l lVar = dVar.f58871a;
        Integer f11 = lVar != null ? l00.a.f(lVar.f58979e) : null;
        return f11 != null ? this.f14823a.c(f11.intValue(), cVar) : this.f14823a.a(IpAvatarState.Traveling, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@m80.k com.baicizhan.app.biz.game.model.IpAvatarState r6, @m80.k h8.d r7, @m80.k j00.c<? super java.util.List<h5.u>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.baicizhan.app.biz.game.uc.ipavatar.d.b
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.app.biz.game.uc.ipavatar.d$b r0 = (com.baicizhan.app.biz.game.uc.ipavatar.d.b) r0
            int r1 = r0.f14829e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14829e = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.ipavatar.d$b r0 = new com.baicizhan.app.biz.game.uc.ipavatar.d$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f14827c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14829e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.f14826b
            r7 = r6
            h8.d r7 = (h8.d) r7
            java.lang.Object r6 = r0.f14825a
            com.baicizhan.app.biz.game.model.IpAvatarState r6 = (com.baicizhan.app.biz.game.model.IpAvatarState) r6
            kotlin.e.n(r8)
            goto L7e
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            java.lang.Object r6 = r0.f14826b
            r7 = r6
            h8.d r7 = (h8.d) r7
            java.lang.Object r6 = r0.f14825a
            com.baicizhan.app.biz.game.model.IpAvatarState r6 = (com.baicizhan.app.biz.game.model.IpAvatarState) r6
            kotlin.e.n(r8)
            goto L68
        L4a:
            kotlin.e.n(r8)
            int[] r8 = com.baicizhan.app.biz.game.uc.ipavatar.d.a.f14824a
            int r2 = r6.ordinal()
            r8 = r8[r2]
            if (r8 != r4) goto L6b
            java.lang.Object r6 = l00.k.a(r6)
            r0.f14825a = r6
            r0.f14826b = r7
            r0.f14829e = r4
            java.lang.Object r8 = r5.c(r7, r0)
            if (r8 != r1) goto L68
            goto L7d
        L68:
            java.util.List r8 = (java.util.List) r8
            goto L80
        L6b:
            q5.f r8 = r5.f14823a
            java.lang.Object r2 = l00.k.a(r6)
            r0.f14825a = r2
            r0.f14826b = r7
            r0.f14829e = r3
            java.lang.Object r8 = r8.a(r6, r0)
            if (r8 != r1) goto L7e
        L7d:
            return r1
        L7e:
            java.util.List r8 = (java.util.List) r8
        L80:
            java.util.List<h8.a> r6 = r7.f58876f
            if (r6 != 0) goto L88
            java.util.List r6 = a00.h0.J()
        L88:
            java.util.List r6 = r5.b(r8, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.d.d(com.baicizhan.app.biz.game.model.IpAvatarState, h8.d, j00.c):java.lang.Object");
    }
}
