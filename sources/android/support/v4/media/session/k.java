package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes.dex */
public class k {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public static String a(Object obj) {
            return ((PlaybackState.CustomAction) obj).getAction();
        }

        public static Bundle b(Object obj) {
            return ((PlaybackState.CustomAction) obj).getExtras();
        }

        public static int c(Object obj) {
            return ((PlaybackState.CustomAction) obj).getIcon();
        }

        public static CharSequence d(Object obj) {
            return ((PlaybackState.CustomAction) obj).getName();
        }

        public static Object e(String str, CharSequence charSequence, int i11, Bundle bundle) {
            PlaybackState.CustomAction.Builder builder = new PlaybackState.CustomAction.Builder(str, charSequence, i11);
            builder.setExtras(bundle);
            return builder.build();
        }
    }

    public static long a(Object obj) {
        return ((PlaybackState) obj).getActions();
    }

    public static long b(Object obj) {
        return ((PlaybackState) obj).getActiveQueueItemId();
    }

    public static long c(Object obj) {
        return ((PlaybackState) obj).getBufferedPosition();
    }

    public static List<Object> d(Object obj) {
        return ((PlaybackState) obj).getCustomActions();
    }

    public static CharSequence e(Object obj) {
        return ((PlaybackState) obj).getErrorMessage();
    }

    public static long f(Object obj) {
        return ((PlaybackState) obj).getLastPositionUpdateTime();
    }

    public static float g(Object obj) {
        return ((PlaybackState) obj).getPlaybackSpeed();
    }

    public static long h(Object obj) {
        return ((PlaybackState) obj).getPosition();
    }

    public static int i(Object obj) {
        return ((PlaybackState) obj).getState();
    }

    public static Object j(int i11, long j11, long j12, float f11, long j13, CharSequence charSequence, long j14, List<Object> list, long j15) {
        PlaybackState.Builder builder = new PlaybackState.Builder();
        builder.setState(i11, j11, f11, j14);
        builder.setBufferedPosition(j12);
        builder.setActions(j13);
        builder.setErrorMessage(charSequence);
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            builder.addCustomAction((PlaybackState.CustomAction) it.next());
        }
        builder.setActiveQueueItemId(j15);
        return builder.build();
    }
}
