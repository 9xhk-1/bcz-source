package ce;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class h extends be.f {

    /* renamed from: i, reason: collision with root package name */
    public static final int f8553i = 8;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f8554b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f8555c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Triple<Integer, Integer, Integer> f8556d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8557e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Pair<Integer, Integer> f8558f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f8559g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8560h;

    public h(@k Context context, @k View target, @k Triple<Integer, Integer, Integer> guiderViewIds, int i11, @k Pair<Integer, Integer> extendedDiff, @k String key, int i12) {
        g0.p(context, "context");
        g0.p(target, "target");
        g0.p(guiderViewIds, "guiderViewIds");
        g0.p(extendedDiff, "extendedDiff");
        g0.p(key, "key");
        this.f8554b = context;
        this.f8555c = target;
        this.f8556d = guiderViewIds;
        this.f8557e = i11;
        this.f8558f = extendedDiff;
        this.f8559g = key;
        this.f8560h = i12;
    }

    @Override // be.k
    @k
    public Triple<Integer, Integer, Integer> A() {
        return this.f8556d;
    }

    @Override // be.f, be.k
    public int E() {
        return this.f8557e;
    }

    @Override // be.f, be.k
    @k
    public Pair<Integer, Integer> I() {
        return this.f8558f;
    }

    @Override // be.k
    @k
    public Context getContext() {
        return this.f8554b;
    }

    @Override // be.m
    @k
    public String getKey() {
        return this.f8559g;
    }

    @Override // be.f, be.k
    @k
    public View getTarget() {
        return this.f8555c;
    }

    @Override // be.f, be.k
    public int getWeight() {
        return this.f8560h;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ h(android.content.Context r9, android.view.View r10, kotlin.Triple r11, int r12, kotlin.Pair r13, java.lang.String r14, int r15, int r16, kotlin.jvm.internal.v r17) {
        /*
            r8 = this;
            r0 = r16 & 4
            if (r0 == 0) goto L20
            kotlin.Triple r0 = new kotlin.Triple
            r2 = 2131558816(0x7f0d01a0, float:1.8742958E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2131362888(0x7f0a0448, float:1.834557E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2131361919(0x7f0a007f, float:1.8343604E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.<init>(r2, r3, r4)
            r3 = r0
            goto L21
        L20:
            r3 = r11
        L21:
            r0 = r16 & 8
            r2 = 1090519040(0x41000000, float:8.0)
            if (r0 == 0) goto L2d
            int r0 = xb.f.a(r9, r2)
            r4 = r0
            goto L2e
        L2d:
            r4 = r12
        L2e:
            r0 = r16 & 16
            if (r0 == 0) goto L4b
            kotlin.Pair r0 = new kotlin.Pair
            int r2 = xb.f.a(r9, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5 = 1086324736(0x40c00000, float:6.0)
            int r5 = xb.f.a(r9, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.<init>(r2, r5)
            r5 = r0
            goto L4c
        L4b:
            r5 = r13
        L4c:
            r0 = r16 & 32
            if (r0 == 0) goto L54
            java.lang.String r0 = "global.rank_parsing_guide"
            r6 = r0
            goto L55
        L54:
            r6 = r14
        L55:
            r0 = r16 & 64
            if (r0 == 0) goto L5f
            r0 = 3
            r7 = r0
            r1 = r9
            r2 = r10
            r0 = r8
            goto L63
        L5f:
            r7 = r15
            r0 = r8
            r1 = r9
            r2 = r10
        L63:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.h.<init>(android.content.Context, android.view.View, kotlin.Triple, int, kotlin.Pair, java.lang.String, int, int, kotlin.jvm.internal.v):void");
    }
}
