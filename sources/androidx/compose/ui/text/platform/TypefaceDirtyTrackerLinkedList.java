package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class TypefaceDirtyTrackerLinkedList {

    @k
    private final Object initial;

    @l
    private final TypefaceDirtyTrackerLinkedList next;

    @k
    private final State<Object> resolveResult;

    public TypefaceDirtyTrackerLinkedList(@k State<? extends Object> state, @l TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList) {
        this.resolveResult = state;
        this.next = typefaceDirtyTrackerLinkedList;
        this.initial = state.getValue();
    }

    @k
    public final Object getInitial() {
        return this.initial;
    }

    @k
    public final Typeface getTypeface() {
        Object obj = this.initial;
        g0.n(obj, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) obj;
    }

    public final boolean isStaleResolvedFont() {
        if (this.resolveResult.getValue() != this.initial) {
            return true;
        }
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = this.next;
        return typefaceDirtyTrackerLinkedList != null && typefaceDirtyTrackerLinkedList.isStaleResolvedFont();
    }

    public /* synthetic */ TypefaceDirtyTrackerLinkedList(State state, TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList, int i11, v vVar) {
        this(state, (i11 & 2) != 0 ? null : typefaceDirtyTrackerLinkedList);
    }
}
