package jd;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.tencent.rtmp.TXPlayerAuthBuilder;
import com.tencent.rtmp.TXVodPlayer;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class g extends TXVodPlayer {

    /* renamed from: a, reason: collision with root package name */
    public static final int f64044a = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(@m80.k Context context) {
        super(context);
        g0.p(context, "context");
    }

    @Override // com.tencent.rtmp.TXVodPlayer
    public int startPlay(@m80.l String str) {
        try {
            return super.startPlay(str);
        } catch (Throwable th2) {
            qb.c.c("FixBugPlayer", "", th2);
            return -1;
        }
    }

    @Override // com.tencent.rtmp.TXVodPlayer
    public int stopPlay(boolean z11) {
        try {
            return super.stopPlay(z11);
        } catch (Throwable th2) {
            qb.c.c("FixBugPlayer", "", th2);
            return 0;
        }
    }

    @Override // com.tencent.rtmp.TXVodPlayer
    public int startPlay(@m80.l TXPlayerAuthBuilder tXPlayerAuthBuilder) {
        try {
            return super.startPlay(tXPlayerAuthBuilder);
        } catch (Throwable th2) {
            qb.c.c("FixBugPlayer", "", th2);
            return -1;
        }
    }
}
