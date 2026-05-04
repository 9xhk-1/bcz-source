package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import w00.h;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class ObservableScopeInvalidator {

    @k
    private final MutableState<g2> state;

    private /* synthetic */ ObservableScopeInvalidator(MutableState mutableState) {
        this.state = mutableState;
    }

    /* renamed from: attachToScope-impl, reason: not valid java name */
    public static final void m905attachToScopeimpl(MutableState<g2> mutableState) {
        mutableState.getValue();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ObservableScopeInvalidator m906boximpl(MutableState mutableState) {
        return new ObservableScopeInvalidator(mutableState);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableState m908constructorimpl$default(MutableState mutableState, int i11, v vVar) {
        if ((i11 & 1) != 0) {
            mutableState = SnapshotStateKt.mutableStateOf(g2.f100423a, SnapshotStateKt.neverEqualPolicy());
        }
        return m907constructorimpl(mutableState);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m909equalsimpl(MutableState<g2> mutableState, Object obj) {
        return (obj instanceof ObservableScopeInvalidator) && g0.g(mutableState, ((ObservableScopeInvalidator) obj).m914unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m910equalsimpl0(MutableState<g2> mutableState, MutableState<g2> mutableState2) {
        return g0.g(mutableState, mutableState2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m911hashCodeimpl(MutableState<g2> mutableState) {
        return mutableState.hashCode();
    }

    /* renamed from: invalidateScope-impl, reason: not valid java name */
    public static final void m912invalidateScopeimpl(MutableState<g2> mutableState) {
        mutableState.setValue(g2.f100423a);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m913toStringimpl(MutableState<g2> mutableState) {
        return "ObservableScopeInvalidator(state=" + mutableState + ')';
    }

    public boolean equals(Object obj) {
        return m909equalsimpl(this.state, obj);
    }

    public int hashCode() {
        return m911hashCodeimpl(this.state);
    }

    public String toString() {
        return m913toStringimpl(this.state);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MutableState m914unboximpl() {
        return this.state;
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static MutableState<g2> m907constructorimpl(@k MutableState<g2> mutableState) {
        return mutableState;
    }
}
