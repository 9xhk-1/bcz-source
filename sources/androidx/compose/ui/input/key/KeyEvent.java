package androidx.compose.ui.input.key;

import kotlin.jvm.internal.g0;
import m80.k;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@h
/* loaded from: classes.dex */
public final class KeyEvent {

    @k
    private final android.view.KeyEvent nativeKeyEvent;

    private /* synthetic */ KeyEvent(android.view.KeyEvent keyEvent) {
        this.nativeKeyEvent = keyEvent;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ KeyEvent m3571boximpl(android.view.KeyEvent keyEvent) {
        return new KeyEvent(keyEvent);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3573equalsimpl(android.view.KeyEvent keyEvent, Object obj) {
        return (obj instanceof KeyEvent) && g0.g(keyEvent, ((KeyEvent) obj).m3577unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3574equalsimpl0(android.view.KeyEvent keyEvent, android.view.KeyEvent keyEvent2) {
        return g0.g(keyEvent, keyEvent2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3575hashCodeimpl(android.view.KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3576toStringimpl(android.view.KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return m3573equalsimpl(this.nativeKeyEvent, obj);
    }

    @k
    public final android.view.KeyEvent getNativeKeyEvent() {
        return this.nativeKeyEvent;
    }

    public int hashCode() {
        return m3575hashCodeimpl(this.nativeKeyEvent);
    }

    public String toString() {
        return m3576toStringimpl(this.nativeKeyEvent);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ android.view.KeyEvent m3577unboximpl() {
        return this.nativeKeyEvent;
    }

    @k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static android.view.KeyEvent m3572constructorimpl(@k android.view.KeyEvent keyEvent) {
        return keyEvent;
    }
}
