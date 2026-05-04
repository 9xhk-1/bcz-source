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
public final class g extends be.f {

    /* renamed from: h, reason: collision with root package name */
    public static final int f8546h = 8;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f8547b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f8548c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Triple<Integer, Integer, Integer> f8549d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8550e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Pair<Integer, Integer> f8551f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f8552g;

    public g(@k Context context, @k View target, @k Triple<Integer, Integer, Integer> guiderViewIds, int i11, @k Pair<Integer, Integer> extendedDiff, @k String key) {
        g0.p(context, "context");
        g0.p(target, "target");
        g0.p(guiderViewIds, "guiderViewIds");
        g0.p(extendedDiff, "extendedDiff");
        g0.p(key, "key");
        this.f8547b = context;
        this.f8548c = target;
        this.f8549d = guiderViewIds;
        this.f8550e = i11;
        this.f8551f = extendedDiff;
        this.f8552g = key;
    }

    @Override // be.k
    @k
    public Triple<Integer, Integer, Integer> A() {
        return this.f8549d;
    }

    @Override // be.f, be.k
    public int E() {
        return this.f8550e;
    }

    @Override // be.f, be.k
    @k
    public Pair<Integer, Integer> I() {
        return this.f8551f;
    }

    @Override // be.k
    @k
    public Context getContext() {
        return this.f8547b;
    }

    @Override // be.m
    @k
    public String getKey() {
        return this.f8552g;
    }

    @Override // be.f, be.k
    @k
    public View getTarget() {
        return this.f8548c;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ g(android.content.Context r8, android.view.View r9, kotlin.Triple r10, int r11, kotlin.Pair r12, java.lang.String r13, int r14, kotlin.jvm.internal.v r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            if (r0 == 0) goto L20
            kotlin.Triple r0 = new kotlin.Triple
            r2 = 2131558815(0x7f0d019f, float:1.8742956E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2131362888(0x7f0a0448, float:1.834557E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2131361919(0x7f0a007f, float:1.8343604E38)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.<init>(r2, r3, r4)
            r3 = r0
            goto L21
        L20:
            r3 = r10
        L21:
            r0 = r14 & 8
            if (r0 == 0) goto L2d
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = xb.f.a(r8, r0)
            r4 = r0
            goto L2e
        L2d:
            r4 = r11
        L2e:
            r0 = r14 & 16
            if (r0 == 0) goto L4d
            kotlin.Pair r0 = new kotlin.Pair
            r2 = 1098907648(0x41800000, float:16.0)
            int r2 = xb.f.a(r8, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r5 = 1094713344(0x41400000, float:12.0)
            int r5 = xb.f.a(r8, r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.<init>(r2, r5)
            r5 = r0
            goto L4e
        L4d:
            r5 = r12
        L4e:
            r0 = r14 & 32
            if (r0 == 0) goto L59
            java.lang.String r0 = "global.ocr_words_parsing_guide"
            r6 = r0
            r1 = r8
            r2 = r9
            r0 = r7
            goto L5d
        L59:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
        L5d:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.g.<init>(android.content.Context, android.view.View, kotlin.Triple, int, kotlin.Pair, java.lang.String, int, kotlin.jvm.internal.v):void");
    }
}
