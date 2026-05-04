package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface TextToolbar {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        public static void showMenu(@m80.k TextToolbar textToolbar, @m80.k Rect rect, @m80.l x00.a<g2> aVar, @m80.l x00.a<g2> aVar2, @m80.l x00.a<g2> aVar3, @m80.l x00.a<g2> aVar4, @m80.l x00.a<g2> aVar5) {
            TextToolbar.super.showMenu(rect, aVar, aVar2, aVar3, aVar4, aVar5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, x00.a aVar, x00.a aVar2, x00.a aVar3, x00.a aVar4, x00.a aVar5, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        if ((i11 & 4) != 0) {
            aVar2 = null;
        }
        if ((i11 & 8) != 0) {
            aVar3 = null;
        }
        if ((i11 & 16) != 0) {
            aVar4 = null;
        }
        if ((i11 & 32) != 0) {
            aVar5 = null;
        }
        textToolbar.showMenu(rect, aVar, aVar2, aVar3, aVar4, aVar5);
    }

    @m80.k
    TextToolbarStatus getStatus();

    void hide();

    void showMenu(@m80.k Rect rect, @m80.l x00.a<g2> aVar, @m80.l x00.a<g2> aVar2, @m80.l x00.a<g2> aVar3, @m80.l x00.a<g2> aVar4);

    default void showMenu(@m80.k Rect rect, @m80.l x00.a<g2> aVar, @m80.l x00.a<g2> aVar2, @m80.l x00.a<g2> aVar3, @m80.l x00.a<g2> aVar4, @m80.l x00.a<g2> aVar5) {
        showMenu(rect, aVar, aVar2, aVar3, aVar4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void showMenu$default(TextToolbar textToolbar, Rect rect, x00.a aVar, x00.a aVar2, x00.a aVar3, x00.a aVar4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        if ((i11 & 2) != 0) {
            aVar = null;
        }
        if ((i11 & 4) != 0) {
            aVar2 = null;
        }
        if ((i11 & 8) != 0) {
            aVar3 = null;
        }
        if ((i11 & 16) != 0) {
            aVar4 = null;
        }
        textToolbar.showMenu(rect, aVar, aVar2, aVar3, aVar4);
    }
}
