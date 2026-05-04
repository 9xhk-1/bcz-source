package androidx.core.view;

import android.app.Activity;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class DragAndDropPermissionsCompat {
    private final DragAndDropPermissions mDragAndDropPermissions;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        public static void release(DragAndDropPermissions dragAndDropPermissions) {
            dragAndDropPermissions.release();
        }

        @DoNotInline
        public static DragAndDropPermissions requestDragAndDropPermissions(Activity activity, DragEvent dragEvent) {
            return activity.requestDragAndDropPermissions(dragEvent);
        }
    }

    private DragAndDropPermissionsCompat(DragAndDropPermissions dragAndDropPermissions) {
        this.mDragAndDropPermissions = dragAndDropPermissions;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static DragAndDropPermissionsCompat request(@NonNull Activity activity, @NonNull DragEvent dragEvent) {
        DragAndDropPermissions requestDragAndDropPermissions = Api24Impl.requestDragAndDropPermissions(activity, dragEvent);
        if (requestDragAndDropPermissions != null) {
            return new DragAndDropPermissionsCompat(requestDragAndDropPermissions);
        }
        return null;
    }

    public void release() {
        Api24Impl.release(this.mDragAndDropPermissions);
    }
}
