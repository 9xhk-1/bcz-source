package q9;

import android.net.Uri;
import com.baicizhan.client.business.util.ZPackUtils;
import com.baicizhan.client.business.util.ZpkConfig;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class g {
    public static final void a(@m80.k IAudioPlayer iAudioPlayer, @m80.k Uri uri) {
        g0.p(iAudioPlayer, "<this>");
        g0.p(uri, "uri");
        if (g0.g(uri.getScheme(), ZpkConfig.SCHEME_ZPK)) {
            ZPackUtils.playZpkAudio(iAudioPlayer, uri.getPath(), uri.getQuery());
        } else {
            iAudioPlayer.c(uri.toString());
        }
    }
}
