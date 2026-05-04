package androidx.core.net;

import android.net.Uri;
import androidx.annotation.NonNull;
import r60.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class UriCompat {
    private UriCompat() {
    }

    @NonNull
    public static String toSafeString(@NonNull Uri uri) {
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (scheme != null) {
            if (scheme.equalsIgnoreCase("tel") || scheme.equalsIgnoreCase("sip") || scheme.equalsIgnoreCase("sms") || scheme.equalsIgnoreCase("smsto") || scheme.equalsIgnoreCase("mailto") || scheme.equalsIgnoreCase("nfc")) {
                StringBuilder sb2 = new StringBuilder(64);
                sb2.append(scheme);
                sb2.append(':');
                if (schemeSpecificPart != null) {
                    for (int i11 = 0; i11 < schemeSpecificPart.length(); i11++) {
                        char charAt = schemeSpecificPart.charAt(i11);
                        if (charAt == '-' || charAt == '@' || charAt == '.') {
                            sb2.append(charAt);
                        } else {
                            sb2.append('x');
                        }
                    }
                }
                return sb2.toString();
            }
            if (scheme.equalsIgnoreCase("http") || scheme.equalsIgnoreCase("https") || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(e.f83301a);
                sb3.append(uri.getHost() != null ? uri.getHost() : "");
                sb3.append(uri.getPort() != -1 ? ":" + uri.getPort() : "");
                sb3.append("/...");
                schemeSpecificPart = sb3.toString();
            }
        }
        StringBuilder sb4 = new StringBuilder(64);
        if (scheme != null) {
            sb4.append(scheme);
            sb4.append(':');
        }
        if (schemeSpecificPart != null) {
            sb4.append(schemeSpecificPart);
        }
        return sb4.toString();
    }
}
