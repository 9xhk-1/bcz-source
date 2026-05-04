package androidx.media3.extractor.text;

import androidx.media3.common.text.Cue;
import androidx.media3.common.util.UnstableApi;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface Subtitle {
    List<Cue> getCues(long j11);

    long getEventTime(int i11);

    int getEventTimeCount();

    int getNextEventTimeIndex(long j11);
}
