package u30;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f implements q30.m<g10.l> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final CharSequence f91608a;

    /* renamed from: b, reason: collision with root package name */
    public final int f91609b;

    /* renamed from: c, reason: collision with root package name */
    public final int f91610c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final x00.p<CharSequence, Integer, Pair<Integer, Integer>> f91611d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements Iterator<g10.l>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public int f91612a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f91613b;

        /* renamed from: c, reason: collision with root package name */
        public int f91614c;

        /* renamed from: d, reason: collision with root package name */
        public g10.l f91615d;

        /* renamed from: e, reason: collision with root package name */
        public int f91616e;

        public a() {
            int I = g10.u.I(f.this.f91609b, 0, f.this.f91608a.length());
            this.f91613b = I;
            this.f91614c = I;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
        
            if (r0 < r6.f91617f.f91610c) goto L10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f91614c
                r1 = 0
                if (r0 >= 0) goto Lb
                r6.f91612a = r1
                r0 = 0
                r6.f91615d = r0
                return
            Lb:
                u30.f r0 = u30.f.this
                int r0 = u30.f.e(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L22
                int r0 = r6.f91616e
                int r0 = r0 + r3
                r6.f91616e = r0
                u30.f r4 = u30.f.this
                int r4 = u30.f.e(r4)
                if (r0 >= r4) goto L30
            L22:
                int r0 = r6.f91614c
                u30.f r4 = u30.f.this
                java.lang.CharSequence r4 = u30.f.d(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L46
            L30:
                g10.l r0 = new g10.l
                int r1 = r6.f91613b
                u30.f r4 = u30.f.this
                java.lang.CharSequence r4 = u30.f.d(r4)
                int r4 = u30.k0.A3(r4)
                r0.<init>(r1, r4)
                r6.f91615d = r0
                r6.f91614c = r2
                goto L9b
            L46:
                u30.f r0 = u30.f.this
                x00.p r0 = u30.f.c(r0)
                u30.f r4 = u30.f.this
                java.lang.CharSequence r4 = u30.f.d(r4)
                int r5 = r6.f91614c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L76
                g10.l r0 = new g10.l
                int r1 = r6.f91613b
                u30.f r4 = u30.f.this
                java.lang.CharSequence r4 = u30.f.d(r4)
                int r4 = u30.k0.A3(r4)
                r0.<init>(r1, r4)
                r6.f91615d = r0
                r6.f91614c = r2
                goto L9b
            L76:
                java.lang.Object r2 = r0.component1()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f91613b
                g10.l r4 = g10.u.W1(r4, r2)
                r6.f91615d = r4
                int r2 = r2 + r0
                r6.f91613b = r2
                if (r0 != 0) goto L98
                r1 = r3
            L98:
                int r2 = r2 + r1
                r6.f91614c = r2
            L9b:
                r6.f91612a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u30.f.a.a():void");
        }

        public final int b() {
            return this.f91616e;
        }

        public final int c() {
            return this.f91613b;
        }

        public final g10.l d() {
            return this.f91615d;
        }

        public final int e() {
            return this.f91614c;
        }

        public final int f() {
            return this.f91612a;
        }

        @Override // java.util.Iterator
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public g10.l next() {
            if (this.f91612a == -1) {
                a();
            }
            if (this.f91612a == 0) {
                throw new NoSuchElementException();
            }
            g10.l lVar = this.f91615d;
            kotlin.jvm.internal.g0.n(lVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f91615d = null;
            this.f91612a = -1;
            return lVar;
        }

        public final void h(int i11) {
            this.f91616e = i11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f91612a == -1) {
                a();
            }
            return this.f91612a == 1;
        }

        public final void j(int i11) {
            this.f91613b = i11;
        }

        public final void k(g10.l lVar) {
            this.f91615d = lVar;
        }

        public final void l(int i11) {
            this.f91614c = i11;
        }

        public final void m(int i11) {
            this.f91612a = i11;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@m80.k CharSequence input, int i11, int i12, @m80.k x00.p<? super CharSequence, ? super Integer, Pair<Integer, Integer>> getNextMatch) {
        kotlin.jvm.internal.g0.p(input, "input");
        kotlin.jvm.internal.g0.p(getNextMatch, "getNextMatch");
        this.f91608a = input;
        this.f91609b = i11;
        this.f91610c = i12;
        this.f91611d = getNextMatch;
    }

    @Override // q30.m
    @m80.k
    public Iterator<g10.l> iterator() {
        return new a();
    }
}
