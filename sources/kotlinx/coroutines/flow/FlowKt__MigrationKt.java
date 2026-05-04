package kotlinx.coroutines.flow;

import c40.a1;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMigration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n+ 2 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n*L\n1#1,492:1\n189#2:493\n*S KotlinDebug\n*F\n+ 1 Migration.kt\nkotlinx/coroutines/flow/FlowKt__MigrationKt\n*L\n431#1:493\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class FlowKt__MigrationKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayEach$1", f = "Migration.kt", i = {}, l = {423}, m = "invokeSuspend", n = {}, s = {})
    public static final class a<T> extends SuspendLambda implements x00.p<T, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f67940a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f67941b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j11, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f67941b = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f67941b, cVar);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(T t11, j00.c<? super g2> cVar) {
            return ((a) create(t11, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f67940a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                long j11 = this.f67941b;
                this.f67940a = 1;
                if (a1.b(j11, this) == l11) {
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, j00.c<? super g2> cVar) {
            return invoke2((a<T>) obj, cVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", f = "Migration.kt", i = {}, l = {411}, m = "invokeSuspend", n = {}, s = {})
    public static final class b<T> extends SuspendLambda implements x00.p<j<? super T>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f67942a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f67943b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j11, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f67943b = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f67943b, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f67942a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                long j11 = this.f67943b;
                this.f67942a = 1;
                if (a1.b(j11, this) == l11) {
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

        @Override // x00.p
        public final Object invoke(j<? super T> jVar, j00.c<? super g2> cVar) {
            return ((b) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", f = "Migration.kt", i = {}, l = {302}, m = "invokeSuspend", n = {}, s = {})
    public static final class c<T> extends SuspendLambda implements x00.q<j<? super T>, Throwable, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f67944a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f67945b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f67946c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x00.l<Throwable, Boolean> f67947d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ T f67948e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(x00.l<? super Throwable, Boolean> lVar, T t11, j00.c<? super c> cVar) {
            super(3, cVar);
            this.f67947d = lVar;
            this.f67948e = t11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f67944a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                j jVar = (j) this.f67945b;
                Throwable th2 = (Throwable) this.f67946c;
                if (!this.f67947d.invoke(th2).booleanValue()) {
                    throw th2;
                }
                T t11 = this.f67948e;
                this.f67945b = null;
                this.f67944a = 1;
                if (jVar.emit(t11, this) == l11) {
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

        @Override // x00.q
        public final Object invoke(j<? super T> jVar, Throwable th2, j00.c<? super g2> cVar) {
            c cVar2 = new c(this.f67947d, this.f67948e, cVar);
            cVar2.f67945b = jVar;
            cVar2.f67946c = th2;
            return cVar2.invokeSuspend(g2.f100423a);
        }
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @m80.k
    public static final <T> i<T> A(@m80.k i<? extends T> iVar, @m80.k kotlin.coroutines.d dVar) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @w0(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @m80.k
    public static final <T> i<T> B(@m80.k i<? extends T> iVar) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @w0(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @m80.k
    public static final <T> i<T> C(@m80.k i<? extends T> iVar, int i11) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @w0(expression = "scan(initial, operation)", imports = {}))
    @m80.k
    public static final <T, R> i<R> D(@m80.k i<? extends T> iVar, R r11, @yz.b @m80.k x00.q<? super R, ? super T, ? super j00.c<? super R>, ? extends Object> qVar) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @w0(expression = "runningReduce(operation)", imports = {}))
    @m80.k
    public static final <T> i<T> E(@m80.k i<? extends T> iVar, @m80.k x00.q<? super T, ? super T, ? super j00.c<? super T>, ? extends Object> qVar) {
        return k.C1(iVar, qVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @w0(expression = "drop(count)", imports = {}))
    @m80.k
    public static final <T> i<T> F(@m80.k i<? extends T> iVar, int i11) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @w0(expression = "onStart { emit(value) }", imports = {}))
    @m80.k
    public static final <T> i<T> G(@m80.k i<? extends T> iVar, T t11) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @w0(expression = "onStart { emitAll(other) }", imports = {}))
    @m80.k
    public static final <T> i<T> H(@m80.k i<? extends T> iVar, @m80.k i<? extends T> iVar2) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void I(@m80.k i<? extends T> iVar) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void J(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super g2>, ? extends Object> pVar) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void K(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super g2>, ? extends Object> pVar, @m80.k x00.p<? super Throwable, ? super j00.c<? super g2>, ? extends Object> pVar2) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use 'flowOn' instead")
    @m80.k
    public static final <T> i<T> L(@m80.k i<? extends T> iVar, @m80.k kotlin.coroutines.d dVar) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @w0(expression = "this.flatMapLatest(transform)", imports = {}))
    @m80.k
    public static final <T, R> i<R> M(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super i<? extends R>>, ? extends Object> pVar) {
        return k.f2(iVar, new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(pVar, null));
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStarted.Lazily' argument'", replaceWith = @w0(expression = "this.shareIn(scope, started = SharingStarted.Lazily, replay = Int.MAX_VALUE)", imports = {}))
    @m80.k
    public static final <T> i<T> b(@m80.k i<? extends T> iVar) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @w0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @m80.k
    public static final <T1, T2, T3, T4, T5, R> i<R> c(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k i<? extends T3> iVar3, @m80.k i<? extends T4> iVar4, @m80.k i<? extends T5> iVar5, @m80.k x00.t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super j00.c<? super R>, ? extends Object> tVar) {
        return k.F(iVar, iVar2, iVar3, iVar4, iVar5, tVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @w0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @m80.k
    public static final <T1, T2, T3, T4, R> i<R> d(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k i<? extends T3> iVar3, @m80.k i<? extends T4> iVar4, @m80.k x00.s<? super T1, ? super T2, ? super T3, ? super T4, ? super j00.c<? super R>, ? extends Object> sVar) {
        return k.G(iVar, iVar2, iVar3, iVar4, sVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @w0(expression = "combine(this, other, other2, transform)", imports = {}))
    @m80.k
    public static final <T1, T2, T3, R> i<R> e(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k i<? extends T3> iVar3, @m80.k x00.r<? super T1, ? super T2, ? super T3, ? super j00.c<? super R>, ? extends Object> rVar) {
        return k.H(iVar, iVar2, iVar3, rVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @w0(expression = "this.combine(other, transform)", imports = {}))
    @m80.k
    public static final <T1, T2, R> i<R> f(@m80.k i<? extends T1> iVar, @m80.k i<? extends T2> iVar2, @m80.k x00.q<? super T1, ? super T2, ? super j00.c<? super R>, ? extends Object> qVar) {
        return k.I(iVar, iVar2, qVar);
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @w0(expression = "let(transformer)", imports = {}))
    @m80.k
    public static final <T, R> i<R> g(@m80.k i<? extends T> iVar, @m80.k x00.l<? super i<? extends T>, ? extends i<? extends R>> lVar) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @w0(expression = "flatMapConcat(mapper)", imports = {}))
    @m80.k
    public static final <T, R> i<R> h(@m80.k i<? extends T> iVar, @m80.k x00.l<? super T, ? extends i<? extends R>> lVar) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @w0(expression = "onCompletion { emit(value) }", imports = {}))
    @m80.k
    public static final <T> i<T> i(@m80.k i<? extends T> iVar, T t11) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @w0(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @m80.k
    public static final <T> i<T> j(@m80.k i<? extends T> iVar, @m80.k i<? extends T> iVar2) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @w0(expression = "onEach { delay(timeMillis) }", imports = {}))
    @m80.k
    public static final <T> i<T> k(@m80.k i<? extends T> iVar, long j11) {
        return k.h1(iVar, new a(j11, null));
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @w0(expression = "onStart { delay(timeMillis) }", imports = {}))
    @m80.k
    public static final <T> i<T> l(@m80.k i<? extends T> iVar, long j11) {
        return k.o1(iVar, new b(j11, null));
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @w0(expression = "flatMapConcat(mapper)", imports = {}))
    @m80.k
    public static final <T, R> i<R> m(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super i<? extends R>>, ? extends Object> pVar) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @w0(expression = "flattenConcat()", imports = {}))
    @m80.k
    public static final <T> i<T> n(@m80.k i<? extends i<? extends T>> iVar) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @w0(expression = "collect(action)", imports = {}))
    public static final <T> void o(@m80.k i<? extends T> iVar, @m80.k x00.p<? super T, ? super j00.c<? super g2>, ? extends Object> pVar) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @w0(expression = "flattenConcat()", imports = {}))
    @m80.k
    public static final <T> i<T> p(@m80.k i<? extends i<? extends T>> iVar) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @m80.k
    public static final Void q() {
        throw new UnsupportedOperationException("Not implemented, should not be called");
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Collect flow in the desired context instead")
    @m80.k
    public static final <T> i<T> r(@m80.k i<? extends T> iVar, @m80.k kotlin.coroutines.d dVar) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @w0(expression = "catch { emitAll(fallback) }", imports = {}))
    @m80.k
    public static final <T> i<T> s(@m80.k i<? extends T> iVar, @m80.k i<? extends T> iVar2) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @w0(expression = "catch { emitAll(fallback) }", imports = {}))
    @m80.k
    public static final <T> i<T> t(@m80.k i<? extends T> iVar, @m80.k i<? extends T> iVar2) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @w0(expression = "catch { emit(fallback) }", imports = {}))
    @m80.k
    public static final <T> i<T> u(@m80.k i<? extends T> iVar, T t11) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @w0(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @m80.k
    public static final <T> i<T> v(@m80.k i<? extends T> iVar, T t11, @m80.k x00.l<? super Throwable, Boolean> lVar) {
        return k.v(iVar, new c(lVar, t11, null));
    }

    public static /* synthetic */ i w(i iVar, Object obj, x00.l lVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            lVar = new x00.l() { // from class: kotlinx.coroutines.flow.v
                @Override // x00.l
                public final Object invoke(Object obj3) {
                    boolean x11;
                    x11 = FlowKt__MigrationKt.x((Throwable) obj3);
                    return Boolean.valueOf(x11);
                }
            };
        }
        return k.m1(iVar, obj, lVar);
    }

    public static final boolean x(Throwable th2) {
        return true;
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \npublish().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @w0(expression = "this.shareIn(scope, 0)", imports = {}))
    @m80.k
    public static final <T> i<T> y(@m80.k i<? extends T> iVar) {
        k.d1();
        throw new KotlinNothingValueException();
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \npublish().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @w0(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @m80.k
    public static final <T> i<T> z(@m80.k i<? extends T> iVar, int i11) {
        k.d1();
        throw new KotlinNothingValueException();
    }
}
