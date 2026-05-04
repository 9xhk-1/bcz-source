package androidx.compose.ui.text.style;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class TextIndent {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final TextIndent None = new TextIndent(0, 0, 3, null);
    private final long firstLine;
    private final long restLine;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final TextIndent getNone() {
            return TextIndent.None;
        }

        private Companion() {
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }
    }

    public /* synthetic */ TextIndent(long j11, long j12, v vVar) {
        this(j11, j12);
    }

    /* renamed from: copy-NB67dxo$default, reason: not valid java name */
    public static /* synthetic */ TextIndent m4999copyNB67dxo$default(TextIndent textIndent, long j11, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = textIndent.firstLine;
        }
        if ((i11 & 2) != 0) {
            j12 = textIndent.restLine;
        }
        return textIndent.m5000copyNB67dxo(j11, j12);
    }

    @k
    /* renamed from: copy-NB67dxo, reason: not valid java name */
    public final TextIndent m5000copyNB67dxo(long j11, long j12) {
        return new TextIndent(j11, j12, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextIndent)) {
            return false;
        }
        TextIndent textIndent = (TextIndent) obj;
        return TextUnit.m5306equalsimpl0(this.firstLine, textIndent.firstLine) && TextUnit.m5306equalsimpl0(this.restLine, textIndent.restLine);
    }

    /* renamed from: getFirstLine-XSAIIZE, reason: not valid java name */
    public final long m5001getFirstLineXSAIIZE() {
        return this.firstLine;
    }

    /* renamed from: getRestLine-XSAIIZE, reason: not valid java name */
    public final long m5002getRestLineXSAIIZE() {
        return this.restLine;
    }

    public int hashCode() {
        return (TextUnit.m5310hashCodeimpl(this.firstLine) * 31) + TextUnit.m5310hashCodeimpl(this.restLine);
    }

    @k
    public String toString() {
        return "TextIndent(firstLine=" + ((Object) TextUnit.m5316toStringimpl(this.firstLine)) + ", restLine=" + ((Object) TextUnit.m5316toStringimpl(this.restLine)) + ')';
    }

    private TextIndent(long j11, long j12) {
        this.firstLine = j11;
        this.restLine = j12;
    }

    public /* synthetic */ TextIndent(long j11, long j12, int i11, v vVar) {
        this((i11 & 1) != 0 ? TextUnitKt.getSp(0) : j11, (i11 & 2) != 0 ? TextUnitKt.getSp(0) : j12, null);
    }
}
