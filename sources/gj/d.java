package gj;

import android.widget.TextView;
import com.jiongji.andriod.card.R;
import gi.m0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d {
    public static void a(String sentence, String word, TextView target, boolean disableMore, zf.a getBottomSheetLayout) {
        c(sentence, word, target, disableMore, getBottomSheetLayout, pb.a.a().getResources().getColor(R.color.main_blue), true);
    }

    public static void b(String sentence, String word, TextView target, boolean disableMore, zf.a getBottomSheetLayout, int highlightColor) {
        c(sentence, word, target, disableMore, getBottomSheetLayout, highlightColor, true);
    }

    public static void c(String sentence, String word, TextView target, boolean disableMore, zf.a getBottomSheetLayout, int highlightColor, boolean clickable) {
        m0.j j11 = m0.j.m(sentence).e(highlightColor).f(word).j(getBottomSheetLayout);
        if (clickable) {
            j11.c().l();
        }
        if (disableMore) {
            j11.d();
        }
        j11.i(target);
    }

    public static void d(String sentence, String word, TextView target) {
        e(sentence, word, target, true);
    }

    public static void e(String sentence, String word, TextView target, boolean clickable) {
        if (sentence == null) {
            sentence = "内容缺失了";
        }
        m0.j f11 = m0.j.m(sentence).e(-16777216).f(word);
        if (clickable) {
            f11.c().l();
        }
        f11.i(target);
    }
}
