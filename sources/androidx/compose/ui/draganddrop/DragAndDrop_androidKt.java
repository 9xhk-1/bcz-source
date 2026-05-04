package androidx.compose.ui.draganddrop;

import a00.v1;
import a00.w1;
import android.content.ClipDescription;
import android.view.DragEvent;
import androidx.compose.ui.geometry.Offset;
import java.util.Set;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDragAndDrop.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragAndDrop.android.kt\nandroidx/compose/ui/draganddrop/DragAndDrop_androidKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,66:1\n30#2:67\n53#3,3:68\n*S KotlinDebug\n*F\n+ 1 DragAndDrop.android.kt\nandroidx/compose/ui/draganddrop/DragAndDrop_androidKt\n*L\n65#1:67\n65#1:68,3\n*E\n"})
/* loaded from: classes.dex */
public final class DragAndDrop_androidKt {
    public static final long getPositionInRoot(@k DragAndDropEvent dragAndDropEvent) {
        float x11 = dragAndDropEvent.getDragEvent$ui_release().getX();
        float y11 = dragAndDropEvent.getDragEvent$ui_release().getY();
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(x11) << 32) | (Float.floatToRawIntBits(y11) & 4294967295L));
    }

    @k
    public static final Set<String> mimeTypes(@k DragAndDropEvent dragAndDropEvent) {
        ClipDescription clipDescription = dragAndDropEvent.getDragEvent$ui_release().getClipDescription();
        if (clipDescription == null) {
            return w1.k();
        }
        Set e11 = v1.e(clipDescription.getMimeTypeCount());
        int mimeTypeCount = clipDescription.getMimeTypeCount();
        for (int i11 = 0; i11 < mimeTypeCount; i11++) {
            e11.add(clipDescription.getMimeType(i11));
        }
        return v1.a(e11);
    }

    @k
    public static final DragEvent toAndroidDragEvent(@k DragAndDropEvent dragAndDropEvent) {
        return dragAndDropEvent.getDragEvent$ui_release();
    }
}
