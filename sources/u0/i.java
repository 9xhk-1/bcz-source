package u0;

import androidx.annotation.MainThread;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "-Lifecycles")
@u0({"SMAP\nLifecycles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Lifecycles.kt\ncoil/util/-Lifecycles\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,43:1\n314#2,11:44\n1#3:55\n*S KotlinDebug\n*F\n+ 1 Lifecycles.kt\ncoil/util/-Lifecycles\n*L\n23#1:44,11\n*E\n"})
/* loaded from: classes3.dex */
public final class i {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "coil.util.-Lifecycles", f = "Lifecycles.kt", i = {0, 0}, l = {44}, m = "awaitStarted", n = {"$this$awaitStarted", "observer"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f91437a;

        /* renamed from: b, reason: collision with root package name */
        public Object f91438b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f91439c;

        /* renamed from: d, reason: collision with root package name */
        public int f91440d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f91439c = obj;
            this.f91440d |= Integer.MIN_VALUE;
            return i.a(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements DefaultLifecycleObserver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c40.n<g2> f91441a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(c40.n<? super g2> nVar) {
            this.f91441a = nVar;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onStart(@m80.k LifecycleOwner lifecycleOwner) {
            c40.n<g2> nVar = this.f91441a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m6308constructorimpl(g2.f100423a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object, u0.i$b] */
    @m80.l
    @androidx.annotation.MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(@m80.k androidx.lifecycle.Lifecycle r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            boolean r0 = r7 instanceof u0.i.a
            if (r0 == 0) goto L13
            r0 = r7
            u0.i$a r0 = (u0.i.a) r0
            int r1 = r0.f91440d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91440d = r1
            goto L18
        L13:
            u0.i$a r0 = new u0.i$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f91439c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f91440d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f91438b
            kotlin.jvm.internal.Ref$ObjectRef r6 = (kotlin.jvm.internal.Ref.ObjectRef) r6
            java.lang.Object r0 = r0.f91437a
            androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
            kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L31
            goto L8c
        L31:
            r7 = move-exception
            goto L98
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.e.n(r7)
            androidx.lifecycle.Lifecycle$State r7 = r6.getCurrentState()
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r7 = r7.isAtLeast(r2)
            if (r7 == 0) goto L4d
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L4d:
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r0.f91437a = r6     // Catch: java.lang.Throwable -> L81
            r0.f91438b = r7     // Catch: java.lang.Throwable -> L81
            r0.f91440d = r3     // Catch: java.lang.Throwable -> L81
            c40.p r2 = new c40.p     // Catch: java.lang.Throwable -> L81
            j00.c r4 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r0)     // Catch: java.lang.Throwable -> L81
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L81
            r2.y()     // Catch: java.lang.Throwable -> L81
            u0.i$b r3 = new u0.i$b     // Catch: java.lang.Throwable -> L81
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L81
            r7.element = r3     // Catch: java.lang.Throwable -> L81
            kotlin.jvm.internal.g0.m(r3)     // Catch: java.lang.Throwable -> L81
            androidx.lifecycle.LifecycleObserver r3 = (androidx.lifecycle.LifecycleObserver) r3     // Catch: java.lang.Throwable -> L81
            r6.addObserver(r3)     // Catch: java.lang.Throwable -> L81
            java.lang.Object r2 = r2.F()     // Catch: java.lang.Throwable -> L81
            java.lang.Object r3 = kotlin.coroutines.intrinsics.b.l()     // Catch: java.lang.Throwable -> L81
            if (r2 != r3) goto L87
            l00.f.c(r0)     // Catch: java.lang.Throwable -> L81
            goto L87
        L81:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
            goto L98
        L87:
            if (r2 != r1) goto L8a
            return r1
        L8a:
            r0 = r6
            r6 = r7
        L8c:
            T r6 = r6.element
            androidx.lifecycle.LifecycleObserver r6 = (androidx.lifecycle.LifecycleObserver) r6
            if (r6 == 0) goto L95
            r0.removeObserver(r6)
        L95:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L98:
            T r6 = r6.element
            androidx.lifecycle.LifecycleObserver r6 = (androidx.lifecycle.LifecycleObserver) r6
            if (r6 == 0) goto La1
            r0.removeObserver(r6)
        La1:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: u0.i.a(androidx.lifecycle.Lifecycle, j00.c):java.lang.Object");
    }

    @MainThread
    public static final void b(@m80.k Lifecycle lifecycle, @m80.k LifecycleObserver lifecycleObserver) {
        lifecycle.removeObserver(lifecycleObserver);
        lifecycle.addObserver(lifecycleObserver);
    }
}
