package androidx.datastore.core;

import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.j;
import l00.d;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", i = {0, 1, 1}, l = {72, 74, 100}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "startState"}, s = {"L$0", "L$0", "L$1"})
@u0({"SMAP\nDataStoreImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$data$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,538:1\n53#2:539\n55#2:543\n50#3:540\n55#3:542\n107#4:541\n*S KotlinDebug\n*F\n+ 1 DataStoreImpl.kt\nandroidx/datastore/core/DataStoreImpl$data$1\n*L\n108#1:539\n108#1:543\n108#1:540\n108#1:542\n108#1:541\n*E\n"})
/* loaded from: classes2.dex */
public final class DataStoreImpl$data$1<T> extends SuspendLambda implements p<j<? super T>, c<? super g2>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<j<? super State<T>>, c<? super g2>, Object> {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(DataStoreImpl<T> dataStoreImpl, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final c<g2> create(@l Object obj, @k c<?> cVar) {
            return new AnonymousClass1(this.this$0, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object incrementCollector;
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                incrementCollector = dataStoreImpl.incrementCollector(this);
                if (incrementCollector == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.n(obj);
            }
            return g2.f100423a;
        }

        @Override // x00.p
        @l
        public final Object invoke(@k j<? super State<T>> jVar, @l c<? super g2> cVar) {
            return ((AnonymousClass1) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<State<T>, c<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final c<g2> create(@l Object obj, @k c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // x00.p
        @l
        public final Object invoke(@k State<T> state, @l c<? super Boolean> cVar) {
            return ((AnonymousClass2) create(state, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            return l00.a.a(!(((State) this.L$0) instanceof Final));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements p<State<T>, c<? super Boolean>, Object> {
        final /* synthetic */ State<T> $startState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(State<T> state, c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$startState = state;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final c<g2> create(@l Object obj, @k c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$startState, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // x00.p
        @l
        public final Object invoke(@k State<T> state, @l c<? super Boolean> cVar) {
            return ((AnonymousClass3) create(state, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            State state = (State) this.L$0;
            return l00.a.a((state instanceof Data) && state.getVersion() <= this.$startState.getVersion());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$5, reason: invalid class name */
    public static final class AnonymousClass5 extends SuspendLambda implements q<j<? super T>, Throwable, c<? super g2>, Object> {
        int label;
        final /* synthetic */ DataStoreImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(DataStoreImpl<T> dataStoreImpl, c<? super AnonymousClass5> cVar) {
            super(3, cVar);
            this.this$0 = dataStoreImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object decrementCollector;
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                decrementCollector = dataStoreImpl.decrementCollector(this);
                if (decrementCollector == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.n(obj);
            }
            return g2.f100423a;
        }

        @Override // x00.q
        @l
        public final Object invoke(@k j<? super T> jVar, @l Throwable th2, @l c<? super g2> cVar) {
            return new AnonymousClass5(this.this$0, cVar).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$data$1(DataStoreImpl<T> dataStoreImpl, c<? super DataStoreImpl$data$1> cVar) {
        super(2, cVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@l Object obj, @k c<?> cVar) {
        DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(this.this$0, cVar);
        dataStoreImpl$data$1.L$0 = obj;
        return dataStoreImpl$data$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bb, code lost:
    
        if (kotlinx.coroutines.flow.k.o0(r1, r9, r8) == r0) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@m80.k java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r8.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            kotlin.e.n(r9)
            goto Lbe
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Object r1 = r8.L$1
            androidx.datastore.core.State r1 = (androidx.datastore.core.State) r1
            java.lang.Object r3 = r8.L$0
            kotlinx.coroutines.flow.j r3 = (kotlinx.coroutines.flow.j) r3
            kotlin.e.n(r9)
            goto L67
        L2a:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.j) r1
            kotlin.e.n(r9)
            goto L4b
        L32:
            kotlin.e.n(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.j) r9
            androidx.datastore.core.DataStoreImpl<T> r1 = r8.this$0
            r8.L$0 = r9
            r8.label = r4
            r4 = 0
            java.lang.Object r1 = androidx.datastore.core.DataStoreImpl.access$readState(r1, r4, r8)
            if (r1 != r0) goto L48
            goto Lbd
        L48:
            r7 = r1
            r1 = r9
            r9 = r7
        L4b:
            androidx.datastore.core.State r9 = (androidx.datastore.core.State) r9
            boolean r4 = r9 instanceof androidx.datastore.core.Data
            if (r4 == 0) goto L6a
            r4 = r9
            androidx.datastore.core.Data r4 = (androidx.datastore.core.Data) r4
            java.lang.Object r4 = r4.getValue()
            r8.L$0 = r1
            r8.L$1 = r9
            r8.label = r3
            java.lang.Object r3 = r1.emit(r4, r8)
            if (r3 != r0) goto L65
            goto Lbd
        L65:
            r3 = r1
            r1 = r9
        L67:
            r9 = r1
            r1 = r3
            goto L79
        L6a:
            boolean r3 = r9 instanceof androidx.datastore.core.UnInitialized
            if (r3 != 0) goto Lc8
            boolean r3 = r9 instanceof androidx.datastore.core.ReadException
            if (r3 != 0) goto Lc1
            boolean r3 = r9 instanceof androidx.datastore.core.Final
            if (r3 == 0) goto L79
            yz.g2 r9 = yz.g2.f100423a
            return r9
        L79:
            androidx.datastore.core.DataStoreImpl<T> r3 = r8.this$0
            androidx.datastore.core.DataStoreInMemoryCache r3 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r3)
            kotlinx.coroutines.flow.i r3 = r3.getFlow()
            androidx.datastore.core.DataStoreImpl$data$1$1 r4 = new androidx.datastore.core.DataStoreImpl$data$1$1
            androidx.datastore.core.DataStoreImpl<T> r5 = r8.this$0
            r6 = 0
            r4.<init>(r5, r6)
            kotlinx.coroutines.flow.i r3 = kotlinx.coroutines.flow.k.o1(r3, r4)
            androidx.datastore.core.DataStoreImpl$data$1$2 r4 = new androidx.datastore.core.DataStoreImpl$data$1$2
            r4.<init>(r6)
            kotlinx.coroutines.flow.i r3 = kotlinx.coroutines.flow.k.X1(r3, r4)
            androidx.datastore.core.DataStoreImpl$data$1$3 r4 = new androidx.datastore.core.DataStoreImpl$data$1$3
            r4.<init>(r9, r6)
            kotlinx.coroutines.flow.i r9 = kotlinx.coroutines.flow.k.m0(r3, r4)
            androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 r3 = new androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1
            r3.<init>()
            androidx.datastore.core.DataStoreImpl$data$1$5 r9 = new androidx.datastore.core.DataStoreImpl$data$1$5
            androidx.datastore.core.DataStoreImpl<T> r4 = r8.this$0
            r9.<init>(r4, r6)
            kotlinx.coroutines.flow.i r9 = kotlinx.coroutines.flow.k.g1(r3, r9)
            r8.L$0 = r6
            r8.L$1 = r6
            r8.label = r2
            java.lang.Object r9 = kotlinx.coroutines.flow.k.o0(r1, r9, r8)
            if (r9 != r0) goto Lbe
        Lbd:
            return r0
        Lbe:
            yz.g2 r9 = yz.g2.f100423a
            return r9
        Lc1:
            androidx.datastore.core.ReadException r9 = (androidx.datastore.core.ReadException) r9
            java.lang.Throwable r9 = r9.getReadException()
            throw r9
        Lc8:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$data$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // x00.p
    @l
    public final Object invoke(@k j<? super T> jVar, @l c<? super g2> cVar) {
        return ((DataStoreImpl$data$1) create(jVar, cVar)).invokeSuspend(g2.f100423a);
    }
}
