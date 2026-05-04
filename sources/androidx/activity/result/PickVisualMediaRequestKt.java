package androidx.activity.result;

import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.IntRange;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import m80.k;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PickVisualMediaRequestKt {
    @n(level = DeprecationLevel.HIDDEN, message = "Superseded by PickVisualMediaRequest that takes an optional maxItems")
    public static final /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType) {
        g0.p(mediaType, "mediaType");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        return PickVisualMediaRequest(visualMediaType);
    }

    @n(level = DeprecationLevel.HIDDEN, message = "Superseded by PickVisualMediaRequest that take optional isOrderedSelection and defaultTab")
    public static final /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType, @IntRange(from = 2) int i11) {
        g0.p(mediaType, "mediaType");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).setMaxItems(i11).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        if ((i12 & 2) != 0) {
            i11 = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity_release();
        }
        return PickVisualMediaRequest(visualMediaType, i11);
    }

    @k
    public static final PickVisualMediaRequest PickVisualMediaRequest(@k ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType, @IntRange(from = 2) int i11, boolean z11, @k ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        g0.p(mediaType, "mediaType");
        g0.p(defaultTab, "defaultTab");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).setMaxItems(i11).setOrderedSelection(z11).setDefaultTab(defaultTab).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i11, boolean z11, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        if ((i12 & 2) != 0) {
            i11 = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity_release();
        }
        if ((i12 & 4) != 0) {
            z11 = false;
        }
        if ((i12 & 8) != 0) {
            defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
        }
        return PickVisualMediaRequest(visualMediaType, i11, z11, defaultTab);
    }

    @k
    public static final PickVisualMediaRequest PickVisualMediaRequest(long j11, @k ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType, @IntRange(from = 2) int i11, boolean z11, @k ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        g0.p(mediaType, "mediaType");
        g0.p(defaultTab, "defaultTab");
        return new PickVisualMediaRequest.Builder().setMediaType(mediaType).setMaxItems(i11).setOrderedSelection(z11).setDefaultTab(defaultTab).setAccentColor(j11).build();
    }

    public static /* synthetic */ PickVisualMediaRequest PickVisualMediaRequest$default(long j11, ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i11, boolean z11, ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            visualMediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType2 = visualMediaType;
        if ((i12 & 4) != 0) {
            i11 = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity_release();
        }
        int i13 = i11;
        if ((i12 & 8) != 0) {
            z11 = false;
        }
        boolean z12 = z11;
        if ((i12 & 16) != 0) {
            defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;
        }
        return PickVisualMediaRequest(j11, visualMediaType2, i13, z12, defaultTab);
    }
}
