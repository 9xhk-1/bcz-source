package bt;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import bt.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class q extends bt.a {
    public static ThreadLocal<f> A = new ThreadLocal<>();
    public static final ThreadLocal<ArrayList<q>> B = new a();
    public static final ThreadLocal<ArrayList<q>> C = new b();
    public static final ThreadLocal<ArrayList<q>> D = new c();
    public static final ThreadLocal<ArrayList<q>> E = new d();
    public static final ThreadLocal<ArrayList<q>> F = new e();
    public static final Interpolator G = new AccelerateDecelerateInterpolator();
    public static final p H = new h();
    public static final p I = new bt.f();
    public static long J = 10;
    public static final int K = 1;
    public static final int L = 2;
    public static final int M = -1;

    /* renamed from: u, reason: collision with root package name */
    public static final long f7328u = 10;

    /* renamed from: v, reason: collision with root package name */
    public static final int f7329v = 0;

    /* renamed from: w, reason: collision with root package name */
    public static final int f7330w = 1;

    /* renamed from: x, reason: collision with root package name */
    public static final int f7331x = 0;

    /* renamed from: y, reason: collision with root package name */
    public static final int f7332y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final int f7333z = 2;

    /* renamed from: b, reason: collision with root package name */
    public long f7334b;

    /* renamed from: h, reason: collision with root package name */
    public long f7340h;

    /* renamed from: s, reason: collision with root package name */
    public n[] f7351s;

    /* renamed from: t, reason: collision with root package name */
    public HashMap<String, n> f7352t;

    /* renamed from: c, reason: collision with root package name */
    public long f7335c = -1;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7336d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f7337e = 0;

    /* renamed from: f, reason: collision with root package name */
    public float f7338f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7339g = false;

    /* renamed from: i, reason: collision with root package name */
    public int f7341i = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7342j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7343k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7344l = false;

    /* renamed from: m, reason: collision with root package name */
    public long f7345m = 300;

    /* renamed from: n, reason: collision with root package name */
    public long f7346n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f7347o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f7348p = 1;

    /* renamed from: q, reason: collision with root package name */
    public Interpolator f7349q = G;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList<g> f7350r = null;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends ThreadLocal<ArrayList<q>> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<q> initialValue() {
            return new ArrayList<>();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends ThreadLocal<ArrayList<q>> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<q> initialValue() {
            return new ArrayList<>();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends ThreadLocal<ArrayList<q>> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<q> initialValue() {
            return new ArrayList<>();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends ThreadLocal<ArrayList<q>> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<q> initialValue() {
            return new ArrayList<>();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends ThreadLocal<ArrayList<q>> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ArrayList<q> initialValue() {
            return new ArrayList<>();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f extends Handler {
        public f() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean z11;
            ArrayList arrayList = (ArrayList) q.B.get();
            ArrayList arrayList2 = (ArrayList) q.D.get();
            int i11 = message.what;
            if (i11 == 0) {
                ArrayList arrayList3 = (ArrayList) q.C.get();
                boolean z12 = arrayList.size() <= 0 && arrayList2.size() <= 0;
                while (arrayList3.size() > 0) {
                    ArrayList arrayList4 = (ArrayList) arrayList3.clone();
                    arrayList3.clear();
                    int size = arrayList4.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        q qVar = (q) arrayList4.get(i12);
                        if (qVar.f7346n == 0) {
                            qVar.B0();
                        } else {
                            arrayList2.add(qVar);
                        }
                    }
                }
                z11 = z12;
            } else if (i11 != 1) {
                return;
            } else {
                z11 = true;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            ArrayList arrayList5 = (ArrayList) q.F.get();
            ArrayList arrayList6 = (ArrayList) q.E.get();
            int size2 = arrayList2.size();
            for (int i13 = 0; i13 < size2; i13++) {
                q qVar2 = (q) arrayList2.get(i13);
                if (qVar2.O(currentAnimationTimeMillis)) {
                    arrayList5.add(qVar2);
                }
            }
            int size3 = arrayList5.size();
            if (size3 > 0) {
                for (int i14 = 0; i14 < size3; i14++) {
                    q qVar3 = (q) arrayList5.get(i14);
                    qVar3.B0();
                    qVar3.f7342j = true;
                    arrayList2.remove(qVar3);
                }
                arrayList5.clear();
            }
            int size4 = arrayList.size();
            int i15 = 0;
            while (i15 < size4) {
                q qVar4 = (q) arrayList.get(i15);
                if (qVar4.K(currentAnimationTimeMillis)) {
                    arrayList6.add(qVar4);
                }
                if (arrayList.size() == size4) {
                    i15++;
                } else {
                    size4--;
                    arrayList6.remove(qVar4);
                }
            }
            if (arrayList6.size() > 0) {
                for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                    ((q) arrayList6.get(i16)).P();
                }
                arrayList6.clear();
            }
            if (z11) {
                if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                    return;
                }
                sendEmptyMessageDelayed(1, Math.max(0L, q.J - (AnimationUtils.currentAnimationTimeMillis() - currentAnimationTimeMillis)));
            }
        }

        public /* synthetic */ f(f fVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface g {
        void a(q qVar);
    }

    public static void M() {
        B.get().clear();
        C.get().clear();
        D.get().clear();
    }

    public static int W() {
        return B.get().size();
    }

    public static long Y() {
        return J;
    }

    public static q f0(float... fArr) {
        q qVar = new q();
        qVar.r0(fArr);
        return qVar;
    }

    public static q g0(int... iArr) {
        q qVar = new q();
        qVar.t0(iArr);
        return qVar;
    }

    public static q h0(p pVar, Object... objArr) {
        q qVar = new q();
        qVar.u0(objArr);
        qVar.q0(pVar);
        return qVar;
    }

    public static q j0(n... nVarArr) {
        q qVar = new q();
        qVar.z0(nVarArr);
        return qVar;
    }

    public static void s0(long j11) {
        J = j11;
    }

    public final void A0(boolean z11) {
        if (Looper.myLooper() == null) {
            throw new AndroidRuntimeException("Animators may only be run on Looper threads");
        }
        this.f7336d = z11;
        this.f7337e = 0;
        this.f7341i = 0;
        this.f7343k = true;
        this.f7339g = false;
        C.get().add(this);
        if (this.f7346n == 0) {
            o0(X());
            this.f7341i = 0;
            this.f7342j = true;
            ArrayList<a.InterfaceC0121a> arrayList = this.f7223a;
            if (arrayList != null) {
                ArrayList arrayList2 = (ArrayList) arrayList.clone();
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((a.InterfaceC0121a) arrayList2.get(i11)).c(this);
                }
            }
        }
        f fVar = A.get();
        if (fVar == null) {
            fVar = new f(null);
            A.set(fVar);
        }
        fVar.sendEmptyMessage(0);
    }

    public final void B0() {
        ArrayList<a.InterfaceC0121a> arrayList;
        e0();
        B.get().add(this);
        if (this.f7346n <= 0 || (arrayList = this.f7223a) == null) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) arrayList.clone();
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((a.InterfaceC0121a) arrayList2.get(i11)).c(this);
        }
    }

    public void G(g gVar) {
        if (this.f7350r == null) {
            this.f7350r = new ArrayList<>();
        }
        this.f7350r.add(gVar);
    }

    public void J(float f11) {
        float interpolation = this.f7349q.getInterpolation(f11);
        this.f7338f = interpolation;
        int length = this.f7351s.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f7351s[i11].a(interpolation);
        }
        ArrayList<g> arrayList = this.f7350r;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                this.f7350r.get(i12).a(this);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean K(long r11) {
        /*
            r10 = this;
            int r0 = r10.f7341i
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L1a
            r10.f7341i = r3
            long r4 = r10.f7335c
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L12
            r10.f7334b = r11
            goto L1a
        L12:
            long r4 = r11 - r4
            r10.f7334b = r4
            r4 = -1
            r10.f7335c = r4
        L1a:
            int r0 = r10.f7341i
            r4 = 2
            r5 = 0
            if (r0 == r3) goto L23
            if (r0 == r4) goto L23
            return r5
        L23:
            long r6 = r10.f7345m
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= 0) goto L32
            long r8 = r10.f7334b
            long r11 = r11 - r8
            float r11 = (float) r11
            float r12 = (float) r6
            float r11 = r11 / r12
            goto L33
        L32:
            r11 = r1
        L33:
            int r12 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r12 < 0) goto L77
            int r12 = r10.f7337e
            int r0 = r10.f7347o
            if (r12 < r0) goto L46
            r12 = -1
            if (r0 != r12) goto L41
            goto L46
        L41:
            float r11 = java.lang.Math.min(r11, r1)
            goto L78
        L46:
            java.util.ArrayList<bt.a$a> r12 = r10.f7223a
            if (r12 == 0) goto L60
            int r12 = r12.size()
            r0 = r5
        L4f:
            if (r0 < r12) goto L52
            goto L60
        L52:
            java.util.ArrayList<bt.a$a> r2 = r10.f7223a
            java.lang.Object r2 = r2.get(r0)
            bt.a$a r2 = (bt.a.InterfaceC0121a) r2
            r2.b(r10)
            int r0 = r0 + 1
            goto L4f
        L60:
            int r12 = r10.f7348p
            if (r12 != r4) goto L69
            boolean r12 = r10.f7336d
            r12 = r12 ^ r3
            r10.f7336d = r12
        L69:
            int r12 = r10.f7337e
            int r0 = (int) r11
            int r12 = r12 + r0
            r10.f7337e = r12
            float r11 = r11 % r1
            long r2 = r10.f7334b
            long r6 = r10.f7345m
            long r2 = r2 + r6
            r10.f7334b = r2
        L77:
            r3 = r5
        L78:
            boolean r12 = r10.f7336d
            if (r12 == 0) goto L7e
            float r11 = r1 - r11
        L7e:
            r10.J(r11)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: bt.q.K(long):boolean");
    }

    @Override // bt.a
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public q clone() {
        q qVar = (q) super.clone();
        ArrayList<g> arrayList = this.f7350r;
        if (arrayList != null) {
            qVar.f7350r = new ArrayList<>();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                qVar.f7350r.add(arrayList.get(i11));
            }
        }
        qVar.f7335c = -1L;
        qVar.f7336d = false;
        qVar.f7337e = 0;
        qVar.f7344l = false;
        qVar.f7341i = 0;
        qVar.f7339g = false;
        n[] nVarArr = this.f7351s;
        if (nVarArr != null) {
            int length = nVarArr.length;
            qVar.f7351s = new n[length];
            qVar.f7352t = new HashMap<>(length);
            for (int i12 = 0; i12 < length; i12++) {
                n clone = nVarArr[i12].clone();
                qVar.f7351s[i12] = clone;
                qVar.f7352t.put(clone.f(), clone);
            }
        }
        return qVar;
    }

    public final boolean O(long j11) {
        if (!this.f7339g) {
            this.f7339g = true;
            this.f7340h = j11;
            return false;
        }
        long j12 = j11 - this.f7340h;
        long j13 = this.f7346n;
        if (j12 <= j13) {
            return false;
        }
        this.f7334b = j11 - (j12 - j13);
        this.f7341i = 1;
        return true;
    }

    public final void P() {
        ArrayList<a.InterfaceC0121a> arrayList;
        B.get().remove(this);
        C.get().remove(this);
        D.get().remove(this);
        this.f7341i = 0;
        if (this.f7342j && (arrayList = this.f7223a) != null) {
            ArrayList arrayList2 = (ArrayList) arrayList.clone();
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                ((a.InterfaceC0121a) arrayList2.get(i11)).e(this);
            }
        }
        this.f7342j = false;
        this.f7343k = false;
    }

    public float Q() {
        return this.f7338f;
    }

    public Object R() {
        n[] nVarArr = this.f7351s;
        if (nVarArr == null || nVarArr.length <= 0) {
            return null;
        }
        return nVarArr[0].c();
    }

    public Object T(String str) {
        n nVar = this.f7352t.get(str);
        if (nVar != null) {
            return nVar.c();
        }
        return null;
    }

    public long X() {
        if (!this.f7344l || this.f7341i == 0) {
            return 0L;
        }
        return AnimationUtils.currentAnimationTimeMillis() - this.f7334b;
    }

    public Interpolator Z() {
        return this.f7349q;
    }

    public int a0() {
        return this.f7347o;
    }

    public int b0() {
        return this.f7348p;
    }

    @Override // bt.a
    public void c() {
        if (!B.get().contains(this) && !C.get().contains(this)) {
            this.f7339g = false;
            B0();
        } else if (!this.f7344l) {
            e0();
        }
        int i11 = this.f7347o;
        if (i11 <= 0 || (i11 & 1) != 1) {
            J(1.0f);
        } else {
            J(0.0f);
        }
        P();
    }

    public n[] c0() {
        return this.f7351s;
    }

    @Override // bt.a
    public void cancel() {
        ArrayList<a.InterfaceC0121a> arrayList;
        if (this.f7341i != 0 || C.get().contains(this) || D.get().contains(this)) {
            if (this.f7342j && (arrayList = this.f7223a) != null) {
                Iterator it = ((ArrayList) arrayList.clone()).iterator();
                while (it.hasNext()) {
                    ((a.InterfaceC0121a) it.next()).d(this);
                }
            }
            P();
        }
    }

    @Override // bt.a
    public long d() {
        return this.f7345m;
    }

    public void e0() {
        if (this.f7344l) {
            return;
        }
        int length = this.f7351s.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f7351s[i11].g();
        }
        this.f7344l = true;
    }

    @Override // bt.a
    public long f() {
        return this.f7346n;
    }

    @Override // bt.a
    public boolean g() {
        return this.f7341i == 1 || this.f7342j;
    }

    @Override // bt.a
    public boolean h() {
        return this.f7343k;
    }

    public void l0() {
        ArrayList<g> arrayList = this.f7350r;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
        this.f7350r = null;
    }

    @Override // bt.a
    public void m(Interpolator interpolator) {
        if (interpolator != null) {
            this.f7349q = interpolator;
        } else {
            this.f7349q = new LinearInterpolator();
        }
    }

    public void m0(g gVar) {
        ArrayList<g> arrayList = this.f7350r;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(gVar);
        if (this.f7350r.size() == 0) {
            this.f7350r = null;
        }
    }

    @Override // bt.a
    public void n(long j11) {
        this.f7346n = j11;
    }

    public void n0() {
        this.f7336d = !this.f7336d;
        if (this.f7341i != 1) {
            A0(true);
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f7334b = currentAnimationTimeMillis - (this.f7345m - (currentAnimationTimeMillis - this.f7334b));
    }

    public void o0(long j11) {
        e0();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (this.f7341i != 1) {
            this.f7335c = j11;
            this.f7341i = 2;
        }
        this.f7334b = currentAnimationTimeMillis - j11;
        K(currentAnimationTimeMillis);
    }

    @Override // bt.a
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public q l(long j11) {
        if (j11 >= 0) {
            this.f7345m = j11;
            return this;
        }
        throw new IllegalArgumentException("Animators cannot have negative duration: " + j11);
    }

    public void q0(p pVar) {
        n[] nVarArr;
        if (pVar == null || (nVarArr = this.f7351s) == null || nVarArr.length <= 0) {
            return;
        }
        nVarArr[0].s(pVar);
    }

    public void r0(float... fArr) {
        if (fArr == null || fArr.length == 0) {
            return;
        }
        n[] nVarArr = this.f7351s;
        if (nVarArr == null || nVarArr.length == 0) {
            z0(n.i("", fArr));
        } else {
            nVarArr[0].t(fArr);
        }
        this.f7344l = false;
    }

    @Override // bt.a
    public void s() {
        A0(false);
    }

    public void t0(int... iArr) {
        if (iArr == null || iArr.length == 0) {
            return;
        }
        n[] nVarArr = this.f7351s;
        if (nVarArr == null || nVarArr.length == 0) {
            z0(n.l("", iArr));
        } else {
            nVarArr[0].u(iArr);
        }
        this.f7344l = false;
    }

    public String toString() {
        String str = "ValueAnimator@" + Integer.toHexString(hashCode());
        if (this.f7351s == null) {
            return str;
        }
        for (int i11 = 0; i11 < this.f7351s.length; i11++) {
            str = String.valueOf(str) + "\n    " + this.f7351s[i11].toString();
        }
        return str;
    }

    public void u0(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return;
        }
        n[] nVarArr = this.f7351s;
        if (nVarArr == null || nVarArr.length == 0) {
            z0(n.p("", null, objArr));
        } else {
            nVarArr[0].w(objArr);
        }
        this.f7344l = false;
    }

    public void v0(int i11) {
        this.f7347o = i11;
    }

    public void x0(int i11) {
        this.f7348p = i11;
    }

    public void z0(n... nVarArr) {
        int length = nVarArr.length;
        this.f7351s = nVarArr;
        this.f7352t = new HashMap<>(length);
        for (n nVar : nVarArr) {
            this.f7352t.put(nVar.f(), nVar);
        }
        this.f7344l = false;
    }
}
