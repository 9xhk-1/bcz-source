package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyCommand;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
/* loaded from: classes.dex */
public final class ClipboardKeyCommandsHandler {

    @m80.k
    private final x00.l<KeyCommand, g2> handler;

    private /* synthetic */ ClipboardKeyCommandsHandler(x00.l lVar) {
        this.handler = lVar;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ClipboardKeyCommandsHandler m1220boximpl(x00.l lVar) {
        return new ClipboardKeyCommandsHandler(lVar);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1222equalsimpl(x00.l<? super KeyCommand, ? extends g2> lVar, Object obj) {
        return (obj instanceof ClipboardKeyCommandsHandler) && kotlin.jvm.internal.g0.g(lVar, ((ClipboardKeyCommandsHandler) obj).m1226unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1223equalsimpl0(x00.l<? super KeyCommand, ? extends g2> lVar, x00.l<? super KeyCommand, ? extends g2> lVar2) {
        return kotlin.jvm.internal.g0.g(lVar, lVar2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1224hashCodeimpl(x00.l<? super KeyCommand, ? extends g2> lVar) {
        return lVar.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1225toStringimpl(x00.l<? super KeyCommand, ? extends g2> lVar) {
        return "ClipboardKeyCommandsHandler(handler=" + lVar + ')';
    }

    public boolean equals(Object obj) {
        return m1222equalsimpl(this.handler, obj);
    }

    @m80.k
    public final x00.l<KeyCommand, g2> getHandler() {
        return this.handler;
    }

    public int hashCode() {
        return m1224hashCodeimpl(this.handler);
    }

    public String toString() {
        return m1225toStringimpl(this.handler);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ x00.l m1226unboximpl() {
        return this.handler;
    }

    @m80.k
    /* renamed from: constructor-impl, reason: not valid java name */
    public static x00.l<? super KeyCommand, ? extends g2> m1221constructorimpl(@m80.k x00.l<? super KeyCommand, g2> lVar) {
        return lVar;
    }
}
