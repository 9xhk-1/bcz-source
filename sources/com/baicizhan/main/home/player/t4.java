package com.baicizhan.main.home.player;

import androidx.annotation.NonNull;
import com.esotericsoftware.spine.Animation;
import com.esotericsoftware.spine.Skeleton;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class t4 implements ll.b {

    /* renamed from: f, reason: collision with root package name */
    public static final String f24176f = "IslandBounds";

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f24177a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24178b;

    /* renamed from: c, reason: collision with root package name */
    public final double f24179c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24180d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f24181e;

    public t4(List<String> skins, String animation, double stepTime, @NonNull String anchor) {
        this.f24177a = (skins == null || skins.isEmpty()) ? Collections.singletonList("default") : skins;
        this.f24178b = animation;
        this.f24179c = stepTime;
        this.f24180d = anchor;
    }

    @Override // ll.b
    public ll.a a(kl.b bVar) {
        double d11;
        double d12;
        double d13;
        double d14;
        jl.i h11 = bVar.h();
        com.esotericsoftware.spine.h u11 = bVar.g().u();
        com.esotericsoftware.spine.h hVar = new com.esotericsoftware.spine.h("custom-skin");
        Iterator<String> it = this.f24177a.iterator();
        while (it.hasNext()) {
            com.esotericsoftware.spine.h g11 = h11.g(it.next());
            if (g11 != null) {
                hVar.a(g11);
            }
        }
        bVar.g().M(hVar);
        bVar.g().Q();
        String str = this.f24178b;
        Animation a11 = str != null ? h11.a(str) : null;
        boolean z11 = false;
        if (a11 == null) {
            ll.a aVar = new ll.a(bVar.g());
            d14 = aVar.c();
            d11 = aVar.d();
            d12 = aVar.b() + d14;
            d13 = aVar.a() + d11;
        } else {
            bVar.d().w(0, a11, false);
            int max = (int) Math.max(a11.b() / this.f24179c, 1.0d);
            d11 = Double.POSITIVE_INFINITY;
            int i11 = 0;
            d12 = Double.NEGATIVE_INFINITY;
            d13 = Double.NEGATIVE_INFINITY;
            d14 = Double.POSITIVE_INFINITY;
            while (i11 < max) {
                boolean z12 = z11;
                bVar.i(i11 > 0 ? (float) this.f24179c : 0.0f);
                ll.a aVar2 = new ll.a(bVar.g());
                d14 = Math.min(d14, aVar2.c());
                d11 = Math.min(d11, aVar2.d());
                d12 = Math.max(d12, aVar2.b() + d14);
                d13 = Math.max(d13, aVar2.a() + d11);
                i11++;
                z11 = z12;
            }
        }
        boolean z13 = z11;
        bVar.g().N("default");
        bVar.d().n();
        if (u11 != null) {
            bVar.g().M(u11);
        }
        bVar.g().Q();
        bVar.i(0.0f);
        if (this.f24181e == null) {
            this.f24181e = b(bVar.g(), this.f24180d);
        }
        if (this.f24181e != null) {
            d14 += r1[z13 ? 1 : 0] - d14;
            d11 += r1[1] - d11;
            d12 += r1[2] - d12;
            d13 += r1[3] - d13;
        }
        double d15 = d14;
        double d16 = d11;
        return new ll.a(d15, d16, d12 - d15, d13 - d16);
    }

    public final float[] b(Skeleton skeleton, String slotName) {
        jl.m e11 = skeleton.e(slotName);
        if (e11 == null) {
            return null;
        }
        ol.b a11 = e11.a();
        char c11 = 2;
        if (a11 instanceof ol.j) {
            float[] fArr = new float[8];
            ((ol.j) a11).j(e11, fArr, 0, 2);
            int i11 = 0;
            float f11 = Float.MIN_VALUE;
            float f12 = Float.MIN_VALUE;
            float f13 = Float.MAX_VALUE;
            float f14 = Float.MAX_VALUE;
            for (int i12 = 8; i11 < i12; i12 = 8) {
                float f15 = fArr[i11];
                float f16 = fArr[i11 + 1];
                f13 = Math.min(f13, f15);
                f14 = Math.min(f14, f16);
                f11 = Math.max(f11, f15);
                f12 = Math.max(f12, f16);
                i11 += 2;
            }
            qb.c.b(f24176f, slotName + " [1] --- minX: " + f13 + ", minY: " + f14 + ", maxX: " + f11 + ", maxY: " + f12, new Object[0]);
            return new float[]{f13, f14, f11, f12};
        }
        if (!(a11 instanceof ol.g)) {
            return null;
        }
        ol.g gVar = (ol.g) a11;
        int o11 = gVar.o();
        float[] fArr2 = new float[o11];
        gVar.j(e11, 0, o11, fArr2, 0, 2);
        int i13 = 0;
        float f17 = Float.MIN_VALUE;
        float f18 = Float.MIN_VALUE;
        float f19 = Float.MAX_VALUE;
        float f21 = Float.MAX_VALUE;
        while (i13 < o11) {
            float f22 = fArr2[i13];
            char c12 = c11;
            float f23 = fArr2[i13 + 1];
            f19 = Math.min(f19, f22);
            f21 = Math.min(f21, f23);
            f17 = Math.max(f17, f22);
            f18 = Math.max(f18, f23);
            i13 += 2;
            c11 = c12;
        }
        qb.c.b(f24176f, slotName + " [2] --- minX: " + f19 + ", minY: " + f21 + ", maxX: " + f17 + ", maxY: " + f18, new Object[0]);
        float[] fArr3 = new float[4];
        fArr3[0] = f19;
        fArr3[1] = f21;
        fArr3[c11] = f17;
        fArr3[3] = f18;
        return fArr3;
    }

    public t4(List<String> skins, String animation, @NonNull String anchor) {
        this(skins, animation, 0.1d, anchor);
    }

    public t4(String animation, @NonNull String anchor) {
        this(Collections.EMPTY_LIST, animation, 0.1d, anchor);
    }
}
