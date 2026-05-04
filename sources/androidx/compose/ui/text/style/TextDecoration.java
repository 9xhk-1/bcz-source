package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l50.b;
import m80.k;
import m80.l;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class TextDecoration {
    public static final int $stable = 0;
    private final int mask;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final TextDecoration None = new TextDecoration(0);

    @k
    private static final TextDecoration Underline = new TextDecoration(1);

    @k
    private static final TextDecoration LineThrough = new TextDecoration(2);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTextDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,103:1\n269#2,3:104\n34#2,6:107\n272#2:113\n*S KotlinDebug\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n*L\n51#1:104,3\n51#1:107,6\n51#1:113\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final TextDecoration combine(@k List<TextDecoration> list) {
            Integer num = 0;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                num = Integer.valueOf(num.intValue() | list.get(i11).getMask());
            }
            return new TextDecoration(num.intValue());
        }

        @k
        public final TextDecoration getLineThrough() {
            return TextDecoration.LineThrough;
        }

        @k
        public final TextDecoration getNone() {
            return TextDecoration.None;
        }

        @k
        public final TextDecoration getUnderline() {
            return TextDecoration.Underline;
        }

        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getLineThrough$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        @Stable
        public static /* synthetic */ void getUnderline$annotations() {
        }
    }

    public TextDecoration(int i11) {
        this.mask = i11;
    }

    public final boolean contains(@k TextDecoration textDecoration) {
        int i11 = this.mask;
        return (textDecoration.mask | i11) == i11;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TextDecoration) && this.mask == ((TextDecoration) obj).mask;
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return this.mask;
    }

    @k
    public final TextDecoration plus(@k TextDecoration textDecoration) {
        return new TextDecoration(textDecoration.mask | this.mask);
    }

    @k
    public String toString() {
        if (this.mask == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.mask & Underline.mask) != 0) {
            arrayList.add("Underline");
        }
        if ((this.mask & LineThrough.mask) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + ListUtilsKt.fastJoinToString$default(arrayList, j2.O, null, null, 0, null, null, 62, null) + b.f69930l;
    }
}
