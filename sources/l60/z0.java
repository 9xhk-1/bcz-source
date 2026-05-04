package l60;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAsyncTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncTimeout.kt\nokio/PriorityQueue\n*L\n1#1,514:1\n509#1,3:515\n509#1,3:518\n509#1,3:521\n509#1,3:524\n*S KotlinDebug\n*F\n+ 1 AsyncTimeout.kt\nokio/PriorityQueue\n*L\n415#1:515,3\n448#1:518,3\n481#1:521,3\n491#1:524,3\n*E\n"})
/* loaded from: classes8.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    public int f70536a;

    /* renamed from: b, reason: collision with root package name */
    @w00.g
    @m80.k
    public i[] f70537b = new i[8];

    public final void a(@m80.k i node) {
        kotlin.jvm.internal.g0.p(node, "node");
        int i11 = this.f70536a + 1;
        this.f70536a = i11;
        i[] iVarArr = this.f70537b;
        if (i11 == iVarArr.length) {
            i[] iVarArr2 = new i[i11 * 2];
            a00.q.K0(iVarArr, iVarArr2, 0, 0, 0, 14, null);
            this.f70537b = iVarArr2;
        }
        e(i11, node);
    }

    public final int b(i iVar, i iVar2) {
        kotlin.jvm.internal.g0.p(iVar, "<this>");
        return kotlin.jvm.internal.g0.u(0L, iVar2.z() - iVar.z());
    }

    @m80.l
    public final i c() {
        return this.f70537b[1];
    }

    public final void d(int i11, i iVar) {
        i iVar2;
        while (true) {
            int i12 = i11 << 1;
            int i13 = i12 + 1;
            int i14 = this.f70536a;
            if (i13 > i14) {
                if (i12 > i14) {
                    break;
                }
                iVar2 = this.f70537b[i12];
                kotlin.jvm.internal.g0.m(iVar2);
            } else {
                iVar2 = this.f70537b[i12];
                kotlin.jvm.internal.g0.m(iVar2);
                i iVar3 = this.f70537b[i13];
                kotlin.jvm.internal.g0.m(iVar3);
                if (kotlin.jvm.internal.g0.u(0L, iVar3.z() - iVar2.z()) >= 0) {
                    iVar2 = iVar3;
                }
            }
            if (kotlin.jvm.internal.g0.u(0L, iVar2.z() - iVar.z()) <= 0) {
                break;
            }
            int i15 = iVar2.f70431h;
            iVar2.f70431h = i11;
            this.f70537b[i11] = iVar2;
            i11 = i15;
        }
        this.f70537b[i11] = iVar;
        iVar.f70431h = i11;
    }

    public final void e(int i11, i iVar) {
        while (true) {
            int i12 = i11 >> 1;
            if (i12 == 0) {
                break;
            }
            i iVar2 = this.f70537b[i12];
            kotlin.jvm.internal.g0.m(iVar2);
            if (kotlin.jvm.internal.g0.u(0L, iVar.z() - iVar2.z()) <= 0) {
                break;
            }
            iVar2.f70431h = i11;
            this.f70537b[i11] = iVar2;
            i11 = i12;
        }
        this.f70537b[i11] = iVar;
        iVar.f70431h = i11;
    }

    public final void f(@m80.k i node) {
        kotlin.jvm.internal.g0.p(node, "node");
        int i11 = node.f70431h;
        if (i11 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i12 = this.f70536a;
        i iVar = this.f70537b[i12];
        kotlin.jvm.internal.g0.m(iVar);
        node.f70431h = -1;
        this.f70537b[i12] = null;
        this.f70536a = i12 - 1;
        if (node == iVar) {
            return;
        }
        int u11 = kotlin.jvm.internal.g0.u(0L, iVar.z() - node.z());
        if (u11 == 0) {
            this.f70537b[i11] = iVar;
            iVar.f70431h = i11;
        } else if (u11 < 0) {
            d(i11, iVar);
        } else {
            e(i11, iVar);
        }
    }
}
