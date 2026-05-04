package ce;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Triple;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class j extends be.f {

    /* renamed from: h, reason: collision with root package name */
    public static final int f8569h = 8;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f8570b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final View f8571c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Triple<Integer, Integer, Integer> f8572d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8573e;

    /* renamed from: f, reason: collision with root package name */
    public final int f8574f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f8575g;

    public j(@k Context context, @k View target, @k Triple<Integer, Integer, Integer> guiderViewIds, int i11, int i12, @k String key) {
        g0.p(context, "context");
        g0.p(target, "target");
        g0.p(guiderViewIds, "guiderViewIds");
        g0.p(key, "key");
        this.f8570b = context;
        this.f8571c = target;
        this.f8572d = guiderViewIds;
        this.f8573e = i11;
        this.f8574f = i12;
        this.f8575g = key;
    }

    @Override // be.k
    @k
    public Triple<Integer, Integer, Integer> A() {
        return this.f8572d;
    }

    @Override // be.f, be.k
    public int D() {
        return this.f8574f;
    }

    @Override // be.f, be.k
    public int E() {
        return this.f8573e;
    }

    @Override // be.k
    @k
    public Context getContext() {
        return this.f8570b;
    }

    @Override // be.m
    @k
    public String getKey() {
        return this.f8575g;
    }

    @Override // be.f, be.k
    @k
    public View getTarget() {
        return this.f8571c;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ j(android.content.Context r8, android.view.View r9, kotlin.Triple r10, int r11, int r12, java.lang.String r13, int r14, kotlin.jvm.internal.v r15) {
        /*
            r7 = this;
            r0 = r14 & 4
            if (r0 == 0) goto L20
            kotlin.Triple r0 = new kotlin.Triple
            r2 = 2131558806(0x7f0d0196, float:1.8742938E38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2131362653(0x7f0a035d, float:1.8345093E38)
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
            r2 = 1090519040(0x41000000, float:8.0)
            if (r0 == 0) goto L2d
            int r0 = xb.f.a(r8, r2)
            r4 = r0
            goto L2e
        L2d:
            r4 = r11
        L2e:
            r0 = r14 & 16
            if (r0 == 0) goto L38
            int r0 = xb.f.a(r8, r2)
            r5 = r0
            goto L39
        L38:
            r5 = r12
        L39:
            r0 = r14 & 32
            if (r0 == 0) goto L44
            java.lang.String r0 = "global.word_book_export_guide"
            r6 = r0
            r1 = r8
            r2 = r9
            r0 = r7
            goto L48
        L44:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
        L48:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ce.j.<init>(android.content.Context, android.view.View, kotlin.Triple, int, int, java.lang.String, int, kotlin.jvm.internal.v):void");
    }
}
