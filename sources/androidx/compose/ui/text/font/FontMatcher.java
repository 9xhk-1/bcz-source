package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontWeight;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nFontMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n104#1,39:194\n104#1,39:243\n110#1,33:292\n110#1,33:335\n230#2,3:173\n34#2,6:176\n233#2:182\n230#2,3:183\n34#2,6:186\n233#2:192\n230#2,3:233\n34#2,6:236\n233#2:242\n230#2,3:282\n34#2,6:285\n233#2:291\n230#2,3:325\n34#2,6:328\n233#2:334\n230#2,3:368\n34#2,6:371\n233#2:377\n230#2,3:378\n34#2,6:381\n233#2:387\n230#2,3:388\n34#2,6:391\n233#2:397\n1#3:193\n*S KotlinDebug\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n*L\n65#1:194,39\n72#1:243,39\n82#1:292,33\n89#1:335,33\n46#1:173,3\n46#1:176,6\n46#1:182\n55#1:183,3\n55#1:186,6\n55#1:192\n65#1:233,3\n65#1:236,6\n65#1:242\n72#1:282,3\n72#1:285,6\n72#1:291\n82#1:325,3\n82#1:328,6\n82#1:334\n89#1:368,3\n89#1:371,6\n89#1:377\n142#1:378,3\n142#1:381,6\n142#1:387\n142#1:388,3\n142#1:391,6\n142#1:397\n*E\n"})
/* loaded from: classes2.dex */
public final class FontMatcher {
    public static final int $stable = 0;

    public static /* synthetic */ List filterByClosestWeight$ui_text_release$default(FontMatcher fontMatcher, List list, FontWeight fontWeight, boolean z11, FontWeight fontWeight2, FontWeight fontWeight3, int i11, Object obj) {
        FontWeight fontWeight4 = null;
        if ((i11 & 4) != 0) {
            fontWeight2 = null;
        }
        if ((i11 & 8) != 0) {
            fontWeight3 = null;
        }
        int size = list.size();
        int i12 = 0;
        FontWeight fontWeight5 = null;
        while (true) {
            if (i12 >= size) {
                break;
            }
            FontWeight weight = ((Font) list.get(i12)).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight;
                        fontWeight5 = fontWeight4;
                        break;
                    }
                    if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                } else if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                    fontWeight4 = weight;
                }
            }
            i12++;
        }
        if (!z11 ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Object obj2 = list.get(i13);
            if (g0.g(((Font) obj2).getWeight(), fontWeight4)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @k
    public final List<Font> filterByClosestWeight$ui_text_release(@k List<? extends Font> list, @k FontWeight fontWeight, boolean z11, @l FontWeight fontWeight2, @l FontWeight fontWeight3) {
        int size = list.size();
        FontWeight fontWeight4 = null;
        FontWeight fontWeight5 = null;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            FontWeight weight = list.get(i11).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight;
                        fontWeight5 = fontWeight4;
                        break;
                    }
                    if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                } else if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                    fontWeight4 = weight;
                }
            }
            i11++;
        }
        if (!z11 ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Font font = list.get(i12);
            if (g0.g(font.getWeight(), fontWeight4)) {
                arrayList.add(font);
            }
        }
        return arrayList;
    }

    @k
    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m4664matchFontRetOiIg(@k FontFamily fontFamily, @k FontWeight fontWeight, int i11) {
        if (fontFamily instanceof FontListFontFamily) {
            return m4665matchFontRetOiIg((FontListFontFamily) fontFamily, fontWeight, i11);
        }
        throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
    }

    @k
    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m4665matchFontRetOiIg(@k FontListFontFamily fontListFontFamily, @k FontWeight fontWeight, int i11) {
        return m4666matchFontRetOiIg(fontListFontFamily.getFonts(), fontWeight, i11);
    }

    @k
    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<Font> m4666matchFontRetOiIg(@k List<? extends Font> list, @k FontWeight fontWeight, int i11) {
        ArrayList arrayList = new ArrayList(list.size());
        List<? extends Font> list2 = list;
        int size = list2.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Font font = list.get(i13);
            Font font2 = font;
            if (g0.g(font2.getWeight(), fontWeight) && FontStyle.m4670equalsimpl0(font2.mo4623getStyle_LCdwA(), i11)) {
                arrayList.add(font);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list2.size();
        for (int i14 = 0; i14 < size2; i14++) {
            Font font3 = list.get(i14);
            if (FontStyle.m4670equalsimpl0(font3.mo4623getStyle_LCdwA(), i11)) {
                arrayList2.add(font3);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        List<? extends Font> list3 = list;
        FontWeight.Companion companion = FontWeight.Companion;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(companion.getW400()) < 0) {
            List<? extends Font> list4 = list3;
            int size3 = list4.size();
            FontWeight fontWeight3 = null;
            int i15 = 0;
            while (true) {
                if (i15 >= size3) {
                    break;
                }
                FontWeight weight = list3.get(i15).getWeight();
                if (weight.compareTo(fontWeight) < 0) {
                    if (fontWeight2 == null || weight.compareTo(fontWeight2) > 0) {
                        fontWeight2 = weight;
                    }
                } else {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight2 = weight;
                        fontWeight3 = fontWeight2;
                        break;
                    }
                    if (fontWeight3 == null || weight.compareTo(fontWeight3) < 0) {
                        fontWeight3 = weight;
                    }
                }
                i15++;
            }
            if (fontWeight2 == null) {
                fontWeight2 = fontWeight3;
            }
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size4 = list4.size();
            while (i12 < size4) {
                Font font4 = list3.get(i12);
                if (g0.g(font4.getWeight(), fontWeight2)) {
                    arrayList3.add(font4);
                }
                i12++;
            }
            return arrayList3;
        }
        if (fontWeight.compareTo(companion.getW500()) > 0) {
            List<? extends Font> list5 = list3;
            int size5 = list5.size();
            FontWeight fontWeight4 = null;
            int i16 = 0;
            while (true) {
                if (i16 >= size5) {
                    break;
                }
                FontWeight weight2 = list3.get(i16).getWeight();
                if (weight2.compareTo(fontWeight) < 0) {
                    if (fontWeight2 == null || weight2.compareTo(fontWeight2) > 0) {
                        fontWeight2 = weight2;
                    }
                } else {
                    if (weight2.compareTo(fontWeight) <= 0) {
                        fontWeight2 = weight2;
                        fontWeight4 = fontWeight2;
                        break;
                    }
                    if (fontWeight4 == null || weight2.compareTo(fontWeight4) < 0) {
                        fontWeight4 = weight2;
                    }
                }
                i16++;
            }
            if (fontWeight4 != null) {
                fontWeight2 = fontWeight4;
            }
            ArrayList arrayList4 = new ArrayList(list3.size());
            int size6 = list5.size();
            while (i12 < size6) {
                Font font5 = list3.get(i12);
                if (g0.g(font5.getWeight(), fontWeight2)) {
                    arrayList4.add(font5);
                }
                i12++;
            }
            return arrayList4;
        }
        FontWeight w500 = companion.getW500();
        List<? extends Font> list6 = list3;
        int size7 = list6.size();
        FontWeight fontWeight5 = null;
        FontWeight fontWeight6 = null;
        int i17 = 0;
        while (true) {
            if (i17 >= size7) {
                break;
            }
            FontWeight weight3 = list3.get(i17).getWeight();
            if (w500 == null || weight3.compareTo(w500) <= 0) {
                if (weight3.compareTo(fontWeight) < 0) {
                    if (fontWeight5 == null || weight3.compareTo(fontWeight5) > 0) {
                        fontWeight5 = weight3;
                    }
                } else {
                    if (weight3.compareTo(fontWeight) <= 0) {
                        fontWeight5 = weight3;
                        fontWeight6 = fontWeight5;
                        break;
                    }
                    if (fontWeight6 == null || weight3.compareTo(fontWeight6) < 0) {
                        fontWeight6 = weight3;
                    }
                }
            }
            i17++;
        }
        if (fontWeight6 != null) {
            fontWeight5 = fontWeight6;
        }
        ArrayList arrayList5 = new ArrayList(list3.size());
        int size8 = list6.size();
        for (int i18 = 0; i18 < size8; i18++) {
            Font font6 = list3.get(i18);
            if (g0.g(font6.getWeight(), fontWeight5)) {
                arrayList5.add(font6);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        FontWeight w5002 = FontWeight.Companion.getW500();
        int size9 = list6.size();
        FontWeight fontWeight7 = null;
        int i19 = 0;
        while (true) {
            if (i19 >= size9) {
                break;
            }
            FontWeight weight4 = list3.get(i19).getWeight();
            if (w5002 == null || weight4.compareTo(w5002) >= 0) {
                if (weight4.compareTo(fontWeight) < 0) {
                    if (fontWeight2 == null || weight4.compareTo(fontWeight2) > 0) {
                        fontWeight2 = weight4;
                    }
                } else {
                    if (weight4.compareTo(fontWeight) <= 0) {
                        fontWeight2 = weight4;
                        fontWeight7 = fontWeight2;
                        break;
                    }
                    if (fontWeight7 == null || weight4.compareTo(fontWeight7) < 0) {
                        fontWeight7 = weight4;
                    }
                }
            }
            i19++;
        }
        if (fontWeight7 != null) {
            fontWeight2 = fontWeight7;
        }
        ArrayList arrayList6 = new ArrayList(list3.size());
        int size10 = list6.size();
        while (i12 < size10) {
            Font font7 = list3.get(i12);
            if (g0.g(font7.getWeight(), fontWeight2)) {
                arrayList6.add(font7);
            }
            i12++;
        }
        return arrayList6;
    }
}
