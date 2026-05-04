package androidx.media3.exoplayer.analytics;

import androidx.annotation.Nullable;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.MediaSource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface PlaybackSessionManager {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Listener {
        void onAdPlaybackStarted(AnalyticsListener.EventTime eventTime, String str, String str2);

        void onSessionActive(AnalyticsListener.EventTime eventTime, String str);

        void onSessionCreated(AnalyticsListener.EventTime eventTime, String str);

        void onSessionFinished(AnalyticsListener.EventTime eventTime, String str, boolean z11);
    }

    boolean belongsToSession(AnalyticsListener.EventTime eventTime, String str);

    void finishAllSessions(AnalyticsListener.EventTime eventTime);

    @Nullable
    String getActiveSessionId();

    String getSessionForMediaPeriodId(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId);

    void setListener(Listener listener);

    void updateSessions(AnalyticsListener.EventTime eventTime);

    void updateSessionsWithDiscontinuity(AnalyticsListener.EventTime eventTime, int i11);

    void updateSessionsWithTimelineChange(AnalyticsListener.EventTime eventTime);
}
