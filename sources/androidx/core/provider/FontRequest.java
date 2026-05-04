package androidx.core.provider;

import android.util.Base64;
import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Preconditions;
import com.alipay.sdk.m.u.i;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class FontRequest {
    private final List<List<byte[]>> mCertificates;
    private final int mCertificatesArray;
    private final String mIdentifier;
    private final String mProviderAuthority;
    private final String mProviderPackage;
    private final String mQuery;

    public FontRequest(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<List<byte[]>> list) {
        this.mProviderAuthority = (String) Preconditions.checkNotNull(str);
        this.mProviderPackage = (String) Preconditions.checkNotNull(str2);
        this.mQuery = (String) Preconditions.checkNotNull(str3);
        this.mCertificates = (List) Preconditions.checkNotNull(list);
        this.mCertificatesArray = 0;
        this.mIdentifier = createIdentifier(str, str2, str3);
    }

    private String createIdentifier(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        return str + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str2 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + str3;
    }

    @Nullable
    public List<List<byte[]>> getCertificates() {
        return this.mCertificates;
    }

    @ArrayRes
    public int getCertificatesArrayResId() {
        return this.mCertificatesArray;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public String getId() {
        return this.mIdentifier;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public String getIdentifier() {
        return this.mIdentifier;
    }

    @NonNull
    public String getProviderAuthority() {
        return this.mProviderAuthority;
    }

    @NonNull
    public String getProviderPackage() {
        return this.mProviderPackage;
    }

    @NonNull
    public String getQuery() {
        return this.mQuery;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.mProviderAuthority + ", mProviderPackage: " + this.mProviderPackage + ", mQuery: " + this.mQuery + ", mCertificates:");
        for (int i11 = 0; i11 < this.mCertificates.size(); i11++) {
            sb2.append(" [");
            List<byte[]> list = this.mCertificates.get(i11);
            for (int i12 = 0; i12 < list.size(); i12++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i12), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append(i.f11099d);
        sb2.append("mCertificatesArray: " + this.mCertificatesArray);
        return sb2.toString();
    }

    public FontRequest(@NonNull String str, @NonNull String str2, @NonNull String str3, @ArrayRes int i11) {
        this.mProviderAuthority = (String) Preconditions.checkNotNull(str);
        this.mProviderPackage = (String) Preconditions.checkNotNull(str2);
        this.mQuery = (String) Preconditions.checkNotNull(str3);
        this.mCertificates = null;
        Preconditions.checkArgument(i11 != 0);
        this.mCertificatesArray = i11;
        this.mIdentifier = createIdentifier(str, str2, str3);
    }
}
