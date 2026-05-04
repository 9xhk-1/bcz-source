package androidx.camera.extensions;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.camera.extensions.internal.VendorExtender;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
interface VendorExtenderFactory {
    @NonNull
    VendorExtender createVendorExtender(int i11);
}
