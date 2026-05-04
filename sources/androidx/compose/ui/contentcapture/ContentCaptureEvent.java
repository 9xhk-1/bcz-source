package androidx.compose.ui.contentcapture;

import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ContentCaptureEvent {

    /* renamed from: id, reason: collision with root package name */
    private final int f4140id;

    @l
    private final ViewStructureCompat structureCompat;
    private final long timestamp;

    @m80.k
    private final ContentCaptureEventType type;

    public ContentCaptureEvent(int i11, long j11, @m80.k ContentCaptureEventType contentCaptureEventType, @l ViewStructureCompat viewStructureCompat) {
        this.f4140id = i11;
        this.timestamp = j11;
        this.type = contentCaptureEventType;
        this.structureCompat = viewStructureCompat;
    }

    public static /* synthetic */ ContentCaptureEvent copy$default(ContentCaptureEvent contentCaptureEvent, int i11, long j11, ContentCaptureEventType contentCaptureEventType, ViewStructureCompat viewStructureCompat, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = contentCaptureEvent.f4140id;
        }
        if ((i12 & 2) != 0) {
            j11 = contentCaptureEvent.timestamp;
        }
        if ((i12 & 4) != 0) {
            contentCaptureEventType = contentCaptureEvent.type;
        }
        if ((i12 & 8) != 0) {
            viewStructureCompat = contentCaptureEvent.structureCompat;
        }
        return contentCaptureEvent.copy(i11, j11, contentCaptureEventType, viewStructureCompat);
    }

    public final int component1() {
        return this.f4140id;
    }

    public final long component2() {
        return this.timestamp;
    }

    @m80.k
    public final ContentCaptureEventType component3() {
        return this.type;
    }

    @l
    public final ViewStructureCompat component4() {
        return this.structureCompat;
    }

    @m80.k
    public final ContentCaptureEvent copy(int i11, long j11, @m80.k ContentCaptureEventType contentCaptureEventType, @l ViewStructureCompat viewStructureCompat) {
        return new ContentCaptureEvent(i11, j11, contentCaptureEventType, viewStructureCompat);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentCaptureEvent)) {
            return false;
        }
        ContentCaptureEvent contentCaptureEvent = (ContentCaptureEvent) obj;
        return this.f4140id == contentCaptureEvent.f4140id && this.timestamp == contentCaptureEvent.timestamp && this.type == contentCaptureEvent.type && g0.g(this.structureCompat, contentCaptureEvent.structureCompat);
    }

    public final int getId() {
        return this.f4140id;
    }

    @l
    public final ViewStructureCompat getStructureCompat() {
        return this.structureCompat;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    @m80.k
    public final ContentCaptureEventType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f4140id) * 31) + Long.hashCode(this.timestamp)) * 31) + this.type.hashCode()) * 31;
        ViewStructureCompat viewStructureCompat = this.structureCompat;
        return hashCode + (viewStructureCompat == null ? 0 : viewStructureCompat.hashCode());
    }

    @m80.k
    public String toString() {
        return "ContentCaptureEvent(id=" + this.f4140id + ", timestamp=" + this.timestamp + ", type=" + this.type + ", structureCompat=" + this.structureCompat + ')';
    }
}
