package androidx.media3.datasource.cache;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class CachedContent {
    private static final String TAG = "CachedContent";
    private final TreeSet<SimpleCacheSpan> cachedSpans;

    /* renamed from: id, reason: collision with root package name */
    public final int f4598id;
    public final String key;
    private final ArrayList<Range> lockedRanges;
    private DefaultContentMetadata metadata;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Range {
        public final long length;
        public final long position;

        public Range(long j11, long j12) {
            this.position = j11;
            this.length = j12;
        }

        public boolean contains(long j11, long j12) {
            long j13 = this.length;
            if (j13 == -1) {
                return j11 >= this.position;
            }
            if (j12 == -1) {
                return false;
            }
            long j14 = this.position;
            return j14 <= j11 && j11 + j12 <= j14 + j13;
        }

        public boolean intersects(long j11, long j12) {
            long j13 = this.position;
            if (j13 > j11) {
                return j12 == -1 || j11 + j12 > j13;
            }
            long j14 = this.length;
            return j14 == -1 || j13 + j14 > j11;
        }
    }

    public CachedContent(int i11, String str) {
        this(i11, str, DefaultContentMetadata.EMPTY);
    }

    public void addSpan(SimpleCacheSpan simpleCacheSpan) {
        this.cachedSpans.add(simpleCacheSpan);
    }

    public boolean applyMetadataMutations(ContentMetadataMutations contentMetadataMutations) {
        this.metadata = this.metadata.copyWithMutationsApplied(contentMetadataMutations);
        return !r2.equals(r0);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CachedContent.class == obj.getClass()) {
            CachedContent cachedContent = (CachedContent) obj;
            if (this.f4598id == cachedContent.f4598id && this.key.equals(cachedContent.key) && this.cachedSpans.equals(cachedContent.cachedSpans) && this.metadata.equals(cachedContent.metadata)) {
                return true;
            }
        }
        return false;
    }

    public long getCachedBytesLength(long j11, long j12) {
        Assertions.checkArgument(j11 >= 0);
        Assertions.checkArgument(j12 >= 0);
        SimpleCacheSpan span = getSpan(j11, j12);
        if (span.isHoleSpan()) {
            return -Math.min(span.isOpenEnded() ? Long.MAX_VALUE : span.length, j12);
        }
        long j13 = j11 + j12;
        long j14 = j13 >= 0 ? j13 : Long.MAX_VALUE;
        long j15 = span.position + span.length;
        if (j15 < j14) {
            for (SimpleCacheSpan simpleCacheSpan : this.cachedSpans.tailSet(span, false)) {
                long j16 = simpleCacheSpan.position;
                if (j16 > j15) {
                    break;
                }
                j15 = Math.max(j15, j16 + simpleCacheSpan.length);
                if (j15 >= j14) {
                    break;
                }
            }
        }
        return Math.min(j15 - j11, j12);
    }

    public DefaultContentMetadata getMetadata() {
        return this.metadata;
    }

    public SimpleCacheSpan getSpan(long j11, long j12) {
        SimpleCacheSpan createLookup = SimpleCacheSpan.createLookup(this.key, j11);
        SimpleCacheSpan floor = this.cachedSpans.floor(createLookup);
        if (floor != null && floor.position + floor.length > j11) {
            return floor;
        }
        SimpleCacheSpan ceiling = this.cachedSpans.ceiling(createLookup);
        if (ceiling != null) {
            long j13 = ceiling.position - j11;
            j12 = j12 == -1 ? j13 : Math.min(j13, j12);
        }
        return SimpleCacheSpan.createHole(this.key, j11, j12);
    }

    public TreeSet<SimpleCacheSpan> getSpans() {
        return this.cachedSpans;
    }

    public int hashCode() {
        return (((this.f4598id * 31) + this.key.hashCode()) * 31) + this.metadata.hashCode();
    }

    public boolean isEmpty() {
        return this.cachedSpans.isEmpty();
    }

    public boolean isFullyLocked(long j11, long j12) {
        for (int i11 = 0; i11 < this.lockedRanges.size(); i11++) {
            if (this.lockedRanges.get(i11).contains(j11, j12)) {
                return true;
            }
        }
        return false;
    }

    public boolean isFullyUnlocked() {
        return this.lockedRanges.isEmpty();
    }

    public boolean lockRange(long j11, long j12) {
        for (int i11 = 0; i11 < this.lockedRanges.size(); i11++) {
            if (this.lockedRanges.get(i11).intersects(j11, j12)) {
                return false;
            }
        }
        this.lockedRanges.add(new Range(j11, j12));
        return true;
    }

    public boolean removeSpan(CacheSpan cacheSpan) {
        if (!this.cachedSpans.remove(cacheSpan)) {
            return false;
        }
        File file = cacheSpan.file;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public SimpleCacheSpan setLastTouchTimestamp(SimpleCacheSpan simpleCacheSpan, long j11, boolean z11) {
        long j12;
        Assertions.checkState(this.cachedSpans.remove(simpleCacheSpan));
        File file = (File) Assertions.checkNotNull(simpleCacheSpan.file);
        if (z11) {
            j12 = j11;
            File cacheFile = SimpleCacheSpan.getCacheFile((File) Assertions.checkNotNull(file.getParentFile()), this.f4598id, simpleCacheSpan.position, j12);
            if (file.renameTo(cacheFile)) {
                file = cacheFile;
            } else {
                Log.w(TAG, "Failed to rename " + file + " to " + cacheFile);
            }
        } else {
            j12 = j11;
        }
        SimpleCacheSpan copyWithFileAndLastTouchTimestamp = simpleCacheSpan.copyWithFileAndLastTouchTimestamp(file, j12);
        this.cachedSpans.add(copyWithFileAndLastTouchTimestamp);
        return copyWithFileAndLastTouchTimestamp;
    }

    public void unlockRange(long j11) {
        for (int i11 = 0; i11 < this.lockedRanges.size(); i11++) {
            if (this.lockedRanges.get(i11).position == j11) {
                this.lockedRanges.remove(i11);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public CachedContent(int i11, String str, DefaultContentMetadata defaultContentMetadata) {
        this.f4598id = i11;
        this.key = str;
        this.metadata = defaultContentMetadata;
        this.cachedSpans = new TreeSet<>();
        this.lockedRanges = new ArrayList<>();
    }
}
