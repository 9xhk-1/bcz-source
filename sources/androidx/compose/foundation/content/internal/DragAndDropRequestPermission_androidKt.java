package androidx.compose.foundation.content.internal;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.draganddrop.DragAndDrop_androidKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.core.view.DragAndDropPermissionsCompat;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class DragAndDropRequestPermission_androidKt {
    private static final boolean containsContentUri(ClipData clipData) {
        int itemCount = clipData.getItemCount();
        for (int i11 = 0; i11 < itemCount; i11++) {
            Uri uri = clipData.getItemAt(i11).getUri();
            if (uri != null && g0.g(uri.getScheme(), "content")) {
                return true;
            }
        }
        return false;
    }

    public static final void dragAndDropRequestPermission(@k DelegatableNode delegatableNode, @k DragAndDropEvent dragAndDropEvent) {
        Activity tryGetActivity;
        if (containsContentUri(DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent).getClipData()) && delegatableNode.getNode().isAttached() && (tryGetActivity = tryGetActivity(DelegatableNode_androidKt.requireView(delegatableNode))) != null) {
            DragAndDropPermissionsCompat.request(tryGetActivity, DragAndDrop_androidKt.toAndroidDragEvent(dragAndDropEvent));
        }
    }

    private static final Activity tryGetActivity(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
