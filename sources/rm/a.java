package rm;

import android.content.res.Resources;
import android.graphics.Color;
import com.jiongji.andriod.card.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f84248a = 1122867;

    /* renamed from: b, reason: collision with root package name */
    public static final int f84249b = 1122868;

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f84250c = {Color.rgb(207, R.styleable.Theme_drawable_walk_sound4, R.styleable.Theme_drawable_walk_sound2), Color.rgb(148, 212, 212), Color.rgb(136, 180, 187), Color.rgb(118, 174, 175), Color.rgb(42, 109, 130)};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f84251d = {Color.rgb(217, 80, 138), Color.rgb(254, 149, 7), Color.rgb(254, R.styleable.Theme_drawable_walk_sound3, 120), Color.rgb(106, 167, 134), Color.rgb(53, 194, 209)};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f84252e = {Color.rgb(64, 89, 128), Color.rgb(149, 165, 124), Color.rgb(217, 184, 162), Color.rgb(191, 134, 134), Color.rgb(179, 48, 80)};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f84253f = {Color.rgb(193, 37, 82), Color.rgb(255, 102, 0), Color.rgb(R.styleable.Theme_drawable_walk_sound1, 199, 0), Color.rgb(106, 150, 31), Color.rgb(179, 100, 53)};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f84254g = {Color.rgb(192, 255, 140), Color.rgb(255, R.styleable.Theme_drawable_walk_sound3, 140), Color.rgb(255, 208, 140), Color.rgb(140, R.styleable.Theme_drawable_tab_lecture_new, 255), Color.rgb(255, 140, 157)};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f84255h = {e("#2ecc71"), e("#f1c40f"), e("#e74c3c"), e("#3498db")};

    public static int a(int i11, int i12) {
        return (i11 & 16777215) | ((i12 & 255) << 24);
    }

    public static List<Integer> b(Resources resources, int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i11 : iArr) {
            arrayList.add(Integer.valueOf(resources.getColor(i11)));
        }
        return arrayList;
    }

    public static List<Integer> c(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i11 : iArr) {
            arrayList.add(Integer.valueOf(i11));
        }
        return arrayList;
    }

    public static int d() {
        return Color.rgb(51, 181, R.styleable.Theme_drawable_syncview_update);
    }

    public static int e(String str) {
        int parseLong = (int) Long.parseLong(str.replace("#", ""), 16);
        return Color.rgb((parseLong >> 16) & 255, (parseLong >> 8) & 255, parseLong & 255);
    }
}
