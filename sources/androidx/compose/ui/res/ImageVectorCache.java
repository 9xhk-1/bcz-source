package androidx.compose.ui.res;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.vector.ImageVector;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ImageVectorCache {
    public static final int $stable = 8;

    @k
    private final HashMap<Key, WeakReference<ImageVectorEntry>> map = new HashMap<>();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    public static final class ImageVectorEntry {
        public static final int $stable = 0;
        private final int configFlags;

        @k
        private final ImageVector imageVector;

        public ImageVectorEntry(@k ImageVector imageVector, int i11) {
            this.imageVector = imageVector;
            this.configFlags = i11;
        }

        public static /* synthetic */ ImageVectorEntry copy$default(ImageVectorEntry imageVectorEntry, ImageVector imageVector, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                imageVector = imageVectorEntry.imageVector;
            }
            if ((i12 & 2) != 0) {
                i11 = imageVectorEntry.configFlags;
            }
            return imageVectorEntry.copy(imageVector, i11);
        }

        @k
        public final ImageVector component1() {
            return this.imageVector;
        }

        public final int component2() {
            return this.configFlags;
        }

        @k
        public final ImageVectorEntry copy(@k ImageVector imageVector, int i11) {
            return new ImageVectorEntry(imageVector, i11);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageVectorEntry)) {
                return false;
            }
            ImageVectorEntry imageVectorEntry = (ImageVectorEntry) obj;
            return g0.g(this.imageVector, imageVectorEntry.imageVector) && this.configFlags == imageVectorEntry.configFlags;
        }

        public final int getConfigFlags() {
            return this.configFlags;
        }

        @k
        public final ImageVector getImageVector() {
            return this.imageVector;
        }

        public int hashCode() {
            return (this.imageVector.hashCode() * 31) + Integer.hashCode(this.configFlags);
        }

        @k
        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.imageVector + ", configFlags=" + this.configFlags + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    public static final class Key {
        public static final int $stable = 8;

        /* renamed from: id, reason: collision with root package name */
        private final int f4224id;

        @k
        private final Resources.Theme theme;

        public Key(@k Resources.Theme theme, int i11) {
            this.theme = theme;
            this.f4224id = i11;
        }

        public static /* synthetic */ Key copy$default(Key key, Resources.Theme theme, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                theme = key.theme;
            }
            if ((i12 & 2) != 0) {
                i11 = key.f4224id;
            }
            return key.copy(theme, i11);
        }

        @k
        public final Resources.Theme component1() {
            return this.theme;
        }

        public final int component2() {
            return this.f4224id;
        }

        @k
        public final Key copy(@k Resources.Theme theme, int i11) {
            return new Key(theme, i11);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return g0.g(this.theme, key.theme) && this.f4224id == key.f4224id;
        }

        public final int getId() {
            return this.f4224id;
        }

        @k
        public final Resources.Theme getTheme() {
            return this.theme;
        }

        public int hashCode() {
            return (this.theme.hashCode() * 31) + Integer.hashCode(this.f4224id);
        }

        @k
        public String toString() {
            return "Key(theme=" + this.theme + ", id=" + this.f4224id + ')';
        }
    }

    public final void clear() {
        this.map.clear();
    }

    @l
    public final ImageVectorEntry get(@k Key key) {
        WeakReference<ImageVectorEntry> weakReference = this.map.get(key);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final void prune(int i11) {
        Iterator<Map.Entry<Key, WeakReference<ImageVectorEntry>>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            ImageVectorEntry imageVectorEntry = it.next().getValue().get();
            if (imageVectorEntry == null || Configuration.needNewResources(i11, imageVectorEntry.getConfigFlags())) {
                it.remove();
            }
        }
    }

    public final void set(@k Key key, @k ImageVectorEntry imageVectorEntry) {
        this.map.put(key, new WeakReference<>(imageVectorEntry));
    }
}
