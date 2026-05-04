package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class AdPlaybackState {
    public static final int AD_STATE_AVAILABLE = 1;
    public static final int AD_STATE_ERROR = 4;
    public static final int AD_STATE_PLAYED = 3;
    public static final int AD_STATE_SKIPPED = 2;
    public static final int AD_STATE_UNAVAILABLE = 0;
    public final int adGroupCount;
    private final AdGroup[] adGroups;
    public final long adResumePositionUs;

    @Nullable
    public final Object adsId;
    public final long contentDurationUs;
    public final int removedAdGroupCount;
    public static final AdPlaybackState NONE = new AdPlaybackState(null, new AdGroup[0], 0, C.TIME_UNSET, 0);
    private static final AdGroup REMOVED_AD_GROUP = new AdGroup(0).withAdCount(0);
    private static final String FIELD_AD_GROUPS = Util.intToStringMaxRadix(1);
    private static final String FIELD_AD_RESUME_POSITION_US = Util.intToStringMaxRadix(2);
    private static final String FIELD_CONTENT_DURATION_US = Util.intToStringMaxRadix(3);
    private static final String FIELD_REMOVED_AD_GROUP_COUNT = Util.intToStringMaxRadix(4);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class AdGroup {
        public final long contentResumeOffsetUs;
        public final int count;
        public final long[] durationsUs;
        public final String[] ids;
        public final boolean isPlaceholder;
        public final boolean isServerSideInserted;
        public final MediaItem[] mediaItems;
        public final int originalCount;
        public final int[] states;
        public final long timeUs;

        @Deprecated
        public final Uri[] uris;
        private static final String FIELD_TIME_US = Util.intToStringMaxRadix(0);
        private static final String FIELD_COUNT = Util.intToStringMaxRadix(1);
        private static final String FIELD_URIS = Util.intToStringMaxRadix(2);
        private static final String FIELD_STATES = Util.intToStringMaxRadix(3);
        private static final String FIELD_DURATIONS_US = Util.intToStringMaxRadix(4);
        private static final String FIELD_CONTENT_RESUME_OFFSET_US = Util.intToStringMaxRadix(5);
        private static final String FIELD_IS_SERVER_SIDE_INSERTED = Util.intToStringMaxRadix(6);
        private static final String FIELD_ORIGINAL_COUNT = Util.intToStringMaxRadix(7);

        @VisibleForTesting
        static final String FIELD_MEDIA_ITEMS = Util.intToStringMaxRadix(8);
        static final String FIELD_IDS = Util.intToStringMaxRadix(9);
        static final String FIELD_IS_PLACEHOLDER = Util.intToStringMaxRadix(10);

        @CheckResult
        private static long[] copyDurationsUsWithSpaceForAdCount(long[] jArr, int i11) {
            int length = jArr.length;
            int max = Math.max(i11, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, C.TIME_UNSET);
            return copyOf;
        }

        @CheckResult
        private static int[] copyStatesWithSpaceForAdCount(int[] iArr, int i11) {
            int length = iArr.length;
            int max = Math.max(i11, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        public static AdGroup fromBundle(Bundle bundle) {
            long j11 = bundle.getLong(FIELD_TIME_US);
            int i11 = bundle.getInt(FIELD_COUNT);
            int i12 = bundle.getInt(FIELD_ORIGINAL_COUNT);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_URIS);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(FIELD_MEDIA_ITEMS);
            int[] intArray = bundle.getIntArray(FIELD_STATES);
            long[] longArray = bundle.getLongArray(FIELD_DURATIONS_US);
            long j12 = bundle.getLong(FIELD_CONTENT_RESUME_OFFSET_US);
            boolean z11 = bundle.getBoolean(FIELD_IS_SERVER_SIDE_INSERTED);
            ArrayList<String> stringArrayList = bundle.getStringArrayList(FIELD_IDS);
            boolean z12 = bundle.getBoolean(FIELD_IS_PLACEHOLDER);
            if (intArray == null) {
                intArray = new int[0];
            }
            MediaItem[] mediaItemsFromBundleArrays = getMediaItemsFromBundleArrays(parcelableArrayList2, parcelableArrayList);
            if (longArray == null) {
                longArray = new long[0];
            }
            String[] strArr = new String[0];
            if (stringArrayList != null) {
                strArr = (String[]) stringArrayList.toArray(strArr);
            }
            return new AdGroup(j11, i11, i12, intArray, mediaItemsFromBundleArrays, longArray, j12, z11, strArr, z12);
        }

        private ArrayList<Bundle> getMediaItemsArrayBundles() {
            ArrayList<Bundle> arrayList = new ArrayList<>();
            MediaItem[] mediaItemArr = this.mediaItems;
            int length = mediaItemArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                MediaItem mediaItem = mediaItemArr[i11];
                arrayList.add(mediaItem == null ? null : mediaItem.toBundleIncludeLocalConfiguration());
            }
            return arrayList;
        }

        private static MediaItem[] getMediaItemsFromBundleArrays(@Nullable ArrayList<Bundle> arrayList, @Nullable ArrayList<Uri> arrayList2) {
            int i11 = 0;
            if (arrayList != null) {
                MediaItem[] mediaItemArr = new MediaItem[arrayList.size()];
                while (i11 < arrayList.size()) {
                    Bundle bundle = arrayList.get(i11);
                    mediaItemArr[i11] = bundle == null ? null : MediaItem.fromBundle(bundle);
                    i11++;
                }
                return mediaItemArr;
            }
            if (arrayList2 == null) {
                return new MediaItem[0];
            }
            MediaItem[] mediaItemArr2 = new MediaItem[arrayList2.size()];
            while (i11 < arrayList2.size()) {
                Uri uri = arrayList2.get(i11);
                mediaItemArr2[i11] = uri == null ? null : MediaItem.fromUri(uri);
                i11++;
            }
            return mediaItemArr2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public AdGroup withIsPlaceholder(boolean z11, boolean z12) {
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, z12, this.ids, z11);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && AdGroup.class == obj.getClass()) {
                AdGroup adGroup = (AdGroup) obj;
                if (this.timeUs == adGroup.timeUs && this.count == adGroup.count && this.originalCount == adGroup.originalCount && Arrays.equals(this.mediaItems, adGroup.mediaItems) && Arrays.equals(this.states, adGroup.states) && Arrays.equals(this.durationsUs, adGroup.durationsUs) && this.contentResumeOffsetUs == adGroup.contentResumeOffsetUs && this.isServerSideInserted == adGroup.isServerSideInserted && Arrays.equals(this.ids, adGroup.ids) && this.isPlaceholder == adGroup.isPlaceholder) {
                    return true;
                }
            }
            return false;
        }

        public int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public int getIndexOfAdId(String str) {
            int i11 = 0;
            while (true) {
                String[] strArr = this.ids;
                if (i11 >= strArr.length) {
                    return -1;
                }
                if (Objects.equals(strArr[i11], str)) {
                    return i11;
                }
                i11++;
            }
        }

        public int getNextAdIndexToPlay(@IntRange(from = -1) int i11) {
            int i12;
            int i13 = i11 + 1;
            while (true) {
                int[] iArr = this.states;
                if (i13 >= iArr.length || this.isServerSideInserted || (i12 = iArr[i13]) == 0 || i12 == 1) {
                    break;
                }
                i13++;
            }
            return i13;
        }

        public boolean hasUnplayedAds() {
            if (this.count == -1) {
                return true;
            }
            for (int i11 = 0; i11 < this.count; i11++) {
                int i12 = this.states[i11];
                if (i12 == 0 || i12 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i11 = ((this.count * 31) + this.originalCount) * 31;
            long j11 = this.timeUs;
            int hashCode = (((((((i11 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.mediaItems)) * 31) + Arrays.hashCode(this.states)) * 31) + Arrays.hashCode(this.durationsUs)) * 31;
            long j12 = this.contentResumeOffsetUs;
            return ((((((hashCode + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.isServerSideInserted ? 1 : 0)) * 31) + Arrays.hashCode(this.ids)) * 31) + (this.isPlaceholder ? 1 : 0);
        }

        public boolean isLivePostrollPlaceholder(boolean z11) {
            return this.isServerSideInserted == z11 && isLivePostrollPlaceholder();
        }

        public boolean shouldPlayAdGroup() {
            return this.count == -1 || getFirstAdIndexToPlay() < this.count;
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(FIELD_TIME_US, this.timeUs);
            bundle.putInt(FIELD_COUNT, this.count);
            bundle.putInt(FIELD_ORIGINAL_COUNT, this.originalCount);
            bundle.putParcelableArrayList(FIELD_URIS, new ArrayList<>(Arrays.asList(this.uris)));
            bundle.putParcelableArrayList(FIELD_MEDIA_ITEMS, getMediaItemsArrayBundles());
            bundle.putIntArray(FIELD_STATES, this.states);
            bundle.putLongArray(FIELD_DURATIONS_US, this.durationsUs);
            bundle.putLong(FIELD_CONTENT_RESUME_OFFSET_US, this.contentResumeOffsetUs);
            bundle.putBoolean(FIELD_IS_SERVER_SIDE_INSERTED, this.isServerSideInserted);
            bundle.putStringArrayList(FIELD_IDS, new ArrayList<>(Arrays.asList(this.ids)));
            bundle.putBoolean(FIELD_IS_PLACEHOLDER, this.isPlaceholder);
            return bundle;
        }

        @CheckResult
        public AdGroup withAdCount(int i11) {
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i11);
            long[] copyDurationsUsWithSpaceForAdCount = copyDurationsUsWithSpaceForAdCount(this.durationsUs, i11);
            return new AdGroup(this.timeUs, i11, this.originalCount, copyStatesWithSpaceForAdCount, (MediaItem[]) Arrays.copyOf(this.mediaItems, i11), copyDurationsUsWithSpaceForAdCount, this.contentResumeOffsetUs, this.isServerSideInserted, (String[]) Arrays.copyOf(this.ids, i11), this.isPlaceholder);
        }

        @CheckResult
        public AdGroup withAdDurationsUs(long[] jArr) {
            int length = jArr.length;
            MediaItem[] mediaItemArr = this.mediaItems;
            if (length < mediaItemArr.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, mediaItemArr.length);
            } else if (this.count != -1 && jArr.length > mediaItemArr.length) {
                jArr = Arrays.copyOf(jArr, mediaItemArr.length);
            }
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, jArr, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.isPlaceholder);
        }

        @CheckResult
        public AdGroup withAdId(String str, @IntRange(from = 0) int i11) {
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i11 + 1);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyStatesWithSpaceForAdCount.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, copyStatesWithSpaceForAdCount.length);
            }
            long[] jArr2 = jArr;
            MediaItem[] mediaItemArr = this.mediaItems;
            if (mediaItemArr.length != copyStatesWithSpaceForAdCount.length) {
                mediaItemArr = (MediaItem[]) Arrays.copyOf(mediaItemArr, copyStatesWithSpaceForAdCount.length);
            }
            MediaItem[] mediaItemArr2 = mediaItemArr;
            String[] strArr = this.ids;
            if (strArr.length != copyStatesWithSpaceForAdCount.length) {
                strArr = (String[]) Arrays.copyOf(strArr, copyStatesWithSpaceForAdCount.length);
            }
            String[] strArr2 = strArr;
            strArr2[i11] = str;
            return new AdGroup(this.timeUs, this.count, this.originalCount, copyStatesWithSpaceForAdCount, mediaItemArr2, jArr2, this.contentResumeOffsetUs, this.isServerSideInserted, strArr2, this.isPlaceholder);
        }

        @CheckResult
        public AdGroup withAdMediaItem(MediaItem mediaItem, @IntRange(from = 0) int i11) {
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i11 + 1);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyStatesWithSpaceForAdCount.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, copyStatesWithSpaceForAdCount.length);
            }
            long[] jArr2 = jArr;
            MediaItem[] mediaItemArr = (MediaItem[]) Arrays.copyOf(this.mediaItems, copyStatesWithSpaceForAdCount.length);
            mediaItemArr[i11] = mediaItem;
            copyStatesWithSpaceForAdCount[i11] = 1;
            String[] strArr = this.ids;
            if (strArr.length != copyStatesWithSpaceForAdCount.length) {
                strArr = (String[]) Arrays.copyOf(strArr, copyStatesWithSpaceForAdCount.length);
            }
            return new AdGroup(this.timeUs, this.count, this.originalCount, copyStatesWithSpaceForAdCount, mediaItemArr, jArr2, this.contentResumeOffsetUs, this.isServerSideInserted, strArr, this.isPlaceholder);
        }

        @CheckResult
        public AdGroup withAdState(int i11, @IntRange(from = 0) int i12) {
            int i13 = this.count;
            Assertions.checkArgument(i13 == -1 || i12 < i13);
            int[] copyStatesWithSpaceForAdCount = copyStatesWithSpaceForAdCount(this.states, i12 + 1);
            int i14 = copyStatesWithSpaceForAdCount[i12];
            Assertions.checkArgument(i14 == 0 || i14 == 1 || i14 == i11);
            long[] jArr = this.durationsUs;
            if (jArr.length != copyStatesWithSpaceForAdCount.length) {
                jArr = copyDurationsUsWithSpaceForAdCount(jArr, copyStatesWithSpaceForAdCount.length);
            }
            long[] jArr2 = jArr;
            MediaItem[] mediaItemArr = this.mediaItems;
            if (mediaItemArr.length != copyStatesWithSpaceForAdCount.length) {
                mediaItemArr = (MediaItem[]) Arrays.copyOf(mediaItemArr, copyStatesWithSpaceForAdCount.length);
            }
            MediaItem[] mediaItemArr2 = mediaItemArr;
            String[] strArr = this.ids;
            if (strArr.length != copyStatesWithSpaceForAdCount.length) {
                strArr = (String[]) Arrays.copyOf(strArr, copyStatesWithSpaceForAdCount.length);
            }
            String[] strArr2 = strArr;
            copyStatesWithSpaceForAdCount[i12] = i11;
            return new AdGroup(this.timeUs, this.count, this.originalCount, copyStatesWithSpaceForAdCount, mediaItemArr2, jArr2, this.contentResumeOffsetUs, this.isServerSideInserted, strArr2, this.isPlaceholder);
        }

        @CheckResult
        @Deprecated
        public AdGroup withAdUri(Uri uri, @IntRange(from = 0) int i11) {
            return withAdMediaItem(MediaItem.fromUri(uri), i11);
        }

        @CheckResult
        public AdGroup withAllAdsReset() {
            if (this.count == -1) {
                return this;
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i11 = 0; i11 < length; i11++) {
                int i12 = copyOf[i11];
                if (i12 == 3 || i12 == 2 || i12 == 4) {
                    copyOf[i11] = this.mediaItems[i11] == null ? 0 : 1;
                }
            }
            return new AdGroup(this.timeUs, length, this.originalCount, copyOf, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.isPlaceholder);
        }

        @CheckResult
        public AdGroup withAllAdsSkipped() {
            if (this.count == -1) {
                return new AdGroup(this.timeUs, 0, this.originalCount, new int[0], new MediaItem[0], new long[0], this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.isPlaceholder);
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i11 = 0; i11 < length; i11++) {
                int i12 = copyOf[i11];
                if (i12 == 1 || i12 == 0) {
                    copyOf[i11] = 2;
                }
            }
            return new AdGroup(this.timeUs, length, this.originalCount, copyOf, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.isPlaceholder);
        }

        @CheckResult
        public AdGroup withContentResumeOffsetUs(long j11) {
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, j11, this.isServerSideInserted, this.ids, this.isPlaceholder);
        }

        @CheckResult
        public AdGroup withIsServerSideInserted(boolean z11) {
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, z11, this.ids, this.isPlaceholder);
        }

        public AdGroup withLastAdRemoved() {
            int[] iArr = this.states;
            int length = iArr.length - 1;
            int[] copyOf = Arrays.copyOf(iArr, length);
            MediaItem[] mediaItemArr = (MediaItem[]) Arrays.copyOf(this.mediaItems, length);
            long[] jArr = this.durationsUs;
            if (jArr.length > length) {
                jArr = Arrays.copyOf(jArr, length);
            }
            long[] jArr2 = jArr;
            return new AdGroup(this.timeUs, length, this.originalCount, copyOf, mediaItemArr, jArr2, Util.sum(jArr2), this.isServerSideInserted, (String[]) Arrays.copyOf(this.ids, length), this.isPlaceholder);
        }

        public AdGroup withOriginalAdCount(int i11) {
            return new AdGroup(this.timeUs, this.count, i11, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.isPlaceholder);
        }

        @CheckResult
        public AdGroup withTimeUs(long j11) {
            return new AdGroup(j11, this.count, this.originalCount, this.states, this.mediaItems, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted, this.ids, this.isPlaceholder);
        }

        public AdGroup(long j11) {
            this(j11, -1, -1, new int[0], new MediaItem[0], new long[0], 0L, false, new String[0], false);
        }

        public boolean isLivePostrollPlaceholder() {
            return this.isPlaceholder && this.timeUs == Long.MIN_VALUE && this.count == -1;
        }

        private AdGroup(long j11, int i11, int i12, int[] iArr, MediaItem[] mediaItemArr, long[] jArr, long j12, boolean z11, String[] strArr, boolean z12) {
            int i13 = 0;
            Assertions.checkArgument(iArr.length == mediaItemArr.length);
            this.timeUs = j11;
            this.count = i11;
            this.originalCount = i12;
            this.states = iArr;
            this.mediaItems = mediaItemArr;
            this.durationsUs = jArr;
            this.contentResumeOffsetUs = j12;
            this.isServerSideInserted = z11;
            this.uris = new Uri[mediaItemArr.length];
            while (true) {
                Uri[] uriArr = this.uris;
                if (i13 < uriArr.length) {
                    MediaItem mediaItem = mediaItemArr[i13];
                    uriArr[i13] = mediaItem == null ? null : ((MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration)).uri;
                    i13++;
                } else {
                    this.ids = strArr;
                    this.isPlaceholder = z12;
                    return;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface AdState {
    }

    public AdPlaybackState(Object obj, long... jArr) {
        this(obj, createEmptyAdGroups(jArr), 0L, C.TIME_UNSET, 0);
    }

    private static AdGroup[] createEmptyAdGroups(long[] jArr) {
        int length = jArr.length;
        AdGroup[] adGroupArr = new AdGroup[length];
        for (int i11 = 0; i11 < length; i11++) {
            adGroupArr[i11] = new AdGroup(jArr[i11]);
        }
        return adGroupArr;
    }

    public static AdPlaybackState fromAdPlaybackState(Object obj, AdPlaybackState adPlaybackState) {
        int i11 = adPlaybackState.adGroupCount - adPlaybackState.removedAdGroupCount;
        AdGroup[] adGroupArr = new AdGroup[i11];
        int i12 = 0;
        while (i12 < i11) {
            AdGroup adGroup = adPlaybackState.adGroups[i12];
            long j11 = adGroup.timeUs;
            int i13 = adGroup.count;
            int i14 = adGroup.originalCount;
            int[] iArr = adGroup.states;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            MediaItem[] mediaItemArr = adGroup.mediaItems;
            MediaItem[] mediaItemArr2 = (MediaItem[]) Arrays.copyOf(mediaItemArr, mediaItemArr.length);
            long[] jArr = adGroup.durationsUs;
            adGroupArr[i12] = new AdGroup(j11, i13, i14, copyOf, mediaItemArr2, Arrays.copyOf(jArr, jArr.length), adGroup.contentResumeOffsetUs, adGroup.isServerSideInserted, adGroup.ids, adGroup.isPlaceholder);
            i12++;
            i11 = i11;
        }
        return new AdPlaybackState(obj, adGroupArr, adPlaybackState.adResumePositionUs, adPlaybackState.contentDurationUs, adPlaybackState.removedAdGroupCount);
    }

    public static AdPlaybackState fromBundle(Bundle bundle) {
        AdGroup[] adGroupArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_AD_GROUPS);
        if (parcelableArrayList == null) {
            adGroupArr = new AdGroup[0];
        } else {
            AdGroup[] adGroupArr2 = new AdGroup[parcelableArrayList.size()];
            for (int i11 = 0; i11 < parcelableArrayList.size(); i11++) {
                adGroupArr2[i11] = AdGroup.fromBundle((Bundle) parcelableArrayList.get(i11));
            }
            adGroupArr = adGroupArr2;
        }
        String str = FIELD_AD_RESUME_POSITION_US;
        AdPlaybackState adPlaybackState = NONE;
        return new AdPlaybackState(null, adGroupArr, bundle.getLong(str, adPlaybackState.adResumePositionUs), bundle.getLong(FIELD_CONTENT_DURATION_US, adPlaybackState.contentDurationUs), bundle.getInt(FIELD_REMOVED_AD_GROUP_COUNT, adPlaybackState.removedAdGroupCount));
    }

    private boolean isPositionBeforeAdGroup(long j11, long j12, int i11) {
        if (j11 == Long.MIN_VALUE) {
            return false;
        }
        AdGroup adGroup = getAdGroup(i11);
        long j13 = adGroup.timeUs;
        return j13 == Long.MIN_VALUE ? j12 == C.TIME_UNSET || adGroup.isLivePostrollPlaceholder() || j11 < j12 : j11 < j13;
    }

    public boolean endsWithLivePostrollPlaceHolder() {
        int i11 = this.adGroupCount - 1;
        return i11 >= 0 && isLivePostrollPlaceholder(i11);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AdPlaybackState.class == obj.getClass()) {
            AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
            if (Objects.equals(this.adsId, adPlaybackState.adsId) && this.adGroupCount == adPlaybackState.adGroupCount && this.adResumePositionUs == adPlaybackState.adResumePositionUs && this.contentDurationUs == adPlaybackState.contentDurationUs && this.removedAdGroupCount == adPlaybackState.removedAdGroupCount && Arrays.equals(this.adGroups, adPlaybackState.adGroups)) {
                return true;
            }
        }
        return false;
    }

    public AdGroup getAdGroup(@IntRange(from = 0) int i11) {
        int i12 = this.removedAdGroupCount;
        return i11 < i12 ? REMOVED_AD_GROUP : this.adGroups[i11 - i12];
    }

    public int getAdGroupIndexAfterPositionUs(long j11, long j12) {
        if (j11 != Long.MIN_VALUE && (j12 == C.TIME_UNSET || j11 < j12)) {
            int i11 = this.removedAdGroupCount;
            while (i11 < this.adGroupCount && ((getAdGroup(i11).timeUs != Long.MIN_VALUE && getAdGroup(i11).timeUs <= j11) || !getAdGroup(i11).shouldPlayAdGroup())) {
                i11++;
            }
            if (i11 < this.adGroupCount) {
                return i11;
            }
        }
        return -1;
    }

    public int getAdGroupIndexForPositionUs(long j11, long j12) {
        int i11 = this.adGroupCount - 1;
        int i12 = i11 - (isLivePostrollPlaceholder(i11) ? 1 : 0);
        while (i12 >= 0) {
            long j13 = j11;
            long j14 = j12;
            if (!isPositionBeforeAdGroup(j13, j14, i12)) {
                break;
            }
            i12--;
            j11 = j13;
            j12 = j14;
        }
        if (i12 < 0 || !getAdGroup(i12).hasUnplayedAds()) {
            return -1;
        }
        return i12;
    }

    public int getAdIndexOfAdId(int i11, String str) {
        return getAdGroup(i11).getIndexOfAdId(str);
    }

    public int hashCode() {
        int i11 = this.adGroupCount * 31;
        Object obj = this.adsId;
        return ((((((((i11 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.adResumePositionUs)) * 31) + ((int) this.contentDurationUs)) * 31) + this.removedAdGroupCount) * 31) + Arrays.hashCode(this.adGroups);
    }

    public boolean isAdInErrorState(@IntRange(from = 0) int i11, @IntRange(from = 0) int i12) {
        AdGroup adGroup;
        int i13;
        return i11 < this.adGroupCount && (i13 = (adGroup = getAdGroup(i11)).count) != -1 && i12 < i13 && adGroup.states[i12] == 4;
    }

    public boolean isLivePostrollPlaceholder(int i11) {
        return i11 == this.adGroupCount - 1 && getAdGroup(i11).isLivePostrollPlaceholder();
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (AdGroup adGroup : this.adGroups) {
            arrayList.add(adGroup.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(FIELD_AD_GROUPS, arrayList);
        }
        long j11 = this.adResumePositionUs;
        AdPlaybackState adPlaybackState = NONE;
        if (j11 != adPlaybackState.adResumePositionUs) {
            bundle.putLong(FIELD_AD_RESUME_POSITION_US, j11);
        }
        long j12 = this.contentDurationUs;
        if (j12 != adPlaybackState.contentDurationUs) {
            bundle.putLong(FIELD_CONTENT_DURATION_US, j12);
        }
        int i11 = this.removedAdGroupCount;
        if (i11 != adPlaybackState.removedAdGroupCount) {
            bundle.putInt(FIELD_REMOVED_AD_GROUP_COUNT, i11);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.adsId);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.adResumePositionUs);
        sb2.append(", adGroups=[");
        for (int i11 = 0; i11 < this.adGroups.length; i11++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.adGroups[i11].timeUs);
            sb2.append(", ads=[");
            for (int i12 = 0; i12 < this.adGroups[i11].states.length; i12++) {
                sb2.append("ad(state=");
                int i13 = this.adGroups[i11].states[i12];
                if (i13 == 0) {
                    sb2.append('_');
                } else if (i13 == 1) {
                    sb2.append('R');
                } else if (i13 == 2) {
                    sb2.append('S');
                } else if (i13 == 3) {
                    sb2.append('P');
                } else if (i13 != 4) {
                    sb2.append(s60.d.f88057a);
                } else {
                    sb2.append(PublicSuffixDatabase.f77441i);
                }
                sb2.append(", durationUs=");
                sb2.append(this.adGroups[i11].durationsUs[i12]);
                sb2.append(')');
                if (i12 < this.adGroups[i11].states.length - 1) {
                    sb2.append(org.junit.jupiter.api.j2.O);
                }
            }
            sb2.append("])");
            if (i11 < this.adGroups.length - 1) {
                sb2.append(org.junit.jupiter.api.j2.O);
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    @CheckResult
    public AdPlaybackState withAdCount(@IntRange(from = 0) int i11, @IntRange(from = 1) int i12) {
        Assertions.checkArgument(i12 > 0);
        int i13 = i11 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i13].count == i12) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i13] = this.adGroups[i13].withAdCount(i12);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withAdDurationsUs(long[][] jArr) {
        int i11 = 0;
        Assertions.checkArgument(jArr.length == this.adGroupCount);
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        while (true) {
            int i12 = this.adGroupCount;
            int i13 = this.removedAdGroupCount;
            if (i11 >= i12 - i13) {
                return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, i13);
            }
            adGroupArr2[i11] = adGroupArr2[i11].withAdDurationsUs(jArr[i13 + i11]);
            i11++;
        }
    }

    @CheckResult
    public AdPlaybackState withAdGroupTimeUs(@IntRange(from = 0) int i11, long j11) {
        int i12 = i11 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i12] = this.adGroups[i12].withTimeUs(j11);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withAdId(@IntRange(from = 0) int i11, @IntRange(from = 0) int i12, String str) {
        int i13 = i11 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i13] = adGroupArr2[i13].withAdId(str, i12);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withAdLoadError(@IntRange(from = 0) int i11, @IntRange(from = 0) int i12) {
        int i13 = i11 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i13] = adGroupArr2[i13].withAdState(4, i12);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withAdResumePositionUs(long j11) {
        return this.adResumePositionUs == j11 ? this : new AdPlaybackState(this.adsId, this.adGroups, j11, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withAdsId(Object obj) {
        return new AdPlaybackState(obj, this.adGroups, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withAvailableAd(@IntRange(from = 0) int i11, @IntRange(from = 0) int i12) {
        return withAvailableAdMediaItem(i11, i12, MediaItem.fromUri(Uri.EMPTY));
    }

    @CheckResult
    public AdPlaybackState withAvailableAdMediaItem(@IntRange(from = 0) int i11, @IntRange(from = 0) int i12, MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration;
        int i13 = i11 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        Assertions.checkState(adGroupArr2[i13].isServerSideInserted || !((localConfiguration = mediaItem.localConfiguration) == null || localConfiguration.uri.equals(Uri.EMPTY)));
        adGroupArr2[i13] = adGroupArr2[i13].withAdMediaItem(mediaItem, i12);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    @Deprecated
    public AdPlaybackState withAvailableAdUri(@IntRange(from = 0) int i11, @IntRange(from = 0) int i12, Uri uri) {
        return withAvailableAdMediaItem(i11, i12, MediaItem.fromUri(uri));
    }

    @CheckResult
    public AdPlaybackState withContentDurationUs(long j11) {
        return this.contentDurationUs == j11 ? this : new AdPlaybackState(this.adsId, this.adGroups, this.adResumePositionUs, j11, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withContentResumeOffsetUs(@IntRange(from = 0) int i11, long j11) {
        int i12 = i11 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i12].contentResumeOffsetUs == j11) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i12] = adGroupArr2[i12].withContentResumeOffsetUs(j11);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @VisibleForTesting
    public AdPlaybackState withIsPlaceholder(int i11, boolean z11, boolean z12) {
        int i12 = i11 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup adGroup = adGroupArr[i12];
        if (adGroup.isPlaceholder == z11 && adGroup.isServerSideInserted == z12) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i12] = adGroupArr2[i12].withIsPlaceholder(z11, z12);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withIsServerSideInserted(@IntRange(from = 0) int i11, boolean z11) {
        int i12 = i11 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i12].isServerSideInserted == z11) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i12] = adGroupArr2[i12].withIsServerSideInserted(z11);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withLastAdRemoved(@IntRange(from = 0) int i11) {
        int i12 = i11 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i12] = adGroupArr2[i12].withLastAdRemoved();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @uo.l(replacement = "this.withLivePostrollPlaceholderAppended(true)")
    @Deprecated
    public AdPlaybackState withLivePostrollPlaceholderAppended() {
        return withLivePostrollPlaceholderAppended(true);
    }

    @CheckResult
    public AdPlaybackState withNewAdGroup(@IntRange(from = 0) int i11, long j11) {
        int i12 = i11 - this.removedAdGroupCount;
        AdGroup adGroup = new AdGroup(j11);
        AdGroup[] adGroupArr = (AdGroup[]) Util.nullSafeArrayAppend(this.adGroups, adGroup);
        System.arraycopy(adGroupArr, i12, adGroupArr, i12 + 1, this.adGroups.length - i12);
        adGroupArr[i12] = adGroup;
        return new AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withOriginalAdCount(@IntRange(from = 0) int i11, int i12) {
        int i13 = i11 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        if (adGroupArr[i13].originalCount == i12) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i13] = adGroupArr2[i13].withOriginalAdCount(i12);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withPlayedAd(@IntRange(from = 0) int i11, @IntRange(from = 0) int i12) {
        int i13 = i11 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i13] = adGroupArr2[i13].withAdState(3, i12);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withRemovedAdGroupCount(@IntRange(from = 0) int i11) {
        int i12 = this.removedAdGroupCount;
        if (i12 == i11) {
            return this;
        }
        Assertions.checkArgument(i11 > i12);
        int i13 = this.adGroupCount - i11;
        AdGroup[] adGroupArr = new AdGroup[i13];
        System.arraycopy(this.adGroups, i11 - this.removedAdGroupCount, adGroupArr, 0, i13);
        return new AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, i11);
    }

    @CheckResult
    public AdPlaybackState withResetAdGroup(@IntRange(from = 0) int i11) {
        int i12 = i11 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i12] = adGroupArr2[i12].withAllAdsReset();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withSkippedAd(@IntRange(from = 0) int i11, @IntRange(from = 0) int i12) {
        int i13 = i11 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i13] = adGroupArr2[i13].withAdState(2, i12);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withSkippedAdGroup(@IntRange(from = 0) int i11) {
        int i12 = i11 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i12] = adGroupArr2[i12].withAllAdsSkipped();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    public boolean isLivePostrollPlaceholder(int i11, boolean z11) {
        return i11 == this.adGroupCount - 1 && getAdGroup(i11).isLivePostrollPlaceholder(z11);
    }

    public AdPlaybackState withLivePostrollPlaceholderAppended(boolean z11) {
        return withNewAdGroup(this.adGroupCount, Long.MIN_VALUE).withIsPlaceholder(this.adGroupCount, true, z11);
    }

    private AdPlaybackState(@Nullable Object obj, AdGroup[] adGroupArr, long j11, long j12, int i11) {
        this.adsId = obj;
        this.adResumePositionUs = j11;
        this.contentDurationUs = j12;
        this.adGroupCount = adGroupArr.length + i11;
        this.adGroups = adGroupArr;
        this.removedAdGroupCount = i11;
    }

    public boolean endsWithLivePostrollPlaceHolder(boolean z11) {
        int i11 = this.adGroupCount - 1;
        return i11 >= 0 && isLivePostrollPlaceholder(i11, z11);
    }

    @CheckResult
    public AdPlaybackState withAdDurationsUs(@IntRange(from = 0) int i11, long... jArr) {
        int i12 = i11 - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.adGroups;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i12] = adGroupArr2[i12].withAdDurationsUs(jArr);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }
}
