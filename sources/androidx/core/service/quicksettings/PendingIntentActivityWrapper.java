package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.PendingIntentCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class PendingIntentActivityWrapper {
    private final Context mContext;
    private final int mFlags;

    @NonNull
    private final Intent mIntent;
    private final boolean mIsMutable;

    @Nullable
    private final Bundle mOptions;

    @Nullable
    private final PendingIntent mPendingIntent;
    private final int mRequestCode;

    public PendingIntentActivityWrapper(@NonNull Context context, int i11, @NonNull Intent intent, int i12, boolean z11) {
        this(context, i11, intent, i12, null, z11);
    }

    @Nullable
    private PendingIntent createPendingIntent() {
        Bundle bundle = this.mOptions;
        return bundle == null ? PendingIntentCompat.getActivity(this.mContext, this.mRequestCode, this.mIntent, this.mFlags, this.mIsMutable) : PendingIntentCompat.getActivity(this.mContext, this.mRequestCode, this.mIntent, this.mFlags, bundle, this.mIsMutable);
    }

    @NonNull
    public Context getContext() {
        return this.mContext;
    }

    public int getFlags() {
        return this.mFlags;
    }

    @NonNull
    public Intent getIntent() {
        return this.mIntent;
    }

    @NonNull
    public Bundle getOptions() {
        return this.mOptions;
    }

    @Nullable
    public PendingIntent getPendingIntent() {
        return this.mPendingIntent;
    }

    public int getRequestCode() {
        return this.mRequestCode;
    }

    public boolean isMutable() {
        return this.mIsMutable;
    }

    public PendingIntentActivityWrapper(@NonNull Context context, int i11, @NonNull Intent intent, int i12, @Nullable Bundle bundle, boolean z11) {
        this.mContext = context;
        this.mRequestCode = i11;
        this.mIntent = intent;
        this.mFlags = i12;
        this.mOptions = bundle;
        this.mIsMutable = z11;
        this.mPendingIntent = createPendingIntent();
    }
}
