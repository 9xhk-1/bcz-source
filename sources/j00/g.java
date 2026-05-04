package j00;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.v0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
@v0
/* loaded from: classes8.dex */
public final class g<T> implements c<T>, l00.c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f63103b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<g<?>, Object> f63104c = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "result");

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c<T> f63105a;

    @l
    private volatile Object result;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        public a() {
        }

        public static /* synthetic */ void a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@k c<? super T> delegate, @l Object obj) {
        g0.p(delegate, "delegate");
        this.f63105a = delegate;
        this.result = obj;
    }

    @l
    @v0
    public final Object b() {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            if (androidx.concurrent.futures.a.a(f63104c, this, coroutineSingletons, kotlin.coroutines.intrinsics.b.l())) {
                return kotlin.coroutines.intrinsics.b.l();
            }
            obj = this.result;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return kotlin.coroutines.intrinsics.b.l();
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
        return obj;
    }

    @Override // l00.c
    @l
    public l00.c getCallerFrame() {
        c<T> cVar = this.f63105a;
        if (cVar instanceof l00.c) {
            return (l00.c) cVar;
        }
        return null;
    }

    @Override // j00.c
    @k
    public kotlin.coroutines.d getContext() {
        return this.f63105a.getContext();
    }

    @Override // l00.c
    @l
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // j00.c
    public void resumeWith(@k Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj2 == coroutineSingletons) {
                if (androidx.concurrent.futures.a.a(f63104c, this, coroutineSingletons, obj)) {
                    return;
                }
            } else {
                if (obj2 != kotlin.coroutines.intrinsics.b.l()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.a.a(f63104c, this, kotlin.coroutines.intrinsics.b.l(), CoroutineSingletons.RESUMED)) {
                    this.f63105a.resumeWith(obj);
                    return;
                }
            }
        }
    }

    @k
    public String toString() {
        return "SafeContinuation for " + this.f63105a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @v0
    public g(@k c<? super T> delegate) {
        this(delegate, CoroutineSingletons.UNDECIDED);
        g0.p(delegate, "delegate");
    }
}
