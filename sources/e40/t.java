package e40;

import com.google.common.util.concurrent.s2;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/ChannelSegment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3116:1\n1#2:3117\n*E\n"})
/* loaded from: classes8.dex */
public final class t<E> extends h40.u0<t<E>> {

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final m<E> f49165e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f49166f;

    public t(long j11, @m80.l t<E> tVar, @m80.l m<E> mVar, int i11) {
        super(j11, tVar, i11);
        this.f49165e = mVar;
        this.f49166f = new AtomicReferenceArray(n.f49115b * 2);
    }

    public final boolean D(int i11, @m80.l Object obj, @m80.l Object obj2) {
        return s2.a(H(), (i11 * 2) + 1, obj, obj2);
    }

    public final void E(int i11) {
        M(i11, null);
    }

    @m80.l
    public final Object F(int i11, @m80.l Object obj) {
        return H().getAndSet((i11 * 2) + 1, obj);
    }

    @m80.k
    public final m<E> G() {
        m<E> mVar = this.f49165e;
        kotlin.jvm.internal.g0.m(mVar);
        return mVar;
    }

    public final /* synthetic */ AtomicReferenceArray H() {
        return this.f49166f;
    }

    public final E I(int i11) {
        return (E) H().get(i11 * 2);
    }

    @m80.l
    public final Object J(int i11) {
        return H().get((i11 * 2) + 1);
    }

    public final void K(int i11, boolean z11) {
        if (z11) {
            G().x2((this.f58276c * n.f49115b) + i11);
        }
        A();
    }

    public final E L(int i11) {
        E I = I(i11);
        E(i11);
        return I;
    }

    public final void M(int i11, Object obj) {
        H().set(i11 * 2, obj);
    }

    public final void N(int i11, @m80.l Object obj) {
        H().set((i11 * 2) + 1, obj);
    }

    public final void O(int i11, E e11) {
        M(i11, e11);
    }

    @Override // h40.u0
    public int y() {
        return n.f49115b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0062, code lost:
    
        E(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0065, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0067, code lost:
    
        r4 = G().f49072b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006d, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x006f, code lost:
    
        h40.p0.a(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // h40.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(int r4, @m80.l java.lang.Throwable r5, @m80.k kotlin.coroutines.d r6) {
        /*
            r3 = this;
            int r5 = e40.n.f49115b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.I(r4)
        Le:
            java.lang.Object r1 = r3.J(r4)
            boolean r2 = r1 instanceof c40.z3
            if (r2 != 0) goto L73
            boolean r2 = r1 instanceof e40.n0
            if (r2 == 0) goto L1b
            goto L73
        L1b:
            h40.x0 r2 = e40.n.j()
            if (r1 == r2) goto L62
            h40.x0 r2 = e40.n.i()
            if (r1 != r2) goto L28
            goto L62
        L28:
            h40.x0 r2 = e40.n.p()
            if (r1 == r2) goto Le
            h40.x0 r2 = e40.n.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            h40.x0 r4 = e40.n.f()
            if (r1 == r4) goto L99
            h40.x0 r4 = e40.n.f49119f
            if (r1 != r4) goto L40
            goto L99
        L40:
            h40.x0 r4 = e40.n.z()
            if (r1 != r4) goto L47
            goto L99
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            r3.E(r4)
            if (r0 == 0) goto L99
            e40.m r4 = r3.G()
            x00.l<E, yz.g2> r4 = r4.f49072b
            if (r4 == 0) goto L99
            h40.p0.a(r4, r5, r6)
            return
        L73:
            if (r0 == 0) goto L7a
            h40.x0 r2 = e40.n.j()
            goto L7e
        L7a:
            h40.x0 r2 = e40.n.i()
        L7e:
            boolean r1 = r3.D(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.E(r4)
            r1 = r0 ^ 1
            r3.K(r4, r1)
            if (r0 == 0) goto L99
            e40.m r4 = r3.G()
            x00.l<E, yz.g2> r4 = r4.f49072b
            if (r4 == 0) goto L99
            h40.p0.a(r4, r5, r6)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.t.z(int, java.lang.Throwable, kotlin.coroutines.d):void");
    }
}
