package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class AccessibilityNodeProviderCompat {
    public static final int HOST_VIEW_ID = -1;

    @Nullable
    private final Object mProvider;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AccessibilityNodeProviderApi19 extends AccessibilityNodeProvider {
        final AccessibilityNodeProviderCompat mCompat;

        public AccessibilityNodeProviderApi19(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            this.mCompat = accessibilityNodeProviderCompat;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i11) {
            AccessibilityNodeInfoCompat createAccessibilityNodeInfo = this.mCompat.createAccessibilityNodeInfo(i11);
            if (createAccessibilityNodeInfo == null) {
                return null;
            }
            return createAccessibilityNodeInfo.unwrap();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i11) {
            List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText = this.mCompat.findAccessibilityNodeInfosByText(str, i11);
            if (findAccessibilityNodeInfosByText == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = findAccessibilityNodeInfosByText.size();
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.add(findAccessibilityNodeInfosByText.get(i12).unwrap());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i11) {
            AccessibilityNodeInfoCompat findFocus = this.mCompat.findFocus(i11);
            if (findFocus == null) {
                return null;
            }
            return findFocus.unwrap();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i11, int i12, Bundle bundle) {
            return this.mCompat.performAction(i11, i12, bundle);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(26)
    public static class AccessibilityNodeProviderApi26 extends AccessibilityNodeProviderApi19 {
        public AccessibilityNodeProviderApi26(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            super(accessibilityNodeProviderCompat);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i11, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.mCompat.addExtraDataToAccessibilityNodeInfo(i11, AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo), str, bundle);
        }
    }

    public AccessibilityNodeProviderCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mProvider = new AccessibilityNodeProviderApi26(this);
        } else {
            this.mProvider = new AccessibilityNodeProviderApi19(this);
        }
    }

    @Nullable
    public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i11) {
        return null;
    }

    @Nullable
    public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(@NonNull String str, int i11) {
        return null;
    }

    @Nullable
    public AccessibilityNodeInfoCompat findFocus(int i11) {
        return null;
    }

    @Nullable
    public Object getProvider() {
        return this.mProvider;
    }

    public boolean performAction(int i11, int i12, @Nullable Bundle bundle) {
        return false;
    }

    public AccessibilityNodeProviderCompat(@Nullable Object obj) {
        this.mProvider = obj;
    }

    public void addExtraDataToAccessibilityNodeInfo(int i11, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, @NonNull String str, @Nullable Bundle bundle) {
    }
}
