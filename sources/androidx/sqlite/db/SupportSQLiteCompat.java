package androidx.sqlite.db;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import w00.o;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class SupportSQLiteCompat {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @n(message = "Kept for ABI compatibility reasons due to b/402796648 even though minSdk is greater than 16.")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class Api16Impl {

        @k
        public static final Api16Impl INSTANCE = new Api16Impl();

        private Api16Impl() {
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final void cancel(@k CancellationSignal cancellationSignal) {
            g0.p(cancellationSignal, "cancellationSignal");
            cancellationSignal.cancel();
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @k
        public static final CancellationSignal createCancellationSignal() {
            return new CancellationSignal();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @n(message = "Kept for ABI compatibility reasons due to b/402796648 even though minSdk is greater than 19.")
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final class Api19Impl {

        @k
        public static final Api19Impl INSTANCE = new Api19Impl();

        private Api19Impl() {
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        @k
        public static final Uri getNotificationUri(@k Cursor cursor) {
            g0.p(cursor, "cursor");
            Uri notificationUri = cursor.getNotificationUri();
            g0.o(notificationUri, "getNotificationUri(...)");
            return notificationUri;
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public static final boolean isLowRamDevice(@k ActivityManager activityManager) {
            g0.p(activityManager, "activityManager");
            return activityManager.isLowRamDevice();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(21)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Api21Impl {

        @k
        public static final Api21Impl INSTANCE = new Api21Impl();

        private Api21Impl() {
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @k
        public static final File getNoBackupFilesDir(@k Context context) {
            g0.p(context, "context");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            g0.o(noBackupFilesDir, "getNoBackupFilesDir(...)");
            return noBackupFilesDir;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(23)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Api23Impl {

        @k
        public static final Api23Impl INSTANCE = new Api23Impl();

        private Api23Impl() {
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setExtras(@k Cursor cursor, @k Bundle extras) {
            g0.p(cursor, "cursor");
            g0.p(extras, "extras");
            cursor.setExtras(extras);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class Api29Impl {

        @k
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        @k
        public static final List<Uri> getNotificationUris(@k Cursor cursor) {
            g0.p(cursor, "cursor");
            List<Uri> notificationUris = cursor.getNotificationUris();
            g0.m(notificationUris);
            return notificationUris;
        }

        @o
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static final void setNotificationUris(@k Cursor cursor, @k ContentResolver cr2, @k List<? extends Uri> uris) {
            g0.p(cursor, "cursor");
            g0.p(cr2, "cr");
            g0.p(uris, "uris");
            cursor.setNotificationUris(cr2, uris);
        }
    }

    private SupportSQLiteCompat() {
    }
}
