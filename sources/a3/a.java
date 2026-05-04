package a3;

import androidx.media3.extractor.text.ttml.TtmlNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f1428a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static final int f1429b = 2;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1430c = 4;

    /* renamed from: d, reason: collision with root package name */
    public static final int f1431d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final int f1432e = 16;

    /* renamed from: f, reason: collision with root package name */
    public static final int f1433f = 10;

    /* renamed from: g, reason: collision with root package name */
    public static final int f1434g = 18;

    /* renamed from: h, reason: collision with root package name */
    public static final int f1435h = 12;

    /* renamed from: i, reason: collision with root package name */
    public static final int f1436i = 20;

    public static final boolean a(int i11) {
        return (i11 & 4) != 0;
    }

    public static final boolean b(int i11) {
        return (i11 & 8) == 0 && (i11 & 16) == 0;
    }

    public static final boolean c(int i11) {
        return (i11 & 2) == 0 && (i11 & 4) == 0;
    }

    public static final boolean d(int i11) {
        return (i11 & 8) != 0;
    }

    public static final boolean e(int i11) {
        return (i11 & 16) != 0;
    }

    public static final boolean f(int i11) {
        return (i11 & 2) != 0;
    }

    public static String g(int i11) {
        y0 y0Var = new y0(13);
        if ((i11 & 2) != 0) {
            y0Var.O("top,");
        } else if ((i11 & 4) != 0) {
            y0Var.O("bottom,");
        } else {
            y0Var.O("center,");
        }
        if ((i11 & 8) != 0) {
            y0Var.O(TtmlNode.LEFT);
        } else if ((i11 & 16) != 0) {
            y0Var.O(TtmlNode.RIGHT);
        } else {
            y0Var.O(TtmlNode.CENTER);
        }
        return y0Var.toString();
    }
}
