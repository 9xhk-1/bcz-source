package kotlinx.coroutines.flow;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k0 implements h0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.StartedLazily$command$1", f = "SharingStarted.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<j<? super SharingCommand>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f68298a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68299b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m0<Integer> f68300c;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kotlinx.coroutines.flow.k0$a$a, reason: collision with other inner class name */
        public static final class C0818a<T> implements j {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Ref.BooleanRef f68301a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j<SharingCommand> f68302b;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", f = "SharingStarted.kt", i = {}, l = {154}, m = "emit", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.k0$a$a$a, reason: collision with other inner class name */
            public static final class C0819a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f68303a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0818a<T> f68304b;

                /* renamed from: c, reason: collision with root package name */
                public int f68305c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0819a(C0818a<? super T> c0818a, j00.c<? super C0819a> cVar) {
                    super(cVar);
                    this.f68304b = c0818a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f68303a = obj;
                    this.f68305c |= Integer.MIN_VALUE;
                    return this.f68304b.a(0, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0818a(Ref.BooleanRef booleanRef, j<? super SharingCommand> jVar) {
                this.f68301a = booleanRef;
                this.f68302b = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object a(int r5, j00.c<? super yz.g2> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof kotlinx.coroutines.flow.k0.a.C0818a.C0819a
                    if (r0 == 0) goto L13
                    r0 = r6
                    kotlinx.coroutines.flow.k0$a$a$a r0 = (kotlinx.coroutines.flow.k0.a.C0818a.C0819a) r0
                    int r1 = r0.f68305c
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f68305c = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.k0$a$a$a r0 = new kotlinx.coroutines.flow.k0$a$a$a
                    r0.<init>(r4, r6)
                L18:
                    java.lang.Object r6 = r0.f68303a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.f68305c
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.e.n(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.e.n(r6)
                    if (r5 <= 0) goto L4e
                    kotlin.jvm.internal.Ref$BooleanRef r5 = r4.f68301a
                    boolean r6 = r5.element
                    if (r6 != 0) goto L4e
                    r5.element = r3
                    kotlinx.coroutines.flow.j<kotlinx.coroutines.flow.SharingCommand> r5 = r4.f68302b
                    kotlinx.coroutines.flow.SharingCommand r6 = kotlinx.coroutines.flow.SharingCommand.START
                    r0.f68305c = r3
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    yz.g2 r5 = yz.g2.f100423a
                    return r5
                L4e:
                    yz.g2 r5 = yz.g2.f100423a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.k0.a.C0818a.a(int, j00.c):java.lang.Object");
            }

            @Override // kotlinx.coroutines.flow.j
            public /* bridge */ /* synthetic */ Object emit(Object obj, j00.c cVar) {
                return a(((Number) obj).intValue(), cVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m0<Integer> m0Var, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f68300c = m0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f68300c, cVar);
            aVar.f68299b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f68298a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                j jVar = (j) this.f68299b;
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                m0<Integer> m0Var = this.f68300c;
                C0818a c0818a = new C0818a(booleanRef, jVar);
                this.f68298a = 1;
                if (m0Var.collect(c0818a, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // x00.p
        public final Object invoke(j<? super SharingCommand> jVar, j00.c<? super g2> cVar) {
            return ((a) create(jVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    @Override // kotlinx.coroutines.flow.h0
    @m80.k
    public i<SharingCommand> a(@m80.k m0<Integer> m0Var) {
        return k.K0(new a(m0Var, null));
    }

    @m80.k
    public String toString() {
        return "SharingStarted.Lazily";
    }
}
