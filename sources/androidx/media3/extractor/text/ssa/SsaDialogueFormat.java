package androidx.media3.extractor.text.ssa;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.text.ttml.TtmlNode;
import ho.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class SsaDialogueFormat {
    public final int endTimeIndex;
    public final int length;
    public final int startTimeIndex;
    public final int styleIndex;
    public final int textIndex;

    private SsaDialogueFormat(int i11, int i12, int i13, int i14, int i15) {
        this.startTimeIndex = i11;
        this.endTimeIndex = i12;
        this.styleIndex = i13;
        this.textIndex = i14;
        this.length = i15;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Nullable
    public static SsaDialogueFormat fromFormatLine(String str) {
        char c11;
        Assertions.checkArgument(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < split.length; i15++) {
            String g11 = c.g(split[i15].trim());
            g11.getClass();
            switch (g11.hashCode()) {
                case 100571:
                    if (g11.equals(TtmlNode.END)) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3556653:
                    if (g11.equals("text")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 109757538:
                    if (g11.equals(TtmlNode.START)) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 109780401:
                    if (g11.equals("style")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                    i12 = i15;
                    break;
                case 1:
                    i14 = i15;
                    break;
                case 2:
                    i11 = i15;
                    break;
                case 3:
                    i13 = i15;
                    break;
            }
        }
        if (i11 == -1 || i12 == -1 || i14 == -1) {
            return null;
        }
        return new SsaDialogueFormat(i11, i12, i13, i14, split.length);
    }
}
