package androidx.compose.ui.tooling.data;

import kotlin.jvm.internal.v;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class Parameter {

    @l
    private final String inlineClass;
    private final int sortedIndex;

    public Parameter(int i11, @l String str) {
        this.sortedIndex = i11;
        this.inlineClass = str;
    }

    @l
    public final String getInlineClass() {
        return this.inlineClass;
    }

    public final int getSortedIndex() {
        return this.sortedIndex;
    }

    public /* synthetic */ Parameter(int i11, String str, int i12, v vVar) {
        this(i11, (i12 & 2) != 0 ? null : str);
    }
}
