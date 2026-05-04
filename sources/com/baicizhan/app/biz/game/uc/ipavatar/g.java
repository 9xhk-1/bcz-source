package com.baicizhan.app.biz.game.uc.ipavatar;

import a00.i0;
import a00.r0;
import h5.u;
import h5.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.random.Random;
import m80.l;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nProcessIpAvatarSnapshotUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessIpAvatarSnapshotUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/ProcessIpAvatarSnapshotUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,111:1\n295#2,2:112\n1563#2:114\n1634#2,3:115\n*S KotlinDebug\n*F\n+ 1 ProcessIpAvatarSnapshotUC.kt\ncom/baicizhan/app/biz/game/uc/ipavatar/ProcessIpAvatarSnapshotUC\n*L\n47#1:112,2\n76#1:114\n76#1:115,3\n*E\n"})
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final q5.a f14842a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final u f14843a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final v f14844b;

        public a(@m80.k u ipAvatarResource, @m80.k v ipAvatarSpeechSnapshot) {
            g0.p(ipAvatarResource, "ipAvatarResource");
            g0.p(ipAvatarSpeechSnapshot, "ipAvatarSpeechSnapshot");
            this.f14843a = ipAvatarResource;
            this.f14844b = ipAvatarSpeechSnapshot;
        }

        public static /* synthetic */ a d(a aVar, u uVar, v vVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                uVar = aVar.f14843a;
            }
            if ((i11 & 2) != 0) {
                vVar = aVar.f14844b;
            }
            return aVar.c(uVar, vVar);
        }

        @m80.k
        public final u a() {
            return this.f14843a;
        }

        @m80.k
        public final v b() {
            return this.f14844b;
        }

        @m80.k
        public final a c(@m80.k u ipAvatarResource, @m80.k v ipAvatarSpeechSnapshot) {
            g0.p(ipAvatarResource, "ipAvatarResource");
            g0.p(ipAvatarSpeechSnapshot, "ipAvatarSpeechSnapshot");
            return new a(ipAvatarResource, ipAvatarSpeechSnapshot);
        }

        @m80.k
        public final u e() {
            return this.f14843a;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return g0.g(this.f14843a, aVar.f14843a) && g0.g(this.f14844b, aVar.f14844b);
        }

        @m80.k
        public final v f() {
            return this.f14844b;
        }

        public int hashCode() {
            return (this.f14843a.hashCode() * 31) + this.f14844b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Result(ipAvatarResource=" + this.f14843a + ", ipAvatarSpeechSnapshot=" + this.f14844b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.game.uc.ipavatar.ProcessIpAvatarSnapshotUC", f = "ProcessIpAvatarSnapshotUC.kt", i = {0, 1, 1, 1}, l = {35, 42}, m = "invoke", n = {"unlockedResources", "unlockedResources", "existingSnapshot", "newSnapshot"}, s = {"L$0", "L$0", "L$1", "L$2"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f14845a;

        /* renamed from: b, reason: collision with root package name */
        public Object f14846b;

        /* renamed from: c, reason: collision with root package name */
        public Object f14847c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f14848d;

        /* renamed from: f, reason: collision with root package name */
        public int f14850f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f14848d = obj;
            this.f14850f |= Integer.MIN_VALUE;
            return g.this.b(null, this);
        }
    }

    public g(@m80.k q5.a ipAvatarStateRepo) {
        g0.p(ipAvatarStateRepo, "ipAvatarStateRepo");
        this.f14842a = ipAvatarStateRepo;
    }

    public final v a(List<u> list) {
        Random.Default r02 = Random.Default;
        u uVar = (u) r0.P4(list, r02);
        return new v(uVar.i(), !uVar.h().isEmpty() ? (String) r0.P4(uVar.h(), r02) : "", w3.g.n());
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005b, code lost:
    
        if (r10 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@m80.k java.util.List<h5.u> r9, @m80.k j00.c<? super com.baicizhan.app.biz.game.uc.ipavatar.g.a> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.baicizhan.app.biz.game.uc.ipavatar.g.b
            if (r0 == 0) goto L13
            r0 = r10
            com.baicizhan.app.biz.game.uc.ipavatar.g$b r0 = (com.baicizhan.app.biz.game.uc.ipavatar.g.b) r0
            int r1 = r0.f14850f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14850f = r1
            goto L18
        L13:
            com.baicizhan.app.biz.game.uc.ipavatar.g$b r0 = new com.baicizhan.app.biz.game.uc.ipavatar.g$b
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f14848d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f14850f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r9 = r0.f14847c
            h5.v r9 = (h5.v) r9
            java.lang.Object r1 = r0.f14846b
            h5.v r1 = (h5.v) r1
            java.lang.Object r0 = r0.f14845a
            java.util.List r0 = (java.util.List) r0
            kotlin.e.n(r10)
            goto L85
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            java.lang.Object r9 = r0.f14845a
            java.util.List r9 = (java.util.List) r9
            kotlin.e.n(r10)
            goto L5e
        L48:
            kotlin.e.n(r10)
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto Lc0
            q5.a r10 = r8.f14842a
            r0.f14845a = r9
            r0.f14850f = r4
            java.lang.Object r10 = r10.d(r0)
            if (r10 != r1) goto L5e
            goto L82
        L5e:
            h5.v r10 = (h5.v) r10
            boolean r2 = r8.c(r10, r9)
            if (r2 == 0) goto L6a
            kotlin.jvm.internal.g0.m(r10)
            goto L87
        L6a:
            h5.v r2 = r8.a(r9)
            q5.a r4 = r8.f14842a
            r0.f14845a = r9
            java.lang.Object r10 = l00.k.a(r10)
            r0.f14846b = r10
            r0.f14847c = r2
            r0.f14850f = r3
            java.lang.Object r10 = r4.c(r2, r0)
            if (r10 != r1) goto L83
        L82:
            return r1
        L83:
            r0 = r9
            r9 = r2
        L85:
            r10 = r9
            r9 = r0
        L87:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L8d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto La9
            java.lang.Object r0 = r9.next()
            r1 = r0
            h5.u r1 = (h5.u) r1
            java.lang.String r1 = r1.i()
            java.lang.String r2 = r10.h()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 == 0) goto L8d
            goto Laa
        La9:
            r0 = 0
        Laa:
            h5.u r0 = (h5.u) r0
            if (r0 == 0) goto Lb4
            com.baicizhan.app.biz.game.uc.ipavatar.g$a r9 = new com.baicizhan.app.biz.game.uc.ipavatar.g$a
            r9.<init>(r0, r10)
            return r9
        Lb4:
            com.baicizhan.app.biz.base.BizInternalException r1 = new com.baicizhan.app.biz.base.BizInternalException
            r5 = 6
            r6 = 0
            java.lang.String r2 = "Invalid snapshot resourceId"
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            throw r1
        Lc0:
            com.baicizhan.app.biz.base.BizInternalException r2 = new com.baicizhan.app.biz.base.BizInternalException
            r6 = 6
            r7 = 0
            java.lang.String r3 = "Unlocked resources is empty"
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.app.biz.game.uc.ipavatar.g.b(java.util.List, j00.c):java.lang.Object");
    }

    public final boolean c(v vVar, List<u> list) {
        if (vVar == null || w3.g.n() - vVar.j() > 600000) {
            return false;
        }
        List<u> list2 = list;
        ArrayList arrayList = new ArrayList(i0.d0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((u) it.next()).i());
        }
        return r0.f6(arrayList).contains(vVar.h());
    }
}
