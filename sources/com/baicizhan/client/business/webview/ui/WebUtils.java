package com.baicizhan.client.business.webview.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@kotlin.jvm.internal.u0({"SMAP\nWebUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebUtils.kt\ncom/baicizhan/client/business/webview/ui/WebUtils\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,18:1\n11561#2:19\n11896#2,3:20\n774#3:23\n865#3,2:24\n37#4,2:26\n*S KotlinDebug\n*F\n+ 1 WebUtils.kt\ncom/baicizhan/client/business/webview/ui/WebUtils\n*L\n8#1:19\n8#1:20,3\n14#1:23\n14#1:24,2\n14#1:26,2\n*E\n"})
/* loaded from: classes4.dex */
public final class WebUtils {
    public static final int $stable = 0;

    @m80.k
    public static final WebUtils INSTANCE = new WebUtils();

    private WebUtils() {
    }

    @m80.k
    public final String[] generateWebPermission(@m80.k String[] types) {
        kotlin.jvm.internal.g0.p(types, "types");
        ArrayList arrayList = new ArrayList(types.length);
        for (String str : types) {
            arrayList.add(kotlin.jvm.internal.g0.g(str, "android.webkit.resource.AUDIO_CAPTURE") ? "android.permission.RECORD_AUDIO" : kotlin.jvm.internal.g0.g(str, "android.webkit.resource.VIDEO_CAPTURE") ? "android.permission.CAMERA" : "");
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return (String[]) arrayList2.toArray(new String[0]);
    }
}
