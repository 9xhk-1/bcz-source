package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.TextUnit;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nPlaceholder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeholder.kt\nandroidx/compose/ui/text/Placeholder\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,139:1\n247#2:140\n247#2:149\n114#3,8:141\n114#3,8:150\n*S KotlinDebug\n*F\n+ 1 Placeholder.kt\nandroidx/compose/ui/text/Placeholder\n*L\n44#1:140\n45#1:149\n44#1:141,8\n45#1:150,8\n*E\n"})
/* loaded from: classes2.dex */
public final class Placeholder {
    public static final int $stable = 0;
    private final long height;
    private final int placeholderVerticalAlign;
    private final long width;

    public /* synthetic */ Placeholder(long j11, long j12, int i11, v vVar) {
        this(j11, j12, i11);
    }

    /* renamed from: copy-K8Q-__8$default, reason: not valid java name */
    public static /* synthetic */ Placeholder m4458copyK8Q__8$default(Placeholder placeholder, long j11, long j12, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = placeholder.width;
        }
        long j13 = j11;
        if ((i12 & 2) != 0) {
            j12 = placeholder.height;
        }
        long j14 = j12;
        if ((i12 & 4) != 0) {
            i11 = placeholder.placeholderVerticalAlign;
        }
        return placeholder.m4459copyK8Q__8(j13, j14, i11);
    }

    @k
    /* renamed from: copy-K8Q-__8, reason: not valid java name */
    public final Placeholder m4459copyK8Q__8(long j11, long j12, int i11) {
        return new Placeholder(j11, j12, i11, null);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        return TextUnit.m5306equalsimpl0(this.width, placeholder.width) && TextUnit.m5306equalsimpl0(this.height, placeholder.height) && PlaceholderVerticalAlign.m4466equalsimpl0(this.placeholderVerticalAlign, placeholder.placeholderVerticalAlign);
    }

    /* renamed from: getHeight-XSAIIZE, reason: not valid java name */
    public final long m4460getHeightXSAIIZE() {
        return this.height;
    }

    /* renamed from: getPlaceholderVerticalAlign-J6kI3mc, reason: not valid java name */
    public final int m4461getPlaceholderVerticalAlignJ6kI3mc() {
        return this.placeholderVerticalAlign;
    }

    /* renamed from: getWidth-XSAIIZE, reason: not valid java name */
    public final long m4462getWidthXSAIIZE() {
        return this.width;
    }

    public int hashCode() {
        return (((TextUnit.m5310hashCodeimpl(this.width) * 31) + TextUnit.m5310hashCodeimpl(this.height)) * 31) + PlaceholderVerticalAlign.m4467hashCodeimpl(this.placeholderVerticalAlign);
    }

    @k
    public String toString() {
        return "Placeholder(width=" + ((Object) TextUnit.m5316toStringimpl(this.width)) + ", height=" + ((Object) TextUnit.m5316toStringimpl(this.height)) + ", placeholderVerticalAlign=" + ((Object) PlaceholderVerticalAlign.m4468toStringimpl(this.placeholderVerticalAlign)) + ')';
    }

    private Placeholder(long j11, long j12, int i11) {
        this.width = j11;
        this.height = j12;
        this.placeholderVerticalAlign = i11;
        if (TextUnit.m5307getRawTypeimpl(j11) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("width cannot be TextUnit.Unspecified");
        }
        if (TextUnit.m5307getRawTypeimpl(j12) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("height cannot be TextUnit.Unspecified");
        }
    }
}
