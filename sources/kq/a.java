package kq;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.View;
import com.handmark.pulltorefresh.library.PullToRefreshBase;
import java.util.HashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a<V extends View> implements PullToRefreshBase.g<V> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f68587a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<PullToRefreshBase.State, Integer> f68588b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public MediaPlayer f68589c;

    public a(Context context) {
        this.f68587a = context;
    }

    @Override // com.handmark.pulltorefresh.library.PullToRefreshBase.g
    public final void a(PullToRefreshBase<V> refreshView, PullToRefreshBase.State event, PullToRefreshBase.Mode direction) {
        Integer num = this.f68588b.get(event);
        if (num != null) {
            e(num.intValue());
        }
    }

    public void b(PullToRefreshBase.State event, int resId) {
        this.f68588b.put(event, Integer.valueOf(resId));
    }

    public void c() {
        this.f68588b.clear();
    }

    public MediaPlayer d() {
        return this.f68589c;
    }

    public final void e(int resId) {
        MediaPlayer mediaPlayer = this.f68589c;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f68589c.release();
        }
        MediaPlayer create = MediaPlayer.create(this.f68587a, resId);
        this.f68589c = create;
        if (create != null) {
            create.start();
        }
    }
}
