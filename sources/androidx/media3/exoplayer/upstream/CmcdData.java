package androidx.media3.exoplayer.upstream;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.aa;
import com.huawei.hms.framework.common.ContainerUtils;
import ho.a0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class CmcdData {
    private static final a0 COMMA_JOINER = a0.p(",");
    public static final String OBJECT_TYPE_AUDIO_ONLY = "a";
    public static final String OBJECT_TYPE_INIT_SEGMENT = "i";
    public static final String OBJECT_TYPE_MANIFEST = "m";
    public static final String OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO = "av";
    public static final String OBJECT_TYPE_VIDEO_ONLY = "v";
    public static final String STREAMING_FORMAT_DASH = "d";
    public static final String STREAMING_FORMAT_HLS = "h";
    public static final String STREAMING_FORMAT_SS = "s";
    public static final String STREAM_TYPE_LIVE = "l";
    public static final String STREAM_TYPE_VOD = "v";
    private final CmcdObject cmcdObject;
    private final CmcdRequest cmcdRequest;
    private final CmcdSession cmcdSession;
    private final CmcdStatus cmcdStatus;
    private final int dataTransmissionMode;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CmcdObject {
        public final int bitrateKbps;
        public final ImmutableList<String> customDataList;
        public final long objectDurationMs;

        @Nullable
        public final String objectType;
        public final int topBitrateKbps;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Builder {

            @Nullable
            private String objectType;
            private int bitrateKbps = C.RATE_UNSET_INT;
            private int topBitrateKbps = C.RATE_UNSET_INT;
            private long objectDurationMs = C.TIME_UNSET;
            private ImmutableList<String> customDataList = ImmutableList.of();

            public CmcdObject build() {
                return new CmcdObject(this);
            }

            @uo.a
            public Builder setBitrateKbps(int i11) {
                Assertions.checkArgument(i11 >= 0 || i11 == -2147483647);
                this.bitrateKbps = i11;
                return this;
            }

            @uo.a
            public Builder setCustomDataList(List<String> list) {
                this.customDataList = ImmutableList.copyOf((Collection) list);
                return this;
            }

            @uo.a
            public Builder setObjectDurationMs(long j11) {
                Assertions.checkArgument(j11 >= 0 || j11 == C.TIME_UNSET);
                this.objectDurationMs = j11;
                return this;
            }

            @uo.a
            public Builder setObjectType(@Nullable String str) {
                this.objectType = str;
                return this;
            }

            @uo.a
            public Builder setTopBitrateKbps(int i11) {
                Assertions.checkArgument(i11 >= 0 || i11 == -2147483647);
                this.topBitrateKbps = i11;
                return this;
            }
        }

        public void populateCmcdDataMap(ArrayListMultimap<String, String> arrayListMultimap) {
            ArrayList arrayList = new ArrayList();
            if (this.bitrateKbps != -2147483647) {
                arrayList.add("br=" + this.bitrateKbps);
            }
            if (this.topBitrateKbps != -2147483647) {
                arrayList.add("tb=" + this.topBitrateKbps);
            }
            if (this.objectDurationMs != C.TIME_UNSET) {
                arrayList.add("d=" + this.objectDurationMs);
            }
            if (!TextUtils.isEmpty(this.objectType)) {
                arrayList.add("ot=" + this.objectType);
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            arrayListMultimap.putAll(CmcdConfiguration.KEY_CMCD_OBJECT, arrayList);
        }

        private CmcdObject(Builder builder) {
            this.bitrateKbps = builder.bitrateKbps;
            this.topBitrateKbps = builder.topBitrateKbps;
            this.objectDurationMs = builder.objectDurationMs;
            this.objectType = builder.objectType;
            this.customDataList = builder.customDataList;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CmcdRequest {
        public final long bufferLengthMs;
        public final ImmutableList<String> customDataList;
        public final long deadlineMs;
        public final long measuredThroughputInKbps;

        @Nullable
        public final String nextObjectRequest;

        @Nullable
        public final String nextRangeRequest;
        public final boolean startup;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Builder {

            @Nullable
            private String nextObjectRequest;

            @Nullable
            private String nextRangeRequest;
            private boolean startup;
            private long bufferLengthMs = C.TIME_UNSET;
            private long measuredThroughputInKbps = -2147483647L;
            private long deadlineMs = C.TIME_UNSET;
            private ImmutableList<String> customDataList = ImmutableList.of();

            public CmcdRequest build() {
                return new CmcdRequest(this);
            }

            @uo.a
            public Builder setBufferLengthMs(long j11) {
                if (j11 == C.TIME_UNSET) {
                    this.bufferLengthMs = j11;
                    return this;
                }
                if (j11 < 0) {
                    throw new IllegalArgumentException();
                }
                this.bufferLengthMs = ((j11 + 50) / 100) * 100;
                return this;
            }

            @uo.a
            public Builder setCustomDataList(List<String> list) {
                this.customDataList = ImmutableList.copyOf((Collection) list);
                return this;
            }

            @uo.a
            public Builder setDeadlineMs(long j11) {
                if (j11 == C.TIME_UNSET) {
                    this.deadlineMs = j11;
                    return this;
                }
                if (j11 < 0) {
                    throw new IllegalArgumentException();
                }
                this.deadlineMs = ((j11 + 50) / 100) * 100;
                return this;
            }

            @uo.a
            public Builder setMeasuredThroughputInKbps(long j11) {
                if (j11 == -2147483647L) {
                    this.measuredThroughputInKbps = j11;
                    return this;
                }
                if (j11 < 0) {
                    throw new IllegalArgumentException();
                }
                this.measuredThroughputInKbps = ((j11 + 50) / 100) * 100;
                return this;
            }

            @uo.a
            public Builder setNextObjectRequest(@Nullable String str) {
                this.nextObjectRequest = str == null ? null : Uri.encode(str);
                return this;
            }

            @uo.a
            public Builder setNextRangeRequest(@Nullable String str) {
                this.nextRangeRequest = str;
                return this;
            }

            @uo.a
            public Builder setStartup(boolean z11) {
                this.startup = z11;
                return this;
            }
        }

        public void populateCmcdDataMap(ArrayListMultimap<String, String> arrayListMultimap) {
            ArrayList arrayList = new ArrayList();
            if (this.bufferLengthMs != C.TIME_UNSET) {
                arrayList.add("bl=" + this.bufferLengthMs);
            }
            if (this.measuredThroughputInKbps != -2147483647L) {
                arrayList.add("mtp=" + this.measuredThroughputInKbps);
            }
            if (this.deadlineMs != C.TIME_UNSET) {
                arrayList.add("dl=" + this.deadlineMs);
            }
            if (this.startup) {
                arrayList.add(CmcdConfiguration.KEY_STARTUP);
            }
            if (!TextUtils.isEmpty(this.nextObjectRequest)) {
                arrayList.add(Util.formatInvariant("%s=\"%s\"", CmcdConfiguration.KEY_NEXT_OBJECT_REQUEST, this.nextObjectRequest));
            }
            if (!TextUtils.isEmpty(this.nextRangeRequest)) {
                arrayList.add(Util.formatInvariant("%s=\"%s\"", CmcdConfiguration.KEY_NEXT_RANGE_REQUEST, this.nextRangeRequest));
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            arrayListMultimap.putAll(CmcdConfiguration.KEY_CMCD_REQUEST, arrayList);
        }

        private CmcdRequest(Builder builder) {
            this.bufferLengthMs = builder.bufferLengthMs;
            this.measuredThroughputInKbps = builder.measuredThroughputInKbps;
            this.deadlineMs = builder.deadlineMs;
            this.startup = builder.startup;
            this.nextObjectRequest = builder.nextObjectRequest;
            this.nextRangeRequest = builder.nextRangeRequest;
            this.customDataList = builder.customDataList;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CmcdSession {
        public static final int VERSION = 1;

        @Nullable
        public final String contentId;
        public final ImmutableList<String> customDataList;
        public final float playbackRate;

        @Nullable
        public final String sessionId;

        @Nullable
        public final String streamType;

        @Nullable
        public final String streamingFormat;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Builder {

            @Nullable
            private String contentId;
            private ImmutableList<String> customDataList = ImmutableList.of();
            private float playbackRate;

            @Nullable
            private String sessionId;

            @Nullable
            private String streamType;

            @Nullable
            private String streamingFormat;

            public CmcdSession build() {
                return new CmcdSession(this);
            }

            @uo.a
            public Builder setContentId(@Nullable String str) {
                Assertions.checkArgument(str == null || str.length() <= 64);
                this.contentId = str;
                return this;
            }

            @uo.a
            public Builder setCustomDataList(List<String> list) {
                this.customDataList = ImmutableList.copyOf((Collection) list);
                return this;
            }

            @uo.a
            public Builder setPlaybackRate(float f11) {
                Assertions.checkArgument(f11 > 0.0f || f11 == -3.4028235E38f);
                this.playbackRate = f11;
                return this;
            }

            @uo.a
            public Builder setSessionId(@Nullable String str) {
                Assertions.checkArgument(str == null || str.length() <= 64);
                this.sessionId = str;
                return this;
            }

            @uo.a
            public Builder setStreamType(@Nullable String str) {
                this.streamType = str;
                return this;
            }

            @uo.a
            public Builder setStreamingFormat(@Nullable String str) {
                this.streamingFormat = str;
                return this;
            }
        }

        public void populateCmcdDataMap(ArrayListMultimap<String, String> arrayListMultimap) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.contentId)) {
                arrayList.add(Util.formatInvariant("%s=\"%s\"", "cid", this.contentId));
            }
            if (!TextUtils.isEmpty(this.sessionId)) {
                arrayList.add(Util.formatInvariant("%s=\"%s\"", CmcdConfiguration.KEY_SESSION_ID, this.sessionId));
            }
            if (!TextUtils.isEmpty(this.streamingFormat)) {
                arrayList.add("sf=" + this.streamingFormat);
            }
            if (!TextUtils.isEmpty(this.streamType)) {
                arrayList.add("st=" + this.streamType);
            }
            float f11 = this.playbackRate;
            if (f11 != -3.4028235E38f && f11 != 1.0f) {
                arrayList.add(Util.formatInvariant("%s=%.2f", CmcdConfiguration.KEY_PLAYBACK_RATE, Float.valueOf(f11)));
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            arrayListMultimap.putAll(CmcdConfiguration.KEY_CMCD_SESSION, arrayList);
        }

        private CmcdSession(Builder builder) {
            this.contentId = builder.contentId;
            this.sessionId = builder.sessionId;
            this.streamingFormat = builder.streamingFormat;
            this.streamType = builder.streamType;
            this.playbackRate = builder.playbackRate;
            this.customDataList = builder.customDataList;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CmcdStatus {
        public final boolean bufferStarvation;
        public final ImmutableList<String> customDataList;
        public final int maximumRequestedThroughputKbps;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Builder {
            private boolean bufferStarvation;
            private int maximumRequestedThroughputKbps = C.RATE_UNSET_INT;
            private ImmutableList<String> customDataList = ImmutableList.of();

            public CmcdStatus build() {
                return new CmcdStatus(this);
            }

            @uo.a
            public Builder setBufferStarvation(boolean z11) {
                this.bufferStarvation = z11;
                return this;
            }

            @uo.a
            public Builder setCustomDataList(List<String> list) {
                this.customDataList = ImmutableList.copyOf((Collection) list);
                return this;
            }

            @uo.a
            public Builder setMaximumRequestedThroughputKbps(int i11) {
                Assertions.checkArgument(i11 >= 0 || i11 == -2147483647);
                if (i11 != -2147483647) {
                    i11 = ((i11 + 50) / 100) * 100;
                }
                this.maximumRequestedThroughputKbps = i11;
                return this;
            }
        }

        public void populateCmcdDataMap(ArrayListMultimap<String, String> arrayListMultimap) {
            ArrayList arrayList = new ArrayList();
            if (this.maximumRequestedThroughputKbps != -2147483647) {
                arrayList.add("rtp=" + this.maximumRequestedThroughputKbps);
            }
            if (this.bufferStarvation) {
                arrayList.add("bs");
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            arrayListMultimap.putAll(CmcdConfiguration.KEY_CMCD_STATUS, arrayList);
        }

        private CmcdStatus(Builder builder) {
            this.maximumRequestedThroughputKbps = builder.maximumRequestedThroughputKbps;
            this.bufferStarvation = builder.bufferStarvation;
            this.customDataList = builder.customDataList;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Factory {
        private static final Pattern CUSTOM_KEY_NAME_PATTERN = Pattern.compile(".*-.*");
        private final CmcdConfiguration cmcdConfiguration;
        private boolean didRebuffer;
        private boolean isBufferEmpty;

        @Nullable
        private Boolean isLive;

        @Nullable
        private String nextObjectRequest;

        @Nullable
        private String nextRangeRequest;

        @Nullable
        private String objectType;
        private final String streamingFormat;

        @Nullable
        private ExoTrackSelection trackSelection;
        private long bufferedDurationUs = C.TIME_UNSET;
        private float playbackRate = -3.4028235E38f;
        private long chunkDurationUs = C.TIME_UNSET;

        public Factory(CmcdConfiguration cmcdConfiguration, String str) {
            this.cmcdConfiguration = cmcdConfiguration;
            this.streamingFormat = str;
        }

        @Nullable
        private static String getObjectTypeFromFormat(Format format) {
            String audioMediaMimeType = MimeTypes.getAudioMediaMimeType(format.codecs);
            String videoMediaMimeType = MimeTypes.getVideoMediaMimeType(format.codecs);
            if (audioMediaMimeType != null && videoMediaMimeType != null) {
                return "av";
            }
            int trackType = MimeTypes.getTrackType(format.sampleMimeType);
            if (trackType == -1) {
                trackType = MimeTypes.getTrackType(format.containerMimeType);
            }
            if (trackType == 1) {
                return "a";
            }
            if (trackType == 2) {
                return "v";
            }
            return null;
        }

        private static boolean isManifestObjectType(@Nullable String str) {
            return Objects.equals(str, "m");
        }

        private static boolean isMediaObjectType(@Nullable String str) {
            return Objects.equals(str, "a") || Objects.equals(str, "v") || Objects.equals(str, "av");
        }

        private void validateCustomDataListFormat(List<String> list) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                Assertions.checkState(CUSTOM_KEY_NAME_PATTERN.matcher(Util.split(it.next(), ContainerUtils.KEY_VALUE_DELIMITER)[0]).matches());
            }
        }

        public CmcdData createCmcdData() {
            int i11;
            int i12;
            int i13;
            boolean isManifestObjectType = isManifestObjectType(this.objectType);
            if (!isManifestObjectType) {
                Assertions.checkStateNotNull(this.trackSelection, "Track selection must be set");
            }
            if (this.objectType == null) {
                this.objectType = getObjectTypeFromFormat(((ExoTrackSelection) Assertions.checkNotNull(this.trackSelection)).getSelectedFormat());
            }
            boolean isMediaObjectType = isMediaObjectType(this.objectType);
            if (isMediaObjectType) {
                Assertions.checkState(this.bufferedDurationUs != C.TIME_UNSET, "Buffered duration must be set");
                Assertions.checkState(this.chunkDurationUs != C.TIME_UNSET, "Chunk duration must be set");
            }
            ImmutableListMultimap<String, String> customData = this.cmcdConfiguration.requestConfig.getCustomData();
            aa<String> it = customData.keySet().iterator();
            while (it.hasNext()) {
                validateCustomDataListFormat(customData.get((ImmutableListMultimap<String, String>) it.next()));
            }
            if (isManifestObjectType) {
                i11 = C.RATE_UNSET_INT;
                i12 = -2147483647;
                i13 = -2147483647;
            } else {
                ExoTrackSelection exoTrackSelection = (ExoTrackSelection) Assertions.checkNotNull(this.trackSelection);
                int i14 = exoTrackSelection.getSelectedFormat().bitrate;
                i11 = Util.ceilDivide(i14, 1000);
                TrackGroup trackGroup = exoTrackSelection.getTrackGroup();
                for (int i15 = 0; i15 < trackGroup.length; i15++) {
                    i14 = Math.max(i14, trackGroup.getFormat(i15).bitrate);
                }
                i13 = Util.ceilDivide(i14, 1000);
                r6 = exoTrackSelection.getLatestBitrateEstimate() != -2147483647L ? Util.ceilDivide(exoTrackSelection.getLatestBitrateEstimate(), 1000L) : -2147483647L;
                i12 = this.cmcdConfiguration.requestConfig.getRequestedMaximumThroughputKbps(i11);
            }
            CmcdObject.Builder builder = new CmcdObject.Builder();
            if (this.cmcdConfiguration.isBitrateLoggingAllowed()) {
                builder.setBitrateKbps(i11);
            }
            if (this.cmcdConfiguration.isTopBitrateLoggingAllowed()) {
                builder.setTopBitrateKbps(i13);
            }
            if (isMediaObjectType && this.cmcdConfiguration.isObjectDurationLoggingAllowed()) {
                builder.setObjectDurationMs(Util.usToMs(this.chunkDurationUs));
            }
            if (this.cmcdConfiguration.isObjectTypeLoggingAllowed()) {
                builder.setObjectType(this.objectType);
            }
            if (customData.containsKey(CmcdConfiguration.KEY_CMCD_OBJECT)) {
                builder.setCustomDataList(customData.get((ImmutableListMultimap<String, String>) CmcdConfiguration.KEY_CMCD_OBJECT));
            }
            CmcdRequest.Builder builder2 = new CmcdRequest.Builder();
            if (isMediaObjectType) {
                if (this.cmcdConfiguration.isBufferLengthLoggingAllowed()) {
                    builder2.setBufferLengthMs(Util.usToMs(this.bufferedDurationUs));
                }
                if (this.cmcdConfiguration.isDeadlineLoggingAllowed()) {
                    builder2.setDeadlineMs(Util.usToMs((long) (this.bufferedDurationUs / this.playbackRate)));
                }
            }
            if (this.cmcdConfiguration.isMeasuredThroughputLoggingAllowed()) {
                builder2.setMeasuredThroughputInKbps(r6);
            }
            if (this.cmcdConfiguration.isStartupLoggingAllowed()) {
                builder2.setStartup(this.didRebuffer || this.isBufferEmpty);
            }
            if (this.cmcdConfiguration.isNextObjectRequestLoggingAllowed()) {
                builder2.setNextObjectRequest(this.nextObjectRequest);
            }
            if (this.cmcdConfiguration.isNextRangeRequestLoggingAllowed()) {
                builder2.setNextRangeRequest(this.nextRangeRequest);
            }
            if (customData.containsKey(CmcdConfiguration.KEY_CMCD_REQUEST)) {
                builder2.setCustomDataList(customData.get((ImmutableListMultimap<String, String>) CmcdConfiguration.KEY_CMCD_REQUEST));
            }
            CmcdSession.Builder builder3 = new CmcdSession.Builder();
            if (this.cmcdConfiguration.isContentIdLoggingAllowed()) {
                builder3.setContentId(this.cmcdConfiguration.contentId);
            }
            if (this.cmcdConfiguration.isSessionIdLoggingAllowed()) {
                builder3.setSessionId(this.cmcdConfiguration.sessionId);
            }
            if (this.cmcdConfiguration.isStreamingFormatLoggingAllowed()) {
                builder3.setStreamingFormat(this.streamingFormat);
            }
            if (this.isLive != null && this.cmcdConfiguration.isStreamTypeLoggingAllowed()) {
                builder3.setStreamType(((Boolean) Assertions.checkNotNull(this.isLive)).booleanValue() ? "l" : "v");
            }
            if (this.cmcdConfiguration.isPlaybackRateLoggingAllowed()) {
                builder3.setPlaybackRate(this.playbackRate);
            }
            if (customData.containsKey(CmcdConfiguration.KEY_CMCD_SESSION)) {
                builder3.setCustomDataList(customData.get((ImmutableListMultimap<String, String>) CmcdConfiguration.KEY_CMCD_SESSION));
            }
            CmcdStatus.Builder builder4 = new CmcdStatus.Builder();
            if (this.cmcdConfiguration.isMaximumRequestThroughputLoggingAllowed()) {
                builder4.setMaximumRequestedThroughputKbps(i12);
            }
            if (this.cmcdConfiguration.isBufferStarvationLoggingAllowed()) {
                builder4.setBufferStarvation(this.didRebuffer);
            }
            if (customData.containsKey(CmcdConfiguration.KEY_CMCD_STATUS)) {
                builder4.setCustomDataList(customData.get((ImmutableListMultimap<String, String>) CmcdConfiguration.KEY_CMCD_STATUS));
            }
            return new CmcdData(builder.build(), builder2.build(), builder3.build(), builder4.build(), this.cmcdConfiguration.dataTransmissionMode);
        }

        @uo.a
        public Factory setBufferedDurationUs(long j11) {
            Assertions.checkArgument(j11 >= 0);
            this.bufferedDurationUs = j11;
            return this;
        }

        @uo.a
        public Factory setChunkDurationUs(long j11) {
            Assertions.checkArgument(j11 >= 0);
            this.chunkDurationUs = j11;
            return this;
        }

        @uo.a
        public Factory setDidRebuffer(boolean z11) {
            this.didRebuffer = z11;
            return this;
        }

        @uo.a
        public Factory setIsBufferEmpty(boolean z11) {
            this.isBufferEmpty = z11;
            return this;
        }

        @uo.a
        public Factory setIsLive(boolean z11) {
            this.isLive = Boolean.valueOf(z11);
            return this;
        }

        @uo.a
        public Factory setNextObjectRequest(@Nullable String str) {
            this.nextObjectRequest = str;
            return this;
        }

        @uo.a
        public Factory setNextRangeRequest(@Nullable String str) {
            this.nextRangeRequest = str;
            return this;
        }

        @uo.a
        public Factory setObjectType(@Nullable String str) {
            this.objectType = str;
            return this;
        }

        @uo.a
        public Factory setPlaybackRate(float f11) {
            Assertions.checkArgument(f11 == -3.4028235E38f || f11 > 0.0f);
            this.playbackRate = f11;
            return this;
        }

        @uo.a
        public Factory setTrackSelection(ExoTrackSelection exoTrackSelection) {
            this.trackSelection = exoTrackSelection;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ObjectType {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamingFormat {
    }

    public DataSpec addToDataSpec(DataSpec dataSpec) {
        ArrayListMultimap<String, String> create = ArrayListMultimap.create();
        this.cmcdObject.populateCmcdDataMap(create);
        this.cmcdRequest.populateCmcdDataMap(create);
        this.cmcdSession.populateCmcdDataMap(create);
        this.cmcdStatus.populateCmcdDataMap(create);
        if (this.dataTransmissionMode != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = create.asMap().values().iterator();
            while (it.hasNext()) {
                arrayList.addAll((Collection) it.next());
            }
            Collections.sort(arrayList);
            return dataSpec.buildUpon().setUri(dataSpec.uri.buildUpon().appendQueryParameter(CmcdConfiguration.CMCD_QUERY_PARAMETER_KEY, COMMA_JOINER.k(arrayList)).build()).build();
        }
        ImmutableMap.b builder = ImmutableMap.builder();
        for (String str : create.keySet()) {
            List list = create.get((Object) str);
            Collections.sort(list);
            builder.i(str, COMMA_JOINER.k(list));
        }
        return dataSpec.withAdditionalHeaders(builder.d());
    }

    private CmcdData(CmcdObject cmcdObject, CmcdRequest cmcdRequest, CmcdSession cmcdSession, CmcdStatus cmcdStatus, int i11) {
        this.cmcdObject = cmcdObject;
        this.cmcdRequest = cmcdRequest;
        this.cmcdSession = cmcdSession;
        this.cmcdStatus = cmcdStatus;
        this.dataTransmissionMode = i11;
    }
}
