package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.IntRange;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class PickVisualMediaRequest {
    private long accentColor;
    private boolean isCustomAccentColorApplied;
    private boolean isOrderedSelection;

    @k
    private ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
    private int maxItems = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity_release();

    @k
    private ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {
        private long accentColor;
        private boolean isCustomAccentColorApplied;
        private boolean isOrderedSelection;

        @k
        private ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType = ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        private int maxItems = ActivityResultContracts.PickMultipleVisualMedia.Companion.getMaxItems$activity_release();

        @k
        private ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab = ActivityResultContracts.PickVisualMedia.DefaultTab.PhotosTab.INSTANCE;

        @k
        public final PickVisualMediaRequest build() {
            PickVisualMediaRequest pickVisualMediaRequest = new PickVisualMediaRequest();
            pickVisualMediaRequest.setMediaType$activity_release(this.mediaType);
            pickVisualMediaRequest.setMaxItems$activity_release(this.maxItems);
            pickVisualMediaRequest.setOrderedSelection$activity_release(this.isOrderedSelection);
            pickVisualMediaRequest.setDefaultTab$activity_release(this.defaultTab);
            pickVisualMediaRequest.setCustomAccentColorApplied$activity_release(this.isCustomAccentColorApplied);
            pickVisualMediaRequest.setAccentColor$activity_release(this.accentColor);
            return pickVisualMediaRequest;
        }

        @k
        public final Builder setAccentColor(long j11) {
            this.accentColor = j11;
            this.isCustomAccentColorApplied = true;
            return this;
        }

        @k
        public final Builder setDefaultTab(@k ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
            g0.p(defaultTab, "defaultTab");
            this.defaultTab = defaultTab;
            return this;
        }

        @k
        public final Builder setMaxItems(@IntRange(from = 2) int i11) {
            this.maxItems = i11;
            return this;
        }

        @k
        public final Builder setMediaType(@k ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType) {
            g0.p(mediaType, "mediaType");
            this.mediaType = mediaType;
            return this;
        }

        @k
        public final Builder setOrderedSelection(boolean z11) {
            this.isOrderedSelection = z11;
            return this;
        }
    }

    public final long getAccentColor() {
        return this.accentColor;
    }

    @k
    public final ActivityResultContracts.PickVisualMedia.DefaultTab getDefaultTab() {
        return this.defaultTab;
    }

    public final int getMaxItems() {
        return this.maxItems;
    }

    @k
    public final ActivityResultContracts.PickVisualMedia.VisualMediaType getMediaType() {
        return this.mediaType;
    }

    public final boolean isCustomAccentColorApplied() {
        return this.isCustomAccentColorApplied;
    }

    public final boolean isOrderedSelection() {
        return this.isOrderedSelection;
    }

    public final void setAccentColor$activity_release(long j11) {
        this.accentColor = j11;
    }

    public final void setCustomAccentColorApplied$activity_release(boolean z11) {
        this.isCustomAccentColorApplied = z11;
    }

    public final void setDefaultTab$activity_release(@k ActivityResultContracts.PickVisualMedia.DefaultTab defaultTab) {
        g0.p(defaultTab, "<set-?>");
        this.defaultTab = defaultTab;
    }

    public final void setMaxItems$activity_release(int i11) {
        this.maxItems = i11;
    }

    public final void setMediaType$activity_release(@k ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType) {
        g0.p(visualMediaType, "<set-?>");
        this.mediaType = visualMediaType;
    }

    public final void setOrderedSelection$activity_release(boolean z11) {
        this.isOrderedSelection = z11;
    }
}
