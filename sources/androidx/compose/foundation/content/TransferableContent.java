package androidx.compose.foundation.content;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ClipEntry;
import androidx.compose.ui.platform.ClipMetadata;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
/* loaded from: classes.dex */
public final class TransferableContent {
    public static final int $stable = 8;

    @k
    private final ClipEntry clipEntry;

    @k
    private final ClipMetadata clipMetadata;

    @l
    private final PlatformTransferableContent platformTransferableContent;
    private final int source;

    public /* synthetic */ TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i11, PlatformTransferableContent platformTransferableContent, v vVar) {
        this(clipEntry, clipMetadata, i11, platformTransferableContent);
    }

    @k
    public final ClipEntry getClipEntry() {
        return this.clipEntry;
    }

    @k
    public final ClipMetadata getClipMetadata() {
        return this.clipMetadata;
    }

    @l
    public final PlatformTransferableContent getPlatformTransferableContent() {
        return this.platformTransferableContent;
    }

    /* renamed from: getSource-kB6V9T0, reason: not valid java name */
    public final int m328getSourcekB6V9T0() {
        return this.source;
    }

    private TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i11, PlatformTransferableContent platformTransferableContent) {
        this.clipEntry = clipEntry;
        this.clipMetadata = clipMetadata;
        this.source = i11;
        this.platformTransferableContent = platformTransferableContent;
    }

    public /* synthetic */ TransferableContent(ClipEntry clipEntry, ClipMetadata clipMetadata, int i11, PlatformTransferableContent platformTransferableContent, int i12, v vVar) {
        this(clipEntry, clipMetadata, i11, (i12 & 8) != 0 ? null : platformTransferableContent, null);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @h
    @ExperimentalFoundationApi
    public static final class Source {
        private final int value;

        @k
        public static final Companion Companion = new Companion(null);
        private static final int Keyboard = m330constructorimpl(0);
        private static final int DragAndDrop = m330constructorimpl(1);
        private static final int Clipboard = m330constructorimpl(2);

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Companion {
            public /* synthetic */ Companion(v vVar) {
                this();
            }

            /* renamed from: getClipboard-kB6V9T0, reason: not valid java name */
            public final int m336getClipboardkB6V9T0() {
                return Source.Clipboard;
            }

            /* renamed from: getDragAndDrop-kB6V9T0, reason: not valid java name */
            public final int m337getDragAndDropkB6V9T0() {
                return Source.DragAndDrop;
            }

            /* renamed from: getKeyboard-kB6V9T0, reason: not valid java name */
            public final int m338getKeyboardkB6V9T0() {
                return Source.Keyboard;
            }

            private Companion() {
            }
        }

        private /* synthetic */ Source(int i11) {
            this.value = i11;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Source m329boximpl(int i11) {
            return new Source(i11);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m331equalsimpl(int i11, Object obj) {
            return (obj instanceof Source) && i11 == ((Source) obj).m335unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m332equalsimpl0(int i11, int i12) {
            return i11 == i12;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m333hashCodeimpl(int i11) {
            return Integer.hashCode(i11);
        }

        @k
        /* renamed from: toString-impl, reason: not valid java name */
        public static String m334toStringimpl(int i11) {
            if (m332equalsimpl0(i11, Keyboard)) {
                return "Source.Keyboard";
            }
            if (m332equalsimpl0(i11, DragAndDrop)) {
                return "Source.DragAndDrop";
            }
            if (m332equalsimpl0(i11, Clipboard)) {
                return "Source.Clipboard";
            }
            return "Invalid (" + i11 + ')';
        }

        public boolean equals(Object obj) {
            return m331equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m333hashCodeimpl(this.value);
        }

        @k
        public String toString() {
            return m334toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m335unboximpl() {
            return this.value;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m330constructorimpl(int i11) {
            return i11;
        }
    }
}
