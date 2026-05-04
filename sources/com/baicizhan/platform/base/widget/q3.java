package com.baicizhan.platform.base.widget;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nPermission.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Permission.kt\ncom/baicizhan/platform/base/widget/PermissionTipState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,115:1\n85#2:116\n113#2,2:117\n116#3,11:119\n116#3,11:130\n*S KotlinDebug\n*F\n+ 1 Permission.kt\ncom/baicizhan/platform/base/widget/PermissionTipState\n*L\n86#1:116\n86#1:117,2\n92#1:119,11\n97#1:130,11\n*E\n"})
/* loaded from: classes6.dex */
public final class q3 {

    /* renamed from: d, reason: collision with root package name */
    public static final int f28474d = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final n40.a f28475a = n40.g.b(false, 1, null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public h3 f28476b = new a("", "");

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final MutableState f28477c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements h3 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f28478a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f28479b;

        public a(@m80.k String title, @m80.k String message) {
            kotlin.jvm.internal.g0.p(title, "title");
            kotlin.jvm.internal.g0.p(message, "message");
            this.f28478a = title;
            this.f28479b = message;
        }

        @Override // com.baicizhan.platform.base.widget.h3
        @m80.k
        public String getMessage() {
            return this.f28479b;
        }

        @Override // com.baicizhan.platform.base.widget.h3
        @m80.k
        public String getTitle() {
            return this.f28478a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.platform.base.widget.PermissionTipState", f = "Permission.kt", i = {0, 0}, l = {121}, m = "dismissPermissionTip", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0"}, v = 1)
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f28480a;

        /* renamed from: b, reason: collision with root package name */
        public int f28481b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f28482c;

        /* renamed from: e, reason: collision with root package name */
        public int f28484e;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f28482c = obj;
            this.f28484e |= Integer.MIN_VALUE;
            return q3.this.a(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.platform.base.widget.PermissionTipState", f = "Permission.kt", i = {0, 0, 0, 0}, l = {121}, m = "showPermissionTip", n = {"title", "message", "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "L$1", "L$2", "I$0"}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f28485a;

        /* renamed from: b, reason: collision with root package name */
        public Object f28486b;

        /* renamed from: c, reason: collision with root package name */
        public Object f28487c;

        /* renamed from: d, reason: collision with root package name */
        public int f28488d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f28489e;

        /* renamed from: g, reason: collision with root package name */
        public int f28491g;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f28489e = obj;
            this.f28491g |= Integer.MIN_VALUE;
            return q3.this.e(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super yz.g2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.baicizhan.platform.base.widget.q3.b
            if (r0 == 0) goto L13
            r0 = r7
            com.baicizhan.platform.base.widget.q3$b r0 = (com.baicizhan.platform.base.widget.q3.b) r0
            int r1 = r0.f28484e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28484e = r1
            goto L18
        L13:
            com.baicizhan.platform.base.widget.q3$b r0 = new com.baicizhan.platform.base.widget.q3$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f28482c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f28484e
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f28480a
            n40.a r0 = (n40.a) r0
            kotlin.e.n(r7)
            goto L4a
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            kotlin.e.n(r7)
            n40.a r7 = r6.f28475a
            r0.f28480a = r7
            r0.f28481b = r3
            r0.f28484e = r4
            java.lang.Object r0 = r7.lock(r5, r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r7
        L4a:
            r6.d(r3)     // Catch: java.lang.Throwable -> L53
            yz.g2 r7 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L53
            r0.unlock(r5)
            return r7
        L53:
            r7 = move-exception
            r0.unlock(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.q3.a(j00.c):java.lang.Object");
    }

    @m80.k
    public final h3 b() {
        return this.f28476b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.f28477c.getValue()).booleanValue();
    }

    public final void d(boolean z11) {
        this.f28477c.setValue(Boolean.valueOf(z11));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@m80.k java.lang.String r6, @m80.k java.lang.String r7, @m80.k j00.c<? super yz.g2> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.baicizhan.platform.base.widget.q3.c
            if (r0 == 0) goto L13
            r0 = r8
            com.baicizhan.platform.base.widget.q3$c r0 = (com.baicizhan.platform.base.widget.q3.c) r0
            int r1 = r0.f28491g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28491g = r1
            goto L18
        L13:
            com.baicizhan.platform.base.widget.q3$c r0 = new com.baicizhan.platform.base.widget.q3$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f28489e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f28491g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.f28487c
            n40.a r6 = (n40.a) r6
            java.lang.Object r7 = r0.f28486b
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r0 = r0.f28485a
            java.lang.String r0 = (java.lang.String) r0
            kotlin.e.n(r8)
            r8 = r6
            r6 = r0
            goto L57
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            kotlin.e.n(r8)
            n40.a r8 = r5.f28475a
            r0.f28485a = r6
            r0.f28486b = r7
            r0.f28487c = r8
            r2 = 0
            r0.f28488d = r2
            r0.f28491g = r3
            java.lang.Object r0 = r8.lock(r4, r0)
            if (r0 != r1) goto L57
            return r1
        L57:
            com.baicizhan.platform.base.widget.q3$a r0 = new com.baicizhan.platform.base.widget.q3$a     // Catch: java.lang.Throwable -> L67
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L67
            r5.f28476b = r0     // Catch: java.lang.Throwable -> L67
            r5.d(r3)     // Catch: java.lang.Throwable -> L67
            yz.g2 r6 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L67
            r8.unlock(r4)
            return r6
        L67:
            r6 = move-exception
            r8.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.q3.e(java.lang.String, java.lang.String, j00.c):java.lang.Object");
    }
}
