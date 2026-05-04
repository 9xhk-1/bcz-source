package androidx.compose.foundation.content;

import androidx.compose.foundation.ExperimentalFoundationApi;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public interface ReceiveContentListener {
    @l
    TransferableContent onReceive(@k TransferableContent transferableContent);

    default void onDragEnd() {
    }

    default void onDragEnter() {
    }

    default void onDragExit() {
    }

    default void onDragStart() {
    }
}
