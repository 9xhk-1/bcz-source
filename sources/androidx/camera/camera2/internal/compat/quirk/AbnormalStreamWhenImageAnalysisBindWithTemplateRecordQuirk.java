package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import com.google.android.material.internal.l;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk implements CaptureIntentPreviewQuirk {
    public static boolean isSamsungM55() {
        return l.f31607b.equalsIgnoreCase(Build.BRAND) && Build.MODEL.toLowerCase(Locale.US).startsWith("sm-m556");
    }

    public static boolean load() {
        return isSamsungM55();
    }

    @Override // androidx.camera.camera2.internal.compat.quirk.CaptureIntentPreviewQuirk
    public boolean workaroundByCaptureIntentPreview() {
        return isSamsungM55();
    }
}
