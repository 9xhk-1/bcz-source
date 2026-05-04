package com.airbnb.lottie.model.content;

import android.graphics.Paint;
import androidx.annotation.Nullable;
import com.airbnb.lottie.o0;
import d1.b;
import d1.d;
import e1.c;
import java.util.List;
import y0.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class ShapeStroke implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f10024a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final b f10025b;

    /* renamed from: c, reason: collision with root package name */
    public final List<b> f10026c;

    /* renamed from: d, reason: collision with root package name */
    public final d1.a f10027d;

    /* renamed from: e, reason: collision with root package name */
    public final d f10028e;

    /* renamed from: f, reason: collision with root package name */
    public final b f10029f;

    /* renamed from: g, reason: collision with root package name */
    public final LineCapType f10030g;

    /* renamed from: h, reason: collision with root package name */
    public final LineJoinType f10031h;

    /* renamed from: i, reason: collision with root package name */
    public final float f10032i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f10033j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap toPaintCap() {
            int i11 = a.f10034a[ordinal()];
            return i11 != 1 ? i11 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join toPaintJoin() {
            int i11 = a.f10035b[ordinal()];
            if (i11 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i11 == 2) {
                return Paint.Join.MITER;
            }
            if (i11 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10034a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f10035b;

        static {
            int[] iArr = new int[LineJoinType.values().length];
            f10035b = iArr;
            try {
                iArr[LineJoinType.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10035b[LineJoinType.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10035b[LineJoinType.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[LineCapType.values().length];
            f10034a = iArr2;
            try {
                iArr2[LineCapType.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10034a[LineCapType.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10034a[LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ShapeStroke(String str, @Nullable b bVar, List<b> list, d1.a aVar, d dVar, b bVar2, LineCapType lineCapType, LineJoinType lineJoinType, float f11, boolean z11) {
        this.f10024a = str;
        this.f10025b = bVar;
        this.f10026c = list;
        this.f10027d = aVar;
        this.f10028e = dVar;
        this.f10029f = bVar2;
        this.f10030g = lineCapType;
        this.f10031h = lineJoinType;
        this.f10032i = f11;
        this.f10033j = z11;
    }

    @Override // e1.c
    public y0.c a(o0 o0Var, com.airbnb.lottie.model.layer.a aVar) {
        return new u(o0Var, aVar, this);
    }

    public LineCapType b() {
        return this.f10030g;
    }

    public d1.a c() {
        return this.f10027d;
    }

    public b d() {
        return this.f10025b;
    }

    public LineJoinType e() {
        return this.f10031h;
    }

    public List<b> f() {
        return this.f10026c;
    }

    public float g() {
        return this.f10032i;
    }

    public String h() {
        return this.f10024a;
    }

    public d i() {
        return this.f10028e;
    }

    public b j() {
        return this.f10029f;
    }

    public boolean k() {
        return this.f10033j;
    }
}
