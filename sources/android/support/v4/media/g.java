package android.support.v4.media;

import android.media.browse.MediaBrowser;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static Constructor f2879a;

    static {
        try {
            f2879a = Class.forName("android.content.pm.ParceledListSlice").getConstructor(List.class);
        } catch (ClassNotFoundException | NoSuchMethodException e11) {
            e11.printStackTrace();
        }
    }

    public static Object a(List<MediaBrowser.MediaItem> list) {
        try {
            return f2879a.newInstance(list);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e11) {
            e11.printStackTrace();
            return null;
        }
    }
}
