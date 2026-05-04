package vg;

import androidx.compose.runtime.internal.StabilityInferred;
import f50.a0;
import j50.x2;
import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@a0
/* loaded from: classes4.dex */
public final class d {

    @m80.k
    public static final b Companion = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f93865e = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final m f93866a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final n f93867b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final v f93868c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final h f93869d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final f50.i<d> serializer() {
            return a.f93870a;
        }

        public b() {
        }
    }

    public d() {
        this((m) null, (n) null, (v) null, (h) null, 15, (kotlin.jvm.internal.v) null);
    }

    public static /* synthetic */ d f(d dVar, m mVar, n nVar, v vVar, h hVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mVar = dVar.f93866a;
        }
        if ((i11 & 2) != 0) {
            nVar = dVar.f93867b;
        }
        if ((i11 & 4) != 0) {
            vVar = dVar.f93868c;
        }
        if ((i11 & 8) != 0) {
            hVar = dVar.f93869d;
        }
        return dVar.e(mVar, nVar, vVar, hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        if (kotlin.jvm.internal.g0.g(r10.f93868c, new vg.v(0.0f, (java.util.List) null, (java.util.List) null, (java.util.List) null, 0.0f, 31, (kotlin.jvm.internal.v) null)) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (kotlin.jvm.internal.g0.g(r10.f93866a, new vg.m(0.0f, 0.0f, (java.util.List) null, (java.util.List) null, (java.util.List) null, 31, (kotlin.jvm.internal.v) null)) == false) goto L7;
     */
    @w00.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void k(vg.d r10, i50.e r11, h50.f r12) {
        /*
            r0 = 0
            boolean r1 = r11.shouldEncodeElementDefault(r12, r0)
            if (r1 == 0) goto L8
            goto L1d
        L8:
            vg.m r1 = r10.f93866a
            vg.m r2 = new vg.m
            r8 = 31
            r9 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 != 0) goto L24
        L1d:
            vg.m$a r1 = vg.m.a.f93895a
            vg.m r2 = r10.f93866a
            r11.encodeSerializableElement(r12, r0, r1, r2)
        L24:
            r0 = 1
            boolean r1 = r11.shouldEncodeElementDefault(r12, r0)
            if (r1 == 0) goto L2c
            goto L3e
        L2c:
            vg.n r1 = r10.f93867b
            vg.n r2 = new vg.n
            r6 = 7
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 != 0) goto L45
        L3e:
            vg.n$a r1 = vg.n.a.f93901a
            vg.n r2 = r10.f93867b
            r11.encodeSerializableElement(r12, r0, r1, r2)
        L45:
            r0 = 2
            boolean r1 = r11.shouldEncodeElementDefault(r12, r0)
            if (r1 == 0) goto L4d
            goto L62
        L4d:
            vg.v r1 = r10.f93868c
            vg.v r2 = new vg.v
            r8 = 31
            r9 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 != 0) goto L69
        L62:
            vg.v$a r1 = vg.v.a.f93919a
            vg.v r2 = r10.f93868c
            r11.encodeSerializableElement(r12, r0, r1, r2)
        L69:
            r0 = 3
            boolean r1 = r11.shouldEncodeElementDefault(r12, r0)
            if (r1 == 0) goto L71
            goto L86
        L71:
            vg.h r1 = r10.f93869d
            vg.h r2 = new vg.h
            r8 = 31
            r9 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 != 0) goto L8d
        L86:
            vg.h$a r1 = vg.h.a.f93879a
            vg.h r10 = r10.f93869d
            r11.encodeSerializableElement(r12, r0, r1, r10)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.d.k(vg.d, i50.e, h50.f):void");
    }

    @m80.k
    public final m a() {
        return this.f93866a;
    }

    @m80.k
    public final n b() {
        return this.f93867b;
    }

    @m80.k
    public final v c() {
        return this.f93868c;
    }

    @m80.k
    public final h d() {
        return this.f93869d;
    }

    @m80.k
    public final d e(@m80.k m position, @m80.k n rotation, @m80.k v scale, @m80.k h opacity) {
        g0.p(position, "position");
        g0.p(rotation, "rotation");
        g0.p(scale, "scale");
        g0.p(opacity, "opacity");
        return new d(position, rotation, scale, opacity);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return g0.g(this.f93866a, dVar.f93866a) && g0.g(this.f93867b, dVar.f93867b) && g0.g(this.f93868c, dVar.f93868c) && g0.g(this.f93869d, dVar.f93869d);
    }

    @m80.k
    public final h g() {
        return this.f93869d;
    }

    @m80.k
    public final m h() {
        return this.f93866a;
    }

    public int hashCode() {
        return (((((this.f93866a.hashCode() * 31) + this.f93867b.hashCode()) * 31) + this.f93868c.hashCode()) * 31) + this.f93869d.hashCode();
    }

    @m80.k
    public final n i() {
        return this.f93867b;
    }

    @m80.k
    public final v j() {
        return this.f93868c;
    }

    @m80.k
    public String toString() {
        return "AnimationData(position=" + this.f93866a + ", rotation=" + this.f93867b + ", scale=" + this.f93868c + ", opacity=" + this.f93869d + pn.j.f81007d;
    }

    public /* synthetic */ d(int i11, m mVar, n nVar, v vVar, h hVar, x2 x2Var) {
        if ((i11 & 1) == 0) {
            this.f93866a = new m(0.0f, 0.0f, (List) null, (List) null, (List) null, 31, (kotlin.jvm.internal.v) null);
        } else {
            this.f93866a = mVar;
        }
        if ((i11 & 2) == 0) {
            this.f93867b = new n((r) null, (r) null, (r) null, 7, (kotlin.jvm.internal.v) null);
        } else {
            this.f93867b = nVar;
        }
        if ((i11 & 4) == 0) {
            this.f93868c = new v(0.0f, (List) null, (List) null, (List) null, 0.0f, 31, (kotlin.jvm.internal.v) null);
        } else {
            this.f93868c = vVar;
        }
        if ((i11 & 8) != 0) {
            this.f93869d = hVar;
            return;
        }
        this.f93869d = new h(0.0f, 0.0f, (List) null, (List) null, (List) null, 31, (kotlin.jvm.internal.v) null);
    }

    public d(@m80.k m position, @m80.k n rotation, @m80.k v scale, @m80.k h opacity) {
        g0.p(position, "position");
        g0.p(rotation, "rotation");
        g0.p(scale, "scale");
        g0.p(opacity, "opacity");
        this.f93866a = position;
        this.f93867b = rotation;
        this.f93868c = scale;
        this.f93869d = opacity;
    }

    public /* synthetic */ d(m mVar, n nVar, v vVar, h hVar, int i11, kotlin.jvm.internal.v vVar2) {
        this((i11 & 1) != 0 ? new m(0.0f, 0.0f, (List) null, (List) null, (List) null, 31, (kotlin.jvm.internal.v) null) : mVar, (i11 & 2) != 0 ? new n((r) null, (r) null, (r) null, 7, (kotlin.jvm.internal.v) null) : nVar, (i11 & 4) != 0 ? new v(0.0f, (List) null, (List) null, (List) null, 0.0f, 31, (kotlin.jvm.internal.v) null) : vVar, (i11 & 8) != 0 ? new h(0.0f, 0.0f, (List) null, (List) null, (List) null, 31, (kotlin.jvm.internal.v) null) : hVar);
    }
}
